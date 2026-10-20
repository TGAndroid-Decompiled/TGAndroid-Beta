package r3;

import b2.q0;
import b2.s0;
import b2.w;
public final class c implements s0 {
    public final float f44993a;
    public final int f44994b;

    public c(float f7, int i10) {
        this.f44993a = f7;
        this.f44994b = i10;
    }

    @Override
    public final w a() {
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
            if (this.f44993a == cVar.f44993a && this.f44994b == cVar.f44994b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f44993a).hashCode() + 527) * 31) + this.f44994b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f44993a + ", svcTemporalLayerCount=" + this.f44994b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
