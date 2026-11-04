package q3;

import d2.p0;
import d2.r0;
import d2.u0;
import d2.v;
import g2.y;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements r0 {
    public final int f53783a;
    public final String f53784b;
    public final String f53785c;
    public final int d;
    public final int f53786e;
    public final int f53787f;
    public final int f53788g;
    public final byte[] h;

    public a(int i3, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f53783a = i3;
        this.f53784b = str;
        this.f53785c = str2;
        this.d = i10;
        this.f53786e = i11;
        this.f53787f = i12;
        this.f53788g = i13;
        this.h = bArr;
    }

    public static a d(y yVar) {
        int m10 = yVar.m();
        String n4 = u0.n(yVar.y(yVar.m(), StandardCharsets.US_ASCII));
        String y9 = yVar.y(yVar.m(), StandardCharsets.UTF_8);
        int m11 = yVar.m();
        int m12 = yVar.m();
        int m13 = yVar.m();
        int m14 = yVar.m();
        int m15 = yVar.m();
        byte[] bArr = new byte[m15];
        yVar.k(0, m15, bArr);
        return new a(m10, n4, y9, m11, m12, m13, m14, bArr);
    }

    @Override
    public final void a(p0 p0Var) {
        p0Var.a(this.f53783a, this.h);
    }

    @Override
    public final v b() {
        return null;
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
            if (this.f53783a == aVar.f53783a && this.f53784b.equals(aVar.f53784b) && this.f53785c.equals(aVar.f53785c) && this.d == aVar.d && this.f53786e == aVar.f53786e && this.f53787f == aVar.f53787f && this.f53788g == aVar.f53788g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g((527 + this.f53783a) * 31, 31, this.f53784b), 31, this.f53785c) + this.d) * 31) + this.f53786e) * 31) + this.f53787f) * 31) + this.f53788g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f53784b + ", description=" + this.f53785c;
    }
}
