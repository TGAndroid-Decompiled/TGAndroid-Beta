package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.ConnectionsManager;
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final w11 f37903a;

    public r11(w11 w11Var) {
        this.f37903a = w11Var;
    }

    @Override
    public final void b(int i10) {
        String obj;
        int intValue;
        boolean z4;
        w11 w11Var = this.f37903a;
        SharedConfig.ProxyInfo proxyInfo = w11Var.H;
        if (i10 == -1) {
            w11Var.finishFragment();
        } else if (i10 == 1 && w11Var.getParentActivity() != null) {
            if (w11Var.v == 2) {
                obj = WebProxyTransport.normalizeHost(w11Var.f39299a[0].getText().toString());
            } else {
                obj = w11Var.f39299a[0].getText().toString();
            }
            proxyInfo.address = obj;
            if (w11Var.v == 2) {
                intValue = 443;
            } else {
                intValue = Utilities.parseInt((CharSequence) w11Var.f39299a[1].getText().toString()).intValue();
            }
            proxyInfo.port = intValue;
            int i11 = w11Var.v;
            proxyInfo.type = i11;
            if (i11 == 0) {
                proxyInfo.secret = "";
                proxyInfo.username = w11Var.f39299a[2].getText().toString();
                proxyInfo.password = w11Var.f39299a[3].getText().toString();
            } else {
                proxyInfo.secret = w11Var.f39299a[4].getText().toString();
                proxyInfo.username = "";
                proxyInfo.password = "";
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (w11Var.G) {
                SharedConfig.addProxy(proxyInfo);
                SharedConfig.currentProxy = proxyInfo;
                edit.putBoolean("proxy_enabled", true);
                z4 = true;
            } else {
                boolean z10 = globalMainSettings.getBoolean("proxy_enabled", false);
                SharedConfig.saveProxyList();
                z4 = z10;
            }
            if (w11Var.G || SharedConfig.currentProxy == proxyInfo) {
                edit.putString("proxy_ip", proxyInfo.address);
                edit.putString("proxy_pass", proxyInfo.password);
                edit.putString("proxy_user", proxyInfo.username);
                edit.putInt("proxy_port", proxyInfo.port);
                edit.putString("proxy_secret", proxyInfo.secret);
                edit.putInt("proxy_type", proxyInfo.type);
                ConnectionsManager.setProxySettings(z4, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, proxyInfo.type);
            }
            edit.commit();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
            w11Var.finishFragment();
        }
    }
}
