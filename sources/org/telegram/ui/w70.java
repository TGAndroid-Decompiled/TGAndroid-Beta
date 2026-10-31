package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class w70 implements ux {
    public final int f42893a = 0;
    public final LaunchActivity f42894b;
    public final TLRPC.User f42895c;
    public final String d;
    public final int e;

    public w70(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f42894b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f42895c = user;
    }

    @Override
    public final boolean G() {
        switch (this.f42893a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean N(ay ayVar) {
        switch (this.f42893a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12 = this.f42893a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f42895c;
        LaunchActivity launchActivity = this.f42894b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f19855id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.vp.r1(i13).p1(user);
                org.telegram.messenger.qz.C(i13).p0(org.telegram.messenger.vp.r1(i13).i1(j10), tL_inputMediaGame, 0L, 0L);
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j10)) {
                    g10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (org.telegram.messenger.vp.r1(i13).E(g10, ayVar, null, null)) {
                    org.telegram.messenger.zs.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g10), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                long j11 = ((org.telegram.messenger.gs) arrayList.get(0)).f15760a;
                Bundle g11 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j11)) {
                    g11.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j11)) {
                    g11.putLong("user_id", j11);
                } else {
                    g11.putLong("chat_id", -j11);
                }
                g11.putString("attach_bot", org.telegram.messenger.h20.n(user));
                if (str != null) {
                    g11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.vp.r1(i13).E(g11, ayVar, null, null)) {
                    org.telegram.messenger.zs.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g11), true, false);
                }
                return true;
        }
    }

    public w70(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f42894b = launchActivity;
        this.f42895c = user;
        this.d = str;
        this.e = i10;
    }
}
