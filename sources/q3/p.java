package q3;

import j$.util.Objects;
public final class p extends j {
    public final String f44195b;
    public final String f44196c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f44195b = str2;
        this.f44196c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f44183a.equals(pVar.f44183a) && Objects.equals(this.f44195b, pVar.f44195b) && Objects.equals(this.f44196c, pVar.f44196c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f44183a);
        int i11 = 0;
        String str = this.f44195b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (h + i10) * 31;
        String str2 = this.f44196c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override
    public final String toString() {
        return this.f44183a + ": url=" + this.f44196c;
    }
}
