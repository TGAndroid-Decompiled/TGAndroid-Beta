package sg;

import ai.l7;
import ai.o5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ci.u4;
import ci.y3;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.zr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b31;
import org.telegram.ui.m70;
import org.telegram.ui.rw0;
import org.telegram.ui.sw0;
import w7.z5;
public final class y0 extends h3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final sw0 J;
    public int K;
    public int L;
    public int M;
    public x7 N;
    public final o2 f46946b;
    public final p0 f46947c;
    public final ArrayList d;
    public float e;
    public float f46948f;
    public boolean h;
    public final v0 f46949n;
    public final t0 f46950r;
    public int f46951s;
    public final FrameLayout v;
    public boolean f46952w;
    public final SvgHelper.SvgDrawable f46953x;
    public final int f46954y;

    public y0(Context context, int i10, g6 g6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, g6Var);
    }

    public final void B() {
        v0 v0Var;
        int i10;
        float f7;
        View m10;
        View m11;
        int i11 = -1;
        boolean z10 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            v0Var = this.f46949n;
            if (i13 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i13);
            int i14 = x0Var.f46933a;
            ViewGroup viewGroup = x0Var.f46936f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f46641c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (x0Var.f46933a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f46641c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.L;
        if (i11 >= 0) {
            float f10 = 1.0f - this.I;
            i15 = Math.min(i15, (int) k3.y(1.0f, f10, i15, i11 * f10));
        }
        if (i12 >= 0) {
            float f11 = this.I;
            i15 = Math.min(i15, (int) k3.y(1.0f, f11, this.L, i12 * f11));
        }
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(1.0f - this.f46948f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        t0 t0Var = this.f46950r;
        if (z11) {
            i10 = t0Var.getMeasuredWidth();
        } else {
            i10 = -t0Var.getMeasuredWidth();
        }
        t0Var.setTranslationX(i10 * this.f46948f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < v0Var.getChildCount(); i16++) {
                if (!((x0) v0Var.getChildAt(i16)).h) {
                    v0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            t0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f46954y == 40) {
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

    public final ViewGroup C(Context context, int i10) {
        int i11;
        rw0 rw0Var = (rw0) this.d.get(i10);
        int i12 = rw0Var.f41244a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f46640b.setOnScrollListener(new r0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new q1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new a2(context, this.f46953x, this.currentAccount, rw0Var.f41244a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f46640b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
    }

    public final void D() {
        boolean z10 = this.F;
        p0 p0Var = this.f46947c;
        if (z10) {
            p0Var.f46802f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f46954y;
            if (i10 == 4) {
                p0Var.f46802f.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                p0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                p0Var.f46802f.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                p0Var.setIcon(R.raw.unlock_icon);
            } else {
                p0Var.f46802f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            p0Var.f46802f.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
        }
    }

    public final void E() {
        this.F = true;
        p0 p0Var = this.f46947c;
        p0Var.f46804r = false;
        p0Var.d(true);
        D();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.f46949n;
            if (i10 >= v0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i10);
            if (x0Var.f46933a == this.G) {
                ViewGroup viewGroup = x0Var.f46936f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f46640b.canScrollVertically(-1);
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
                p0 p0Var = this.f46947c;
                if (isPremium) {
                    p0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                p0Var.f46804r = false;
                p0Var.d(true);
                return;
            }
            return;
        }
        D();
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
        r6.i(k6.f21255h5, x7Var, this.resourcesProvider);
        r6.m(this.N, 5, k6.G6, this.resourcesProvider);
        r6.m(this.N, 3, k6.f21591z8, this.resourcesProvider);
        x7 x7Var2 = this.N;
        int i10 = k6.f21574y8;
        r6.m(x7Var2, 1, i10, this.resourcesProvider);
        r6.b(this.N, i10, this.resourcesProvider, true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new b31(this, 14));
        this.containerView.addView(this.N, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((rw0) arrayList.get(i11)).f41244a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((rw0) arrayList.get(this.G)).f41244a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((rw0) arrayList.get(this.G)).f41244a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.f46949n;
        if (v0Var.getChildCount() > 0) {
            x0 x0Var = (x0) v0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f46936f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(x0Var.getMeasuredWidth());
                this.f46952w = true;
                ofFloat.addUpdateListener(new u4(n0Var, 13));
                ofFloat.addListener(new pl0(21, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(zr.h);
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

    public y0(o2 o2Var, int i10, boolean z10) {
        this(o2Var, o2Var.getContext(), o2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(o2 o2Var, Context context, int i10, int i11, boolean z10) {
        this(o2Var, context, i10, false, i11, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.o2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.sw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: sg.y0.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.sw0):void");
    }

    public y0(o2 o2Var, Context context, int i10, boolean z10, int i11, boolean z11, sw0 sw0Var, g6 g6Var) {
        super(1, context, g6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f46946b = o2Var;
        this.J = sw0Var;
        fixNavigationBarKey(k6.f21255h5);
        this.f46954y = i11;
        this.E = z11;
        this.f46953x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        rg.y1 y1Var = new rg.y1(this, getContext(), 4);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new rw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((rw0) this.d.get(i12)).f41244a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((rw0) this.d.get(i12));
            i12 = 0;
        }
        rw0 rw0Var = (rw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        a1 a1Var = new a1(k6.ak, k6.bk, k6.ck, -1, null);
        a1Var.f46626o = 1.1f;
        a1Var.f46627p = 1.5f;
        a1Var.f46628q = -0.2f;
        a1Var.f46624m = true;
        t0 t0Var = new t0(this, getContext(), a1Var);
        this.f46950r = t0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int o10 = i0.a.o(-1, 40);
        int o11 = i0.a.o(-1, 100);
        imageView.setBackground(k6.j0(dp, dp, dp, dp, o10, o11, o11));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f46820b;

            {
                this.f46820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46820b.dismiss();
                        return;
                    default:
                        this.f46820b.dismiss();
                        return;
                }
            }
        });
        y1Var.addView(t0Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.f46949n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new m70(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        y1Var.addView(v0Var, z5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        y1Var.addView(frameLayout, z5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        qa qaVar = new qa(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, qaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(y1Var);
        linearLayout.setOrientation(1);
        int i13 = k6.V8;
        int i14 = k6.P9;
        qaVar.f29870n = i13;
        qaVar.f29871r = i14;
        if (!z11) {
            linearLayout.addView(qaVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), g6Var, true);
        this.f46947c = p0Var;
        p0Var.v.setOnClickListener(new y3(this, o2Var, z11, rw0Var, 5));
        p0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f46820b;

            {
                this.f46820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46820b.dismiss();
                        return;
                    default:
                        this.f46820b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.f21255h5, frameLayout2, g6Var);
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(l7.H2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        D();
        this.customViewGravity = 83;
        o5 o5Var = new o5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = o5Var;
        int i15 = this.backgroundPaddingLeft;
        o5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
