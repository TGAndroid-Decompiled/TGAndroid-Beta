package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f47158a;
    public final long f47159b;
    public final long f47160c;
    public final long d;
    public final long f47161e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f47158a = j3;
        this.f47159b = j10;
        this.f47160c = j11;
        this.d = j12;
        this.f47161e = j13;
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
            if (this.f47158a == aVar.f47158a && this.f47159b == aVar.f47159b && this.f47160c == aVar.f47160c && this.d == aVar.d && this.f47161e == aVar.f47161e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f47159b);
        int b11 = w7.b(this.f47160c);
        int b12 = w7.b(this.d);
        return w7.b(this.f47161e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f47158a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f47158a + ", photoSize=" + this.f47159b + ", photoPresentationTimestampUs=" + this.f47160c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f47161e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
