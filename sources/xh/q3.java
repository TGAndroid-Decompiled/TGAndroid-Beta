package xh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.LaunchActivity;
public abstract class q3 {
    public static void a(int i10, long j10, org.telegram.ui.web.o oVar) {
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
        TLRPC.UserFull a2 = vp.r1(i10).a2(j10);
        if (a2 == null) {
            vp.r1(i10).U2(Z1, 0, true, new jg.o2(oVar, i10, Z1, 5));
        } else {
            b(i10, Z1, a2, oVar);
        }
    }

    public static void b(final int i10, final TLRPC.User user, final TLRPC.UserFull userFull, final org.telegram.ui.web.o oVar) {
        if (userFull.bot_can_manage_emoji_status) {
            oVar.a(Boolean.FALSE, "allowed");
            return;
        }
        Context W = org.telegram.messenger.i0.W(LaunchActivity.I1);
        if (W == null) {
            W = org.telegram.messenger.w0.f19025b;
        }
        final Context context = W;
        TLRPC.User f7 = d20.i(i10).f();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, null);
        p3 p3Var = new p3(f7);
        int i11 = t6.L5;
        int x02 = t6.x0(null, i11, false);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.f21472b0 = p3Var;
        x1Var.f21475c0 = x02;
        x1Var.f21477d0 = -1;
        alertDialog$Builder.n(i11, null);
        alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753088, h20.p(user), h20.p(user)));
        alertDialog$Builder.k(cd.L0(2131753090, null), new org.telegram.ui.ActionBar.u1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                int i13 = i10;
                boolean q6 = d20.i(i13).q();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                org.telegram.ui.web.o oVar2 = oVar;
                if (!q6) {
                    new kg.i1(new org.telegram.ui.ActionBar.k2(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        oVar2.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                q3.e(context, i13, user2.f19942id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = vp.r1(i13).p1(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i13).sendRequest(toggleuseremojistatuspermission, new ag.p0(zArr4, oVar2, userFull, 26));
            }
        });
        alertDialog$Builder.h(cd.L0(2131753089, null), null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
        x1Var2.show();
        x1Var2.setOnDismissListener(new pq(zArr2, zArr, context, i10, user, oVar));
    }

    public static void c() {
        Context context = org.telegram.messenger.w0.f19025b;
        if (context != null) {
            for (int i10 = 0; i10 < 4; i10++) {
                context.getSharedPreferences("botemojistatus_" + i10, 0).edit().clear().apply();
            }
        }
    }

    public static boolean d(Activity activity, int i10, long j10) {
        if (activity == null) {
            return false;
        }
        return m5.w("requested_", j10, activity.getSharedPreferences("botemojistatus_" + i10, 0), false);
    }

    public static void e(Context context, int i10, long j10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i10, 0).edit();
        edit.putBoolean("requested_" + j10, true).apply();
    }

    public static void f(final int i10, final TLRPC.User user, long j10, final int i11, final org.telegram.ui.web.o oVar) {
        TLRPC.Document e = f5.e(i10, j10);
        if (e != null) {
            g(i10, user, e, i11, new j3(oVar, e, 1));
        } else {
            f5.g(i10).b(j10, new c5() {
                @Override
                public final void a(TLRPC.Document document) {
                    org.telegram.messenger.i0.g3(new bi.u0(i10, user, document, i11, oVar));
                }
            });
        }
    }

    public static void g(int i10, TLRPC.User user, TLRPC.Document document, int i11, q20 q20Var) {
        SpannableStringBuilder W2;
        if (document instanceof TLRPC.TL_documentEmpty) {
            q20Var.a("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context W = org.telegram.messenger.i0.W(LaunchActivity.I1);
        if (W == null) {
            W = org.telegram.messenger.w0.f19025b;
        }
        ConnectionsManager.getInstance(i10).getCurrentTime();
        TLRPC.User f7 = d20.i(i10).f();
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        if (i11 > 0) {
            int i12 = i11 / 86400;
            int i13 = i11 - (86400 * i12);
            int i14 = i13 / 3600;
            int round = Math.round((i13 - (i14 * 3600)) / 60.0f);
            StringBuilder sb2 = new StringBuilder();
            if (i12 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(cd.G(i12, "BotEmojiStatusSetRequestForDay", new Object[0]));
            }
            if (i14 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(cd.G(i14, "BotEmojiStatusSetRequestForHour", new Object[0]));
            }
            if (round > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(cd.G(round, "BotEmojiStatusSetRequestForMinute", new Object[0]));
            }
            W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753085, h20.p(user), sb2));
        } else {
            W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753086, h20.p(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, W, null);
        p3 p3Var = new p3(f7, document);
        int i15 = t6.L5;
        int x02 = t6.x0(null, i15, false);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.f21472b0 = p3Var;
        x1Var.f21475c0 = x02;
        x1Var.f21477d0 = -1;
        alertDialog$Builder.n(i15, null);
        alertDialog$Builder.f20134a.T = W2;
        alertDialog$Builder.k(cd.L0(2131753091, null), new mg.e(i10, zArr2, document, i11, zArr, q20Var));
        alertDialog$Builder.h(cd.L0(2131752589, null), null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
        x1Var2.show();
        x1Var2.setOnDismissListener(new org.telegram.ui.Components.z1(zArr2, zArr, q20Var, 6));
    }
}
