package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import n7.z0;
import u2.x0;
public final class c extends i {
    public u f48783n;
    public x0 f48784o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8789a;
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
        byte[] bArr = vVar.f8789a;
        u uVar = this.f48783n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f48783n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f8791c), null).a();
            a2.f2311p = r0.n("audio/ogg");
            z0Var.f16703b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            pf.b u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f4298a, uVar.f4299b, uVar.f4300c, uVar.d, uVar.f4301e, uVar.f4303g, uVar.h, uVar.f4305j, u10, uVar.f4307l);
            this.f48783n = uVar3;
            ?? obj = new Object();
            obj.f46856c = uVar3;
            obj.d = u10;
            obj.f46854a = -1L;
            obj.f46855b = -1L;
            this.f48784o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            x0 x0Var = this.f48784o;
            if (x0Var != null) {
                x0Var.f46854a = j3;
                z0Var.f16704c = x0Var;
            }
            ((s) z0Var.f16703b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f48783n = null;
            this.f48784o = null;
        }
    }
}
