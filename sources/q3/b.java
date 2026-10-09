package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f45931b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f45931b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f45951a.equals(bVar.f45951a) && Arrays.equals(this.f45931b, bVar.f45931b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45931b) + a1.g.h(527, 31, this.f45951a);
    }
}
