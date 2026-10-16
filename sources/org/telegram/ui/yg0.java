package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yg0 {
    public final zg0 f41826a;

    public yg0(zg0 zg0Var) {
        this.f41826a = zg0Var;
    }

    public final void a(og0 og0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        zg0 zg0Var = this.f41826a;
        zg0Var.L = true;
        ah0 ah0Var = zg0Var.V;
        ah0Var.J = 0;
        ah0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            if (ah0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (ah0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i11 >= 28 && ah0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i11 >= 26 && ah0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            fk0 fk0Var = zg0Var.f42309a;
            if (fk0Var != null && "888".equals(fk0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (ah0Var.v) {
                ah0Var.f33926r.clear();
                if (!z11) {
                    ah0Var.f33926r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    ah0Var.f33926r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    ah0Var.f33926r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    ah0Var.f33926r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ah0Var.f33926r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !ah0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ah0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ah0Var.getParentActivity().requestPermissions((String[]) ah0Var.f33926r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.f19248a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.f19248a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f19248a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    ah0Var.h = ah0Var.showDialog(alertDialog$Builder.f19248a);
                    zg0Var.L = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        xg0 xg0Var = new xg0(0, og0Var, this);
        og0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(xg0Var, 400L);
    }
}
