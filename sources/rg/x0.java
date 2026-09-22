package rg;

import ai.l6;
import ai.m5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ci.n6;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.x7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c80;
import org.telegram.ui.kx0;
import org.telegram.ui.lx0;
import org.telegram.ui.o81;
import org.telegram.ui.t5;
import w7.y5;
import yh.y3;
public final class x0 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final lx0 J;
    public int K;
    public int L;
    public int M;
    public x7 N;
    public final n2 f42856b;
    public final p0 f42857c;
    public final ArrayList d;
    public float e;
    public float f42858f;
    public boolean h;
    public final u0 f42859n;
    public final n6 f42860r;
    public int f42861s;
    public final FrameLayout v;
    public boolean f42862w;
    public final SvgHelper.SvgDrawable f42863x;
    public final int f42864y;

    public x0(Context context, int i10, f6 f6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, f6Var);
    }

    public final void A() {
        boolean z10 = this.F;
        p0 p0Var = this.f42857c;
        if (z10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f42864y;
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
        p0 p0Var = this.f42857c;
        p0Var.h = false;
        p0Var.d(true);
        A();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            u0 u0Var = this.f42859n;
            if (i10 >= u0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i10);
            if (w0Var.f42845a == this.G) {
                ViewGroup viewGroup = w0Var.f42848f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f42572b.canScrollVertically(-1);
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
                p0 p0Var = this.f42857c;
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
        x7 x7Var = new x7(this, getContext(), 7);
        this.N = x7Var;
        x7Var.setBackgroundColor(getThemedColor(j6.f19180h5));
        this.N.setTitleColor(getThemedColor(j6.G6));
        this.N.A(getThemedColor(j6.f19513z8), false);
        x7 x7Var2 = this.N;
        int i10 = j6.f19494y8;
        x7Var2.B(getThemedColor(i10), false);
        this.N.B(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new o81(this, 11));
        this.containerView.addView(this.N, y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((kx0) arrayList.get(i11)).f35278a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((kx0) arrayList.get(this.G)).f35278a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((kx0) arrayList.get(this.G)).f35278a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        u0 u0Var = this.f42859n;
        if (u0Var.getChildCount() > 0) {
            w0 w0Var = (w0) u0Var.getChildAt(0);
            ViewGroup viewGroup = w0Var.f42848f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(w0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(w0Var.getMeasuredWidth());
                this.f42862w = true;
                ofFloat.addUpdateListener(new l6(n0Var, 12));
                ofFloat.addListener(new cl0(20, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(qr.h);
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
            u0Var = this.f42859n;
            if (i13 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i13);
            int i14 = w0Var.f42845a;
            ViewGroup viewGroup = w0Var.f42848f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f42573c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (w0Var.f42845a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f42573c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f42858f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        n6 n6Var = this.f42860r;
        if (z11) {
            i10 = n6Var.getMeasuredWidth();
        } else {
            i10 = -n6Var.getMeasuredWidth();
        }
        n6Var.setTranslationX(i10 * this.f42858f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < u0Var.getChildCount(); i16++) {
                if (!((w0) u0Var.getChildAt(i16)).h) {
                    u0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            n6Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f42864y == 40) {
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
        kx0 kx0Var = (kx0) this.d.get(i10);
        int i12 = kx0Var.f35278a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f42572b.setOnScrollListener(new r0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new o1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new z1(context, this.f42863x, this.currentAccount, kx0Var.f35278a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f42572b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
    }

    public x0(n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public x0(n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    public x0(org.telegram.ui.ActionBar.n2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.lx0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: rg.x0.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.lx0):void");
    }

    public x0(n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, lx0 lx0Var, f6 f6Var) {
        super(1, context, f6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f42856b = n2Var;
        this.J = lx0Var;
        fixNavigationBar(getThemedColor(j6.f19180h5));
        this.f42864y = i11;
        this.E = z11;
        this.f42863x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        ai.f0 f0Var = new ai.f0(this, getContext(), 28);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new kx0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((kx0) this.d.get(i12)).f35278a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((kx0) this.d.get(i12));
            i12 = 0;
        }
        kx0 kx0Var = (kx0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        z0 z0Var = new z0(j6.ak, j6.bk, j6.ck, -1, null);
        z0Var.f42883o = 1.1f;
        z0Var.f42884p = 1.5f;
        z0Var.f42885q = -0.2f;
        z0Var.f42881m = true;
        n6 n6Var = new n6(this, getContext(), z0Var, 28);
        this.f42860r = n6Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(j6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, y5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f42764b;

            {
                this.f42764b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42764b.dismiss();
                        return;
                    default:
                        this.f42764b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(n6Var, y5.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.f42859n = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new c80(this, 2));
        this.G = i12;
        u0Var.setCurrentItem(i12);
        f0Var.addView(u0Var, y5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        f0Var.addView(frameLayout, y5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ra raVar = new ra(getContext(), u0Var, this.d.size());
        u0Var.b(new v0(this, raVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(f0Var);
        linearLayout.setOrientation(1);
        int i13 = j6.V8;
        int i14 = j6.P9;
        raVar.f27915n = i13;
        raVar.f27916r = i14;
        if (!z11) {
            linearLayout.addView(raVar, y5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), f6Var, true);
        this.f42857c = p0Var;
        p0Var.f42745r.setOnClickListener(new m5(this, n2Var, z11, kx0Var, 5));
        p0Var.e.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f42764b;

            {
                this.f42764b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42764b.dismiss();
                        return;
                    default:
                        this.f42764b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, y5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(j6.f19180h5));
        linearLayout.addView(frameLayout2, y5.q(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(y3.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        A();
        this.customViewGravity = 83;
        t5 t5Var = new t5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = t5Var;
        int i15 = this.backgroundPaddingLeft;
        t5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
