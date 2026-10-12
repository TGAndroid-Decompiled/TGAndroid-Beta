package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f46047j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46048k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46049l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46050m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f46051a;
    public final double f46052b;
    public final double f46053c;
    public final double d;
    public final double f46054e;
    public final double f46055f;
    public final double f46056g;
    public final double h;
    public final double f46057i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f46051a = d13;
        this.f46052b = d14;
        this.f46053c = d15;
        this.d = d;
        this.f46054e = d10;
        this.f46055f = d11;
        this.f46056g = d12;
        this.h = d16;
        this.f46057i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f46054e);
        e5.b.m(byteBuffer, this.f46051a);
        e5.b.n(byteBuffer, this.f46055f);
        e5.b.n(byteBuffer, this.f46056g);
        e5.b.m(byteBuffer, this.f46052b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f46057i);
        e5.b.m(byteBuffer, this.f46053c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f46054e, this.f46054e) == 0 && Double.compare(dVar.f46055f, this.f46055f) == 0 && Double.compare(dVar.f46056g, this.f46056g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f46057i, this.f46057i) == 0 && Double.compare(dVar.f46051a, this.f46051a) == 0 && Double.compare(dVar.f46052b, this.f46052b) == 0 && Double.compare(dVar.f46053c, this.f46053c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46051a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46052b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46053c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46054e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46055f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46056g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46057i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f46047j)) {
            return "Rotate 0°";
        }
        if (equals(f46048k)) {
            return "Rotate 90°";
        }
        if (equals(f46049l)) {
            return "Rotate 180°";
        }
        if (equals(f46050m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46051a + ", v=" + this.f46052b + ", w=" + this.f46053c + ", a=" + this.d + ", b=" + this.f46054e + ", c=" + this.f46055f + ", d=" + this.f46056g + ", tx=" + this.h + ", ty=" + this.f46057i + '}';
    }
}
