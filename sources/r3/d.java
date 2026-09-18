package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f42271a;
    public final int f42272b;

    public d(float f7, int i10) {
        this.f42271a = f7;
        this.f42272b = i10;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f42271a == dVar.f42271a && this.f42272b == dVar.f42272b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f42271a).hashCode() + 527) * 31) + this.f42272b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f42271a + ", svcTemporalLayerCount=" + this.f42272b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
