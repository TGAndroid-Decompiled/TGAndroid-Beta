package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class y01 extends org.telegram.ui.ActionBar.j {
    public final String f43289a;
    public final b11 f43290b;

    public y01(b11 b11Var, String str) {
        this.f43290b = b11Var;
        this.f43289a = str;
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
        b11 b11Var = this.f43290b;
        long j10 = b11Var.f35518f;
        long j11 = b11Var.e;
        String str = this.f43289a;
        if (i10 == -1) {
            if (!b11Var.h && b11Var.f35519n) {
                i17 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (b11Var.f35519n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (b11Var.f35520r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f37199b = true;
                int c10 = org.telegram.messenger.g0.c("notify2_", str, notificationsSettings, 0);
                obj.f37200c = c10;
                if (c10 != 0) {
                    obj.f37198a = org.telegram.messenger.g0.c("notifyuntil_", str, notificationsSettings, 0);
                }
                b11Var.f35520r.r(obj);
            }
        }
        b11Var.finishFragment();
    }
}
