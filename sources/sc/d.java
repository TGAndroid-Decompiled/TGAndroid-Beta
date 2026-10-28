package sc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f48120j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f48121k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f48122l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f48123m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f48124a;
    public final double f48125b;
    public final double f48126c;
    public final double d;
    public final double e;
    public final double f48127f;
    public final double f48128g;
    public final double h;
    public final double f48129i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f48124a = d13;
        this.f48125b = d14;
        this.f48126c = d15;
        this.d = d;
        this.e = d10;
        this.f48127f = d11;
        this.f48128g = d12;
        this.h = d16;
        this.f48129i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = f5.b.f(byteBuffer);
        double f10 = f5.b.f(byteBuffer);
        double e = f5.b.e(byteBuffer);
        return new d(f7, f10, f5.b.f(byteBuffer), f5.b.f(byteBuffer), e, f5.b.e(byteBuffer), f5.b.e(byteBuffer), f5.b.f(byteBuffer), f5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        f5.b.n(byteBuffer, this.d);
        f5.b.n(byteBuffer, this.e);
        f5.b.m(byteBuffer, this.f48124a);
        f5.b.n(byteBuffer, this.f48127f);
        f5.b.n(byteBuffer, this.f48128g);
        f5.b.m(byteBuffer, this.f48125b);
        f5.b.n(byteBuffer, this.h);
        f5.b.n(byteBuffer, this.f48129i);
        f5.b.m(byteBuffer, this.f48126c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f48127f, this.f48127f) == 0 && Double.compare(dVar.f48128g, this.f48128g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f48129i, this.f48129i) == 0 && Double.compare(dVar.f48124a, this.f48124a) == 0 && Double.compare(dVar.f48125b, this.f48125b) == 0 && Double.compare(dVar.f48126c, this.f48126c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f48124a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f48125b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f48126c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f48127f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f48128g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f48129i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f48120j)) {
            return "Rotate 0°";
        }
        if (equals(f48121k)) {
            return "Rotate 90°";
        }
        if (equals(f48122l)) {
            return "Rotate 180°";
        }
        if (equals(f48123m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f48124a + ", v=" + this.f48125b + ", w=" + this.f48126c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f48127f + ", d=" + this.f48128g + ", tx=" + this.h + ", ty=" + this.f48129i + '}';
    }
}
