package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f45878b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f45878b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45898a.equals(bVar.f45898a) && Arrays.equals(this.f45878b, bVar.f45878b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45878b) + a1.g.h(527, 31, this.f45898a);
    }
}
