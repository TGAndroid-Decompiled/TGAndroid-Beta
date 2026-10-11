package qc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f46222j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46223k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46224l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f46225m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f46226a;
    public final double f46227b;
    public final double f46228c;
    public final double d;
    public final double f46229e;
    public final double f46230f;
    public final double f46231g;
    public final double h;
    public final double f46232i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f46226a = d13;
        this.f46227b = d14;
        this.f46228c = d15;
        this.d = d;
        this.f46229e = d10;
        this.f46230f = d11;
        this.f46231g = d12;
        this.h = d16;
        this.f46232i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e7 = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e7, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.f46229e);
        e5.b.m(byteBuffer, this.f46226a);
        e5.b.n(byteBuffer, this.f46230f);
        e5.b.n(byteBuffer, this.f46231g);
        e5.b.m(byteBuffer, this.f46227b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f46232i);
        e5.b.m(byteBuffer, this.f46228c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f46229e, this.f46229e) == 0 && Double.compare(dVar.f46230f, this.f46230f) == 0 && Double.compare(dVar.f46231g, this.f46231g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f46232i, this.f46232i) == 0 && Double.compare(dVar.f46226a, this.f46226a) == 0 && Double.compare(dVar.f46227b, this.f46227b) == 0 && Double.compare(dVar.f46228c, this.f46228c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46226a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46227b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f46228c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f46229e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f46230f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f46231g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f46232i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f46222j)) {
            return "Rotate 0°";
        }
        if (equals(f46223k)) {
            return "Rotate 90°";
        }
        if (equals(f46224l)) {
            return "Rotate 180°";
        }
        if (equals(f46225m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f46226a + ", v=" + this.f46227b + ", w=" + this.f46228c + ", a=" + this.d + ", b=" + this.f46229e + ", c=" + this.f46230f + ", d=" + this.f46231g + ", tx=" + this.h + ", ty=" + this.f46232i + '}';
    }
}
