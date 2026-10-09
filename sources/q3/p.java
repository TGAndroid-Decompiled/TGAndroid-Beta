package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f45965b;
    public final String f45966c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f45965b = str2;
        this.f45966c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f45953a.equals(pVar.f45953a) && Objects.equals(this.f45965b, pVar.f45965b) && Objects.equals(this.f45966c, pVar.f45966c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(527, 31, this.f45953a);
        int i11 = 0;
        String str = this.f45965b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f45966c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f45953a + ": url=" + this.f45966c;
    }
}
