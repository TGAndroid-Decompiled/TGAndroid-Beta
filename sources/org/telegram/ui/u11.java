package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class u11 extends org.telegram.ui.ActionBar.j {
    public final z11 f41768a;

    public u11(z11 z11Var) {
        this.f41768a = z11Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        String obj;
        int intValue;
        String str;
        String str2;
        String str3;
        z11 z11Var = this.f41768a;
        boolean z4 = z11Var.F;
        SharedConfig.ProxyInfo proxyInfo = z11Var.G;
        if (i10 == -1) {
            z11Var.finishFragment();
            return;
        }
        boolean z10 = true;
        if (i10 == 1 && z11Var.getParentActivity() != null) {
            org.telegram.ui.Components.hj0 a2 = sf.a.a();
            int i12 = z11Var.v;
            if (i12 != 0) {
                i11 = i12;
            } else {
                i11 = 1;
            }
            a2.f27500a = i11;
            if (i12 == 3) {
                obj = sf.j.i(z11Var.f43772a[0].getText().toString());
            } else {
                obj = z11Var.f43772a[0].getText().toString();
            }
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f27501b = obj;
            if (z11Var.v == 3) {
                intValue = 443;
            } else {
                intValue = Utilities.parseInt((CharSequence) z11Var.f43772a[1].getText().toString()).intValue();
            }
            a2.f27502c = intValue;
            if (z11Var.v != 1) {
                str = "";
            } else {
                str = z11Var.f43772a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (z11Var.v != 1) {
                str2 = "";
            } else {
                str2 = z11Var.f43772a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.f27503e = str2;
            if (z11Var.v == 1) {
                str3 = "";
            } else {
                str3 = z11Var.f43772a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f27504f = str4;
            proxyInfo.settings = new sf.a(a2);
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (z4) {
                SharedConfig.addProxy(proxyInfo);
                SharedConfig.currentProxy = proxyInfo;
                edit.putBoolean("proxy_enabled", true);
            } else {
                z10 = globalMainSettings.getBoolean("proxy_enabled", false);
                SharedConfig.saveProxyList();
            }
            if (z4 || SharedConfig.currentProxy == proxyInfo) {
                proxyInfo.settings.f(edit);
                ConnectionsManager.setProxySettings(z10, proxyInfo.settings);
            }
            edit.commit();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
            z11Var.finishFragment();
        }
    }
}
