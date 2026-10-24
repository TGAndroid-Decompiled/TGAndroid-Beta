package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44491a;
    public final String f44492b;
    public final String f44493c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4068a = null;
        a2.f4075k = null;
        this.f44491a = new b2.w(a2);
        this.f44492b = str;
        this.f44493c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44491a, wVar.f44491a) && Objects.equals(this.f44492b, wVar.f44492b) && Objects.equals(this.f44493c, wVar.f44493c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44491a, this.f44492b, this.f44493c);
    }
}
