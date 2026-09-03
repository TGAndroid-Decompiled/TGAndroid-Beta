package s4;

import h5.d0;
public final class f {
    public final String f47000a;
    public final String f47001b;
    public final String f47002c;

    public f(String str, String str2, String str3) {
        this.f47000a = str;
        this.f47001b = str2;
        this.f47002c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f47000a, fVar.f47000a) && d0.a(this.f47001b, fVar.f47001b) && d0.a(this.f47002c, fVar.f47002c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f47000a.hashCode() * 31;
        int i11 = 0;
        String str = this.f47001b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f47002c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
