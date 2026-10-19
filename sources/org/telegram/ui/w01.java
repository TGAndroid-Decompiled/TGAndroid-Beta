package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class w01 extends org.telegram.ui.ActionBar.j {
    public final String f42420a;
    public final z01 f42421b;

    public w01(z01 z01Var, String str) {
        this.f42421b = z01Var;
        this.f42420a = str;
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
        z01 z01Var = this.f42421b;
        long j10 = z01Var.f43589f;
        long j11 = z01Var.e;
        String str = this.f42420a;
        if (i10 == -1) {
            if (!z01Var.h && z01Var.f43590n) {
                i17 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (z01Var.f43590n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (z01Var.f43591r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f36682b = true;
                int c10 = org.telegram.messenger.g0.c("notify2_", str, notificationsSettings, 0);
                obj.f36683c = c10;
                if (c10 != 0) {
                    obj.f36681a = org.telegram.messenger.g0.c("notifyuntil_", str, notificationsSettings, 0);
                }
                z01Var.f43591r.r(obj);
            }
        }
        z01Var.finishFragment();
    }
}
