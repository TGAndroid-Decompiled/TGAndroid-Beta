package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class uv implements Runnable {
    public final int f43320a;
    public final dy f43321b;

    public uv(dy dyVar, int i9) {
        this.f43320a = i9;
        this.f43321b = dyVar;
    }

    @Override
    public final void run() {
        switch (this.f43320a) {
            case 0:
                dy dyVar = this.f43321b;
                if (dyVar.N0 != 10) {
                    dyVar.c4(false);
                }
                if (dyVar.H && dyVar.X3().G()) {
                    dyVar.A0.h();
                    return;
                } else {
                    dyVar.x4(true, true);
                    return;
                }
            case 1:
                dy dyVar2 = this.f43321b;
                pg.f fVar = dyVar2.f37732u1;
                if (fVar != null) {
                    fVar.d();
                }
                dyVar2.s3();
                dyVar2.m3();
                dyVar2.t3();
                org.telegram.ui.Components.wo0 wo0Var = dyVar2.f37751y1;
                if (wo0Var != null) {
                    wo0Var.setTranslationY(-dyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f43321b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f43321b.M3();
                return;
            case 4:
                this.f43321b.U4();
                return;
            case 5:
                dy.E0(this.f43321b);
                return;
            case 6:
                this.f43321b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                dy dyVar3 = this.f43321b;
                kh.x3 x3Var = dyVar3.m0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                dyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f43321b.f37629a0[0].d.l();
                return;
            case 9:
                dy dyVar4 = this.f43321b;
                UndoView Y3 = dyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new dv(dyVar4, 25));
                    return;
                }
                return;
            case 10:
                dy dyVar5 = this.f43321b;
                dyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                dyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f43321b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f43321b.a5();
                return;
        }
    }
}
