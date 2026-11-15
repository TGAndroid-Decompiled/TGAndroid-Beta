package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f57824a;
    public final int f57825b;

    public c(float f10, int i7) {
        this.f57824a = f10;
        this.f57825b = i7;
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
            if (this.f57824a == cVar.f57824a && this.f57825b == cVar.f57825b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f57824a).hashCode() + 527) * 31) + this.f57825b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f57824a + ", svcTemporalLayerCount=" + this.f57825b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
