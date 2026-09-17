package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.y7;
public final class a implements o0 {
    public final long f44880a;
    public final long f44881b;
    public final long f44882c;
    public final long d;
    public final long f44883e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f44880a = j3;
        this.f44881b = j10;
        this.f44882c = j11;
        this.d = j12;
        this.f44883e = j13;
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
            if (this.f44880a == aVar.f44880a && this.f44881b == aVar.f44881b && this.f44882c == aVar.f44882c && this.d == aVar.d && this.f44883e == aVar.f44883e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = y7.b(this.f44881b);
        int b11 = y7.b(this.f44882c);
        int b12 = y7.b(this.d);
        return y7.b(this.f44883e) + ((b12 + ((b11 + ((b10 + ((y7.b(this.f44880a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f44880a + ", photoSize=" + this.f44881b + ", photoPresentationTimestampUs=" + this.f44882c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f44883e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
