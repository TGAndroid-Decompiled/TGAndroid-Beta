package s3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f54607b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f54607b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f54624a.equals(bVar.f54624a) && Arrays.equals(this.f54607b, bVar.f54607b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54607b) + com.google.android.recaptcha.internal.a.g(527, 31, this.f54624a);
    }
}
