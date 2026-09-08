package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f44164b;
    public final int f44165c;
    public final int d;
    public final long f44166e;
    public final long f44167f;
    public final j[] f44168g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f44164b = str;
        this.f44165c = i10;
        this.d = i11;
        this.f44166e = j3;
        this.f44167f = j10;
        this.f44168g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44165c == cVar.f44165c && this.d == cVar.d && this.f44166e == cVar.f44166e && this.f44167f == cVar.f44167f && Objects.equals(this.f44164b, cVar.f44164b) && Arrays.equals(this.f44168g, cVar.f44168g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f44165c) * 31) + this.d) * 31) + ((int) this.f44166e)) * 31) + ((int) this.f44167f)) * 31;
        String str = this.f44164b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
