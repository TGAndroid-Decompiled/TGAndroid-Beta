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
    public final int f56462a;
    public final String f56463b;
    public final String f56464c;
    public final int d;
    public final int f56465e;
    public final int f56466f;
    public final int f56467g;
    public final byte[] h;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f56462a = i7;
        this.f56463b = str;
        this.f56464c = str2;
        this.d = i10;
        this.f56465e = i11;
        this.f56466f = i12;
        this.f56467g = i13;
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
        n0Var.a(this.f56462a, this.h);
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
            if (this.f56462a == aVar.f56462a && this.f56463b.equals(aVar.f56463b) && this.f56464c.equals(aVar.f56464c) && this.d == aVar.d && this.f56465e == aVar.f56465e && this.f56466f == aVar.f56466f && this.f56467g == aVar.f56467g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((e2.h(e2.h((527 + this.f56462a) * 31, 31, this.f56463b), 31, this.f56464c) + this.d) * 31) + this.f56465e) * 31) + this.f56466f) * 31) + this.f56467g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f56463b + ", description=" + this.f56464c;
    }
}
