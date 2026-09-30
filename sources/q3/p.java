package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f41525b;
    public final String f41526c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f41525b = str2;
        this.f41526c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f41514a.equals(pVar.f41514a) && Objects.equals(this.f41525b, pVar.f41525b) && Objects.equals(this.f41526c, pVar.f41526c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f41514a);
        int i11 = 0;
        String str = this.f41525b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f41526c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f41514a + ": url=" + this.f41526c;
    }
}
