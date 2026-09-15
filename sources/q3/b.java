package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41109b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41109b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41126a.equals(bVar.f41126a) && Arrays.equals(this.f41109b, bVar.f41109b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41109b) + a4.a.h(527, 31, this.f41126a);
    }
}
