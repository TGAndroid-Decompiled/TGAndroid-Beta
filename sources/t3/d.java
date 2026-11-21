package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f57601b;
    public final boolean f57602c;
    public final boolean d;
    public final String[] f57603e;
    public final i[] f57604f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f57601b = str;
        this.f57602c = z10;
        this.d = z11;
        this.f57603e = strArr;
        this.f57604f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57602c == dVar.f57602c && this.d == dVar.d && Objects.equals(this.f57601b, dVar.f57601b) && Arrays.equals(this.f57603e, dVar.f57603e) && Arrays.equals(this.f57604f, dVar.f57604f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f57602c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f57601b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
