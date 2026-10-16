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
import bi.w5;
import bi.y4;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.g80;
import org.telegram.ui.qx0;
import org.telegram.ui.rx0;
import org.telegram.ui.w41;
import org.telegram.ui.x5;
import w7.z5;
import zh.r3;
public final class y0 extends e3 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public final rx0 J;
    public int K;
    public int L;
    public int M;
    public b8 N;
    public final m2 f45435b;
    public final q0 f45436c;
    public final ArrayList d;
    public float e;
    public float f45437f;
    public boolean h;
    public final v0 f45438n;
    public final rg.m0 f45439r;
    public int f45440s;
    public final FrameLayout v;
    public boolean f45441w;
    public final SvgHelper.SvgDrawable f45442x;
    public final int f45443y;

    public y0(Context context, int i10, c6 c6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, c6Var);
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
            v0Var = this.f45438n;
            if (i13 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i13);
            int i14 = x0Var.f45423a;
            ViewGroup viewGroup = x0Var.f45426f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f45140c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (x0Var.f45423a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f45140c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f45437f);
        if (this.e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        rg.m0 m0Var = this.f45439r;
        if (z11) {
            i10 = m0Var.getMeasuredWidth();
        } else {
            i10 = -m0Var.getMeasuredWidth();
        }
        m0Var.setTranslationX(i10 * this.f45437f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < v0Var.getChildCount(); i16++) {
                if (!((x0) v0Var.getChildAt(i16)).h) {
                    v0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            m0Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f45443y == 40) {
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
        qx0 qx0Var = (qx0) this.d.get(i10);
        int i12 = qx0Var.f39234a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f45139b.setOnScrollListener(new s0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new q1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new n0(context, this.resourcesProvider);
            }
            return new a2(context, this.f45442x, this.currentAccount, qx0Var.f39234a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f45139b.setOnScrollListener(new s0(this, 0));
            return jVar;
        }
    }

    public final void D() {
        boolean z10 = this.F;
        q0 q0Var = this.f45436c;
        if (z10) {
            q0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f45443y;
            if (i10 == 4) {
                q0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                q0Var.setIcon(R.raw.unlock_icon);
            } else if (i10 == 10) {
                q0Var.d.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                q0Var.setIcon(R.raw.unlock_icon);
            } else {
                q0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            }
        } else {
            q0Var.d.setText(PremiumPreviewFragment.o0(this.currentAccount, this.J));
        }
    }

    public final void E() {
        this.F = true;
        q0 q0Var = this.f45436c;
        q0Var.h = false;
        q0Var.d(true);
        D();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.f45438n;
            if (i10 >= v0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i10);
            if (x0Var.f45423a == this.G) {
                ViewGroup viewGroup = x0Var.f45426f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f45139b.canScrollVertically(-1);
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
                q0 q0Var = this.f45436c;
                if (isPremium) {
                    q0Var.b(LocaleController.getString(R.string.OK), false, true);
                    return;
                }
                q0Var.h = false;
                q0Var.d(true);
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
        b8Var.setBackgroundColor(getThemedColor(g6.f19672h5));
        this.N.setTitleColor(getThemedColor(g6.G6));
        this.N.C(getThemedColor(g6.f20007z8), false);
        b8 b8Var2 = this.N;
        int i10 = g6.f19990y8;
        b8Var2.D(getThemedColor(i10), false);
        this.N.D(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new w41(this, 13));
        this.containerView.addView(this.N, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((qx0) arrayList.get(i11)).f39234a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((qx0) arrayList.get(this.G)).f39234a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((qx0) arrayList.get(this.G)).f39234a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.f45438n;
        if (v0Var.getChildCount() > 0) {
            x0 x0Var = (x0) v0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f45426f;
            if (viewGroup instanceof n0) {
                n0 n0Var = (n0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                n0Var.setOffset(x0Var.getMeasuredWidth());
                this.f45441w = true;
                ofFloat.addUpdateListener(new w5(n0Var, 13));
                ofFloat.addListener(new ql0(21, this, n0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(es.h);
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

    public y0(m2 m2Var, int i10, boolean z10) {
        this(m2Var, m2Var.getContext(), m2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(m2 m2Var, Context context, int i10, int i11, boolean z10) {
        this(m2Var, context, i10, false, i11, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.m2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.rx0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: sg.y0.<init>(org.telegram.ui.ActionBar.m2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.rx0):void");
    }

    public y0(m2 m2Var, Context context, int i10, boolean z10, int i11, boolean z11, rx0 rx0Var, c6 c6Var) {
        super(1, context, c6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f45435b = m2Var;
        this.J = rx0Var;
        fixNavigationBar(getThemedColor(g6.f19672h5));
        this.f45443y = i11;
        this.E = z11;
        this.f45442x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        p0 p0Var = new p0(this, getContext(), 1);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.n0(i10, arrayList);
        } else {
            PremiumPreviewFragment.m0(i10, arrayList, false);
            PremiumPreviewFragment.m0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new qx0(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.d.size()) {
                i12 = 0;
                break;
            } else if (((qx0) this.d.get(i12)).f39234a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.d.clear();
            this.d.add((qx0) this.d.get(i12));
            i12 = 0;
        }
        qx0 qx0Var = (qx0) this.d.get(i12);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        a1 a1Var = new a1(g6.ak, g6.bk, g6.ck, -1, null);
        a1Var.f45125o = 1.1f;
        a1Var.f45126p = 1.5f;
        a1Var.f45127q = -0.2f;
        a1Var.f45123m = true;
        rg.m0 m0Var = new rg.m0(this, getContext(), a1Var);
        this.f45439r = m0Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(g6.j0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f45336b;

            {
                this.f45336b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45336b.dismiss();
                        return;
                    default:
                        this.f45336b.dismiss();
                        return;
                }
            }
        });
        p0Var.addView(m0Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.f45438n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new g80(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        p0Var.addView(v0Var, z5.a(100.0f, 0.0f, 18.0f, 0.0f, 0.0f, -1, 0));
        p0Var.addView(frameLayout, z5.a(52.0f, 0.0f, 24.0f, 0.0f, 0.0f, 52, 53));
        ua uaVar = new ua(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, uaVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(p0Var);
        linearLayout.setOrientation(1);
        int i13 = g6.V8;
        int i14 = g6.P9;
        uaVar.f29302n = i13;
        uaVar.f29303r = i14;
        if (!z11) {
            linearLayout.addView(uaVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        q0 q0Var = new q0(getContext(), c6Var, true);
        this.f45436c = q0Var;
        q0Var.f45314r.setOnClickListener(new y4(this, m2Var, z11, qx0Var, 5));
        q0Var.e.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f45336b;

            {
                this.f45336b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45336b.dismiss();
                        return;
                    default:
                        this.f45336b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(q0Var, z5.a(48.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 16));
        frameLayout2.setBackgroundColor(getThemedColor(g6.f19672h5));
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            q0Var.b(r3.i2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            q0Var.b(LocaleController.getString(R.string.OK), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        D();
        this.customViewGravity = 83;
        x5 x5Var = new x5(this, getContext(), scrollView, getContext().getDrawable(R.drawable.header_shadow).mutate());
        this.containerView = x5Var;
        int i15 = this.backgroundPaddingLeft;
        x5Var.setPadding(i15, this.backgroundPaddingTop - 1, i15, 0);
    }
}
