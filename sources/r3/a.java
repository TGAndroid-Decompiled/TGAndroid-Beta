package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f46944a;
    public final long f46945b;
    public final long f46946c;
    public final long d;
    public final long f46947e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f46944a = j3;
        this.f46945b = j10;
        this.f46946c = j11;
        this.d = j12;
        this.f46947e = j13;
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
            if (this.f46944a == aVar.f46944a && this.f46945b == aVar.f46945b && this.f46946c == aVar.f46946c && this.d == aVar.d && this.f46947e == aVar.f46947e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f46945b);
        int b11 = w7.b(this.f46946c);
        int b12 = w7.b(this.d);
        return w7.b(this.f46947e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f46944a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f46944a + ", photoSize=" + this.f46945b + ", photoPresentationTimestampUs=" + this.f46946c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f46947e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
