package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f47166a;
    public final int f47167b;

    public d(float f7, int i10) {
        this.f47166a = f7;
        this.f47167b = i10;
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
            if (this.f47166a == dVar.f47166a && this.f47167b == dVar.f47167b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f47166a).hashCode() + 527) * 31) + this.f47167b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f47166a + ", svcTemporalLayerCount=" + this.f47167b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
