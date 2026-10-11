package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f47034a;
    public final long f47035b;
    public final long f47036c;
    public final long d;
    public final long f47037e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f47034a = j3;
        this.f47035b = j10;
        this.f47036c = j11;
        this.d = j12;
        this.f47037e = j13;
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
            if (this.f47034a == aVar.f47034a && this.f47035b == aVar.f47035b && this.f47036c == aVar.f47036c && this.d == aVar.d && this.f47037e == aVar.f47037e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f47035b);
        int b11 = w7.b(this.f47036c);
        int b12 = w7.b(this.d);
        return w7.b(this.f47037e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f47034a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f47034a + ", photoSize=" + this.f47035b + ", photoPresentationTimestampUs=" + this.f47036c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f47037e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
