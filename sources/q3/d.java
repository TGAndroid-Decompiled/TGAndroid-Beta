package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f41114b;
    public final boolean f41115c;
    public final boolean d;
    public final String[] e;
    public final j[] f41116f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f41114b = str;
        this.f41115c = z10;
        this.d = z11;
        this.e = strArr;
        this.f41116f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41115c == dVar.f41115c && this.d == dVar.d && Objects.equals(this.f41114b, dVar.f41114b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f41116f, dVar.f41116f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f41115c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f41114b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
