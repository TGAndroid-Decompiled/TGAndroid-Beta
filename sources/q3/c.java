package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f45871b;
    public final int f45872c;
    public final int d;
    public final long f45873e;
    public final long f45874f;
    public final j[] f45875g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f45871b = str;
        this.f45872c = i10;
        this.d = i11;
        this.f45873e = j3;
        this.f45874f = j10;
        this.f45875g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f45872c == cVar.f45872c && this.d == cVar.d && this.f45873e == cVar.f45873e && this.f45874f == cVar.f45874f && Objects.equals(this.f45871b, cVar.f45871b) && Arrays.equals(this.f45875g, cVar.f45875g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f45872c) * 31) + this.d) * 31) + ((int) this.f45873e)) * 31) + ((int) this.f45874f)) * 31;
        String str = this.f45871b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
