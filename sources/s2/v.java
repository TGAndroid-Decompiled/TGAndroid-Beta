package s2;

import j$.util.Objects;
public final class v {
    public final e2.u f56902a;
    public final String f56903b;
    public final String f56904c;

    public v(e2.u uVar, String str, String str2) {
        e2.t a10 = uVar.a();
        a10.f10699a = null;
        a10.f10707k = null;
        this.f56902a = new e2.u(a10);
        this.f56903b = str;
        this.f56904c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Objects.equals(this.f56902a, vVar.f56902a) && Objects.equals(this.f56903b, vVar.f56903b) && Objects.equals(this.f56904c, vVar.f56904c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f56902a, this.f56903b, this.f56904c);
    }
}
