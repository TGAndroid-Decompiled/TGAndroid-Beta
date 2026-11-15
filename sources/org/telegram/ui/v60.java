package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v60 implements sw {
    public final int f52139a = 0;
    public final LaunchActivity f52140b;
    public final TLRPC.User f52141c;
    public final String d;
    public final int f52142e;

    public v60(LaunchActivity launchActivity, String str, int i7, TLRPC.User user) {
        this.f52140b = launchActivity;
        this.d = str;
        this.f52142e = i7;
        this.f52141c = user;
    }

    @Override
    public final boolean H() {
        switch (this.f52139a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean P(yw ywVar) {
        switch (this.f52139a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        int i11 = this.f52139a;
        int i12 = this.f52142e;
        String str = this.d;
        TLRPC.User user = this.f52141c;
        LaunchActivity launchActivity = this.f52140b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.C1;
                long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).f26861a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f28113id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.np.s1(i12).q1(user);
                org.telegram.messenger.ez.C(i12).p0(org.telegram.messenger.np.s1(i12).j1(j3), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j3)) {
                    k10.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (org.telegram.messenger.np.s1(i12).E(k10, ywVar, null, null)) {
                    org.telegram.messenger.ns.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new an(k10), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.C1;
                long j10 = ((org.telegram.messenger.ur) arrayList.get(0)).f26861a;
                Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j10)) {
                    k11.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j10)) {
                    k11.putLong("user_id", j10);
                } else {
                    k11.putLong("chat_id", -j10);
                }
                k11.putString("attach_bot", org.telegram.messenger.q10.n(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.np.s1(i12).E(k11, ywVar, null, null)) {
                    org.telegram.messenger.ns.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new an(k11), true, false);
                }
                return true;
        }
    }

    public v60(LaunchActivity launchActivity, TLRPC.User user, String str, int i7) {
        this.f52140b = launchActivity;
        this.f52141c = user;
        this.d = str;
        this.f52142e = i7;
    }
}
