package x3;

import b2.v;
import b2.v0;
import b2.w;
import c3.u;
import e2.x;
import java.util.Arrays;
import n4.s;
import u2.z0;
public final class c extends i {
    public u f49191n;
    public z0 f49192o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8291a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                xVar.O(4);
                xVar.I();
            }
            int s10 = c3.b.s(i10, xVar);
            xVar.N(0);
            return s10;
        }
        return -1L;
    }

    @Override
    public final boolean c(x xVar, long j10, n2.e eVar) {
        byte[] bArr = xVar.f8291a;
        u uVar = this.f49191n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f49191n = uVar2;
            v a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8293c), null).a();
            a2.f4074q = v0.n("audio/ogg");
            eVar.f17039b = new w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            s t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f4659a, uVar.f4660b, uVar.f4661c, uVar.d, uVar.e, uVar.f4663g, uVar.h, uVar.f4665j, t10, uVar.f4667l);
            this.f49191n = uVar3;
            ?? obj = new Object();
            obj.f47498c = uVar3;
            obj.d = t10;
            obj.f47496a = -1L;
            obj.f47497b = -1L;
            this.f49192o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f49192o;
            if (z0Var != null) {
                z0Var.f47496a = j10;
                eVar.f17040c = z0Var;
            }
            ((w) eVar.f17039b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49191n = null;
            this.f49192o = null;
        }
    }
}
