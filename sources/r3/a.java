package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f47068a;
    public final long f47069b;
    public final long f47070c;
    public final long d;
    public final long f47071e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f47068a = j3;
        this.f47069b = j10;
        this.f47070c = j11;
        this.d = j12;
        this.f47071e = j13;
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
            if (this.f47068a == aVar.f47068a && this.f47069b == aVar.f47069b && this.f47070c == aVar.f47070c && this.d == aVar.d && this.f47071e == aVar.f47071e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f47069b);
        int b11 = w7.b(this.f47070c);
        int b12 = w7.b(this.d);
        return w7.b(this.f47071e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f47068a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f47068a + ", photoSize=" + this.f47069b + ", photoPresentationTimestampUs=" + this.f47070c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f47071e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
