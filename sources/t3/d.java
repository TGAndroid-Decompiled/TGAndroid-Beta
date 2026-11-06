package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55299b;
    public final boolean f55300c;
    public final boolean d;
    public final String[] f55301e;
    public final i[] f55302f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55299b = str;
        this.f55300c = z9;
        this.d = z10;
        this.f55301e = strArr;
        this.f55302f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55300c == dVar.f55300c && this.d == dVar.d && Objects.equals(this.f55299b, dVar.f55299b) && Arrays.equals(this.f55301e, dVar.f55301e) && Arrays.equals(this.f55302f, dVar.f55302f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55300c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55299b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
