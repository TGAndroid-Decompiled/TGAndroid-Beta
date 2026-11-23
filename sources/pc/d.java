package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f55604j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55605k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55606l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55607m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f55608a;
    public final double f55609b;
    public final double f55610c;
    public final double d;
    public final double f55611e;
    public final double f55612f;
    public final double f55613g;
    public final double h;
    public final double f55614i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f55608a = d12;
        this.f55609b = d13;
        this.f55610c = d14;
        this.d = d;
        this.f55611e = d2;
        this.f55612f = d10;
        this.f55613g = d11;
        this.h = d15;
        this.f55614i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f55611e);
        h5.b.m(byteBuffer, this.f55608a);
        h5.b.n(byteBuffer, this.f55612f);
        h5.b.n(byteBuffer, this.f55613g);
        h5.b.m(byteBuffer, this.f55609b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f55614i);
        h5.b.m(byteBuffer, this.f55610c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f55611e, this.f55611e) == 0 && Double.compare(dVar.f55612f, this.f55612f) == 0 && Double.compare(dVar.f55613g, this.f55613g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f55614i, this.f55614i) == 0 && Double.compare(dVar.f55608a, this.f55608a) == 0 && Double.compare(dVar.f55609b, this.f55609b) == 0 && Double.compare(dVar.f55610c, this.f55610c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f55608a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f55609b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f55610c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f55611e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f55612f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f55613g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f55614i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f55604j)) {
            return "Rotate 0°";
        }
        if (equals(f55605k)) {
            return "Rotate 90°";
        }
        if (equals(f55606l)) {
            return "Rotate 180°";
        }
        if (equals(f55607m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f55608a + ", v=" + this.f55609b + ", w=" + this.f55610c + ", a=" + this.d + ", b=" + this.f55611e + ", c=" + this.f55612f + ", d=" + this.f55613g + ", tx=" + this.h + ", ty=" + this.f55614i + '}';
    }
}
