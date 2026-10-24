package v3;

import b2.q0;
import b2.s0;
import b2.w;
import j$.util.Objects;
public final class f implements s0 {
    public final float f48384a;
    public final e f48385b;
    public final e f48386c;

    public f(float f7, e eVar, e eVar2) {
        this.f48384a = f7;
        this.f48385b = eVar;
        this.f48386c = eVar2;
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
        if (Float.compare(this.f48384a, fVar.f48384a) != 0 || !Objects.equals(this.f48385b, fVar.f48385b) || !Objects.equals(this.f48386c, fVar.f48386c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f48384a) * 31;
        int i11 = 0;
        e eVar = this.f48385b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f48386c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f48384a + ", field 1=" + this.f48385b + ", field 2=" + this.f48386c;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
