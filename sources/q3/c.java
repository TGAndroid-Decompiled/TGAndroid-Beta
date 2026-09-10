package q3;

import j$.util.Objects;
import java.util.Arrays;
public final class c extends j {
    public final String f40487b;
    public final int f40488c;
    public final int d;
    public final long e;
    public final long f40489f;
    public final j[] f40490g;

    public c(String str, int i10, int i11, long j3, long j10, j[] jVarArr) {
        super("CHAP");
        this.f40487b = str;
        this.f40488c = i10;
        this.d = i11;
        this.e = j3;
        this.f40489f = j10;
        this.f40490g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f40488c == cVar.f40488c && this.d == cVar.d && this.e == cVar.e && this.f40489f == cVar.f40489f && Objects.equals(this.f40487b, cVar.f40487b) && Arrays.equals(this.f40490g, cVar.f40490g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f40488c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f40489f)) * 31;
        String str = this.f40487b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }
}
