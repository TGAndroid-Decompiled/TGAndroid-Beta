package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f43012b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f43012b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f43026a.equals(bVar.f43026a) && Arrays.equals(this.f43012b, bVar.f43012b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43012b) + a1.g.g(527, 31, this.f43026a);
    }
}
