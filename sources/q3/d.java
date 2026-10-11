package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f46048b;
    public final boolean f46049c;
    public final boolean d;
    public final String[] f46050e;
    public final j[] f46051f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f46048b = str;
        this.f46049c = z10;
        this.d = z11;
        this.f46050e = strArr;
        this.f46051f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46049c == dVar.f46049c && this.d == dVar.d && Objects.equals(this.f46048b, dVar.f46048b) && Arrays.equals(this.f46050e, dVar.f46050e) && Arrays.equals(this.f46051f, dVar.f46051f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f46049c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f46048b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
