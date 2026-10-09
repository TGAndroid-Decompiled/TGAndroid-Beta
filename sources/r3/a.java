package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f46942a;
    public final long f46943b;
    public final long f46944c;
    public final long d;
    public final long f46945e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f46942a = j3;
        this.f46943b = j10;
        this.f46944c = j11;
        this.d = j12;
        this.f46945e = j13;
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
            if (this.f46942a == aVar.f46942a && this.f46943b == aVar.f46943b && this.f46944c == aVar.f46944c && this.d == aVar.d && this.f46945e == aVar.f46945e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f46943b);
        int b11 = w7.b(this.f46944c);
        int b12 = w7.b(this.d);
        return w7.b(this.f46945e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f46942a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f46942a + ", photoSize=" + this.f46943b + ", photoPresentationTimestampUs=" + this.f46944c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f46945e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
