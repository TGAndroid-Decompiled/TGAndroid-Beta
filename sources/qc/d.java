package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41575j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41576k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41577l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41578m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41579a;
    public final double f41580b;
    public final double f41581c;
    public final double d;
    public final double e;
    public final double f41582f;
    public final double f41583g;
    public final double h;
    public final double f41584i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41579a = d13;
        this.f41580b = d14;
        this.f41581c = d15;
        this.d = d;
        this.e = d10;
        this.f41582f = d11;
        this.f41583g = d12;
        this.h = d16;
        this.f41584i = d17;
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
        e5.b.m(byteBuffer, this.f41579a);
        e5.b.n(byteBuffer, this.f41582f);
        e5.b.n(byteBuffer, this.f41583g);
        e5.b.m(byteBuffer, this.f41580b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41584i);
        e5.b.m(byteBuffer, this.f41581c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41582f, this.f41582f) == 0 && Double.compare(dVar.f41583g, this.f41583g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41584i, this.f41584i) == 0 && Double.compare(dVar.f41579a, this.f41579a) == 0 && Double.compare(dVar.f41580b, this.f41580b) == 0 && Double.compare(dVar.f41581c, this.f41581c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41579a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41580b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41581c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41582f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41583g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41584i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41575j)) {
            return "Rotate 0°";
        }
        if (equals(f41576k)) {
            return "Rotate 90°";
        }
        if (equals(f41577l)) {
            return "Rotate 180°";
        }
        if (equals(f41578m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41579a + ", v=" + this.f41580b + ", w=" + this.f41581c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41582f + ", d=" + this.f41583g + ", tx=" + this.h + ", ty=" + this.f41584i + '}';
    }
}
