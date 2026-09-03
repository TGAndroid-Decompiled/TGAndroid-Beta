package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class y11 extends org.telegram.ui.ActionBar.j {
    public final d21 f43511a;

    public y11(d21 d21Var) {
        this.f43511a = d21Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        String obj;
        int intValue;
        String str;
        String str2;
        String str3;
        d21 d21Var = this.f43511a;
        boolean z4 = d21Var.F;
        SharedConfig.ProxyInfo proxyInfo = d21Var.G;
        if (i10 == -1) {
            d21Var.finishFragment();
            return;
        }
        boolean z10 = true;
        if (i10 == 1 && d21Var.getParentActivity() != null) {
            sf.a a2 = sf.b.a();
            int i12 = d21Var.v;
            if (i12 != 0) {
                i11 = i12;
            } else {
                i11 = 1;
            }
            a2.f47330a = i11;
            if (i12 == 3) {
                obj = sf.k.i(d21Var.f35946a[0].getText().toString());
            } else {
                obj = d21Var.f35946a[0].getText().toString();
            }
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f47331b = obj;
            if (d21Var.v == 3) {
                intValue = 443;
            } else {
                intValue = Utilities.parseInt((CharSequence) d21Var.f35946a[1].getText().toString()).intValue();
            }
            a2.f47332c = intValue;
            if (d21Var.v != 1) {
                str = "";
            } else {
                str = d21Var.f35946a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (d21Var.v != 1) {
                str2 = "";
            } else {
                str2 = d21Var.f35946a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.f47333e = str2;
            if (d21Var.v == 1) {
                str3 = "";
            } else {
                str3 = d21Var.f35946a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f47334f = str4;
            proxyInfo.settings = new sf.b(a2);
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
            d21Var.finishFragment();
        }
    }
}
