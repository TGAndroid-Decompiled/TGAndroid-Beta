package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f45910b;
    public final String f45911c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f45910b = str2;
        this.f45911c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f45898a.equals(pVar.f45898a) && Objects.equals(this.f45910b, pVar.f45910b) && Objects.equals(this.f45911c, pVar.f45911c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(527, 31, this.f45898a);
        int i11 = 0;
        String str = this.f45910b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f45911c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f45898a + ": url=" + this.f45911c;
    }
}
