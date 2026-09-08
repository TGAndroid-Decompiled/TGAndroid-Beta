package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tr implements org.telegram.ui.Cells.z4, hg.a2 {
    public final ur f40845a;

    public tr(ur urVar) {
        this.f40845a = urVar;
    }

    @Override
    public a0.i G() {
        return null;
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ur urVar = this.f40845a;
        TLObject E = urVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return urVar.f41237y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ur urVar = this.f40845a;
        vr vrVar = urVar.f41237y;
        if (!urVar.h.e()) {
            int i11 = urVar.f41233r;
            urVar.l();
            if (urVar.f41233r > i11) {
                vrVar.y0(i11);
            }
            if (!urVar.f41234s && urVar.f41233r == 0 && i10 != 0) {
                vrVar.f41659b.e(false, true);
            }
        }
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void Y(ArrayList arrayList) {
    }
}
