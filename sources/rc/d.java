package rc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f45228j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45229k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45230l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f45231m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f45232a;
    public final double f45233b;
    public final double f45234c;
    public final double d;
    public final double e;
    public final double f45235f;
    public final double f45236g;
    public final double h;
    public final double f45237i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f45232a = d13;
        this.f45233b = d14;
        this.f45234c = d15;
        this.d = d;
        this.e = d10;
        this.f45235f = d11;
        this.f45236g = d12;
        this.h = d16;
        this.f45237i = d17;
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
        e5.b.m(byteBuffer, this.f45232a);
        e5.b.n(byteBuffer, this.f45235f);
        e5.b.n(byteBuffer, this.f45236g);
        e5.b.m(byteBuffer, this.f45233b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f45237i);
        e5.b.m(byteBuffer, this.f45234c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f45235f, this.f45235f) == 0 && Double.compare(dVar.f45236g, this.f45236g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f45237i, this.f45237i) == 0 && Double.compare(dVar.f45232a, this.f45232a) == 0 && Double.compare(dVar.f45233b, this.f45233b) == 0 && Double.compare(dVar.f45234c, this.f45234c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45232a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45233b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45234c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45235f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45236g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f45237i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f45228j)) {
            return "Rotate 0°";
        }
        if (equals(f45229k)) {
            return "Rotate 90°";
        }
        if (equals(f45230l)) {
            return "Rotate 180°";
        }
        if (equals(f45231m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f45232a + ", v=" + this.f45233b + ", w=" + this.f45234c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f45235f + ", d=" + this.f45236g + ", tx=" + this.h + ", ty=" + this.f45237i + '}';
    }
}
