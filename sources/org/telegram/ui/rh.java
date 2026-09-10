package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rh implements e2.h {
    public final int f36368a;
    public final Object f36369b;
    public final Object f36370c;
    public final Object d;

    public rh(Object obj, Object obj2, Object obj3, int i10) {
        this.f36368a = i10;
        this.f36370c = obj;
        this.d = obj2;
        this.f36369b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f36368a;
        Object obj2 = this.f36369b;
        Object obj3 = this.d;
        Object obj4 = this.f36370c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                eo.x0((eo) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
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
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null && (R instanceof eo)) {
                        ((eo) R).qb();
                        return;
                    }
                    return;
                }
                new wh.p1(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            default:
                fc0 fc0Var = (fc0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.q01 q01Var = (org.telegram.ui.Components.q01) obj2;
                Long l10 = (Long) obj;
                if (l10 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(fc0Var.f32779b).getUser(l10);
                }
                userArr[0] = user;
                if (user == null) {
                    fc0Var.a();
                    org.telegram.messenger.a2.p(R.string.NoUsernameFound, fc0.b(), null);
                    return;
                }
                q01Var.run();
                return;
        }
    }

    public rh(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f36368a = 1;
        this.f36370c = wyVar;
        this.f36369b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
