package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55275b;
    public final boolean f55276c;
    public final boolean d;
    public final String[] f55277e;
    public final i[] f55278f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55275b = str;
        this.f55276c = z9;
        this.d = z10;
        this.f55277e = strArr;
        this.f55278f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55276c == dVar.f55276c && this.d == dVar.d && Objects.equals(this.f55275b, dVar.f55275b) && Arrays.equals(this.f55277e, dVar.f55277e) && Arrays.equals(this.f55278f, dVar.f55278f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55276c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55275b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
