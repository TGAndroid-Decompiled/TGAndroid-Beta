package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f44786b;
    public final int f44787c;
    public final int d;
    public final int[] f44788e;
    public final int[] f44789f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44786b = i10;
        this.f44787c = i11;
        this.d = i12;
        this.f44788e = iArr;
        this.f44789f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f44786b == mVar.f44786b && this.f44787c == mVar.f44787c && this.d == mVar.d && Arrays.equals(this.f44788e, mVar.f44788e) && Arrays.equals(this.f44789f, mVar.f44789f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f44788e);
        return Arrays.hashCode(this.f44789f) + ((hashCode + ((((((527 + this.f44786b) * 31) + this.f44787c) * 31) + this.d) * 31)) * 31);
    }
}
