package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41596j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41597k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41598l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41599m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41600a;
    public final double f41601b;
    public final double f41602c;
    public final double d;
    public final double e;
    public final double f41603f;
    public final double f41604g;
    public final double h;
    public final double f41605i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41600a = d13;
        this.f41601b = d14;
        this.f41602c = d15;
        this.d = d;
        this.e = d10;
        this.f41603f = d11;
        this.f41604g = d12;
        this.h = d16;
        this.f41605i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.e);
        e5.b.m(byteBuffer, this.f41600a);
        e5.b.n(byteBuffer, this.f41603f);
        e5.b.n(byteBuffer, this.f41604g);
        e5.b.m(byteBuffer, this.f41601b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41605i);
        e5.b.m(byteBuffer, this.f41602c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41603f, this.f41603f) == 0 && Double.compare(dVar.f41604g, this.f41604g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41605i, this.f41605i) == 0 && Double.compare(dVar.f41600a, this.f41600a) == 0 && Double.compare(dVar.f41601b, this.f41601b) == 0 && Double.compare(dVar.f41602c, this.f41602c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41600a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41601b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41602c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41603f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41604g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41605i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41596j)) {
            return "Rotate 0°";
        }
        if (equals(f41597k)) {
            return "Rotate 90°";
        }
        if (equals(f41598l)) {
            return "Rotate 180°";
        }
        if (equals(f41599m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41600a + ", v=" + this.f41601b + ", w=" + this.f41602c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41603f + ", d=" + this.f41604g + ", tx=" + this.h + ", ty=" + this.f41605i + '}';
    }
}
