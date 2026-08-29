package p4;

import f5.d0;
public final class f {
    public final String f45560a;
    public final String f45561b;
    public final String f45562c;

    public f(String str, String str2, String str3) {
        this.f45560a = str;
        this.f45561b = str2;
        this.f45562c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f45560a, fVar.f45560a) && d0.a(this.f45561b, fVar.f45561b) && d0.a(this.f45562c, fVar.f45562c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f45560a.hashCode() * 31;
        int i11 = 0;
        String str = this.f45561b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f45562c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
