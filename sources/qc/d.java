package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f46108j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46109k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46110l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46111m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f46112a;
    public final double f46113b;
    public final double f46114c;
    public final double d;
    public final double f46115e;
    public final double f46116f;
    public final double f46117g;
    public final double h;
    public final double f46118i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f46112a = d13;
        this.f46113b = d14;
        this.f46114c = d15;
        this.d = d;
        this.f46115e = d10;
        this.f46116f = d11;
        this.f46117g = d12;
        this.h = d16;
        this.f46118i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f46115e);
        e5.b.m(byteBuffer, this.f46112a);
        e5.b.n(byteBuffer, this.f46116f);
        e5.b.n(byteBuffer, this.f46117g);
        e5.b.m(byteBuffer, this.f46113b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f46118i);
        e5.b.m(byteBuffer, this.f46114c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f46115e, this.f46115e) == 0 && Double.compare(dVar.f46116f, this.f46116f) == 0 && Double.compare(dVar.f46117g, this.f46117g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f46118i, this.f46118i) == 0 && Double.compare(dVar.f46112a, this.f46112a) == 0 && Double.compare(dVar.f46113b, this.f46113b) == 0 && Double.compare(dVar.f46114c, this.f46114c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46112a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46113b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46114c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46115e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46116f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46117g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46118i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f46108j)) {
            return "Rotate 0°";
        }
        if (equals(f46109k)) {
            return "Rotate 90°";
        }
        if (equals(f46110l)) {
            return "Rotate 180°";
        }
        if (equals(f46111m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46112a + ", v=" + this.f46113b + ", w=" + this.f46114c + ", a=" + this.d + ", b=" + this.f46115e + ", c=" + this.f46116f + ", d=" + this.f46117g + ", tx=" + this.h + ", ty=" + this.f46118i + '}';
    }
}
