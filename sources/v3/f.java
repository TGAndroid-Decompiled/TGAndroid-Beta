package v3;

import b2.r0;
import b2.t0;
import b2.x;
import j$.util.Objects;
public final class f implements t0 {
    public final float f50058a;
    public final e f50059b;
    public final e f50060c;

    public f(float f7, e eVar, e eVar2) {
        this.f50058a = f7;
        this.f50059b = eVar;
        this.f50060c = eVar2;
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
        if (Float.compare(this.f50058a, fVar.f50058a) != 0 || !Objects.equals(this.f50059b, fVar.f50059b) || !Objects.equals(this.f50060c, fVar.f50060c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int floatToIntBits = Float.floatToIntBits(this.f50058a) * 31;
        int i11 = 0;
        e eVar = this.f50059b;
        if (eVar != null) {
            i10 = eVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (floatToIntBits + i10) * 31;
        e eVar2 = this.f50060c;
        if (eVar2 != null) {
            i11 = eVar2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f50058a + ", field 1=" + this.f50059b + ", field 2=" + this.f50060c;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
