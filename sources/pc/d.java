package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f53576j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53577k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53578l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53579m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f53580a;
    public final double f53581b;
    public final double f53582c;
    public final double d;
    public final double f53583e;
    public final double f53584f;
    public final double f53585g;
    public final double h;
    public final double f53586i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f53580a = d12;
        this.f53581b = d13;
        this.f53582c = d14;
        this.d = d;
        this.f53583e = d2;
        this.f53584f = d10;
        this.f53585g = d11;
        this.h = d15;
        this.f53586i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f53583e);
        h5.b.m(byteBuffer, this.f53580a);
        h5.b.n(byteBuffer, this.f53584f);
        h5.b.n(byteBuffer, this.f53585g);
        h5.b.m(byteBuffer, this.f53581b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f53586i);
        h5.b.m(byteBuffer, this.f53582c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f53583e, this.f53583e) == 0 && Double.compare(dVar.f53584f, this.f53584f) == 0 && Double.compare(dVar.f53585g, this.f53585g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f53586i, this.f53586i) == 0 && Double.compare(dVar.f53580a, this.f53580a) == 0 && Double.compare(dVar.f53581b, this.f53581b) == 0 && Double.compare(dVar.f53582c, this.f53582c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53580a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53581b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f53582c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f53583e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f53584f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f53585g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f53586i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f53576j)) {
            return "Rotate 0°";
        }
        if (equals(f53577k)) {
            return "Rotate 90°";
        }
        if (equals(f53578l)) {
            return "Rotate 180°";
        }
        if (equals(f53579m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f53580a + ", v=" + this.f53581b + ", w=" + this.f53582c + ", a=" + this.d + ", b=" + this.f53583e + ", c=" + this.f53584f + ", d=" + this.f53585g + ", tx=" + this.h + ", ty=" + this.f53586i + '}';
    }
}
