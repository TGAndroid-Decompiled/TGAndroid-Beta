package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rr implements org.telegram.ui.Cells.a5, gg.a2 {
    public final sr f41472a;

    public rr(sr srVar) {
        this.f41472a = srVar;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        sr srVar = this.f41472a;
        TLObject E = srVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return srVar.f41757y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        sr srVar = this.f41472a;
        tr trVar = srVar.f41757y;
        if (!srVar.h.e()) {
            int i11 = srVar.f41753r;
            srVar.l();
            if (srVar.f41753r > i11) {
                trVar.y0(i11);
            }
            if (!srVar.f41754s && srVar.f41753r == 0 && i10 != 0) {
                trVar.f42053b.e(false, true);
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
