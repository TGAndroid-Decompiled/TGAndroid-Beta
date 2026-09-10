package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f40649j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f40650k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f40651l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f40652m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f40653a;
    public final double f40654b;
    public final double f40655c;
    public final double d;
    public final double e;
    public final double f40656f;
    public final double f40657g;
    public final double h;
    public final double f40658i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f40653a = d13;
        this.f40654b = d14;
        this.f40655c = d15;
        this.d = d;
        this.e = d10;
        this.f40656f = d11;
        this.f40657g = d12;
        this.h = d16;
        this.f40658i = d17;
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
        e5.b.m(byteBuffer, this.f40653a);
        e5.b.n(byteBuffer, this.f40656f);
        e5.b.n(byteBuffer, this.f40657g);
        e5.b.m(byteBuffer, this.f40654b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f40658i);
        e5.b.m(byteBuffer, this.f40655c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f40656f, this.f40656f) == 0 && Double.compare(dVar.f40657g, this.f40657g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f40658i, this.f40658i) == 0 && Double.compare(dVar.f40653a, this.f40653a) == 0 && Double.compare(dVar.f40654b, this.f40654b) == 0 && Double.compare(dVar.f40655c, this.f40655c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f40653a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f40654b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f40655c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f40656f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f40657g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f40658i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f40649j)) {
            return "Rotate 0°";
        }
        if (equals(f40650k)) {
            return "Rotate 90°";
        }
        if (equals(f40651l)) {
            return "Rotate 180°";
        }
        if (equals(f40652m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f40653a + ", v=" + this.f40654b + ", w=" + this.f40655c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f40656f + ", d=" + this.f40657g + ", tx=" + this.h + ", ty=" + this.f40658i + '}';
    }
}
