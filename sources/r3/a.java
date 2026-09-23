package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f41961a;
    public final long f41962b;
    public final long f41963c;
    public final long d;
    public final long e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f41961a = j3;
        this.f41962b = j10;
        this.f41963c = j11;
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
            if (this.f41961a == aVar.f41961a && this.f41962b == aVar.f41962b && this.f41963c == aVar.f41963c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f41962b);
        int b11 = z7.b(this.f41963c);
        int b12 = z7.b(this.d);
        return z7.b(this.e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f41961a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f41961a + ", photoSize=" + this.f41962b + ", photoPresentationTimestampUs=" + this.f41963c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
