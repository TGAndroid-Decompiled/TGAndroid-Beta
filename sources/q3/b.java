package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f45436b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f45436b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45453a.equals(bVar.f45453a) && Arrays.equals(this.f45436b, bVar.f45436b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45436b) + a1.g.f(527, 31, this.f45453a);
    }
}
