package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rg0 {
    public final sg0 f37124a;

    public rg0(sg0 sg0Var) {
        this.f37124a = sg0Var;
    }

    public final void a(hg0 hg0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        sg0 sg0Var = this.f37124a;
        sg0Var.L = true;
        tg0 tg0Var = sg0Var.V;
        tg0Var.J = 0;
        tg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            if (tg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (tg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 >= 28 && tg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i11 >= 26 && tg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            wj0 wj0Var = sg0Var.f37448a;
            if (wj0Var != null && "888".equals(wj0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (tg0Var.v) {
                tg0Var.f37805r.clear();
                if (!z10) {
                    tg0Var.f37805r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    tg0Var.f37805r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    tg0Var.f37805r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    tg0Var.f37805r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!tg0Var.f37805r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !tg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !tg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            tg0Var.getParentActivity().requestPermissions((String[]) tg0Var.f37805r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.f18655a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.f18655a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f18655a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                    tg0Var.h = tg0Var.showDialog(alertDialog$Builder.f18655a);
                    sg0Var.L = true;
                    return;
                }
            }
        }
        qg0 qg0Var = new qg0(0, hg0Var, this);
        hg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(qg0Var, 400L);
    }
}
