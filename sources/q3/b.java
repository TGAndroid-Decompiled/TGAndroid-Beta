package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f44778b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44778b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44792a.equals(bVar.f44792a) && Arrays.equals(this.f44778b, bVar.f44778b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44778b) + a1.g.g(527, 31, this.f44792a);
    }
}
