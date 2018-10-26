package ratpack.example;

import ratpack.example.api.ApiHandlers;
import ratpack.example.api.ApiModule;
import ratpack.example.data.DataModule;
import ratpack.example.service.ServiceModule;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;
import ratpack.server.ServerConfig;

/**
 * Starts the example.
 */
public class Main {

    public static void main(String... args) throws Exception {
        ServerConfig serverConfig = ServerConfig.builder()
                .yaml("config.yml")
                .env("ENV_")
                .baseDir(BaseDir.find())
                .build();

        RatpackServer.start(s -> s
                .serverConfig(serverConfig)
                .registry(Guice.registry(b -> b
                        .module(ApiModule.class)
                        .module(ServiceModule.class)
                        .module(DataModule.class))
                )
                .handlers(chain -> chain
                        .insert(ApiHandlers.class)
                )
        );
    }
}
