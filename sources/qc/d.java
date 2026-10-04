package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44939j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44940k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44941l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44942m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44943a;
    public final double f44944b;
    public final double f44945c;
    public final double d;
    public final double f44946e;
    public final double f44947f;
    public final double f44948g;
    public final double h;
    public final double f44949i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44943a = d13;
        this.f44944b = d14;
        this.f44945c = d15;
        this.d = d;
        this.f44946e = d10;
        this.f44947f = d11;
        this.f44948g = d12;
        this.h = d16;
        this.f44949i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44946e);
        e5.b.m(byteBuffer, this.f44943a);
        e5.b.n(byteBuffer, this.f44947f);
        e5.b.n(byteBuffer, this.f44948g);
        e5.b.m(byteBuffer, this.f44944b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44949i);
        e5.b.m(byteBuffer, this.f44945c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44946e, this.f44946e) == 0 && Double.compare(dVar.f44947f, this.f44947f) == 0 && Double.compare(dVar.f44948g, this.f44948g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44949i, this.f44949i) == 0 && Double.compare(dVar.f44943a, this.f44943a) == 0 && Double.compare(dVar.f44944b, this.f44944b) == 0 && Double.compare(dVar.f44945c, this.f44945c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44943a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44944b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44945c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44946e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44947f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44948g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44949i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44939j)) {
            return "Rotate 0°";
        }
        if (equals(f44940k)) {
            return "Rotate 90°";
        }
        if (equals(f44941l)) {
            return "Rotate 180°";
        }
        if (equals(f44942m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44943a + ", v=" + this.f44944b + ", w=" + this.f44945c + ", a=" + this.d + ", b=" + this.f44946e + ", c=" + this.f44947f + ", d=" + this.f44948g + ", tx=" + this.h + ", ty=" + this.f44949i + '}';
    }
}
