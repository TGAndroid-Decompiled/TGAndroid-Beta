package r3;

import e2.n0;
import e2.p0;
import e2.s0;
import e2.u;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements p0 {
    public final int f54395a;
    public final String f54396b;
    public final String f54397c;
    public final int d;
    public final int f54398e;
    public final int f54399f;
    public final int f54400g;
    public final byte[] h;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f54395a = i7;
        this.f54396b = str;
        this.f54397c = str2;
        this.d = i10;
        this.f54398e = i11;
        this.f54399f = i12;
        this.f54400g = i13;
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
        n0Var.a(this.f54395a, this.h);
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
            if (this.f54395a == aVar.f54395a && this.f54396b.equals(aVar.f54396b) && this.f54397c.equals(aVar.f54397c) && this.d == aVar.d && this.f54398e == aVar.f54398e && this.f54399f == aVar.f54399f && this.f54400g == aVar.f54400g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h((527 + this.f54395a) * 31, 31, this.f54396b), 31, this.f54397c) + this.d) * 31) + this.f54398e) * 31) + this.f54399f) * 31) + this.f54400g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f54396b + ", description=" + this.f54397c;
    }
}
