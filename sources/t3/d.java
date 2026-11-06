package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55300b;
    public final boolean f55301c;
    public final boolean d;
    public final String[] f55302e;
    public final i[] f55303f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55300b = str;
        this.f55301c = z9;
        this.d = z10;
        this.f55302e = strArr;
        this.f55303f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55301c == dVar.f55301c && this.d == dVar.d && Objects.equals(this.f55300b, dVar.f55300b) && Arrays.equals(this.f55302e, dVar.f55302e) && Arrays.equals(this.f55303f, dVar.f55303f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55301c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55300b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
