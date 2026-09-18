package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41370b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41370b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41387a.equals(bVar.f41387a) && Arrays.equals(this.f41370b, bVar.f41370b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41370b) + a4.a.h(527, 31, this.f41387a);
    }
}
