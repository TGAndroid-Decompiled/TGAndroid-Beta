package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f46040b;
    public final String f46041c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f46040b = str2;
        this.f46041c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f46028a.equals(pVar.f46028a) && Objects.equals(this.f46040b, pVar.f46040b) && Objects.equals(this.f46041c, pVar.f46041c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a1.g.h(527, 31, this.f46028a);
        int i11 = 0;
        String str = this.f46040b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f46041c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f46028a + ": url=" + this.f46041c;
    }
}
