package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class v70 implements tx {
    public final int f42428a = 0;
    public final LaunchActivity f42429b;
    public final TLRPC.User f42430c;
    public final String d;
    public final int e;

    public v70(LaunchActivity launchActivity, String str, int i10, TLRPC.User user) {
        this.f42429b = launchActivity;
        this.d = str;
        this.e = i10;
        this.f42430c = user;
    }

    @Override
    public final boolean H() {
        switch (this.f42428a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean O(zx zxVar) {
        switch (this.f42428a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12 = this.f42428a;
        int i13 = this.e;
        String str = this.d;
        TLRPC.User user = this.f42430c;
        LaunchActivity launchActivity = this.f42429b;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f19856id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.wp.r1(i13).p1(user);
                org.telegram.messenger.rz.C(i13).p0(org.telegram.messenger.wp.r1(i13).i1(j10), tL_inputMediaGame, 0L, 0L);
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j10)) {
                    g10.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (org.telegram.messenger.wp.r1(i13).E(g10, zxVar, null, null)) {
                    org.telegram.messenger.at.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g10), true, false);
                }
                return true;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                long j11 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
                Bundle g11 = a1.g.g("scrollToTopOnResume", true);
                if (org.telegram.messenger.o5.C(j11)) {
                    g11.putInt("enc_id", (int) (j11 & 4294967295L));
                } else if (org.telegram.messenger.o5.E(j11)) {
                    g11.putLong("user_id", j11);
                } else {
                    g11.putLong("chat_id", -j11);
                }
                g11.putString("attach_bot", org.telegram.messenger.i20.n(user));
                if (str != null) {
                    g11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.wp.r1(i13).E(g11, zxVar, null, null)) {
                    org.telegram.messenger.at.f(i13).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).U(new un(g11), true, false);
                }
                return true;
        }
    }

    public v70(LaunchActivity launchActivity, TLRPC.User user, String str, int i10) {
        this.f42429b = launchActivity;
        this.f42430c = user;
        this.d = str;
        this.e = i10;
    }
}
