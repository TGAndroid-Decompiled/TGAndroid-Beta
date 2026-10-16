package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f43017b;
    public final boolean f43018c;
    public final boolean d;
    public final String[] e;
    public final i[] f43019f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f43017b = str;
        this.f43018c = z10;
        this.d = z11;
        this.e = strArr;
        this.f43019f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f43018c == dVar.f43018c && this.d == dVar.d && Objects.equals(this.f43017b, dVar.f43017b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f43019f, dVar.f43019f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f43018c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f43017b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
