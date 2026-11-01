package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
public final class qy0 extends org.telegram.ui.ActionBar.k {
    public final String f40925a;
    public final ty0 f40926b;

    public qy0(ty0 ty0Var, String str) {
        this.f40926b = ty0Var;
        this.f40925a = str;
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
        ty0 ty0Var = this.f40926b;
        long j10 = ty0Var.h;
        long j11 = ty0Var.f41746f;
        String str = this.f40925a;
        if (i10 == -1) {
            if (!ty0Var.f41747n && ty0Var.f41748r) {
                i17 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(i17).e7.edit();
                edit.putInt("notify2_" + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i11).e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean("custom_" + str, true);
            i12 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.wp.r1(i12).Q.f(j11);
            if (ty0Var.f41748r) {
                edit2.putInt("notify2_" + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    org.telegram.messenger.is.a0(i16).E1(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit2.putInt("notify2_" + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    org.telegram.messenger.pt.t(i13).N(j11);
                    i14 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
                    org.telegram.messenger.is.a0(i14).E1(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                    }
                }
            }
            edit2.apply();
            i15 = ((org.telegram.ui.ActionBar.k2) ty0Var).currentAccount;
            org.telegram.messenger.pt.t(i15).c0(ty0Var.f41746f, ty0Var.h, true);
            if (ty0Var.f41749s != null) {
                ?? obj = new Object();
                obj.d = j11;
                obj.f41377b = true;
                int c10 = org.telegram.messenger.m5.c("notify2_", str, sharedPreferences, 0);
                obj.f41378c = c10;
                if (c10 != 0) {
                    obj.f41376a = org.telegram.messenger.m5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                ty0Var.f41749s.w(obj);
            }
        }
        ty0Var.finishFragment();
    }
}
