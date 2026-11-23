package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f58517a;
    public final int f58518b;

    public c(float f10, int i7) {
        this.f58517a = f10;
        this.f58518b = i7;
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
            if (this.f58517a == cVar.f58517a && this.f58518b == cVar.f58518b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f58517a).hashCode() + 527) * 31) + this.f58518b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f58517a + ", svcTemporalLayerCount=" + this.f58518b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
