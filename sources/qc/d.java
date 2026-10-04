package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44946j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44947k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44948l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44949m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44950a;
    public final double f44951b;
    public final double f44952c;
    public final double d;
    public final double f44953e;
    public final double f44954f;
    public final double f44955g;
    public final double h;
    public final double f44956i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44950a = d13;
        this.f44951b = d14;
        this.f44952c = d15;
        this.d = d;
        this.f44953e = d10;
        this.f44954f = d11;
        this.f44955g = d12;
        this.h = d16;
        this.f44956i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44953e);
        e5.b.m(byteBuffer, this.f44950a);
        e5.b.n(byteBuffer, this.f44954f);
        e5.b.n(byteBuffer, this.f44955g);
        e5.b.m(byteBuffer, this.f44951b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44956i);
        e5.b.m(byteBuffer, this.f44952c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44953e, this.f44953e) == 0 && Double.compare(dVar.f44954f, this.f44954f) == 0 && Double.compare(dVar.f44955g, this.f44955g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44956i, this.f44956i) == 0 && Double.compare(dVar.f44950a, this.f44950a) == 0 && Double.compare(dVar.f44951b, this.f44951b) == 0 && Double.compare(dVar.f44952c, this.f44952c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44950a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44951b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44952c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44953e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44954f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44955g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44956i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44946j)) {
            return "Rotate 0°";
        }
        if (equals(f44947k)) {
            return "Rotate 90°";
        }
        if (equals(f44948l)) {
            return "Rotate 180°";
        }
        if (equals(f44949m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44950a + ", v=" + this.f44951b + ", w=" + this.f44952c + ", a=" + this.d + ", b=" + this.f44953e + ", c=" + this.f44954f + ", d=" + this.f44955g + ", tx=" + this.h + ", ty=" + this.f44956i + '}';
    }
}
