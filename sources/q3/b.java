package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41399b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41399b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41416a.equals(bVar.f41416a) && Arrays.equals(this.f41399b, bVar.f41399b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41399b) + a4.a.h(527, 31, this.f41416a);
    }
}
