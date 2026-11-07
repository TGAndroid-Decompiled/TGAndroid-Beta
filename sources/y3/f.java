package y3;

import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class f implements p0 {
    public final float f58862a;
    public final e f58863b;
    public final e f58864c;

    public f(float f10, e eVar, e eVar2) {
        this.f58862a = f10;
        this.f58863b = eVar;
        this.f58864c = eVar2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(this.f58862a, fVar.f58862a) != 0 || !Objects.equals(this.f58863b, fVar.f58863b) || !Objects.equals(this.f58864c, fVar.f58864c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int floatToIntBits = Float.floatToIntBits(this.f58862a) * 31;
        int i10 = 0;
        e eVar = this.f58863b;
        if (eVar != null) {
            i7 = eVar.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (floatToIntBits + i7) * 31;
        e eVar2 = this.f58864c;
        if (eVar2 != null) {
            i10 = eVar2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f58862a + ", field 1=" + this.f58863b + ", field 2=" + this.f58864c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
