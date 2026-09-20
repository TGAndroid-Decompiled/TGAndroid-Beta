package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wg0 {
    public final xg0 f39146a;

    public wg0(xg0 xg0Var) {
        this.f39146a = xg0Var;
    }

    public final void a(mg0 mg0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        xg0 xg0Var = this.f39146a;
        xg0Var.L = true;
        yg0 yg0Var = xg0Var.V;
        yg0Var.J = 0;
        yg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && AndroidUtilities.isSimAvailable()) {
            if (yg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (yg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 >= 28 && yg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (i11 >= 26 && yg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            dk0 dk0Var = xg0Var.f39560a;
            if (dk0Var != null && "888".equals(dk0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (yg0Var.v) {
                yg0Var.f39930r.clear();
                if (!z10) {
                    yg0Var.f39930r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    yg0Var.f39930r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    yg0Var.f39930r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i11 >= 26) {
                    yg0Var.f39930r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!yg0Var.f39930r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !yg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !yg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            yg0Var.getParentActivity().requestPermissions((String[]) yg0Var.f39930r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z10 && (!z11 || !z12)) {
                        alertDialog$Builder.f18654a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z11 && z12) {
                        alertDialog$Builder.f18654a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f18654a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                    yg0Var.h = yg0Var.showDialog(alertDialog$Builder.f18654a);
                    xg0Var.L = true;
                    return;
                }
            }
        }
        vg0 vg0Var = new vg0(0, mg0Var, this);
        mg0Var.h.f(true, true);
        AndroidUtilities.runOnUIThread(vg0Var, 400L);
    }
}
