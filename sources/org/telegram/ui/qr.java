package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr implements org.telegram.ui.Cells.a5, gg.a2 {
    public final rr f41220a;

    public qr(rr rrVar) {
        this.f41220a = rrVar;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        rr rrVar = this.f41220a;
        TLObject E = rrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return rrVar.f41499y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        rr rrVar = this.f41220a;
        sr srVar = rrVar.f41499y;
        if (!rrVar.h.e()) {
            int i11 = rrVar.f41495r;
            rrVar.l();
            if (rrVar.f41495r > i11) {
                srVar.y0(i11);
            }
            if (!rrVar.f41496s && rrVar.f41495r == 0 && i10 != 0) {
                srVar.f41787b.e(false, true);
            }
        }
    }

    @Override
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public void x0(ArrayList arrayList) {
    }
}
