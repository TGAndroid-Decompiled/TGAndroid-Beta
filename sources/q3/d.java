package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45441b;
    public final boolean f45442c;
    public final boolean d;
    public final String[] e;
    public final j[] f45443f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45441b = str;
        this.f45442c = z10;
        this.d = z11;
        this.e = strArr;
        this.f45443f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45442c == dVar.f45442c && this.d == dVar.d && Objects.equals(this.f45441b, dVar.f45441b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f45443f, dVar.f45443f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45442c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45441b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
