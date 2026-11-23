package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f55569j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55570k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55571l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f55572m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f55573a;
    public final double f55574b;
    public final double f55575c;
    public final double d;
    public final double f55576e;
    public final double f55577f;
    public final double f55578g;
    public final double h;
    public final double f55579i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f55573a = d12;
        this.f55574b = d13;
        this.f55575c = d14;
        this.d = d;
        this.f55576e = d2;
        this.f55577f = d10;
        this.f55578g = d11;
        this.h = d15;
        this.f55579i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f55576e);
        h5.b.m(byteBuffer, this.f55573a);
        h5.b.n(byteBuffer, this.f55577f);
        h5.b.n(byteBuffer, this.f55578g);
        h5.b.m(byteBuffer, this.f55574b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f55579i);
        h5.b.m(byteBuffer, this.f55575c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f55576e, this.f55576e) == 0 && Double.compare(dVar.f55577f, this.f55577f) == 0 && Double.compare(dVar.f55578g, this.f55578g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f55579i, this.f55579i) == 0 && Double.compare(dVar.f55573a, this.f55573a) == 0 && Double.compare(dVar.f55574b, this.f55574b) == 0 && Double.compare(dVar.f55575c, this.f55575c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f55573a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f55574b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f55575c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f55576e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f55577f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f55578g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f55579i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f55569j)) {
            return "Rotate 0°";
        }
        if (equals(f55570k)) {
            return "Rotate 90°";
        }
        if (equals(f55571l)) {
            return "Rotate 180°";
        }
        if (equals(f55572m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f55573a + ", v=" + this.f55574b + ", w=" + this.f55575c + ", a=" + this.d + ", b=" + this.f55576e + ", c=" + this.f55577f + ", d=" + this.f55578g + ", tx=" + this.h + ", ty=" + this.f55579i + '}';
    }
}
