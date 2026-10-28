package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class uv implements Runnable {
    public final int f44120a;
    public final ey f44121b;

    public uv(ey eyVar, int i10) {
        this.f44120a = i10;
        this.f44121b = eyVar;
    }

    @Override
    public final void run() {
        cf1 cf1Var;
        switch (this.f44120a) {
            case 0:
                ey eyVar = this.f44121b;
                mx mxVar = eyVar.C0;
                if (mxVar != null && mxVar.A0) {
                    mxVar.R(false);
                    return;
                }
                eyVar.X.f30347r.getText().clear();
                AndroidUtilities.hideKeyboard(eyVar.X.f30347r);
                eyVar.X.f30347r.clearFocus();
                eyVar.Y.b(false);
                return;
            case 1:
                ey eyVar2 = this.f44121b;
                if (eyVar2.R0 != 10) {
                    eyVar2.k4(false);
                }
                if (eyVar2.L && eyVar2.f4().I()) {
                    eyVar2.E0.h();
                    return;
                } else {
                    eyVar2.F4(true, true);
                    return;
                }
            case 2:
                ey eyVar3 = this.f44121b;
                jh.f fVar = eyVar3.f39103y1;
                if (fVar != null) {
                    fVar.d();
                }
                eyVar3.A3();
                eyVar3.B3();
                li.w1 w1Var = eyVar3.C1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-eyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f44121b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f44121b.U3();
                return;
            case 5:
                this.f44121b.c5();
                return;
            case 6:
                ey.E0(this.f44121b);
                return;
            case 7:
                MessagesController.getInstance(this.f44121b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            case 8:
                this.f44121b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 9:
                ey eyVar4 = this.f44121b;
                fi.v3 v3Var = eyVar4.f39057q0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                eyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 10:
                this.f44121b.f38998e0[0].d.l();
                return;
            case 11:
                ey eyVar5 = this.f44121b;
                UndoView g42 = eyVar5.g4();
                if (g42 != null) {
                    g42.l(0L, 15, null, new ev(eyVar5, 26));
                    return;
                }
                return;
            case 12:
                ey eyVar6 = this.f44121b;
                eyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                eyVar6.c5();
                return;
            case 13:
                ey eyVar7 = this.f44121b;
                eyVar7.f38998e0[0].f38702a.requestLayout();
                vw vwVar = eyVar7.G3;
                if (vwVar != null && (vwVar.getFragment() instanceof cf1)) {
                    cf1Var = (cf1) eyVar7.G3.getFragment();
                } else {
                    cf1Var = null;
                }
                if (cf1Var != null) {
                    cf1Var.B0();
                }
                eyVar7.O3(false);
                eyVar7.a5();
                mx mxVar2 = eyVar7.C0;
                if (mxVar2 != null) {
                    mxVar2.invalidate();
                    return;
                }
                return;
            default:
                this.f44121b.k5();
                return;
        }
    }
}
