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
    public u f45508n;
    public x0 f45509o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f7916a;
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
        byte[] bArr = vVar.f7916a;
        u uVar = this.f45508n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f45508n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f7918c), null).a();
            a2.f3244p = r0.n("audio/ogg");
            z0Var.f15410b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            of.b u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f3794a, uVar.f3795b, uVar.f3796c, uVar.d, uVar.e, uVar.f3798g, uVar.h, uVar.f3800j, u10, uVar.f3802l);
            this.f45508n = uVar3;
            ?? obj = new Object();
            obj.f43818c = uVar3;
            obj.d = u10;
            obj.f43816a = -1L;
            obj.f43817b = -1L;
            this.f45509o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            x0 x0Var = this.f45509o;
            if (x0Var != null) {
                x0Var.f43816a = j3;
                z0Var.f15411c = x0Var;
            }
            ((s) z0Var.f15410b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f45508n = null;
            this.f45509o = null;
        }
    }
}
