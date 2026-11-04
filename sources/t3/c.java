package t3;

import d2.p0;
import d2.r0;
import d2.v;
public final class c implements r0 {
    public final float f54906a;
    public final int f54907b;

    public c(float f10, int i3) {
        this.f54906a = f10;
        this.f54907b = i3;
    }

    @Override
    public final v b() {
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
            if (this.f54906a == cVar.f54906a && this.f54907b == cVar.f54907b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f54906a).hashCode() + 527) * 31) + this.f54907b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f54906a + ", svcTemporalLayerCount=" + this.f54907b;
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
