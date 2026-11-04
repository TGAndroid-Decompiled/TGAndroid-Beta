package x3;

import d2.p0;
import d2.r0;
import d2.v;
import j$.util.Objects;
public final class f implements r0 {
    public final float f58205a;
    public final e f58206b;
    public final e f58207c;

    public f(float f10, e eVar, e eVar2) {
        this.f58205a = f10;
        this.f58206b = eVar;
        this.f58207c = eVar2;
    }

    @Override
    public final v b() {
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
        if (Float.compare(this.f58205a, fVar.f58205a) != 0 || !Objects.equals(this.f58206b, fVar.f58206b) || !Objects.equals(this.f58207c, fVar.f58207c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i3;
        int floatToIntBits = Float.floatToIntBits(this.f58205a) * 31;
        int i10 = 0;
        e eVar = this.f58206b;
        if (eVar != null) {
            i3 = eVar.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (floatToIntBits + i3) * 31;
        e eVar2 = this.f58207c;
        if (eVar2 != null) {
            i10 = eVar2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f58205a + ", field 1=" + this.f58206b + ", field 2=" + this.f58207c;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
