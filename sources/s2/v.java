package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54762a;
    public final String f54763b;
    public final String f54764c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10548a = null;
        a10.f10556k = null;
        this.f54762a = new e2.u(a10);
        this.f54763b = str;
        this.f54764c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54762a, vVar.f54762a) && Objects.equals(this.f54763b, vVar.f54763b) && Objects.equals(this.f54764c, vVar.f54764c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54762a, this.f54763b, this.f54764c);
    }
}
