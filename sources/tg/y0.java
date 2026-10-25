package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.h7;
import bi.j5;
import di.u4;
import di.y3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.o70;
import org.telegram.ui.p11;
import org.telegram.ui.ww0;
import org.telegram.ui.xw0;
public final class y0 extends k3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final xw0 J;
    public int K;
    public int L;
    public int M;
    public b8 N;
    public final r2 f49124b;
    public final p0 f49125c;
    public final ArrayList d;
    public float e;
    public float f49126f;
    public boolean h;
    public final v0 f49127n;
    public final t0 f49128r;
    public int f49129s;
    public final FrameLayout v;
    public boolean f49130w;
    public final SvgHelper.SvgDrawable f49131x;
    public final int f49132y;

    public y0(Context context, int i10, u6 u6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, u6Var);
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
            v0Var = this.f49127n;
            if (i13 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i13);
            int i14 = x0Var.f49111a;
            ViewGroup viewGroup = x0Var.f49114f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f48817c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (x0Var.f49111a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f48817c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.L;
        if (i11 >= 0) {
            float f10 = 1.0f - this.I;
            i15 = Math.min(i15, (int) c3.h0.z(1.0f, f10, i15, i11 * f10));
        }
        if (i12 >= 0) {
            float f11 = this.I;
            i15 = Math.min(i15, (int) c3.h0.z(1.0f, f11, this.L, i12 * f11));
        }
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(1.0f - this.f49126f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        t0 t0Var = this.f49128r;
        if (z11) {
            i10 = t0Var.getMeasuredWidth();
        } else {
            i10 = -t0Var.getMeasuredWidth();
        }
        t0Var.setTranslationX(i10 * this.f49126f);
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
            if (this.f49132y == 40) {
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
        ww0 ww0Var = (ww0) this.d.get(i10);
        int i12 = ww0Var.f45563a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f48816b.setOnScrollListener(new r0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new q1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new a2(context, this.f49131x, this.currentAccount, ww0Var.f45563a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f48816b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
    }

    public final void D() {
        boolean z10 = this.F;
        p0 p0Var = this.f49125c;
        if (z10) {
            p0Var.f48978f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f49132y;
            if (i10 == 4) {
                p0Var.f48978f.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                p0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                p0Var.f48978f.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                p0Var.setIcon(R.raw.unlock_icon);
            } else {
                p0Var.f48978f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            p0Var.f48978f.setText(PremiumPreviewFragment.p0(this.currentAccount, this.J));
        }
    }

    public final void F() {
        this.F = true;
        p0 p0Var = this.f49125c;
        p0Var.f48980r = false;
        p0Var.d(true);
        D();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.f49127n;
            if (i10 >= v0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i10);
            if (x0Var.f49111a == this.G) {
                ViewGroup viewGroup = x0Var.f49114f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f48816b.canScrollVertically(-1);
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
                p0 p0Var = this.f49125c;
                if (isPremium) {
                    p0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                p0Var.f48980r = false;
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
        b8 b8Var = new b8(this, getContext(), 7);
        this.N = b8Var;
        f7.i(y6.f23425h5, b8Var, this.resourcesProvider);
        f7.m(this.N, 5, y6.G6, this.resourcesProvider);
        f7.m(this.N, 3, y6.f23767z8, this.resourcesProvider);
        b8 b8Var2 = this.N;
        int i10 = y6.f23748y8;
        f7.m(b8Var2, 1, i10, this.resourcesProvider);
        f7.b(this.N, i10, this.resourcesProvider, true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new p11(this, 17));
        this.containerView.addView(this.N, gb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((ww0) arrayList.get(i11)).f45563a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((ww0) arrayList.get(this.G)).f45563a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((ww0) arrayList.get(this.G)).f45563a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.f49127n;
        if (v0Var.getChildCount() > 0) {
            x0 x0Var = (x0) v0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f49114f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(x0Var.getMeasuredWidth());
                this.f49130w = true;
                ofFloat.addUpdateListener(new u4(n0Var, 13));
                ofFloat.addListener(new ll0(20, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(ds.h);
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

    public y0(r2 r2Var, int i10, boolean z10) {
        this(r2Var, r2Var.getContext(), r2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(r2 r2Var, Context context, int i10, int i11, boolean z10) {
        this(r2Var, context, i10, false, i11, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.r2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.xw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: tg.y0.<init>(org.telegram.ui.ActionBar.r2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.xw0):void");
    }

    public y0(r2 r2Var, Context context, int i10, boolean z10, int i11, boolean z11, xw0 xw0Var, u6 u6Var) {
        super(1, context, u6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f49124b = r2Var;
        this.J = xw0Var;
        fixNavigationBarKey(y6.f23425h5);
        this.f49132y = i11;
        this.E = z11;
        this.f49131x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        p5 p5Var = new p5(this, getContext(), 6);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.o0(i10, arrayList);
        } else {
            PremiumPreviewFragment.n0(i10, arrayList, false);
            PremiumPreviewFragment.n0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new ww0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((ww0) this.d.get(i12)).f45563a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((ww0) this.d.get(i12));
            i12 = 0;
        }
        ww0 ww0Var = (ww0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        a1 a1Var = new a1(y6.ak, y6.bk, y6.ck, -1, null);
        a1Var.f48802o = 1.1f;
        a1Var.f48803p = 1.5f;
        a1Var.f48804q = -0.2f;
        a1Var.f48800m = true;
        t0 t0Var = new t0(this, getContext(), a1Var);
        this.f49128r = t0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int o10 = i0.a.o(-1, 40);
        int o11 = i0.a.o(-1, 100);
        imageView.setBackground(y6.j0(dp, dp, dp, dp, o10, o11, o11));
        frameLayout.addView(imageView, gb1.i(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f48996b;

            {
                this.f48996b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48996b.dismiss();
                        return;
                    default:
                        this.f48996b.dismiss();
                        return;
                }
            }
        });
        p5Var.addView(t0Var, gb1.x(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.f49127n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new o70(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        p5Var.addView(v0Var, gb1.h(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        p5Var.addView(frameLayout, gb1.h(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        sa saVar = new sa(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(p5Var);
        linearLayout.setOrientation(1);
        int i13 = y6.V8;
        int i14 = y6.P9;
        saVar.f32496n = i13;
        saVar.f32497r = i14;
        if (!z11) {
            linearLayout.addView(saVar, gb1.x(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), u6Var, true);
        this.f49125c = p0Var;
        p0Var.v.setOnClickListener(new y3(this, r2Var, z11, ww0Var, 5));
        p0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f48996b;

            {
                this.f48996b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48996b.dismiss();
                        return;
                    default:
                        this.f48996b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, gb1.h(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        f7.i(y6.f23425h5, frameLayout2, u6Var);
        linearLayout.addView(frameLayout2, gb1.u(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(h7.H2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        D();
        this.customViewGravity = 83;
        j5 j5Var = new j5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = j5Var;
        int i15 = this.backgroundPaddingLeft;
        j5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
