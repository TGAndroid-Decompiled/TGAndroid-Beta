package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xw0 extends FrameLayout {
    public boolean f44194a;
    public boolean f44195b;
    public final Paint f44196c;
    public final PremiumPreviewFragment d;

    public xw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f44196c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        org.telegram.ui.ActionBar.k kVar4;
        float f10;
        rg.w1 w1Var;
        float f11;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f34165h0;
        rg.a1 a1Var = premiumPreviewFragment.m0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f34180u0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.Z) {
            if (premiumPreviewFragment.f34154a0) {
                float f12 = premiumPreviewFragment.f34156b0 + 0.016f;
                premiumPreviewFragment.f34156b0 = f12;
                if (f12 > 3.0f) {
                    premiumPreviewFragment.f34154a0 = false;
                }
            } else {
                float f13 = premiumPreviewFragment.f34156b0 - 0.016f;
                premiumPreviewFragment.f34156b0 = f13;
                if (f13 < 1.0f) {
                    premiumPreviewFragment.f34154a0 = true;
                }
            }
        }
        if (premiumPreviewFragment.f34153a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f34153a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.f34158c0 = bottom;
        kVar = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
        float f14 = 16.0f;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f15 = 1.0f - ((premiumPreviewFragment.f34158c0 - dp) / (premiumPreviewFragment.Y - dp));
        premiumPreviewFragment.f34163f0 = f15;
        premiumPreviewFragment.f34163f0 = Utilities.clamp(f15, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.f34158c0 < dp2) {
            premiumPreviewFragment.f34158c0 = dp2;
        }
        float f16 = premiumPreviewFragment.f34174q0;
        premiumPreviewFragment.f34174q0 = 0.0f;
        if (premiumPreviewFragment.f34158c0 < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.f34174q0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.f34158c0) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.W) {
            premiumPreviewFragment.f34174q0 = 1.0f;
            premiumPreviewFragment.f34163f0 = 1.0f;
        }
        if (f16 != premiumPreviewFragment.f34174q0) {
            premiumPreviewFragment.f34153a.invalidate();
        }
        int i10 = premiumPreviewFragment.f34158c0;
        kVar3 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
        int measuredHeight = i10 - ((premiumPreviewFragment.U.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.X);
        if (premiumPreviewFragment.U.f38797e.getVisibility() == 0) {
            f7 = 24.0f;
        } else {
            f7 = 16.0f;
        }
        int dp3 = AndroidUtilities.dp(f7) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.X) - premiumPreviewFragment.U.f38794a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.X) - premiumPreviewFragment.U.getTop()) - premiumPreviewFragment.U.f38794a.getTop(), AndroidUtilities.dp(24.0f) + dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.U.setTranslationY(max);
        ex0 ex0Var = premiumPreviewFragment.U.d;
        if (premiumPreviewFragment.f34164g0 == 1) {
            f14 = 9.0f;
        }
        ex0Var.setTranslationY(dp4 + AndroidUtilities.dp(f14));
        float f17 = premiumPreviewFragment.f34163f0;
        float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        premiumPreviewFragment.U.d.setScaleX(y3);
        premiumPreviewFragment.U.d.setScaleY(y3);
        premiumPreviewFragment.U.d.setAlpha(f18);
        premiumPreviewFragment.U.f38795b.setAlpha(f18);
        premiumPreviewFragment.U.f38797e.setAlpha(f18);
        premiumPreviewFragment.V.setAlpha(1.0f - premiumPreviewFragment.f34163f0);
        premiumPreviewFragment.V.setTranslationY(premiumPreviewFragment.U.f38796c.getY() + premiumPreviewFragment.U.getY() + ((-(w1Var.getMeasuredHeight() - premiumPreviewFragment.U.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.U.f38794a.getLeft();
        float f19 = premiumPreviewFragment.f34163f0;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        premiumPreviewFragment.U.f38794a.setTranslationX((1.0f - org.telegram.ui.Components.is.h.getInterpolation(1.0f - f11)) * dp5);
        ix0 ix0Var = premiumPreviewFragment.U;
        ix0Var.d.f48168b.f48146s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.f34156b0) + (premiumPreviewFragment.U.f38796c.getX() + ix0Var.getX())) / getMeasuredWidth();
        ix0 ix0Var2 = premiumPreviewFragment.U;
        ix0Var2.d.f48168b.f48147t = (premiumPreviewFragment.U.f38796c.getY() + ix0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.Z) {
            invalidate();
            premiumPreviewFragment.K.invalidate();
            premiumPreviewFragment.J.invalidate();
        }
        a1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f34156b0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i11 = org.telegram.ui.ActionBar.h6.f20730a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.f44196c;
            paint.setColor(themedColor);
            boolean z11 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f34174q0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.d(premiumPreviewFragment.f34174q0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z11;
                }
            }
            canvas2 = canvas;
            r11 = z11;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a1Var.f47269f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.J.getVisibility() != 0) {
            premiumPreviewFragment.f34179t0.b(premiumPreviewFragment.f34172o0.d, r11);
            premiumPreviewFragment.f34179t0.setBounds(r11, getHeight() - premiumPreviewFragment.f34172o0.d, getWidth(), getHeight());
            premiumPreviewFragment.f34179t0.draw(canvas2);
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).parentLayout;
        if (b5Var != null && z10) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).parentLayout;
            int i12 = (int) (premiumPreviewFragment.f34174q0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) b5Var2).p(canvas2, i12, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.U.f38796c.getX() + premiumPreviewFragment.U.getX();
        float y3 = premiumPreviewFragment.U.f38796c.getY() + premiumPreviewFragment.U.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        ex0 ex0Var = premiumPreviewFragment.U.d;
        if (ex0Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = ex0Var.getMeasuredWidth();
        }
        float f7 = measuredWidth + x10;
        ex0 ex0Var2 = premiumPreviewFragment.U.d;
        if (ex0Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = ex0Var2.getMeasuredHeight();
        }
        rectF.set(x10, y3, f7, measuredHeight + y3);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f44194a) && !premiumPreviewFragment.f34153a.I1) {
            motionEvent.offsetLocation(-x10, -y3);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f44194a = false;
                }
            } else {
                this.f44194a = true;
            }
            premiumPreviewFragment.U.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.U.f38797e.getX() + premiumPreviewFragment.U.getX();
        float y10 = premiumPreviewFragment.U.f38797e.getY() + premiumPreviewFragment.U.getY();
        rectF.set(x11, y10, premiumPreviewFragment.U.f38797e.getWidth() + x11, premiumPreviewFragment.U.f38797e.getHeight() + y10);
        if (premiumPreviewFragment.f34174q0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f44195b) && !premiumPreviewFragment.f34153a.I1)) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0) {
                this.f44195b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f44195b = false;
            }
            premiumPreviewFragment.U.f38797e.dispatchTouchEvent(motionEvent);
            if (this.f44195b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ex0 ex0Var = premiumPreviewFragment.U.d;
        ex0Var.f48168b.f48148u = ex0Var.getMeasuredWidth() / getMeasuredWidth();
        ex0 ex0Var2 = premiumPreviewFragment.U.d;
        ex0Var2.f48168b.v = ex0Var2.getMeasuredHeight() / getMeasuredHeight();
        ix0 ix0Var = premiumPreviewFragment.U;
        ix0Var.d.f48168b.f48146s = (premiumPreviewFragment.U.d.getX() + ix0Var.getX()) / getMeasuredWidth();
        ix0 ix0Var2 = premiumPreviewFragment.U;
        ix0Var2.d.f48168b.f48147t = (premiumPreviewFragment.U.d.getY() + ix0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12 = 0;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.W = z10;
        premiumPreviewFragment.X = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.U.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.V.getLayoutParams().height = premiumPreviewFragment.U.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.J;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.g00 g00Var = premiumPreviewFragment.P;
        g00Var.M = (premiumPreviewFragment.X + i12) - AndroidUtilities.dp(16.0f);
        g00Var.p1();
        premiumPreviewFragment.P.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f34157c;
        ArrayList arrayList2 = premiumPreviewFragment.f34155b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.L.a((jx0) arrayList2.get(i15), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((jx0) arrayList2.get(i15)).f39140e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.L.a((jx0) arrayList.get(i16), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((jx0) arrayList.get(i16)).f39140e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        premiumPreviewFragment.N = i14;
    }
}
