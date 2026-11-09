package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f54775a;
    public final String f54776b;
    public final String f54777c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10548a = null;
        a10.f10556k = null;
        this.f54775a = new e2.u(a10);
        this.f54776b = str;
        this.f54777c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f54775a, vVar.f54775a) && Objects.equals(this.f54776b, vVar.f54776b) && Objects.equals(this.f54777c, vVar.f54777c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54775a, this.f54776b, this.f54777c);
    }
}
