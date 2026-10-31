package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f45425b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f45425b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45442a.equals(bVar.f45442a) && Arrays.equals(this.f45425b, bVar.f45425b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45425b) + a1.g.f(527, 31, this.f45442a);
    }
}
