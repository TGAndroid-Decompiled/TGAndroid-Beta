package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rh implements e2.h {
    public final int f37065a;
    public final Object f37066b;
    public final Object f37067c;
    public final Object d;

    public rh(Object obj, Object obj2, Object obj3, int i10) {
        this.f37065a = i10;
        this.f37067c = obj;
        this.d = obj2;
        this.f37066b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f37065a;
        Object obj2 = this.f37066b;
        Object obj3 = this.d;
        Object obj4 = this.f37067c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                zn.Z((zn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                uy.W((uy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
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
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null && (R instanceof zn)) {
                        ((zn) R).qb();
                        return;
                    }
                    return;
                }
                new xh.r1(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            default:
                gc0 gc0Var = (gc0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.wn0 wn0Var = (org.telegram.ui.Components.wn0) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(gc0Var.f33804b).getUser(l10);
                }
                userArr[0] = user;
                if (user == null) {
                    gc0Var.a();
                    org.telegram.messenger.wh.o(R.string.NoUsernameFound, gc0.b(), null);
                    return;
                }
                wn0Var.run();
                return;
        }
    }

    public rh(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f37065a = 1;
        this.f37067c = uyVar;
        this.f37066b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
