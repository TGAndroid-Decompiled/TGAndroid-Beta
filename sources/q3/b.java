package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f46964b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f46964b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46978a.equals(bVar.f46978a) && Arrays.equals(this.f46964b, bVar.f46964b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46964b) + a1.g.f(527, 31, this.f46978a);
    }
}
