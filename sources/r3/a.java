package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f41228a;
    public final long f41229b;
    public final long f41230c;
    public final long d;
    public final long e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f41228a = j3;
        this.f41229b = j10;
        this.f41230c = j11;
        this.d = j12;
        this.e = j13;
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
            if (this.f41228a == aVar.f41228a && this.f41229b == aVar.f41229b && this.f41230c == aVar.f41230c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f41229b);
        int b11 = z7.b(this.f41230c);
        int b12 = z7.b(this.d);
        return z7.b(this.e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f41228a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f41228a + ", photoSize=" + this.f41229b + ", photoPresentationTimestampUs=" + this.f41230c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
