package v3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
public final class f implements t0 {
    public final float f46550a;
    public final e f46551b;
    public final e f46552c;

    public f(float f7, e eVar, e eVar2) {
        this.f46550a = f7;
        this.f46551b = eVar;
        this.f46552c = eVar2;
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
        if (Float.compare(this.f46550a, fVar.f46550a) != 0 || !Objects.equals(this.f46551b, fVar.f46551b) || !Objects.equals(this.f46552c, fVar.f46552c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f46550a) * 31;
        int i11 = 0;
        e eVar = this.f46551b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f46552c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f46550a + ", field 1=" + this.f46551b + ", field 2=" + this.f46552c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
