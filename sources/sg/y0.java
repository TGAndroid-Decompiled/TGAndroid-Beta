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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c31;
import org.telegram.ui.m70;
import org.telegram.ui.sw0;
import org.telegram.ui.tw0;
import w7.z5;
public final class y0 extends h3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final tw0 J;
    public int K;
    public int L;
    public int M;
    public z7 N;
    public final o2 f46947b;
    public final p0 f46948c;
    public final ArrayList d;
    public float e;
    public float f46949f;
    public boolean h;
    public final v0 f46950n;
    public final t0 f46951r;
    public int f46952s;
    public final FrameLayout v;
    public boolean f46953w;
    public final SvgHelper.SvgDrawable f46954x;
    public final int f46955y;

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
            v0Var = this.f46950n;
            if (i13 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i13);
            int i14 = x0Var.f46934a;
            ViewGroup viewGroup = x0Var.f46937f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f46642c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (x0Var.f46934a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f46642c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f46949f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        t0 t0Var = this.f46951r;
        if (z11) {
            i10 = t0Var.getMeasuredWidth();
        } else {
            i10 = -t0Var.getMeasuredWidth();
        }
        t0Var.setTranslationX(i10 * this.f46949f);
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
            if (this.f46955y == 40) {
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
        sw0 sw0Var = (sw0) this.d.get(i10);
        int i12 = sw0Var.f41814a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f46641b.setOnScrollListener(new r0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new q1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new a2(context, this.f46954x, this.currentAccount, sw0Var.f41814a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f46641b.setOnScrollListener(new r0(this, 0));
            return jVar;
        }
    }

    public final void D() {
        boolean z10 = this.F;
        p0 p0Var = this.f46948c;
        if (z10) {
            p0Var.f46803f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f46955y;
            if (i10 == 4) {
                p0Var.f46803f.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                p0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                p0Var.f46803f.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                p0Var.setIcon(R.raw.unlock_icon);
            } else {
                p0Var.f46803f.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            p0Var.f46803f.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
        }
    }

    public final void E() {
        this.F = true;
        p0 p0Var = this.f46948c;
        p0Var.f46805r = false;
        p0Var.d(true);
        D();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.f46950n;
            if (i10 >= v0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i10);
            if (x0Var.f46934a == this.G) {
                ViewGroup viewGroup = x0Var.f46937f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f46641b.canScrollVertically(-1);
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
                p0 p0Var = this.f46948c;
                if (isPremium) {
                    p0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                p0Var.f46805r = false;
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
        z7 z7Var = new z7(this, getContext(), 7);
        this.N = z7Var;
        r6.i(k6.f21254h5, z7Var, this.resourcesProvider);
        r6.m(this.N, 5, k6.G6, this.resourcesProvider);
        r6.m(this.N, 3, k6.f21590z8, this.resourcesProvider);
        z7 z7Var2 = this.N;
        int i10 = k6.f21573y8;
        r6.m(z7Var2, 1, i10, this.resourcesProvider);
        r6.b(this.N, i10, this.resourcesProvider, true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new c31(this, 14));
        this.containerView.addView(this.N, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((sw0) arrayList.get(i11)).f41814a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((sw0) arrayList.get(this.G)).f41814a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((sw0) arrayList.get(this.G)).f41814a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.f46950n;
        if (v0Var.getChildCount() > 0) {
            x0 x0Var = (x0) v0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f46937f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(x0Var.getMeasuredWidth());
                this.f46953w = true;
                ofFloat.addUpdateListener(new u4(n0Var, 13));
                ofFloat.addListener(new ql0(21, this, n0Var));
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

    public y0(o2 o2Var, int i10, boolean z10) {
        this(o2Var, o2Var.getContext(), o2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(o2 o2Var, Context context, int i10, int i11, boolean z10) {
        this(o2Var, context, i10, false, i11, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.o2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.tw0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: sg.y0.<init>(org.telegram.ui.ActionBar.o2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.tw0):void");
    }

    public y0(o2 o2Var, Context context, int i10, boolean z10, int i11, boolean z11, tw0 tw0Var, g6 g6Var) {
        super(1, context, g6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f46947b = o2Var;
        this.J = tw0Var;
        fixNavigationBarKey(k6.f21254h5);
        this.f46955y = i11;
        this.E = z11;
        this.f46954x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        rg.y1 y1Var = new rg.y1(this, getContext(), 4);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new sw0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((sw0) this.d.get(i12)).f41814a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((sw0) this.d.get(i12));
            i12 = 0;
        }
        sw0 sw0Var = (sw0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        a1 a1Var = new a1(k6.ak, k6.bk, k6.ck, -1, null);
        a1Var.f46627o = 1.1f;
        a1Var.f46628p = 1.5f;
        a1Var.f46629q = -0.2f;
        a1Var.f46625m = true;
        t0 t0Var = new t0(this, getContext(), a1Var);
        this.f46951r = t0Var;
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
            public final y0 f46821b;

            {
                this.f46821b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46821b.dismiss();
                        return;
                    default:
                        this.f46821b.dismiss();
                        return;
                }
            }
        });
        y1Var.addView(t0Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.f46950n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new m70(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        y1Var.addView(v0Var, z5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        y1Var.addView(frameLayout, z5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        sa saVar = new sa(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, saVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(y1Var);
        linearLayout.setOrientation(1);
        int i13 = k6.V8;
        int i14 = k6.P9;
        saVar.f30447n = i13;
        saVar.f30448r = i14;
        if (!z11) {
            linearLayout.addView(saVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        p0 p0Var = new p0(getContext(), g6Var, true);
        this.f46948c = p0Var;
        p0Var.v.setOnClickListener(new y3(this, o2Var, z11, sw0Var, 5));
        p0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f46821b;

            {
                this.f46821b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46821b.dismiss();
                        return;
                    default:
                        this.f46821b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(p0Var, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        r6.i(k6.f21254h5, frameLayout2, g6Var);
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
