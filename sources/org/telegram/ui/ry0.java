package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends org.telegram.ui.ActionBar.k {
    public final String f41313a;
    public final uy0 f41314b;

    public ry0(uy0 uy0Var, String str) {
        this.f41314b = uy0Var;
        this.f41313a = str;
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
        uy0 uy0Var = this.f41314b;
        long j10 = uy0Var.h;
        long j11 = uy0Var.f42546f;
        String str = this.f41313a;
        if (i10 == -1) {
            if (!uy0Var.f42547n && uy0Var.f42548r) {
                i17 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i17).e7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i11).e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.vp.r1(i12).Q.f(j11);
            if (uy0Var.f42548r) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    org.telegram.messenger.hs.a0(i16).E1(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    org.telegram.messenger.ot.t(i13).N(j11);
                    i14 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
                    org.telegram.messenger.hs.a0(i14).E1(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.k2) uy0Var).currentAccount;
            org.telegram.messenger.ot.t(i15).c0(uy0Var.f42546f, uy0Var.h, true);
            if (uy0Var.f42549s != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f42148b = true;
                int c10 = org.telegram.messenger.m5.c("notify2_", str, sharedPreferences, 0);
                obj.f42149c = c10;
                if (c10 != 0) {
                    obj.f42147a = org.telegram.messenger.m5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                uy0Var.f42549s.w(obj);
            }
        }
        uy0Var.finishFragment();
    }
}
