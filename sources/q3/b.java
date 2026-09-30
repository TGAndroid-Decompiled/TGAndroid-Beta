package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41400b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41400b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41417a.equals(bVar.f41417a) && Arrays.equals(this.f41400b, bVar.f41400b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41400b) + a4.a.h(527, 31, this.f41417a);
    }
}
