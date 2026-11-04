package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class r60 implements nw {
    public final int f49108a = 0;
    public final LaunchActivity f49109b;
    public final TLRPC.User f49110c;
    public final String d;
    public final int f49111e;

    public r60(LaunchActivity launchActivity, String str, int i3, TLRPC.User user) {
        this.f49109b = launchActivity;
        this.d = str;
        this.f49111e = i3;
        this.f49110c = user;
    }

    @Override
    public final boolean G() {
        switch (this.f49108a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean N(uw uwVar) {
        switch (this.f49108a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11 = this.f49108a;
        int i12 = this.f49111e;
        String str = this.d;
        TLRPC.User user = this.f49110c;
        LaunchActivity launchActivity = this.f49109b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.E1;
                long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f27063id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.hp.s1(i12).q1(user);
                org.telegram.messenger.yy.C(i12).p0(org.telegram.messenger.hp.s1(i12).j1(j10), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j10)) {
                    k10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                if (org.telegram.messenger.hp.s1(i12).E(k10, uwVar, null, null)) {
                    org.telegram.messenger.hs.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new wm(k10), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.E1;
                long j11 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
                Bundle k11 = a1.g.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j11)) {
                    k11.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j11)) {
                    k11.putLong("user_id", j11);
                } else {
                    k11.putLong("chat_id", -j11);
                }
                k11.putString("attach_bot", org.telegram.messenger.l10.n(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.hp.s1(i12).E(k11, uwVar, null, null)) {
                    org.telegram.messenger.hs.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new wm(k11), true, false);
                }
                return true;
        }
    }

    public r60(LaunchActivity launchActivity, TLRPC.User user, String str, int i3) {
        this.f49109b = launchActivity;
        this.f49110c = user;
        this.d = str;
        this.f49111e = i3;
    }
}
