package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f38233a;
    public final PrivacySettingsActivity f38234b;

    public tx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f38233a = i10;
        this.f38234b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f38233a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f38234b;
                ux0 ux0Var = privacySettingsActivity.f31497a;
                if (ux0Var != null && (i10 = privacySettingsActivity.f31506s) >= 0) {
                    ux0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f38234b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        String string;
        switch (this.f38233a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f38234b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f18647a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f18647a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new tx0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f18647a);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f18647a;
                privacySettingsActivity.showDialog(a2Var2);
                TextView textView = (TextView) a2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19284q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f38234b;
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
                org.telegram.ui.Components.yc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f38234b;
                org.telegram.ui.ActionBar.a2 o9 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f31501c = o9;
                o9.f18668g0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new sx0(privacySettingsActivity3, 1));
                return;
            case 4:
                qg0 qg0Var = new qg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f38234b;
                sx0 sx0Var = new sx0(privacySettingsActivity4, 2);
                qg0Var.F = 3;
                qg0Var.f36870a = 12;
                qg0Var.f36876d0 = sx0Var;
                privacySettingsActivity4.presentFragment(qg0Var);
                return;
        }
    }
}
