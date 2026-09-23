package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f41089b;
    public final String f41090c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f41089b = str2;
        this.f41090c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f41078a.equals(pVar.f41078a) && Objects.equals(this.f41089b, pVar.f41089b) && Objects.equals(this.f41090c, pVar.f41090c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f41078a);
        int i11 = 0;
        String str = this.f41089b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f41090c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f41078a + ": url=" + this.f41090c;
    }
}
