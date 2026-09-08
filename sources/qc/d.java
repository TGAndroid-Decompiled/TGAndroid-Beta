package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44340j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44341k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44342l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44343m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44344a;
    public final double f44345b;
    public final double f44346c;
    public final double d;
    public final double f44347e;
    public final double f44348f;
    public final double f44349g;
    public final double h;
    public final double f44350i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44344a = d13;
        this.f44345b = d14;
        this.f44346c = d15;
        this.d = d;
        this.f44347e = d10;
        this.f44348f = d11;
        this.f44349g = d12;
        this.h = d16;
        this.f44350i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44347e);
        e5.b.m(byteBuffer, this.f44344a);
        e5.b.n(byteBuffer, this.f44348f);
        e5.b.n(byteBuffer, this.f44349g);
        e5.b.m(byteBuffer, this.f44345b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44350i);
        e5.b.m(byteBuffer, this.f44346c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44347e, this.f44347e) == 0 && Double.compare(dVar.f44348f, this.f44348f) == 0 && Double.compare(dVar.f44349g, this.f44349g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44350i, this.f44350i) == 0 && Double.compare(dVar.f44344a, this.f44344a) == 0 && Double.compare(dVar.f44345b, this.f44345b) == 0 && Double.compare(dVar.f44346c, this.f44346c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44344a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44345b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44346c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44347e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44348f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44349g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44350i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44340j)) {
            return "Rotate 0°";
        }
        if (equals(f44341k)) {
            return "Rotate 90°";
        }
        if (equals(f44342l)) {
            return "Rotate 180°";
        }
        if (equals(f44343m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44344a + ", v=" + this.f44345b + ", w=" + this.f44346c + ", a=" + this.d + ", b=" + this.f44347e + ", c=" + this.f44348f + ", d=" + this.f44349g + ", tx=" + this.h + ", ty=" + this.f44350i + '}';
    }
}
