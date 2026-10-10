package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f46996a;
    public final int f46997b;

    public d(float f7, int i10) {
        this.f46996a = f7;
        this.f46997b = i10;
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
            if (this.f46996a == dVar.f46996a && this.f46997b == dVar.f46997b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f46996a).hashCode() + 527) * 31) + this.f46997b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f46996a + ", svcTemporalLayerCount=" + this.f46997b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
