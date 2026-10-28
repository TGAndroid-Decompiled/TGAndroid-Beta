package q3;

import j$.util.Objects;
public final class o extends i {
    public final String f46989b;
    public final String f46990c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f46989b = str2;
        this.f46990c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f46978a.equals(oVar.f46978a) && Objects.equals(this.f46989b, oVar.f46989b) && Objects.equals(this.f46990c, oVar.f46990c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(527, 31, this.f46978a);
        int i11 = 0;
        String str = this.f46989b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (f7 + i10) * 31;
        String str2 = this.f46990c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f46978a + ": url=" + this.f46990c;
    }
}
