package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45263j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45264k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45265l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45266m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45267a;
    public final double f45268b;
    public final double f45269c;
    public final double d;
    public final double e;
    public final double f45270f;
    public final double f45271g;
    public final double h;
    public final double f45272i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45267a = d13;
        this.f45268b = d14;
        this.f45269c = d15;
        this.d = d;
        this.e = d10;
        this.f45270f = d11;
        this.f45271g = d12;
        this.h = d16;
        this.f45272i = d17;
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
        e5.b.m(byteBuffer, this.f45267a);
        e5.b.n(byteBuffer, this.f45270f);
        e5.b.n(byteBuffer, this.f45271g);
        e5.b.m(byteBuffer, this.f45268b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45272i);
        e5.b.m(byteBuffer, this.f45269c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45270f, this.f45270f) == 0 && Double.compare(dVar.f45271g, this.f45271g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45272i, this.f45272i) == 0 && Double.compare(dVar.f45267a, this.f45267a) == 0 && Double.compare(dVar.f45268b, this.f45268b) == 0 && Double.compare(dVar.f45269c, this.f45269c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45267a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45268b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45269c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45270f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45271g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45272i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45263j)) {
            return "Rotate 0°";
        }
        if (equals(f45264k)) {
            return "Rotate 90°";
        }
        if (equals(f45265l)) {
            return "Rotate 180°";
        }
        if (equals(f45266m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45267a + ", v=" + this.f45268b + ", w=" + this.f45269c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45270f + ", d=" + this.f45271g + ", tx=" + this.h + ", ty=" + this.f45272i + '}';
    }
}
