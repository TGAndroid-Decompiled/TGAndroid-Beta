package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45229j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45230k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45231l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45232m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45233a;
    public final double f45234b;
    public final double f45235c;
    public final double d;
    public final double e;
    public final double f45236f;
    public final double f45237g;
    public final double h;
    public final double f45238i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45233a = d13;
        this.f45234b = d14;
        this.f45235c = d15;
        this.d = d;
        this.e = d10;
        this.f45236f = d11;
        this.f45237g = d12;
        this.h = d16;
        this.f45238i = d17;
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
        e5.b.m(byteBuffer, this.f45233a);
        e5.b.n(byteBuffer, this.f45236f);
        e5.b.n(byteBuffer, this.f45237g);
        e5.b.m(byteBuffer, this.f45234b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45238i);
        e5.b.m(byteBuffer, this.f45235c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45236f, this.f45236f) == 0 && Double.compare(dVar.f45237g, this.f45237g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45238i, this.f45238i) == 0 && Double.compare(dVar.f45233a, this.f45233a) == 0 && Double.compare(dVar.f45234b, this.f45234b) == 0 && Double.compare(dVar.f45235c, this.f45235c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45233a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45234b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45235c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45236f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45237g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45238i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45229j)) {
            return "Rotate 0°";
        }
        if (equals(f45230k)) {
            return "Rotate 90°";
        }
        if (equals(f45231l)) {
            return "Rotate 180°";
        }
        if (equals(f45232m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45233a + ", v=" + this.f45234b + ", w=" + this.f45235c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45236f + ", d=" + this.f45237g + ", tx=" + this.h + ", ty=" + this.f45238i + '}';
    }
}
