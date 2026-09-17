package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f42031a;
    public final long f42032b;
    public final long f42033c;
    public final long d;
    public final long e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f42031a = j3;
        this.f42032b = j10;
        this.f42033c = j11;
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
            if (this.f42031a == aVar.f42031a && this.f42032b == aVar.f42032b && this.f42033c == aVar.f42033c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f42032b);
        int b11 = z7.b(this.f42033c);
        int b12 = z7.b(this.d);
        return z7.b(this.e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f42031a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f42031a + ", photoSize=" + this.f42032b + ", photoPresentationTimestampUs=" + this.f42033c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
