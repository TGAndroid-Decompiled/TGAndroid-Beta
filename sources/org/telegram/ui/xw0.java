package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class xw0 implements org.telegram.ui.ActionBar.a2 {

    public final int f44632a;

    public final PrivacySettingsActivity f44633b;

    public xw0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f44632a = i10;
        this.f44633b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f44632a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f44633b;
                yw0 yw0Var = privacySettingsActivity.f35910a;
                if (yw0Var != null && (i10 = privacySettingsActivity.f35917s) >= 0) {
                    yw0Var.m(i10);
                    break;
                }
                break;
            default:
                PrivacySettingsActivity.U(this.f44633b);
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String string;
        switch (this.f44632a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f44633b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new xw0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f22702a);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
                privacySettingsActivity.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
                break;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f44633b;
                boolean[] zArr = privacySettingsActivity2.V;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new jh.m5(5));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z10) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                }
                org.telegram.ui.Components.mc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                break;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f44633b;
                org.telegram.ui.ActionBar.b2 b2VarO = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f35912c = b2VarO;
                b2VarO.f22747c0 = false;
                if (privacySettingsActivity3.O != privacySettingsActivity3.P) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.P;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.O = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ww0(privacySettingsActivity3, 1));
                break;
            case 4:
                ig0 ig0Var = new ig0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f44633b;
                ww0 ww0Var = new ww0(privacySettingsActivity4, 2);
                ig0Var.B = 3;
                ig0Var.f39079a = 12;
                ig0Var.Z = ww0Var;
                privacySettingsActivity4.presentFragment(ig0Var);
                break;
        }
    }
}
