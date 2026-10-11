package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f46042b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f46042b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46062a.equals(bVar.f46062a) && Arrays.equals(this.f46042b, bVar.f46042b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46042b) + a1.g.h(527, 31, this.f46062a);
    }
}
