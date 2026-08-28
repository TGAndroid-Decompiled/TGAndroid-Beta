package yb;

import java.nio.ByteBuffer;
public final class d {
    public static final d f49725j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f49726k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f49727l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f49728m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f49729a;
    public final double f49730b;
    public final double f49731c;
    public final double d;
    public final double f49732e;
    public final double f49733f;
    public final double f49734g;
    public final double h;
    public final double f49735i;

    public d(double d, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f49729a = d12;
        this.f49730b = d13;
        this.f49731c = d14;
        this.d = d;
        this.f49732e = d9;
        this.f49733f = d10;
        this.f49734g = d11;
        this.h = d15;
        this.f49735i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = p2.b.f(byteBuffer);
        double f11 = p2.b.f(byteBuffer);
        double e10 = p2.b.e(byteBuffer);
        return new d(f10, f11, p2.b.f(byteBuffer), p2.b.f(byteBuffer), e10, p2.b.e(byteBuffer), p2.b.e(byteBuffer), p2.b.f(byteBuffer), p2.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        p2.b.n(byteBuffer, this.d);
        p2.b.n(byteBuffer, this.f49732e);
        p2.b.m(byteBuffer, this.f49729a);
        p2.b.n(byteBuffer, this.f49733f);
        p2.b.n(byteBuffer, this.f49734g);
        p2.b.m(byteBuffer, this.f49730b);
        p2.b.n(byteBuffer, this.h);
        p2.b.n(byteBuffer, this.f49735i);
        p2.b.m(byteBuffer, this.f49731c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f49732e, this.f49732e) == 0 && Double.compare(dVar.f49733f, this.f49733f) == 0 && Double.compare(dVar.f49734g, this.f49734g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f49735i, this.f49735i) == 0 && Double.compare(dVar.f49729a, this.f49729a) == 0 && Double.compare(dVar.f49730b, this.f49730b) == 0 && Double.compare(dVar.f49731c, this.f49731c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f49729a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f49730b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f49731c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f49732e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f49733f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f49734g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f49735i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f49725j)) {
            return "Rotate 0°";
        }
        if (equals(f49726k)) {
            return "Rotate 90°";
        }
        if (equals(f49727l)) {
            return "Rotate 180°";
        }
        if (equals(f49728m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f49729a + ", v=" + this.f49730b + ", w=" + this.f49731c + ", a=" + this.d + ", b=" + this.f49732e + ", c=" + this.f49733f + ", d=" + this.f49734g + ", tx=" + this.h + ", ty=" + this.f49735i + '}';
    }
}
