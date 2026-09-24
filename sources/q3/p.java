package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f41412b;
    public final String f41413c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f41412b = str2;
        this.f41413c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f41401a.equals(pVar.f41401a) && Objects.equals(this.f41412b, pVar.f41412b) && Objects.equals(this.f41413c, pVar.f41413c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f41401a);
        int i11 = 0;
        String str = this.f41412b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f41413c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f41401a + ": url=" + this.f41413c;
    }
}
