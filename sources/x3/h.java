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
    public static final byte[] f49213o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f49214p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f49215n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i10 = xVar.f8292b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8291a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f49221i * q.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(x xVar, long j10, n2.e eVar) {
        if (e(xVar, f49213o)) {
            byte[] copyOf = Arrays.copyOf(xVar.f8291a, xVar.f8293c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = q.a(copyOf);
            if (((w) eVar.f17039b) == null) {
                v vVar = new v();
                vVar.f4074q = v0.n("audio/ogg");
                vVar.f4075r = v0.n("audio/opus");
                vVar.J = i10;
                vVar.K = 48000;
                vVar.f4078u = a2;
                eVar.f17039b = new w(vVar);
                return true;
            }
        } else if (e(xVar, f49214p)) {
            ((w) eVar.f17039b).getClass();
            if (!this.f49215n) {
                this.f49215n = true;
                xVar.O(8);
                t0 r10 = c3.b.r(n0.v(c3.b.u(xVar, false, false).f4646a));
                if (r10 != null) {
                    v a10 = ((w) eVar.f17039b).a();
                    a10.f4068k = r10.b(((w) eVar.f17039b).f4121l);
                    eVar.f17039b = new w(a10);
                    return true;
                }
            }
        } else {
            ((w) eVar.f17039b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49215n = false;
        }
    }
}
