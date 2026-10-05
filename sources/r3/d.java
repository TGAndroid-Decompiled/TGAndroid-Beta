package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f45802a;
    public final int f45803b;

    public d(float f7, int i10) {
        this.f45802a = f7;
        this.f45803b = i10;
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
            if (this.f45802a == dVar.f45802a && this.f45803b == dVar.f45803b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f45802a).hashCode() + 527) * 31) + this.f45803b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f45802a + ", svcTemporalLayerCount=" + this.f45803b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
