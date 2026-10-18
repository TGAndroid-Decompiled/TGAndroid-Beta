package x3;

import b2.v;
import b2.v0;
import b2.w;
import c3.u;
import e2.x;
import java.util.Arrays;
import n4.s;
import u2.a1;
public final class c extends i {
    public u f49190n;
    public a1 f49191o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8292a;
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
        byte[] bArr = xVar.f8292a;
        u uVar = this.f49190n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f49190n = uVar2;
            v a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8294c), null).a();
            a2.f4078q = v0.n("audio/ogg");
            eVar.f17038b = new w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            s t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f4663a, uVar.f4664b, uVar.f4665c, uVar.d, uVar.e, uVar.f4667g, uVar.h, uVar.f4669j, t10, uVar.f4671l);
            this.f49190n = uVar3;
            ?? obj = new Object();
            obj.f47248c = uVar3;
            obj.d = t10;
            obj.f47246a = -1L;
            obj.f47247b = -1L;
            this.f49191o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            a1 a1Var = this.f49191o;
            if (a1Var != null) {
                a1Var.f47246a = j10;
                eVar.f17039c = a1Var;
            }
            ((w) eVar.f17038b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49190n = null;
            this.f49191o = null;
        }
    }
}
