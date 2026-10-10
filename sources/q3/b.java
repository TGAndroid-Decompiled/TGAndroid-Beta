package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f45977b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f45977b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45997a.equals(bVar.f45997a) && Arrays.equals(this.f45977b, bVar.f45977b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45977b) + a1.g.h(527, 31, this.f45997a);
    }
}
