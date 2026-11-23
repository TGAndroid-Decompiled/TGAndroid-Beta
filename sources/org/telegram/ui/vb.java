package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vb implements org.telegram.messenger.w10 {
    public final int f52935a;
    public final qc f52936b;

    public vb(qc qcVar, int i7) {
        this.f52935a = i7;
        this.f52936b = qcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52935a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                qc qcVar = this.f52936b;
                qcVar.F = wallPaper;
                qcVar.G = wallPaper;
                qcVar.H = wallPaper;
                qcVar.e1(false);
                qcVar.h1(false);
                org.telegram.messenger.g0.h3(new wb(qcVar, 1), 350L);
                return;
            case 1:
                qc.a0(this.f52936b, (org.telegram.messenger.g3) obj);
                return;
            default:
                this.f52936b.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
