package pc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f53472j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53473k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53474l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f53475m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f53476a;
    public final double f53477b;
    public final double f53478c;
    public final double d;
    public final double f53479e;
    public final double f53480f;
    public final double f53481g;
    public final double h;
    public final double f53482i;

    public d(double d, double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f53476a = d12;
        this.f53477b = d13;
        this.f53478c = d14;
        this.d = d;
        this.f53479e = d2;
        this.f53480f = d10;
        this.f53481g = d11;
        this.h = d15;
        this.f53482i = d16;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = h5.b.f(byteBuffer);
        double f11 = h5.b.f(byteBuffer);
        double e10 = h5.b.e(byteBuffer);
        return new d(f10, f11, h5.b.f(byteBuffer), h5.b.f(byteBuffer), e10, h5.b.e(byteBuffer), h5.b.e(byteBuffer), h5.b.f(byteBuffer), h5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        h5.b.n(byteBuffer, this.d);
        h5.b.n(byteBuffer, this.f53479e);
        h5.b.m(byteBuffer, this.f53476a);
        h5.b.n(byteBuffer, this.f53480f);
        h5.b.n(byteBuffer, this.f53481g);
        h5.b.m(byteBuffer, this.f53477b);
        h5.b.n(byteBuffer, this.h);
        h5.b.n(byteBuffer, this.f53482i);
        h5.b.m(byteBuffer, this.f53478c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f53479e, this.f53479e) == 0 && Double.compare(dVar.f53480f, this.f53480f) == 0 && Double.compare(dVar.f53481g, this.f53481g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f53482i, this.f53482i) == 0 && Double.compare(dVar.f53476a, this.f53476a) == 0 && Double.compare(dVar.f53477b, this.f53477b) == 0 && Double.compare(dVar.f53478c, this.f53478c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53476a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53477b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f53478c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f53479e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f53480f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f53481g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f53482i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f53472j)) {
            return "Rotate 0°";
        }
        if (equals(f53473k)) {
            return "Rotate 90°";
        }
        if (equals(f53474l)) {
            return "Rotate 180°";
        }
        if (equals(f53475m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f53476a + ", v=" + this.f53477b + ", w=" + this.f53478c + ", a=" + this.d + ", b=" + this.f53479e + ", c=" + this.f53480f + ", d=" + this.f53481g + ", tx=" + this.h + ", ty=" + this.f53482i + '}';
    }
}
