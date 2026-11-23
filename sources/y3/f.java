package y3;

import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class f implements p0 {
    public final float f60748a;
    public final e f60749b;
    public final e f60750c;

    public f(float f10, e eVar, e eVar2) {
        this.f60748a = f10;
        this.f60749b = eVar;
        this.f60750c = eVar2;
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
        if (Float.compare(this.f60748a, fVar.f60748a) != 0 || !Objects.equals(this.f60749b, fVar.f60749b) || !Objects.equals(this.f60750c, fVar.f60750c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int floatToIntBits = Float.floatToIntBits(this.f60748a) * 31;
        int i10 = 0;
        e eVar = this.f60749b;
        if (eVar != null) {
            i7 = eVar.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (floatToIntBits + i7) * 31;
        e eVar2 = this.f60750c;
        if (eVar2 != null) {
            i10 = eVar2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f60748a + ", field 1=" + this.f60749b + ", field 2=" + this.f60750c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
