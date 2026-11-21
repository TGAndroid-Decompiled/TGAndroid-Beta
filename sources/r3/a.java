package r3;

import com.google.android.gms.internal.vision.e2;
import e2.n0;
import e2.p0;
import e2.s0;
import e2.u;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements p0 {
    public final int f56493a;
    public final String f56494b;
    public final String f56495c;
    public final int d;
    public final int f56496e;
    public final int f56497f;
    public final int f56498g;
    public final byte[] h;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f56493a = i7;
        this.f56494b = str;
        this.f56495c = str2;
        this.d = i10;
        this.f56496e = i11;
        this.f56497f = i12;
        this.f56498g = i13;
        this.h = bArr;
    }

    public static a d(x xVar) {
        int m10 = xVar.m();
        String n10 = s0.n(xVar.y(xVar.m(), StandardCharsets.US_ASCII));
        String y10 = xVar.y(xVar.m(), StandardCharsets.UTF_8);
        int m11 = xVar.m();
        int m12 = xVar.m();
        int m13 = xVar.m();
        int m14 = xVar.m();
        int m15 = xVar.m();
        byte[] bArr = new byte[m15];
        xVar.k(0, m15, bArr);
        return new a(m10, n10, y10, m11, m12, m13, m14, bArr);
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        n0Var.a(this.f56493a, this.h);
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f56493a == aVar.f56493a && this.f56494b.equals(aVar.f56494b) && this.f56495c.equals(aVar.f56495c) && this.d == aVar.d && this.f56496e == aVar.f56496e && this.f56497f == aVar.f56497f && this.f56498g == aVar.f56498g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((e2.h(e2.h((527 + this.f56493a) * 31, 31, this.f56494b), 31, this.f56495c) + this.d) * 31) + this.f56496e) * 31) + this.f56497f) * 31) + this.f56498g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f56494b + ", description=" + this.f56495c;
    }
}
