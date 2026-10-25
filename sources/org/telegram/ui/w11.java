package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class w11 extends org.telegram.ui.ActionBar.j {
    public final b21 f44944a;

    public w11(b21 b21Var) {
        this.f44944a = b21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        b21 b21Var = this.f44944a;
        boolean z10 = b21Var.I;
        SharedConfig.ProxyInfo proxyInfo = b21Var.J;
        if (i10 == -1) {
            b21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && b21Var.getParentActivity() != null) {
            k2.r0 a2 = ti.a.a();
            int i11 = b21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f16263a = i11;
            String obj = b21Var.f37952a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f16265c = obj;
            if (b21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) b21Var.f37952a[1].getText().toString()).intValue();
            }
            a2.f16264b = intValue;
            if (b21Var.v != 1) {
                str = "";
            } else {
                str = b21Var.f37952a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (b21Var.v != 1) {
                str2 = "";
            } else {
                str2 = b21Var.f37952a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (b21Var.v == 1) {
                str3 = "";
            } else {
                str3 = b21Var.f37952a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f16266f = str4;
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
            b21Var.finishFragment();
        }
    }
}
