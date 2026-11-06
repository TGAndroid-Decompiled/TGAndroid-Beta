package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class x60 implements qw {
    public final int f51764a = 0;
    public final LaunchActivity f51765b;
    public final TLRPC.User f51766c;
    public final String d;
    public final int f51767e;

    public x60(LaunchActivity launchActivity, String str, int i7, TLRPC.User user) {
        this.f51765b = launchActivity;
        this.d = str;
        this.f51767e = i7;
        this.f51766c = user;
    }

    @Override
    public final boolean G() {
        switch (this.f51764a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean N(ww wwVar) {
        switch (this.f51764a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        int i11 = this.f51764a;
        int i12 = this.f51767e;
        String str = this.d;
        TLRPC.User user = this.f51766c;
        LaunchActivity launchActivity = this.f51765b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.B1;
                long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26505a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f27014id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.qp.s1(i12).q1(user);
                org.telegram.messenger.gz.C(i12).p0(org.telegram.messenger.qp.s1(i12).j1(j3), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j3)) {
                    k10.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (org.telegram.messenger.qp.s1(i12).E(k10, wwVar, null, null)) {
                    org.telegram.messenger.qs.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new an(k10), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.B1;
                long j10 = ((org.telegram.messenger.xr) arrayList.get(0)).f26505a;
                Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j10)) {
                    k11.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j10)) {
                    k11.putLong("user_id", j10);
                } else {
                    k11.putLong("chat_id", -j10);
                }
                k11.putString("attach_bot", org.telegram.messenger.t10.n(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.qp.s1(i12).E(k11, wwVar, null, null)) {
                    org.telegram.messenger.qs.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new an(k11), true, false);
                }
                return true;
        }
    }

    public x60(LaunchActivity launchActivity, TLRPC.User user, String str, int i7) {
        this.f51765b = launchActivity;
        this.f51766c = user;
        this.d = str;
        this.f51767e = i7;
    }
}
