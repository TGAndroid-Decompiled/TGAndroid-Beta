package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44763b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44763b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44783a.equals(bVar.f44783a) && Arrays.equals(this.f44763b, bVar.f44763b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44763b) + a4.a.h(527, 31, this.f44783a);
    }
}
