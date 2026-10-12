package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44128j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44129k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44130l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44131m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44132a;
    public final double f44133b;
    public final double f44134c;
    public final double d;
    public final double e;
    public final double f44135f;
    public final double f44136g;
    public final double h;
    public final double f44137i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44132a = d13;
        this.f44133b = d14;
        this.f44134c = d15;
        this.d = d;
        this.e = d10;
        this.f44135f = d11;
        this.f44136g = d12;
        this.h = d16;
        this.f44137i = d17;
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
        e5.b.m(byteBuffer, this.f44132a);
        e5.b.n(byteBuffer, this.f44135f);
        e5.b.n(byteBuffer, this.f44136g);
        e5.b.m(byteBuffer, this.f44133b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44137i);
        e5.b.m(byteBuffer, this.f44134c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f44135f, this.f44135f) == 0 && Double.compare(dVar.f44136g, this.f44136g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44137i, this.f44137i) == 0 && Double.compare(dVar.f44132a, this.f44132a) == 0 && Double.compare(dVar.f44133b, this.f44133b) == 0 && Double.compare(dVar.f44134c, this.f44134c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44132a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44133b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44134c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44135f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44136g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44137i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f44128j)) {
            return "Rotate 0°";
        }
        if (equals(f44129k)) {
            return "Rotate 90°";
        }
        if (equals(f44130l)) {
            return "Rotate 180°";
        }
        if (equals(f44131m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44132a + ", v=" + this.f44133b + ", w=" + this.f44134c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f44135f + ", d=" + this.f44136g + ", tx=" + this.h + ", ty=" + this.f44137i + '}';
    }
}
