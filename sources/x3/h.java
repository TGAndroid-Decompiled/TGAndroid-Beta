package x3;

import b2.u0;
import b2.w;
import b2.w0;
import e2.x;
import f2.q;
import f9.i0;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends i {
    public static final byte[] f51444o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f51445p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f51446n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i10 = xVar.f9732b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f9731a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f51452i * q.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(x xVar, long j10, m4.c cVar) {
        if (e(xVar, f51444o)) {
            byte[] copyOf = Arrays.copyOf(xVar.f9731a, xVar.f9733c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = q.a(copyOf);
            if (((b2.x) cVar.f18008b) == null) {
                w wVar = new w();
                wVar.f3532q = w0.n("audio/ogg");
                wVar.f3533r = w0.n("audio/opus");
                wVar.J = i10;
                wVar.K = 48000;
                wVar.f3536u = a2;
                cVar.f18008b = new b2.x(wVar);
                return true;
            }
        } else if (e(xVar, f51445p)) {
            ((b2.x) cVar.f18008b).getClass();
            if (!this.f51446n) {
                this.f51446n = true;
                xVar.O(8);
                u0 r6 = c3.b.r(i0.v(c3.b.u(xVar, false, false).f6082a));
                if (r6 != null) {
                    w a10 = ((b2.x) cVar.f18008b).a();
                    a10.f3526k = r6.b(((b2.x) cVar.f18008b).f3579l);
                    cVar.f18008b = new b2.x(a10);
                    return true;
                }
            }
        } else {
            ((b2.x) cVar.f18008b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f51446n = false;
        }
    }
}
