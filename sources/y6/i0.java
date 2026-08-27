package y6;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class i0 extends a implements Serializable {

    public final MessageDigest f49736e;

    public final int f49737f;
    public final boolean h;

    public final String f49738n;

    public i0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f49736e = messageDigest;
            this.f49737f = messageDigest.getDigestLength();
            this.f49738n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.h = z10;
        } catch (NoSuchAlgorithmException e9) {
            throw new AssertionError(e9);
        }
    }

    public final String toString() {
        return this.f49738n;
    }
}
