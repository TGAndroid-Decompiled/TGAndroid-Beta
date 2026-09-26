package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f41397b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f41397b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f41414a.equals(bVar.f41414a) && Arrays.equals(this.f41397b, bVar.f41397b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f41397b) + a4.a.h(527, 31, this.f41414a);
    }
}
