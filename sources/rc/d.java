package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45641j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45642k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45643l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45644m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45645a;
    public final double f45646b;
    public final double f45647c;
    public final double d;
    public final double e;
    public final double f45648f;
    public final double f45649g;
    public final double h;
    public final double f45650i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45645a = d13;
        this.f45646b = d14;
        this.f45647c = d15;
        this.d = d;
        this.e = d10;
        this.f45648f = d11;
        this.f45649g = d12;
        this.h = d16;
        this.f45650i = d17;
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
        e5.b.m(byteBuffer, this.f45645a);
        e5.b.n(byteBuffer, this.f45648f);
        e5.b.n(byteBuffer, this.f45649g);
        e5.b.m(byteBuffer, this.f45646b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45650i);
        e5.b.m(byteBuffer, this.f45647c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45648f, this.f45648f) == 0 && Double.compare(dVar.f45649g, this.f45649g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45650i, this.f45650i) == 0 && Double.compare(dVar.f45645a, this.f45645a) == 0 && Double.compare(dVar.f45646b, this.f45646b) == 0 && Double.compare(dVar.f45647c, this.f45647c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45645a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45646b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45647c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45648f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45649g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45650i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45641j)) {
            return "Rotate 0°";
        }
        if (equals(f45642k)) {
            return "Rotate 90°";
        }
        if (equals(f45643l)) {
            return "Rotate 180°";
        }
        if (equals(f45644m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45645a + ", v=" + this.f45646b + ", w=" + this.f45647c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45648f + ", d=" + this.f45649g + ", tx=" + this.h + ", ty=" + this.f45650i + '}';
    }
}
