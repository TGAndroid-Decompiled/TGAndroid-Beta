package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import n7.a1;
import u2.x0;
public final class c extends i {
    public u f45226n;
    public x0 f45227o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f7931a;
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
        byte[] bArr = vVar.f7931a;
        u uVar = this.f45226n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f45226n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f7933c), null).a();
            a2.f3249p = r0.n("audio/ogg");
            a1Var.f15106b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            of.b u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f3799a, uVar.f3800b, uVar.f3801c, uVar.d, uVar.e, uVar.f3803g, uVar.h, uVar.f3805j, u10, uVar.f3807l);
            this.f45226n = uVar3;
            ?? obj = new Object();
            obj.f43529c = uVar3;
            obj.d = u10;
            obj.f43527a = -1L;
            obj.f43528b = -1L;
            this.f45227o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            x0 x0Var = this.f45227o;
            if (x0Var != null) {
                x0Var.f43527a = j3;
                a1Var.f15107c = x0Var;
            }
            ((s) a1Var.f15106b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f45226n = null;
            this.f45227o = null;
        }
    }
}
