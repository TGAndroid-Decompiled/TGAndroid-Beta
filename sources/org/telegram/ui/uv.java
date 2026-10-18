package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class uv implements Runnable {
    public final int f42073a;
    public final ey f42074b;

    public uv(ey eyVar, int i10) {
        this.f42073a = i10;
        this.f42074b = eyVar;
    }

    @Override
    public final void run() {
        switch (this.f42073a) {
            case 0:
                ey eyVar = this.f42074b;
                nx nxVar = eyVar.C0;
                if (nxVar != null && nxVar.f31369y0) {
                    nxVar.Q(false);
                    return;
                }
                eyVar.X.f27719r.getText().clear();
                AndroidUtilities.hideKeyboard(eyVar.X.f27719r);
                eyVar.X.f27719r.clearFocus();
                eyVar.Y.b(false);
                return;
            case 1:
                ey eyVar2 = this.f42074b;
                if (eyVar2.R0 != 10) {
                    eyVar2.a4(false);
                }
                if (eyVar2.L && eyVar2.V3().G()) {
                    eyVar2.E0.h();
                    return;
                } else {
                    eyVar2.v4(true, true);
                    return;
                }
            case 2:
                ey eyVar3 = this.f42074b;
                ih.f fVar = eyVar3.f36757y1;
                if (fVar != null) {
                    fVar.d();
                }
                eyVar3.q3();
                eyVar3.j3();
                eyVar3.r3();
                ki.y1 y1Var = eyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-eyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f42074b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f42074b.K3();
                return;
            case 5:
                this.f42074b.S4();
                return;
            case 6:
                ey.x0(this.f42074b);
                return;
            case 7:
                this.f42074b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                ey eyVar4 = this.f42074b;
                ei.x3 x3Var = eyVar4.f36712q0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                eyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f42074b.f36653e0[0].d.l();
                return;
            case 10:
                ey eyVar5 = this.f42074b;
                UndoView W3 = eyVar5.W3();
                if (W3 != null) {
                    W3.l(0L, 15, null, new ev(eyVar5, 27));
                    return;
                }
                return;
            case 11:
                ey eyVar6 = this.f42074b;
                eyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                eyVar6.S4();
                return;
            case 12:
                MessagesController.getInstance(this.f42074b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f42074b.Y4();
                return;
        }
    }
}
