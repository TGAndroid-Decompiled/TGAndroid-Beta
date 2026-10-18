package r3;

import b2.q0;
import b2.s0;
import b2.w;
public final class c implements s0 {
    public final float f44985a;
    public final int f44986b;

    public c(float f7, int i10) {
        this.f44985a = f7;
        this.f44986b = i10;
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
            if (this.f44985a == cVar.f44985a && this.f44986b == cVar.f44986b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f44985a).hashCode() + 527) * 31) + this.f44986b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f44985a + ", svcTemporalLayerCount=" + this.f44986b;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
