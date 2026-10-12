package sa;

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
    public static final String[] f45082c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences f45083a;
    public final String f45084b;

    public b(l9.h r4) {
        throw new UnsupportedOperationException("Method not decompiled: sa.b.<init>(l9.h):void");
    }

    public final String a() {
        String string;
        synchronized (this.f45083a) {
            string = this.f45083a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f45083a) {
            String str = null;
            String string = this.f45083a.getString("|S||P|", null);
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
