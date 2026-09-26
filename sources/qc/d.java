package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41561j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41562k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41563l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41564m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41565a;
    public final double f41566b;
    public final double f41567c;
    public final double d;
    public final double e;
    public final double f41568f;
    public final double f41569g;
    public final double h;
    public final double f41570i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41565a = d13;
        this.f41566b = d14;
        this.f41567c = d15;
        this.d = d;
        this.e = d10;
        this.f41568f = d11;
        this.f41569g = d12;
        this.h = d16;
        this.f41570i = d17;
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
        e5.b.m(byteBuffer, this.f41565a);
        e5.b.n(byteBuffer, this.f41568f);
        e5.b.n(byteBuffer, this.f41569g);
        e5.b.m(byteBuffer, this.f41566b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41570i);
        e5.b.m(byteBuffer, this.f41567c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41568f, this.f41568f) == 0 && Double.compare(dVar.f41569g, this.f41569g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41570i, this.f41570i) == 0 && Double.compare(dVar.f41565a, this.f41565a) == 0 && Double.compare(dVar.f41566b, this.f41566b) == 0 && Double.compare(dVar.f41567c, this.f41567c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41565a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41566b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41567c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41568f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41569g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41570i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41561j)) {
            return "Rotate 0°";
        }
        if (equals(f41562k)) {
            return "Rotate 90°";
        }
        if (equals(f41563l)) {
            return "Rotate 180°";
        }
        if (equals(f41564m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41565a + ", v=" + this.f41566b + ", w=" + this.f41567c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41568f + ", d=" + this.f41569g + ", tx=" + this.h + ", ty=" + this.f41570i + '}';
    }
}
