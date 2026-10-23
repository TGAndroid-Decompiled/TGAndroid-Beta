package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final w11 f40967a;

    public r11(w11 w11Var) {
        this.f40967a = w11Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        w11 w11Var = this.f40967a;
        boolean z10 = w11Var.I;
        SharedConfig.ProxyInfo proxyInfo = w11Var.J;
        if (i10 == -1) {
            w11Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && w11Var.getParentActivity() != null) {
            k2.q0 a2 = qi.a.a();
            int i11 = w11Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f14823a = i11;
            String obj = w11Var.f42891a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f14825c = obj;
            if (w11Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) w11Var.f42891a[1].getText().toString()).intValue();
            }
            a2.f14824b = intValue;
            if (w11Var.v != 1) {
                str = "";
            } else {
                str = w11Var.f42891a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (w11Var.v != 1) {
                str2 = "";
            } else {
                str2 = w11Var.f42891a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (w11Var.v == 1) {
                str3 = "";
            } else {
                str3 = w11Var.f42891a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f14826f = str4;
            proxyInfo.settings = a2.b();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (z10) {
                SharedConfig.addProxy(proxyInfo);
                SharedConfig.currentProxy = proxyInfo;
                edit.putBoolean("proxy_enabled", true);
            } else {
                z11 = globalMainSettings.getBoolean("proxy_enabled", false);
                SharedConfig.saveProxyList();
            }
            if (z10 || SharedConfig.currentProxy == proxyInfo) {
                proxyInfo.settings.h(edit);
                ConnectionsManager.setProxySettings(z11, proxyInfo.settings);
            }
            edit.commit();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
            w11Var.finishFragment();
        }
    }
}
