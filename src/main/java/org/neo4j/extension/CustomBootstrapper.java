package org.neo4j.extension;

import org.neo4j.server.NeoServer;
import org.neo4j.server.enterprise.EnterpriseBootstrapper;

/**
 * @author Stefan Armbruster
 */
public class CustomBootstrapper extends EnterpriseBootstrapper {

    @Override
    protected NeoServer createNeoServer() {
        System.out.println("loading custombootstrapper....");
        return super.createNeoServer();
    }
}
