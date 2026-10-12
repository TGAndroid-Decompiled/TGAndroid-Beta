package r3;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final float f43896a;
    public final int f43897b;

    public c(float f7, int i10) {
        this.f43896a = f7;
        this.f43897b = i10;
    }

    @Override
    public final x a() {
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
            if (this.f43896a == cVar.f43896a && this.f43897b == cVar.f43897b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f43896a).hashCode() + 527) * 31) + this.f43897b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f43896a + ", svcTemporalLayerCount=" + this.f43897b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
