package z3;

import d2.u0;
import d2.v;
import e3.u;
import g2.y;
import java.util.Arrays;
import w2.z0;
public final class c extends i {
    public u f59661n;
    public z0 f59662o;

    @Override
    public final long b(y yVar) {
        byte[] bArr = yVar.f11923a;
        if (bArr[0] == -1) {
            int i3 = (bArr[2] & 255) >> 4;
            if (i3 == 6 || i3 == 7) {
                yVar.O(4);
                yVar.I();
            }
            int s6 = e3.b.s(i3, yVar);
            yVar.N(0);
            return s6;
        }
        return -1L;
    }

    @Override
    public final boolean c(y yVar, long j10, ua.b bVar) {
        byte[] bArr = yVar.f11923a;
        u uVar = this.f59661n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f59661n = uVar2;
            d2.u a10 = uVar2.c(Arrays.copyOfRange(bArr, 9, yVar.f11925c), null).a();
            a10.f8430q = u0.n("audio/ogg");
            bVar.f55783b = new v(a10);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            tf.b t10 = e3.b.t(yVar);
            u uVar3 = new u(uVar.f9510a, uVar.f9511b, uVar.f9512c, uVar.d, uVar.f9513e, uVar.f9515g, uVar.h, uVar.f9517j, t10, uVar.f9519l);
            this.f59661n = uVar3;
            ?? obj = new Object();
            obj.f57294c = uVar3;
            obj.d = t10;
            obj.f57292a = -1L;
            obj.f57293b = -1L;
            this.f59662o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            z0 z0Var = this.f59662o;
            if (z0Var != null) {
                z0Var.f57292a = j10;
                bVar.f55784c = z0Var;
            }
            ((v) bVar.f55783b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f59661n = null;
            this.f59662o = null;
        }
    }
}
