package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f46988a;
    public final long f46989b;
    public final long f46990c;
    public final long d;
    public final long f46991e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f46988a = j3;
        this.f46989b = j10;
        this.f46990c = j11;
        this.d = j12;
        this.f46991e = j13;
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
            if (this.f46988a == aVar.f46988a && this.f46989b == aVar.f46989b && this.f46990c == aVar.f46990c && this.d == aVar.d && this.f46991e == aVar.f46991e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f46989b);
        int b11 = w7.b(this.f46990c);
        int b12 = w7.b(this.d);
        return w7.b(this.f46991e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f46988a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f46988a + ", photoSize=" + this.f46989b + ", photoPresentationTimestampUs=" + this.f46990c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f46991e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
