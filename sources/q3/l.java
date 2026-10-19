package q3;

import java.util.Arrays;
public final class l extends i {
    public final int f44369b;
    public final int f44370c;
    public final int d;
    public final int[] e;
    public final int[] f44371f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f44369b = i10;
        this.f44370c = i11;
        this.d = i12;
        this.e = iArr;
        this.f44371f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f44369b == lVar.f44369b && this.f44370c == lVar.f44370c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f44371f, lVar.f44371f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f44371f) + ((hashCode + ((((((527 + this.f44369b) * 31) + this.f44370c) * 31) + this.d) * 31)) * 31);
    }
}
