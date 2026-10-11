package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f46074b;
    public final String f46075c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f46074b = str2;
        this.f46075c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f46062a.equals(pVar.f46062a) && Objects.equals(this.f46074b, pVar.f46074b) && Objects.equals(this.f46075c, pVar.f46075c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(527, 31, this.f46062a);
        int i11 = 0;
        String str = this.f46074b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f46075c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f46062a + ": url=" + this.f46075c;
    }
}
