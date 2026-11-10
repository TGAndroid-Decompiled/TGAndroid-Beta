package q7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class i0 extends a implements Serializable {
    public final MessageDigest f53995e;
    public final int f53996f;
    public final boolean h;
    public final String f53997n;

    public i0() {
        boolean z9;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f53995e = messageDigest;
            this.f53996f = messageDigest.getDigestLength();
            this.f53997n = "Hashing.sha256()";
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
        return this.f53997n;
    }
}
