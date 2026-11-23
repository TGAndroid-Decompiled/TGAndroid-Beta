package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f55682j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55683k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55684l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55685m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f55686a;
    public final double f55687b;
    public final double f55688c;
    public final double d;
    public final double f55689e;
    public final double f55690f;
    public final double f55691g;
    public final double h;
    public final double f55692i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f55686a = d12;
        this.f55687b = d13;
        this.f55688c = d14;
        this.d = d;
        this.f55689e = d2;
        this.f55690f = d10;
        this.f55691g = d11;
        this.h = d15;
        this.f55692i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f55689e);
        h5.b.m(byteBuffer, this.f55686a);
        h5.b.n(byteBuffer, this.f55690f);
        h5.b.n(byteBuffer, this.f55691g);
        h5.b.m(byteBuffer, this.f55687b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f55692i);
        h5.b.m(byteBuffer, this.f55688c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f55689e, this.f55689e) == 0 && Double.compare(dVar.f55690f, this.f55690f) == 0 && Double.compare(dVar.f55691g, this.f55691g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f55692i, this.f55692i) == 0 && Double.compare(dVar.f55686a, this.f55686a) == 0 && Double.compare(dVar.f55687b, this.f55687b) == 0 && Double.compare(dVar.f55688c, this.f55688c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f55686a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f55687b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f55688c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f55689e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f55690f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f55691g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f55692i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f55682j)) {
            return "Rotate 0°";
        }
        if (equals(f55683k)) {
            return "Rotate 90°";
        }
        if (equals(f55684l)) {
            return "Rotate 180°";
        }
        if (equals(f55685m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f55686a + ", v=" + this.f55687b + ", w=" + this.f55688c + ", a=" + this.d + ", b=" + this.f55689e + ", c=" + this.f55690f + ", d=" + this.f55691g + ", tx=" + this.h + ", ty=" + this.f55692i + '}';
    }
}
