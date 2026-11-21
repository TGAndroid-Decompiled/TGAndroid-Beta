package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f55600j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55601k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55602l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55603m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f55604a;
    public final double f55605b;
    public final double f55606c;
    public final double d;
    public final double f55607e;
    public final double f55608f;
    public final double f55609g;
    public final double h;
    public final double f55610i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f55604a = d12;
        this.f55605b = d13;
        this.f55606c = d14;
        this.d = d;
        this.f55607e = d2;
        this.f55608f = d10;
        this.f55609g = d11;
        this.h = d15;
        this.f55610i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f55607e);
        h5.b.m(byteBuffer, this.f55604a);
        h5.b.n(byteBuffer, this.f55608f);
        h5.b.n(byteBuffer, this.f55609g);
        h5.b.m(byteBuffer, this.f55605b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f55610i);
        h5.b.m(byteBuffer, this.f55606c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f55607e, this.f55607e) == 0 && Double.compare(dVar.f55608f, this.f55608f) == 0 && Double.compare(dVar.f55609g, this.f55609g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f55610i, this.f55610i) == 0 && Double.compare(dVar.f55604a, this.f55604a) == 0 && Double.compare(dVar.f55605b, this.f55605b) == 0 && Double.compare(dVar.f55606c, this.f55606c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f55604a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f55605b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f55606c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f55607e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f55608f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f55609g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f55610i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f55600j)) {
            return "Rotate 0°";
        }
        if (equals(f55601k)) {
            return "Rotate 90°";
        }
        if (equals(f55602l)) {
            return "Rotate 180°";
        }
        if (equals(f55603m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f55604a + ", v=" + this.f55605b + ", w=" + this.f55606c + ", a=" + this.d + ", b=" + this.f55607e + ", c=" + this.f55608f + ", d=" + this.f55609g + ", tx=" + this.h + ", ty=" + this.f55610i + '}';
    }
}
