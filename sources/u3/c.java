package u3;

import e2.n0;
import e2.p0;
import e2.u;
public final class c implements p0 {
    public final float f58402a;
    public final int f58403b;

    public c(float f10, int i7) {
        this.f58402a = f10;
        this.f58403b = i7;
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
            if (this.f58402a == cVar.f58402a && this.f58403b == cVar.f58403b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f58402a).hashCode() + 527) * 31) + this.f58403b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f58402a + ", svcTemporalLayerCount=" + this.f58403b;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
