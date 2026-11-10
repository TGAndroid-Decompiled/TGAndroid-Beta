package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54774a;
    public final String f54775b;
    public final String f54776c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10553a = null;
        a10.f10561k = null;
        this.f54774a = new e2.u(a10);
        this.f54775b = str;
        this.f54776c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54774a, vVar.f54774a) && Objects.equals(this.f54775b, vVar.f54775b) && Objects.equals(this.f54776c, vVar.f54776c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54774a, this.f54775b, this.f54776c);
    }
}
