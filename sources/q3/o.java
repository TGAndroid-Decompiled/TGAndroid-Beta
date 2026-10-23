package q3;

import j$.util.Objects;
public final class o extends i {
    public final String f44803b;
    public final String f44804c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f44803b = str2;
        this.f44804c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f44792a.equals(oVar.f44792a) && Objects.equals(this.f44803b, oVar.f44803b) && Objects.equals(this.f44804c, oVar.f44804c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(527, 31, this.f44792a);
        int i11 = 0;
        String str = this.f44803b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (g10 + i10) * 31;
        String str2 = this.f44804c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f44792a + ": url=" + this.f44804c;
    }
}
