package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f41968a;
    public final int f41969b;

    public d(float f7, int i10) {
        this.f41968a = f7;
        this.f41969b = i10;
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
            if (this.f41968a == dVar.f41968a && this.f41969b == dVar.f41969b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f41968a).hashCode() + 527) * 31) + this.f41969b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f41968a + ", svcTemporalLayerCount=" + this.f41969b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
