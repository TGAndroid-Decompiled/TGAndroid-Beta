package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f47042a;
    public final int f47043b;

    public d(float f7, int i10) {
        this.f47042a = f7;
        this.f47043b = i10;
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
            if (this.f47042a == dVar.f47042a && this.f47043b == dVar.f47043b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f47042a).hashCode() + 527) * 31) + this.f47043b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f47042a + ", svcTemporalLayerCount=" + this.f47043b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
