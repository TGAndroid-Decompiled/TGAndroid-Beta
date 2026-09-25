package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41562j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41563k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41564l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41565m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41566a;
    public final double f41567b;
    public final double f41568c;
    public final double d;
    public final double e;
    public final double f41569f;
    public final double f41570g;
    public final double h;
    public final double f41571i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41566a = d13;
        this.f41567b = d14;
        this.f41568c = d15;
        this.d = d;
        this.e = d10;
        this.f41569f = d11;
        this.f41570g = d12;
        this.h = d16;
        this.f41571i = d17;
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
        e5.b.m(byteBuffer, this.f41566a);
        e5.b.n(byteBuffer, this.f41569f);
        e5.b.n(byteBuffer, this.f41570g);
        e5.b.m(byteBuffer, this.f41567b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41571i);
        e5.b.m(byteBuffer, this.f41568c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41569f, this.f41569f) == 0 && Double.compare(dVar.f41570g, this.f41570g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41571i, this.f41571i) == 0 && Double.compare(dVar.f41566a, this.f41566a) == 0 && Double.compare(dVar.f41567b, this.f41567b) == 0 && Double.compare(dVar.f41568c, this.f41568c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41566a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41567b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41568c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41569f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41570g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41571i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41562j)) {
            return "Rotate 0°";
        }
        if (equals(f41563k)) {
            return "Rotate 90°";
        }
        if (equals(f41564l)) {
            return "Rotate 180°";
        }
        if (equals(f41565m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41566a + ", v=" + this.f41567b + ", w=" + this.f41568c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41569f + ", d=" + this.f41570g + ", tx=" + this.h + ", ty=" + this.f41571i + '}';
    }
}
