package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41110b;
    public final boolean f41111c;
    public final boolean d;
    public final String[] e;
    public final j[] f41112f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41110b = str;
        this.f41111c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41112f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41111c == dVar.f41111c && this.d == dVar.d && Objects.equals(this.f41110b, dVar.f41110b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41112f, dVar.f41112f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41111c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41110b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
