package s3;

import j$.util.Objects;
import java.util.Arrays;
public final class d extends i {
    public final String f54613b;
    public final boolean f54614c;
    public final boolean d;
    public final String[] f54615e;
    public final i[] f54616f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f54613b = str;
        this.f54614c = z10;
        this.d = z11;
        this.f54615e = strArr;
        this.f54616f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f54614c == dVar.f54614c && this.d == dVar.d && Objects.equals(this.f54613b, dVar.f54613b) && Arrays.equals(this.f54615e, dVar.f54615e) && Arrays.equals(this.f54616f, dVar.f54616f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10 = (((527 + (this.f54614c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f54613b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return i10 + i3;
    }
}
