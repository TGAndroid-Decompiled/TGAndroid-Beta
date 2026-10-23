package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f44370b;
    public final boolean f44371c;
    public final boolean d;
    public final String[] e;
    public final i[] f44372f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f44370b = str;
        this.f44371c = z10;
        this.d = z11;
        this.e = strArr;
        this.f44372f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44371c == dVar.f44371c && this.d == dVar.d && Objects.equals(this.f44370b, dVar.f44370b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f44372f, dVar.f44372f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44371c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44370b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
