package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45430b;
    public final boolean f45431c;
    public final boolean d;
    public final String[] e;
    public final j[] f45432f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45430b = str;
        this.f45431c = z10;
        this.d = z11;
        this.e = strArr;
        this.f45432f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45431c == dVar.f45431c && this.d == dVar.d && Objects.equals(this.f45430b, dVar.f45430b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f45432f, dVar.f45432f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45431c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45430b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
