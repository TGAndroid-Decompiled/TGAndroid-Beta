package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wr implements org.telegram.ui.Cells.a5, hg.z1 {
    public final xr f41342a;

    public wr(xr xrVar) {
        this.f41342a = xrVar;
    }

    @Override
    public boolean E0(int i10) {
        return true;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        xr xrVar = this.f41342a;
        TLObject E = xrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return xrVar.f41624y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        xr xrVar = this.f41342a;
        yr yrVar = xrVar.f41624y;
        if (!xrVar.h.e()) {
            int i11 = xrVar.f41620r;
            xrVar.l();
            if (xrVar.f41620r > i11) {
                yrVar.y0(i11);
            }
            if (!xrVar.f41621s && xrVar.f41620r == 0 && i10 != 0) {
                yrVar.f41892b.e(false, true);
            }
        }
    }

    @Override
    public a0.h k0() {
        return null;
    }

    @Override
    public void O0(ArrayList arrayList) {
    }
}
