package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f55559j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55560k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55561l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55562m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f55563a;
    public final double f55564b;
    public final double f55565c;
    public final double d;
    public final double f55566e;
    public final double f55567f;
    public final double f55568g;
    public final double h;
    public final double f55569i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f55563a = d12;
        this.f55564b = d13;
        this.f55565c = d14;
        this.d = d;
        this.f55566e = d2;
        this.f55567f = d10;
        this.f55568g = d11;
        this.h = d15;
        this.f55569i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f55566e);
        h5.b.m(byteBuffer, this.f55563a);
        h5.b.n(byteBuffer, this.f55567f);
        h5.b.n(byteBuffer, this.f55568g);
        h5.b.m(byteBuffer, this.f55564b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f55569i);
        h5.b.m(byteBuffer, this.f55565c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f55566e, this.f55566e) == 0 && Double.compare(dVar.f55567f, this.f55567f) == 0 && Double.compare(dVar.f55568g, this.f55568g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f55569i, this.f55569i) == 0 && Double.compare(dVar.f55563a, this.f55563a) == 0 && Double.compare(dVar.f55564b, this.f55564b) == 0 && Double.compare(dVar.f55565c, this.f55565c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f55563a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f55564b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f55565c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f55566e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f55567f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f55568g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f55569i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f55559j)) {
            return "Rotate 0°";
        }
        if (equals(f55560k)) {
            return "Rotate 90°";
        }
        if (equals(f55561l)) {
            return "Rotate 180°";
        }
        if (equals(f55562m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f55563a + ", v=" + this.f55564b + ", w=" + this.f55565c + ", a=" + this.d + ", b=" + this.f55566e + ", c=" + this.f55567f + ", d=" + this.f55568g + ", tx=" + this.h + ", ty=" + this.f55569i + '}';
    }
}
