package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y60 implements ww {
    public final int f54041a = 0;
    public final LaunchActivity f54042b;
    public final TLRPC.User f54043c;
    public final String d;
    public final int f54044e;

    public y60(LaunchActivity launchActivity, String str, int i7, TLRPC.User user) {
        this.f54042b = launchActivity;
        this.d = str;
        this.f54044e = i7;
        this.f54043c = user;
    }

    @Override
    public final boolean G() {
        switch (this.f54041a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean P(cx cxVar) {
        switch (this.f54041a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = this.f54041a;
        int i12 = this.f54044e;
        String str = this.d;
        TLRPC.User user = this.f54043c;
        LaunchActivity launchActivity = this.f54042b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.C1;
                long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.f28460id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.np.u1(i12).s1(user);
                org.telegram.messenger.az.C(i12).p0(org.telegram.messenger.np.u1(i12).l1(j3), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j3)) {
                    k10.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (org.telegram.messenger.np.u1(i12).E(k10, cxVar, null, null)) {
                    org.telegram.messenger.ls.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new bn(k10), true, false);
                }
                return true;
            default:
                String str3 = LaunchActivity.C1;
                long j10 = ((org.telegram.messenger.tr) arrayList.get(0)).f27037a;
                Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.n5.C(j10)) {
                    k11.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.n5.E(j10)) {
                    k11.putLong("user_id", j10);
                } else {
                    k11.putLong("chat_id", -j10);
                }
                k11.putString("attach_bot", org.telegram.messenger.p10.o(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.np.u1(i12).E(k11, cxVar, null, null)) {
                    org.telegram.messenger.ls.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new bn(k11), true, false);
                }
                return true;
        }
    }

    public y60(LaunchActivity launchActivity, TLRPC.User user, String str, int i7) {
        this.f54042b = launchActivity;
        this.f54043c = user;
        this.d = str;
        this.f54044e = i7;
    }
}
