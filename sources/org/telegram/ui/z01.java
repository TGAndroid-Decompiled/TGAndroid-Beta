package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class z01 extends org.telegram.ui.ActionBar.j {
    public final String f43989a;
    public final c11 f43990b;

    public z01(c11 c11Var, String str) {
        this.f43990b = c11Var;
        this.f43989a = str;
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
        c11 c11Var = this.f43990b;
        long j10 = c11Var.f36179f;
        long j11 = c11Var.e;
        String str = this.f43989a;
        if (i10 == -1) {
            if (!c11Var.h && c11Var.f36180n) {
                i17 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (c11Var.f36180n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.o2) c11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (c11Var.f36181r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f37889b = true;
                int c10 = org.telegram.messenger.v0.c("notify2_", str, notificationsSettings, 0);
                obj.f37890c = c10;
                if (c10 != 0) {
                    obj.f37888a = org.telegram.messenger.v0.c("notifyuntil_", str, notificationsSettings, 0);
                }
                c11Var.f36181r.r(obj);
            }
        }
        c11Var.finishFragment();
    }
}
