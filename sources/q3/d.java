package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f46969b;
    public final boolean f46970c;
    public final boolean d;
    public final String[] e;
    public final i[] f46971f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f46969b = str;
        this.f46970c = z10;
        this.d = z11;
        this.e = strArr;
        this.f46971f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46970c == dVar.f46970c && this.d == dVar.d && Objects.equals(this.f46969b, dVar.f46969b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f46971f, dVar.f46971f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f46970c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f46969b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
