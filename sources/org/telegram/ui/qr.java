package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr implements org.telegram.ui.Cells.a5, gg.a2 {
    public final rr f41254a;

    public qr(rr rrVar) {
        this.f41254a = rrVar;
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        rr rrVar = this.f41254a;
        TLObject E = rrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return rrVar.f41533y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public void h(int i10) {
        rr rrVar = this.f41254a;
        sr srVar = rrVar.f41533y;
        if (!rrVar.h.e()) {
            int i11 = rrVar.f41529r;
            rrVar.l();
            if (rrVar.f41529r > i11) {
                srVar.y0(i11);
            }
            if (!rrVar.f41530s && rrVar.f41529r == 0 && i10 != 0) {
                srVar.f41821b.e(false, true);
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
