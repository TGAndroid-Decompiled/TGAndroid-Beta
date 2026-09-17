package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41294j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41295k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41296l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41297m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41298a;
    public final double f41299b;
    public final double f41300c;
    public final double d;
    public final double e;
    public final double f41301f;
    public final double f41302g;
    public final double h;
    public final double f41303i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41298a = d13;
        this.f41299b = d14;
        this.f41300c = d15;
        this.d = d;
        this.e = d10;
        this.f41301f = d11;
        this.f41302g = d12;
        this.h = d16;
        this.f41303i = d17;
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
        e5.b.m(byteBuffer, this.f41298a);
        e5.b.n(byteBuffer, this.f41301f);
        e5.b.n(byteBuffer, this.f41302g);
        e5.b.m(byteBuffer, this.f41299b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41303i);
        e5.b.m(byteBuffer, this.f41300c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41301f, this.f41301f) == 0 && Double.compare(dVar.f41302g, this.f41302g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41303i, this.f41303i) == 0 && Double.compare(dVar.f41298a, this.f41298a) == 0 && Double.compare(dVar.f41299b, this.f41299b) == 0 && Double.compare(dVar.f41300c, this.f41300c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41298a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41299b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41300c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41301f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41302g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41303i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41294j)) {
            return "Rotate 0°";
        }
        if (equals(f41295k)) {
            return "Rotate 90°";
        }
        if (equals(f41296l)) {
            return "Rotate 180°";
        }
        if (equals(f41297m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41298a + ", v=" + this.f41299b + ", w=" + this.f41300c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41301f + ", d=" + this.f41302g + ", tx=" + this.h + ", ty=" + this.f41303i + '}';
    }
}
