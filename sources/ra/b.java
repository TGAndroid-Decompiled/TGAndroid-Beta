package ra;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
public final class b {
    public static final String[] f41397c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences f41398a;
    public final String f41399b;

    public b(k9.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: ra.b.<init>(k9.h):void");
    }

    public final String a() {
        String string;
        synchronized (this.f41398a) {
            string = this.f41398a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f41398a) {
            String str = null;
            String string = this.f41398a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
