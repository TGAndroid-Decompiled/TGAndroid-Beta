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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public abstract class h {
    public static void a(u1 u1Var, boolean z9) {
        xh.l lVar = u1Var.f28556f;
        if (lVar != null) {
            lVar.setTextSize(1, 20);
        }
        mt mtVar = u1Var.f28568n;
        if (mtVar != null) {
            mtVar.setTextSize(1, 14);
        }
        mt mtVar2 = u1Var.f28568n;
        if (mtVar2 != null) {
            mtVar2.setLineSpacing(org.telegram.messenger.g0.L(2.5f), 1.0f);
        }
        if (!z9) {
            ((ViewGroup.MarginLayoutParams) u1Var.f28577t0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-14.0f);
        }
    }

    public static String b(ij ijVar) {
        if (ijVar == null) {
            return "";
        }
        String Y0 = ijVar.Y0();
        if (Y0 == null) {
            TLRPC.Chat M0 = qp.s1(p10.f24470s0).M0(Long.valueOf(-ij.B1(ijVar.f23262k.peer_id)));
            if (M0 == null) {
                return "";
            }
            return M0.title;
        }
        return Y0;
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, g6 g6Var, Runnable runnable) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null) {
            if (str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
                String format = id.E0().o0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(id.M0(2131749677, "GiftPremiumActivateErrorText"), l6.uj, 0, runnable, null);
                hc hcVar = new hc(frameLayout, g6Var);
                String M0 = id.M0(2131749676, null);
                hcVar.I(2131623981, M0, org.telegram.messenger.g0.K2(S2, org.telegram.messenger.g0.X2("**" + format + "**"), "%1$s")).j();
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

    public static void d(boolean z9, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, g6 g6Var) {
        boolean z10;
        boolean z11;
        int i7;
        String str2;
        String str3;
        String str4;
        int i10;
        String str5;
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = id.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = id.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = id.E0().p0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = id.E0().u0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        String M0 = id.M0(2131753494, "BoostingGiveAwayAbout");
        u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z11) {
            if (z9) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i7 = 0;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i7 = 0;
            str2 = format;
            if (z9) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, str3, str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i7] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z10) {
                Object[] objArr2 = new Object[2];
                objArr2[i7] = format2;
                objArr2[1] = format3;
                String G2 = id.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[i7] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[i7] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z10) {
            int i12 = i7;
            String G3 = id.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i12]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[i12] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[i7] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z10) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                k5.q("BoostingGiveawayParticipant", null, 2131753401, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.M0(2131753402, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat M02 = qp.s1(p10.f24470s0).M0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                if (M02 != null) {
                    str4 = M02.title;
                } else {
                    str4 = "";
                }
                if (z9) {
                    i10 = 2131753404;
                } else {
                    i10 = 2131753403;
                }
                k5.q(null, null, i10, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                k5.q("BoostingGiveawayNotEligible", null, 2131753405, new Object[]{id.E0().u0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z10) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                k5.q("BoostingGiveawayTakePart", null, 2131753366, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        u1Var.T = spannableStringBuilder;
        alertDialog$Builder.k(id.M0(2131747831, "OK"), new v0.j(15));
        a(alertDialog$Builder.p(), false);
    }

    public static void e(boolean z9, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, g6 g6Var) {
        boolean z10;
        boolean z11;
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
        String G = id.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = id.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = id.E0().p0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = id.E0().u0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        if (tL_messageMediaGiveaway.channels.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((tL_messageMediaGiveaway.flags & 32) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        String M02 = id.M0(2131753478, "BoostingGiveawayEnd");
        u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z11) {
            if (z9) {
                str4 = "BoostingStarsGiveawayHowItWorksTextEnd";
            } else {
                str4 = "BoostingStarsGiveawayHowItWorksTextEndGroup";
            }
            str2 = format;
            i10 = 2;
            i7 = 1;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i7 = 1;
            i10 = 2;
            if (z9) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, str3, str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i10];
            objArr[0] = str;
            objArr[i7] = str6;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z10) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i7] = format3;
                String G2 = id.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i7] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i7] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z10) {
            String G3 = id.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i7] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i7] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i11, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i12 = tL_payments_giveawayInfoResults.activated_count;
        if (i12 > 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(id.G(i12, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String M03 = id.M0(2131753483, "BoostingGiveawayCanceledByPayment");
            TextView g10 = k5.g(context, i7, 14.0f);
            g10.setTypeface(org.telegram.messenger.g0.o());
            g10.setGravity(17);
            g10.setText(M03);
            int i13 = l6.f28086p7;
            s6.U(g10, i13, g6Var);
            ShapeDrawable e02 = l6.e0(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), l6.r1(0.1f, l6.w0(i13, g6Var)));
            o6 K = s6.K(0.1f, i13);
            g10.setBackground(e02);
            s6.j(g10, e02, K, null, g6Var);
            g10.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            u1Var.f28548c = g10;
            u1Var.T = spannableStringBuilder;
            alertDialog$Builder.k(id.M0(2131752041, "Close"), new v0.j(15));
            a(alertDialog$Builder.p(), true);
            return;
        }
        u1Var.T = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            M0 = id.M0(2131753357, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(id.M0(2131753359, "BoostingGiveawayViewPrize"), new u5.e(tL_payments_giveawayInfoResults, 5));
            }
            alertDialog$Builder.h(id.M0(2131752041, "Close"), new v0.j(15));
        } else {
            M0 = id.M0(2131753358, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.k(id.M0(2131752041, "Close"), new v0.j(15));
        }
        mt mtVar = new mt(context);
        qs.i(mtVar);
        s6.U(mtVar, l6.f27973j5, g6Var);
        mtVar.setTextSize(1, 14.0f);
        mtVar.setGravity(17);
        mtVar.setText(M0);
        int L = org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int i14 = l6.f28040mi;
        ShapeDrawable e03 = l6.e0(L, L2, l6.w0(i14, g6Var));
        o6 M = s6.M(i14);
        mtVar.setBackground(e03);
        s6.j(mtVar, e03, M, null, g6Var);
        mtVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f));
        u1Var.d = mtVar;
        a(alertDialog$Builder.p(), false);
    }

    public static void f(f2 f2Var, TLRPC.Chat chat, boolean z9) {
        if (f2Var == null) {
            return;
        }
        org.telegram.messenger.g0.i3(new xn(hc.a0(f2Var), z9, chat, f2Var.getResourceProvider(), 17), 300L);
    }

    public static void g(int i7) {
        String str;
        f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i7 < 60) {
            str = id.G(i7, "Seconds", new Object[0]);
        } else if (i7 < 3600) {
            str = id.G(i7 / 60, "Minutes", new Object[0]);
        } else {
            int i10 = (i7 / 60) / 60;
            if (i10 > 2) {
                str = id.G(i10, "Hours", new Object[0]);
            } else {
                str = id.G(i10, "Hours", new Object[0]) + " " + id.G(i7 % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String M0 = id.M0(2131752565, null);
        u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(id.a0("CantBoostTooOftenDescription", null, 2131752564, str));
        alertDialog$Builder.k(id.M0(2131747831, null), new v0.j(19));
        alertDialog$Builder.p();
    }

    public static void h(long j3) {
        SpannableStringBuilder X2;
        if (j3 == p10.i(p10.f24470s0).f24489n) {
            X2 = org.telegram.messenger.g0.X2(id.M0(2131753498, null));
        } else if (m5.z(j3)) {
            X2 = org.telegram.messenger.g0.X2(id.a0("BoostingGiftLinkForwardedTo", null, 2131753499, qp.s1(p10.f24470s0).M0(Long.valueOf(-j3)).title));
        } else {
            X2 = org.telegram.messenger.g0.X2(id.a0("BoostingGiftLinkForwardedTo", null, 2131753499, t10.j(qp.s1(p10.f24470s0).a2(Long.valueOf(j3)), true)));
        }
        org.telegram.messenger.g0.i3(new sh.b(X2, 26), 450L);
    }

    public static void i(long j3, v2 v2Var) {
        TLRPC.Chat M0 = qp.s1(p10.f24470s0).M0(Long.valueOf(-j3));
        f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String M02 = id.M0(2131753338, null);
        u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M02;
        u1Var.T = org.telegram.messenger.g0.X2(id.G((int) qp.s1(p10.f24470s0).f24880r0, "BoostingGetMoreBoostByGiftingCount", M0.title));
        alertDialog$Builder.h(id.M0(2131749680, "GiftPremium"), new k2(v2Var));
        alertDialog$Builder.k(id.M0(2131752041, "Close"), new v0.j(15));
        alertDialog$Builder.p();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
