package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi.u5;
import bi.w4;
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
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c80;
import org.telegram.ui.kx0;
import org.telegram.ui.lx0;
import org.telegram.ui.o81;
import org.telegram.ui.t5;
import w7.x5;
import zh.w3;
public final class a1 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final lx0 J;
    public int K;
    public int L;
    public int M;
    public z7 N;
    public final n2 f46011b;
    public final r0 f46012c;
    public final ArrayList d;
    public float f46013e;
    public float f46014f;
    public boolean h;
    public final x0 f46015n;
    public final v0 f46016r;
    public int f46017s;
    public final FrameLayout v;
    public boolean f46018w;
    public final SvgHelper.SvgDrawable f46019x;
    public final int f46020y;

    public a1(Context context, int i10, f6 f6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, f6Var);
    }

    public final ViewGroup A(Context context, int i10) {
        int i11;
        kx0 kx0Var = (kx0) this.d.get(i10);
        int i12 = kx0Var.f38147a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f46023b.setOnScrollListener(new t0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new s1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new o0(context, this.resourcesProvider);
            }
            return new c2(context, this.f46019x, this.currentAccount, kx0Var.f38147a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f46023b.setOnScrollListener(new t0(this, 0));
            return jVar;
        }
    }

    public final void B() {
        boolean z10 = this.F;
        r0 r0Var = this.f46012c;
        if (z10) {
            r0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f46020y;
            if (i10 == 4) {
                r0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                r0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                r0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                r0Var.setIcon(R.raw.unlock_icon);
            } else {
                r0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            r0Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
        }
    }

    public final void C() {
        this.F = true;
        r0 r0Var = this.f46012c;
        r0Var.h = false;
        r0Var.d(true);
        B();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            x0 x0Var = this.f46015n;
            if (i10 >= x0Var.getChildCount()) {
                return true;
            }
            z0 z0Var = (z0) x0Var.getChildAt(i10);
            if (z0Var.f46370a == this.G) {
                ViewGroup viewGroup = z0Var.f46374f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f46023b.canScrollVertically(-1);
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
                r0 r0Var = this.f46012c;
                if (isPremium) {
                    r0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                r0Var.h = false;
                r0Var.d(true);
                return;
            }
            return;
        }
        B();
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
        z7 z7Var = new z7(this, getContext(), 7);
        this.N = z7Var;
        z7Var.setBackgroundColor(getThemedColor(j6.f20734h5));
        this.N.setTitleColor(getThemedColor(j6.G6));
        this.N.B(getThemedColor(j6.f21063z8), false);
        z7 z7Var2 = this.N;
        int i10 = j6.f21044y8;
        z7Var2.C(getThemedColor(i10), false);
        this.N.C(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new o81(this, 11));
        this.containerView.addView(this.N, x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((kx0) arrayList.get(i11)).f38147a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((kx0) arrayList.get(this.G)).f38147a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((kx0) arrayList.get(this.G)).f38147a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        x0 x0Var = this.f46015n;
        if (x0Var.getChildCount() > 0) {
            z0 z0Var = (z0) x0Var.getChildAt(0);
            ViewGroup viewGroup = z0Var.f46374f;
            if (viewGroup instanceof o0) {
                o0 o0Var = (o0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z0Var.getMeasuredWidth(), 0.0f);
                o0Var.setOffset(z0Var.getMeasuredWidth());
                this.f46018w = true;
                ofFloat.addUpdateListener(new u5(o0Var, 13));
                ofFloat.addListener(new pk0(20, this, o0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(pr.h);
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
            x0Var = this.f46015n;
            if (i13 >= x0Var.getChildCount()) {
                break;
            }
            z0 z0Var = (z0) x0Var.getChildAt(i13);
            int i14 = z0Var.f46370a;
            ViewGroup viewGroup = z0Var.f46374f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f46024c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (z0Var.f46370a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f46024c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f46014f);
        if (this.f46013e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        v0 v0Var = this.f46016r;
        if (z11) {
            i10 = v0Var.getMeasuredWidth();
        } else {
            i10 = -v0Var.getMeasuredWidth();
        }
        v0Var.setTranslationX(i10 * this.f46014f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < x0Var.getChildCount(); i16++) {
                if (!((z0) x0Var.getChildAt(i16)).h) {
                    x0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            v0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f46020y == 40) {
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

    public a1(n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public a1(n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    public a1(org.telegram.ui.ActionBar.n2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.lx0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a1.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.lx0):void");
    }

    public a1(n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, lx0 lx0Var, f6 f6Var) {
        super(1, context, f6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f46011b = n2Var;
        this.J = lx0Var;
        fixNavigationBar(getThemedColor(j6.f20734h5));
        this.f46020y = i11;
        this.E = z11;
        this.f46019x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        ah.y yVar = new ah.y(this, getContext(), 29);
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
            } else if (((kx0) this.d.get(i12)).f38147a == i11) {
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
        c1 c1Var = new c1(j6.ak, j6.bk, j6.ck, -1, null);
        c1Var.f46043o = 1.1f;
        c1Var.f46044p = 1.5f;
        c1Var.f46045q = -0.2f;
        c1Var.f46041m = true;
        v0 v0Var = new v0(this, getContext(), c1Var);
        this.f46016r = v0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(j6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, x5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final a1 f46266b;

            {
                this.f46266b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46266b.dismiss();
                        return;
                    default:
                        this.f46266b.dismiss();
                        return;
                }
            }
        });
        yVar.addView(v0Var, x5.t(-1, -2, 1, 0, 16, 0, 0));
        x0 x0Var = new x0(this, getContext());
        this.f46015n = x0Var;
        x0Var.setOverScrollMode(2);
        x0Var.setOffscreenPageLimit(0);
        x0Var.setAdapter(new c80(this, 2));
        this.G = i12;
        x0Var.setCurrentItem(i12);
        yVar.addView(x0Var, x5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        yVar.addView(frameLayout, x5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        sa saVar = new sa(getContext(), x0Var, this.d.size());
        x0Var.b(new y0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(yVar);
        linearLayout.setOrientation(1);
        int i13 = j6.V8;
        int i14 = j6.P9;
        saVar.f30242n = i13;
        saVar.f30243r = i14;
        if (!z11) {
            linearLayout.addView(saVar, x5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        r0 r0Var = new r0(getContext(), f6Var, true);
        this.f46012c = r0Var;
        r0Var.f46241r.setOnClickListener(new w4(this, n2Var, z11, kx0Var, 5));
        r0Var.f46238e.setOnClickListener(new View.OnClickListener(this) {
            public final a1 f46266b;

            {
                this.f46266b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46266b.dismiss();
                        return;
                    default:
                        this.f46266b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(r0Var, x5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(j6.f20734h5));
        linearLayout.addView(frameLayout2, x5.q(-1, 68, 80));
        if (i11 == 40) {
            r0Var.b(w3.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            r0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        B();
        this.customViewGravity = 83;
        t5 t5Var = new t5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = t5Var;
        int i15 = this.backgroundPaddingLeft;
        t5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
