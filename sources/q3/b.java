package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f44361b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44361b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44375a.equals(bVar.f44375a) && Arrays.equals(this.f44361b, bVar.f44361b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44361b) + a1.g.g(527, 31, this.f44375a);
    }
}
