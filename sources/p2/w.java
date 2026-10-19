package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44063a;
    public final String f44064b;
    public final String f44065c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4063a = null;
        a2.f4070k = null;
        this.f44063a = new b2.w(a2);
        this.f44064b = str;
        this.f44065c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44063a, wVar.f44063a) && Objects.equals(this.f44064b, wVar.f44064b) && Objects.equals(this.f44065c, wVar.f44065c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44063a, this.f44064b, this.f44065c);
    }
}
