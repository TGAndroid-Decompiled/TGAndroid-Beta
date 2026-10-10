package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import n6.t;
import u2.x0;
public final class c extends i {
    public u f50602n;
    public x0 f50603o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8584a;
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
    public final boolean c(v vVar, long j3, t tVar) {
        byte[] bArr = vVar.f8584a;
        u uVar = this.f50602n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f50602n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f8586c), null).a();
            a2.f3584p = r0.n("audio/ogg");
            tVar.f16721b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            pf.b u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f4154a, uVar.f4155b, uVar.f4156c, uVar.d, uVar.f4157e, uVar.f4159g, uVar.h, uVar.f4161j, u10, uVar.f4163l);
            this.f50602n = uVar3;
            ?? obj = new Object();
            obj.f48804c = uVar3;
            obj.d = u10;
            obj.f48802a = -1L;
            obj.f48803b = -1L;
            this.f50603o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            x0 x0Var = this.f50603o;
            if (x0Var != null) {
                x0Var.f48802a = j3;
                tVar.f16722c = x0Var;
            }
            ((s) tVar.f16721b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50602n = null;
            this.f50603o = null;
        }
    }
}
