package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f55392b;
    public final boolean f55393c;
    public final boolean d;
    public final String[] f55394e;
    public final i[] f55395f;

    public d(String str, boolean z9, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f55392b = str;
        this.f55393c = z9;
        this.d = z10;
        this.f55394e = strArr;
        this.f55395f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55393c == dVar.f55393c && this.d == dVar.d && Objects.equals(this.f55392b, dVar.f55392b) && Arrays.equals(this.f55394e, dVar.f55394e) && Arrays.equals(this.f55395f, dVar.f55395f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f55393c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f55392b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
