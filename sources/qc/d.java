package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41563j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41564k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41565l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41566m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41567a;
    public final double f41568b;
    public final double f41569c;
    public final double d;
    public final double e;
    public final double f41570f;
    public final double f41571g;
    public final double h;
    public final double f41572i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41567a = d13;
        this.f41568b = d14;
        this.f41569c = d15;
        this.d = d;
        this.e = d10;
        this.f41570f = d11;
        this.f41571g = d12;
        this.h = d16;
        this.f41572i = d17;
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
        e5.b.m(byteBuffer, this.f41567a);
        e5.b.n(byteBuffer, this.f41570f);
        e5.b.n(byteBuffer, this.f41571g);
        e5.b.m(byteBuffer, this.f41568b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41572i);
        e5.b.m(byteBuffer, this.f41569c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41570f, this.f41570f) == 0 && Double.compare(dVar.f41571g, this.f41571g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41572i, this.f41572i) == 0 && Double.compare(dVar.f41567a, this.f41567a) == 0 && Double.compare(dVar.f41568b, this.f41568b) == 0 && Double.compare(dVar.f41569c, this.f41569c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41567a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41568b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41569c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41570f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41571g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41572i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41563j)) {
            return "Rotate 0°";
        }
        if (equals(f41564k)) {
            return "Rotate 90°";
        }
        if (equals(f41565l)) {
            return "Rotate 180°";
        }
        if (equals(f41566m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41567a + ", v=" + this.f41568b + ", w=" + this.f41569c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41570f + ", d=" + this.f41571g + ", tx=" + this.h + ", ty=" + this.f41572i + '}';
    }
}
