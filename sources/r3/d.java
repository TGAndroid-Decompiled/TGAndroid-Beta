package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f45795a;
    public final int f45796b;

    public d(float f7, int i10) {
        this.f45795a = f7;
        this.f45796b = i10;
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
            if (this.f45795a == dVar.f45795a && this.f45796b == dVar.f45796b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f45795a).hashCode() + 527) * 31) + this.f45796b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f45795a + ", svcTemporalLayerCount=" + this.f45796b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
