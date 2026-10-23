package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44077a;
    public final String f44078b;
    public final String f44079c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4061a = null;
        a2.f4068k = null;
        this.f44077a = new b2.w(a2);
        this.f44078b = str;
        this.f44079c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44077a, wVar.f44077a) && Objects.equals(this.f44078b, wVar.f44078b) && Objects.equals(this.f44079c, wVar.f44079c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44077a, this.f44078b, this.f44079c);
    }
}
