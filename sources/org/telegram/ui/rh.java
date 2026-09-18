package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rh implements e2.h {
    public final int f37233a;
    public final Object f37234b;
    public final Object f37235c;
    public final Object d;

    public rh(Object obj, Object obj2, Object obj3, int i10) {
        this.f37233a = i10;
        this.f37235c = obj;
        this.d = obj2;
        this.f37234b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f37233a;
        Object obj2 = this.f37234b;
        Object obj3 = this.d;
        Object obj4 = this.f37235c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                bo.x0((bo) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                wy.W((wy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                nf.e eVar = (nf.e) obj3;
                int[] iArr = (int[]) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    launchActivity.getClass();
                    eVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l4.longValue()) == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null && (R instanceof bo)) {
                        ((bo) R).qb();
                        return;
                    }
                    return;
                }
                new xh.q1(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            default:
                hc0 hc0Var = (hc0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.kn0 kn0Var = (org.telegram.ui.Components.kn0) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(hc0Var.f34236b).getUser(l10);
                }
                userArr[0] = user;
                if (user == null) {
                    hc0Var.a();
                    org.telegram.messenger.w1.p(R.string.NoUsernameFound, hc0.b(), null);
                    return;
                }
                kn0Var.run();
                return;
        }
    }

    public rh(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f37233a = 1;
        this.f37235c = wyVar;
        this.f37234b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
