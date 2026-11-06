package t3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends i {
    public final String f55270b;
    public final int f55271c;
    public final int d;
    public final long f55272e;
    public final long f55273f;
    public final i[] f55274g;

    public c(String str, int i7, int i10, long j3, long j10, i[] iVarArr) {
        super("CHAP");
        this.f55270b = str;
        this.f55271c = i7;
        this.d = i10;
        this.f55272e = j3;
        this.f55273f = j10;
        this.f55274g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f55271c == cVar.f55271c && this.d == cVar.d && this.f55272e == cVar.f55272e && this.f55273f == cVar.f55273f && Objects.equals(this.f55270b, cVar.f55270b) && Arrays.equals(this.f55274g, cVar.f55274g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = (((((((527 + this.f55271c) * 31) + this.d) * 31) + ((int) this.f55272e)) * 31) + ((int) this.f55273f)) * 31;
        String str = this.f55270b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }
}
