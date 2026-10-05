package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f45794a;
    public final long f45795b;
    public final long f45796c;
    public final long d;
    public final long f45797e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f45794a = j3;
        this.f45795b = j10;
        this.f45796c = j11;
        this.d = j12;
        this.f45797e = j13;
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
            if (this.f45794a == aVar.f45794a && this.f45795b == aVar.f45795b && this.f45796c == aVar.f45796c && this.d == aVar.d && this.f45797e == aVar.f45797e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f45795b);
        int b11 = z7.b(this.f45796c);
        int b12 = z7.b(this.d);
        return z7.b(this.f45797e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f45794a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f45794a + ", photoSize=" + this.f45795b + ", photoPresentationTimestampUs=" + this.f45796c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f45797e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
