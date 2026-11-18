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
    public final int f56452a;
    public final String f56453b;
    public final String f56454c;
    public final int d;
    public final int f56455e;
    public final int f56456f;
    public final int f56457g;
    public final byte[] h;

    public a(int i7, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f56452a = i7;
        this.f56453b = str;
        this.f56454c = str2;
        this.d = i10;
        this.f56455e = i11;
        this.f56456f = i12;
        this.f56457g = i13;
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
        n0Var.a(this.f56452a, this.h);
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
            if (this.f56452a == aVar.f56452a && this.f56453b.equals(aVar.f56453b) && this.f56454c.equals(aVar.f56454c) && this.d == aVar.d && this.f56455e == aVar.f56455e && this.f56456f == aVar.f56456f && this.f56457g == aVar.f56457g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((e2.h(e2.h((527 + this.f56452a) * 31, 31, this.f56453b), 31, this.f56454c) + this.d) * 31) + this.f56455e) * 31) + this.f56456f) * 31) + this.f56457g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f56453b + ", description=" + this.f56454c;
    }
}
