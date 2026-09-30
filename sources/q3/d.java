package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41502b;
    public final boolean f41503c;
    public final boolean d;
    public final String[] e;
    public final j[] f41504f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41502b = str;
        this.f41503c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41504f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41503c == dVar.f41503c && this.d == dVar.d && Objects.equals(this.f41502b, dVar.f41502b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41504f, dVar.f41504f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41503c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41502b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
