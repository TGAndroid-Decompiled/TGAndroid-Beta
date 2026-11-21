package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f57596b;
    public final int f57597c;
    public final int d;
    public final long f57598e;
    public final long f57599f;
    public final i[] f57600g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f57596b = str;
        this.f57597c = i7;
        this.d = i10;
        this.f57598e = j3;
        this.f57599f = j10;
        this.f57600g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f57597c == cVar.f57597c && this.d == cVar.d && this.f57598e == cVar.f57598e && this.f57599f == cVar.f57599f && Objects.equals(this.f57596b, cVar.f57596b) && Arrays.equals(this.f57600g, cVar.f57600g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f57597c) * 31) + this.d) * 31) + ((int) this.f57598e)) * 31) + ((int) this.f57599f)) * 31;
        String str = this.f57596b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
