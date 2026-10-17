package q3;

import java.util.Arrays;
public final class b extends i {
    public final byte[] f44380b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44380b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44394a.equals(bVar.f44394a) && Arrays.equals(this.f44380b, bVar.f44380b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44380b) + a1.g.g(527, 31, this.f44394a);
    }
}
