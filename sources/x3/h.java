package x3;

import b2.u0;
import b2.w;
import b2.w0;
import e2.x;
import e9.n0;
import f2.p;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends i {
    public static final byte[] f47816o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f47817p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f47818n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i10 = xVar.f8415b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8414a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f47824i * p.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(x xVar, long j10, n3.b bVar) {
        if (e(xVar, f47816o)) {
            byte[] copyOf = Arrays.copyOf(xVar.f8414a, xVar.f8416c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = p.a(copyOf);
            if (((b2.x) bVar.f15703b) == null) {
                w wVar = new w();
                wVar.f2469q = w0.n("audio/ogg");
                wVar.f2470r = w0.n("audio/opus");
                wVar.J = i10;
                wVar.K = 48000;
                wVar.f2473u = a2;
                bVar.f15703b = new b2.x(wVar);
                return true;
            }
        } else if (e(xVar, f47817p)) {
            ((b2.x) bVar.f15703b).getClass();
            if (!this.f47818n) {
                this.f47818n = true;
                xVar.O(8);
                u0 r10 = c3.b.r(n0.v(c3.b.u(xVar, false, false).f4270a));
                if (r10 != null) {
                    w a10 = ((b2.x) bVar.f15703b).a();
                    a10.f2463k = r10.b(((b2.x) bVar.f15703b).f2516l);
                    bVar.f15703b = new b2.x(a10);
                    return true;
                }
            }
        } else {
            ((b2.x) bVar.f15703b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f47818n = false;
        }
    }
}
