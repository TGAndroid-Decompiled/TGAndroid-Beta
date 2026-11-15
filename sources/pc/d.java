package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f54983j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f54984k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f54985l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f54986m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f54987a;
    public final double f54988b;
    public final double f54989c;
    public final double d;
    public final double f54990e;
    public final double f54991f;
    public final double f54992g;
    public final double h;
    public final double f54993i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f54987a = d12;
        this.f54988b = d13;
        this.f54989c = d14;
        this.d = d;
        this.f54990e = d2;
        this.f54991f = d10;
        this.f54992g = d11;
        this.h = d15;
        this.f54993i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f54990e);
        h5.b.m(byteBuffer, this.f54987a);
        h5.b.n(byteBuffer, this.f54991f);
        h5.b.n(byteBuffer, this.f54992g);
        h5.b.m(byteBuffer, this.f54988b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f54993i);
        h5.b.m(byteBuffer, this.f54989c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f54990e, this.f54990e) == 0 && Double.compare(dVar.f54991f, this.f54991f) == 0 && Double.compare(dVar.f54992g, this.f54992g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f54993i, this.f54993i) == 0 && Double.compare(dVar.f54987a, this.f54987a) == 0 && Double.compare(dVar.f54988b, this.f54988b) == 0 && Double.compare(dVar.f54989c, this.f54989c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f54987a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f54988b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f54989c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f54990e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f54991f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f54992g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f54993i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f54983j)) {
            return "Rotate 0°";
        }
        if (equals(f54984k)) {
            return "Rotate 90°";
        }
        if (equals(f54985l)) {
            return "Rotate 180°";
        }
        if (equals(f54986m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f54987a + ", v=" + this.f54988b + ", w=" + this.f54989c + ", a=" + this.d + ", b=" + this.f54990e + ", c=" + this.f54991f + ", d=" + this.f54992g + ", tx=" + this.h + ", ty=" + this.f54993i + '}';
    }
}
