package rg;

import ai.k6;
import ai.l5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ci.m6;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.y7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a80;
import org.telegram.ui.ex0;
import org.telegram.ui.fx0;
import org.telegram.ui.h81;
import org.telegram.ui.v5;
import w7.y5;
import yh.x3;
public final class x0 extends g3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final fx0 J;
    public int K;
    public int L;
    public int M;
    public y7 N;
    public final o2 f42866b;
    public final p0 f42867c;
    public final ArrayList d;
    public float e;
    public float f42868f;
    public boolean h;
    public final u0 f42869n;
    public final m6 f42870r;
    public int f42871s;
    public final FrameLayout v;
    public boolean f42872w;
    public final SvgHelper.SvgDrawable f42873x;
    public final int f42874y;

    public x0(Context context, int i10, e6 e6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, e6Var);
    }

    public final void A() {
        boolean z10 = this.F;
        p0 p0Var = this.f42867c;
        if (z10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f42874y;
            if (i10 == 4) {
                p0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                p0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                p0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                p0Var.setIcon(R.raw.unlock_icon);
            } else {
                p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            p0Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
        }
    }

    public final void B() {
        this.F = true;
        p0 p0Var = this.f42867c;
        p0Var.h = false;
        p0Var.d(true);
        A();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            u0 u0Var = this.f42869n;
            if (i10 >= u0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i10);
            if (w0Var.f42855a == this.G) {
                ViewGroup viewGroup = w0Var.f42858f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f42582b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.billingProductDetailsUpdated && i10 != NotificationCenter.premiumPromoUpdated) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                boolean isPremium = UserConfig.getInstance(this.currentAccount).isPremium();
                p0 p0Var = this.f42867c;
                if (isPremium) {
                    p0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                p0Var.h = false;
                p0Var.d(true);
                return;
            }
            return;
        }
        A();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        y7 y7Var = new y7(this, getContext(), 7);
        this.N = y7Var;
        y7Var.setBackgroundColor(getThemedColor(i6.f19128h5));
        this.N.setTitleColor(getThemedColor(i6.G6));
        this.N.B(getThemedColor(i6.f19463z8), false);
        y7 y7Var2 = this.N;
        int i10 = i6.f19444y8;
        y7Var2.E(getThemedColor(i10), false);
        this.N.E(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new h81(this, 10));
        this.containerView.addView(this.N, y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((ex0) arrayList.get(i11)).f33341a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((ex0) arrayList.get(this.G)).f33341a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((ex0) arrayList.get(this.G)).f33341a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        u0 u0Var = this.f42869n;
        if (u0Var.getChildCount() > 0) {
            w0 w0Var = (w0) u0Var.getChildAt(0);
            ViewGroup viewGroup = w0Var.f42858f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(w0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(w0Var.getMeasuredWidth());
                this.f42872w = true;
                ofFloat.addUpdateListener(new k6(n0Var, 12));
                ofFloat.addListener(new cl0(20, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(sr.h);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public final void y() {
        u0 u0Var;
        int i10;
        float f7;
        View m10;
        View m11;
        int i11 = -1;
        boolean z10 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            u0Var = this.f42869n;
            if (i13 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i13);
            int i14 = w0Var.f42855a;
            ViewGroup viewGroup = w0Var.f42858f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f42583c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (w0Var.f42855a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f42583c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.L;
        if (i11 >= 0) {
            float f10 = 1.0f - this.I;
            i15 = Math.min(i15, (int) e2.z(1.0f, f10, i15, i11 * f10));
        }
        if (i12 >= 0) {
            float f11 = this.I;
            i15 = Math.min(i15, (int) e2.z(1.0f, f11, this.L, i12 * f11));
        }
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(1.0f - this.f42868f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        m6 m6Var = this.f42870r;
        if (z11) {
            i10 = m6Var.getMeasuredWidth();
        } else {
            i10 = -m6Var.getMeasuredWidth();
        }
        m6Var.setTranslationX(i10 * this.f42868f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < u0Var.getChildCount(); i16++) {
                if (!((w0) u0Var.getChildAt(i16)).h) {
                    u0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            m6Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f42874y == 40) {
                f7 = 5.0f;
            } else {
                f7 = 30.0f;
            }
            if (i17 < AndroidUtilities.dp(f7)) {
                z10 = true;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.N, z10, 1.0f, true);
        }
    }

    public final ViewGroup z(Context context, int i10) {
        int i11;
        ex0 ex0Var = (ex0) this.d.get(i10);
        int i12 = ex0Var.f33341a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f42582b.setOnScrollListener(new r0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new o1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new z1(context, this.f42873x, this.currentAccount, ex0Var.f33341a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f42582b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
    }

    public x0(o2 o2Var, int i10, boolean z10) {
        this(o2Var, o2Var.getContext(), o2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public x0(o2 o2Var, Context context, int i10, int i11, boolean z10) {
        this(o2Var, context, i10, false, i11, z10, null);
    }

    public x0(org.telegram.ui.ActionBar.o2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.fx0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: rg.x0.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.fx0):void");
    }

    public x0(o2 o2Var, Context context, int i10, boolean z10, int i11, boolean z11, fx0 fx0Var, e6 e6Var) {
        super(1, context, e6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f42866b = o2Var;
        this.J = fx0Var;
        fixNavigationBar(getThemedColor(i6.f19128h5));
        this.f42874y = i11;
        this.E = z11;
        this.f42873x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        ai.f0 f0Var = new ai.f0(this, getContext(), 28);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new ex0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((ex0) this.d.get(i12)).f33341a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((ex0) this.d.get(i12));
            i12 = 0;
        }
        ex0 ex0Var = (ex0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        z0 z0Var = new z0(i6.ak, i6.bk, i6.ck, -1, null);
        z0Var.f42893o = 1.1f;
        z0Var.f42894p = 1.5f;
        z0Var.f42895q = -0.2f;
        z0Var.f42891m = true;
        m6 m6Var = new m6(this, getContext(), z0Var, 28);
        this.f42870r = m6Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(i6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, y5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f42774b;

            {
                this.f42774b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42774b.dismiss();
                        return;
                    default:
                        this.f42774b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(m6Var, y5.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.f42869n = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new a80(this, 2));
        this.G = i12;
        u0Var.setCurrentItem(i12);
        f0Var.addView(u0Var, y5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        f0Var.addView(frameLayout, y5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        sa saVar = new sa(getContext(), u0Var, this.d.size());
        u0Var.b(new v0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(f0Var);
        linearLayout.setOrientation(1);
        int i13 = i6.V8;
        int i14 = i6.P9;
        saVar.f28216n = i13;
        saVar.f28217r = i14;
        if (!z11) {
            linearLayout.addView(saVar, y5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), e6Var, true);
        this.f42867c = p0Var;
        p0Var.f42755r.setOnClickListener(new l5(this, o2Var, z11, ex0Var, 5));
        p0Var.e.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f42774b;

            {
                this.f42774b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42774b.dismiss();
                        return;
                    default:
                        this.f42774b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, y5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(i6.f19128h5));
        linearLayout.addView(frameLayout2, y5.q(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(x3.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        A();
        this.customViewGravity = 83;
        v5 v5Var = new v5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = v5Var;
        int i15 = this.backgroundPaddingLeft;
        v5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
