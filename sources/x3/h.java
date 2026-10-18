package x3;

import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import e2.x;
import e9.n0;
import f2.q;
import java.util.ArrayList;
import java.util.Arrays;
public final class h extends i {
    public static final byte[] f49250o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f49251p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f49252n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i10 = xVar.f8295b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8294a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f49258i * q.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(x xVar, long j10, n2.e eVar) {
        if (e(xVar, f49250o)) {
            byte[] copyOf = Arrays.copyOf(xVar.f8294a, xVar.f8296c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = q.a(copyOf);
            if (((w) eVar.f17042b) == null) {
                v vVar = new v();
                vVar.f4078q = v0.n("audio/ogg");
                vVar.f4079r = v0.n("audio/opus");
                vVar.J = i10;
                vVar.K = 48000;
                vVar.f4082u = a2;
                eVar.f17042b = new w(vVar);
                return true;
            }
        } else if (e(xVar, f49251p)) {
            ((w) eVar.f17042b).getClass();
            if (!this.f49252n) {
                this.f49252n = true;
                xVar.O(8);
                t0 r10 = c3.b.r(n0.v(c3.b.u(xVar, false, false).f4650a));
                if (r10 != null) {
                    v a10 = ((w) eVar.f17042b).a();
                    a10.f4072k = r10.b(((w) eVar.f17042b).f4125l);
                    eVar.f17042b = new w(a10);
                    return true;
                }
            }
        } else {
            ((w) eVar.f17042b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49252n = false;
        }
    }
}
