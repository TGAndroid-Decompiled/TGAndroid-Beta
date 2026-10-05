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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.y7;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b80;
import org.telegram.ui.ex0;
import org.telegram.ui.fx0;
import org.telegram.ui.p81;
import org.telegram.ui.u5;
import w7.z5;
import yh.y3;
public final class y0 extends f3 implements NotificationCenter.NotificationCenterDelegate {
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
    public final n2 f46397b;
    public final q0 f46398c;
    public final ArrayList d;
    public float f46399e;
    public float f46400f;
    public boolean h;
    public final v0 f46401n;
    public final m6 f46402r;
    public int f46403s;
    public final FrameLayout v;
    public boolean f46404w;
    public final SvgHelper.SvgDrawable f46405x;
    public final int f46406y;

    public y0(Context context, int i10, d6 d6Var) {
        this(null, context, UserConfig.selectedAccount, false, i10, true, null, d6Var);
    }

    public final void A() {
        boolean z10 = this.F;
        q0 q0Var = this.f46398c;
        if (z10) {
            q0Var.d.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else if (this.E) {
            int i10 = this.f46406y;
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

    public final void B() {
        this.F = true;
        q0 q0Var = this.f46398c;
        q0Var.h = false;
        q0Var.d(true);
        A();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.f46401n;
            if (i10 >= v0Var.getChildCount()) {
                return true;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i10);
            if (x0Var.f46366a == this.G) {
                ViewGroup viewGroup = x0Var.f46370f;
                if (viewGroup instanceof b) {
                    return !((b) viewGroup).f46065b.canScrollVertically(-1);
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
                q0 q0Var = this.f46398c;
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
        y7Var.setBackgroundColor(getThemedColor(i6.f20899h5));
        this.N.setTitleColor(getThemedColor(i6.G6));
        this.N.z(getThemedColor(i6.f21235z8), false);
        y7 y7Var2 = this.N;
        int i10 = i6.f21216y8;
        y7Var2.A(getThemedColor(i10), false);
        this.N.A(getThemedColor(i10), true);
        this.N.setCastShadows(true);
        this.N.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.N.setBackButtonImage(R.drawable.ic_ab_back);
        this.N.setActionBarMenuOnItemClick(new p81(this, 9));
        this.containerView.addView(this.N, z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.N.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.N, false, 1.0f, false);
        int i11 = this.G;
        ArrayList arrayList = this.d;
        if (((ex0) arrayList.get(i11)).f36133a == 14) {
            this.N.setTitle(LocaleController.getString(R.string.UpgradedStories));
            this.N.requestLayout();
        } else if (((ex0) arrayList.get(this.G)).f36133a == 28) {
            this.N.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.N.requestLayout();
        } else if (((ex0) arrayList.get(this.G)).f36133a == 40) {
            this.N.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            this.N.requestLayout();
        } else {
            this.N.setTitle(LocaleController.getString(R.string.DoubledLimits));
            this.N.requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        v0 v0Var = this.f46401n;
        if (v0Var.getChildCount() > 0) {
            x0 x0Var = (x0) v0Var.getChildAt(0);
            ViewGroup viewGroup = x0Var.f46370f;
            if (viewGroup instanceof o0) {
                o0 o0Var = (o0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.getMeasuredWidth(), 0.0f);
                o0Var.setOffset(x0Var.getMeasuredWidth());
                this.f46404w = true;
                ofFloat.addUpdateListener(new k6(o0Var, 12));
                ofFloat.addListener(new cl0(20, this, o0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(tr.h);
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
            v0Var = this.f46401n;
            if (i13 >= v0Var.getChildCount()) {
                break;
            }
            x0 x0Var = (x0) v0Var.getChildAt(i13);
            int i14 = x0Var.f46366a;
            ViewGroup viewGroup = x0Var.f46370f;
            if (i14 == this.G && (viewGroup instanceof b) && ((m11 = ((b) viewGroup).f46066c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (x0Var.f46366a == this.H && (viewGroup instanceof b) && ((m10 = ((b) viewGroup).f46066c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
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
        frameLayout.setAlpha(1.0f - this.f46400f);
        if (this.f46399e == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.h;
        m6 m6Var = this.f46402r;
        if (z11) {
            i10 = m6Var.getMeasuredWidth();
        } else {
            i10 = -m6Var.getMeasuredWidth();
        }
        m6Var.setTranslationX(i10 * this.f46400f);
        if (i15 != this.M) {
            this.M = i15;
            for (int i16 = 0; i16 < v0Var.getChildCount(); i16++) {
                if (!((x0) v0Var.getChildAt(i16)).h) {
                    v0Var.getChildAt(i16).setTranslationY(this.M);
                }
            }
            m6Var.setTranslationY(this.M);
            frameLayout.setTranslationY(this.M);
            this.containerView.invalidate();
            int i17 = this.M;
            if (this.f46406y == 40) {
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
        int i12 = ex0Var.f36133a;
        if (i12 == 0) {
            b bVar = new b(context, this.resourcesProvider);
            bVar.f46065b.setOnScrollListener(new s0(this, 1));
            return bVar;
        } else if (i12 != 14 && i12 != 28) {
            if (i12 == 5) {
                return new q1(context, this.currentAccount);
            }
            if (i12 == 10) {
                return new o0(context, this.resourcesProvider);
            }
            return new b2(context, this.f46405x, this.currentAccount, ex0Var.f36133a, this.resourcesProvider);
        } else {
            if (i12 == 28) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            j jVar = new j(context, i11, this.resourcesProvider);
            jVar.f46065b.setOnScrollListener(new s0(this, 0));
            return jVar;
        }
    }

    public y0(n2 n2Var, int i10, boolean z10) {
        this(n2Var, n2Var.getContext(), n2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public y0(n2 n2Var, Context context, int i10, int i11, boolean z10) {
        this(n2Var, context, i10, false, i11, z10, null);
    }

    public y0(org.telegram.ui.ActionBar.n2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.fx0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: rg.y0.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.fx0):void");
    }

    public y0(n2 n2Var, Context context, int i10, boolean z10, int i11, boolean z11, fx0 fx0Var, d6 d6Var) {
        super(1, context, d6Var, false);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.K = 255;
        this.f46397b = n2Var;
        this.J = fx0Var;
        fixNavigationBar(getThemedColor(i6.f20899h5));
        this.f46406y = i11;
        this.E = z11;
        this.f46405x = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        ai.f0 f0Var = new ai.f0(this, getContext(), 29);
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
            } else if (((ex0) this.d.get(i12)).f36133a == i11) {
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
        a1 a1Var = new a1(i6.ak, i6.bk, i6.ck, -1, null);
        a1Var.f46060o = 1.1f;
        a1Var.f46061p = 1.5f;
        a1Var.f46062q = -0.2f;
        a1Var.f46058m = true;
        m6 m6Var = new m6(this, getContext(), a1Var, 28);
        this.f46402r = m6Var;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.v = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int dp = AndroidUtilities.dp(12.0f);
        int k10 = i0.a.k(-1, 40);
        int k11 = i0.a.k(-1, 100);
        imageView.setBackground(i6.i0(dp, dp, dp, dp, k10, k11, k11));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f46293b;

            {
                this.f46293b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46293b.dismiss();
                        return;
                    default:
                        this.f46293b.dismiss();
                        return;
                }
            }
        });
        f0Var.addView(m6Var, z5.t(-1, -2, 1, 0, 16, 0, 0));
        v0 v0Var = new v0(this, getContext());
        this.f46401n = v0Var;
        v0Var.setOverScrollMode(2);
        v0Var.setOffscreenPageLimit(0);
        v0Var.setAdapter(new b80(this, 2));
        this.G = i12;
        v0Var.setCurrentItem(i12);
        f0Var.addView(v0Var, z5.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        f0Var.addView(frameLayout, z5.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        ta taVar = new ta(getContext(), v0Var, this.d.size());
        v0Var.b(new w0(this, taVar));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(f0Var);
        linearLayout.setOrientation(1);
        int i13 = i6.V8;
        int i14 = i6.P9;
        taVar.f31097n = i13;
        taVar.f31098r = i14;
        if (!z11) {
            linearLayout.addView(taVar, z5.t(this.d.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        q0 q0Var = new q0(getContext(), d6Var, true);
        this.f46398c = q0Var;
        q0Var.f46266r.setOnClickListener(new l5(this, n2Var, z11, ex0Var, 5));
        q0Var.f46263e.setOnClickListener(new View.OnClickListener(this) {
            public final y0 f46293b;

            {
                this.f46293b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46293b.dismiss();
                        return;
                    default:
                        this.f46293b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(q0Var, z5.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(i6.f20899h5));
        linearLayout.addView(frameLayout2, z5.q(-1, 68, 80));
        if (i11 == 40) {
            q0Var.b(y3.g2(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i10).isPremium()) {
            q0Var.b(LocaleController.getString(R.string.OK), false, false);
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
