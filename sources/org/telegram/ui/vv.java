package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class vv implements Runnable {
    public final int f43786a;
    public final fy f43787b;

    public vv(fy fyVar, int i10) {
        this.f43786a = i10;
        this.f43787b = fyVar;
    }

    @Override
    public final void run() {
        switch (this.f43786a) {
            case 0:
                fy fyVar = this.f43787b;
                if (fyVar.N0 != 10) {
                    fyVar.c4(false);
                }
                if (fyVar.H && fyVar.X3().G()) {
                    fyVar.A0.h();
                    return;
                } else {
                    fyVar.x4(true, true);
                    return;
                }
            case 1:
                fy fyVar2 = this.f43787b;
                sg.f fVar = fyVar2.f38359u1;
                if (fVar != null) {
                    fVar.d();
                }
                fyVar2.s3();
                fyVar2.m3();
                fyVar2.t3();
                org.telegram.ui.Components.hp0 hp0Var = fyVar2.f38378y1;
                if (hp0Var != null) {
                    hp0Var.setTranslationY(-fyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f43787b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f43787b.M3();
                return;
            case 4:
                this.f43787b.U4();
                return;
            case 5:
                fy.F0(this.f43787b);
                return;
            case 6:
                this.f43787b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                fy fyVar3 = this.f43787b;
                nh.t3 t3Var = fyVar3.m0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                fyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f43787b.f38256a0[0].d.l();
                return;
            case 9:
                fy fyVar4 = this.f43787b;
                UndoView Y3 = fyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new ev(fyVar4, 25));
                    return;
                }
                return;
            case 10:
                fy fyVar5 = this.f43787b;
                fyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                fyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f43787b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f43787b.a5();
                return;
        }
    }
}
