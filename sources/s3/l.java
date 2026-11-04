package s3;

import java.util.Arrays;
public final class l extends i {
    public final int f54628b;
    public final int f54629c;
    public final int d;
    public final int[] f54630e;
    public final int[] f54631f;

    public l(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f54628b = i3;
        this.f54629c = i10;
        this.d = i11;
        this.f54630e = iArr;
        this.f54631f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f54628b == lVar.f54628b && this.f54629c == lVar.f54629c && this.d == lVar.d && Arrays.equals(this.f54630e, lVar.f54630e) && Arrays.equals(this.f54631f, lVar.f54631f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f54630e);
        return Arrays.hashCode(this.f54631f) + ((hashCode + ((((((527 + this.f54628b) * 31) + this.f54629c) * 31) + this.d) * 31)) * 31);
    }
}
