package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44065a;
    public final String f44066b;
    public final String f44067c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4061a = null;
        a2.f4068k = null;
        this.f44065a = new b2.w(a2);
        this.f44066b = str;
        this.f44067c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44065a, wVar.f44065a) && Objects.equals(this.f44066b, wVar.f44066b) && Objects.equals(this.f44067c, wVar.f44067c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44065a, this.f44066b, this.f44067c);
    }
}
