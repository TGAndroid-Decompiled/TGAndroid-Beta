package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54671a;
    public final String f54672b;
    public final String f54673c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10548a = null;
        a10.f10556k = null;
        this.f54671a = new e2.u(a10);
        this.f54672b = str;
        this.f54673c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54671a, vVar.f54671a) && Objects.equals(this.f54672b, vVar.f54672b) && Objects.equals(this.f54673c, vVar.f54673c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54671a, this.f54672b, this.f54673c);
    }
}
