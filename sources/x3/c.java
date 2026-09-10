package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import n4.y;
import n7.a1;
import u2.z0;
public final class c extends i {
    public u f44570n;
    public z0 f44571o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f7234a;
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
    public final boolean c(v vVar, long j3, a1 a1Var) {
        byte[] bArr = vVar.f7234a;
        u uVar = this.f44570n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f44570n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f7236c), null).a();
            a2.f1945p = r0.n("audio/ogg");
            a1Var.f13938b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            y u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f4216a, uVar.f4217b, uVar.f4218c, uVar.d, uVar.e, uVar.f4220g, uVar.h, uVar.f4222j, u10, uVar.f4224l);
            this.f44570n = uVar3;
            ?? obj = new Object();
            obj.f42508c = uVar3;
            obj.d = u10;
            obj.f42506a = -1L;
            obj.f42507b = -1L;
            this.f44571o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f44571o;
            if (z0Var != null) {
                z0Var.f42506a = j3;
                a1Var.f13939c = z0Var;
            }
            ((s) a1Var.f13938b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f44570n = null;
            this.f44571o = null;
        }
    }
}
