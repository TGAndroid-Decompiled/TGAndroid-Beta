package q7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class i0 extends a implements Serializable {
    public final MessageDigest f56051e;
    public final int f56052f;
    public final boolean h;
    public final String f56053n;

    public i0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f56051e = messageDigest;
            this.f56052f = messageDigest.getDigestLength();
            this.f56053n = "Hashing.sha256()";
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
        return this.f56053n;
    }
}
