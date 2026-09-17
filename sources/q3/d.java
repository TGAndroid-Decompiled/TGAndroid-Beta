package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44170b;
    public final boolean f44171c;
    public final boolean d;
    public final String[] f44172e;
    public final j[] f44173f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44170b = str;
        this.f44171c = z10;
        this.d = z11;
        this.f44172e = strArr;
        this.f44173f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44171c == dVar.f44171c && this.d == dVar.d && Objects.equals(this.f44170b, dVar.f44170b) && Arrays.equals(this.f44172e, dVar.f44172e) && Arrays.equals(this.f44173f, dVar.f44173f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44171c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44170b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
