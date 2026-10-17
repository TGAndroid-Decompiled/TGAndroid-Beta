package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44091a;
    public final String f44092b;
    public final String f44093c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4064a = null;
        a2.f4071k = null;
        this.f44091a = new b2.w(a2);
        this.f44092b = str;
        this.f44093c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44091a, wVar.f44091a) && Objects.equals(this.f44092b, wVar.f44092b) && Objects.equals(this.f44093c, wVar.f44093c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44091a, this.f44092b, this.f44093c);
    }
}
