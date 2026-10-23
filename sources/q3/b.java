package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f44365b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44365b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44379a.equals(bVar.f44379a) && Arrays.equals(this.f44365b, bVar.f44365b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44365b) + a1.g.g(527, 31, this.f44379a);
    }
}
