package v3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
public final class f implements t0 {
    public final float f50093a;
    public final e f50094b;
    public final e f50095c;

    public f(float f7, e eVar, e eVar2) {
        this.f50093a = f7;
        this.f50094b = eVar;
        this.f50095c = eVar2;
    }

    @Override
    public final x a() {
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
        if (Float.compare(this.f50093a, fVar.f50093a) != 0 || !Objects.equals(this.f50094b, fVar.f50094b) || !Objects.equals(this.f50095c, fVar.f50095c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f50093a) * 31;
        int i11 = 0;
        e eVar = this.f50094b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f50095c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f50093a + ", field 1=" + this.f50094b + ", field 2=" + this.f50095c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
