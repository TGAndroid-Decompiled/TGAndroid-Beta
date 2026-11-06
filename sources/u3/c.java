package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f56200a;
    public final int f56201b;

    public c(float f10, int i7) {
        this.f56200a = f10;
        this.f56201b = i7;
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
            if (this.f56200a == cVar.f56200a && this.f56201b == cVar.f56201b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f56200a).hashCode() + 527) * 31) + this.f56201b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f56200a + ", svcTemporalLayerCount=" + this.f56201b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
