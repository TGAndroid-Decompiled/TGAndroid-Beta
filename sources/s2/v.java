package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f56328a;
    public final String f56329b;
    public final String f56330c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10384a = null;
        a10.f10392k = null;
        this.f56328a = new e2.u(a10);
        this.f56329b = str;
        this.f56330c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f56328a, vVar.f56328a) && Objects.equals(this.f56329b, vVar.f56329b) && Objects.equals(this.f56330c, vVar.f56330c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f56328a, this.f56329b, this.f56330c);
    }
}
