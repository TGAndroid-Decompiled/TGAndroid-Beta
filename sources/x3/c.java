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
    public u f49189n;
    public z0 f49190o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8293a;
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
        byte[] bArr = xVar.f8293a;
        u uVar = this.f49189n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f49189n = uVar2;
            v a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8295c), null).a();
            a2.f4076q = v0.n("audio/ogg");
            eVar.f17041b = new w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            s t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f4661a, uVar.f4662b, uVar.f4663c, uVar.d, uVar.e, uVar.f4665g, uVar.h, uVar.f4667j, t10, uVar.f4669l);
            this.f49189n = uVar3;
            ?? obj = new Object();
            obj.f47496c = uVar3;
            obj.d = t10;
            obj.f47494a = -1L;
            obj.f47495b = -1L;
            this.f49190o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f49190o;
            if (z0Var != null) {
                z0Var.f47494a = j10;
                eVar.f17042c = z0Var;
            }
            ((w) eVar.f17041b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49189n = null;
            this.f49190o = null;
        }
    }
}
