package r3;

import b2.q0;
import b2.s0;
import b2.w;
public final class c implements s0 {
    public final float f44983a;
    public final int f44984b;

    public c(float f7, int i10) {
        this.f44983a = f7;
        this.f44984b = i10;
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
            if (this.f44983a == cVar.f44983a && this.f44984b == cVar.f44984b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f44983a).hashCode() + 527) * 31) + this.f44984b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f44983a + ", svcTemporalLayerCount=" + this.f44984b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
