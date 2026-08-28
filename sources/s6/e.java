package s6;

import android.util.Base64;
import java.security.SecureRandom;
public abstract class e {
    public static final SecureRandom f47456a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f47456a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
