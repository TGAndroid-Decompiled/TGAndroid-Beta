package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f44356b;
    public final boolean f44357c;
    public final boolean d;
    public final String[] e;
    public final i[] f44358f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f44356b = str;
        this.f44357c = z10;
        this.d = z11;
        this.e = strArr;
        this.f44358f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44357c == dVar.f44357c && this.d == dVar.d && Objects.equals(this.f44356b, dVar.f44356b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f44358f, dVar.f44358f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f44357c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f44356b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
