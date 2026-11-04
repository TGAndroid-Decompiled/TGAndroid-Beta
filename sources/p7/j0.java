package p7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class j0 extends a implements Serializable {
    public final MessageDigest f53366e;
    public final int f53367f;
    public final boolean h;
    public final String f53368n;

    public j0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f53366e = messageDigest;
            this.f53367f = messageDigest.getDigestLength();
            this.f53368n = "Hashing.sha256()";
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
        return this.f53368n;
    }
}
