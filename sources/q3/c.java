package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44764b;
    public final int f44765c;
    public final int d;
    public final long f44766e;
    public final long f44767f;
    public final j[] f44768g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44764b = str;
        this.f44765c = i10;
        this.d = i11;
        this.f44766e = j3;
        this.f44767f = j10;
        this.f44768g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44765c == cVar.f44765c && this.d == cVar.d && this.f44766e == cVar.f44766e && this.f44767f == cVar.f44767f && Objects.equals(this.f44764b, cVar.f44764b) && Arrays.equals(this.f44768g, cVar.f44768g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44765c) * 31) + this.d) * 31) + ((int) this.f44766e)) * 31) + ((int) this.f44767f)) * 31;
        String str = this.f44764b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
