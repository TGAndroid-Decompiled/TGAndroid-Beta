package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vg0 {
    public final wg0 f37554a;

    public vg0(wg0 wg0Var) {
        this.f37554a = wg0Var;
    }

    public final void a(kg0 kg0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        wg0 wg0Var = this.f37554a;
        wg0Var.L = true;
        xg0 xg0Var = wg0Var.V;
        xg0Var.J = 0;
        xg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            if (xg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (xg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 >= 28 && xg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i11 >= 26 && xg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            ck0 ck0Var = wg0Var.f38179a;
            if (ck0Var != null && "888".equals(ck0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (xg0Var.v) {
                xg0Var.f38738r.clear();
                if (!z10) {
                    xg0Var.f38738r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    xg0Var.f38738r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    xg0Var.f38738r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    xg0Var.f38738r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!xg0Var.f38738r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !xg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !xg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            xg0Var.getParentActivity().requestPermissions((String[]) xg0Var.f38738r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.f17528a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.f17528a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f17528a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    xg0Var.h = xg0Var.showDialog(alertDialog$Builder.f17528a);
                    wg0Var.L = true;
                    return;
                }
            }
        }
        ug0 ug0Var = new ug0(0, kg0Var, this);
        kg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(ug0Var, 400L);
    }
}
