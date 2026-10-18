package p2;

import j$.util.Objects;
public final class w {
    public final b2.w f44111a;
    public final String f44112b;
    public final String f44113c;

    public w(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4065a = null;
        a2.f4072k = null;
        this.f44111a = new b2.w(a2);
        this.f44112b = str;
        this.f44113c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Objects.equals(this.f44111a, wVar.f44111a) && Objects.equals(this.f44112b, wVar.f44112b) && Objects.equals(this.f44113c, wVar.f44113c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44111a, this.f44112b, this.f44113c);
    }
}
