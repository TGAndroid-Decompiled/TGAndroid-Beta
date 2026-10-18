package x3;

import b2.v;
import b2.v0;
import b2.w;
import c3.u;
import e2.x;
import java.util.Arrays;
import n4.s;
import u2.y0;
public final class c extends i {
    public u f49237n;
    public y0 f49238o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8294a;
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
        byte[] bArr = xVar.f8294a;
        u uVar = this.f49237n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f49237n = uVar2;
            v a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8296c), null).a();
            a2.f4078q = v0.n("audio/ogg");
            eVar.f17042b = new w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            s t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f4663a, uVar.f4664b, uVar.f4665c, uVar.d, uVar.e, uVar.f4667g, uVar.h, uVar.f4669j, t10, uVar.f4671l);
            this.f49237n = uVar3;
            ?? obj = new Object();
            obj.f47539c = uVar3;
            obj.d = t10;
            obj.f47537a = -1L;
            obj.f47538b = -1L;
            this.f49238o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            y0 y0Var = this.f49238o;
            if (y0Var != null) {
                y0Var.f47537a = j10;
                eVar.f17043c = y0Var;
            }
            ((w) eVar.f17042b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49237n = null;
            this.f49238o = null;
        }
    }
}
