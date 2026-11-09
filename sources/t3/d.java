package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55404b;
    public final boolean f55405c;
    public final boolean d;
    public final String[] f55406e;
    public final i[] f55407f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55404b = str;
        this.f55405c = z9;
        this.d = z10;
        this.f55406e = strArr;
        this.f55407f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55405c == dVar.f55405c && this.d == dVar.d && Objects.equals(this.f55404b, dVar.f55404b) && Arrays.equals(this.f55406e, dVar.f55406e) && Arrays.equals(this.f55407f, dVar.f55407f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55405c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55404b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
