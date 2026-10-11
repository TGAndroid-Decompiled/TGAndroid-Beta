package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f47076a;
    public final int f47077b;

    public d(float f7, int i10) {
        this.f47076a = f7;
        this.f47077b = i10;
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
            if (this.f47076a == dVar.f47076a && this.f47077b == dVar.f47077b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f47076a).hashCode() + 527) * 31) + this.f47077b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f47076a + ", svcTemporalLayerCount=" + this.f47077b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
