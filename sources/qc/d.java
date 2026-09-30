package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41660j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41661k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41662l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41663m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41664a;
    public final double f41665b;
    public final double f41666c;
    public final double d;
    public final double e;
    public final double f41667f;
    public final double f41668g;
    public final double h;
    public final double f41669i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41664a = d13;
        this.f41665b = d14;
        this.f41666c = d15;
        this.d = d;
        this.e = d10;
        this.f41667f = d11;
        this.f41668g = d12;
        this.h = d16;
        this.f41669i = d17;
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
        e5.b.m(byteBuffer, this.f41664a);
        e5.b.n(byteBuffer, this.f41667f);
        e5.b.n(byteBuffer, this.f41668g);
        e5.b.m(byteBuffer, this.f41665b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41669i);
        e5.b.m(byteBuffer, this.f41666c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41667f, this.f41667f) == 0 && Double.compare(dVar.f41668g, this.f41668g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41669i, this.f41669i) == 0 && Double.compare(dVar.f41664a, this.f41664a) == 0 && Double.compare(dVar.f41665b, this.f41665b) == 0 && Double.compare(dVar.f41666c, this.f41666c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41664a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41665b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41666c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41667f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41668g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41669i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41660j)) {
            return "Rotate 0°";
        }
        if (equals(f41661k)) {
            return "Rotate 90°";
        }
        if (equals(f41662l)) {
            return "Rotate 180°";
        }
        if (equals(f41663m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41664a + ", v=" + this.f41665b + ", w=" + this.f41666c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41667f + ", d=" + this.f41668g + ", tx=" + this.h + ", ty=" + this.f41669i + '}';
    }
}
