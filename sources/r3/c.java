package r3;

import b2.r0;
import b2.t0;
import b2.x;
public final class c implements t0 {
    public final float f43655a;
    public final int f43656b;

    public c(float f7, int i10) {
        this.f43655a = f7;
        this.f43656b = i10;
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
            if (this.f43655a == cVar.f43655a && this.f43656b == cVar.f43656b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f43655a).hashCode() + 527) * 31) + this.f43656b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f43655a + ", svcTemporalLayerCount=" + this.f43656b;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
