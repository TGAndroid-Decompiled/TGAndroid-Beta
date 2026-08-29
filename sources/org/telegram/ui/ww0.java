package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ww0 implements org.telegram.ui.ActionBar.b2 {
    public final int f44392a;
    public final PrivacySettingsActivity f44393b;

    public ww0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f44392a = i10;
        this.f44393b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f44392a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f44393b;
                xw0 xw0Var = privacySettingsActivity.f35973a;
                if (xw0Var != null && (i10 = privacySettingsActivity.f35980s) >= 0) {
                    xw0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f44393b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String string;
        switch (this.f44392a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f44393b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new ww0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f22714a);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
                privacySettingsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f44393b;
                boolean[] zArr = privacySettingsActivity2.V;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new lh.o5(5));
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
                org.telegram.ui.Components.tc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f44393b;
                org.telegram.ui.ActionBar.c2 o10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f35975c = o10;
                o10.f22783c0 = false;
                if (privacySettingsActivity3.O != privacySettingsActivity3.P) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.P;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.O = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new vw0(privacySettingsActivity3, 1));
                return;
            case 4:
                fg0 fg0Var = new fg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f44393b;
                vw0 vw0Var = new vw0(privacySettingsActivity4, 2);
                fg0Var.B = 3;
                fg0Var.f38151a = 12;
                fg0Var.Z = vw0Var;
                privacySettingsActivity4.presentFragment(fg0Var);
                return;
        }
    }
}
