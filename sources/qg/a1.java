package qg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.ld;
import bi.n7;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b80;
import org.telegram.ui.b91;
import org.telegram.ui.mx0;
import org.telegram.ui.nx0;
import org.telegram.ui.ou;
import org.telegram.ui.u5;
import w7.a6;
import xh.x3;
public final class a1 extends h3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final nx0 J;
    public int K;
    public int L;
    public int M;
    public y7 N;
    public final p2 f40660b;
    public final s0 f40661c;
    public final ArrayList d;
    public float e;
    public float f40662f;
    public boolean h;
    public final x0 f40663n;
    public final n7 f40664r;
    public int f40665s;
    public final FrameLayout v;
    public boolean f40666w;
    public final SvgHelper.SvgDrawable f40667x;
    public final int f40668y;

    public a1(Context context, int i10, f6 f6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, f6Var);
    }

    public final void A() {
        boolean z10 = this.F;
        s0 s0Var = this.f40661c;
        if (z10) {
            s0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f40668y;
            if (i10 == 4) {
                s0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                s0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                s0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                s0Var.setIcon(R.raw.unlock_icon);
            } else {
                s0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            s0Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
        }
    }

    public final void C() {
        this.F = true;
        s0 s0Var = this.f40661c;
        s0Var.h = false;
        s0Var.d(true);
        A();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            x0 x0Var = this.f40663n;
            if (i10 >= x0Var.getChildCount()) {
                return true;
            }
            z0 z0Var = (z0) x0Var.getChildAt(i10);
            if (z0Var.f40995a == this.G) {
                ViewGroup viewGroup = z0Var.f40998f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f40680b.canScrollVertically(-1);
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
                s0 s0Var = this.f40661c;
                if (isPremium) {
                    s0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                s0Var.h = false;
                s0Var.d(true);
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
        y7Var.setBackgroundColor(getThemedColor(j6.f17998h5));
        this.N.setTitleColor(getThemedColor(j6.G6));
        this.N.A(getThemedColor(j6.f18327z8), false);
        y7 y7Var2 = this.N;
        int i10 = j6.f18308y8;
        y7Var2.C(getThemedColor(i10), false);
        this.N.C(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new b91(this, 10));
        this.containerView.addView(this.N, a6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((mx0) arrayList.get(i11)).f35073a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((mx0) arrayList.get(this.G)).f35073a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((mx0) arrayList.get(this.G)).f35073a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        x0 x0Var = this.f40663n;
        if (x0Var.getChildCount() > 0) {
            z0 z0Var = (z0) x0Var.getChildAt(0);
            ViewGroup viewGroup = z0Var.f40998f;
            if (viewGroup instanceof p0) {
                p0 p0Var = (p0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z0Var.getMeasuredWidth(), 0.0f);
                p0Var.setOffset(z0Var.getMeasuredWidth());
                this.f40666w = true;
                ofFloat.addUpdateListener(new ai.m(p0Var, 11));
                ofFloat.addListener(new vv0(17, this, p0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(wr.h);
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
        x0 x0Var;
        int i10;
        float f7;
        View m10;
        View m11;
        int i11 = -1;
        boolean z10 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            x0Var = this.f40663n;
            if (i13 >= x0Var.getChildCount()) {
                break;
            }
            z0 z0Var = (z0) x0Var.getChildAt(i13);
            int i14 = z0Var.f40995a;
            ViewGroup viewGroup = z0Var.f40998f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f40681c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (z0Var.f40995a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f40681c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f40662f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        n7 n7Var = this.f40664r;
        if (z11) {
            i10 = n7Var.getMeasuredWidth();
        } else {
            i10 = -n7Var.getMeasuredWidth();
        }
        n7Var.setTranslationX(i10 * this.f40662f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < x0Var.getChildCount(); i16++) {
                if (!((z0) x0Var.getChildAt(i16)).h) {
                    x0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            n7Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f40668y == 40) {
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
        mx0 mx0Var = (mx0) this.d.get(i10);
        int i12 = mx0Var.f35073a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f40680b.setOnScrollListener(new u0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new q1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new p0(context, this.resourcesProvider);
            }
            return new a2(context, this.f40667x, this.currentAccount, mx0Var.f35073a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f40680b.setOnScrollListener(new u0(this, 0));
            return jVar;
        }
    }

    public a1(p2 p2Var, int i10, boolean z10) {
        this(p2Var, p2Var.getContext(), p2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public a1(p2 p2Var, Context context, int i10, int i11, boolean z10) {
        this(p2Var, context, i10, false, i11, z10, null);
    }

    public a1(org.telegram.ui.ActionBar.p2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.nx0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: qg.a1.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.nx0):void");
    }

    public a1(p2 p2Var, Context context, int i10, boolean z10, int i11, boolean z11, nx0 nx0Var, f6 f6Var) {
        super(1, context, f6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f40660b = p2Var;
        this.J = nx0Var;
        fixNavigationBar(getThemedColor(j6.f17998h5));
        this.f40668y = i11;
        this.E = z11;
        this.f40667x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        ld ldVar = new ld(this, getContext(), 26);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new mx0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((mx0) this.d.get(i12)).f35073a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((mx0) this.d.get(i12));
            i12 = 0;
        }
        mx0 mx0Var = (mx0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        c1 c1Var = new c1(j6.ak, j6.bk, j6.ck, -1, null);
        c1Var.f40698o = 1.1f;
        c1Var.f40699p = 1.5f;
        c1Var.f40700q = -0.2f;
        c1Var.f40696m = true;
        n7 n7Var = new n7(this, getContext(), c1Var, 28);
        this.f40664r = n7Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(j6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, a6.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final a1 f40920b;

            {
                this.f40920b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40920b.dismiss();
                        return;
                    default:
                        this.f40920b.dismiss();
                        return;
                }
            }
        });
        ldVar.addView(n7Var, a6.t(-1, -2, 1, 0, 16, 0, 0));
        x0 x0Var = new x0(this, getContext());
        this.f40663n = x0Var;
        x0Var.setOverScrollMode(2);
        x0Var.setOffscreenPageLimit(0);
        x0Var.setAdapter(new b80(this, 2));
        this.G = i12;
        x0Var.setCurrentItem(i12);
        ldVar.addView(x0Var, a6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        ldVar.addView(frameLayout, a6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ra raVar = new ra(getContext(), x0Var, this.d.size());
        x0Var.b(new y0(this, raVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(ldVar);
        linearLayout.setOrientation(1);
        int i13 = j6.V8;
        int i14 = j6.P9;
        raVar.f26644n = i13;
        raVar.f26645r = i14;
        if (!z11) {
            linearLayout.addView(raVar, a6.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        s0 s0Var = new s0(getContext(), f6Var, true);
        this.f40661c = s0Var;
        s0Var.f40904r.setOnClickListener(new ou(this, p2Var, z11, mx0Var, 4));
        s0Var.e.setOnClickListener(new View.OnClickListener(this) {
            public final a1 f40920b;

            {
                this.f40920b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40920b.dismiss();
                        return;
                    default:
                        this.f40920b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(s0Var, a6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(j6.f17998h5));
        linearLayout.addView(frameLayout2, a6.q(-1, 68, 80));
        if (i11 == 40) {
            s0Var.b(x3.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            s0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        A();
        this.customViewGravity = 83;
        u5 u5Var = new u5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = u5Var;
        int i15 = this.backgroundPaddingLeft;
        u5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
