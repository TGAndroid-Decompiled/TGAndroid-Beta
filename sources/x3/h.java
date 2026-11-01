package x3;

import b2.u0;
import b2.v0;
import b2.w;
import e2.x;
import e9.n0;
import f2.q;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends i {
    public static final byte[] f53000o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f53001p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f53002n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i10 = xVar.f6208b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f6207a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f53008i * q.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(x xVar, long j10, m5.e eVar) {
        if (e(xVar, f53000o)) {
            byte[] copyOf = Arrays.copyOf(xVar.f6207a, xVar.f6209c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = q.a(copyOf);
            if (((b2.x) eVar.f13014b) == null) {
                w wVar = new w();
                wVar.f2369q = v0.n("audio/ogg");
                wVar.f2370r = v0.n("audio/opus");
                wVar.J = i10;
                wVar.K = 48000;
                wVar.f2373u = a2;
                eVar.f13014b = new b2.x(wVar);
                return true;
            }
        } else if (e(xVar, f53001p)) {
            ((b2.x) eVar.f13014b).getClass();
            if (!this.f53002n) {
                this.f53002n = true;
                xVar.O(8);
                u0 r10 = c3.b.r(n0.v((String[]) c3.b.u(xVar, false, false).f279b));
                if (r10 != null) {
                    w a10 = ((b2.x) eVar.f13014b).a();
                    a10.f2363k = r10.b(((b2.x) eVar.f13014b).f2416l);
                    eVar.f13014b = new b2.x(a10);
                    return true;
                }
            }
        } else {
            ((b2.x) eVar.f13014b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f53002n = false;
        }
    }
}
