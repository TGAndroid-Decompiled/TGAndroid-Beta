package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xw0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44647a;
    public final PrivacySettingsActivity f44648b;

    public xw0(PrivacySettingsActivity privacySettingsActivity, int i9) {
        this.f44647a = i9;
        this.f44648b = privacySettingsActivity;
    }

    public void a() {
        int i9;
        switch (this.f44647a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f44648b;
                yw0 yw0Var = privacySettingsActivity.f35907a;
                if (yw0Var != null && (i9 = privacySettingsActivity.f35914s) >= 0) {
                    yw0Var.m(i9);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.T(this.f44648b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        String string;
        switch (this.f44647a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f44648b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new xw0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f22702a);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
                privacySettingsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f44648b;
                boolean[] zArr = privacySettingsActivity2.V;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ih.q5(5));
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
                org.telegram.ui.Components.oc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f44648b;
                org.telegram.ui.ActionBar.c2 o6 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f35909c = o6;
                o6.f22766c0 = false;
                if (privacySettingsActivity3.O != privacySettingsActivity3.P) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.P;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.O = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ww0(privacySettingsActivity3, 1));
                return;
            case 4:
                fg0 fg0Var = new fg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f44648b;
                ww0 ww0Var = new ww0(privacySettingsActivity4, 2);
                fg0Var.B = 3;
                fg0Var.f38259a = 12;
                fg0Var.Z = ww0Var;
                privacySettingsActivity4.presentFragment(fg0Var);
                return;
        }
    }
}
