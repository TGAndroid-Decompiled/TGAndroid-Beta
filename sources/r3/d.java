package r3;

import b2.m0;
import b2.o0;
import b2.s;
public final class d implements o0 {
    public final float f41235a;
    public final int f41236b;

    public d(float f7, int i10) {
        this.f41235a = f7;
        this.f41236b = i10;
    }

    @Override
    public final s a() {
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41235a == dVar.f41235a && this.f41236b == dVar.f41236b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f41235a).hashCode() + 527) * 31) + this.f41236b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f41235a + ", svcTemporalLayerCount=" + this.f41236b;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
