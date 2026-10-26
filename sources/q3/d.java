package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f46934b;
    public final boolean f46935c;
    public final boolean d;
    public final String[] e;
    public final i[] f46936f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f46934b = str;
        this.f46935c = z10;
        this.d = z11;
        this.e = strArr;
        this.f46936f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46935c == dVar.f46935c && this.d == dVar.d && Objects.equals(this.f46934b, dVar.f46934b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f46936f, dVar.f46936f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f46935c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f46934b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
