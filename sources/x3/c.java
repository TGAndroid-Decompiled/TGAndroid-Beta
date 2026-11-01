package x3;

import b2.v0;
import b2.w;
import c3.u;
import e2.x;
import java.util.Arrays;
import u2.z0;
public final class c extends i {
    public u f52987n;
    public z0 f52988o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f6207a;
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
    public final boolean c(x xVar, long j10, m5.e eVar) {
        byte[] bArr = xVar.f6207a;
        u uVar = this.f52987n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f52987n = uVar2;
            w a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f6209c), null).a();
            a2.f2369q = v0.n("audio/ogg");
            eVar.f13014b = new b2.x(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            hf.b t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f3691a, uVar.f3692b, uVar.f3693c, uVar.d, uVar.e, uVar.f3695g, uVar.h, uVar.f3697j, t10, uVar.f3699l);
            this.f52987n = uVar3;
            ?? obj = new Object();
            obj.f50087c = uVar3;
            obj.d = t10;
            obj.f50085a = -1L;
            obj.f50086b = -1L;
            this.f52988o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f52988o;
            if (z0Var != null) {
                z0Var.f50085a = j10;
                eVar.f13015c = z0Var;
            }
            ((b2.x) eVar.f13014b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f52987n = null;
            this.f52988o = null;
        }
    }
}
