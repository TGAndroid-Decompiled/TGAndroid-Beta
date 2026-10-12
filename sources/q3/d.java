package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f43274b;
    public final boolean f43275c;
    public final boolean d;
    public final String[] e;
    public final i[] f43276f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f43274b = str;
        this.f43275c = z10;
        this.d = z11;
        this.e = strArr;
        this.f43276f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f43275c == dVar.f43275c && this.d == dVar.d && Objects.equals(this.f43274b, dVar.f43274b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f43276f, dVar.f43276f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f43275c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f43274b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
