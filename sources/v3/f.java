package v3;

import b2.q0;
import b2.s0;
import b2.w;
import j$.util.Objects;
public final class f implements s0 {
    public final float f47958a;
    public final e f47959b;
    public final e f47960c;

    public f(float f7, e eVar, e eVar2) {
        this.f47958a = f7;
        this.f47959b = eVar;
        this.f47960c = eVar2;
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
        if (Float.compare(this.f47958a, fVar.f47958a) != 0 || !Objects.equals(this.f47959b, fVar.f47959b) || !Objects.equals(this.f47960c, fVar.f47960c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f47958a) * 31;
        int i11 = 0;
        e eVar = this.f47959b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f47960c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f47958a + ", field 1=" + this.f47959b + ", field 2=" + this.f47960c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
