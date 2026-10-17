package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45243j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45244k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45245l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45246m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45247a;
    public final double f45248b;
    public final double f45249c;
    public final double d;
    public final double e;
    public final double f45250f;
    public final double f45251g;
    public final double h;
    public final double f45252i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45247a = d13;
        this.f45248b = d14;
        this.f45249c = d15;
        this.d = d;
        this.e = d10;
        this.f45250f = d11;
        this.f45251g = d12;
        this.h = d16;
        this.f45252i = d17;
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
        e5.b.m(byteBuffer, this.f45247a);
        e5.b.n(byteBuffer, this.f45250f);
        e5.b.n(byteBuffer, this.f45251g);
        e5.b.m(byteBuffer, this.f45248b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45252i);
        e5.b.m(byteBuffer, this.f45249c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45250f, this.f45250f) == 0 && Double.compare(dVar.f45251g, this.f45251g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45252i, this.f45252i) == 0 && Double.compare(dVar.f45247a, this.f45247a) == 0 && Double.compare(dVar.f45248b, this.f45248b) == 0 && Double.compare(dVar.f45249c, this.f45249c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45247a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45248b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45249c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45250f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45251g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45252i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45243j)) {
            return "Rotate 0°";
        }
        if (equals(f45244k)) {
            return "Rotate 90°";
        }
        if (equals(f45245l)) {
            return "Rotate 180°";
        }
        if (equals(f45246m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45247a + ", v=" + this.f45248b + ", w=" + this.f45249c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45250f + ", d=" + this.f45251g + ", tx=" + this.h + ", ty=" + this.f45252i + '}';
    }
}
