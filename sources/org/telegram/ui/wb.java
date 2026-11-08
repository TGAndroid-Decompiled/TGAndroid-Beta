package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wb implements org.telegram.messenger.c20 {
    public final int f51049a;
    public final rc f51050b;

    public wb(rc rcVar, int i7) {
        this.f51049a = i7;
        this.f51050b = rcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51049a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                rc rcVar = this.f51050b;
                rcVar.E = wallPaper;
                rcVar.F = wallPaper;
                rcVar.G = wallPaper;
                rcVar.e1(false);
                rcVar.h1(false);
                org.telegram.messenger.g0.i3(new xb(rcVar, 1), 350L);
                return;
            case 1:
                rc.a0(this.f51050b, (org.telegram.messenger.e3) obj);
                return;
            default:
                this.f51050b.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
