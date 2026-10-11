package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final String f41331a;
    public final u11 f41332b;

    public r11(u11 u11Var, String str) {
        this.f41332b = u11Var;
        this.f41331a = str;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u11 u11Var = this.f41332b;
        long j3 = u11Var.f42351f;
        long j10 = u11Var.f42350e;
        String str = this.f41331a;
        if (i10 == -1) {
            if (!u11Var.h && u11Var.f42352n) {
                i17 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j10);
            if (u11Var.f42352n) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j10);
                    i14 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j10, j3);
            if (u11Var.f42353r != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f42673b = true;
                int c10 = org.telegram.messenger.q.c("notify2_", str, notificationsSettings, 0);
                obj.f42674c = c10;
                if (c10 != 0) {
                    obj.f42672a = org.telegram.messenger.q.c("notifyuntil_", str, notificationsSettings, 0);
                }
                u11Var.f42353r.v(obj);
            }
        }
        u11Var.finishFragment();
    }
}
