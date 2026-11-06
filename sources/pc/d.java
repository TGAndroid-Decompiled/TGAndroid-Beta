package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f53446j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53447k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53448l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53449m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f53450a;
    public final double f53451b;
    public final double f53452c;
    public final double d;
    public final double f53453e;
    public final double f53454f;
    public final double f53455g;
    public final double h;
    public final double f53456i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f53450a = d12;
        this.f53451b = d13;
        this.f53452c = d14;
        this.d = d;
        this.f53453e = d2;
        this.f53454f = d10;
        this.f53455g = d11;
        this.h = d15;
        this.f53456i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f53453e);
        h5.b.m(byteBuffer, this.f53450a);
        h5.b.n(byteBuffer, this.f53454f);
        h5.b.n(byteBuffer, this.f53455g);
        h5.b.m(byteBuffer, this.f53451b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f53456i);
        h5.b.m(byteBuffer, this.f53452c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f53453e, this.f53453e) == 0 && Double.compare(dVar.f53454f, this.f53454f) == 0 && Double.compare(dVar.f53455g, this.f53455g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f53456i, this.f53456i) == 0 && Double.compare(dVar.f53450a, this.f53450a) == 0 && Double.compare(dVar.f53451b, this.f53451b) == 0 && Double.compare(dVar.f53452c, this.f53452c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53450a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53451b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f53452c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f53453e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f53454f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f53455g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f53456i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f53446j)) {
            return "Rotate 0°";
        }
        if (equals(f53447k)) {
            return "Rotate 90°";
        }
        if (equals(f53448l)) {
            return "Rotate 180°";
        }
        if (equals(f53449m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f53450a + ", v=" + this.f53451b + ", w=" + this.f53452c + ", a=" + this.d + ", b=" + this.f53453e + ", c=" + this.f53454f + ", d=" + this.f53455g + ", tx=" + this.h + ", ty=" + this.f53456i + '}';
    }
}
