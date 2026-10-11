package x3;

import b2.r;
import b2.r0;
import b2.s;
import c3.u;
import e2.v;
import java.util.Arrays;
import n6.k;
import u2.w0;
public final class c extends i {
    public u f50680n;
    public w0 f50681o;

    @Override
    public final long b(v vVar) {
        byte[] bArr = vVar.f8583a;
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
    public final boolean c(v vVar, long j3, k kVar) {
        byte[] bArr = vVar.f8583a;
        u uVar = this.f50680n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f50680n = uVar2;
            r a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f8585c), null).a();
            a2.f3584p = r0.n("audio/ogg");
            kVar.f16765b = new s(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            pf.b u10 = c3.b.u(vVar);
            u uVar3 = new u(uVar.f4154a, uVar.f4155b, uVar.f4156c, uVar.d, uVar.f4157e, uVar.f4159g, uVar.h, uVar.f4161j, u10, uVar.f4163l);
            this.f50680n = uVar3;
            ?? obj = new Object();
            obj.f48853c = uVar3;
            obj.d = u10;
            obj.f48851a = -1L;
            obj.f48852b = -1L;
            this.f50681o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            w0 w0Var = this.f50681o;
            if (w0Var != null) {
                w0Var.f48851a = j3;
                kVar.f16766c = w0Var;
            }
            ((s) kVar.f16765b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f50680n = null;
            this.f50681o = null;
        }
    }
}
