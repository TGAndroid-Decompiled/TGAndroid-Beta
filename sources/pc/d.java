package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f53470j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53471k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53472l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53473m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f53474a;
    public final double f53475b;
    public final double f53476c;
    public final double d;
    public final double f53477e;
    public final double f53478f;
    public final double f53479g;
    public final double h;
    public final double f53480i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f53474a = d12;
        this.f53475b = d13;
        this.f53476c = d14;
        this.d = d;
        this.f53477e = d2;
        this.f53478f = d10;
        this.f53479g = d11;
        this.h = d15;
        this.f53480i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f53477e);
        h5.b.m(byteBuffer, this.f53474a);
        h5.b.n(byteBuffer, this.f53478f);
        h5.b.n(byteBuffer, this.f53479g);
        h5.b.m(byteBuffer, this.f53475b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f53480i);
        h5.b.m(byteBuffer, this.f53476c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f53477e, this.f53477e) == 0 && Double.compare(dVar.f53478f, this.f53478f) == 0 && Double.compare(dVar.f53479g, this.f53479g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f53480i, this.f53480i) == 0 && Double.compare(dVar.f53474a, this.f53474a) == 0 && Double.compare(dVar.f53475b, this.f53475b) == 0 && Double.compare(dVar.f53476c, this.f53476c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53474a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53475b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f53476c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f53477e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f53478f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f53479g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f53480i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f53470j)) {
            return "Rotate 0°";
        }
        if (equals(f53471k)) {
            return "Rotate 90°";
        }
        if (equals(f53472l)) {
            return "Rotate 180°";
        }
        if (equals(f53473m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f53474a + ", v=" + this.f53475b + ", w=" + this.f53476c + ", a=" + this.d + ", b=" + this.f53477e + ", c=" + this.f53478f + ", d=" + this.f53479g + ", tx=" + this.h + ", ty=" + this.f53480i + '}';
    }
}
