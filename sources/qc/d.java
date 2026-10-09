package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f46110j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46111k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46112l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46113m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f46114a;
    public final double f46115b;
    public final double f46116c;
    public final double d;
    public final double f46117e;
    public final double f46118f;
    public final double f46119g;
    public final double h;
    public final double f46120i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f46114a = d13;
        this.f46115b = d14;
        this.f46116c = d15;
        this.d = d;
        this.f46117e = d10;
        this.f46118f = d11;
        this.f46119g = d12;
        this.h = d16;
        this.f46120i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f46117e);
        e5.b.m(byteBuffer, this.f46114a);
        e5.b.n(byteBuffer, this.f46118f);
        e5.b.n(byteBuffer, this.f46119g);
        e5.b.m(byteBuffer, this.f46115b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f46120i);
        e5.b.m(byteBuffer, this.f46116c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f46117e, this.f46117e) == 0 && Double.compare(dVar.f46118f, this.f46118f) == 0 && Double.compare(dVar.f46119g, this.f46119g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f46120i, this.f46120i) == 0 && Double.compare(dVar.f46114a, this.f46114a) == 0 && Double.compare(dVar.f46115b, this.f46115b) == 0 && Double.compare(dVar.f46116c, this.f46116c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46114a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46115b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46116c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46117e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46118f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46119g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46120i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f46110j)) {
            return "Rotate 0°";
        }
        if (equals(f46111k)) {
            return "Rotate 90°";
        }
        if (equals(f46112l)) {
            return "Rotate 180°";
        }
        if (equals(f46113m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46114a + ", v=" + this.f46115b + ", w=" + this.f46116c + ", a=" + this.d + ", b=" + this.f46117e + ", c=" + this.f46118f + ", d=" + this.f46119g + ", tx=" + this.h + ", ty=" + this.f46120i + '}';
    }
}
