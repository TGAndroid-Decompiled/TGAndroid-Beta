package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41105b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41105b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41122a.equals(bVar.f41122a) && Arrays.equals(this.f41105b, bVar.f41105b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41105b) + a4.a.h(527, 31, this.f41122a);
    }
}
