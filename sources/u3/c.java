package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f56314a;
    public final int f56315b;

    public c(float f10, int i7) {
        this.f56314a = f10;
        this.f56315b = i7;
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
            if (this.f56314a == cVar.f56314a && this.f56315b == cVar.f56315b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f56314a).hashCode() + 527) * 31) + this.f56315b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f56314a + ", svcTemporalLayerCount=" + this.f56315b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
