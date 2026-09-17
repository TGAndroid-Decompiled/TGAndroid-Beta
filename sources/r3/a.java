package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.y7;
public final class a implements o0 {
    public final long f44908a;
    public final long f44909b;
    public final long f44910c;
    public final long d;
    public final long f44911e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f44908a = j3;
        this.f44909b = j10;
        this.f44910c = j11;
        this.d = j12;
        this.f44911e = j13;
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
            if (this.f44908a == aVar.f44908a && this.f44909b == aVar.f44909b && this.f44910c == aVar.f44910c && this.d == aVar.d && this.f44911e == aVar.f44911e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = y7.b(this.f44909b);
        int b11 = y7.b(this.f44910c);
        int b12 = y7.b(this.d);
        return y7.b(this.f44911e) + ((b12 + ((b11 + ((b10 + ((y7.b(this.f44908a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f44908a + ", photoSize=" + this.f44909b + ", photoPresentationTimestampUs=" + this.f44910c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f44911e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
