package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import dg.n;
import eg.h0;
import eg.q2;
import f2.l;
import f2.o0;
import fg.i;
import gg.v2;
import java.util.ArrayList;
import k7.b6;
import lh.b0;
import lh.ia;
import lh.ja;
import lh.q;
import lh.t7;
import lh.u9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import org.telegram.ui.m20;
import org.telegram.ui.n20;
import org.telegram.ui.nw0;
import org.telegram.ui.pb1;
import ph.d4;
import ph.q9;
import rh.d3;
public final class g extends n20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout M;
    public i N;
    public ia O;
    public nw0 P;
    public final boolean Q = B0();
    public LinearLayout R;
    public SpannableStringBuilder S;
    public k6 T;
    public k6 U;
    public q9 V;
    public ph.d W;
    public pb1 X;
    public ph.d Y;
    public ph.d Z;
    public boolean f43100a0;
    public boolean f43101b0;
    public d f43102c0;

    public g() {
        this.J = true;
    }

    public static boolean B0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void x0(g gVar, int i10) {
        i51 G;
        d dVar = gVar.f43102c0;
        if (dVar != null && (G = dVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                gVar.f43102c0.N(true);
            } else if (i11 == -2) {
                t7.y(gVar.currentAccount, true).u();
                v2.e0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
            } else if (i11 == -3) {
                t7.y(gVar.currentAccount, true).W();
                gVar.f43102c0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                    org.telegram.ui.c.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new d3(gVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void C0(ArrayList arrayList, w51 w51Var) {
        if (getParentActivity() == null) {
            return;
        }
        t7 y10 = t7.y(this.currentAccount, true);
        i51 i51Var = new i51(-2);
        i51Var.f25579c = (h0) super.r0(getParentActivity());
        arrayList.add(i51Var);
        arrayList.add(i51.k(this.R));
        boolean z4 = this.Q;
        if (z4) {
            ai.A(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y10.O(0);
        this.f43100a0 = O;
        if (O) {
            if (!z4) {
                arrayList.add(i51.B(null));
            }
            arrayList.add(i51.p(this.O, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(i51.l(this.P));
    }

    public final void D0() {
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z4 = true;
        t7 y10 = t7.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.S);
        spannableStringBuilder.append((CharSequence) ja.J0(p10, 0.66f, ' '));
        this.T.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            k6 k6Var = this.U;
            k6Var.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.U.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = b0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        z4 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false;
        if (this.f43101b0 == z4) {
            return;
        }
        this.f43101b0 = z4;
        this.V.setVisibility(0);
        this.X.setVisibility(0);
        ViewPropertyAnimator animate = this.V.animate();
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).withEndAction(new Runnable(this) {
            public final g f43093b;

            {
                this.f43093b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z4) {
                            this.f43093b.V.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z4) {
                            this.f43093b.X.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.X.animate();
        if (!z4) {
            f11 = 0.0f;
        }
        animate2.alpha(f11).withEndAction(new Runnable(this) {
            public final g f43093b;

            {
                this.f43093b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z4) {
                            this.f43093b.V.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z4) {
                            this.f43093b.X.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final View createView(Context context) {
        float f10;
        int i10;
        this.D = false;
        this.B = AndroidUtilities.dp(238.0f);
        this.O = new ia(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.P = new nw0(this, context, 7);
        super.createView(context);
        e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        frameLayout.setClickable(true);
        i iVar = new i(context, 1, 4);
        this.N = iVar;
        fg.a aVar = iVar.f6156b;
        aVar.f6135w = j6.fk;
        aVar.f6136x = j6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.e);
        this.M.addView(this.N, b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new e2.f(context, 11)), true), this.M, null);
        this.f36318c.setOverScrollMode(2);
        l lVar = new l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.f36318c.setItemAnimator(lVar);
        this.f36318c.setOnItemClickListener(new n(this, 17));
        this.f36322s.addView(new s00(getParentActivity()), b6.c(-1.0f, -1));
        t7.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        this.R.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        k6 k6Var = new k6(getParentActivity(), false, true, false);
        this.T = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(AndroidUtilities.dp(32.0f));
        this.T.setGravity(17);
        this.T.setTextColor(j6.v0(j6.G6, this.resourceProvider));
        this.S = new SpannableStringBuilder("S");
        lq lqVar = new lq(R.drawable.mini_gram_72, 0);
        lqVar.setOverrideColor(-13397548);
        lqVar.setScale(0.5f, 0.5f);
        float f11 = 0.0f;
        lqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.S.setSpan(lqVar, 0, 1, 33);
        this.R.addView(this.T, b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        k6 k6Var2 = new k6(getParentActivity(), false, false, false);
        this.U = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.U.setGravity(17);
        this.U.setText(LocaleController.getString(R.string.YourTonBalance));
        this.U.setTextColor(j6.v0(j6.f20273z6, this.resourceProvider));
        this.R.addView(this.U, b6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        q9 q9Var = new q9(this, getParentActivity(), 1);
        this.V = q9Var;
        frameLayout2.addView(q9Var);
        boolean z4 = this.Q;
        if (z4) {
            ph.d dVar = new ph.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.W = dVar;
            dVar.e();
            this.W.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.W.setOnClickListener(new View.OnClickListener(this) {
                public final g f43091b;

                {
                    this.f43091b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ze.d.u(this.f43091b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            ze.d.u(this.f43091b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            g gVar = this.f43091b;
                            gVar.presentFragment(new q(1, gVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.V.addView(this.W, b6.e(-1, 48, 119));
        }
        pb1 pb1Var = new pb1(this, getParentActivity(), 18);
        this.X = pb1Var;
        frameLayout2.addView(pb1Var);
        ph.d dVar2 = new ph.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new lq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.Y.g(spannableStringBuilder, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final g f43091b;

            {
                this.f43091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ze.d.u(this.f43091b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        ze.d.u(this.f43091b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f43091b;
                        gVar.presentFragment(new q(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z4) {
            this.X.addView(this.Y, b6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ph.d dVar3 = new ph.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.Z = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new lq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.Z.g(spannableStringBuilder2, false, true);
        this.Z.setOnClickListener(new View.OnClickListener(this) {
            public final g f43091b;

            {
                this.f43091b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ze.d.u(this.f43091b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        ze.d.u(this.f43091b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f43091b;
                        gVar.presentFragment(new q(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.X.addView(this.Z, b6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.R.addView(frameLayout2, b6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.V.animate().cancel();
        this.X.animate().cancel();
        pb1 pb1Var2 = this.X;
        if (this.f43101b0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        pb1Var2.setAlpha(f10);
        q9 q9Var2 = this.V;
        if (!this.f43101b0) {
            f11 = 1.0f;
        }
        q9Var2.setAlpha(f11);
        pb1 pb1Var3 = this.X;
        int i11 = 8;
        if (this.f43101b0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        pb1Var3.setVisibility(i10);
        q9 q9Var3 = this.V;
        if (!this.f43101b0) {
            i11 = 0;
        }
        q9Var3.setVisibility(i11);
        D0();
        d dVar4 = this.f43102c0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            d dVar = this.f43102c0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.K == 0 && this.L < 0) {
                this.L = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            t7 y10 = t7.y(this.currentAccount, true);
            if (this.f43100a0 != y10.O(0)) {
                this.f43100a0 = y10.O(0);
                s0();
                d dVar2 = this.f43102c0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.K == 0 && this.L < 0) {
                    this.L = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.f43102c0;
            if (dVar3 != null) {
                dVar3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            D0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            D0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return j6.w0(null, j6.f19970i5, false);
    }

    @Override
    public final o0 n0() {
        d dVar = new d(this, this.f36318c, getParentActivity(), this.currentAccount, this.classGuid, new d4(this, 5), getResourceProvider());
        this.f43102c0 = dVar;
        dVar.f30148r = false;
        return dVar;
    }

    @Override
    public final m20 o0() {
        return new u9(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t7.y(this.currentAccount, true).T(true);
        t7.y(this.currentAccount, true).S();
        t7.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final q2 p0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        ia iaVar = this.O;
        boolean z4 = false;
        if (iaVar != null && (iaVar.getParent() instanceof View)) {
            if (this.f36318c.getHeight() - ((View) this.O.getParent()).getBottom() >= 0) {
                z4 = true;
            }
        }
        return !z4;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }
}
