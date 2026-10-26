package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class sv implements Runnable {
    public final int f43606a;
    public final cy f43607b;

    public sv(cy cyVar, int i10) {
        this.f43606a = i10;
        this.f43607b = cyVar;
    }

    @Override
    public final void run() {
        af1 af1Var;
        switch (this.f43606a) {
            case 0:
                cy cyVar = this.f43607b;
                jx jxVar = cyVar.C0;
                if (jxVar != null && jxVar.A0) {
                    jxVar.R(false);
                    return;
                }
                cyVar.X.f30367r.getText().clear();
                AndroidUtilities.hideKeyboard(cyVar.X.f30367r);
                cyVar.X.f30367r.clearFocus();
                cyVar.Y.b(false);
                return;
            case 1:
                cy cyVar2 = this.f43607b;
                if (cyVar2.R0 != 10) {
                    cyVar2.k4(false);
                }
                if (cyVar2.L && cyVar2.f4().G()) {
                    cyVar2.E0.h();
                    return;
                } else {
                    cyVar2.F4(true, true);
                    return;
                }
            case 2:
                cy cyVar3 = this.f43607b;
                jh.f fVar = cyVar3.f38691y1;
                if (fVar != null) {
                    fVar.d();
                }
                cyVar3.A3();
                cyVar3.B3();
                li.w1 w1Var = cyVar3.C1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-cyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f43607b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f43607b.U3();
                return;
            case 5:
                this.f43607b.c5();
                return;
            case 6:
                cy.E0(this.f43607b);
                return;
            case 7:
                MessagesController.getInstance(this.f43607b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            case 8:
                this.f43607b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 9:
                cy cyVar4 = this.f43607b;
                fi.v3 v3Var = cyVar4.f38645q0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                cyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 10:
                this.f43607b.f38586e0[0].d.l();
                return;
            case 11:
                cy cyVar5 = this.f43607b;
                UndoView g42 = cyVar5.g4();
                if (g42 != null) {
                    g42.l(0L, 15, null, new cv(cyVar5, 26));
                    return;
                }
                return;
            case 12:
                cy cyVar6 = this.f43607b;
                cyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                cyVar6.c5();
                return;
            case 13:
                cy cyVar7 = this.f43607b;
                cyVar7.f38586e0[0].f37913a.requestLayout();
                tw twVar = cyVar7.G3;
                if (twVar != null && (twVar.getFragment() instanceof af1)) {
                    af1Var = (af1) cyVar7.G3.getFragment();
                } else {
                    af1Var = null;
                }
                if (af1Var != null) {
                    af1Var.B0();
                }
                cyVar7.O3(false);
                cyVar7.a5();
                jx jxVar2 = cyVar7.C0;
                if (jxVar2 != null) {
                    jxVar2.invalidate();
                    return;
                }
                return;
            default:
                this.f43607b.k5();
                return;
        }
    }
}
