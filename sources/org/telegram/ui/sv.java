package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class sv implements Runnable {
    public final int f41541a;
    public final cy f41542b;

    public sv(cy cyVar, int i10) {
        this.f41541a = i10;
        this.f41542b = cyVar;
    }

    @Override
    public final void run() {
        switch (this.f41541a) {
            case 0:
                cy cyVar = this.f41542b;
                lx lxVar = cyVar.C0;
                if (lxVar != null && lxVar.f32204y0) {
                    lxVar.Q(false);
                    return;
                }
                cyVar.X.f27729r.getText().clear();
                AndroidUtilities.hideKeyboard(cyVar.X.f27729r);
                cyVar.X.f27729r.clearFocus();
                cyVar.Y.b(false);
                return;
            case 1:
                cy cyVar2 = this.f41542b;
                if (cyVar2.R0 != 10) {
                    cyVar2.a4(false);
                }
                if (cyVar2.L && cyVar2.V3().G()) {
                    cyVar2.E0.h();
                    return;
                } else {
                    cyVar2.v4(true, true);
                    return;
                }
            case 2:
                cy cyVar3 = this.f41542b;
                ih.f fVar = cyVar3.f36199y1;
                if (fVar != null) {
                    fVar.d();
                }
                cyVar3.q3();
                cyVar3.j3();
                cyVar3.r3();
                ki.y1 y1Var = cyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-cyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f41542b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f41542b.K3();
                return;
            case 5:
                this.f41542b.S4();
                return;
            case 6:
                cy.x0(this.f41542b);
                return;
            case 7:
                this.f41542b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                cy cyVar4 = this.f41542b;
                ei.x3 x3Var = cyVar4.f36154q0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                cyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f41542b.f36095e0[0].d.l();
                return;
            case 10:
                cy cyVar5 = this.f41542b;
                UndoView W3 = cyVar5.W3();
                if (W3 != null) {
                    W3.l(0L, 15, null, new cv(cyVar5, 27));
                    return;
                }
                return;
            case 11:
                cy cyVar6 = this.f41542b;
                cyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                cyVar6.S4();
                return;
            case 12:
                MessagesController.getInstance(this.f41542b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f41542b.Y4();
                return;
        }
    }
}
