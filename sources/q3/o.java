package q3;

import j$.util.Objects;
public final class o extends i {
    public final String f43037b;
    public final String f43038c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f43037b = str2;
        this.f43038c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f43026a.equals(oVar.f43026a) && Objects.equals(this.f43037b, oVar.f43037b) && Objects.equals(this.f43038c, oVar.f43038c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(527, 31, this.f43026a);
        int i11 = 0;
        String str = this.f43037b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (g10 + i10) * 31;
        String str2 = this.f43038c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f43026a + ": url=" + this.f43038c;
    }
}
