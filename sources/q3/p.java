package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f44196b;
    public final String f44197c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f44196b = str2;
        this.f44197c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f44184a.equals(pVar.f44184a) && Objects.equals(this.f44196b, pVar.f44196b) && Objects.equals(this.f44197c, pVar.f44197c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f44184a);
        int i11 = 0;
        String str = this.f44196b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f44197c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f44184a + ": url=" + this.f44197c;
    }
}
