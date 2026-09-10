package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f40486b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f40486b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f40503a.equals(bVar.f40503a) && Arrays.equals(this.f40486b, bVar.f40486b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40486b) + a4.a.h(527, 31, this.f40503a);
    }
}
