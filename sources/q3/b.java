package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41384b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41384b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41401a.equals(bVar.f41401a) && Arrays.equals(this.f41384b, bVar.f41384b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41384b) + a4.a.h(527, 31, this.f41401a);
    }
}
