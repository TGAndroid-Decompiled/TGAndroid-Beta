package r3;

import b2.q0;
import b2.s0;
import b2.w;
public final class c implements s0 {
    public final float f45408a;
    public final int f45409b;

    public c(float f7, int i10) {
        this.f45408a = f7;
        this.f45409b = i10;
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
            if (this.f45408a == cVar.f45408a && this.f45409b == cVar.f45409b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f45408a).hashCode() + 527) * 31) + this.f45409b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f45408a + ", svcTemporalLayerCount=" + this.f45409b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
