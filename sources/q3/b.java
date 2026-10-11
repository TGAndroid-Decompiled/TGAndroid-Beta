package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f46008b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f46008b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46028a.equals(bVar.f46028a) && Arrays.equals(this.f46008b, bVar.f46008b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46008b) + a1.g.h(527, 31, this.f46028a);
    }
}
