package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f46014b;
    public final boolean f46015c;
    public final boolean d;
    public final String[] f46016e;
    public final j[] f46017f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f46014b = str;
        this.f46015c = z10;
        this.d = z11;
        this.f46016e = strArr;
        this.f46017f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46015c == dVar.f46015c && this.d == dVar.d && Objects.equals(this.f46014b, dVar.f46014b) && Arrays.equals(this.f46016e, dVar.f46016e) && Arrays.equals(this.f46017f, dVar.f46017f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f46015c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f46014b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
