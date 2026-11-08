package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55391b;
    public final boolean f55392c;
    public final boolean d;
    public final String[] f55393e;
    public final i[] f55394f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55391b = str;
        this.f55392c = z9;
        this.d = z10;
        this.f55393e = strArr;
        this.f55394f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55392c == dVar.f55392c && this.d == dVar.d && Objects.equals(this.f55391b, dVar.f55391b) && Arrays.equals(this.f55393e, dVar.f55393e) && Arrays.equals(this.f55394f, dVar.f55394f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55392c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55391b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
