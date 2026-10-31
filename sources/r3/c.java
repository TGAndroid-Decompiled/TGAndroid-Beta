package r3;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final float f46295a;
    public final int f46296b;

    public c(float f7, int i10) {
        this.f46295a = f7;
        this.f46296b = i10;
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
            if (this.f46295a == cVar.f46295a && this.f46296b == cVar.f46296b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f46295a).hashCode() + 527) * 31) + this.f46296b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f46295a + ", svcTemporalLayerCount=" + this.f46296b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
