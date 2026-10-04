package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import n7.z0;
import u2.y0;
public final class c extends i {
    public u f49265n;
    public y0 f49266o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8589a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                vVar.K(4);
                vVar.E();
            }
            int t10 = c3.b.t(i10, vVar);
            vVar.J(0);
            return t10;
        }
        return -1L;
    }

    @Override
    public final boolean c(v vVar, long j3, z0 z0Var) {
        byte[] bArr = vVar.f8589a;
        u uVar = this.f49265n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f49265n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f8591c), null).a();
            a2.f3505p = r0.n("audio/ogg");
            z0Var.f16847b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            of.b u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f4104a, uVar.f4105b, uVar.f4106c, uVar.d, uVar.f4107e, uVar.f4109g, uVar.h, uVar.f4111j, u10, uVar.f4113l);
            this.f49265n = uVar3;
            ?? obj = new Object();
            obj.f47449c = uVar3;
            obj.d = u10;
            obj.f47447a = -1L;
            obj.f47448b = -1L;
            this.f49266o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            y0 y0Var = this.f49266o;
            if (y0Var != null) {
                y0Var.f47447a = j3;
                z0Var.f16848c = y0Var;
            }
            ((s) z0Var.f16847b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49265n = null;
            this.f49266o = null;
        }
    }
}
