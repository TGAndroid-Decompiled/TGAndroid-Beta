package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class y11 extends org.telegram.ui.ActionBar.j {
    public final d21 f45825a;

    public y11(d21 d21Var) {
        this.f45825a = d21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        d21 d21Var = this.f45825a;
        boolean z10 = d21Var.I;
        SharedConfig.ProxyInfo proxyInfo = d21Var.J;
        if (i10 == -1) {
            d21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && d21Var.getParentActivity() != null) {
            k2.r0 a2 = ti.a.a();
            int i11 = d21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f16262a = i11;
            String obj = d21Var.f38498a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f16264c = obj;
            if (d21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) d21Var.f38498a[1].getText().toString()).intValue();
            }
            a2.f16263b = intValue;
            if (d21Var.v != 1) {
                str = "";
            } else {
                str = d21Var.f38498a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (d21Var.v != 1) {
                str2 = "";
            } else {
                str2 = d21Var.f38498a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (d21Var.v == 1) {
                str3 = "";
            } else {
                str3 = d21Var.f38498a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f16265f = str4;
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
            d21Var.finishFragment();
        }
    }
}
