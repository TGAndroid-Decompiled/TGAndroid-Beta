package yh;

import ai.o8;
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
import ci.q9;
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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce;
import org.telegram.ui.db1;
import org.telegram.ui.de;
import org.telegram.ui.f51;
import org.telegram.ui.fj1;
import org.telegram.ui.le;
import org.telegram.ui.oe;
import org.telegram.ui.pa1;
import org.telegram.ui.xo;
public final class g extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public o7 F;
    public int G;
    public ce H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.r6 K;
    public org.telegram.ui.Components.r6 L;
    public de M;
    public boolean N;
    public boolean O;
    public long P;
    public fi.o Q;
    public bi.q R;
    public ci.d S;
    public final gr[] T;
    public ce U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.r6 W;
    public org.telegram.ui.Components.r6 X;
    public ci.d Y;
    public double Z;
    public final int f52777a;
    public sc f52778a0;
    public final long f52779b;
    public CharSequence f52780b0;
    public final boolean f52781c;
    public CharSequence f52782c0;
    public wo d;
    public CharSequence f52783d0;
    public p71 f52784e;
    public boolean f52785e0;
    public TLRPC.TL_payments_starsRevenueStats f52786f;
    public pa1 f52787f0;
    public pa1 f52788g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean f52789h0;
    public boolean f52790i0;
    public final ArrayList f52791j0;
    public String f52792k0;
    public DecimalFormat f52793l0;
    public SpannableStringBuilder m0;
    public pa1 f52794n;
    public final b f52795n0;
    public final int f52796o0;
    public final le f52797r;
    public final le f52798s;
    public final le v;
    public final le f52799w;
    public final le f52800x;
    public final le f52801y;

    public g(int i10, long j3) {
        super(null);
        boolean z10;
        String string;
        this.f52797r = le.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f52798s = le.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = le.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f52799w = le.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f52800x = le.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f52801y = le.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.N = false;
        this.O = true;
        this.T = new gr[1];
        this.f52789h0 = false;
        this.f52790i0 = false;
        this.f52791j0 = new ArrayList();
        this.f52792k0 = "";
        this.f52795n0 = new b(this, 0);
        this.f52796o0 = -1;
        this.f52777a = i10;
        this.f52779b = j3;
        if (j3 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52781c = z10;
        if (i10 == 0) {
            o.g(this.currentAccount).r(j3);
            if (!z10) {
                o.g(this.currentAccount).l(j3);
            }
        } else if (i10 == 1) {
            o g10 = o.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.E = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new b(this, 4)), true);
    }

    public static void U(g gVar) {
        long j3;
        b bVar = gVar.f52795n0;
        sc.e();
        TLRPC.TL_payments_starsRevenueStats h = o.g(gVar.currentAccount).h(gVar.f52779b, false);
        if (h == null) {
            j3 = 0;
        } else {
            j3 = h.status.available_balance.amount;
        }
        if (j3 < gVar.getMessagesController().starsRevenueWithdrawalMin) {
            gVar.O = true;
            gVar.P = j3;
        } else {
            gVar.O = false;
            gVar.P = gVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        gVar.N = true;
        gVar.Q.setText(Long.toString(gVar.P));
        fi.o oVar = gVar.Q;
        oVar.setSelection(oVar.getText().length());
        gVar.N = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public static void V(g gVar) {
        gVar.showDialog(oe.d0(gVar.getParentActivity(), gVar.resourceProvider, true));
    }

    public static void W(g gVar, u61 u61Var) {
        if (u61Var.G(i7.class)) {
            p7.i1(gVar.getParentActivity(), true, gVar.f52779b, gVar.currentAccount, (TL_stars.StarsTransaction) u61Var.G, gVar.getResourceProvider());
        } else if (u61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            oe.h0(gVar.getParentActivity(), gVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) u61Var.G, gVar.f52779b, gVar.resourceProvider);
        } else if (u61Var.d == 2) {
            gVar.presentFragment(new ei.e4(gVar.f52779b));
        }
    }

    public static void X(g gVar, Context context, View view) {
        if (view.isEnabled()) {
            ci.d dVar = gVar.S;
            if (!dVar.N) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.f52779b);
                ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new fj1(6, gVar, context));
            }
        }
    }

    public static void Y(g gVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j3;
        double d;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i15;
        le leVar = gVar.f52800x;
        ArrayList arrayList2 = gVar.f52791j0;
        le leVar2 = gVar.f52801y;
        le leVar3 = gVar.v;
        le leVar4 = gVar.f52798s;
        le leVar5 = gVar.f52797r;
        long j10 = gVar.f52779b;
        le leVar6 = gVar.f52799w;
        boolean z10 = gVar.f52781c;
        int i16 = gVar.f52796o0;
        o g10 = o.g(gVar.currentAccount);
        int i17 = gVar.f52777a;
        if (i17 == 0) {
            arrayList.add(u61.h(2, i16, gVar.f52794n));
            arrayList.add(u61.A(-1, null));
            arrayList.add(u61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                leVar5.f39714a = false;
                leVar5.f39719g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                leVar5.f39720i = starsAmount3;
                leVar5.h = "XTR";
                leVar5.f39718f = "USD";
                double d10 = gVar.Z;
                leVar5.f39721j = (long) (starsAmount3.amount * d10 * 100.0d);
                leVar4.f39714a = false;
                leVar4.f39719g = true;
                leVar4.f39720i = tL_starsRevenueStatus2.current_balance;
                leVar4.h = "XTR";
                leVar4.f39721j = (long) (starsAmount.amount * d10 * 100.0d);
                leVar4.f39718f = "USD";
                leVar3.f39714a = false;
                leVar3.f39719g = true;
                leVar3.f39720i = tL_starsRevenueStatus2.overall_revenue;
                leVar3.h = "XTR";
                leVar3.f39721j = (long) (starsAmount2.amount * d10 * 100.0d);
                leVar3.f39718f = "USD";
                gVar.i0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = gVar.I;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            }
            arrayList.add(u61.u(leVar5));
            arrayList.add(u61.u(leVar4));
            arrayList.add(u61.u(leVar3));
            if (z10) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(u61.A(-2, LocaleController.getString(i14)));
            arrayList.add(u61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(u61.j(1, gVar.H));
            arrayList.add(u61.A(-3, gVar.E));
            if (!z10) {
                if (gVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(ei.h.a(2, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, gVar.resourceProvider), R.drawable.filled_earn_stars, xo.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(u61.A(-4, null));
                }
                arrayList.add(u61.p(gVar.F, 0, false));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g10.j(j10, true);
            if (!z10) {
                if (gVar.f52780b0 == null) {
                    gVar.f52780b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(gVar, 2), gVar.resourceProvider), true);
                }
                arrayList.add(u61.g(gVar.f52780b0));
            }
            if (gVar.f52787f0 == null && j11 != null) {
                pa1 f02 = db1.f0(j11.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                gVar.f52787f0 = f02;
                if (f02 != null) {
                    f02.f40901n = true;
                }
            }
            pa1 pa1Var = gVar.f52787f0;
            if (pa1Var != null && !pa1Var.f40899l) {
                arrayList.add(u61.h(5, i16, pa1Var));
                arrayList.add(u61.A(-1, null));
            }
            if (gVar.f52788g0 == null && j11 != null) {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i10 = 2;
                gVar.f52788g0 = db1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            pa1 pa1Var2 = gVar.f52788g0;
            if (pa1Var2 != null && !pa1Var2.f40899l) {
                arrayList.add(u61.h(i10, i16, pa1Var2));
                arrayList.add(u61.A(-2, null));
            }
            if (!gVar.f52785e0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                leVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                leVar6.f39717e = (long) (d12 * d11 * 100.0d);
                if (gVar.f52793l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d11;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    gVar.f52793l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    gVar.f52793l0.setMaximumFractionDigits(6);
                    gVar.f52793l0.setGroupingUsed(false);
                } else {
                    d = d11;
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = gVar.f52793l0;
                if (d12 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oe.f0("TON " + gVar.f52793l0.format(d12), gVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(gVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                gVar.W.setText(spannableStringBuilder);
                gVar.X.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
                leVar6.f39718f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                leVar.d = j13;
                leVar.f39717e = (long) ((j13 / 1.0E9d) * d * 100.0d);
                leVar.f39718f = "USD";
                leVar2.f39714a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                leVar2.d = j14;
                leVar2.f39717e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                leVar2.f39718f = "USD";
                gVar.f52785e0 = true;
                ci.d dVar = gVar.Y;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (gVar.f52785e0) {
                arrayList.add(u61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(u61.u(leVar6));
                arrayList.add(u61.u(leVar));
                arrayList.add(u61.u(leVar2));
                if (gVar.f52782c0 == null) {
                    gVar.f52782c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new org.telegram.ui.Wallet.i(gVar, R.string.BotMonetizationProceedsTONInfoLink, 10), gVar.resourceProvider), true);
                }
                arrayList.add(u61.A(-4, gVar.f52782c0));
            }
            arrayList.add(u61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(u61.k(gVar.U));
            if (gVar.f52783d0 == null) {
                if (MessagesController.getInstance(gVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                gVar.f52783d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new b(gVar, 3)), true);
            }
            arrayList.add(u61.A(-5, gVar.f52783d0));
            if (!gVar.f52790i0 || !arrayList2.isEmpty()) {
                arrayList.add(u61.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    int i19 = i7.f52923a;
                    u61 J = u61.J(i7.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f31081q = true;
                    arrayList.add(J);
                }
                if (!gVar.f52790i0) {
                    arrayList.add(u61.o(1, 7));
                    arrayList.add(u61.o(2, 7));
                    arrayList.add(u61.o(3, 7));
                }
            }
            arrayList.add(u61.A(-6, null));
        }
    }

    public static void Z(g gVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
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
                    ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(new TL_account.getPassword(), new ba(gVar, twoStepVerificationActivity, z10, j3, 4), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                zc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.h6.f20667j5;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, w7.w5.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i16, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.v0.n(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, w7.w5.n(-1, -2));
                linearLayout2.addView(imageView, w7.w5.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.w5.n(-2, -2));
                linearLayout2.addView(textView2, w7.w5.n(-1, -2));
            }
            LinearLayout f7 = org.telegram.messenger.v0.f(activity, 0);
            linearLayout.addView(f7, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i16, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.v0.n(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                f7.addView(textView3, w7.w5.n(-1, -2));
                i15 = 5;
                f7.addView(imageView2, w7.w5.q(-2, -2, 5));
            } else {
                i15 = 5;
                f7.addView(imageView2, w7.w5.n(-2, -2));
                f7.addView(textView3, w7.w5.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new d(gVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i15 = 3;
                }
                textView4.setGravity(i15 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f20141a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            of.f.u(gVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            gVar.O = true;
            of.f.u(gVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(g gVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(gVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(gVar.currentAccount).putChats(starsStatus.chats, false);
            gVar.f52792k0 = starsStatus.next_offset;
            gVar.f52791j0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            gVar.f52790i0 = z10;
        } else if (tL_error != null) {
            zc.d0(tL_error);
            gVar.f52790i0 = true;
        }
        gVar.f52789h0 = false;
        h71 h71Var = gVar.f52784e.W2;
        if (h71Var != null) {
            h71Var.N(true);
        }
    }

    public static void e0(g gVar) {
        int i10;
        if (!gVar.f52789h0 && !gVar.f52790i0 && gVar.f52792k0 != null) {
            gVar.f52789h0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.f52779b);
            tL_payments_getStarsTransactions.offset = gVar.f52792k0;
            if (gVar.f52791j0.isEmpty()) {
                i10 = 5;
            } else {
                i10 = 20;
            }
            tL_payments_getStarsTransactions.limit = i10;
            ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new o8(gVar, 24));
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
        wo woVar = new wo(context, null, false, null);
        this.d = woVar;
        woVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        wo woVar2 = this.d;
        if (!this.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(woVar2, 0, w7.w5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f52779b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f52777a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        hg.c.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new f51(this, 14));
        wo woVar3 = this.d;
        int i12 = org.telegram.ui.ActionBar.h6.Oi;
        woVar3.i(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        this.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i12, false), false);
        this.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i12, false), true);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20965z8, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.h6.f20559d6;
        kVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.F = new o7(context, this.currentAccount, false, this.f52779b, getClassGuid(), getResourceProvider());
        ce ceVar = new ce(context, 9);
        this.H = ceVar;
        ceVar.setOrientation(1);
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i13, getResourceProvider()));
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
        this.K = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.r6 r6Var2 = this.K;
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        r6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, getResourceProvider()));
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.w5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(context, true, true, true);
        this.L = r6Var3;
        r6Var3.setGravity(17);
        org.telegram.ui.Components.r6 r6Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.h6.f20945y6;
        r6Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, getResourceProvider()));
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.w5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        de deVar = new de(this, context, 1);
        this.M = deVar;
        deVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.M.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(context, 5);
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
        this.Q.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20883uf));
        this.Q.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20900vf));
        fi.o oVar2 = this.Q;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        oVar2.setGravity(i10);
        this.Q.setOnFocusChangeListener(new ii.w5(this, 3));
        this.Q.addTextChangedListener(new ci.h2(this, 23));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.w5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.w5.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.w5.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new hg.t0(this, 2));
        this.H.addView(this.M, w7.w5.t(-1, -2, 1, 18, 14, 18, 2));
        this.M.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.I = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.q qVar = new bi.q(2, context, getResourceProvider(), true);
        qVar.setRoundRadius(24);
        this.R = qVar;
        qVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.R.setOnClickListener(new View.OnClickListener(this) {
            public final g f52635b;

            {
                this.f52635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52635b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.f52635b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                qg.x1 x1Var = new qg.x1(21, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34410b0 = x1Var;
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
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.S = dVar;
        dVar.setEnabled(true);
        this.S.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.S.setOnClickListener(new xh.a(5, this, context));
        this.I.addView(this.R, w7.w5.o(-1, 48, 1.0f, 119));
        boolean z10 = this.f52781c;
        if (!z10) {
            this.I.addView(new Space(context), w7.w5.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.w5.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.w5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        ce ceVar2 = new ce(context, 10);
        this.U = ceVar2;
        ceVar2.setOrientation(1);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i13, this.resourceProvider));
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.r6 r6Var5 = new org.telegram.ui.Components.r6(context, false, true, true);
        this.W = r6Var5;
        r6Var5.setTypeface(AndroidUtilities.bold());
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, this.resourceProvider));
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.w5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.r6 r6Var6 = new org.telegram.ui.Components.r6(context, true, true, true);
        this.X = r6Var6;
        r6Var6.setGravity(17);
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, this.resourceProvider));
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.w5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        ci.d dVar3 = this.Y;
        if (z10) {
            i11 = R.string.MonetizationSelfWithdraw;
        } else {
            i11 = R.string.MonetizationWithdraw;
        }
        dVar3.g(LocaleController.getString(i11), false, true);
        this.Y.setVisibility(8);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final g f52635b;

            {
                this.f52635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f52635b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.f52635b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                qg.x1 x1Var = new qg.x1(21, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34410b0 = x1Var;
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
        this.U.addView(this.Y, w7.w5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        p71 p71Var = new p71(this, new hi.a(this, 21), new d(this), new d(this));
        this.f52784e = p71Var;
        p71Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20503a7));
        this.f52784e.p1();
        fVar.addView(this.f52784e, w7.w5.d(-1.0f, -1));
        this.f52784e.setOnScrollListener(new qh0(this, 20));
        this.actionBar.setAdaptiveBackground(this.f52784e);
        this.fragmentView = fVar;
        return fVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f52779b) {
            g0();
        }
    }

    public final void g0() {
        jg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(this.f52779b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f52786f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f52786f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.Z = h.usd_rate;
            pa1 f02 = db1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f52794n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f52794n.d.d.get(0) != null) {
                pa1 pa1Var = this.f52794n;
                pa1Var.h = true;
                ((jg.a) pa1Var.d.d.get(0)).f14153g = org.telegram.ui.ActionBar.h6.yj;
                this.f52794n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            i0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            p71 p71Var = this.f52784e;
            if (p71Var != null) {
                p71Var.W2.N(true);
            }
        }
    }

    public final void h0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j10 = this.f52779b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ai.e8(this, twoStepVerificationActivity, parentActivity, z10, j3));
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.K != null && this.L != null) {
            long j3 = (long) (this.Z * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p7.Y0(false, TextUtils.concat("XTR ", p7.K0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
            }
            this.K.setText(spannableStringBuilder);
            this.L.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
            de deVar = this.M;
            if (j3 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            deVar.setVisibility(i11);
            if (this.O) {
                this.N = true;
                fi.o oVar = this.Q;
                long j10 = starsAmount.amount;
                this.P = j10;
                oVar.setText(Long.toString(j10));
                fi.o oVar2 = this.Q;
                oVar2.setSelection(oVar2.getText().length());
                this.N = false;
                bi.q qVar = this.R;
                if (this.P > 0) {
                    z10 = true;
                }
                qVar.setEnabled(z10);
            }
            this.G = i10;
            b bVar = this.f52795n0;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void k0() {
        bi.q qVar = this.R;
        if (qVar.W && !qVar.N) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.G > currentTime) {
                this.f52778a0 = zc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            } else if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
                zc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, 1))).j();
            } else {
                long j3 = this.P;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                q9 q9Var = new q9(this, j3, twoStepVerificationActivity, 10);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f34410b0 = q9Var;
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
