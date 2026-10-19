package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45215j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45216k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45217l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45218m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45219a;
    public final double f45220b;
    public final double f45221c;
    public final double d;
    public final double e;
    public final double f45222f;
    public final double f45223g;
    public final double h;
    public final double f45224i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45219a = d13;
        this.f45220b = d14;
        this.f45221c = d15;
        this.d = d;
        this.e = d10;
        this.f45222f = d11;
        this.f45223g = d12;
        this.h = d16;
        this.f45224i = d17;
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
        e5.b.m(byteBuffer, this.f45219a);
        e5.b.n(byteBuffer, this.f45222f);
        e5.b.n(byteBuffer, this.f45223g);
        e5.b.m(byteBuffer, this.f45220b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45224i);
        e5.b.m(byteBuffer, this.f45221c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45222f, this.f45222f) == 0 && Double.compare(dVar.f45223g, this.f45223g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45224i, this.f45224i) == 0 && Double.compare(dVar.f45219a, this.f45219a) == 0 && Double.compare(dVar.f45220b, this.f45220b) == 0 && Double.compare(dVar.f45221c, this.f45221c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45219a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45220b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45221c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45222f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45223g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45224i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45215j)) {
            return "Rotate 0°";
        }
        if (equals(f45216k)) {
            return "Rotate 90°";
        }
        if (equals(f45217l)) {
            return "Rotate 180°";
        }
        if (equals(f45218m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45219a + ", v=" + this.f45220b + ", w=" + this.f45221c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45222f + ", d=" + this.f45223g + ", tx=" + this.h + ", ty=" + this.f45224i + '}';
    }
}
