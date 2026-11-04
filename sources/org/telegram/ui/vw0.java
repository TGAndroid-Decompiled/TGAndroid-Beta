package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class vw0 extends org.telegram.ui.ActionBar.j {
    public final String f50624a;
    public final yw0 f50625b;

    public vw0(yw0 yw0Var, String str) {
        this.f50625b = yw0Var;
        this.f50624a = str;
    }

    @Override
    public final void b(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        yw0 yw0Var = this.f50625b;
        long j10 = yw0Var.h;
        long j11 = yw0Var.f52426f;
        String str = this.f50624a;
        if (i3 == -1) {
            if (!yw0Var.f52427n && yw0Var.f52428r) {
                i16 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i16).f22989d7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i3 == 1) {
            i10 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i10).f22989d7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.hp.s1(i11).R.f(j11);
            if (yw0Var.f52428r) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    org.telegram.messenger.qr.a0(i15).E1(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    org.telegram.messenger.us.t(i12).N(j11);
                    i13 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
                    org.telegram.messenger.qr.a0(i13).E1(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i14 = ((org.telegram.ui.ActionBar.d2) yw0Var).currentAccount;
            org.telegram.messenger.us.t(i14).c0(yw0Var.f52426f, yw0Var.h, true);
            if (yw0Var.f52429s != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f47338b = true;
                int c2 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                obj.f47339c = c2;
                if (c2 != 0) {
                    obj.f47337a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                yw0Var.f52429s.l(obj);
            }
        }
        yw0Var.finishFragment();
    }
}
