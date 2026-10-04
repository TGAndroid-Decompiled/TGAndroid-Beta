package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44763b;
    public final int f44764c;
    public final int d;
    public final long f44765e;
    public final long f44766f;
    public final j[] f44767g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44763b = str;
        this.f44764c = i10;
        this.d = i11;
        this.f44765e = j3;
        this.f44766f = j10;
        this.f44767g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44764c == cVar.f44764c && this.d == cVar.d && this.f44765e == cVar.f44765e && this.f44766f == cVar.f44766f && Objects.equals(this.f44763b, cVar.f44763b) && Arrays.equals(this.f44767g, cVar.f44767g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44764c) * 31) + this.d) * 31) + ((int) this.f44765e)) * 31) + ((int) this.f44766f)) * 31;
        String str = this.f44763b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
