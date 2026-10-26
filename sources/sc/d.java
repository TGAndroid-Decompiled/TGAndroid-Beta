package sc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f48082j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f48083k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f48084l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f48085m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f48086a;
    public final double f48087b;
    public final double f48088c;
    public final double d;
    public final double e;
    public final double f48089f;
    public final double f48090g;
    public final double h;
    public final double f48091i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f48086a = d13;
        this.f48087b = d14;
        this.f48088c = d15;
        this.d = d;
        this.e = d10;
        this.f48089f = d11;
        this.f48090g = d12;
        this.h = d16;
        this.f48091i = d17;
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
        f5.b.m(byteBuffer, this.f48086a);
        f5.b.n(byteBuffer, this.f48089f);
        f5.b.n(byteBuffer, this.f48090g);
        f5.b.m(byteBuffer, this.f48087b);
        f5.b.n(byteBuffer, this.h);
        f5.b.n(byteBuffer, this.f48091i);
        f5.b.m(byteBuffer, this.f48088c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f48089f, this.f48089f) == 0 && Double.compare(dVar.f48090g, this.f48090g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f48091i, this.f48091i) == 0 && Double.compare(dVar.f48086a, this.f48086a) == 0 && Double.compare(dVar.f48087b, this.f48087b) == 0 && Double.compare(dVar.f48088c, this.f48088c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f48086a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f48087b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f48088c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f48089f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f48090g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f48091i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f48082j)) {
            return "Rotate 0°";
        }
        if (equals(f48083k)) {
            return "Rotate 90°";
        }
        if (equals(f48084l)) {
            return "Rotate 180°";
        }
        if (equals(f48085m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f48086a + ", v=" + this.f48087b + ", w=" + this.f48088c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f48089f + ", d=" + this.f48090g + ", tx=" + this.h + ", ty=" + this.f48091i + '}';
    }
}
