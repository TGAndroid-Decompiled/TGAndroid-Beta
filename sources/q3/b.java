package q3;

import java.util.Arrays;
public final class b extends j {
    public final byte[] f44164b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f44164b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f44184a.equals(bVar.f44184a) && Arrays.equals(this.f44164b, bVar.f44164b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44164b) + a4.a.h(527, 31, this.f44184a);
    }
}
