package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44165b;
    public final int f44166c;
    public final int d;
    public final long f44167e;
    public final long f44168f;
    public final j[] f44169g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44165b = str;
        this.f44166c = i10;
        this.d = i11;
        this.f44167e = j3;
        this.f44168f = j10;
        this.f44169g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44166c == cVar.f44166c && this.d == cVar.d && this.f44167e == cVar.f44167e && this.f44168f == cVar.f44168f && Objects.equals(this.f44165b, cVar.f44165b) && Arrays.equals(this.f44169g, cVar.f44169g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44166c) * 31) + this.d) * 31) + ((int) this.f44167e)) * 31) + ((int) this.f44168f)) * 31;
        String str = this.f44165b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
