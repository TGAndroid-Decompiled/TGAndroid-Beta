package r3;

import b2.q0;
import b2.s0;
import b2.w;
public final class c implements s0 {
    public final float f45011a;
    public final int f45012b;

    public c(float f7, int i10) {
        this.f45011a = f7;
        this.f45012b = i10;
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
            if (this.f45011a == cVar.f45011a && this.f45012b == cVar.f45012b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f45011a).hashCode() + 527) * 31) + this.f45012b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f45011a + ", svcTemporalLayerCount=" + this.f45012b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
