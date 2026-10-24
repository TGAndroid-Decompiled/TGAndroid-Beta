package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f44782b;
    public final boolean f44783c;
    public final boolean d;
    public final String[] e;
    public final i[] f44784f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f44782b = str;
        this.f44783c = z10;
        this.d = z11;
        this.e = strArr;
        this.f44784f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44783c == dVar.f44783c && this.d == dVar.d && Objects.equals(this.f44782b, dVar.f44782b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f44784f, dVar.f44784f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44783c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44782b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
