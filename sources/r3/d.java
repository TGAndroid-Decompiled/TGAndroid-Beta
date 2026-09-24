package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f42287a;
    public final int f42288b;

    public d(float f7, int i10) {
        this.f42287a = f7;
        this.f42288b = i10;
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
            if (this.f42287a == dVar.f42287a && this.f42288b == dVar.f42288b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f42287a).hashCode() + 527) * 31) + this.f42288b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f42287a + ", svcTemporalLayerCount=" + this.f42288b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
