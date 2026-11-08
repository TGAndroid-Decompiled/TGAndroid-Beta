package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54763a;
    public final String f54764b;
    public final String f54765c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10548a = null;
        a10.f10556k = null;
        this.f54763a = new e2.u(a10);
        this.f54764b = str;
        this.f54765c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54763a, vVar.f54763a) && Objects.equals(this.f54764b, vVar.f54764b) && Objects.equals(this.f54765c, vVar.f54765c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54763a, this.f54764b, this.f54765c);
    }
}
