package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44136b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44136b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44156a.equals(bVar.f44156a) && Arrays.equals(this.f44136b, bVar.f44136b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44136b) + a4.a.h(527, 31, this.f44156a);
    }
}
