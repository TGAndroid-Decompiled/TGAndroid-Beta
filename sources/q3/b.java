package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f45870b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f45870b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45890a.equals(bVar.f45890a) && Arrays.equals(this.f45870b, bVar.f45870b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45870b) + a1.g.h(527, 31, this.f45890a);
    }
}
