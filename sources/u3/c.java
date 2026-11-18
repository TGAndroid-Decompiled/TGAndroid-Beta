package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f58391a;
    public final int f58392b;

    public c(float f10, int i7) {
        this.f58391a = f10;
        this.f58392b = i7;
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
            if (this.f58391a == cVar.f58391a && this.f58392b == cVar.f58392b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f58391a).hashCode() + 527) * 31) + this.f58392b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f58391a + ", svcTemporalLayerCount=" + this.f58392b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
