package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44135b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44135b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44155a.equals(bVar.f44155a) && Arrays.equals(this.f44135b, bVar.f44135b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44135b) + a4.a.h(527, 31, this.f44155a);
    }
}
