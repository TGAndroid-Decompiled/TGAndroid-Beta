package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f56986b;
    public final boolean f56987c;
    public final boolean d;
    public final String[] f56988e;
    public final i[] f56989f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f56986b = str;
        this.f56987c = z10;
        this.d = z11;
        this.f56988e = strArr;
        this.f56989f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f56987c == dVar.f56987c && this.d == dVar.d && Objects.equals(this.f56986b, dVar.f56986b) && Arrays.equals(this.f56988e, dVar.f56988e) && Arrays.equals(this.f56989f, dVar.f56989f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((527 + (this.f56987c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f56986b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
