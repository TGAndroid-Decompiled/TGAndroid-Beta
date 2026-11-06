package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54646a;
    public final String f54647b;
    public final String f54648c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10548a = null;
        a10.f10556k = null;
        this.f54646a = new e2.u(a10);
        this.f54647b = str;
        this.f54648c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54646a, vVar.f54646a) && Objects.equals(this.f54647b, vVar.f54647b) && Objects.equals(this.f54648c, vVar.f54648c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54646a, this.f54647b, this.f54648c);
    }
}
