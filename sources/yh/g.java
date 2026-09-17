package yh;

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
import ci.t9;
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
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.ae;
import org.telegram.ui.bj1;
import org.telegram.ui.ie;
import org.telegram.ui.le;
import org.telegram.ui.ma1;
import org.telegram.ui.wo;
import org.telegram.ui.x81;
import org.telegram.ui.xy0;
import org.telegram.ui.zd;
public final class g extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final CharSequence E;
    public x7 F;
    public int G;
    public zd H;
    public LinearLayout I;
    public RelativeSizeSpan J;
    public org.telegram.ui.Components.n6 K;
    public org.telegram.ui.Components.n6 L;
    public ae M;
    public boolean N;
    public boolean O;
    public long P;
    public fi.o Q;
    public bi.q R;
    public ci.d S;
    public final oq[] T;
    public zd U;
    public RelativeSizeSpan V;
    public org.telegram.ui.Components.n6 W;
    public org.telegram.ui.Components.n6 X;
    public ci.d Y;
    public double Z;
    public final int f47198a;
    public oc f47199a0;
    public final long f47200b;
    public CharSequence f47201b0;
    public final boolean f47202c;
    public CharSequence f47203c0;
    public eo d;
    public CharSequence f47204d0;
    public f61 e;
    public boolean f47205e0;
    public TLRPC.TL_payments_starsRevenueStats f47206f;
    public ma1 f47207f0;
    public ma1 f47208g0;
    public TLRPC.TL_starsRevenueStatus h;
    public boolean f47209h0;
    public boolean f47210i0;
    public final ArrayList f47211j0;
    public String f47212k0;
    public DecimalFormat f47213l0;
    public SpannableStringBuilder m0;
    public ma1 f47214n;
    public final b f47215n0;
    public final int f47216o0;
    public final ie f47217r;
    public final ie f47218s;
    public final ie v;
    public final ie f47219w;
    public final ie f47220x;
    public final ie f47221y;

    public g(int i10, long j3) {
        super(null);
        boolean z10;
        String string;
        this.f47217r = ie.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.f47218s = ie.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.v = ie.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.f47219w = ie.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.f47220x = ie.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.f47221y = ie.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.N = false;
        this.O = true;
        this.T = new oq[1];
        this.f47209h0 = false;
        this.f47210i0 = false;
        this.f47211j0 = new ArrayList();
        this.f47212k0 = "";
        this.f47215n0 = new b(this, 0);
        this.f47216o0 = -1;
        this.f47198a = i10;
        this.f47200b = j3;
        if (j3 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47202c = z10;
        if (i10 == 0) {
            o.g(this.currentAccount).r(j3);
            if (!z10) {
                o.g(this.currentAccount).l(j3);
            }
        } else if (i10 == 1) {
            o g10 = o.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : true);
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
        b bVar = gVar.f47215n0;
        oc.e();
        TLRPC.TL_payments_starsRevenueStats h = o.g(gVar.currentAccount).h(gVar.f47200b, false);
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
        gVar.showDialog(le.d0(gVar.getParentActivity(), gVar.resourceProvider, true));
    }

    public static void W(g gVar, j51 j51Var) {
        if (j51Var.G(r7.class)) {
            y7.h1(gVar.getParentActivity(), true, gVar.f47200b, gVar.currentAccount, (TL_stars.StarsTransaction) j51Var.G, gVar.getResourceProvider());
        } else if (j51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            le.h0(gVar.getParentActivity(), gVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) j51Var.G, gVar.f47200b, gVar.resourceProvider);
        } else if (j51Var.d == 2) {
            gVar.presentFragment(new ei.e4(gVar.f47200b));
        }
    }

    public static void X(g gVar, Context context, View view) {
        if (view.isEnabled()) {
            ci.d dVar = gVar.S;
            if (!dVar.N) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.f47200b);
                ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bj1(6, gVar, context));
            }
        }
    }

    public static void Y(g gVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        double d;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        int i15;
        ie ieVar = gVar.f47220x;
        ArrayList arrayList2 = gVar.f47211j0;
        ie ieVar2 = gVar.f47221y;
        ie ieVar3 = gVar.v;
        ie ieVar4 = gVar.f47218s;
        ie ieVar5 = gVar.f47217r;
        long j3 = gVar.f47200b;
        ie ieVar6 = gVar.f47219w;
        boolean z10 = gVar.f47202c;
        int i16 = gVar.f47216o0;
        o g10 = o.g(gVar.currentAccount);
        int i17 = gVar.f47198a;
        if (i17 == 0) {
            arrayList.add(j51.h(2, i16, gVar.f47214n));
            arrayList.add(j51.A(-1, null));
            arrayList.add(j51.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                ieVar5.f34534a = false;
                ieVar5.f34538g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                ieVar5.f34539i = starsAmount;
                ieVar5.h = "XTR";
                ieVar5.f34537f = "USD";
                double d10 = gVar.Z;
                ieVar5.f34540j = (long) (starsAmount.amount * d10 * 100.0d);
                ieVar4.f34534a = false;
                ieVar4.f34538g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus2.current_balance;
                ieVar4.f34539i = starsAmount2;
                ieVar4.h = "XTR";
                ieVar4.f34540j = (long) (starsAmount2.amount * d10 * 100.0d);
                ieVar4.f34537f = "USD";
                ieVar3.f34534a = false;
                ieVar3.f34538g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.overall_revenue;
                ieVar3.f34539i = starsAmount3;
                ieVar3.h = "XTR";
                ieVar3.f34540j = (long) (starsAmount3.amount * d10 * 100.0d);
                ieVar3.f34537f = "USD";
                gVar.i0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = gVar.I;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            }
            arrayList.add(j51.u(ieVar5));
            arrayList.add(j51.u(ieVar4));
            arrayList.add(j51.u(ieVar3));
            if (z10) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(j51.A(-2, LocaleController.getString(i14)));
            arrayList.add(j51.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(j51.j(1, gVar.H));
            arrayList.add(j51.A(-3, gVar.E));
            if (!z10) {
                if (gVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(ei.h.a(2, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, gVar.resourceProvider), R.drawable.filled_earn_stars, wo.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(j51.A(-4, null));
                }
                arrayList.add(j51.p(gVar.F, 0, false));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            if (!z10) {
                if (gVar.f47201b0 == null) {
                    gVar.f47201b0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(gVar, 2), gVar.resourceProvider), true);
                }
                arrayList.add(j51.g(gVar.f47201b0));
            }
            if (gVar.f47207f0 == null && j10 != null) {
                ma1 f02 = ab1.f0(j10.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                gVar.f47207f0 = f02;
                if (f02 != null) {
                    f02.f35751n = true;
                }
            }
            ma1 ma1Var = gVar.f47207f0;
            if (ma1Var != null && !ma1Var.f35749l) {
                arrayList.add(j51.h(5, i16, ma1Var));
                arrayList.add(j51.A(-1, null));
            }
            if (gVar.f47208g0 == null && j10 != null) {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i10 = 2;
                gVar.f47208g0 = ab1.f0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            ma1 ma1Var2 = gVar.f47208g0;
            if (ma1Var2 != null && !ma1Var2.f35749l) {
                arrayList.add(j51.h(i10, i16, ma1Var2));
                arrayList.add(j51.A(-2, null));
            }
            if (!gVar.f47205e0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d11 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                ieVar6.d = j11;
                double d12 = j11 / 1.0E9d;
                long j12 = (long) (d12 * d11 * 100.0d);
                ieVar6.e = j12;
                if (gVar.f47213l0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    d = d11;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    gVar.f47213l0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    gVar.f47213l0.setMaximumFractionDigits(6);
                    gVar.f47213l0.setGroupingUsed(false);
                } else {
                    d = d11;
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = gVar.f47213l0;
                if (d12 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(le.f0("TON " + gVar.f47213l0.format(d12), gVar.W.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(gVar.V, indexOf, spannableStringBuilder.length(), 33);
                }
                gVar.W.setText(spannableStringBuilder);
                org.telegram.ui.Components.n6 n6Var = gVar.X;
                n6Var.setText("≈" + BillingController.getInstance().formatCurrency(j12, "USD"));
                ieVar6.f34537f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                ieVar.d = j13;
                ieVar.e = (long) ((j13 / 1.0E9d) * d * 100.0d);
                ieVar.f34537f = "USD";
                ieVar2.f34534a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                ieVar2.d = j14;
                ieVar2.e = (long) ((j14 / 1.0E9d) * d * 100.0d);
                ieVar2.f34537f = "USD";
                gVar.f47205e0 = true;
                ci.d dVar = gVar.Y;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (gVar.f47205e0) {
                arrayList.add(j51.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(j51.u(ieVar6));
                arrayList.add(j51.u(ieVar));
                arrayList.add(j51.u(ieVar2));
                if (gVar.f47203c0 == null) {
                    gVar.f47203c0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new qg.v(gVar, R.string.BotMonetizationProceedsTONInfoLink, 4), gVar.resourceProvider), true);
                }
                arrayList.add(j51.A(-4, gVar.f47203c0));
            }
            arrayList.add(j51.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(j51.k(gVar.U));
            if (gVar.f47204d0 == null) {
                if (MessagesController.getInstance(gVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                gVar.f47204d0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new b(gVar, 3)), true);
            }
            arrayList.add(j51.A(-5, gVar.f47204d0));
            if (!gVar.f47210i0 || !arrayList2.isEmpty()) {
                arrayList.add(j51.b(LocaleController.getString(R.string.BotMonetizationTransactions)));
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    int i19 = r7.f47756a;
                    j51 J = j51.J(r7.class);
                    J.G = (TL_stars.StarsTransaction) obj;
                    J.f25129q = true;
                    arrayList.add(J);
                }
                if (!gVar.f47210i0) {
                    arrayList.add(j51.o(1, 7));
                    arrayList.add(j51.o(2, 7));
                    arrayList.add(j51.o(3, 7));
                }
            }
            arrayList.add(j51.A(-6, null));
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
                    ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(new TL_account.getPassword(), new v9(gVar, twoStepVerificationActivity, z10, j3, 3), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                vc.b0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.j6.f18969j5;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, w7.x5.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.w1.n(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.x5.n(-2, -2));
                linearLayout2.addView(textView2, w7.x5.n(-1, -2));
            }
            LinearLayout f7 = org.telegram.messenger.w1.f(activity, 0);
            linearLayout.addView(f7, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.w1.n(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                f7.addView(textView3, w7.x5.n(-1, -2));
                i15 = 5;
                f7.addView(imageView2, w7.x5.q(-2, -2, 5));
            } else {
                i15 = 5;
                f7.addView(imageView2, w7.x5.n(-2, -2));
                f7.addView(textView3, w7.x5.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new d(gVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i15 = 3;
                }
                textView4.setGravity(i15 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f18446a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            nf.f.u(gVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            gVar.O = true;
            nf.f.u(gVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void a0(g gVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        if (tLObject instanceof TL_stars.StarsStatus) {
            TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
            MessagesController.getInstance(gVar.currentAccount).putUsers(starsStatus.users, false);
            MessagesController.getInstance(gVar.currentAccount).putChats(starsStatus.chats, false);
            gVar.f47212k0 = starsStatus.next_offset;
            gVar.f47211j0.addAll(starsStatus.history);
            if (!starsStatus.history.isEmpty() && starsStatus.next_offset != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            gVar.f47210i0 = z10;
        } else if (tL_error != null) {
            vc.b0(tL_error);
            gVar.f47210i0 = true;
        }
        gVar.f47209h0 = false;
        x51 x51Var = gVar.e.Y2;
        if (x51Var != null) {
            x51Var.N(true);
        }
    }

    public static void e0(g gVar) {
        int i10;
        if (!gVar.f47209h0 && !gVar.f47210i0 && gVar.f47212k0 != null) {
            gVar.f47209h0 = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(gVar.currentAccount).getInputPeer(gVar.f47200b);
            tL_payments_getStarsTransactions.offset = gVar.f47212k0;
            if (gVar.f47211j0.isEmpty()) {
                i10 = 5;
            } else {
                i10 = 20;
            }
            tL_payments_getStarsTransactions.limit = i10;
            ConnectionsManager.getInstance(gVar.currentAccount).sendRequest(tL_payments_getStarsTransactions, new ai.m8(gVar, 24));
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
        eo eoVar = new eo(context, null, false, null);
        this.d = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.d.getAvatarImageView().setScaleX(0.9f);
        this.d.getAvatarImageView().setScaleY(0.9f);
        this.d.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        eo eoVar2 = this.d;
        if (!this.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar.addView(eoVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f47200b));
        this.d.k(user, true);
        this.d.setTitle(UserObject.getUserName(user));
        if (this.f47198a == 0) {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.d.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        hg.k0.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new x81(this, 12));
        eo eoVar3 = this.d;
        int i12 = org.telegram.ui.ActionBar.j6.Oi;
        eoVar3.i(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i12, false), true);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19265z8, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.f18862d6;
        kVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.F = new x7(context, this.currentAccount, false, this.f47200b, getClassGuid(), getResourceProvider());
        zd zdVar = new zd(context, 9);
        this.H = zdVar;
        zdVar.setOrientation(1);
        this.H.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, getResourceProvider()));
        this.H.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.K = n6Var;
        n6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.n6 n6Var2 = this.K;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        n6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, getResourceProvider()));
        this.K.setTextSize(AndroidUtilities.dp(32.0f));
        this.K.setGravity(17);
        this.J = new RelativeSizeSpan(0.6770833f);
        this.H.addView(this.K, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.L = n6Var3;
        n6Var3.setGravity(17);
        org.telegram.ui.Components.n6 n6Var4 = this.L;
        int i15 = org.telegram.ui.ActionBar.j6.f19244y6;
        n6Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, getResourceProvider()));
        this.L.setTextSize(AndroidUtilities.dp(14.0f));
        this.H.addView(this.L, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, context, 1);
        this.M = aeVar;
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
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
        this.Q.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19183uf));
        this.Q.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19200vf));
        fi.o oVar2 = this.Q;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        oVar2.setGravity(i10);
        this.Q.setOnFocusChangeListener(new ii.v5(this, 3));
        this.Q.addTextChangedListener(new ci.i2(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Q, w7.x5.o(-1, -2, 1.0f, 119));
        this.M.e(this.Q);
        this.M.addView(linearLayout, w7.x5.e(-1, -2, 48));
        this.Q.setOnEditorActionListener(new hg.t0(this, 2));
        this.H.addView(this.M, w7.x5.t(-1, -2, 1, 18, 14, 18, 2));
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
            public final g f47113b;

            {
                this.f47113b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f47113b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.f47113b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                tg.d dVar = new tg.d(14, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f31604b0 = dVar;
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
        this.S.setOnClickListener(new xy0(29, this, context));
        this.I.addView(this.R, w7.x5.o(-1, 48, 1.0f, 119));
        boolean z10 = this.f47202c;
        if (!z10) {
            this.I.addView(new Space(context), w7.x5.o(8, 48, 0.0f, 119));
            this.I.addView(this.S, w7.x5.o(-1, 48, 1.0f, 119));
        }
        this.H.addView(this.I, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar2 = new zd(context, 10);
        this.U = zdVar2;
        zdVar2.setOrientation(1);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, this.resourceProvider));
        this.U.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.n6 n6Var5 = new org.telegram.ui.Components.n6(context, false, true, true);
        this.W = n6Var5;
        n6Var5.setTypeface(AndroidUtilities.bold());
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.resourceProvider));
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.V = new RelativeSizeSpan(0.6770833f);
        this.U.addView(this.W, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var6 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.X = n6Var6;
        n6Var6.setGravity(17);
        this.X.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.resourceProvider));
        this.X.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.addView(this.X, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
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
            public final g f47113b;

            {
                this.f47113b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f47113b.k0();
                        return;
                    default:
                        if (view.isEnabled()) {
                            g gVar = this.f47113b;
                            if (!gVar.Y.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                tg.d dVar4 = new tg.d(14, gVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f31604b0 = dVar4;
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
        this.U.addView(this.Y, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        f61 f61Var = new f61(this, new hi.a(this, 21), new d(this), new d(this));
        this.e = f61Var;
        f61Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7));
        this.e.q1();
        fVar.addView(this.e, w7.x5.c(-1.0f, -1));
        this.e.setOnScrollListener(new kb0(this, 19));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = fVar;
        return fVar;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f47200b) {
            g0();
        }
    }

    public final void g0() {
        jg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(this.f47200b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.f47206f) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.h) {
                return;
            }
        }
        this.f47206f = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.h = tL_starsRevenueStatus2;
        if (h != null) {
            this.Z = h.usd_rate;
            ma1 f02 = ab1.f0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f47214n = f02;
            if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f47214n.d.d.get(0) != null) {
                ma1 ma1Var = this.f47214n;
                ma1Var.h = true;
                ((jg.a) ma1Var.d.d.get(0)).f12999g = org.telegram.ui.ActionBar.j6.yj;
                this.f47214n.d.h = (float) ((1.0d / this.Z) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            i0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            f61 f61Var = this.e;
            if (f61Var != null) {
                f61Var.Y2.N(true);
            }
        }
    }

    public final void h0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j10 = this.f47200b;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ai.b8(this, twoStepVerificationActivity, parentActivity, z10, j3));
        }
    }

    public final void i0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.K != null && this.L != null) {
            long j3 = (long) (this.Z * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y7.X0(false, TextUtils.concat("XTR ", y7.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.J, indexOf, spannableStringBuilder.length(), 33);
            }
            this.K.setText(spannableStringBuilder);
            org.telegram.ui.Components.n6 n6Var = this.L;
            n6Var.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
            ae aeVar = this.M;
            if (j3 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            aeVar.setVisibility(i11);
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
            b bVar = this.f47215n0;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    public final void k0() {
        bi.q qVar = this.R;
        if (qVar.W && !qVar.N) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.G > currentTime) {
                this.f47199a0 = vc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, j0(this.G - currentTime)))).j();
            } else if (this.P < getMessagesController().starsRevenueWithdrawalMin) {
                vc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, 1))).j();
            } else {
                long j3 = this.P;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                t9 t9Var = new t9(this, j3, twoStepVerificationActivity, 10);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f31604b0 = t9Var;
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
