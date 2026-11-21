package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f56943a;
    public final String f56944b;
    public final String f56945c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10728a = null;
        a10.f10736k = null;
        this.f56943a = new e2.u(a10);
        this.f56944b = str;
        this.f56945c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f56943a, vVar.f56943a) && Objects.equals(this.f56944b, vVar.f56944b) && Objects.equals(this.f56945c, vVar.f56945c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f56943a, this.f56944b, this.f56945c);
    }
}
