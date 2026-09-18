package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final rr f36874a;

    public qr(rr rrVar) {
        this.f36874a = rrVar;
    }

    @Override
    public void a(int i10) {
        rr rrVar = this.f36874a;
        sr srVar = rrVar.f37124y;
        if (!rrVar.h.e()) {
            int i11 = rrVar.f37120r;
            rrVar.l();
            if (rrVar.f37120r > i11) {
                srVar.y0(i11);
            }
            if (!rrVar.f37121s && rrVar.f37120r == 0 && i10 != 0) {
                srVar.f37395b.e(false, true);
            }
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        rr rrVar = this.f36874a;
        TLObject E = rrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return rrVar.f37124y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public void F(ArrayList arrayList) {
    }
}
