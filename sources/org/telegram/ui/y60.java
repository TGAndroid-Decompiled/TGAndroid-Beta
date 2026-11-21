package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y60 implements ww {
    public final int f54063a = 0;
    public final LaunchActivity f54064b;
    public final TLRPC.User f54065c;
    public final String d;
    public final int f54066e;

    public y60(LaunchActivity launchActivity, String str, int i7, TLRPC.User user) {
        this.f54064b = launchActivity;
        this.d = str;
        this.f54066e = i7;
        this.f54065c = user;
    }

    @Override
    public final boolean G() {
        switch (this.f54063a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean P(cx cxVar) {
        switch (this.f54063a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = this.f54063a;
        int i12 = this.f54066e;
        String str = this.d;
        TLRPC.User user = this.f54065c;
        LaunchActivity launchActivity = this.f54064b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.C1;
                long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).f26873a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f28493id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.mp.u1(i12).s1(user);
                org.telegram.messenger.zy.C(i12).p0(org.telegram.messenger.mp.u1(i12).l1(j3), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j3)) {
                    k10.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (org.telegram.messenger.mp.u1(i12).E(k10, cxVar, null, null)) {
                    org.telegram.messenger.ks.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new bn(k10), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.C1;
                long j10 = ((org.telegram.messenger.sr) arrayList.get(0)).f26873a;
                Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j10)) {
                    k11.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j10)) {
                    k11.putLong("user_id", j10);
                } else {
                    k11.putLong("chat_id", -j10);
                }
                k11.putString("attach_bot", org.telegram.messenger.o10.o(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.mp.u1(i12).E(k11, cxVar, null, null)) {
                    org.telegram.messenger.ks.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new bn(k11), true, false);
                }
                return true;
        }
    }

    public y60(LaunchActivity launchActivity, TLRPC.User user, String str, int i7) {
        this.f54064b = launchActivity;
        this.f54065c = user;
        this.d = str;
        this.f54066e = i7;
    }
}
