package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f53575j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53576k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53577l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53578m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f53579a;
    public final double f53580b;
    public final double f53581c;
    public final double d;
    public final double f53582e;
    public final double f53583f;
    public final double f53584g;
    public final double h;
    public final double f53585i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f53579a = d12;
        this.f53580b = d13;
        this.f53581c = d14;
        this.d = d;
        this.f53582e = d2;
        this.f53583f = d10;
        this.f53584g = d11;
        this.h = d15;
        this.f53585i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f53582e);
        h5.b.m(byteBuffer, this.f53579a);
        h5.b.n(byteBuffer, this.f53583f);
        h5.b.n(byteBuffer, this.f53584g);
        h5.b.m(byteBuffer, this.f53580b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f53585i);
        h5.b.m(byteBuffer, this.f53581c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f53582e, this.f53582e) == 0 && Double.compare(dVar.f53583f, this.f53583f) == 0 && Double.compare(dVar.f53584g, this.f53584g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f53585i, this.f53585i) == 0 && Double.compare(dVar.f53579a, this.f53579a) == 0 && Double.compare(dVar.f53580b, this.f53580b) == 0 && Double.compare(dVar.f53581c, this.f53581c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53579a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53580b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f53581c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f53582e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f53583f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f53584g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f53585i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f53575j)) {
            return "Rotate 0°";
        }
        if (equals(f53576k)) {
            return "Rotate 90°";
        }
        if (equals(f53577l)) {
            return "Rotate 180°";
        }
        if (equals(f53578m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f53579a + ", v=" + this.f53580b + ", w=" + this.f53581c + ", a=" + this.d + ", b=" + this.f53582e + ", c=" + this.f53583f + ", d=" + this.f53584g + ", tx=" + this.h + ", ty=" + this.f53585i + '}';
    }
}
