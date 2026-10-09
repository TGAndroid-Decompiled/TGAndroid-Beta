package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f45963b;
    public final String f45964c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f45963b = str2;
        this.f45964c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f45951a.equals(pVar.f45951a) && Objects.equals(this.f45963b, pVar.f45963b) && Objects.equals(this.f45964c, pVar.f45964c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(527, 31, this.f45951a);
        int i11 = 0;
        String str = this.f45963b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f45964c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f45951a + ": url=" + this.f45964c;
    }
}
