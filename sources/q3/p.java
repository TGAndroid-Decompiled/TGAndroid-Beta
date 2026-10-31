package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f45453b;
    public final String f45454c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f45453b = str2;
        this.f45454c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f45442a.equals(pVar.f45442a) && Objects.equals(this.f45453b, pVar.f45453b) && Objects.equals(this.f45454c, pVar.f45454c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(527, 31, this.f45442a);
        int i11 = 0;
        String str = this.f45453b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (f7 + i10) * 31;
        String str2 = this.f45454c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f45442a + ": url=" + this.f45454c;
    }
}
