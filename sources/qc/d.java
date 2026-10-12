package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f46055j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46056k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46057l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46058m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f46059a;
    public final double f46060b;
    public final double f46061c;
    public final double d;
    public final double f46062e;
    public final double f46063f;
    public final double f46064g;
    public final double h;
    public final double f46065i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f46059a = d13;
        this.f46060b = d14;
        this.f46061c = d15;
        this.d = d;
        this.f46062e = d10;
        this.f46063f = d11;
        this.f46064g = d12;
        this.h = d16;
        this.f46065i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f46062e);
        e5.b.m(byteBuffer, this.f46059a);
        e5.b.n(byteBuffer, this.f46063f);
        e5.b.n(byteBuffer, this.f46064g);
        e5.b.m(byteBuffer, this.f46060b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f46065i);
        e5.b.m(byteBuffer, this.f46061c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f46062e, this.f46062e) == 0 && Double.compare(dVar.f46063f, this.f46063f) == 0 && Double.compare(dVar.f46064g, this.f46064g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f46065i, this.f46065i) == 0 && Double.compare(dVar.f46059a, this.f46059a) == 0 && Double.compare(dVar.f46060b, this.f46060b) == 0 && Double.compare(dVar.f46061c, this.f46061c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46059a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46060b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46061c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46062e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46063f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46064g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46065i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f46055j)) {
            return "Rotate 0°";
        }
        if (equals(f46056k)) {
            return "Rotate 90°";
        }
        if (equals(f46057l)) {
            return "Rotate 180°";
        }
        if (equals(f46058m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46059a + ", v=" + this.f46060b + ", w=" + this.f46061c + ", a=" + this.d + ", b=" + this.f46062e + ", c=" + this.f46063f + ", d=" + this.f46064g + ", tx=" + this.h + ", ty=" + this.f46065i + '}';
    }
}
