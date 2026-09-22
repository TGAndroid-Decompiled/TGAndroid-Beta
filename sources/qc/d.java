package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41268j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41269k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41270l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41271m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41272a;
    public final double f41273b;
    public final double f41274c;
    public final double d;
    public final double e;
    public final double f41275f;
    public final double f41276g;
    public final double h;
    public final double f41277i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41272a = d13;
        this.f41273b = d14;
        this.f41274c = d15;
        this.d = d;
        this.e = d10;
        this.f41275f = d11;
        this.f41276g = d12;
        this.h = d16;
        this.f41277i = d17;
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
        e5.b.m(byteBuffer, this.f41272a);
        e5.b.n(byteBuffer, this.f41275f);
        e5.b.n(byteBuffer, this.f41276g);
        e5.b.m(byteBuffer, this.f41273b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41277i);
        e5.b.m(byteBuffer, this.f41274c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41275f, this.f41275f) == 0 && Double.compare(dVar.f41276g, this.f41276g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41277i, this.f41277i) == 0 && Double.compare(dVar.f41272a, this.f41272a) == 0 && Double.compare(dVar.f41273b, this.f41273b) == 0 && Double.compare(dVar.f41274c, this.f41274c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41272a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41273b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41274c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41275f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41276g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41277i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41268j)) {
            return "Rotate 0°";
        }
        if (equals(f41269k)) {
            return "Rotate 90°";
        }
        if (equals(f41270l)) {
            return "Rotate 180°";
        }
        if (equals(f41271m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41272a + ", v=" + this.f41273b + ", w=" + this.f41274c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41275f + ", d=" + this.f41276g + ", tx=" + this.h + ", ty=" + this.f41277i + '}';
    }
}
