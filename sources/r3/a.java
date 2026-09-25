package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.a8;
public final class a implements o0 {
    public final long f42295a;
    public final long f42296b;
    public final long f42297c;
    public final long d;
    public final long e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f42295a = j3;
        this.f42296b = j10;
        this.f42297c = j11;
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
            if (this.f42295a == aVar.f42295a && this.f42296b == aVar.f42296b && this.f42297c == aVar.f42297c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = a8.b(this.f42296b);
        int b11 = a8.b(this.f42297c);
        int b12 = a8.b(this.d);
        return a8.b(this.e) + ((b12 + ((b11 + ((b10 + ((a8.b(this.f42295a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f42295a + ", photoSize=" + this.f42296b + ", photoPresentationTimestampUs=" + this.f42297c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
