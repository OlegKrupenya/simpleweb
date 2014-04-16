package com.testdev.dao;

import java.util.List;
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

import com.testdev.domain.User;

public class UserDaoImpl implements IUserDao {

    @Override
    public User getUserByEmail(String userEmail) {
        // TODO Auto-generated method stub
        
        // NamingEnumeration<?> namingEnum = ctx.search("dc=example,dc=com", "(&(objectclass=person) (sn=Koothrappaliiiii))", getSimpleSearchControls());
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        /*
         * // set up environment to access the server
            
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
                    
                   NamingEnumeration<?> namingEnum = ctx.search("dc=example,dc=com", "(objectclass=person)", getSimpleSearchControls());
                   while(namingEnum.hasMoreElements()) {
                       System.out.println(namingEnum.next());
                   }
                   
                   
            } catch ( NameAlreadyBoundException nabe ) {
                    System.err.println( rootContext + " has already been bound!" );
            } catch ( Exception e ) {
                    System.err.println( e );
            }
         */
        return null;
    }

    @Override
    public User addUser(User user) {
        // TODO Auto-generated method stub
        
        /*
         *  // entry's DN
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
         */
        return null;
    }

    @Override
    public User updateUser(User user) {
        // TODO Auto-generated method stub
        
        /*
         * ModificationItem[] mods = new ModificationItem[1];
                    Attribute mod0 = new BasicAttribute("sn", "Koothrappaliiiii");
                    mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, mod0);
                    ctx.modifyAttributes("cn=Rajesh Koothrappali,dc=example,dc=com", mods);
         */
        return null;
    }

    @Override
    public User deleteUser(User user) {
        // TODO Auto-generated method stub
        //ctx.unbind("cn=Rajesh Koothrappali,dc=example,dc=com");
        return null;
    }
    
}
