package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class z11 extends org.telegram.ui.ActionBar.j {
    public final String f42456a;
    public final c21 f42457b;

    public z11(c21 c21Var, String str) {
        this.f42457b = c21Var;
        this.f42456a = str;
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
        c21 c21Var = this.f42457b;
        long j10 = c21Var.f34710f;
        long j11 = c21Var.e;
        String str = this.f42456a;
        if (i10 == -1) {
            if (!c21Var.h && c21Var.f34711n) {
                i17 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (c21Var.f34711n) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.m2) c21Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (c21Var.f34712r != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f34274b = true;
                int d = org.telegram.messenger.q.d("notify2_", str, notificationsSettings, 0);
                obj.f34275c = d;
                if (d != 0) {
                    obj.f34273a = org.telegram.messenger.q.d("notifyuntil_", str, notificationsSettings, 0);
                }
                c21Var.f34712r.v(obj);
            }
        }
        c21Var.finishFragment();
    }
}
