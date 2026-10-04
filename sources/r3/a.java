package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f45779a;
    public final long f45780b;
    public final long f45781c;
    public final long d;
    public final long f45782e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f45779a = j3;
        this.f45780b = j10;
        this.f45781c = j11;
        this.d = j12;
        this.f45782e = j13;
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
            if (this.f45779a == aVar.f45779a && this.f45780b == aVar.f45780b && this.f45781c == aVar.f45781c && this.d == aVar.d && this.f45782e == aVar.f45782e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f45780b);
        int b11 = z7.b(this.f45781c);
        int b12 = z7.b(this.d);
        return z7.b(this.f45782e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f45779a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f45779a + ", photoSize=" + this.f45780b + ", photoPresentationTimestampUs=" + this.f45781c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f45782e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
