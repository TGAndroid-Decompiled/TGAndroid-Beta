package r3;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final float f47311a;
    public final int f47312b;

    public c(float f7, int i10) {
        this.f47311a = f7;
        this.f47312b = i10;
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
            if (this.f47311a == cVar.f47311a && this.f47312b == cVar.f47312b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f47311a).hashCode() + 527) * 31) + this.f47312b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f47311a + ", svcTemporalLayerCount=" + this.f47312b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
