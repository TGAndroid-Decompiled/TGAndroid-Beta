package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rr implements org.telegram.ui.Cells.a5, gg.a2 {
    public final sr f41474a;

    public rr(sr srVar) {
        this.f41474a = srVar;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        sr srVar = this.f41474a;
        TLObject E = srVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return srVar.f41759y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        sr srVar = this.f41474a;
        tr trVar = srVar.f41759y;
        if (!srVar.h.e()) {
            int i11 = srVar.f41755r;
            srVar.l();
            if (srVar.f41755r > i11) {
                trVar.y0(i11);
            }
            if (!srVar.f41756s && srVar.f41755r == 0 && i10 != 0) {
                trVar.f42055b.e(false, true);
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
