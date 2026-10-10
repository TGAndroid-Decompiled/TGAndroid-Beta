package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f46009b;
    public final String f46010c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f46009b = str2;
        this.f46010c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f45997a.equals(pVar.f45997a) && Objects.equals(this.f46009b, pVar.f46009b) && Objects.equals(this.f46010c, pVar.f46010c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(527, 31, this.f45997a);
        int i11 = 0;
        String str = this.f46009b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f46010c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f45997a + ": url=" + this.f46010c;
    }
}
