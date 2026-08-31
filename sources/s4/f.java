package s4;

import h5.d0;
public final class f {
    public final String f46969a;
    public final String f46970b;
    public final String f46971c;

    public f(String str, String str2, String str3) {
        this.f46969a = str;
        this.f46970b = str2;
        this.f46971c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f46969a, fVar.f46969a) && d0.a(this.f46970b, fVar.f46970b) && d0.a(this.f46971c, fVar.f46971c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f46969a.hashCode() * 31;
        int i11 = 0;
        String str = this.f46970b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f46971c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
