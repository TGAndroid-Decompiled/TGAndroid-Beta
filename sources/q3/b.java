package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41061b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41061b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41078a.equals(bVar.f41078a) && Arrays.equals(this.f41061b, bVar.f41061b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41061b) + a4.a.h(527, 31, this.f41078a);
    }
}
