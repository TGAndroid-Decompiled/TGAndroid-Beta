package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final tr f37441a;

    public sr(tr trVar) {
        this.f37441a = trVar;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        tr trVar = this.f37441a;
        TLObject E = trVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return trVar.f37723y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        tr trVar = this.f37441a;
        ur urVar = trVar.f37723y;
        if (!trVar.h.e()) {
            int i11 = trVar.f37719r;
            trVar.l();
            if (trVar.f37719r > i11) {
                urVar.y0(i11);
            }
            if (!trVar.f37720s && trVar.f37719r == 0 && i10 != 0) {
                urVar.f38110b.e(false, true);
            }
        }
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void Q(ArrayList arrayList) {
    }
}
