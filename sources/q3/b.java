package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44762b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44762b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44782a.equals(bVar.f44782a) && Arrays.equals(this.f44762b, bVar.f44762b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44762b) + a4.a.h(527, 31, this.f44782a);
    }
}
