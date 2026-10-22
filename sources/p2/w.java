package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44076a;
    public final String f44077b;
    public final String f44078c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4061a = null;
        a2.f4068k = null;
        this.f44076a = new b2.w(a2);
        this.f44077b = str;
        this.f44078c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44076a, wVar.f44076a) && Objects.equals(this.f44077b, wVar.f44077b) && Objects.equals(this.f44078c, wVar.f44078c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44076a, this.f44077b, this.f44078c);
    }
}
