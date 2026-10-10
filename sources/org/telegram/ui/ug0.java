package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ug0 {
    public final vg0 f42473a;

    public ug0(vg0 vg0Var) {
        this.f42473a = vg0Var;
    }

    public final void a(kg0 kg0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        vg0 vg0Var = this.f42473a;
        vg0Var.L = true;
        wg0 wg0Var = vg0Var.V;
        wg0Var.J = 0;
        wg0Var.n1(0, false);
        int i11 = Build.VERSION.SDK_INT;
        if (AndroidUtilities.isSimAvailable()) {
            if (wg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (wg0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i11 >= 28 && wg0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i11 >= 26 && wg0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z14 = false;
            } else {
                z14 = true;
            }
            bk0 bk0Var = vg0Var.f42895a;
            if (bk0Var != null && "888".equals(bk0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (wg0Var.v) {
                wg0Var.f43640r.clear();
                if (!z11) {
                    wg0Var.f43640r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    wg0Var.f43640r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    wg0Var.f43640r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i11 >= 26) {
                    wg0Var.f43640r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!wg0Var.f43640r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            wg0Var.getParentActivity().requestPermissions((String[]) wg0Var.f43640r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.f20378a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.f20378a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f20378a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                    wg0Var.h = wg0Var.showDialog(alertDialog$Builder.f20378a);
                    vg0Var.L = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        tg0 tg0Var = new tg0(0, kg0Var, this);
        kg0Var.h.f(z10, z10);
        AndroidUtilities.runOnUIThread(tg0Var, 400L);
    }
}
