package z6;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class i0 extends a implements Serializable {
    public final MessageDigest f50719e;
    public final int f50720f;
    public final boolean h;
    public final String f50721n;

    public i0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f50719e = messageDigest;
            this.f50720f = messageDigest.getDigestLength();
            this.f50721n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.h = z10;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.f50721n;
    }
}
