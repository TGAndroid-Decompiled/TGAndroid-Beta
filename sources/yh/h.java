package yh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import ci.ab;
import ci.p9;
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
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.fa1;
import org.telegram.ui.je;
import org.telegram.ui.me;
import org.telegram.ui.p81;
import org.telegram.ui.py0;
import org.telegram.ui.si1;
import org.telegram.ui.ta1;
import org.telegram.ui.to;
import org.telegram.ui.zd;
public final class h extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final je E;
    public final je F;
    public final je G;
    public final je H;
    public final je I;
    public final CharSequence J;
    public y7 K;
    public FrameLayout L;
    public FrameLayout M;
    public h91 N;
    public boolean O;
    public int P;
    public zd Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.p6 T;
    public org.telegram.ui.Components.p6 U;
    public ae V;
    public boolean W;
    public boolean X;
    public long Y;
    public fi.o Z;
    public final int f51366a;
    public bi.q f51367a0;
    public final long f51368b;
    public ci.d f51369b0;
    public final boolean f51370c;
    public final rq[] f51371c0;
    public ho d;
    public zd f51372d0;
    public e71 f51373e;
    public RelativeSizeSpan f51374e0;
    public bw0 f51375f;
    public org.telegram.ui.Components.p6 f51376f0;
    public org.telegram.ui.Components.p6 f51377g0;
    public ab h;
    public ci.d f51378h0;
    public double f51379i0;
    public rc f51380j0;
    public CharSequence f51381k0;
    public CharSequence f51382l0;
    public CharSequence m0;
    public int f51383n;
    public boolean f51384n0;
    public fa1 f51385o0;
    public fa1 f51386p0;
    public DecimalFormat f51387q0;
    public View f51388r;
    public SpannableStringBuilder f51389r0;
    public le.b f51390s;
    public final b f51391s0;
    public final int f51392t0;
    public TLRPC.TL_payments_starsRevenueStats v;
    public TLRPC.TL_starsRevenueStatus f51393w;
    public fa1 f51394x;
    public final je f51395y;

    public h(int i10, long j3) {
        super(null);
        boolean z10;
        String string;
        this.f51383n = -1;
        this.f51395y = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewAvailableBalance));
        this.E = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalBalance));
        this.F = je.a("XTR", LocaleController.getString(R.string.BotStarsOverviewTotalProceeds));
        this.G = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewAvailable));
        this.H = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewLastWithdrawal));
        this.I = je.a("TON", LocaleController.getString(R.string.BotMonetizationOverviewTotal));
        boolean z11 = false;
        this.W = false;
        this.X = true;
        this.f51371c0 = new rq[1];
        this.f51391s0 = new b(this, 0);
        this.f51392t0 = -1;
        this.f51366a = i10;
        this.f51368b = j3;
        if (j3 == getUserConfig().getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51370c = z10;
        if (i10 == 0) {
            p.g(this.currentAccount).r(j3);
            if (!z10) {
                p.g(this.currentAccount).l(j3);
            }
        } else if (i10 == 1) {
            p g10 = p.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : true);
        }
        if (z10) {
            string = LocaleController.formatPluralStringComma("SelfStarsWithdrawInfo", (int) getMessagesController().starsRevenueWithdrawalMin);
        } else {
            string = LocaleController.getString(R.string.BotStarsWithdrawInfo);
        }
        this.J = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new b(this, 2)), true);
    }

    public static void S(h hVar) {
        hVar.showDialog(me.I(hVar.getParentActivity(), hVar.resourceProvider, true));
    }

    public static void T(h hVar, h61 h61Var) {
        if (h61Var.H(s7.class)) {
            z7.n1(hVar.getParentActivity(), true, hVar.f51368b, hVar.currentAccount, (TL_stars.StarsTransaction) h61Var.G, hVar.getResourceProvider());
        } else if (h61Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            me.M(hVar.getParentActivity(), hVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) h61Var.G, hVar.f51368b, hVar.resourceProvider);
        } else if (h61Var.d == 2) {
            hVar.presentFragment(new ei.f4(hVar.f51368b));
        }
    }

    public static void U(h hVar) {
        long j3;
        b bVar = hVar.f51391s0;
        rc.e();
        TLRPC.TL_payments_starsRevenueStats h = p.g(hVar.currentAccount).h(hVar.f51368b, false);
        if (h == null) {
            j3 = 0;
        } else {
            j3 = h.status.available_balance.amount;
        }
        if (j3 < hVar.getMessagesController().starsRevenueWithdrawalMin) {
            hVar.X = true;
            hVar.Y = j3;
        } else {
            hVar.X = false;
            hVar.Y = hVar.getMessagesController().starsRevenueWithdrawalMin;
        }
        hVar.W = true;
        hVar.Z.setText(Long.toString(hVar.Y));
        fi.o oVar = hVar.Z;
        oVar.setSelection(oVar.getText().length());
        hVar.W = false;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        bVar.run();
    }

    public static void W(h hVar, Context context, View view) {
        if (view.isEnabled()) {
            ci.d dVar = hVar.f51369b0;
            if (!dVar.N) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(hVar.currentAccount).getInputPeer(hVar.f51368b);
                ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new si1(6, hVar, context));
            }
        }
    }

    public static void X(h hVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
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
                    ConnectionsManager.getInstance(hVar.currentAccount).sendRequest(new TL_account.getPassword(), new v9(hVar, twoStepVerificationActivity, z10, j3, 3), 8);
                    return;
                }
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                yc.b0(tL_error);
                return;
            }
            twoStepVerificationActivity.o0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i16 = org.telegram.ui.ActionBar.i6.f20935j5;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.WithdrawChannelAlertText)));
            linearLayout.addView(textView, w7.z5.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, i16, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
            TextView textView2 = new TextView(activity);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.q.m(R.string.EditAdminTransferAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            }
            LinearLayout e7 = org.telegram.messenger.q.e(activity, 0);
            linearLayout.addView(e7, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i16, false), mode));
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.q.m(R.string.EditAdminTransferAlertText2, textView3);
            if (LocaleController.isRTL) {
                e7.addView(textView3, w7.z5.n(-1, -2));
                i15 = 5;
                e7.addView(imageView2, w7.z5.q(-2, -2, 5));
            } else {
                i15 = 5;
                e7.addView(imageView2, w7.z5.n(-2, -2));
                e7.addView(textView3, w7.z5.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new c(hVar));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(activity);
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i15 = 3;
                }
                textView4.setGravity(i15 | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            twoStepVerificationActivity.showDialog(alertDialog$Builder.f20377a);
            return;
        }
        twoStepVerificationActivity.o0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            nf.f.u(hVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            hVar.X = true;
            nf.f.u(hVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void Y(h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i12;
        int i13;
        boolean z10;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        int i15;
        je jeVar = hVar.I;
        je jeVar2 = hVar.H;
        je jeVar3 = hVar.F;
        je jeVar4 = hVar.E;
        je jeVar5 = hVar.f51395y;
        long j3 = hVar.f51368b;
        je jeVar6 = hVar.G;
        boolean z11 = hVar.f51370c;
        int i16 = hVar.f51392t0;
        hVar.f51383n = -1;
        p g10 = p.g(hVar.currentAccount);
        int i17 = hVar.f51366a;
        if (i17 == 0) {
            arrayList.add(h61.h(2, i16, hVar.f51394x));
            arrayList.add(h61.B(-1, null));
            arrayList.add(h61.b(LocaleController.getString(R.string.BotStarsOverview)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                jeVar5.f37669a = false;
                jeVar5.f37674g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                jeVar5.f37675i = starsAmount;
                jeVar5.h = "XTR";
                jeVar5.f37673f = "USD";
                double d = hVar.f51379i0;
                z10 = z11;
                jeVar5.f37676j = (long) (starsAmount.amount * d * 100.0d);
                jeVar4.f37669a = false;
                jeVar4.f37674g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus2.current_balance;
                jeVar4.f37675i = starsAmount2;
                jeVar4.h = "XTR";
                jeVar4.f37676j = (long) (starsAmount2.amount * d * 100.0d);
                jeVar4.f37673f = "USD";
                jeVar3.f37669a = false;
                jeVar3.f37674g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.overall_revenue;
                jeVar3.f37675i = starsAmount3;
                jeVar3.h = "XTR";
                jeVar3.f37676j = (long) (starsAmount3.amount * d * 100.0d);
                jeVar3.f37673f = "USD";
                hVar.q0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = hVar.R;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            } else {
                z10 = z11;
            }
            arrayList.add(h61.v(jeVar5));
            arrayList.add(h61.v(jeVar4));
            arrayList.add(h61.v(jeVar3));
            if (z10) {
                i14 = R.string.SelfStarsOverviewInfo;
            } else {
                i14 = R.string.BotStarsOverviewInfo;
            }
            arrayList.add(h61.B(-2, LocaleController.getString(i14)));
            arrayList.add(h61.b(LocaleController.getString(R.string.BotStarsAvailableBalance)));
            arrayList.add(h61.j(1, hVar.Q));
            arrayList.add(h61.B(-3, hVar.J));
            if (!z10) {
                if (hVar.getMessagesController().starrefConnectAllowed) {
                    arrayList.add(ei.i.a(2, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, hVar.resourceProvider), R.drawable.filled_earn_stars, to.d0(LocaleController.getString(R.string.BotAffiliateProgramRowTitle)), LocaleController.getString(R.string.BotAffiliateProgramRowText)));
                    arrayList.add(h61.B(-4, null));
                }
                hVar.f51383n = arrayList.size();
                arrayList.add(h61.n(hVar.h, -2));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            if (!z11) {
                if (hVar.f51381k0 == null) {
                    hVar.f51381k0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.BotMonetizationInfo, 50), -1, 3, new b(hVar, 3), hVar.resourceProvider), true);
                }
                arrayList.add(h61.g(hVar.f51381k0));
            }
            if (hVar.f51385o0 == null && j10 != null) {
                fa1 d02 = ta1.d0(j10.top_hours_graph, LocaleController.getString(R.string.BotMonetizationGraphImpressions), 0, false);
                hVar.f51385o0 = d02;
                if (d02 != null) {
                    d02.f36255n = true;
                }
            }
            fa1 fa1Var = hVar.f51385o0;
            if (fa1Var != null && !fa1Var.f36253l) {
                arrayList.add(h61.h(5, i16, fa1Var));
                arrayList.add(h61.B(-1, null));
            }
            if (hVar.f51386p0 == null && j10 != null) {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i10 = 2;
                hVar.f51386p0 = ta1.d0(statsGraph, LocaleController.getString(R.string.BotMonetizationGraphRevenue), 2, false);
            } else {
                i10 = 2;
            }
            fa1 fa1Var2 = hVar.f51386p0;
            if (fa1Var2 != null && !fa1Var2.f36253l) {
                arrayList.add(h61.h(i10, i16, fa1Var2));
                arrayList.add(h61.B(-2, null));
            }
            if (!hVar.f51384n0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d10 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                jeVar6.d = j11;
                double d11 = j11 / 1.0E9d;
                long j12 = (long) (d11 * d10 * 100.0d);
                jeVar6.f37672e = j12;
                if (hVar.f51387q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    hVar.f51387q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    hVar.f51387q0.setMaximumFractionDigits(6);
                    hVar.f51387q0.setGroupingUsed(false);
                } else {
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = hVar.f51387q0;
                if (d11 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(me.K("TON " + hVar.f51387q0.format(d11), hVar.f51376f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(hVar.f51374e0, indexOf, spannableStringBuilder.length(), 33);
                }
                hVar.f51376f0.setText(spannableStringBuilder);
                org.telegram.ui.Components.p6 p6Var = hVar.f51377g0;
                p6Var.setText("≈" + BillingController.getInstance().formatCurrency(j12, "USD"));
                jeVar6.f37673f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                jeVar2.d = j13;
                jeVar2.f37672e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
                jeVar2.f37673f = "USD";
                jeVar.f37669a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                jeVar.d = j14;
                jeVar.f37672e = (long) ((j14 / 1.0E9d) * d10 * 100.0d);
                jeVar.f37673f = "USD";
                hVar.f51384n0 = true;
                ci.d dVar = hVar.f51378h0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (hVar.f51384n0) {
                arrayList.add(h61.b(LocaleController.getString(R.string.BotMonetizationOverview)));
                arrayList.add(h61.v(jeVar6));
                arrayList.add(h61.v(jeVar2));
                arrayList.add(h61.v(jeVar));
                if (hVar.f51382l0 == null) {
                    hVar.f51382l0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotMonetizationProceedsTONInfo), -1, 3, new qg.f2(hVar, R.string.BotMonetizationProceedsTONInfoLink, 3), hVar.resourceProvider), true);
                }
                arrayList.add(h61.B(-4, hVar.f51382l0));
            }
            arrayList.add(h61.b(LocaleController.getString(R.string.BotMonetizationBalance)));
            arrayList.add(h61.k(hVar.f51372d0));
            if (hVar.m0 == null) {
                if (MessagesController.getInstance(hVar.currentAccount).channelRevenueWithdrawalEnabled) {
                    i11 = R.string.BotMonetizationBalanceInfo;
                } else {
                    i11 = R.string.BotMonetizationBalanceInfoNotAvailable;
                }
                hVar.m0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new b(hVar, 4)), true);
            }
            arrayList.add(h61.B(-5, hVar.m0));
            hVar.f51383n = arrayList.size();
            arrayList.add(h61.n(hVar.h, -2));
        }
    }

    public static int i0(h hVar) {
        return hVar.currentAccount;
    }

    public static int j0(h hVar) {
        return hVar.currentAccount;
    }

    public static String r0(int i10) {
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
        FrameLayout frameLayout;
        y7 y7Var;
        int i10;
        int i11;
        View view;
        boolean z10;
        View view2;
        boolean z11 = this.f51370c;
        int i12 = this.f51366a;
        if (i12 != 1 && z11) {
            this.f51375f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            bw0 bw0Var = new bw0(context);
            this.f51375f = bw0Var;
            bw0Var.setCommonInsetsManagedExternally(true);
            this.f51375f.setGeometry(new k2.e(this, 26));
            bw0 bw0Var2 = this.f51375f;
            bw0Var2.getClass();
            this.h = new ab(bw0Var2, context, 24);
            frameLayout = this.f51375f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7));
        this.d = new ho(context, null, false, getResourceProvider());
        this.actionBar.setAllowOverlayTitle(false);
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f51368b));
        this.d.j(user, true);
        this.actionBar.setTitle(UserObject.getUserName(user));
        if (i12 == 0) {
            this.actionBar.setSubtitle(LocaleController.getString(R.string.BotStatsStars));
        } else {
            this.actionBar.setSubtitle(LocaleController.getString(R.string.BotStatsTON));
        }
        hg.c.u(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.i6.Oi;
        kVar.A(org.telegram.ui.ActionBar.i6.w0(null, i13, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, i13, false), true);
        this.actionBar.z(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21235z8, false), false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackground(null);
        if (i12 == 0 && this.f51375f != null) {
            y7Var = new y7(context, this.currentAccount, false, this.f51368b, getClassGuid(), getResourceProvider(), this.f51375f);
        } else {
            y7Var = null;
        }
        this.K = y7Var;
        if (i12 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            bm0 bm0Var = new bm0(context, this.resourceProvider, this.f51375f);
            this.N = bm0Var;
            bm0Var.setAdapter(new f(this, context, bm0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            this.M.addView(bm0Var.n(-2, true), w7.z5.e(-1, 48, 48));
            this.L.addView(bm0Var, w7.z5.c(-1.0f, -1));
        } else if (y7Var != null) {
            this.N = y7Var.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        zd zdVar = new zd(context, 8);
        this.Q = zdVar;
        zdVar.setOrientation(1);
        zd zdVar2 = this.Q;
        int i14 = org.telegram.ui.ActionBar.i6.f20827d6;
        zdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i14, getResourceProvider()));
        this.Q.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.T = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.Components.p6 p6Var2 = this.T;
        int i15 = org.telegram.ui.ActionBar.i6.G6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, getResourceProvider()));
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.U = p6Var3;
        p6Var3.setGravity(17);
        org.telegram.ui.Components.p6 p6Var4 = this.U;
        int i16 = org.telegram.ui.ActionBar.i6.f21214y6;
        p6Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, getResourceProvider()));
        this.U.setTextSize(AndroidUtilities.dp(14.0f));
        this.Q.addView(this.U, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, context, 1);
        this.V = aeVar;
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        this.V.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(context, 5);
        this.Z = oVar;
        oVar.setFocusable(false);
        this.Z.setTextColor(getThemedColor(i15));
        this.Z.setCursorSize(AndroidUtilities.dp(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        this.Z.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        this.Z.setHighlightColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21153uf));
        this.Z.setHandlesColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21170vf));
        fi.o oVar2 = this.Z;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        oVar2.setGravity(i10);
        this.Z.setOnFocusChangeListener(new ii.x5(this, 3));
        this.Z.addTextChangedListener(new ci.i2(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, w7.z5.o(-1, -2, 1.0f, 119));
        this.V.e(this.Z);
        this.V.addView(linearLayout, w7.z5.e(-1, -2, 48));
        this.Z.setOnEditorActionListener(new hg.t0(this, 2));
        this.Q.addView(this.V, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.q qVar = new bi.q(2, context, getResourceProvider(), true);
        qVar.setRoundRadius(24);
        this.f51367a0 = qVar;
        qVar.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        this.f51367a0.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll), false, true);
        this.f51367a0.setOnClickListener(new View.OnClickListener(this) {
            public final h f51240b;

            {
                this.f51240b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f51240b.t0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            h hVar = this.f51240b;
                            if (!hVar.f51378h0.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                rg.x xVar = new rg.x(17, hVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34583b0 = xVar;
                                hVar.f51378h0.setLoading(true);
                                twoStepVerificationActivity.s0(new d(hVar, twoStepVerificationActivity, 0));
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
        this.f51369b0 = dVar;
        dVar.setEnabled(true);
        this.f51369b0.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        this.f51369b0.setOnClickListener(new py0(29, this, context));
        this.R.addView(this.f51367a0, w7.z5.o(-1, 48, 1.0f, 119));
        if (!z11) {
            this.R.addView(new Space(context), w7.z5.o(8, 48, 0.0f, 119));
            this.R.addView(this.f51369b0, w7.z5.o(-1, 48, 1.0f, 119));
        }
        this.Q.addView(this.R, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar3 = new zd(context, 9);
        this.f51372d0 = zdVar3;
        zdVar3.setOrientation(1);
        this.f51372d0.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i14, this.resourceProvider));
        this.f51372d0.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var5 = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f51376f0 = p6Var5;
        p6Var5.setTypeface(AndroidUtilities.bold());
        this.f51376f0.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, this.resourceProvider));
        this.f51376f0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f51376f0.setGravity(17);
        this.f51374e0 = new RelativeSizeSpan(0.6770833f);
        this.f51372d0.addView(this.f51376f0, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var6 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f51377g0 = p6Var6;
        p6Var6.setGravity(17);
        this.f51377g0.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, this.resourceProvider));
        this.f51377g0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f51372d0.addView(this.f51377g0, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.f51378h0 = dVar2;
        dVar2.setEnabled(MessagesController.getInstance(this.currentAccount).channelRevenueWithdrawalEnabled);
        ci.d dVar3 = this.f51378h0;
        if (z11) {
            i11 = R.string.MonetizationSelfWithdraw;
        } else {
            i11 = R.string.MonetizationWithdraw;
        }
        dVar3.g(LocaleController.getString(i11), false, true);
        this.f51378h0.setVisibility(8);
        this.f51378h0.setOnClickListener(new View.OnClickListener(this) {
            public final h f51240b;

            {
                this.f51240b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f51240b.t0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            h hVar = this.f51240b;
                            if (!hVar.f51378h0.N) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                rg.x xVar = new rg.x(17, hVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34583b0 = xVar;
                                hVar.f51378h0.setLoading(true);
                                twoStepVerificationActivity.s0(new d(hVar, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f51372d0.addView(this.f51378h0, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        e71 e71Var = new e71(this, new hi.a(this, 21), new c(this), new c(this));
        this.f51373e = e71Var;
        e71Var.r1();
        e71 e71Var2 = this.f51373e;
        e71Var2.f26034f3.f32531r = false;
        e71Var2.setCaptureSectionsDecoratorAllowed(true);
        this.f51373e.setClipToPadding(false);
        this.f51373e.setOverScrollMode(0);
        bw0 bw0Var3 = this.f51375f;
        if (bw0Var3 != null) {
            e71 e71Var3 = this.f51373e;
            getParentActivity();
            gg.j0 j0Var = new gg.j0(5, bw0Var3, false);
            e71Var3.f26033e3 = j0Var;
            e71Var3.setLayoutManager(j0Var);
            this.f51375f.u(this.f51373e, new c(this));
            if (i12 == 1) {
                view2 = this.L;
            } else {
                view2 = this.K;
            }
            this.f51375f.x(view2, this.N, new c(this));
            FrameLayout frameLayout5 = this.M;
            this.f51375f.y(frameLayout5);
            frameLayout5.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout2.addView(this.f51373e, w7.z5.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().d(frameLayout2, this.f51373e, this.actionBar, this.resourceProvider);
        this.actionBar.setBackground(null);
        this.f51388r = new View(getParentActivity());
        if (this.f51375f != null) {
            view = this.M;
        } else {
            view = this.actionBar;
        }
        frameLayout2.addView(this.f51388r, frameLayout2.indexOfChild(view), w7.z5.e(-1, 0, 48));
        this.f51388r.setBackground(getBaseSimpleGlass().a(this.f51388r));
        le.b bVar = new le.b(0, new c(this), tr.h, 380L, false);
        this.f51390s = bVar;
        bw0 bw0Var4 = this.f51375f;
        if (bw0Var4 != null && bw0Var4.f25125e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, false);
        if (this.f51375f != null) {
            getBaseSimpleGlass().h = this.f51375f;
            y7 y7Var2 = this.K;
            if (y7Var2 != null) {
                y7Var2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().f15611i = new di.f(6, this, new di.e(1, frameLayout2));
            FrameLayout frameLayout6 = this.M;
            ch.d c10 = getBaseSimpleGlass().f15607c.c(frameLayout6, null, false);
            c10.w(eh.b.m(this.resourceProvider));
            c10.x(AndroidUtilities.dp(9.66f));
            c10.y(AndroidUtilities.dp(18.0f));
            frameLayout6.setBackground(c10);
        }
        AndroidUtilities.removeFromParent(this.d.f27278e);
        frameLayout2.addView(this.d.f27278e, w7.z5.e(42, 42, 53));
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.f51368b) {
            o0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        h91 h91Var = this.N;
        if (h91Var != null && h91Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void n0() {
        if (this.f51373e != null) {
            int i10 = 0;
            AndroidUtilities.setViewLayoutMargins(this.d.f27278e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.f11527b, AndroidUtilities.dp(6.0f), 0);
            e71 e71Var = this.f51373e;
            i0.b bVar = this.mSystemInsets;
            li.a.c(e71Var, bVar.f11527b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
            if (this.f51375f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f51373e.getLayoutParams();
                this.f51375f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                bw0 bw0Var = this.f51375f;
                bw0Var.B();
                bw0Var.requestLayout();
                bw0Var.invalidate();
            }
            if (this.f51388r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f11527b;
                if (this.f51375f != null) {
                    i10 = AndroidUtilities.dp(44.0f);
                }
                int i11 = currentActionBarHeight + i10;
                ViewGroup.LayoutParams layoutParams = this.f51388r.getLayoutParams();
                if (layoutParams.height != i11) {
                    layoutParams.height = i11;
                    this.f51388r.setLayoutParams(layoutParams);
                }
                s0();
            }
        }
    }

    public final void o0() {
        boolean z10;
        jg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z11 = false;
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(this.f51368b, false);
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2 = null;
        if (h == this.v) {
            if (h == null) {
                tL_starsRevenueStatus = null;
            } else {
                tL_starsRevenueStatus = h.status;
            }
            if (tL_starsRevenueStatus == this.f51393w) {
                return;
            }
        }
        this.v = h;
        if (h != null) {
            tL_starsRevenueStatus2 = h.status;
        }
        this.f51393w = tL_starsRevenueStatus2;
        if (h != null) {
            this.f51379i0 = h.usd_rate;
            fa1 d02 = ta1.d0(h.revenue_graph, LocaleController.getString(R.string.BotStarsChartRevenue), 2, false);
            this.f51394x = d02;
            if (d02 != null && (bVar = d02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f51394x.d.d.get(0) != null) {
                fa1 fa1Var = this.f51394x;
                fa1Var.h = true;
                ((jg.a) fa1Var.d.d.get(0)).f14120g = org.telegram.ui.ActionBar.i6.yj;
                this.f51394x.d.h = (float) ((1.0d / this.f51379i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            q0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            e71 e71Var = this.f51373e;
            if (e71Var != null) {
                bw0 bw0Var = this.f51375f;
                if (bw0Var != null && bw0Var.f25125e0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w61 w61Var = e71Var.f26034f3;
                if (bw0Var == null) {
                    z11 = true;
                }
                w61Var.N(z11);
                if (z10) {
                    this.f51375f.a();
                }
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        o0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.O = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        n0();
    }

    public final void p0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (parentActivity != null && currentUser != null) {
            long j10 = this.f51368b;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ai.d8(this, twoStepVerificationActivity, parentActivity, z10, j3));
        }
    }

    public final void q0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.T != null && this.U != null) {
            long j3 = (long) (this.f51379i0 * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z7.d1(false, TextUtils.concat("XTR ", z7.P0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
            }
            this.T.setText(spannableStringBuilder);
            org.telegram.ui.Components.p6 p6Var = this.U;
            p6Var.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
            ae aeVar = this.V;
            if (j3 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            aeVar.setVisibility(i11);
            if (this.X) {
                this.W = true;
                fi.o oVar = this.Z;
                long j10 = starsAmount.amount;
                this.Y = j10;
                oVar.setText(Long.toString(j10));
                fi.o oVar2 = this.Z;
                oVar2.setSelection(oVar2.getText().length());
                this.W = false;
                bi.q qVar = this.f51367a0;
                if (this.Y > 0) {
                    z10 = true;
                }
                qVar.setEnabled(z10);
            }
            this.P = i10;
            b bVar = this.f51391s0;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            bVar.run();
        }
    }

    public final void s0() {
        float f7;
        View view = this.f51388r;
        if (view == null) {
            return;
        }
        le.b bVar = this.f51390s;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.f15436e;
        }
        if (this.f51375f != null) {
            f10 = AndroidUtilities.dp(44.0f) * (-(1.0f - f7));
        }
        view.setTranslationY(f10);
    }

    public final void t0() {
        bi.q qVar = this.f51367a0;
        if (qVar.W && !qVar.N) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.P > currentTime) {
                this.f51380j0 = yc.a0(this).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, r0(this.P - currentTime)))).j();
            } else if (this.Y < getMessagesController().starsRevenueWithdrawalMin) {
                yc.a0(this).L(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) getMessagesController().starsRevenueWithdrawalMin, new Object[0]), new b(this, 1))).j();
            } else {
                long j3 = this.Y;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                p9 p9Var = new p9(this, j3, twoStepVerificationActivity, 10);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f34583b0 = p9Var;
                this.f51367a0.setLoading(true);
                twoStepVerificationActivity.s0(new d(this, twoStepVerificationActivity, 1));
            }
        }
    }
}
