package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f57684b;
    public final boolean f57685c;
    public final boolean d;
    public final String[] f57686e;
    public final i[] f57687f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f57684b = str;
        this.f57685c = z10;
        this.d = z11;
        this.f57686e = strArr;
        this.f57687f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57685c == dVar.f57685c && this.d == dVar.d && Objects.equals(this.f57684b, dVar.f57684b) && Arrays.equals(this.f57686e, dVar.f57686e) && Arrays.equals(this.f57687f, dVar.f57687f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f57685c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f57684b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
