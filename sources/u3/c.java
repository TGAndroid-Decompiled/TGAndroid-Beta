package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f58437a;
    public final int f58438b;

    public c(float f10, int i7) {
        this.f58437a = f10;
        this.f58438b = i7;
    }

    @Override
    public final u a() {
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
            if (this.f58437a == cVar.f58437a && this.f58438b == cVar.f58438b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f58437a).hashCode() + 527) * 31) + this.f58438b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f58437a + ", svcTemporalLayerCount=" + this.f58438b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
