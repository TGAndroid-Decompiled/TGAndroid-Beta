package s3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f54608b;
    public final int f54609c;
    public final int d;
    public final long f54610e;
    public final long f54611f;
    public final i[] f54612g;

    public c(String str, int i3, int i10, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f54608b = str;
        this.f54609c = i3;
        this.d = i10;
        this.f54610e = j10;
        this.f54611f = j11;
        this.f54612g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f54609c == cVar.f54609c && this.d == cVar.d && this.f54610e == cVar.f54610e && this.f54611f == cVar.f54611f && Objects.equals(this.f54608b, cVar.f54608b) && Arrays.equals(this.f54612g, cVar.f54612g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10 = (((((((527 + this.f54609c) * 31) + this.d) * 31) + ((int) this.f54610e)) * 31) + ((int) this.f54611f)) * 31;
        String str = this.f54608b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return i10 + i3;
    }
}
