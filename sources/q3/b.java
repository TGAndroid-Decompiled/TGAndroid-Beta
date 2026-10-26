package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f46929b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f46929b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46943a.equals(bVar.f46943a) && Arrays.equals(this.f46929b, bVar.f46929b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46929b) + a1.g.f(527, 31, this.f46943a);
    }
}
