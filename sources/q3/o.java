package q3;

import j$.util.Objects;
public final class o extends i {
    public final String f46954b;
    public final String f46955c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f46954b = str2;
        this.f46955c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f46943a.equals(oVar.f46943a) && Objects.equals(this.f46954b, oVar.f46954b) && Objects.equals(this.f46955c, oVar.f46955c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(527, 31, this.f46943a);
        int i11 = 0;
        String str = this.f46954b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (f7 + i10) * 31;
        String str2 = this.f46955c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f46943a + ": url=" + this.f46955c;
    }
}
