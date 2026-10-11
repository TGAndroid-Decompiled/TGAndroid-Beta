package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f46188j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46189k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46190l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46191m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f46192a;
    public final double f46193b;
    public final double f46194c;
    public final double d;
    public final double f46195e;
    public final double f46196f;
    public final double f46197g;
    public final double h;
    public final double f46198i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f46192a = d13;
        this.f46193b = d14;
        this.f46194c = d15;
        this.d = d;
        this.f46195e = d10;
        this.f46196f = d11;
        this.f46197g = d12;
        this.h = d16;
        this.f46198i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f46195e);
        e5.b.m(byteBuffer, this.f46192a);
        e5.b.n(byteBuffer, this.f46196f);
        e5.b.n(byteBuffer, this.f46197g);
        e5.b.m(byteBuffer, this.f46193b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f46198i);
        e5.b.m(byteBuffer, this.f46194c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f46195e, this.f46195e) == 0 && Double.compare(dVar.f46196f, this.f46196f) == 0 && Double.compare(dVar.f46197g, this.f46197g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f46198i, this.f46198i) == 0 && Double.compare(dVar.f46192a, this.f46192a) == 0 && Double.compare(dVar.f46193b, this.f46193b) == 0 && Double.compare(dVar.f46194c, this.f46194c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46192a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46193b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46194c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46195e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46196f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46197g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46198i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f46188j)) {
            return "Rotate 0°";
        }
        if (equals(f46189k)) {
            return "Rotate 90°";
        }
        if (equals(f46190l)) {
            return "Rotate 180°";
        }
        if (equals(f46191m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46192a + ", v=" + this.f46193b + ", w=" + this.f46194c + ", a=" + this.d + ", b=" + this.f46195e + ", c=" + this.f46196f + ", d=" + this.f46197g + ", tx=" + this.h + ", ty=" + this.f46198i + '}';
    }
}
