package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f45787a;
    public final long f45788b;
    public final long f45789c;
    public final long d;
    public final long f45790e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f45787a = j3;
        this.f45788b = j10;
        this.f45789c = j11;
        this.d = j12;
        this.f45790e = j13;
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
            if (this.f45787a == aVar.f45787a && this.f45788b == aVar.f45788b && this.f45789c == aVar.f45789c && this.d == aVar.d && this.f45790e == aVar.f45790e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f45788b);
        int b11 = z7.b(this.f45789c);
        int b12 = z7.b(this.d);
        return z7.b(this.f45790e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f45787a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f45787a + ", photoSize=" + this.f45788b + ", photoPresentationTimestampUs=" + this.f45789c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f45790e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
