package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f44768b;
    public final boolean f44769c;
    public final boolean d;
    public final String[] f44770e;
    public final j[] f44771f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f44768b = str;
        this.f44769c = z10;
        this.d = z11;
        this.f44770e = strArr;
        this.f44771f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44769c == dVar.f44769c && this.d == dVar.d && Objects.equals(this.f44768b, dVar.f44768b) && Arrays.equals(this.f44770e, dVar.f44770e) && Arrays.equals(this.f44771f, dVar.f44771f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44769c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44768b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
