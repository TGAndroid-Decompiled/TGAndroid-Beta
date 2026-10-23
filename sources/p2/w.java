package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44492a;
    public final String f44493b;
    public final String f44494c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4068a = null;
        a2.f4075k = null;
        this.f44492a = new b2.w(a2);
        this.f44493b = str;
        this.f44494c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44492a, wVar.f44492a) && Objects.equals(this.f44493b, wVar.f44493b) && Objects.equals(this.f44494c, wVar.f44494c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44492a, this.f44493b, this.f44494c);
    }
}
