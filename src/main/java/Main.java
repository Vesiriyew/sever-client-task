import service.HttpServiceImpl;

import static common.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) {
        HttpServiceImpl service = new HttpServiceImpl();

        service.start(PORT);
    }
}
