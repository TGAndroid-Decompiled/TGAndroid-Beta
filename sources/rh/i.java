package rh;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.br;
import org.telegram.ui.e61;
import org.telegram.ui.ie;
import org.telegram.ui.le;
import org.telegram.ui.oo;
import org.telegram.ui.qv0;
import org.telegram.ui.s61;
import org.telegram.ui.sl0;
import org.telegram.ui.yd;
import org.telegram.ui.z01;
import org.telegram.ui.zd;
import w7.b9;
public final class i extends org.telegram.ui.ActionBar.k2 implements vs {
    public final ie D;
    public final ie E;
    public final ie F;
    public final ie G;
    public final ie H;
    public final ie I;
    public final SpannableStringBuilder J;
    public g8 K;
    public FrameLayout L;
    public FrameLayout M;
    public x71 N;
    public boolean O;
    public int P;
    public jg.z2 Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.f6 T;
    public org.telegram.ui.Components.f6 U;
    public yd V;
    public boolean W;
    public boolean X;
    public long Y;
    public zd Z;
    public final int f47047a;
    public ph.i f47048a0;
    public final long f47049b;
    public vh.d f47050b0;
    public final boolean f47051c;
    public final dq[] f47052c0;
    public sn d;
    public jg.z2 f47053d0;
    public v51 e;
    public RelativeSizeSpan f47054e0;
    public lu0 f47055f;
    public org.telegram.ui.Components.f6 f47056f0;
    public org.telegram.ui.Components.f6 f47057g0;
    public bi.t0 h;
    public vh.d f47058h0;
    public double f47059i0;
    public wb f47060j0;
    public SpannableStringBuilder f47061k0;
    public SpannableStringBuilder f47062l0;
    public SpannableStringBuilder m0;
    public int f47063n;
    public boolean f47064n0;
    public e61 f47065o0;
    public e61 f47066p0;
    public DecimalFormat f47067q0;
    public View f47068r;
    public SpannableStringBuilder f47069r0;
    public fe.b f47070s;
    public final b f47071s0;
    public final int f47072t0;
    public TLRPC.TL_payments_starsRevenueStats f47073w;
    public TLRPC.TL_starsRevenueStatus f47074x;
    public e61 f47075y;

