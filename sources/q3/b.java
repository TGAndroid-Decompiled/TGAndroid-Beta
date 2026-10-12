package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f43269b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f43269b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f43283a.equals(bVar.f43283a) && Arrays.equals(this.f43269b, bVar.f43269b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43269b) + a1.g.g(527, 31, this.f43283a);
    }
}
