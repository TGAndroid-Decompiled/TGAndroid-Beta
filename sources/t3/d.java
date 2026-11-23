package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f57570b;
    public final boolean f57571c;
    public final boolean d;
    public final String[] f57572e;
    public final i[] f57573f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f57570b = str;
        this.f57571c = z10;
        this.d = z11;
        this.f57572e = strArr;
        this.f57573f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57571c == dVar.f57571c && this.d == dVar.d && Objects.equals(this.f57570b, dVar.f57570b) && Arrays.equals(this.f57572e, dVar.f57572e) && Arrays.equals(this.f57573f, dVar.f57573f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f57571c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f57570b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
