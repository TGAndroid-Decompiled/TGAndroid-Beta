package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vb implements org.telegram.messenger.y10 {
    public final int f52783a;
    public final qc f52784b;

    public vb(qc qcVar, int i7) {
        this.f52783a = i7;
        this.f52784b = qcVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f52783a) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                qc qcVar = this.f52784b;
                qcVar.F = wallPaper;
                qcVar.G = wallPaper;
                qcVar.H = wallPaper;
                qcVar.e1(false);
                qcVar.h1(false);
                org.telegram.messenger.g0.h3(new wb(qcVar, 1), 350L);
                return;
            case 1:
                qc.a0(this.f52784b, (org.telegram.messenger.g3) obj);
                return;
            default:
                this.f52784b.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
