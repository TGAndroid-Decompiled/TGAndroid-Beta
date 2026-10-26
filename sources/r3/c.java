package r3;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final float f47276a;
    public final int f47277b;

    public c(float f7, int i10) {
        this.f47276a = f7;
        this.f47277b = i10;
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
            if (this.f47276a == cVar.f47276a && this.f47277b == cVar.f47277b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f47276a).hashCode() + 527) * 31) + this.f47277b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f47276a + ", svcTemporalLayerCount=" + this.f47277b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
