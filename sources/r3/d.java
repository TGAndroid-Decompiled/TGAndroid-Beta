package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f45787a;
    public final int f45788b;

    public d(float f7, int i10) {
        this.f45787a = f7;
        this.f45788b = i10;
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
            if (this.f45787a == dVar.f45787a && this.f45788b == dVar.f45788b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f45787a).hashCode() + 527) * 31) + this.f45788b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f45787a + ", svcTemporalLayerCount=" + this.f45788b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
