package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class t11 extends org.telegram.ui.ActionBar.j {
    public final String f37596a;
    public final w11 f37597b;

    public t11(w11 w11Var, String str) {
        this.f37597b = w11Var;
        this.f37596a = str;
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
        w11 w11Var = this.f37597b;
        long j3 = w11Var.f38649f;
        long j10 = w11Var.e;
        String str = this.f37596a;
        if (i10 == -1) {
            if (!w11Var.h && w11Var.f38650n) {
                i17 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j10);
            if (w11Var.f38650n) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j10);
                    i14 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j10, j3);
            if (w11Var.f38651r != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f39172b = true;
                int c10 = org.telegram.messenger.l0.c("notify2_", str, notificationsSettings, 0);
                obj.f39173c = c10;
                if (c10 != 0) {
                    obj.f39171a = org.telegram.messenger.l0.c("notifyuntil_", str, notificationsSettings, 0);
                }
                w11Var.f38651r.v(obj);
            }
        }
        w11Var.finishFragment();
    }
}
