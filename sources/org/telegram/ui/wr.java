package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wr implements org.telegram.ui.Cells.a5, hg.z1 {
    public final xr f41638a;

    public wr(xr xrVar) {
        this.f41638a = xrVar;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        xr xrVar = this.f41638a;
        TLObject E = xrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return xrVar.f41922y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.h j0() {
        return null;
    }

    @Override
    public void k(int i10) {
        xr xrVar = this.f41638a;
        yr yrVar = xrVar.f41922y;
        if (!xrVar.h.e()) {
            int i11 = xrVar.f41918r;
            xrVar.l();
            if (xrVar.f41918r > i11) {
                yrVar.y0(i11);
            }
            if (!xrVar.f41919s && xrVar.f41918r == 0 && i10 != 0) {
                yrVar.f42215b.e(false, true);
            }
        }
    }

    @Override
    public boolean t0(int i10) {
        return true;
    }

    @Override
    public void I0(ArrayList arrayList) {
    }
}
