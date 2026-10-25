package x3;

import b2.w;
import b2.w0;
import c3.u;
import e2.x;
import java.util.Arrays;
import u2.z0;
public final class c extends i {
    public u f51370n;
    public z0 f51371o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f9732a;
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
    public final boolean c(x xVar, long j10, m4.c cVar) {
        byte[] bArr = xVar.f9732a;
        u uVar = this.f51370n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f51370n = uVar2;
            w a2 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f9734c), null).a();
            a2.f3532q = w0.n("audio/ogg");
            cVar.f18009b = new b2.x(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            rf.b t10 = c3.b.t(xVar);
            u uVar3 = new u(uVar.f6096a, uVar.f6097b, uVar.f6098c, uVar.d, uVar.e, uVar.f6100g, uVar.h, uVar.f6102j, t10, uVar.f6104l);
            this.f51370n = uVar3;
            ?? obj = new Object();
            obj.f49491c = uVar3;
            obj.d = t10;
            obj.f49489a = -1L;
            obj.f49490b = -1L;
            this.f51371o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f51371o;
            if (z0Var != null) {
                z0Var.f49489a = j10;
                cVar.f18010c = z0Var;
            }
            ((b2.x) cVar.f18009b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f51370n = null;
            this.f51371o = null;
        }
    }
}
