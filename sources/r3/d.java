package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f42303a;
    public final int f42304b;

    public d(float f7, int i10) {
        this.f42303a = f7;
        this.f42304b = i10;
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
            if (this.f42303a == dVar.f42303a && this.f42304b == dVar.f42304b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f42303a).hashCode() + 527) * 31) + this.f42304b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f42303a + ", svcTemporalLayerCount=" + this.f42304b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
