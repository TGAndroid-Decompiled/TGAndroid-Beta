package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f44167b;
    public final String f44168c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f44167b = str2;
        this.f44168c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f44155a.equals(pVar.f44155a) && Objects.equals(this.f44167b, pVar.f44167b) && Objects.equals(this.f44168c, pVar.f44168c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f44155a);
        int i11 = 0;
        String str = this.f44167b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f44168c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f44155a + ": url=" + this.f44168c;
    }
}
