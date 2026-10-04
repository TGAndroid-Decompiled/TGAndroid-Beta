package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.z7;
public final class a implements o0 {
    public final long f45780a;
    public final long f45781b;
    public final long f45782c;
    public final long d;
    public final long f45783e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f45780a = j3;
        this.f45781b = j10;
        this.f45782c = j11;
        this.d = j12;
        this.f45783e = j13;
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
            if (this.f45780a == aVar.f45780a && this.f45781b == aVar.f45781b && this.f45782c == aVar.f45782c && this.d == aVar.d && this.f45783e == aVar.f45783e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = z7.b(this.f45781b);
        int b11 = z7.b(this.f45782c);
        int b12 = z7.b(this.d);
        return z7.b(this.f45783e) + ((b12 + ((b11 + ((b10 + ((z7.b(this.f45780a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f45780a + ", photoSize=" + this.f45781b + ", photoPresentationTimestampUs=" + this.f45782c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f45783e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
