package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr implements org.telegram.ui.Cells.b5, gg.b2 {
    public final rr f36983a;

    public qr(rr rrVar) {
        this.f36983a = rrVar;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public boolean L(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
        rr rrVar = this.f36983a;
        TLObject E = rrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return rrVar.f37241y.h0((TLRPC.ChannelParticipant) E, !z10, c5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        rr rrVar = this.f36983a;
        sr srVar = rrVar.f37241y;
        if (!rrVar.h.e()) {
            int i11 = rrVar.f37237r;
            rrVar.l();
            if (rrVar.f37237r > i11) {
                srVar.y0(i11);
            }
            if (!rrVar.f37238s && rrVar.f37237r == 0 && i10 != 0) {
                srVar.f37474b.e(false, true);
            }
        }
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public void O(ArrayList arrayList) {
    }
}
