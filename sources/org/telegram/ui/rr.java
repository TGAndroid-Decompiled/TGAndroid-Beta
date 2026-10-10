package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rr implements org.telegram.ui.Cells.a5, gg.a2 {
    public final sr f41518a;

    public rr(sr srVar) {
        this.f41518a = srVar;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        sr srVar = this.f41518a;
        TLObject E = srVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return srVar.f41803y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        sr srVar = this.f41518a;
        tr trVar = srVar.f41803y;
        if (!srVar.h.e()) {
            int i11 = srVar.f41799r;
            srVar.l();
            if (srVar.f41799r > i11) {
                trVar.y0(i11);
            }
            if (!srVar.f41800s && srVar.f41799r == 0 && i10 != 0) {
                trVar.f42099b.e(false, true);
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
