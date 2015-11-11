package org.neo4j.extension;

import org.neo4j.server.NeoServer;
import org.neo4j.server.enterprise.EnterpriseBootstrapper;
import org.neo4j.server.enterprise.EnterpriseNeoServer;

/**
 * @author Stefan Armbruster
 */
public class CustomBootstrapper extends EnterpriseBootstrapper {

    @Override
    protected NeoServer createNeoServer() {
        System.out.println("loading custombootstrapper....");

        return new EnterpriseNeoServer(configurator, dependencies) {
            @Override
            public void start() {

                // server's start: is called from bootstrapper's start
                super.start();

            }
        };
        //return super.createNeoServer();
    }

    @Override
    public Integer start() {

        // bootstraper's start is called first
        return super.start();
    }
}
