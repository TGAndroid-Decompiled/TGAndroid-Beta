package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class s11 extends org.telegram.ui.ActionBar.j {
    public final String f41556a;
    public final v11 f41557b;

    public s11(v11 v11Var, String str) {
        this.f41557b = v11Var;
        this.f41556a = str;
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
        v11 v11Var = this.f41557b;
        long j3 = v11Var.f42607f;
        long j10 = v11Var.f42606e;
        String str = this.f41556a;
        if (i10 == -1) {
            if (!v11Var.h && v11Var.f42608n) {
                i17 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j10);
            if (v11Var.f42608n) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j10);
                    i14 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.n2) v11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j10, j3);
            if (v11Var.f42609r != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f42894b = true;
                int c10 = org.telegram.messenger.q.c("notify2_", str, notificationsSettings, 0);
                obj.f42895c = c10;
                if (c10 != 0) {
                    obj.f42893a = org.telegram.messenger.q.c("notifyuntil_", str, notificationsSettings, 0);
                }
                v11Var.f42609r.v(obj);
            }
        }
        v11Var.finishFragment();
    }
}
