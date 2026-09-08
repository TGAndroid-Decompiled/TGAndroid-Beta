package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44163b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44163b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44183a.equals(bVar.f44183a) && Arrays.equals(this.f44163b, bVar.f44163b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44163b) + a4.a.h(527, 31, this.f44183a);
    }
}
