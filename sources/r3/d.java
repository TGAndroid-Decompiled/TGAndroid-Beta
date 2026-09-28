package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f42301a;
    public final int f42302b;

    public d(float f7, int i10) {
        this.f42301a = f7;
        this.f42302b = i10;
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
            if (this.f42301a == dVar.f42301a && this.f42302b == dVar.f42302b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f42301a).hashCode() + 527) * 31) + this.f42302b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f42301a + ", svcTemporalLayerCount=" + this.f42302b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
