package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sr implements org.telegram.ui.Cells.z4, gg.b2 {
    public final tr f37432a;

    public sr(tr trVar) {
        this.f37432a = trVar;
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
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        tr trVar = this.f37432a;
        TLObject E = trVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return trVar.f37774y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        tr trVar = this.f37432a;
        ur urVar = trVar.f37774y;
        if (!trVar.h.e()) {
            int i11 = trVar.f37770r;
            trVar.l();
            if (trVar.f37770r > i11) {
                urVar.y0(i11);
            }
            if (!trVar.f37771s && trVar.f37770r == 0 && i10 != 0) {
                urVar.f38096b.e(false, true);
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
