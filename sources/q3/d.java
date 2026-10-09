package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends j {
    public final String f45937b;
    public final boolean f45938c;
    public final boolean d;
    public final String[] f45939e;
    public final j[] f45940f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f45937b = str;
        this.f45938c = z10;
        this.d = z11;
        this.f45939e = strArr;
        this.f45940f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45938c == dVar.f45938c && this.d == dVar.d && Objects.equals(this.f45937b, dVar.f45937b) && Arrays.equals(this.f45939e, dVar.f45939e) && Arrays.equals(this.f45940f, dVar.f45940f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f45938c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f45937b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
