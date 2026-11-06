package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54670a;
    public final String f54671b;
    public final String f54672c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10548a = null;
        a10.f10556k = null;
        this.f54670a = new e2.u(a10);
        this.f54671b = str;
        this.f54672c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54670a, vVar.f54670a) && Objects.equals(this.f54671b, vVar.f54671b) && Objects.equals(this.f54672c, vVar.f54672c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54670a, this.f54671b, this.f54672c);
    }
}
