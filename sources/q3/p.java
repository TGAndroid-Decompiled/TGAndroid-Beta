package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f41426b;
    public final String f41427c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f41426b = str2;
        this.f41427c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f41415a.equals(pVar.f41415a) && Objects.equals(this.f41426b, pVar.f41426b) && Objects.equals(this.f41427c, pVar.f41427c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f41415a);
        int i11 = 0;
        String str = this.f41426b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f41427c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f41415a + ": url=" + this.f41427c;
    }
}
