package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41428b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41428b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41445a.equals(bVar.f41445a) && Arrays.equals(this.f41428b, bVar.f41428b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41428b) + a4.a.h(527, 31, this.f41445a);
    }
}
