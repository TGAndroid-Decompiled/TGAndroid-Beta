package q7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class i0 extends a implements Serializable {
    public final MessageDigest f53996e;
    public final int f53997f;
    public final boolean h;
    public final String f53998n;

    public i0() {
        boolean z9;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f53996e = messageDigest;
            this.f53997f = messageDigest.getDigestLength();
            this.f53998n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z9 = true;
            } catch (CloneNotSupportedException unused) {
                z9 = false;
            }
            this.h = z9;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.f53998n;
    }
}
