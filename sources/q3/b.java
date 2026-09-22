package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41432b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41432b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41449a.equals(bVar.f41449a) && Arrays.equals(this.f41432b, bVar.f41432b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41432b) + a4.a.h(527, 31, this.f41449a);
    }
}
