package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;

public final class xv implements Runnable {

    public final int f44626a;

    public final gy f44627b;

    public xv(gy gyVar, int i10) {
        this.f44626a = i10;
        this.f44627b = gyVar;
    }

    @Override
    public final void run() {
        switch (this.f44626a) {
            case 0:
                gy gyVar = this.f44627b;
                if (gyVar.N0 != 10) {
                    gyVar.c4(false);
                }
                if (gyVar.H && gyVar.X3().G()) {
                    gyVar.A0.h();
                } else {
                    gyVar.x4(true, true);
                }
                break;
            case 1:
                gy gyVar2 = this.f44627b;
                qg.g gVar = gyVar2.f38601u1;
                if (gVar != null) {
                    gVar.d();
                }
                gyVar2.s3();
                gyVar2.m3();
                gyVar2.t3();
                org.telegram.ui.Components.wo0 wo0Var = gyVar2.f38620y1;
                if (wo0Var != null) {
                    wo0Var.setTranslationY(-gyVar2.v.c());
                }
                break;
            case 2:
                this.f44627b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 3:
                this.f44627b.M3();
                break;
            case 4:
                this.f44627b.U4();
                break;
            case 5:
                gy.F0(this.f44627b);
                break;
            case 6:
                this.f44627b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 7:
                gy gyVar3 = this.f44627b;
                lh.w3 w3Var = gyVar3.m0;
                if (w3Var != null) {
                    w3Var.e(true);
                }
                gyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 8:
                this.f44627b.f38498a0[0].d.l();
                break;
            case 9:
                gy gyVar4 = this.f44627b;
                UndoView undoViewY3 = gyVar4.Y3();
                if (undoViewY3 != null) {
                    undoViewY3.l(0L, 15, null, new gv(gyVar4, 25));
                }
                break;
            case 10:
                gy gyVar5 = this.f44627b;
                gyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                gyVar5.U4();
                break;
            case 11:
                MessagesController.getInstance(this.f44627b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                break;
            default:
                this.f44627b.a5();
                break;
        }
    }
}
