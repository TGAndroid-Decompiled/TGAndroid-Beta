package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f56313a;
    public final int f56314b;

    public c(float f10, int i7) {
        this.f56313a = f10;
        this.f56314b = i7;
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
            if (this.f56313a == cVar.f56313a && this.f56314b == cVar.f56314b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f56313a).hashCode() + 527) * 31) + this.f56314b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f56313a + ", svcTemporalLayerCount=" + this.f56314b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
