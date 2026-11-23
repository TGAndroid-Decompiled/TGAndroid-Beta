package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f56912a;
    public final String f56913b;
    public final String f56914c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10694a = null;
        a10.f10702k = null;
        this.f56912a = new e2.u(a10);
        this.f56913b = str;
        this.f56914c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f56912a, vVar.f56912a) && Objects.equals(this.f56913b, vVar.f56913b) && Objects.equals(this.f56914c, vVar.f56914c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f56912a, this.f56913b, this.f56914c);
    }
}
