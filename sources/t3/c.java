package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f57679b;
    public final int f57680c;
    public final int d;
    public final long f57681e;
    public final long f57682f;
    public final i[] f57683g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f57679b = str;
        this.f57680c = i7;
        this.d = i10;
        this.f57681e = j3;
        this.f57682f = j10;
        this.f57683g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f57680c == cVar.f57680c && this.d == cVar.d && this.f57681e == cVar.f57681e && this.f57682f == cVar.f57682f && Objects.equals(this.f57679b, cVar.f57679b) && Arrays.equals(this.f57683g, cVar.f57683g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f57680c) * 31) + this.d) * 31) + ((int) this.f57681e)) * 31) + ((int) this.f57682f)) * 31;
        String str = this.f57679b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
