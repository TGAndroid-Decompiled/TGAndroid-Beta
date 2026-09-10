package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
public final class z11 extends org.telegram.ui.ActionBar.k {
    public final String f39187a;
    public final c21 f39188b;

    public z11(c21 c21Var, String str) {
        this.f39188b = c21Var;
        this.f39187a = str;
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
        c21 c21Var = this.f39188b;
        long j3 = c21Var.f31502f;
        long j10 = c21Var.e;
        String str = this.f39187a;
        if (i10 == -1) {
            if (!c21Var.h && c21Var.f31503n) {
                i17 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i17).edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit2 = notificationsSettings.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j10);
            if (c21Var.f31503n) {
                edit2.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j10);
                    i14 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.p2) c21Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j10, j3);
            if (c21Var.f31504r != null) {
                ?? obj = new Object();
                obj.d = j10;
                obj.f37580b = true;
                int c10 = org.telegram.messenger.a2.c("notify2_", str, notificationsSettings, 0);
                obj.f37581c = c10;
                if (c10 != 0) {
                    obj.f37579a = org.telegram.messenger.a2.c("notifyuntil_", str, notificationsSettings, 0);
                }
                c21Var.f31504r.u(obj);
            }
        }
        c21Var.finishFragment();
    }
}
