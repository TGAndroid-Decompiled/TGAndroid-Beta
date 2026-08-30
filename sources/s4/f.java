package s4;

import h5.d0;
public final class f {
    public final String f44004a;
    public final String f44005b;
    public final String f44006c;

    public f(String str, String str2, String str3) {
        this.f44004a = str;
        this.f44005b = str2;
        this.f44006c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f44004a, fVar.f44004a) && d0.a(this.f44005b, fVar.f44005b) && d0.a(this.f44006c, fVar.f44006c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f44004a.hashCode() * 31;
        int i11 = 0;
        String str = this.f44005b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f44006c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
