package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44312j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44313k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44314l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44315m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44316a;
    public final double f44317b;
    public final double f44318c;
    public final double d;
    public final double f44319e;
    public final double f44320f;
    public final double f44321g;
    public final double h;
    public final double f44322i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44316a = d13;
        this.f44317b = d14;
        this.f44318c = d15;
        this.d = d;
        this.f44319e = d10;
        this.f44320f = d11;
        this.f44321g = d12;
        this.h = d16;
        this.f44322i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44319e);
        e5.b.m(byteBuffer, this.f44316a);
        e5.b.n(byteBuffer, this.f44320f);
        e5.b.n(byteBuffer, this.f44321g);
        e5.b.m(byteBuffer, this.f44317b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44322i);
        e5.b.m(byteBuffer, this.f44318c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44319e, this.f44319e) == 0 && Double.compare(dVar.f44320f, this.f44320f) == 0 && Double.compare(dVar.f44321g, this.f44321g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44322i, this.f44322i) == 0 && Double.compare(dVar.f44316a, this.f44316a) == 0 && Double.compare(dVar.f44317b, this.f44317b) == 0 && Double.compare(dVar.f44318c, this.f44318c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44316a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44317b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44318c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44319e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44320f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44321g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44322i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44312j)) {
            return "Rotate 0°";
        }
        if (equals(f44313k)) {
            return "Rotate 90°";
        }
        if (equals(f44314l)) {
            return "Rotate 180°";
        }
        if (equals(f44315m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44316a + ", v=" + this.f44317b + ", w=" + this.f44318c + ", a=" + this.d + ", b=" + this.f44319e + ", c=" + this.f44320f + ", d=" + this.f44321g + ", tx=" + this.h + ", ty=" + this.f44322i + '}';
    }
}
