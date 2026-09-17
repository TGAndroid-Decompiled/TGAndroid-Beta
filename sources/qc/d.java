package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44341j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44342k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44343l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44344m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44345a;
    public final double f44346b;
    public final double f44347c;
    public final double d;
    public final double f44348e;
    public final double f44349f;
    public final double f44350g;
    public final double h;
    public final double f44351i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44345a = d13;
        this.f44346b = d14;
        this.f44347c = d15;
        this.d = d;
        this.f44348e = d10;
        this.f44349f = d11;
        this.f44350g = d12;
        this.h = d16;
        this.f44351i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44348e);
        e5.b.m(byteBuffer, this.f44345a);
        e5.b.n(byteBuffer, this.f44349f);
        e5.b.n(byteBuffer, this.f44350g);
        e5.b.m(byteBuffer, this.f44346b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44351i);
        e5.b.m(byteBuffer, this.f44347c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44348e, this.f44348e) == 0 && Double.compare(dVar.f44349f, this.f44349f) == 0 && Double.compare(dVar.f44350g, this.f44350g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44351i, this.f44351i) == 0 && Double.compare(dVar.f44345a, this.f44345a) == 0 && Double.compare(dVar.f44346b, this.f44346b) == 0 && Double.compare(dVar.f44347c, this.f44347c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44345a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44346b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44347c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44348e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44349f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44350g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44351i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44341j)) {
            return "Rotate 0°";
        }
        if (equals(f44342k)) {
            return "Rotate 90°";
        }
        if (equals(f44343l)) {
            return "Rotate 180°";
        }
        if (equals(f44344m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44345a + ", v=" + this.f44346b + ", w=" + this.f44347c + ", a=" + this.d + ", b=" + this.f44348e + ", c=" + this.f44349f + ", d=" + this.f44350g + ", tx=" + this.h + ", ty=" + this.f44351i + '}';
    }
}
