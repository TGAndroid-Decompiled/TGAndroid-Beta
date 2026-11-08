package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f53563j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53564k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53565l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53566m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f53567a;
    public final double f53568b;
    public final double f53569c;
    public final double d;
    public final double f53570e;
    public final double f53571f;
    public final double f53572g;
    public final double h;
    public final double f53573i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f53567a = d12;
        this.f53568b = d13;
        this.f53569c = d14;
        this.d = d;
        this.f53570e = d2;
        this.f53571f = d10;
        this.f53572g = d11;
        this.h = d15;
        this.f53573i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f53570e);
        h5.b.m(byteBuffer, this.f53567a);
        h5.b.n(byteBuffer, this.f53571f);
        h5.b.n(byteBuffer, this.f53572g);
        h5.b.m(byteBuffer, this.f53568b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f53573i);
        h5.b.m(byteBuffer, this.f53569c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f53570e, this.f53570e) == 0 && Double.compare(dVar.f53571f, this.f53571f) == 0 && Double.compare(dVar.f53572g, this.f53572g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f53573i, this.f53573i) == 0 && Double.compare(dVar.f53567a, this.f53567a) == 0 && Double.compare(dVar.f53568b, this.f53568b) == 0 && Double.compare(dVar.f53569c, this.f53569c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53567a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53568b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f53569c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f53570e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f53571f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f53572g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f53573i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f53563j)) {
            return "Rotate 0°";
        }
        if (equals(f53564k)) {
            return "Rotate 90°";
        }
        if (equals(f53565l)) {
            return "Rotate 180°";
        }
        if (equals(f53566m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f53567a + ", v=" + this.f53568b + ", w=" + this.f53569c + ", a=" + this.d + ", b=" + this.f53570e + ", c=" + this.f53571f + ", d=" + this.f53572g + ", tx=" + this.h + ", ty=" + this.f53573i + '}';
    }
}
