package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f40514b;
    public final String f40515c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f40514b = str2;
        this.f40515c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f40503a.equals(pVar.f40503a) && Objects.equals(this.f40514b, pVar.f40514b) && Objects.equals(this.f40515c, pVar.f40515c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f40503a);
        int i11 = 0;
        String str = this.f40514b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f40515c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f40503a + ": url=" + this.f40515c;
    }
}
