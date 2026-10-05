package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f44953j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44954k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44955l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f44956m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f44957a;
    public final double f44958b;
    public final double f44959c;
    public final double d;
    public final double f44960e;
    public final double f44961f;
    public final double f44962g;
    public final double h;
    public final double f44963i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f44957a = d13;
        this.f44958b = d14;
        this.f44959c = d15;
        this.d = d;
        this.f44960e = d10;
        this.f44961f = d11;
        this.f44962g = d12;
        this.h = d16;
        this.f44963i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f44960e);
        e5.b.m(byteBuffer, this.f44957a);
        e5.b.n(byteBuffer, this.f44961f);
        e5.b.n(byteBuffer, this.f44962g);
        e5.b.m(byteBuffer, this.f44958b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f44963i);
        e5.b.m(byteBuffer, this.f44959c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f44960e, this.f44960e) == 0 && Double.compare(dVar.f44961f, this.f44961f) == 0 && Double.compare(dVar.f44962g, this.f44962g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f44963i, this.f44963i) == 0 && Double.compare(dVar.f44957a, this.f44957a) == 0 && Double.compare(dVar.f44958b, this.f44958b) == 0 && Double.compare(dVar.f44959c, this.f44959c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f44957a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f44958b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f44959c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f44960e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f44961f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f44962g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f44963i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f44953j)) {
            return "Rotate 0°";
        }
        if (equals(f44954k)) {
            return "Rotate 90°";
        }
        if (equals(f44955l)) {
            return "Rotate 180°";
        }
        if (equals(f44956m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f44957a + ", v=" + this.f44958b + ", w=" + this.f44959c + ", a=" + this.d + ", b=" + this.f44960e + ", c=" + this.f44961f + ", d=" + this.f44962g + ", tx=" + this.h + ", ty=" + this.f44963i + '}';
    }
}
