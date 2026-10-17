package q3;

import j$.util.Objects;
public final class o extends i {
    public final String f44405b;
    public final String f44406c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f44405b = str2;
        this.f44406c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f44394a.equals(oVar.f44394a) && Objects.equals(this.f44405b, oVar.f44405b) && Objects.equals(this.f44406c, oVar.f44406c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(527, 31, this.f44394a);
        int i11 = 0;
        String str = this.f44405b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (g10 + i10) * 31;
        String str2 = this.f44406c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f44394a + ": url=" + this.f44406c;
    }
}
