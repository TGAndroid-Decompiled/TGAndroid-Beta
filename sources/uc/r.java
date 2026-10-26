package uc;

import java.security.SecureRandom;
import java.util.List;
public abstract class r {
    public static final int f49673a = 0;

    static {
        try {
            Class<?>[] clsArr = {String.class};
            SecureRandom secureRandom = k.f49662a;
            try {
                Class.forName("javax.net.ssl.SNIHostName").getConstructor(clsArr);
            } catch (Exception unused) {
            }
            try {
                Class.forName("javax.net.ssl.SSLParameters").getMethod("setServerNames", List.class);
            } catch (Exception unused2) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
