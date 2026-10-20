package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44073a;
    public final String f44074b;
    public final String f44075c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4061a = null;
        a2.f4068k = null;
        this.f44073a = new b2.w(a2);
        this.f44074b = str;
        this.f44075c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44073a, wVar.f44073a) && Objects.equals(this.f44074b, wVar.f44074b) && Objects.equals(this.f44075c, wVar.f44075c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44073a, this.f44074b, this.f44075c);
    }
}
