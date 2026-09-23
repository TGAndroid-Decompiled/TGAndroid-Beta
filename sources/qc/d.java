package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41224j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41225k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41226l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41227m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41228a;
    public final double f41229b;
    public final double f41230c;
    public final double d;
    public final double e;
    public final double f41231f;
    public final double f41232g;
    public final double h;
    public final double f41233i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41228a = d13;
        this.f41229b = d14;
        this.f41230c = d15;
        this.d = d;
        this.e = d10;
        this.f41231f = d11;
        this.f41232g = d12;
        this.h = d16;
        this.f41233i = d17;
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
        e5.b.m(byteBuffer, this.f41228a);
        e5.b.n(byteBuffer, this.f41231f);
        e5.b.n(byteBuffer, this.f41232g);
        e5.b.m(byteBuffer, this.f41229b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41233i);
        e5.b.m(byteBuffer, this.f41230c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41231f, this.f41231f) == 0 && Double.compare(dVar.f41232g, this.f41232g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41233i, this.f41233i) == 0 && Double.compare(dVar.f41228a, this.f41228a) == 0 && Double.compare(dVar.f41229b, this.f41229b) == 0 && Double.compare(dVar.f41230c, this.f41230c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41228a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41229b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41230c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41231f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41232g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41233i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41224j)) {
            return "Rotate 0°";
        }
        if (equals(f41225k)) {
            return "Rotate 90°";
        }
        if (equals(f41226l)) {
            return "Rotate 180°";
        }
        if (equals(f41227m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41228a + ", v=" + this.f41229b + ", w=" + this.f41230c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41231f + ", d=" + this.f41232g + ", tx=" + this.h + ", ty=" + this.f41233i + '}';
    }
}
