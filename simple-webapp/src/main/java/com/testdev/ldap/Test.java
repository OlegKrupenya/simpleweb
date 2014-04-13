package com.testdev.ldap;


import java.util.Properties;

import javax.naming.Context;
import javax.naming.NameAlreadyBoundException;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;

public class Test {
	final static String ldapServerName = "localhost";
    final static String rootdn = "cn=Manager,dc=example,dc=com";
    final static String rootpass = "secret";
    final static String rootContext = "o=jndiTest";
    
    public static void main( String[] args ) {
            // set up environment to access the server
            
            Properties env = new Properties();
            
            env.put( Context.INITIAL_CONTEXT_FACTORY,
                     "com.sun.jndi.ldap.LdapCtxFactory" );
            env.put( Context.PROVIDER_URL, "ldap://" + ldapServerName + "/" );
            env.put( Context.SECURITY_PRINCIPAL, rootdn );
            env.put( Context.SECURITY_CREDENTIALS, rootpass );
            
            try {
                    // obtain initial directory context using the environment
                    DirContext ctx = new InitialDirContext( env );
                    
                    // now, create the root context, which is just a subcontext
                    // of this initial directory context.
                   // ctx.createSubcontext( rootContext );
                    
                    ////ctx.unbind("cn=Rajesh Koothrappali,dc=example,dc=com");
                    
                    /*// entry's DN
                    String entryDN = "cn=Rajesh Koothrappali,dc=example,dc=com";

                    // entry's attributes

                    Attribute cn = new BasicAttribute("cn", "Rasjesh Koothrappali");
                    Attribute sn = new BasicAttribute("sn", "Koothrappali");
                    Attribute oc = new BasicAttribute("objectClass");
                    oc.add("person");
                    Attributes entry = new BasicAttributes();
                    entry.put(cn);
                    entry.put(sn);
                    entry.put(oc);

                    // Add the entry
                    ctx.createSubcontext(entryDN, entry);
                    System.out.println( "AddUser: added entry " + entryDN + ".");
                    */
                    
//                    ModificationItem[] mods = new ModificationItem[1];
//                    Attribute mod0 = new BasicAttribute("sn", "Koothrappaliiiii");
//                    mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, mod0);
//                    ctx.modifyAttributes("cn=Rajesh Koothrappali,dc=example,dc=com", mods);
                   NamingEnumeration<?> namingEnum = ctx.search("dc=example,dc=com", "(&(objectclass=person) (sn=Koothrappaliiiii))", getSimpleSearchControls());
                   while(namingEnum.hasMoreElements()) {
                       System.out.println(namingEnum.next());
                   }
                   
                   
            } catch ( NameAlreadyBoundException nabe ) {
                    System.err.println( rootContext + " has already been bound!" );
            } catch ( Exception e ) {
                    System.err.println( e );
            }
    }
    
    private static SearchControls getSimpleSearchControls() {
        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.ONELEVEL_SCOPE);
        searchControls.setTimeLimit(30000);
        //String[] attrIDs = {"objectGUID"};
        //searchControls.setReturningAttributes(attrIDs);
        return searchControls;
    }
}
