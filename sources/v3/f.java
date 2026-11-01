package v3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
public final class f implements t0 {
    public final float f50372a;
    public final e f50373b;
    public final e f50374c;

    public f(float f7, e eVar, e eVar2) {
        this.f50372a = f7;
        this.f50373b = eVar;
        this.f50374c = eVar2;
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
        if (Float.compare(this.f50372a, fVar.f50372a) != 0 || !Objects.equals(this.f50373b, fVar.f50373b) || !Objects.equals(this.f50374c, fVar.f50374c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f50372a) * 31;
        int i11 = 0;
        e eVar = this.f50373b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f50374c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f50372a + ", field 1=" + this.f50373b + ", field 2=" + this.f50374c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
