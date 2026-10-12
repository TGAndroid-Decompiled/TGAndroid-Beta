package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur implements org.telegram.ui.Cells.a5, gg.a2 {
    public final vr f42552a;

    public ur(vr vrVar) {
        this.f42552a = vrVar;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public a0.i W() {
        return null;
    }

    @Override
    public boolean b0(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        vr vrVar = this.f42552a;
        TLObject E = vrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return vrVar.f42839y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        vr vrVar = this.f42552a;
        wr wrVar = vrVar.f42839y;
        if (!vrVar.h.e()) {
            int i11 = vrVar.f42835r;
            vrVar.l();
            if (vrVar.f42835r > i11) {
                wrVar.y0(i11);
            }
            if (!vrVar.f42836s && vrVar.f42835r == 0 && i10 != 0) {
                wrVar.f43611b.e(false, true);
            }
        }
    }

    @Override
    public void i0(ArrayList arrayList) {
    }
}
