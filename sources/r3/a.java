package r3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.u;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements p0 {
    public final int f54407a;
    public final String f54408b;
    public final String f54409c;
    public final int d;
    public final int f54410e;
    public final int f54411f;
    public final int f54412g;
    public final byte[] h;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f54407a = i7;
        this.f54408b = str;
        this.f54409c = str2;
        this.d = i10;
        this.f54410e = i11;
        this.f54411f = i12;
        this.f54412g = i13;
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
        n0Var.a(this.f54407a, this.h);
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
            if (this.f54407a == aVar.f54407a && this.f54408b.equals(aVar.f54408b) && this.f54409c.equals(aVar.f54409c) && this.d == aVar.d && this.f54410e == aVar.f54410e && this.f54411f == aVar.f54411f && this.f54412g == aVar.f54412g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h((527 + this.f54407a) * 31, 31, this.f54408b), 31, this.f54409c) + this.d) * 31) + this.f54410e) * 31) + this.f54411f) * 31) + this.f54412g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f54408b + ", description=" + this.f54409c;
    }
}
