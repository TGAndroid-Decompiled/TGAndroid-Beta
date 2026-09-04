package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44141b;
    public final boolean f44142c;
    public final boolean d;
    public final String[] f44143e;
    public final j[] f44144f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44141b = str;
        this.f44142c = z10;
        this.d = z11;
        this.f44143e = strArr;
        this.f44144f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44142c == dVar.f44142c && this.d == dVar.d && Objects.equals(this.f44141b, dVar.f44141b) && Arrays.equals(this.f44143e, dVar.f44143e) && Arrays.equals(this.f44144f, dVar.f44144f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44142c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44141b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
