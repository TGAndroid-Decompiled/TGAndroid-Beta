package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.y7;
public final class a implements o0 {
    public final long f44907a;
    public final long f44908b;
    public final long f44909c;
    public final long d;
    public final long f44910e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f44907a = j3;
        this.f44908b = j10;
        this.f44909c = j11;
        this.d = j12;
        this.f44910e = j13;
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f44907a == aVar.f44907a && this.f44908b == aVar.f44908b && this.f44909c == aVar.f44909c && this.d == aVar.d && this.f44910e == aVar.f44910e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = y7.b(this.f44908b);
        int b11 = y7.b(this.f44909c);
        int b12 = y7.b(this.d);
        return y7.b(this.f44910e) + ((b12 + ((b11 + ((b10 + ((y7.b(this.f44907a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f44907a + ", photoSize=" + this.f44908b + ", photoPresentationTimestampUs=" + this.f44909c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f44910e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
