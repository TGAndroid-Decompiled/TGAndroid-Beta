package xg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;
public abstract class j {
    public static void a(s1 s1Var, boolean z10) {
        yh.l lVar = s1Var.f28537f;
        if (lVar != null) {
            lVar.setTextSize(1, 20);
        }
        kt ktVar = s1Var.f28551n;
        if (ktVar != null) {
            ktVar.setTextSize(1, 14);
        }
        kt ktVar2 = s1Var.f28551n;
        if (ktVar2 != null) {
            ktVar2.setLineSpacing(org.telegram.messenger.g0.L(2.5f), 1.0f);
        }
        if (!z10) {
            ((ViewGroup.MarginLayoutParams) s1Var.f28564w0.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(-14.0f);
        }
    }

    public static String b(zi ziVar) {
        if (ziVar == null) {
            return "";
        }
        String Y0 = ziVar.Y0();
        if (Y0 == null) {
            TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(-zi.C1(ziVar.f26868k.peer_id)));
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
                String format = bd.E0().o0().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
                SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(bd.M0(2131749685, "GiftPremiumActivateErrorText"), k6.uj, 0, runnable, null);
                fc fcVar = new fc(frameLayout, e6Var);
                String M0 = bd.M0(2131749684, null);
                fcVar.I(2131623981, M0, org.telegram.messenger.g0.K2(S2, org.telegram.messenger.g0.X2("**" + format + "**"), "%1$s")).j();
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
        int i3;
        String str2;
        String str3;
        String str4;
        int i10;
        String str5;
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = bd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = bd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = bd.E0().p0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
        String format3 = bd.E0().u0().format(new Date(tL_payments_giveawayInfo.start_date * 1000));
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
        String M0 = bd.M0(2131753494, "BoostingGiveAwayAbout");
        s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str5 = "BoostingStarsGiveawayHowItWorksText";
            } else {
                str5 = "BoostingStarsGiveawayHowItWorksTextGroup";
            }
            str2 = format;
            i3 = 0;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.K(str5, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            i3 = 0;
            str2 = format;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksText";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, str3, str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str6 = tL_messageMediaGiveaway.prize_description;
        if (str6 != null && !str6.isEmpty()) {
            String str7 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[i3] = str;
            objArr[1] = str7;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[i3] = format2;
                objArr2[1] = format3;
                String G2 = bd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[i3] = str2;
                objArr3[1] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveral1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[i3] = str2;
                objArr4[1] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextDate", objArr4)));
            }
        } else if (z11) {
            int i12 = i3;
            String G3 = bd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[i12]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[i12] = str2;
            objArr5[1] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextSeveral1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[i3] = str2;
            objArr6[1] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubText", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (tL_payments_giveawayInfo.participating) {
            if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayParticipantMultiPlural", str)));
            } else {
                k5.q("BoostingGiveawayParticipant", null, 2131753401, new Object[]{str}, spannableStringBuilder);
            }
        } else {
            String str8 = tL_payments_giveawayInfo.disallowed_country;
            if (str8 != null && !str8.isEmpty()) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.M0(2131753402, "BoostingGiveawayNotEligibleCountry")));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat M02 = hp.s1(h10.f22829t0).M0(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
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
                k5.q(null, null, i10, new Object[]{str4}, spannableStringBuilder);
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                k5.q("BoostingGiveawayNotEligible", null, 2131753405, new Object[]{bd.E0().u0().format(new Date(tL_payments_giveawayInfo.joined_too_early_date * 1000))}, spannableStringBuilder);
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayTakePartMultiPlural", str, str2)));
            } else {
                k5.q("BoostingGiveawayTakePart", null, 2131753366, new Object[]{str, str2}, spannableStringBuilder);
            }
        }
        s1Var.U = spannableStringBuilder;
        alertDialog$Builder.k(bd.M0(2131747839, "OK"), new u9.j(20));
        a(alertDialog$Builder.p(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, e6 e6Var) {
        boolean z11;
        boolean z12;
        String str2;
        int i3;
        int i10;
        String str3;
        String M0;
        String str4;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i11 = tL_messageMediaGiveaway.quantity;
        String G = bd.G(tL_messageMediaGiveaway.months, "BoldMonths", new Object[0]);
        String format = bd.E0().t0().format(new Date(tL_messageMediaGiveaway.until_date * 1000));
        String format2 = bd.E0().p0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
        String format3 = bd.E0().u0().format(new Date(tL_payments_giveawayInfoResults.start_date * 1000));
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
        String M02 = bd.M0(2131753478, "BoostingGiveawayEnd");
        s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M02;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            if (z10) {
                str4 = "BoostingStarsGiveawayHowItWorksTextEnd";
            } else {
                str4 = "BoostingStarsGiveawayHowItWorksTextEndGroup";
            }
            str2 = format;
            i10 = 2;
            i3 = 1;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.K(str4, (int) tL_messageMediaGiveaway.stars, ',', str)));
        } else {
            str2 = format;
            i3 = 1;
            i10 = 2;
            if (z10) {
                str3 = "BoostingGiveawayHowItWorksTextEnd";
            } else {
                str3 = "BoostingGiveawayHowItWorksTextEndGroup";
            }
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, str3, str, Integer.valueOf(i11), G)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[i10];
            objArr[0] = str;
            objArr[i3] = str6;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksIncludeText", objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = format2;
                objArr2[i3] = format3;
                String G2 = bd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextDateSeveral2", objArr2);
                Integer valueOf = Integer.valueOf(i11);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[i3] = valueOf;
                objArr3[2] = str;
                objArr3[3] = G2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", objArr3)));
            } else {
                Integer valueOf2 = Integer.valueOf(i11);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[i3] = valueOf2;
                objArr4[2] = str;
                objArr4[3] = format2;
                objArr4[4] = format3;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextDateEnd", objArr4)));
            }
        } else if (z11) {
            String G3 = bd.G(tL_messageMediaGiveaway.channels.size() - 1, "BoostingGiveawayHowItWorksSubTextSeveral2", new Object[0]);
            Integer valueOf3 = Integer.valueOf(i11);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[i3] = valueOf3;
            objArr5[2] = str;
            objArr5[3] = G3;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextSeveralEnd1", objArr5)));
        } else {
            Integer valueOf4 = Integer.valueOf(i11);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[i3] = valueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i11, "BoostingGiveawayHowItWorksSubTextEnd", objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i12 = tL_payments_giveawayInfoResults.activated_count;
        if (i12 > 0) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.G(i12, "BoostingGiveawayUsedLinksPlural", new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String M03 = bd.M0(2131753483, "BoostingGiveawayCanceledByPayment");
            TextView g7 = k5.g(context, i3, 14.0f);
            g7.setTypeface(org.telegram.messenger.g0.o());
            g7.setGravity(17);
            g7.setText(M03);
            int i13 = k6.f28102p7;
            r6.V(g7, i13, e6Var);
            ShapeDrawable e02 = k6.e0(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), k6.r1(0.1f, k6.w0(i13, e6Var)));
            n6 L = r6.L(0.1f, i13);
            g7.setBackground(e02);
            r6.k(g7, e02, L, null, e6Var);
            g7.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            s1Var.f28529c = g7;
            s1Var.U = spannableStringBuilder;
            alertDialog$Builder.k(bd.M0(2131752041, "Close"), new u9.j(20));
            a(alertDialog$Builder.p(), true);
            return;
        }
        s1Var.U = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            M0 = bd.M0(2131753357, null);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(bd.M0(2131753359, "BoostingGiveawayViewPrize"), new c(tL_payments_giveawayInfoResults, 0));
            }
            alertDialog$Builder.h(bd.M0(2131752041, "Close"), new u9.j(20));
        } else {
            M0 = bd.M0(2131753358, "BoostingGiveawayYouNotWon");
            alertDialog$Builder.k(bd.M0(2131752041, "Close"), new u9.j(20));
        }
        kt ktVar = new kt(context);
        hs.i(ktVar);
        r6.V(ktVar, k6.f27988j5, e6Var);
        ktVar.setTextSize(1, 14.0f);
        ktVar.setGravity(17);
        ktVar.setText(M0);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int L3 = org.telegram.messenger.g0.L(8.0f);
        int i14 = k6.f28055mi;
        ShapeDrawable e03 = k6.e0(L2, L3, k6.w0(i14, e6Var));
        n6 N = r6.N(i14);
        ktVar.setBackground(e03);
        r6.k(ktVar, e03, N, null, e6Var);
        ktVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f));
        s1Var.d = ktVar;
        a(alertDialog$Builder.p(), false);
    }

    public static void f(d2 d2Var, TLRPC.Chat chat, boolean z10) {
        if (d2Var == null) {
            return;
        }
        org.telegram.messenger.g0.i3(new rn(fc.a0(d2Var), z10, chat, d2Var.getResourceProvider()), 300L);
    }

    public static void g(int i3) {
        String str;
        d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        if (i3 < 60) {
            str = bd.G(i3, "Seconds", new Object[0]);
        } else if (i3 < 3600) {
            str = bd.G(i3 / 60, "Minutes", new Object[0]);
        } else {
            int i10 = (i3 / 60) / 60;
            if (i10 > 2) {
                str = bd.G(i10, "Hours", new Object[0]);
            } else {
                str = bd.G(i10, "Hours", new Object[0]) + " " + bd.G(i3 % 60, "Minutes", new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String M0 = bd.M0(2131752565, null);
        s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(bd.a0("CantBoostTooOftenDescription", null, 2131752564, str));
        alertDialog$Builder.k(bd.M0(2131747839, null), new u9.j(24));
        alertDialog$Builder.p();
    }

    public static void h(long j10) {
        SpannableStringBuilder X2;
        if (j10 == h10.i(h10.f22829t0).f22848n) {
            X2 = org.telegram.messenger.g0.X2(bd.M0(2131753498, null));
        } else if (m5.z(j10)) {
            X2 = org.telegram.messenger.g0.X2(bd.a0("BoostingGiftLinkForwardedTo", null, 2131753499, hp.s1(h10.f22829t0).M0(Long.valueOf(-j10)).title));
        } else {
            X2 = org.telegram.messenger.g0.X2(bd.a0("BoostingGiftLinkForwardedTo", null, 2131753499, l10.j(hp.s1(h10.f22829t0).a2(Long.valueOf(j10)), true)));
        }
        org.telegram.messenger.g0.i3(new xf.c(X2, 1), 450L);
    }

    public static void i(long j10, t2 t2Var) {
        TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(-j10));
        d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), Q.getResourceProvider());
        String M02 = bd.M0(2131753338, null);
        s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M02;
        s1Var.U = org.telegram.messenger.g0.X2(bd.G((int) hp.s1(h10.f22829t0).f23114s0, "BoostingGetMoreBoostByGiftingCount", M0.title));
        alertDialog$Builder.h(bd.M0(2131749688, "GiftPremium"), new i2(t2Var));
        alertDialog$Builder.k(bd.M0(2131752041, "Close"), new u9.j(20));
        alertDialog$Builder.p();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error != null && (str = tL_error.text) != null && !TextUtils.isEmpty(str)) {
            Toast.makeText(context, tL_error.text, 1).show();
        }
    }
}
