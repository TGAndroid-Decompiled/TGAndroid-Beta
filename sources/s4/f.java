package s4;

import h5.d0;
public final class f {
    public final String f44069a;
    public final String f44070b;
    public final String f44071c;

    public f(String str, String str2, String str3) {
        this.f44069a = str;
        this.f44070b = str2;
        this.f44071c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f44069a, fVar.f44069a) && d0.a(this.f44070b, fVar.f44070b) && d0.a(this.f44071c, fVar.f44071c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f44069a.hashCode() * 31;
        int i11 = 0;
        String str = this.f44070b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f44071c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
