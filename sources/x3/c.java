package x3;

import b2.v;
import b2.v0;
import c3.w;
import e2.x;
import java.util.Arrays;
import n4.s;
import u2.b1;
public final class c extends i {
    public w f49641n;
    public b1 f49642o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f8298a;
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
        byte[] bArr = xVar.f8298a;
        w wVar = this.f49641n;
        if (wVar == null) {
            w wVar2 = new w(bArr, 17);
            this.f49641n = wVar2;
            v a2 = wVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f8300c), null).a();
            a2.f4081q = v0.n("audio/ogg");
            eVar.f17102b = new b2.w(a2);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            s t10 = c3.b.t(xVar);
            w wVar3 = new w(wVar.f4668a, wVar.f4669b, wVar.f4670c, wVar.d, wVar.e, wVar.f4672g, wVar.h, wVar.f4674j, t10, wVar.f4676l);
            this.f49641n = wVar3;
            ?? obj = new Object();
            obj.f47709c = wVar3;
            obj.d = t10;
            obj.f47707a = -1L;
            obj.f47708b = -1L;
            this.f49642o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            b1 b1Var = this.f49642o;
            if (b1Var != null) {
                b1Var.f47707a = j10;
                eVar.f17103c = b1Var;
            }
            ((b2.w) eVar.f17102b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f49641n = null;
            this.f49642o = null;
        }
    }
}
