package q3;

import java.util.Arrays;
public final class m extends j {
    public final int f41126b;
    public final int f41127c;
    public final int d;
    public final int[] e;
    public final int[] f41128f;

    public m(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f41126b = i10;
        this.f41127c = i11;
        this.d = i12;
        this.e = iArr;
        this.f41128f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f41126b == mVar.f41126b && this.f41127c == mVar.f41127c && this.d == mVar.d && Arrays.equals(this.e, mVar.e) && Arrays.equals(this.f41128f, mVar.f41128f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f41128f) + ((hashCode + ((((((527 + this.f41126b) * 31) + this.f41127c) * 31) + this.d) * 31)) * 31);
    }
}
