package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44169b;
    public final boolean f44170c;
    public final boolean d;
    public final String[] f44171e;
    public final j[] f44172f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44169b = str;
        this.f44170c = z10;
        this.d = z11;
        this.f44171e = strArr;
        this.f44172f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44170c == dVar.f44170c && this.d == dVar.d && Objects.equals(this.f44169b, dVar.f44169b) && Arrays.equals(this.f44171e, dVar.f44171e) && Arrays.equals(this.f44172f, dVar.f44172f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44170c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44169b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
