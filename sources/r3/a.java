package r3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.w7;
public final class a implements o0 {
    public final long f47166a;
    public final long f47167b;
    public final long f47168c;
    public final long d;
    public final long f47169e;

    public a(long j3, long j10, long j11, long j12, long j13) {
        this.f47166a = j3;
        this.f47167b = j10;
        this.f47168c = j11;
        this.d = j12;
        this.f47169e = j13;
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
            if (this.f47166a == aVar.f47166a && this.f47167b == aVar.f47167b && this.f47168c == aVar.f47168c && this.d == aVar.d && this.f47169e == aVar.f47169e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w7.b(this.f47167b);
        int b11 = w7.b(this.f47168c);
        int b12 = w7.b(this.d);
        return w7.b(this.f47169e) + ((b12 + ((b11 + ((b10 + ((w7.b(this.f47166a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f47166a + ", photoSize=" + this.f47167b + ", photoPresentationTimestampUs=" + this.f47168c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f47169e;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
