package r3;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final float f47273a;
    public final int f47274b;

    public c(float f7, int i10) {
        this.f47273a = f7;
        this.f47274b = i10;
    }

    @Override
    public final x a() {
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
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f47273a == cVar.f47273a && this.f47274b == cVar.f47274b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f47273a).hashCode() + 527) * 31) + this.f47274b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f47273a + ", svcTemporalLayerCount=" + this.f47274b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
