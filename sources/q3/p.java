package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f41398b;
    public final String f41399c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f41398b = str2;
        this.f41399c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f41387a.equals(pVar.f41387a) && Objects.equals(this.f41398b, pVar.f41398b) && Objects.equals(this.f41399c, pVar.f41399c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f41387a);
        int i11 = 0;
        String str = this.f41398b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f41399c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f41387a + ": url=" + this.f41399c;
    }
}
