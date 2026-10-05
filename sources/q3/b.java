package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44777b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44777b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44797a.equals(bVar.f44797a) && Arrays.equals(this.f44777b, bVar.f44777b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44777b) + a4.a.h(527, 31, this.f44797a);
    }
}
