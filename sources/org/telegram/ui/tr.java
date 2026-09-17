package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tr implements org.telegram.ui.Cells.z4, hg.a2 {
    public final ur f40846a;

    public tr(ur urVar) {
        this.f40846a = urVar;
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
        ur urVar = this.f40846a;
        TLObject E = urVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return urVar.f41238y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ur urVar = this.f40846a;
        vr vrVar = urVar.f41238y;
        if (!urVar.h.e()) {
            int i11 = urVar.f41234r;
            urVar.l();
            if (urVar.f41234r > i11) {
                vrVar.y0(i11);
            }
            if (!urVar.f41235s && urVar.f41234r == 0 && i10 != 0) {
                vrVar.f41660b.e(false, true);
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
