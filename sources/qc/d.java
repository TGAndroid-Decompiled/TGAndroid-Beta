package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f41591j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41592k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41593l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f41594m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f41595a;
    public final double f41596b;
    public final double f41597c;
    public final double d;
    public final double e;
    public final double f41598f;
    public final double f41599g;
    public final double h;
    public final double f41600i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f41595a = d13;
        this.f41596b = d14;
        this.f41597c = d15;
        this.d = d;
        this.e = d10;
        this.f41598f = d11;
        this.f41599g = d12;
        this.h = d16;
        this.f41600i = d17;
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
        e5.b.m(byteBuffer, this.f41595a);
        e5.b.n(byteBuffer, this.f41598f);
        e5.b.n(byteBuffer, this.f41599g);
        e5.b.m(byteBuffer, this.f41596b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f41600i);
        e5.b.m(byteBuffer, this.f41597c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f41598f, this.f41598f) == 0 && Double.compare(dVar.f41599g, this.f41599g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f41600i, this.f41600i) == 0 && Double.compare(dVar.f41595a, this.f41595a) == 0 && Double.compare(dVar.f41596b, this.f41596b) == 0 && Double.compare(dVar.f41597c, this.f41597c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f41595a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f41596b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f41597c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f41598f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f41599g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f41600i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f41591j)) {
            return "Rotate 0°";
        }
        if (equals(f41592k)) {
            return "Rotate 90°";
        }
        if (equals(f41593l)) {
            return "Rotate 180°";
        }
        if (equals(f41594m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f41595a + ", v=" + this.f41596b + ", w=" + this.f41597c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f41598f + ", d=" + this.f41599g + ", tx=" + this.h + ", ty=" + this.f41600i + '}';
    }
}
