package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44769b;
    public final boolean f44770c;
    public final boolean d;
    public final String[] f44771e;
    public final j[] f44772f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44769b = str;
        this.f44770c = z10;
        this.d = z11;
        this.f44771e = strArr;
        this.f44772f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44770c == dVar.f44770c && this.d == dVar.d && Objects.equals(this.f44769b, dVar.f44769b) && Arrays.equals(this.f44771e, dVar.f44771e) && Arrays.equals(this.f44772f, dVar.f44772f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44770c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44769b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
