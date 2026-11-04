package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ub implements org.telegram.messenger.u10 {
    public final int f50028a;
    public final pc f50029b;

    public ub(pc pcVar, int i3) {
        this.f50028a = i3;
        this.f50029b = pcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50028a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                pc pcVar = this.f50029b;
                pcVar.F = wallPaper;
                pcVar.G = wallPaper;
                pcVar.H = wallPaper;
                pcVar.e1(false);
                pcVar.h1(false);
                org.telegram.messenger.g0.i3(new vb(pcVar, 1), 350L);
                return;
            case 1:
                pc.a0(this.f50029b, (org.telegram.messenger.e3) obj);
                return;
            default:
                this.f50029b.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
