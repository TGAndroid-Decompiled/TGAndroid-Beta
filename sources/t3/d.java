package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55403b;
    public final boolean f55404c;
    public final boolean d;
    public final String[] f55405e;
    public final i[] f55406f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55403b = str;
        this.f55404c = z9;
        this.d = z10;
        this.f55405e = strArr;
        this.f55406f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55404c == dVar.f55404c && this.d == dVar.d && Objects.equals(this.f55403b, dVar.f55403b) && Arrays.equals(this.f55405e, dVar.f55405e) && Arrays.equals(this.f55406f, dVar.f55406f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55404c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55403b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
