package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f58433a;
    public final int f58434b;

    public c(float f10, int i7) {
        this.f58433a = f10;
        this.f58434b = i7;
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
            if (this.f58433a == cVar.f58433a && this.f58434b == cVar.f58434b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f58433a).hashCode() + 527) * 31) + this.f58434b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f58433a + ", svcTemporalLayerCount=" + this.f58434b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
