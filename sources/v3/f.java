package v3;

import b2.q0;
import b2.s0;
import b2.w;
import j$.util.Objects;
public final class f implements s0 {
    public final float f47943a;
    public final e f47944b;
    public final e f47945c;

    public f(float f7, e eVar, e eVar2) {
        this.f47943a = f7;
        this.f47944b = eVar;
        this.f47945c = eVar2;
    }

    @Override
    public final w a() {
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
        if (Float.compare(this.f47943a, fVar.f47943a) != 0 || !Objects.equals(this.f47944b, fVar.f47944b) || !Objects.equals(this.f47945c, fVar.f47945c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f47943a) * 31;
        int i11 = 0;
        e eVar = this.f47944b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f47945c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f47943a + ", field 1=" + this.f47944b + ", field 2=" + this.f47945c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