    public i(int i10, long j10) {
        super(null);
        boolean z10;
        String L0;
        this.f47063n = -1;
        this.D = ie.a("XTR", dd.L0(2131752961, null));
        this.E = ie.a("XTR", dd.L0(2131752959, null));
        this.F = ie.a("XTR", dd.L0(2131752958, null));
        this.G = ie.a("TON", dd.L0(2131753033, null));
        this.H = ie.a("TON", dd.L0(2131753032, null));
        this.I = ie.a("TON", dd.L0(2131753031, null));
        boolean z11 = false;
        this.W = false;
        this.X = true;
        this.f47052c0 = new dq[1];
        this.f47071s0 = new b(this, 0);
        this.f47072t0 = -1;
        this.f47047a = i10;
        this.f47049b = j10;
        if (j10 == getUserConfig().e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47051c = z10;
        if (i10 == 0) {
            r.g(this.currentAccount).r(j10);
            if (!z10) {
                r.g(this.currentAccount).l(j10);
            }
        } else if (i10 == 1) {
            r g10 = r.g(this.currentAccount);
            Long l4 = (Long) g10.d.get(Long.valueOf(j10));
            g10.j(j10, (l4 == null || System.currentTimeMillis() - l4.longValue() > 30000) ? true : z11);
        }
        if (z10) {
            L0 = dd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().S5);
        } else {
            L0 = dd.L0(2131752957, null);
        }
        this.J = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(L0, new b(this, 2)), true);
    }

    public static void Z(i iVar) {
        iVar.showDialog(le.I(iVar.getParentActivity(), iVar.resourceProvider, true));
    }

    public static void a0(i iVar, b51 b51Var) {
        if (b51Var.H(b8.class)) {
            h8.k1(iVar.getParentActivity(), true, iVar.f47049b, iVar.currentAccount, (TL_stars.StarsTransaction) b51Var.G, iVar.getResourceProvider());
        } else if (b51Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            le.M(iVar.getParentActivity(), iVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) b51Var.G, iVar.f47049b, iVar.resourceProvider);
        } else if (b51Var.d == 2) {
            iVar.presentFragment(new xh.z2(iVar.f47049b));
        }
    }

    public static void b0(i iVar) {
        long j10;
        b bVar = iVar.f47071s0;
        wb.e();
        TLRPC.TL_payments_starsRevenueStats h = r.g(iVar.currentAccount).h(iVar.f47049b, false);
        if (h == null) {
            j10 = 0;
        } else {
            j10 = h.status.available_balance.amount;
        }
        if (j10 < iVar.getMessagesController().S5) {
            iVar.X = true;
            iVar.Y = j10;
        } else {
            iVar.X = false;
            iVar.Y = iVar.getMessagesController().S5;
        }
        iVar.W = true;
        iVar.Z.setText(Long.toString(iVar.Y));
        zd zdVar = iVar.Z;
        zdVar.setSelection(zdVar.getText().length());
        iVar.W = false;
        org.telegram.messenger.i0.r(bVar);
        bVar.run();
    }

    public static void c0(i iVar, Context context, View view) {
        if (view.isEnabled()) {
            vh.d dVar = iVar.f47050b0;
            if (!dVar.Q) {
                dVar.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = wp.r1(iVar.currentAccount).i1(iVar.f47049b);
                ConnectionsManager.getInstance(iVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new sl0(23, iVar, context));
            }
        }
    }

    public static void d0(i iVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        int L2;
        int i14;
        int i15;
        int i16;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(iVar.currentAccount).sendRequest(new TL_account.getPassword(), new s70(iVar, twoStepVerificationActivity, z10, j10), 8);
                    return;
                }
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                cc.d0(tL_error);
                return;
            }
            twoStepVerificationActivity.t0();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String L0 = dd.L0(2131751298, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(activity);
            int i17 = org.telegram.ui.ActionBar.t6.f21038j5;
            org.telegram.ui.ActionBar.a7.V(textView, i17, null);
            textView.setTextSize(1, 16.0f);
            if (dd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(org.telegram.messenger.i0.W2(dd.L0(2131742889, null)));
            linearLayout.addView(textView, w7.b6.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231624);
            if (dd.X) {
                i11 = org.telegram.messenger.i0.L(11.0f);
            } else {
                i11 = 0;
            }
            int L3 = org.telegram.messenger.i0.L(9.0f);
            if (dd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(11.0f);
            }
            imageView.setPadding(i11, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.t(imageView, i17, null, mode);
            TextView textView2 = new TextView(activity);
            org.telegram.ui.ActionBar.a7.V(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            if (dd.X) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            textView2.setText(org.telegram.messenger.i0.W2(dd.L0(2131751301, null)));
            if (dd.X) {
                linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                linearLayout2.addView(textView2, w7.b6.o(-1, -2));
            }
            LinearLayout e = org.telegram.messenger.m5.e(activity, 0);
            linearLayout.addView(e, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(2131231624);
            if (dd.X) {
                i13 = org.telegram.messenger.i0.L(11.0f);
            } else {
                i13 = 0;
            }
            int L4 = org.telegram.messenger.i0.L(9.0f);
            if (dd.X) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.i0.L(11.0f);
            }
            imageView2.setPadding(i13, L4, L2, 0);
            org.telegram.ui.ActionBar.a7.t(imageView2, i17, null, mode);
            TextView textView3 = new TextView(activity);
            org.telegram.ui.ActionBar.a7.V(textView3, i17, null);
            textView3.setTextSize(1, 16.0f);
            if (dd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            textView3.setText(org.telegram.messenger.i0.W2(dd.L0(2131751300, null)));
            if (dd.X) {
                e.addView(textView3, w7.b6.o(-1, -2));
                i15 = 5;
                e.addView(imageView2, w7.b6.r(-2, -2, 5));
            } else {
                i15 = 5;
                e.addView(imageView2, w7.b6.o(-2, -2));
                e.addView(textView3, w7.b6.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(dd.L0(2131751292, null), new c(iVar));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(activity);
                org.telegram.ui.ActionBar.a7.V(textView4, i17, null);
                textView4.setTextSize(1, 16.0f);
                if (dd.X) {
                    i16 = i15;
                } else {
                    i16 = 3;
                }
                org.telegram.messenger.m5.l(textView4, i16 | 48, null, 2131751299);
                linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(dd.L0(2131747847, null), null);
            }
            twoStepVerificationActivity.showDialog(x1Var);
            return;
        }
        twoStepVerificationActivity.t0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            gf.f.t(iVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            iVar.X = true;
            gf.f.t(iVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url);
        }
    }

    public static void e0(i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j10;
        int i12;
        int i13;
        boolean z10;
        int i14;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i15;
        ie ieVar = iVar.I;
        ie ieVar2 = iVar.H;
        ie ieVar3 = iVar.F;
        ie ieVar4 = iVar.E;
        ie ieVar5 = iVar.D;
        long j11 = iVar.f47049b;
        ie ieVar6 = iVar.G;
        boolean z11 = iVar.f47051c;
        int i16 = iVar.f47072t0;
        iVar.f47063n = -1;
        r g10 = r.g(iVar.currentAccount);
        int i17 = iVar.f47047a;
        if (i17 == 0) {
            arrayList.add(b51.h(2, i16, iVar.f47075y));
            arrayList.add(b51.B(-1, null));
            arrayList.add(b51.b(dd.L0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j11, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                ieVar5.f38009a = false;
                ieVar5.f38013g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                ieVar5.f38014i = starsAmount3;
                ieVar5.h = "XTR";
                ieVar5.f38012f = "USD";
                z10 = z11;
                double d = iVar.f47059i0;
                ieVar5.f38015j = (long) (starsAmount3.amount * d * 100.0d);
                ieVar4.f38009a = false;
                ieVar4.f38013g = true;
                ieVar4.f38014i = tL_starsRevenueStatus2.current_balance;
                ieVar4.h = "XTR";
                ieVar4.f38015j = (long) (starsAmount.amount * d * 100.0d);
                ieVar4.f38012f = "USD";
                ieVar3.f38009a = false;
                ieVar3.f38013g = true;
                ieVar3.f38014i = tL_starsRevenueStatus2.overall_revenue;
                ieVar3.h = "XTR";
                ieVar3.f38015j = (long) (starsAmount2.amount * d * 100.0d);
                ieVar3.f38012f = "USD";
                iVar.v0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = iVar.R;
                if (h.status.withdrawal_enabled) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                linearLayout.setVisibility(i15);
            } else {
                z10 = z11;
            }
            arrayList.add(b51.v(ieVar5));
            arrayList.add(b51.v(ieVar4));
            arrayList.add(b51.v(ieVar3));
            if (z10) {
                i14 = 2131745662;
            } else {
                i14 = 2131752960;
            }
            arrayList.add(b51.B(-2, dd.L0(i14, null)));
            arrayList.add(b51.b(dd.L0(2131752972, null)));
            arrayList.add(b51.j(1, iVar.Q));
            arrayList.add(b51.B(-3, iVar.J));
            if (!z10) {
                if (iVar.getMessagesController().f19146h6) {
                    arrayList.add(xh.e.i(2, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ik, iVar.resourceProvider), oo.i0(dd.L0(2131753145, null)), dd.L0(2131753146, null)));
                    arrayList.add(b51.B(-4, null));
                }
                iVar.f47063n = arrayList.size();
                arrayList.add(b51.n(iVar.h, -2));
            }
        } else if (i17 == 1) {
            TLRPC.TL_payments_starsRevenueStats j12 = g10.j(j11, true);
            if (!z11) {
                if (iVar.f47061k0 == null) {
                    iVar.f47061k0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(dd.a0(null, null, 2131753045, 50), -1, 3, new b(iVar, 3), iVar.resourceProvider), true);
                }
                arrayList.add(b51.g(iVar.f47061k0));
            }
            if (iVar.f47065o0 == null && j12 != null) {
                e61 i02 = s61.i0(j12.top_hours_graph, dd.L0(2131753047, null), 0, false);
                iVar.f47065o0 = i02;
                if (i02 != null) {
                    i02.f36758n = true;
                }
            }
            e61 e61Var = iVar.f47065o0;
            if (e61Var != null && !e61Var.f36756l) {
                arrayList.add(b51.h(5, i16, e61Var));
                arrayList.add(b51.B(-1, null));
            }
            if (iVar.f47066p0 == null && j12 != null) {
                TL_stats.StatsGraph statsGraph = j12.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j12.usd_rate);
                }
                i10 = 2;
                iVar.f47066p0 = s61.i0(statsGraph, dd.L0(2131753046, null), 2, false);
            } else {
                i10 = 2;
            }
            e61 e61Var2 = iVar.f47066p0;
            if (e61Var2 != null && !e61Var2.f36756l) {
                arrayList.add(b51.h(i10, i16, e61Var2));
                arrayList.add(b51.B(-2, null));
            }
            if (!iVar.f47064n0 && j12 != null && (tL_starsRevenueStatus = j12.status) != null) {
                double d10 = j12.usd_rate;
                long j13 = tL_starsRevenueStatus.available_balance.amount;
                ieVar6.d = j13;
                double d11 = j13 / 1.0E9d;
                ieVar6.e = (long) (d11 * d10 * 100.0d);
                if (iVar.f47067q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    iVar.f47067q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i12 = 6;
                    iVar.f47067q0.setMaximumFractionDigits(6);
                    iVar.f47067q0.setGroupingUsed(false);
                } else {
                    i12 = 6;
                }
                DecimalFormat decimalFormat2 = iVar.f47067q0;
                if (d11 > 1.5d) {
                    i12 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i12);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(le.K("TON " + iVar.f47067q0.format(d11), iVar.f47056f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(iVar.f47054e0, indexOf, spannableStringBuilder.length(), 33);
                }
                iVar.f47056f0.setText(spannableStringBuilder);
                iVar.f47057g0.setText("≈" + org.telegram.messenger.u1.i().f(j10, "USD"));
                ieVar6.f38012f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j12.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                ieVar2.d = j14;
                ieVar2.e = (long) ((j14 / 1.0E9d) * d10 * 100.0d);
                ieVar2.f38012f = "USD";
                ieVar.f38009a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                ieVar.d = j15;
                ieVar.e = (long) ((j15 / 1.0E9d) * d10 * 100.0d);
                ieVar.f38012f = "USD";
                iVar.f47064n0 = true;
                vh.d dVar = iVar.f47058h0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar.setVisibility(i13);
            }
            if (iVar.f47064n0) {
                arrayList.add(b51.b(dd.L0(2131753034, null)));
                arrayList.add(b51.v(ieVar6));
                arrayList.add(b51.v(ieVar2));
                arrayList.add(b51.v(ieVar));
                if (iVar.f47062l0 == null) {
                    iVar.f47062l0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(dd.L0(2131753030, null), -1, 3, new b(iVar, 4), iVar.resourceProvider), true);
                }
                arrayList.add(b51.B(-4, iVar.f47062l0));
            }
            arrayList.add(b51.b(dd.L0(2131753051, null)));
            arrayList.add(b51.k(iVar.f47053d0));
            if (iVar.m0 == null) {
                if (wp.r1(iVar.currentAccount).J5) {
                    i11 = 2131753050;
                } else {
                    i11 = 2131753048;
                }
                iVar.m0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(dd.L0(i11, null), -1, 3, new b(iVar, 5), null), true);
            }
            arrayList.add(b51.B(-5, iVar.m0));
            iVar.f47063n = arrayList.size();
            arrayList.add(b51.n(iVar.h, -2));
        }
    }

    public static int n0(i iVar) {
        return iVar.currentAccount;
    }

    public static int o0(i iVar) {
        return iVar.currentAccount;
    }

    public static int r0(i iVar) {
        return iVar.currentAccount;
    }

    public static String w0(int i10) {
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
        Locale locale = Locale.ENGLISH;
        return dd.a0(null, null, 2131747338, String.format(locale, "%02d", Integer.valueOf(i11)), String.format(locale, "%02d", Integer.valueOf(i13)), String.format(locale, "%02d", Integer.valueOf(i15)));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        g8 g8Var;
        int i10;
        int i11;
        View view;
        boolean z10;
        View view2;
        boolean z11 = this.f47051c;
        int i12 = this.f47047a;
        if (i12 != 1 && z11) {
            this.f47055f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            lu0 lu0Var = new lu0(context);
            this.f47055f = lu0Var;
            lu0Var.setCommonInsetsManagedExternally(true);
            this.f47055f.setGeometry(new n2.u(this, 21));
            lu0 lu0Var2 = this.f47055f;
            lu0Var2.getClass();
            this.h = new bi.t0(lu0Var2, context, 20);
            frameLayout = this.f47055f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        this.d = new sn(context, null, false, getResourceProvider());
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f47049b));
        this.d.k(Z1, true);
        this.simpleActionBar.setTitle(i20.p(Z1));
        if (i12 == 0) {
            this.simpleActionBar.setSubtitle(dd.L0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(dd.L0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new z01(this, 15));
        this.simpleActionBar.setBackground(null);
        if (i12 == 0 && this.f47055f != null) {
            g8Var = new g8(context, this.currentAccount, false, this.f47049b, getClassGuid(), getResourceProvider(), this.f47055f);
        } else {
            g8Var = null;
        }
        this.K = g8Var;
        if (i12 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            wk0 wk0Var = new wk0(context, this.resourceProvider, this.f47055f);
            this.N = wk0Var;
            wk0Var.setAdapter(new g(this, context, wk0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            this.M.addView(wk0Var.n(-2, true), w7.b6.e(-1, 48, 48));
            this.L.addView(wk0Var, w7.b6.c(-1.0f, -1));
        } else if (g8Var != null) {
            this.N = g8Var.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        jg.z2 z2Var = new jg.z2(context, 12);
        this.Q = z2Var;
        z2Var.setOrientation(1);
        jg.z2 z2Var2 = this.Q;
        int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i13, z2Var2, getResourceProvider());
        this.Q.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.T = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.Components.f6 f6Var2 = this.T;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i14, getResourceProvider());
        this.T.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.U = f6Var3;
        f6Var3.setGravity(17);
        org.telegram.ui.Components.f6 f6Var4 = this.U;
        int i15 = org.telegram.ui.ActionBar.t6.f21312y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var4, i15, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.Q.addView(this.U, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        yd ydVar = new yd(this, context, 1);
        this.V = ydVar;
        ydVar.setText(dd.L0(2131752953, null));
        this.V.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        zd zdVar = new zd(context, 4);
        this.Z = zdVar;
        zdVar.setFocusable(false);
        org.telegram.ui.ActionBar.a7.V(this.Z, i14, getResourceProvider());
        this.Z.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        this.Z.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.D(this.Z, org.telegram.ui.ActionBar.t6.f21029ig, getResourceProvider());
        org.telegram.ui.ActionBar.a7.z(this.Z, org.telegram.ui.ActionBar.t6.f21049jg, getResourceProvider());
        zd zdVar2 = this.Z;
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        zdVar2.setGravity(i10);
        this.Z.setOnFocusChangeListener(new bi.g6(this, 3));
        this.Z.addTextChangedListener(new ag.a1(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232749);
        linearLayout.addView(imageView, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, w7.b6.p(-1, -2, 1.0f, 119));
        this.V.e(this.Z);
        this.V.addView(linearLayout, w7.b6.e(-1, -2, 48));
        this.Z.setOnEditorActionListener(new ag.r1(this, 4));
        this.Q.addView(this.V, w7.b6.t(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        linearLayout2.setOrientation(0);
        ph.i iVar = new ph.i(1, context, getResourceProvider(), true);
        iVar.setRoundRadius(24);
        this.f47048a0 = iVar;
        iVar.setEnabled(wp.r1(this.currentAccount).J5);
        this.f47048a0.i(dd.L0(2131752969, null), false, true);
        this.f47048a0.setOnClickListener(new View.OnClickListener(this) {
            public final i f46893b;

            {
                this.f46893b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f46893b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            i iVar2 = this.f46893b;
                            if (!iVar2.f47058h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                org.telegram.ui.web.k0 k0Var = new org.telegram.ui.web.k0(13, iVar2, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34136b0 = k0Var;
                                iVar2.f47058h0.setLoading(true);
                                twoStepVerificationActivity.x0(new d(iVar2, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f47050b0 = dVar;
        dVar.setEnabled(true);
        this.f47050b0.i(dd.L0(2131748389, null), false, true);
        this.f47050b0.setOnClickListener(new qv0(24, this, context));
        this.R.addView(this.f47048a0, w7.b6.p(-1, 48, 1.0f, 119));
        if (!z11) {
            this.R.addView(new Space(context), w7.b6.p(8, 48, 0.0f, 119));
            this.R.addView(this.f47050b0, w7.b6.p(-1, 48, 1.0f, 119));
        }
        this.Q.addView(this.R, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        jg.z2 z2Var3 = new jg.z2(context, 13);
        this.f47053d0 = z2Var3;
        z2Var3.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(i13, this.f47053d0, this.resourceProvider);
        this.f47053d0.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var5 = new org.telegram.ui.Components.f6(context, false, true, true);
        this.f47056f0 = f6Var5;
        f6Var5.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(this.f47056f0, i14, this.resourceProvider);
        this.f47056f0.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.f47056f0.setGravity(17);
        this.f47054e0 = new RelativeSizeSpan(0.6770833f);
        this.f47053d0.addView(this.f47056f0, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var6 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.f47057g0 = f6Var6;
        f6Var6.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(this.f47057g0, i15, this.resourceProvider);
        this.f47057g0.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.f47053d0.addView(this.f47057g0, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f47058h0 = dVar2;
        dVar2.setEnabled(wp.r1(this.currentAccount).J5);
        vh.d dVar3 = this.f47058h0;
        if (z11) {
            i11 = 2131748390;
        } else {
            i11 = 2131748366;
        }
        dVar3.i(dd.L0(i11, null), false, true);
        this.f47058h0.setVisibility(8);
        this.f47058h0.setOnClickListener(new View.OnClickListener(this) {
            public final i f46893b;

            {
                this.f46893b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        this.f46893b.y0();
                        return;
                    default:
                        if (view3.isEnabled()) {
                            i iVar2 = this.f46893b;
                            if (!iVar2.f47058h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                org.telegram.ui.web.k0 k0Var = new org.telegram.ui.web.k0(13, iVar2, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.f34136b0 = k0Var;
                                iVar2.f47058h0.setLoading(true);
                                twoStepVerificationActivity.x0(new d(iVar2, twoStepVerificationActivity, 0));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f47053d0.addView(this.f47058h0, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        v51 v51Var = new v51(this, new qh.d(this, 1), new c(this), new org.telegram.utils.twidget.t(this, 25));
        this.e = v51Var;
        v51Var.r1();
        v51 v51Var2 = this.e;
        v51Var2.f31183f3.f29638r = false;
        v51Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        lu0 lu0Var3 = this.f47055f;
        if (lu0Var3 != null) {
            v51 v51Var3 = this.e;
            getParentActivity();
            br brVar = new br((Object) lu0Var3, 4);
            v51Var3.f31182e3 = brVar;
            v51Var3.setLayoutManager(brVar);
            this.f47055f.u(this.e, new c(this));
            if (i12 == 1) {
                view2 = this.L;
            } else {
                view2 = this.K;
            }
            this.f47055f.x(view2, this.N, new c(this));
            FrameLayout frameLayout5 = this.M;
            this.f47055f.y(frameLayout5);
            frameLayout5.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout2.addView(this.e, w7.b6.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f47068r = new View(getParentActivity());
        if (this.f47055f != null) {
            view = this.M;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.f47068r, frameLayout2.indexOfChild(view), w7.b6.e(-1, 0, 48));
        this.f47068r.setBackground(getBaseSimpleGlass().a(this.f47068r));
        fe.b bVar = new fe.b(0, new c(this), gr.h, 380L, false);
        this.f47070s = bVar;
        lu0 lu0Var4 = this.f47055f;
        if (lu0Var4 != null && lu0Var4.f28276e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, false);
        if (this.f47055f != null) {
            getBaseSimpleGlass().f6606m = this.f47055f;
            g8 g8Var2 = this.K;
            if (g8Var2 != null) {
                g8Var2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            getBaseSimpleGlass().f6607n = new ei.a(7, this, new org.telegram.ui.ActionBar.y1(1, frameLayout2));
            FrameLayout frameLayout6 = this.M;
            vg.f c10 = getBaseSimpleGlass().f6599c.c(frameLayout6, null, false);
            c10.o(b9.m(this.resourceProvider));
            c10.p(org.telegram.messenger.i0.L(9.66f));
            c10.q(org.telegram.messenger.i0.L(18.0f));
            frameLayout6.setBackground(c10);
        }
        org.telegram.messenger.i0.E2(this.d.e);
        frameLayout2.addView(this.d.e, w7.b6.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.C3 && ((Long) objArr[0]).longValue() == this.f47049b) {
            t0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)) <= 0.721f) {
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
        x71 x71Var = this.N;
        if (x71Var != null && x71Var.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onFragmentCreate() {
        at.f(this.currentAccount).c(this, at.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.O = true;
        at.f(this.currentAccount).n(this, at.C3);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        s0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            sn snVar = this.d;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Cj, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dj, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s0() {
        if (this.e != null) {
            int i10 = 0;
            org.telegram.messenger.i0.A3(this.d.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.f7767b, org.telegram.messenger.i0.L(6.0f), 0);
            v51 v51Var = this.e;
            i0.c cVar = this.mSystemInsets;
            ei.b.e(v51Var, cVar.f7767b, cVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
            if (this.f47055f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                this.f47055f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                lu0 lu0Var = this.f47055f;
                lu0Var.B();
                lu0Var.requestLayout();
                lu0Var.invalidate();
            }
            if (this.f47068r != null) {
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7767b;
                if (this.f47055f != null) {
                    i10 = org.telegram.messenger.i0.L(44.0f);
                }
                int i11 = currentActionBarHeight + i10;
                ViewGroup.LayoutParams layoutParams = this.f47068r.getLayoutParams();
                if (layoutParams.height != i11) {
                    layoutParams.height = i11;
                    this.f47068r.setLayoutParams(layoutParams);
                }
                x0();
            }
        }
    }

    public final void t0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10;
        cg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        boolean z11 = false;
        TLRPC.TL_payments_starsRevenueStats h = r.g(this.currentAccount).h(this.f47049b, false);
        if (h == this.f47073w) {
            if (h == null) {
                tL_starsRevenueStatus2 = null;
            } else {
                tL_starsRevenueStatus2 = h.status;
            }
            if (tL_starsRevenueStatus2 == this.f47074x) {
                return;
            }
        }
        this.f47073w = h;
        if (h == null) {
            tL_starsRevenueStatus = null;
        } else {
            tL_starsRevenueStatus = h.status;
        }
        this.f47074x = tL_starsRevenueStatus;
        if (h != null) {
            this.f47059i0 = h.usd_rate;
            e61 i02 = s61.i0(h.revenue_graph, dd.L0(2131752963, null), 2, false);
            this.f47075y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f47075y.d.d.get(0) != null) {
                e61 e61Var = this.f47075y;
                e61Var.h = true;
                ((cg.a) e61Var.d.d.get(0)).f4162g = org.telegram.ui.ActionBar.t6.mk;
                this.f47075y.d.h = (float) ((1.0d / this.f47059i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            v0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            v51 v51Var = this.e;
            if (v51Var != null) {
                lu0 lu0Var = this.f47055f;
                if (lu0Var != null && lu0Var.f28276e0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q51 q51Var = v51Var.f31183f3;
                if (lu0Var == null) {
                    z11 = true;
                }
                q51Var.O(z11);
                if (z10) {
                    this.f47055f.a();
                }
            }
        }
    }

    public final void u0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f7 = e20.i(this.currentAccount).f();
        if (parentActivity != null && f7 != null) {
            long j11 = this.f47049b;
            if (z10) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = wp.r1(this.currentAccount).i1(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = wp.r1(this.currentAccount).i1(j11);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new e(this, twoStepVerificationActivity, parentActivity, z10, j10));
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i10) {
        int i11;
        if (this.T != null && this.U != null) {
            long j10 = (long) (this.f47059i0 * starsAmount.amount * 100.0d);
            boolean z10 = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h8.a1(false, TextUtils.concat("XTR ", h8.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
            }
            this.T.setText(spannableStringBuilder);
            this.U.setText("≈" + org.telegram.messenger.u1.i().f(j10, "USD"));
            yd ydVar = this.V;
            if (j10 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            ydVar.setVisibility(i11);
            if (this.X) {
                this.W = true;
                zd zdVar = this.Z;
                long j11 = starsAmount.amount;
                this.Y = j11;
                zdVar.setText(Long.toString(j11));
                zd zdVar2 = this.Z;
                zdVar2.setSelection(zdVar2.getText().length());
                this.W = false;
                ph.i iVar = this.f47048a0;
                if (this.Y > 0) {
                    z10 = true;
                }
                iVar.setEnabled(z10);
            }
            this.P = i10;
            b bVar = this.f47071s0;
            org.telegram.messenger.i0.r(bVar);
            bVar.run();
        }
    }

    public final void x0() {
        float f7;
        View view = this.f47068r;
        if (view == null) {
            return;
        }
        fe.b bVar = this.f47070s;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        if (this.f47055f != null) {
            f10 = org.telegram.messenger.i0.L(44.0f) * (-(1.0f - f7));
        }
        view.setTranslationY(f10);
    }

    public final void y0() {
        ph.i iVar = this.f47048a0;
        if (iVar.f51070c0 && !iVar.Q) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.P > currentTime) {
                this.f47060j0 = cc.a0(this).Q(2131624289, 36, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131752952, w0(this.P - currentTime)))).j();
            } else if (this.Y < getMessagesController().S5) {
                cc.a0(this).M(getParentActivity().getResources().getDrawable(2131232749).mutate(), org.telegram.messenger.i0.T2(dd.G((int) getMessagesController().S5, "BotStarsWithdrawMinLimit", new Object[0]), new b(this, 1))).j();
            } else {
                long j10 = this.Y;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                org.telegram.messenger.voip.d0 d0Var = new org.telegram.messenger.voip.d0(this, j10, twoStepVerificationActivity, 7);
                twoStepVerificationActivity.Z = 1;
                twoStepVerificationActivity.f34136b0 = d0Var;
                this.f47048a0.setLoading(true);
                twoStepVerificationActivity.x0(new d(this, twoStepVerificationActivity, 1));
            }
        }
    }
}
