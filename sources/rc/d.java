package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45217j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45218k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45219l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45220m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45221a;
    public final double f45222b;
    public final double f45223c;
    public final double d;
    public final double e;
    public final double f45224f;
    public final double f45225g;
    public final double h;
    public final double f45226i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45221a = d13;
        this.f45222b = d14;
        this.f45223c = d15;
        this.d = d;
        this.e = d10;
        this.f45224f = d11;
        this.f45225g = d12;
        this.h = d16;
        this.f45226i = d17;
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
        e5.b.m(byteBuffer, this.f45221a);
        e5.b.n(byteBuffer, this.f45224f);
        e5.b.n(byteBuffer, this.f45225g);
        e5.b.m(byteBuffer, this.f45222b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45226i);
        e5.b.m(byteBuffer, this.f45223c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45224f, this.f45224f) == 0 && Double.compare(dVar.f45225g, this.f45225g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45226i, this.f45226i) == 0 && Double.compare(dVar.f45221a, this.f45221a) == 0 && Double.compare(dVar.f45222b, this.f45222b) == 0 && Double.compare(dVar.f45223c, this.f45223c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45221a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45222b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45223c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45224f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45225g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45226i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45217j)) {
            return "Rotate 0°";
        }
        if (equals(f45218k)) {
            return "Rotate 90°";
        }
        if (equals(f45219l)) {
            return "Rotate 180°";
        }
        if (equals(f45220m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45221a + ", v=" + this.f45222b + ", w=" + this.f45223c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45224f + ", d=" + this.f45225g + ", tx=" + this.h + ", ty=" + this.f45226i + '}';
    }
}
