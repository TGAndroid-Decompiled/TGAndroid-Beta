package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44770b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44770b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44790a.equals(bVar.f44790a) && Arrays.equals(this.f44770b, bVar.f44770b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44770b) + a4.a.h(527, 31, this.f44790a);
    }
}
