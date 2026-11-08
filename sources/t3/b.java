package t3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f55386b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f55386b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f55403a.equals(bVar.f55403a) && Arrays.equals(this.f55386b, bVar.f55386b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55386b) + com.google.android.recaptcha.internal.a.h(527, 31, this.f55403a);
    }
}
