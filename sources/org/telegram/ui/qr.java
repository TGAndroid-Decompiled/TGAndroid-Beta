package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr implements org.telegram.ui.Cells.b5, gg.b2 {
    public final rr f36960a;

    public qr(rr rrVar) {
        this.f36960a = rrVar;
    }

    @Override
    public boolean F(int i10) {
        return true;
    }

    @Override
    public void a(int i10) {
        rr rrVar = this.f36960a;
        sr srVar = rrVar.f37219y;
        if (!rrVar.h.e()) {
            int i11 = rrVar.f37215r;
            rrVar.l();
            if (rrVar.f37215r > i11) {
                srVar.y0(i11);
            }
            if (!rrVar.f37216s && rrVar.f37215r == 0 && i10 != 0) {
                srVar.f37450b.e(false, true);
            }
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
        rr rrVar = this.f36960a;
        TLObject E = rrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return rrVar.f37219y.h0((TLRPC.ChannelParticipant) E, !z10, c5Var);
        }
        return false;
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void G(ArrayList arrayList) {
    }
}
