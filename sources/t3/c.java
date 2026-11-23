package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f57565b;
    public final int f57566c;
    public final int d;
    public final long f57567e;
    public final long f57568f;
    public final i[] f57569g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f57565b = str;
        this.f57566c = i7;
        this.d = i10;
        this.f57567e = j3;
        this.f57568f = j10;
        this.f57569g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f57566c == cVar.f57566c && this.d == cVar.d && this.f57567e == cVar.f57567e && this.f57568f == cVar.f57568f && Objects.equals(this.f57565b, cVar.f57565b) && Arrays.equals(this.f57569g, cVar.f57569g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f57566c) * 31) + this.d) * 31) + ((int) this.f57567e)) * 31) + ((int) this.f57568f)) * 31;
        String str = this.f57565b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
