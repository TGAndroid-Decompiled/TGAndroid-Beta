package sg;

import ai.k7;
import ai.n5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ci.v4;
import ci.z3;
import com.google.android.gms.internal.cast.a6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a31;
import org.telegram.ui.k70;
import org.telegram.ui.qw0;
import org.telegram.ui.rw0;
import w7.z5;
public final class x0 extends f3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final rw0 J;
    public int K;
    public int L;
    public int M;
    public z7 N;
    public final n2 f46505b;
    public final p0 f46506c;
    public final ArrayList d;
    public float e;
    public float f46507f;
    public boolean h;
    public final u0 f46508n;
    public final rg.k0 f46509r;
    public int f46510s;
    public final FrameLayout v;
    public boolean f46511w;
    public final SvgHelper.SvgDrawable f46512x;
    public final int f46513y;

    public x0(Context context, int i10, d6 d6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, d6Var);
    }

    public final void A() {
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
            u0Var = this.f46508n;
            if (i13 >= u0Var.getChildCount()) {
                break;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i13);
            int i14 = w0Var.f46494a;
            ViewGroup viewGroup = w0Var.f46497f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f46220c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (w0Var.f46494a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f46220c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.L;
        if (i11 >= 0) {
            float f10 = 1.0f - this.I;
            i15 = Math.min(i15, (int) a6.x(1.0f, f10, i15, i11 * f10));
        }
        if (i12 >= 0) {
            float f11 = this.I;
            i15 = Math.min(i15, (int) a6.x(1.0f, f11, this.L, i12 * f11));
        }
        FrameLayout frameLayout = this.v;
        frameLayout.setAlpha(1.0f - this.f46507f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        rg.k0 k0Var = this.f46509r;
        if (z11) {
            i10 = k0Var.getMeasuredWidth();
        } else {
            i10 = -k0Var.getMeasuredWidth();
        }
        k0Var.setTranslationX(i10 * this.f46507f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < u0Var.getChildCount(); i16++) {
                if (!((w0) u0Var.getChildAt(i16)).h) {
                    u0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            k0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f46513y == 40) {
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

    public final ViewGroup B(Context context, int i10) {
        int i11;
        qw0 qw0Var = (qw0) this.d.get(i10);
        int i12 = qw0Var.f40508a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f46219b.setOnScrollListener(new r0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new p1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new z1(context, this.f46512x, this.currentAccount, qw0Var.f40508a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f46219b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
    }

    public final void C() {
        boolean z10 = this.F;
        p0 p0Var = this.f46506c;
        if (z10) {
            p0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f46513y;
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

    public final void D() {
        this.F = true;
        p0 p0Var = this.f46506c;
        p0Var.h = false;
        p0Var.d(true);
        C();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            u0 u0Var = this.f46508n;
            if (i10 >= u0Var.getChildCount()) {
                return true;
            }
            w0 w0Var = (w0) u0Var.getChildAt(i10);
            if (w0Var.f46494a == this.G) {
                ViewGroup viewGroup = w0Var.f46497f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f46219b.canScrollVertically(-1);
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
                p0 p0Var = this.f46506c;
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
        C();
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
        z7Var.setBackgroundColor(getThemedColor(h6.f21057h5));
        this.N.setTitleColor(getThemedColor(h6.G6));
        this.N.B(getThemedColor(h6.f21393z8), false);
        z7 z7Var2 = this.N;
        int i10 = h6.f21376y8;
        z7Var2.C(getThemedColor(i10), false);
        this.N.C(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new a31(this, 14));
        this.containerView.addView(this.N, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((qw0) arrayList.get(i11)).f40508a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((qw0) arrayList.get(this.G)).f40508a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((qw0) arrayList.get(this.G)).f40508a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        u0 u0Var = this.f46508n;
        if (u0Var.getChildCount() > 0) {
            w0 w0Var = (w0) u0Var.getChildAt(0);
            ViewGroup viewGroup = w0Var.f46497f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(w0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(w0Var.getMeasuredWidth());
                this.f46511w = true;
                ofFloat.addUpdateListener(new v4(n0Var, 13));
                ofFloat.addListener(new ml0(21, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(bs.h);
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

    public x0(n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public x0(n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    public x0(org.telegram.ui.ActionBar.n2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.rw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: sg.x0.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.rw0):void");
    }

    public x0(n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, rw0 rw0Var, d6 d6Var) {
        super(1, context, d6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f46505b = n2Var;
        this.J = rw0Var;
        fixNavigationBar(getThemedColor(h6.f21057h5));
        this.f46513y = i11;
        this.E = z11;
        this.f46512x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        rg.n2 n2Var2 = new rg.n2(this, getContext(), 3);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new qw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((qw0) this.d.get(i12)).f40508a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((qw0) this.d.get(i12));
            i12 = 0;
        }
        qw0 qw0Var = (qw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        z0 z0Var = new z0(h6.ak, h6.bk, h6.ck, -1, null);
        z0Var.f46532o = 1.1f;
        z0Var.f46533p = 1.5f;
        z0Var.f46534q = -0.2f;
        z0Var.f46530m = true;
        rg.k0 k0Var = new rg.k0(this, getContext(), z0Var);
        this.f46509r = k0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int o10 = i0.b.o(-1, 40);
        int o11 = i0.b.o(-1, 100);
        imageView.setBackground(h6.j0(dp, dp, dp, dp, o10, o11, o11));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f46403b;

            {
                this.f46403b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46403b.dismiss();
                        return;
                    default:
                        this.f46403b.dismiss();
                        return;
                }
            }
        });
        n2Var2.addView(k0Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        u0 u0Var = new u0(this, getContext());
        this.f46508n = u0Var;
        u0Var.setOverScrollMode(2);
        u0Var.setOffscreenPageLimit(0);
        u0Var.setAdapter(new k70(this, 2));
        this.G = i12;
        u0Var.setCurrentItem(i12);
        n2Var2.addView(u0Var, z5.a(100.0f, 0.0f, 18.0f, 0.0f, 0.0f, -1, 0));
        n2Var2.addView(frameLayout, z5.a(52.0f, 0.0f, 24.0f, 0.0f, 0.0f, 52, 53));
        sa saVar = new sa(getContext(), u0Var, this.d.size());
        u0Var.b(new v0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(n2Var2);
        linearLayout.setOrientation(1);
        int i13 = h6.V8;
        int i14 = h6.P9;
        saVar.f30226n = i13;
        saVar.f30227r = i14;
        if (!z11) {
            linearLayout.addView(saVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), d6Var, true);
        this.f46506c = p0Var;
        p0Var.f46382r.setOnClickListener(new z3(this, n2Var, z11, qw0Var, 5));
        p0Var.e.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f46403b;

            {
                this.f46403b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46403b.dismiss();
                        return;
                    default:
                        this.f46403b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        frameLayout2.setBackgroundColor(getThemedColor(h6.f21057h5));
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            p0Var.b(k7.z2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            p0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        C();
        this.customViewGravity = 83;
        n5 n5Var = new n5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = n5Var;
        int i15 = this.backgroundPaddingLeft;
        n5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
