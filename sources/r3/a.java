package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.y7;
public final class a implements o0 {
    public final long f44879a;
    public final long f44880b;
    public final long f44881c;
    public final long d;
    public final long f44882e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f44879a = j3;
        this.f44880b = j10;
        this.f44881c = j11;
        this.d = j12;
        this.f44882e = j13;
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
            if (this.f44879a == aVar.f44879a && this.f44880b == aVar.f44880b && this.f44881c == aVar.f44881c && this.d == aVar.d && this.f44882e == aVar.f44882e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = y7.b(this.f44880b);
        int b11 = y7.b(this.f44881c);
        int b12 = y7.b(this.d);
        return y7.b(this.f44882e) + ((b12 + ((b11 + ((b10 + ((y7.b(this.f44879a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f44879a + ", photoSize=" + this.f44880b + ", photoPresentationTimestampUs=" + this.f44881c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f44882e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
