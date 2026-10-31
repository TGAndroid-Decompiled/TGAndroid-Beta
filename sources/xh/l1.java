package xh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import rh.h5;
import w7.b6;
public abstract class l1 {
    public static void a(Activity activity, final int i10, final long j10, final long j11, TL_bots.BotVerifierSettings botVerifierSettings, final h1 h1Var) {
        String str;
        TLRPC.User user;
        int i11;
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 >= 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j11));
            str = h20.k(Z1);
            user = Z1;
        } else {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j11));
            if (L0 == null) {
                str = "";
                user = L0;
            } else {
                str = L0.title;
                user = L0;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.i0.L(28.0f);
        int L2 = org.telegram.messenger.i0.L(28.0f);
        int i13 = t6.Qi;
        ShapeDrawable e02 = t6.e0(L, L2, t6.x0(null, i13, false));
        w6 N = a7.N(i13);
        frameLayout2.setBackground(e02);
        a7.k(frameLayout2, e02, N, null, null);
        g9 g9Var = new g9(activity);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
        r8 r8Var = new r8((p6) null);
        r8Var.l(user);
        g9Var.e(user, r8Var);
        frameLayout2.addView(g9Var, b6.e(28, 28, 51));
        g9 g9Var2 = new g9(activity);
        g9Var2.setEmojiColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.f21333z9, false), PorterDuff.Mode.SRC_IN));
        g9Var2.setAnimatedEmojiDrawable(f5.m(i10, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(g9Var2, b6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        u5 u5Var = new u5(activity);
        a7.Y(u5Var, t6.f21037j5, null);
        u5Var.setTextSize(13);
        u5Var.setEllipsizeByGradient(true);
        u5Var.l(str, false);
        u5Var.setWidthWrapContent(true);
        frameLayout2.addView(u5Var, b6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, b6.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String L02 = cd.L0(2131752997, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L02;
        if (i12 >= 0) {
            i11 = 2131752998;
        } else {
            i11 = 2131752999;
        }
        x1Var.T = cd.L0(i11, null);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        alertDialog$Builder.k(cd.L0(2131746336, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i14) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i15 = i10;
                setcustomverification.bot = vp.r1(i15).n1(j10);
                setcustomverification.peer = vp.r1(i15).i1(j11);
                ConnectionsManager.getInstance(i15).sendRequest(setcustomverification, new h5(9, zArr2, h1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
