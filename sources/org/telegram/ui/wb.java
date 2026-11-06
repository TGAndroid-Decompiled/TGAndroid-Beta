package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wb implements org.telegram.messenger.c20 {
    public final int f51045a;
    public final rc f51046b;

    public wb(rc rcVar, int i7) {
        this.f51045a = i7;
        this.f51046b = rcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f51045a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                rc rcVar = this.f51046b;
                rcVar.E = wallPaper;
                rcVar.F = wallPaper;
                rcVar.G = wallPaper;
                rcVar.e1(false);
                rcVar.h1(false);
                org.telegram.messenger.g0.i3(new xb(rcVar, 1), 350L);
                return;
            case 1:
                rc.a0(this.f51046b, (org.telegram.messenger.e3) obj);
                return;
            default:
                this.f51046b.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
