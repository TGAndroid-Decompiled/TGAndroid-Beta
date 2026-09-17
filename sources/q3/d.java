package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44142b;
    public final boolean f44143c;
    public final boolean d;
    public final String[] f44144e;
    public final j[] f44145f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44142b = str;
        this.f44143c = z10;
        this.d = z11;
        this.f44144e = strArr;
        this.f44145f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44143c == dVar.f44143c && this.d == dVar.d && Objects.equals(this.f44142b, dVar.f44142b) && Arrays.equals(this.f44144e, dVar.f44144e) && Arrays.equals(this.f44145f, dVar.f44145f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44143c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44142b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
