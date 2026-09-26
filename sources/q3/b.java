package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41398b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41398b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41415a.equals(bVar.f41415a) && Arrays.equals(this.f41398b, bVar.f41398b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41398b) + a4.a.h(527, 31, this.f41415a);
    }
}
