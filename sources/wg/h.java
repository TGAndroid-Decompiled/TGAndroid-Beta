package wg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.st;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
import tg.z1;
public abstract class h {
    public static void a(t1 t1Var, boolean z10) {
        xh.l lVar = t1Var.f29628f;
        if (lVar != null) {
            lVar.setTextSize(1, 20);
        }
        st stVar = t1Var.f29641n;
        if (stVar != null) {
            stVar.setTextSize(1, 14);
        }
        st stVar2 = t1Var.f29641n;
        if (stVar2 != null) {
            stVar2.setLineSpacing(org.telegram.messenger.g0.L(2.5f), 1.0f);
        }
        if (!z10) {
            ((ViewGroup.MarginLayoutParams) t1Var.f29651u0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-14.0f);
        }
    }

    public static String b(gj gjVar) {
        if (gjVar == null) {
            return "";
        }
        String Y0 = gjVar.Y0();
        if (Y0 == null) {
            TLRPC.Chat M0 = np.s1(m10.f24940t0).M0(Long.valueOf(-gj.B1(gjVar.f23819k.peer_id)));
            if (M0 == null) {
                return "";
            }
            return M0.title;
        }
        return Y0;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, e6 e6Var, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = hd.E0().o0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(hd.M0(2131749677, "GiftPremiumActivateErrorText"), j6.xj, 0, runnable, null);
                cc ccVar = new cc(frameLayout, e6Var);
                String M0 = hd.M0(2131749676, null);
                ccVar.I(2131623982, M0, org.telegram.messenger.g0.K2(S2, org.telegram.messenger.g0.X2("**" + format + "**"), "%1$s")).j();
                try {
                    frameLayout.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            j(frameLayout.getContext(), tL_error);
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, e6 e6Var) {
        boolean z11;
        boolean z12;
        int i7;
        String str2;
        String str3;
        String str4;
        int i10;
        String str5;
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = hd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = hd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = hd.E0().p0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = hd.E0().u0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = hd.M0(2131753494, "BoostingGiveAwayAbout");
        t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i7 = 0;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i7 = 0;
            str2 = format;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, str3, str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i7] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[i7] = format2;
                objArr2[1] = format3;
                String G2 = hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[i7] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[i7] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z11) {
            int i12 = i7;
            String G3 = hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i12]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[i12] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[i7] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                k5.p("BoostingGiveawayParticipant", null, 2131753401, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.M0(2131753402, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat M02 = np.s1(m10.f24940t0).M0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (M02 != null) {
                    str4 = M02.title;
                } else {
                    str4 = "";
                }
                if (z10) {
                    i10 = 2131753404;
                } else {
                    i10 = 2131753403;
                }
                k5.p(null, null, i10, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                k5.p("BoostingGiveawayNotEligible", null, 2131753405, new Object[]{hd.E0().u0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                k5.p("BoostingGiveawayTakePart", null, 2131753366, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(hd.M0(2131747831, "OK"), new ug.x(16));
        a(alertDialog$Builder.p(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, e6 e6Var) {
        boolean z11;
        boolean z12;
        String str2;
        int i7;
        int i10;
        String str3;
        String M0;
        String str4;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = hd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = hd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = hd.E0().p0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = hd.E0().u0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M02 = hd.M0(2131753478, "BoostingGiveawayEnd");
        t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str4 = "BoostingStarsGiveawayHowItWorksTextEnd";
            } else {
                str4 = "BoostingStarsGiveawayHowItWorksTextEndGroup";
            }
            str2 = format;
            i10 = 2;
            i7 = 1;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i7 = 1;
            i10 = 2;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, str3, str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i10];
            objArr[0] = str;
            objArr[i7] = str6;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i7] = format3;
                String G2 = hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i7] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i7] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z11) {
            String G3 = hd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i7] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i7] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i11, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i12 = tL_payments_giveawayInfoResults.activated_count;
        if (i12 > 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.G(i12, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String M03 = hd.M0(2131753483, "BoostingGiveawayCanceledByPayment");
            TextView g10 = k5.g(context, i7, 14.0f);
            g10.setTypeface(org.telegram.messenger.g0.o());
            g10.setGravity(17);
            g10.setText(M03);
            int i13 = j6.f29070p7;
            q6.U(g10, i13, e6Var);
            ShapeDrawable e02 = j6.e0(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), j6.r1(0.1f, j6.w0(i13, e6Var)));
            m6 K = q6.K(0.1f, i13);
            g10.setBackground(e02);
            q6.j(g10, e02, K, null, e6Var);
            g10.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            t1Var.f29620c = g10;
            t1Var.U = spannableStringBuilder;
            alertDialog$Builder.k(hd.M0(2131752041, "Close"), new ug.x(16));
            a(alertDialog$Builder.p(), true);
            return;
        }
        t1Var.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            M0 = hd.M0(2131753357, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(hd.M0(2131753359, "BoostingGiveawayViewPrize"), new z1(tL_payments_giveawayInfoResults, 9));
            }
            alertDialog$Builder.h(hd.M0(2131752041, "Close"), new ug.x(16));
        } else {
            M0 = hd.M0(2131753358, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.k(hd.M0(2131752041, "Close"), new ug.x(16));
        }
        st stVar = new st(context);
        ns.i(stVar);
        q6.U(stVar, j6.f28957j5, e6Var);
        stVar.setTextSize(1, 14.0f);
        stVar.setGravity(17);
        stVar.setText(M0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i14 = j6.f29081pi;
        ShapeDrawable e03 = j6.e0(L, L2, j6.w0(i14, e6Var));
        m6 M = q6.M(i14);
        stVar.setBackground(e03);
        q6.j(stVar, e03, M, null, e6Var);
        stVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f));
        t1Var.d = stVar;
        a(alertDialog$Builder.p(), false);
    }

    public static void f(e2 e2Var, TLRPC.Chat chat, boolean z10) {
        if (e2Var == null) {
            return;
        }
        org.telegram.messenger.g0.i3(new wn(cc.a0(e2Var), z10, chat, e2Var.getResourceProvider(), 17), 300L);
    }

    public static void g(int i7) {
        String str;
        e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i7 < 60) {
            str = hd.G(i7, "Seconds", new Object[0]);
        } else if (i7 < 3600) {
            str = hd.G(i7 / 60, "Minutes", new Object[0]);
        } else {
            int i10 = (i7 / 60) / 60;
            if (i10 > 2) {
                str = hd.G(i10, "Hours", new Object[0]);
            } else {
                str = hd.G(i10, "Hours", new Object[0]) + " " + hd.G(i7 % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String M0 = hd.M0(2131752565, null);
        t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(hd.a0("CantBoostTooOftenDescription", null, 2131752564, str));
        alertDialog$Builder.k(hd.M0(2131747831, null), new ug.x(20));
        alertDialog$Builder.p();
    }

    public static void h(long j3) {
        SpannableStringBuilder X2;
        if (j3 == m10.i(m10.f24940t0).f24959n) {
            X2 = org.telegram.messenger.g0.X2(hd.M0(2131753498, null));
        } else if (m5.z(j3)) {
            X2 = org.telegram.messenger.g0.X2(hd.a0("BoostingGiftLinkForwardedTo", null, 2131753499, np.s1(m10.f24940t0).M0(Long.valueOf(-j3)).title));
        } else {
            X2 = org.telegram.messenger.g0.X2(hd.a0("BoostingGiftLinkForwardedTo", null, 2131753499, q10.j(np.s1(m10.f24940t0).a2(Long.valueOf(j3)), true)));
        }
        org.telegram.messenger.g0.i3(new vg.o(X2, 2), 450L);
    }

    public static void i(long j3, u2 u2Var) {
        TLRPC.Chat M0 = np.s1(m10.f24940t0).M0(Long.valueOf(-j3));
        e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String M02 = hd.M0(2131753338, null);
        t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M02;
        t1Var.U = org.telegram.messenger.g0.X2(hd.G((int) np.s1(m10.f24940t0).f25389s0, "BoostingGetMoreBoostByGiftingCount", M0.title));
        alertDialog$Builder.h(hd.M0(2131749680, "GiftPremium"), new j2(u2Var));
        alertDialog$Builder.k(hd.M0(2131752041, "Close"), new ug.x(16));
        alertDialog$Builder.p();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
