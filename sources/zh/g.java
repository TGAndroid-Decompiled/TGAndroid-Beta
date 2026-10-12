package zh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import di.p9;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ba;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ee;
import org.telegram.ui.fe;
import org.telegram.ui.hb1;
import org.telegram.ui.li1;
import org.telegram.ui.lj1;
import org.telegram.ui.ne;
import org.telegram.ui.qe;
import org.telegram.ui.ta1;
import org.telegram.ui.w41;
import org.telegram.ui.zo;
public final class g extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public o7 F;
    public int G;
    public ee H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.s6 K;
    public org.telegram.ui.Components.s6 L;
    public fe M;
    public boolean N;
    public boolean O;
    public long P;
    public gi.o Q;
    public ci.p R;
    public di.d S;
    public final br[] T;
    public ee U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.s6 W;
    public org.telegram.ui.Components.s6 X;
    public di.d Y;
    public double Z;
    public final int f50541a;
    public sc f50542a0;
    public final long f50543b;
    public CharSequence f50544b0;
    public final boolean f50545c;
    public CharSequence f50546c0;
    public ro d;
    public CharSequence f50547d0;
    public h71 e;
    public boolean f50548e0;
    public TLRPC.TL_payments_starsRevenueStats f50549f;
    public ta1 f50550f0;
    public ta1 f50551g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean f50552h0;
    public boolean f50553i0;
    public final ArrayList f50554j0;
    public String f50555k0;
    public DecimalFormat f50556l0;
    public SpannableStringBuilder m0;
    public ta1 f50557n;
    public final b f50558n0;
    public final int f50559o0;
    public final ne f50560r;
    public final ne f50561s;
    public final ne v;
    public final ne f50562w;
    public final ne f50563x;
    public final ne f50564y;

    public g(int i10, long j10) {
        super(null);
        boolean z10;
        String string;
        this.f50560r = ne.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f50561s = ne.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ne.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f50562w = ne.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f50563x = ne.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f50564y = ne.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.N = false;
        this.O = true;
        this.T = new br[1];
        this.f50552h0 = false;
        this.f50553i0 = false;
        this.f50554j0 = new ArrayList();
        this.f50555k0 = "";
        this.f50558n0 = new b(this, 0);
        this.f50559o0 = -1;
        this.f50541a = i10;
        this.f50543b = j10;
        if (j10 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50545c = z10;
        if (i10 == 0) {
            p.g(this.currentAccount).r(j10);
            if (!z10) {
                p.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            p g10 = p.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.E = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new b(this, 4)), true);
    }

    public static void U(g gVar) {
        long j10;
        b bVar = gVar.f50558n0;
        sc.e();
        TLRPC.TL_payments_starsRevenueStats h = p.g(gVar.currentAccount).h(gVar.f50543b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < gVar.getMessagesController().starsRevenueWithdrawalMin) {
            gVar.O = true;
            gVar.P = j10;
        } else {
            gVar.O = false;
            gVar.P = gVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        gVar.N = true;
        gVar.Q.setText(Long.toString(gVar.P));
        gi.o oVar = gVar.Q;
        oVar.setSelection(oVar.getText().length());
        gVar.N = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public static void V(g gVar) {
        gVar.showDialog(qe.d0(gVar.getParentActivity(), gVar.resourceProvider, true));
    }

    public static void W(g gVar, l61 l61Var) {
        if (l61Var.G(i7.class)) {
            p7.i1(gVar.getParentActivity(), true, gVar.f50543b, gVar.currentAccount, (TL_stars.StarsTransaction) l61Var.G, gVar.getResourceProvider());
        } else if (l61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            qe.h0(gVar.getParentActivity(), gVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) l61Var.G, gVar.f50543b, gVar.resourceProvider);
        } else if (l61Var.d == 2) {
            gVar.presentFragment(new fi.f4(gVar.f50543b));
        }
    }

    public static void X(g gVar, Context context, View view) {
        if (view.isEnabled()) {
            di.d dVar = gVar.S;
            if (!dVar.N) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.f50543b);
                ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new lj1(6, gVar, context));
            }
        }
    }

    public static void Y(g gVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j10;
        double d;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i15;
        ne neVar = gVar.f50563x;
        ArrayList arrayList2 = gVar.f50554j0;
        ne neVar2 = gVar.f50564y;
        ne neVar3 = gVar.v;
        ne neVar4 = gVar.f50561s;
        ne neVar5 = gVar.f50560r;
        long j11 = gVar.f50543b;
        ne neVar6 = gVar.f50562w;
        boolean z10 = gVar.f50545c;
        int i16 = gVar.f50559o0;
        p g10 = p.g(gVar.currentAccount);
        int i17 = gVar.f50541a;
        if (i17 == 0) {
            arrayList.add(l61.h(2, i16, gVar.f50557n));
            arrayList.add(l61.A(-1, null));
            arrayList.add(l61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j11, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                neVar5.f38682a = false;
                neVar5.f38686g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                neVar5.f38687i = starsAmount3;
                neVar5.h = "XTR";
                neVar5.f38685f = "USD";
                double d10 = gVar.Z;
                neVar5.f38688j = (long) (starsAmount3.amount * d10 * 100.0d);
                neVar4.f38682a = false;
                neVar4.f38686g = true;
                neVar4.f38687i = tL_starsRevenueStatus2.current_balance;
                neVar4.h = "XTR";
                neVar4.f38688j = (long) (starsAmount.amount * d10 * 100.0d);
                neVar4.f38685f = "USD";
                neVar3.f38682a = false;
                neVar3.f38686g = true;
                neVar3.f38687i = tL_starsRevenueStatus2.overall_revenue;
                neVar3.h = "XTR";
                neVar3.f38688j = (long) (starsAmount2.amount * d10 * 100.0d);
                neVar3.f38685f = "USD";
                gVar.i0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = gVar.I;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            }
            arrayList.add(l61.u(neVar5));
            arrayList.add(l61.u(neVar4));
            arrayList.add(l61.u(neVar3));
            if (z10) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(l61.A(-2, LocaleController.getString(i14)));
            arrayList.add(l61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(l61.j(1, gVar.H));
            arrayList.add(l61.A(-3, gVar.E));
            if (!z10) {
                if (gVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(fi.h.a(2, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.uj, gVar.resourceProvider), R.drawable.filled_earn_stars, zo.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(l61.A(-4, null));
                }
                arrayList.add(l61.p(gVar.F, 0, false));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j12 = g10.j(j11, true);
            if (!z10) {
                if (gVar.f50544b0 == null) {
                    gVar.f50544b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(gVar, 2), gVar.resourceProvider), true);
                }
                arrayList.add(l61.g(gVar.f50544b0));
            }
            if (gVar.f50550f0 == null && j12 != null) {
                ta1 f02 = hb1.f0(j12.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                gVar.f50550f0 = f02;
                if (f02 != null) {
                    f02.f40344n = true;
                }
            }
            ta1 ta1Var = gVar.f50550f0;
            if (ta1Var != null && !ta1Var.f40342l) {
                arrayList.add(l61.h(5, i16, ta1Var));
                arrayList.add(l61.A(-1, null));
            }
            if (gVar.f50551g0 == null && j12 != null) {
                TL_stats.StatsGraph statsGraph = j12.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j12.usd_rate);
                }
                i10 = 2;
                gVar.f50551g0 = hb1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            ta1 ta1Var2 = gVar.f50551g0;
            if (ta1Var2 != null && !ta1Var2.f40342l) {
                arrayList.add(l61.h(i10, i16, ta1Var2));
                arrayList.add(l61.A(-2, null));
            }
            if (!gVar.f50548e0 && j12 != null && (tL_starsRevenueStatus = j12.status) != null) {
                double d11 = j12.usd_rate;
                long j13 = tL_starsRevenueStatus.available_balance.amount;
                neVar6.d = j13;
                double d12 = j13 / 1.0E9d;
                neVar6.e = (long) (d12 * d11 * 100.0d);
                if (gVar.f50556l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d11;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    gVar.f50556l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    gVar.f50556l0.setMaximumFractionDigits(6);
                    gVar.f50556l0.setGroupingUsed(false);
                } else {
                    d = d11;
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = gVar.f50556l0;
                if (d12 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qe.f0("TON " + gVar.f50556l0.format(d12), gVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(gVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                gVar.W.setText(spannableStringBuilder);
                gVar.X.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
                neVar6.f38685f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j12.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                neVar.d = j14;
                neVar.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                neVar.f38685f = "USD";
                neVar2.f38682a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                neVar2.d = j15;
                neVar2.e = (long) ((j15 / 1.0E9d) * d * 100.0d);
                neVar2.f38685f = "USD";
                gVar.f50548e0 = true;
                di.d dVar = gVar.Y;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (gVar.f50548e0) {
                arrayList.add(l61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(l61.u(neVar6));
                arrayList.add(l61.u(neVar));
                arrayList.add(l61.u(neVar2));
                if (gVar.f50546c0 == null) {
                    gVar.f50546c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new li1(gVar, R.string.BotMonetizationProceedsTONInfoLink, 12), gVar.resourceProvider), true);
                }
                arrayList.add(l61.A(-4, gVar.f50546c0));
            }
            arrayList.add(l61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(l61.k(gVar.U));
            if (gVar.f50547d0 == null) {
                if (MessagesController.getInstance(gVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                gVar.f50547d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new b(gVar, 3)), true);
            }
            arrayList.add(l61.A(-5, gVar.f50547d0));
            if (!gVar.f50553i0 || !arrayList2.isEmpty()) {
                arrayList.add(l61.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    int i19 = i7.f50678a;
                    l61 J = l61.J(i7.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f26959q = true;
                    arrayList.add(J);
                }
                if (!gVar.f50553i0) {
                    arrayList.add(l61.o(1, 7));
                    arrayList.add(l61.o(2, 7));
                    arrayList.add(l61.o(3, 7));
                }
            }
            arrayList.add(l61.A(-6, null));
        }
    }

    public static void Z(g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(new TL_account.getPassword(), new ba(gVar, twoStepVerificationActivity, z10, j10, 4), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                zc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.g6.f20007j5;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, w7.a6.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(11.0f);
            } else {
                i11 = 0;
            }
            int dp3 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(11.0f);
            }
            imageView.setPadding(i11, dp3, dp, 0);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, i16, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.q.o(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, w7.a6.n(-1, -2));
                linearLayout2.addView(imageView, w7.a6.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.a6.n(-2, -2));
                linearLayout2.addView(textView2, w7.a6.n(-1, -2));
            }
            LinearLayout f7 = org.telegram.messenger.q.f(activity, 0);
            linearLayout.addView(f7, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i13 = AndroidUtilities.dp(11.0f);
            } else {
                i13 = 0;
            }
            int dp4 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(11.0f);
            }
            imageView2.setPadding(i13, dp4, dp2, 0);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i16, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.q.o(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                f7.addView(textView3, w7.a6.n(-1, -2));
                i15 = 5;
                f7.addView(imageView2, w7.a6.q(-2, -2, 5));
            } else {
                i15 = 5;
                f7.addView(imageView2, w7.a6.n(-2, -2));
                f7.addView(textView3, w7.a6.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new d(gVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i15 = 3;
                }
                textView4.setGravity(i15 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f19548a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            pf.d.u(gVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            gVar.O = true;
            pf.d.u(gVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(g gVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(gVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(gVar.currentAccount).putChats(starsStatus.chats, false);
            gVar.f50555k0 = starsStatus.next_offset;
            gVar.f50554j0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            gVar.f50553i0 = z10;
        } else if (tL_error != null) {
            zc.d0(tL_error);
            gVar.f50553i0 = true;
        }
        gVar.f50552h0 = false;
        z61 z61Var = gVar.e.W2;
        if (z61Var != null) {
            z61Var.N(true);
        }
    }

    public static void e0(g gVar) {
        int i10;
        if (!gVar.f50552h0 && !gVar.f50553i0 && gVar.f50555k0 != null) {
            gVar.f50552h0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.f50543b);
            tL_payments_getStarsTransactions.offset = gVar.f50555k0;
            if (gVar.f50554j0.isEmpty()) {
                i10 = 5;
            } else {
                i10 = 20;
            }
            tL_payments_getStarsTransactions.limit = i10;
            ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new bi.z7(gVar, 24));
        }
    }

    public static String j0(int i10) {
        int i11 = i10 / 86400;
        int i12 = i10 - (86400 * i11);
        int i13 = i12 / 3600;
        int i14 = i12 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i11 == 0) {
            if (i13 == 0) {
                return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16));
            }
            return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i15), Integer.valueOf(i16));
        }
        int i17 = R.string.PeriodDHM;
        Locale locale = Locale.ENGLISH;
        return LocaleController.formatString(i17, String.format(locale, "%02d", Integer.valueOf(i11)), String.format(locale, "%02d", Integer.valueOf(i13)), String.format(locale, "%02d", Integer.valueOf(i15)));
    }

    @Override
    public final View createView(Context context) {
        float f7;
        int i10;
        int i11;
        f fVar = new f(this, context);
        ro roVar = new ro(context, null, false, null);
        this.d = roVar;
        roVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ro roVar2 = this.d;
        if (!this.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(roVar2, 0, w7.a6.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f50543b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f50541a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        i2.d.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 15));
        ro roVar3 = this.d;
        int i12 = org.telegram.ui.ActionBar.g6.Oi;
        roVar3.i(org.telegram.ui.ActionBar.g6.x0(null, i12, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i12, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i12, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20307z8, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.f19901d6;
        kVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        this.F = new o7(context, this.currentAccount, false, this.f50543b, getClassGuid(), getResourceProvider());
        ee eeVar = new ee(context, 9);
        this.H = eeVar;
        eeVar.setOrientation(1);
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i13, getResourceProvider()));
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.K = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.s6 s6Var2 = this.K;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, getResourceProvider()));
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.a6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.L = s6Var3;
        s6Var3.setGravity(17);
        org.telegram.ui.Components.s6 s6Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.g6.f20288y6;
        s6Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, getResourceProvider()));
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.a6.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        fe feVar = new fe(this, context, 1);
        this.M = feVar;
        feVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.M.setLeftPadding(AndroidUtilities.dp(36.0f));
        gi.o oVar = new gi.o(context, 5);
        this.Q = oVar;
        oVar.setFocusable(false);
        this.Q.setTextColor(getThemedColor(i14));
        this.Q.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Q.setCursorWidth(1.5f);
        this.Q.setBackground(null);
        this.Q.setTextSize(1, 18.0f);
        this.Q.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Q.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Q.setInputType(2);
        this.Q.setTypeface(Typeface.DEFAULT);
        this.Q.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20224uf));
        this.Q.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20242vf));
        gi.o oVar2 = this.Q;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        oVar2.setGravity(i10);
        this.Q.setOnFocusChangeListener(new ah.u0(this, 4));
        this.Q.addTextChangedListener(new di.h2(this, 22));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.a6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.a6.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.a6.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new ig.s0(this, 2));
        this.H.addView(this.M, w7.a6.t(-1, -2, 1, 18, 14, 18, 2));
        this.M.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.I = linearLayout2;
        linearLayout2.setOrientation(0);
        ci.p pVar = new ci.p(2, context, getResourceProvider(), true);
        pVar.setRoundRadius(24);
        this.R = pVar;
        pVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.R.setOnClickListener(new View.OnClickListener(this) {
            public final g f50397b;

            {
                this.f50397b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50397b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.f50397b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                org.telegram.ui.web.c0 c0Var = new org.telegram.ui.web.c0(24, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f32882b0 = c0Var;
                                gVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new c(gVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        di.d dVar = new di.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.S = dVar;
        dVar.setEnabled(true);
        this.S.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.S.setOnClickListener(new yh.a(5, this, context));
        this.I.addView(this.R, w7.a6.o(-1, 48, 1.0f, 119));
        boolean z10 = this.f50545c;
        if (!z10) {
            this.I.addView(new Space(context), w7.a6.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.a6.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.a6.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        ee eeVar2 = new ee(context, 10);
        this.U = eeVar2;
        eeVar2.setOrientation(1);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i13, this.resourceProvider));
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var5 = new org.telegram.ui.Components.s6(context, false, true, true);
        this.W = s6Var5;
        s6Var5.setTypeface(AndroidUtilities.bold());
        this.W.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, this.resourceProvider));
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.a6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var6 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.X = s6Var6;
        s6Var6.setGravity(17);
        this.X.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, this.resourceProvider));
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.a6.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        di.d dVar3 = this.Y;
        if (z10) {
            i11 = R.string.MonetizationSelfWithdraw;
        } else {
            i11 = R.string.MonetizationWithdraw;
        }
        dVar3.g(LocaleController.getString(i11), false, true);
        this.Y.setVisibility(8);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final g f50397b;

            {
                this.f50397b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f50397b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.f50397b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                org.telegram.ui.web.c0 c0Var = new org.telegram.ui.web.c0(24, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f32882b0 = c0Var;
                                gVar.Y.setLoading(true);
                                twoStepVerificationActivity.s0(new c(gVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.U.addView(this.Y, w7.a6.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        h71 h71Var = new h71(this, new ii.a(this, 21), new d(this), new d(this));
        this.e = h71Var;
        h71Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7));
        this.e.p1();
        fVar.addView(this.e, w7.a6.d(-1.0f, -1));
        this.e.setOnScrollListener(new kc0(this, 21));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = fVar;
        return fVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f50543b) {
            g0();
        }
    }

    public final void g0() {
        kg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(this.f50543b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f50549f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f50549f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.Z = h.usd_rate;
            ta1 f02 = hb1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f50557n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f50557n.d.d.get(0) != null) {
                ta1 ta1Var = this.f50557n;
                ta1Var.h = true;
                ((kg.a) ta1Var.d.d.get(0)).f14247g = org.telegram.ui.ActionBar.g6.yj;
                this.f50557n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            i0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            h71 h71Var = this.e;
            if (h71Var != null) {
                h71Var.W2.N(true);
            }
        }
    }

    public final void h0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j11 = this.f50543b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new bi.p7(this, twoStepVerificationActivity, parentActivity, z10, j10));
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.K != null && this.L != null) {
            long j10 = (long) (this.Z * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p7.Y0(false, TextUtils.concat("XTR ", p7.K0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
            }
            this.K.setText(spannableStringBuilder);
            this.L.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            fe feVar = this.M;
            if (j10 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            feVar.setVisibility(i11);
            if (this.O) {
                this.N = true;
                gi.o oVar = this.Q;
                long j11 = starsAmount.amount;
                this.P = j11;
                oVar.setText(Long.toString(j11));
                gi.o oVar2 = this.Q;
                oVar2.setSelection(oVar2.getText().length());
                this.N = false;
                ci.p pVar = this.R;
                if (this.P > 0) {
                    z10 = true;
                }
                pVar.setEnabled(z10);
            }
            this.G = i10;
            b bVar = this.f50558n0;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void k0() {
        ci.p pVar = this.R;
        if (pVar.W && !pVar.N) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.G > currentTime) {
                this.f50542a0 = zc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            } else if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
                zc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, 1))).j();
            } else {
                long j10 = this.P;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                p9 p9Var = new p9(this, j10, twoStepVerificationActivity, 10);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f32882b0 = p9Var;
                this.R.setLoading(true);
                twoStepVerificationActivity.s0(new c(this, twoStepVerificationActivity, 1));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        g0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }
}
