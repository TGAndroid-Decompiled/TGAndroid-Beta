package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vx0 implements org.telegram.ui.ActionBar.b2 {
    public final int f38725a;
    public final PrivacySettingsActivity f38726b;

    public vx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f38725a = i10;
        this.f38726b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f38725a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f38726b;
                wx0 wx0Var = privacySettingsActivity.f31513a;
                if (wx0Var != null && (i10 = privacySettingsActivity.f31522s) >= 0) {
                    wx0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f38726b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String string;
        switch (this.f38725a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f38726b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new vx0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f18655a);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f18655a;
                privacySettingsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f38726b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ai.u7(8));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z10) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                } else {
                    return;
                }
                org.telegram.ui.Components.xc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f38726b;
                org.telegram.ui.ActionBar.c2 o9 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f31517c = o9;
                o9.f18729g0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ux0(privacySettingsActivity3, 1));
                return;
            case 4:
                tg0 tg0Var = new tg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f38726b;
                ux0 ux0Var = new ux0(privacySettingsActivity4, 2);
                tg0Var.F = 3;
                tg0Var.f37784a = 12;
                tg0Var.f37790d0 = ux0Var;
                privacySettingsActivity4.presentFragment(tg0Var);
                return;
        }
    }
}
