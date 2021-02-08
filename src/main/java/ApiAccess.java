import kong.unirest.*;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiAccess {

    public static void main(String[] args) {
        String accessToken = "AQA0snYapp1O4Y53yOEcZj__sGKPCqrxsr16txHqRt3um_fOlNO0dgOfQi6j2f8S-xlWKSqOU55koJumdS6rfx4gS" +
                "_YjZa2IBKTgC5ZL7fO0L5VsW7cxwVMvVAnMh4DMvTo";

        String authentificationToken = "BQBOT41ANDwKJTjieXCNMwmIQQfeWgcCr-GAIPZt41NcjxYjny_9WXATBrQqysSVlL53eUHLiPALEL" +
                "y26awC6hiRwfpWtKUQgKbm9T-N2uKDP5hwfwDKBLUbJ-yPpT0eoWrew6kPMt6yIFS3bueO65uNU-bk63E05KP6y7mUMzP7xlk_pVMW" +
                "mcwjiLzx7e2c82DUQTRO8NDqUdSTQ9_IozpmEIfmS6iuTVh2mz_zrvIi22AOZaonUJcGtK8RBV3t";

        String refreshToken = "AQA0snYapp1O4Y53yOEcZj__sGKPCqrxsr16txHqRt3um_fOlNO0dgOfQi6j2f8S-xlWKSqOU55koJumdS6rfx4g" +
                "S_YjZa2IBKTgC5ZL7fO0L5VsW7cxwVMvVAnMh4DMvTo";

        String user_id = "czwtt5zxbhn2mz1hjnn21z87l";

        String url = "https://api.spotify.com/v1/users/" + user_id + "/playlists";

        Map<String, String> headerList = new HashMap<String, String>();
        headerList.put("Accept", "application/json");
        headerList.put("Content-Type", "application/json");
        headerList.put("Authorization", "Bearer " + authentificationToken);

        HttpResponse<JsonNode> response = Unirest.post(url)
                .headers(headerList)
                .field("name", "Test5000")
                .field("description", "This is just a test")
                .field("public", "false")
                .asJson();

        UnirestParsingException ex = response.getParsingError();

        /*System.out.println(ex.getOriginalBody());
        System.out.println(ex.getMessage());
        System.out.println(ex.getCause());*/






    }
}
