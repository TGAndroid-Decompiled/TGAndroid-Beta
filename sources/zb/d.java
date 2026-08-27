package zb;

import java.nio.ByteBuffer;

public final class d {

    public static final d f50320j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    public static final d f50321k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    public static final d f50322l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    public static final d f50323m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    public final double f50324a;

    public final double f50325b;

    public final double f50326c;
    public final double d;

    public final double f50327e;

    public final double f50328f;

    public final double f50329g;
    public final double h;

    public final double f50330i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f50324a = d13;
        this.f50325b = d14;
        this.f50326c = d15;
        this.d = d;
        this.f50327e = d10;
        this.f50328f = d11;
        this.f50329g = d12;
        this.h = d16;
        this.f50330i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double dF = p2.b.f(byteBuffer);
        double dF2 = p2.b.f(byteBuffer);
        double dE = p2.b.e(byteBuffer);
        return new d(dF, dF2, p2.b.f(byteBuffer), p2.b.f(byteBuffer), dE, p2.b.e(byteBuffer), p2.b.e(byteBuffer), p2.b.f(byteBuffer), p2.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        p2.b.n(byteBuffer, this.d);
        p2.b.n(byteBuffer, this.f50327e);
        p2.b.m(byteBuffer, this.f50324a);
        p2.b.n(byteBuffer, this.f50328f);
        p2.b.n(byteBuffer, this.f50329g);
        p2.b.m(byteBuffer, this.f50325b);
        p2.b.n(byteBuffer, this.h);
        p2.b.n(byteBuffer, this.f50330i);
        p2.b.m(byteBuffer, this.f50326c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f50327e, this.f50327e) == 0 && Double.compare(dVar.f50328f, this.f50328f) == 0 && Double.compare(dVar.f50329g, this.f50329g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f50330i, this.f50330i) == 0 && Double.compare(dVar.f50324a, this.f50324a) == 0 && Double.compare(dVar.f50325b, this.f50325b) == 0 && Double.compare(dVar.f50326c, this.f50326c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f50324a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f50325b);
        int i10 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f50326c);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f50327e);
        int i13 = (i12 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f50328f);
        int i14 = (i13 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f50329g);
        int i15 = (i14 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.h);
        int i16 = (i15 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f50330i);
        return (i16 * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f50320j)) {
            return "Rotate 0°";
        }
        if (equals(f50321k)) {
            return "Rotate 90°";
        }
        if (equals(f50322l)) {
            return "Rotate 180°";
        }
        if (equals(f50323m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f50324a + ", v=" + this.f50325b + ", w=" + this.f50326c + ", a=" + this.d + ", b=" + this.f50327e + ", c=" + this.f50328f + ", d=" + this.f50329g + ", tx=" + this.h + ", ty=" + this.f50330i + '}';
    }
}
