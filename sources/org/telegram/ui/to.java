package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
public final class to implements e2.h {
    public final int f36978a;
    public final Object f36979b;
    public final long f36980c;
    public final Object d;
    public final Object e;

    public to(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f36978a = i10;
        this.d = obj;
        this.e = obj2;
        this.f36980c = j3;
        this.f36979b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        zh.o4 o4Var;
        int i10 = this.f36978a;
        long j3 = this.f36980c;
        Object obj2 = this.f36979b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                yo.X((yo) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f36980c, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                xh.x3.d0((xh.x3) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.f36980c, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 2:
                zh.l lVar = (zh.l) obj4;
                zh.k kVar = (zh.k) obj2;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    bi.ce E = bi.ce.E(lVar.f48603e0.getParentActivity(), lVar.f48604f);
                    E.N = j3;
                    bi.qd qdVar = E.f2439c1;
                    if (qdVar != null) {
                        qdVar.setDialogId(j3);
                    }
                    E.M = false;
                    E.R(bi.xd.c(kVar));
                    return;
                }
                return;
            case 3:
                zh.i5 i5Var = (zh.i5) obj4;
                e2.h hVar = (e2.h) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    hVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j10 = this.f36980c;
                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new to(i5Var, hVar, j10, tL_premium_boostsStatus, 4));
                hVar.accept(Boolean.FALSE);
                return;
            default:
                zh.i5 i5Var2 = (zh.i5) obj4;
                e2.h hVar2 = (e2.h) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    hVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (i5Var2.j(j3)) {
                    o4Var = new zh.o4(i5Var2, j3, 0);
                } else {
                    o4Var = null;
                }
                int i11 = qg.k0.V0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    qg.k0 k0Var = new qg.k0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    k0Var.G1(canApplyBoost);
                    k0Var.F1(tL_premium_boostsStatus2, true);
                    k0Var.H1(j3);
                    k0Var.Q0 = o4Var;
                    k0Var.show();
                }
                hVar2.accept(Boolean.FALSE);
                return;
        }
    }

    public to(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f36978a = i10;
        this.d = obj;
        this.e = obj2;
        this.f36979b = obj3;
        this.f36980c = j3;
    }

    public to(xh.x3 x3Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, MessagesController messagesController) {
        this.f36978a = 1;
        this.d = x3Var;
        this.f36979b = tL_premium_boostsStatus;
        this.f36980c = j3;
        this.e = messagesController;
    }
}
