package x3;

import b2.w;
import b2.w0;
import c3.u;
import e2.x;
import java.util.Arrays;
import n6.o;
import u2.z0;
public final class c extends i {
    public u f47804n;
    public z0 f47805o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8411a;
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
    public final boolean c(x xVar, long j10, o oVar) {
        byte[] bArr = xVar.f8411a;
        u uVar = this.f47804n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f47804n = uVar2;
            w a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8413c), null).a();
            a2.f2465q = w0.n("audio/ogg");
            oVar.f16131b = new b2.x(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            qf.b t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f4283a, uVar.f4284b, uVar.f4285c, uVar.d, uVar.e, uVar.f4287g, uVar.h, uVar.f4289j, t10, uVar.f4291l);
            this.f47804n = uVar3;
            ?? obj = new Object();
            obj.f46112c = uVar3;
            obj.d = t10;
            obj.f46110a = -1L;
            obj.f46111b = -1L;
            this.f47805o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f47805o;
            if (z0Var != null) {
                z0Var.f46110a = j10;
                oVar.f16132c = z0Var;
            }
            ((b2.x) oVar.f16131b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f47804n = null;
            this.f47805o = null;
        }
    }
}
