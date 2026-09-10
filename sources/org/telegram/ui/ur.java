package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur implements org.telegram.ui.Cells.a5, fg.c2 {
    public final vr f37332a;

    public ur(vr vrVar) {
        this.f37332a = vrVar;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public a0.i P() {
        return null;
    }

    @Override
    public void a(int i10) {
        vr vrVar = this.f37332a;
        wr wrVar = vrVar.f37616y;
        if (!vrVar.h.e()) {
            int i11 = vrVar.f37612r;
            vrVar.l();
            if (vrVar.f37612r > i11) {
                wrVar.y0(i11);
            }
            if (!vrVar.f37613s && vrVar.f37612r == 0 && i10 != 0) {
                wrVar.f38320b.e(false, true);
            }
        }
    }

    @Override
    public boolean c0(int i10) {
        return true;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        vr vrVar = this.f37332a;
        TLObject E = vrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return vrVar.f37616y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void k0(ArrayList arrayList) {
    }
}
