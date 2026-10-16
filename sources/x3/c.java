package x3;

import b2.w;
import b2.w0;
import c3.u;
import e2.x;
import java.util.Arrays;
import u2.z0;
public final class c extends i {
    public u f47803n;
    public z0 f47804o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8414a;
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
    public final boolean c(x xVar, long j10, n3.b bVar) {
        byte[] bArr = xVar.f8414a;
        u uVar = this.f47803n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f47803n = uVar2;
            w a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8416c), null).a();
            a2.f2469q = w0.n("audio/ogg");
            bVar.f15703b = new b2.x(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            qf.b t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f4287a, uVar.f4288b, uVar.f4289c, uVar.d, uVar.e, uVar.f4291g, uVar.h, uVar.f4293j, t10, uVar.f4295l);
            this.f47803n = uVar3;
            ?? obj = new Object();
            obj.f46112c = uVar3;
            obj.d = t10;
            obj.f46110a = -1L;
            obj.f46111b = -1L;
            this.f47804o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f47804o;
            if (z0Var != null) {
                z0Var.f46110a = j10;
                bVar.f15704c = z0Var;
            }
            ((b2.x) bVar.f15703b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f47803n = null;
            this.f47804o = null;
        }
    }
}
