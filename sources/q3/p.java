package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f45464b;
    public final String f45465c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f45464b = str2;
        this.f45465c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f45453a.equals(pVar.f45453a) && Objects.equals(this.f45464b, pVar.f45464b) && Objects.equals(this.f45465c, pVar.f45465c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(527, 31, this.f45453a);
        int i11 = 0;
        String str = this.f45464b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (f7 + i10) * 31;
        String str2 = this.f45465c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f45453a + ": url=" + this.f45465c;
    }
}
