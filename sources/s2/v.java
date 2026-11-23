package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f56947a;
    public final String f56948b;
    public final String f56949c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10731a = null;
        a10.f10739k = null;
        this.f56947a = new e2.u(a10);
        this.f56948b = str;
        this.f56949c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f56947a, vVar.f56947a) && Objects.equals(this.f56948b, vVar.f56948b) && Objects.equals(this.f56949c, vVar.f56949c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f56947a, this.f56948b, this.f56949c);
    }
}
