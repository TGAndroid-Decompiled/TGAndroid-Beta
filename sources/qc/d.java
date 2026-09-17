package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44313j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44314k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44315l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44316m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44317a;
    public final double f44318b;
    public final double f44319c;
    public final double d;
    public final double f44320e;
    public final double f44321f;
    public final double f44322g;
    public final double h;
    public final double f44323i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44317a = d13;
        this.f44318b = d14;
        this.f44319c = d15;
        this.d = d;
        this.f44320e = d10;
        this.f44321f = d11;
        this.f44322g = d12;
        this.h = d16;
        this.f44323i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44320e);
        e5.b.m(byteBuffer, this.f44317a);
        e5.b.n(byteBuffer, this.f44321f);
        e5.b.n(byteBuffer, this.f44322g);
        e5.b.m(byteBuffer, this.f44318b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44323i);
        e5.b.m(byteBuffer, this.f44319c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44320e, this.f44320e) == 0 && Double.compare(dVar.f44321f, this.f44321f) == 0 && Double.compare(dVar.f44322g, this.f44322g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44323i, this.f44323i) == 0 && Double.compare(dVar.f44317a, this.f44317a) == 0 && Double.compare(dVar.f44318b, this.f44318b) == 0 && Double.compare(dVar.f44319c, this.f44319c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44317a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44318b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44319c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44320e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44321f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44322g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44323i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44313j)) {
            return "Rotate 0°";
        }
        if (equals(f44314k)) {
            return "Rotate 90°";
        }
        if (equals(f44315l)) {
            return "Rotate 180°";
        }
        if (equals(f44316m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44317a + ", v=" + this.f44318b + ", w=" + this.f44319c + ", a=" + this.d + ", b=" + this.f44320e + ", c=" + this.f44321f + ", d=" + this.f44322g + ", tx=" + this.h + ", ty=" + this.f44323i + '}';
    }
}
