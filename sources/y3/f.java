package y3;

import e2.n0;
import e2.p0;
import e2.u;
import j$.util.Objects;
public final class f implements p0 {
    public final float f60783a;
    public final e f60784b;
    public final e f60785c;

    public f(float f10, e eVar, e eVar2) {
        this.f60783a = f10;
        this.f60784b = eVar;
        this.f60785c = eVar2;
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
        if (Float.compare(this.f60783a, fVar.f60783a) != 0 || !Objects.equals(this.f60784b, fVar.f60784b) || !Objects.equals(this.f60785c, fVar.f60785c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int floatToIntBits = Float.floatToIntBits(this.f60783a) * 31;
        int i10 = 0;
        e eVar = this.f60784b;
        if (eVar != null) {
            i7 = eVar.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (floatToIntBits + i7) * 31;
        e eVar2 = this.f60785c;
        if (eVar2 != null) {
            i10 = eVar2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f60783a + ", field 1=" + this.f60784b + ", field 2=" + this.f60785c;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
