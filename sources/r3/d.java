package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f44916a;
    public final int f44917b;

    public d(float f7, int i10) {
        this.f44916a = f7;
        this.f44917b = i10;
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
            if (this.f44916a == dVar.f44916a && this.f44917b == dVar.f44917b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f44916a).hashCode() + 527) * 31) + this.f44917b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f44916a + ", svcTemporalLayerCount=" + this.f44917b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
