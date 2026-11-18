package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f57562b;
    public final boolean f57563c;
    public final boolean d;
    public final String[] f57564e;
    public final i[] f57565f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f57562b = str;
        this.f57563c = z10;
        this.d = z11;
        this.f57564e = strArr;
        this.f57565f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57563c == dVar.f57563c && this.d == dVar.d && Objects.equals(this.f57562b, dVar.f57562b) && Arrays.equals(this.f57564e, dVar.f57564e) && Arrays.equals(this.f57565f, dVar.f57565f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f57563c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f57562b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
