package p2;

import j$.util.Objects;
public final class v {
    public final b2.w f44068a;
    public final String f44069b;
    public final String f44070c;

    public v(b2.w wVar, String str, String str2) {
        b2.v a2 = wVar.a();
        a2.f4065a = null;
        a2.f4072k = null;
        this.f44068a = new b2.w(a2);
        this.f44069b = str;
        this.f44070c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f44068a, vVar.f44068a) && Objects.equals(this.f44069b, vVar.f44069b) && Objects.equals(this.f44070c, vVar.f44070c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f44068a, this.f44069b, this.f44070c);
    }
}
