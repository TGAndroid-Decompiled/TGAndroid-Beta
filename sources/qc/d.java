package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44938j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44939k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44940l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44941m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44942a;
    public final double f44943b;
    public final double f44944c;
    public final double d;
    public final double f44945e;
    public final double f44946f;
    public final double f44947g;
    public final double h;
    public final double f44948i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44942a = d13;
        this.f44943b = d14;
        this.f44944c = d15;
        this.d = d;
        this.f44945e = d10;
        this.f44946f = d11;
        this.f44947g = d12;
        this.h = d16;
        this.f44948i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44945e);
        e5.b.m(byteBuffer, this.f44942a);
        e5.b.n(byteBuffer, this.f44946f);
        e5.b.n(byteBuffer, this.f44947g);
        e5.b.m(byteBuffer, this.f44943b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44948i);
        e5.b.m(byteBuffer, this.f44944c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44945e, this.f44945e) == 0 && Double.compare(dVar.f44946f, this.f44946f) == 0 && Double.compare(dVar.f44947g, this.f44947g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44948i, this.f44948i) == 0 && Double.compare(dVar.f44942a, this.f44942a) == 0 && Double.compare(dVar.f44943b, this.f44943b) == 0 && Double.compare(dVar.f44944c, this.f44944c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44942a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44943b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44944c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44945e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44946f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44947g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44948i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44938j)) {
            return "Rotate 0°";
        }
        if (equals(f44939k)) {
            return "Rotate 90°";
        }
        if (equals(f44940l)) {
            return "Rotate 180°";
        }
        if (equals(f44941m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44942a + ", v=" + this.f44943b + ", w=" + this.f44944c + ", a=" + this.d + ", b=" + this.f44945e + ", c=" + this.f44946f + ", d=" + this.f44947g + ", tx=" + this.h + ", ty=" + this.f44948i + '}';
    }
}
