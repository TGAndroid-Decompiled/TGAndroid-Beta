package q3;

import j$.util.Objects;
public final class o extends i {
    public final String f43294b;
    public final String f43295c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f43294b = str2;
        this.f43295c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f43283a.equals(oVar.f43283a) && Objects.equals(this.f43294b, oVar.f43294b) && Objects.equals(this.f43295c, oVar.f43295c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(527, 31, this.f43283a);
        int i11 = 0;
        String str = this.f43294b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (g10 + i10) * 31;
        String str2 = this.f43295c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f43283a + ": url=" + this.f43295c;
    }
}
