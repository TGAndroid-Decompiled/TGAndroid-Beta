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
public final class uv0 extends FrameLayout {
    public boolean f43354a;
    public boolean f43355b;
    public final Paint f43356c;
    public final PremiumPreviewFragment d;

    public uv0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f43356c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f9;
        org.telegram.ui.ActionBar.l lVar4;
        float f10;
        cg.s2 s2Var;
        float f11;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f35911d0;
        cg.r1 r1Var = premiumPreviewFragment.f35918i0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f35926q0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.V) {
            if (premiumPreviewFragment.W) {
                float f12 = premiumPreviewFragment.X + 0.016f;
                premiumPreviewFragment.X = f12;
                if (f12 > 3.0f) {
                    premiumPreviewFragment.W = false;
                }
            } else {
                float f13 = premiumPreviewFragment.X - 0.016f;
                premiumPreviewFragment.X = f13;
                if (f13 < 1.0f) {
                    premiumPreviewFragment.W = true;
                }
            }
        }
        if (premiumPreviewFragment.f35905a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f35905a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.Y = bottom;
        lVar = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        float f14 = 16.0f;
        int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
        float f15 = 1.0f - ((premiumPreviewFragment.Y - dp) / (premiumPreviewFragment.U - dp));
        premiumPreviewFragment.f35908b0 = f15;
        premiumPreviewFragment.f35908b0 = Utilities.clamp(f15, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
        if (premiumPreviewFragment.Y < dp2) {
            premiumPreviewFragment.Y = dp2;
        }
        float f16 = premiumPreviewFragment.m0;
        premiumPreviewFragment.m0 = 0.0f;
        if (premiumPreviewFragment.Y < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.m0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.Y) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.S) {
            premiumPreviewFragment.m0 = 1.0f;
            premiumPreviewFragment.f35908b0 = 1.0f;
        }
        if (f16 != premiumPreviewFragment.m0) {
            premiumPreviewFragment.f35905a.invalidate();
        }
        int i10 = premiumPreviewFragment.Y;
        lVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        int measuredHeight = i10 - ((premiumPreviewFragment.Q.getMeasuredHeight() + lVar3.getMeasuredHeight()) - premiumPreviewFragment.T);
        if (premiumPreviewFragment.Q.f37913e.getVisibility() == 0) {
            f9 = 24.0f;
        } else {
            f9 = 16.0f;
        }
        int dp3 = AndroidUtilities.dp(f9) + measuredHeight;
        lVar4 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - premiumPreviewFragment.T) - premiumPreviewFragment.Q.f37910a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.T) - premiumPreviewFragment.Q.getTop()) - premiumPreviewFragment.Q.f37910a.getTop(), AndroidUtilities.dp(24.0f) + dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.Q.setTranslationY(max);
        aw0 aw0Var = premiumPreviewFragment.Q.d;
        if (premiumPreviewFragment.f35910c0 == 1) {
            f14 = 9.0f;
        }
        aw0Var.setTranslationY(dp4 + AndroidUtilities.dp(f14));
        float f17 = premiumPreviewFragment.f35908b0;
        float z11 = com.google.android.recaptcha.internal.a.z(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        premiumPreviewFragment.Q.d.setScaleX(z11);
        premiumPreviewFragment.Q.d.setScaleY(z11);
        premiumPreviewFragment.Q.d.setAlpha(f18);
        premiumPreviewFragment.Q.f37911b.setAlpha(f18);
        premiumPreviewFragment.Q.f37913e.setAlpha(f18);
        premiumPreviewFragment.R.setAlpha(1.0f - premiumPreviewFragment.f35908b0);
        premiumPreviewFragment.R.setTranslationY(premiumPreviewFragment.Q.f37912c.getY() + premiumPreviewFragment.Q.getY() + ((-(s2Var.getMeasuredHeight() - premiumPreviewFragment.Q.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.Q.f37910a.getLeft();
        float f19 = premiumPreviewFragment.f35908b0;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        premiumPreviewFragment.Q.f37910a.setTranslationX((1.0f - org.telegram.ui.Components.jr.h.getInterpolation(1.0f - f11)) * dp5);
        ew0 ew0Var = premiumPreviewFragment.Q;
        ew0Var.d.f5590b.f5562p = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.X) + (premiumPreviewFragment.Q.f37912c.getX() + ew0Var.getX())) / getMeasuredWidth();
        ew0 ew0Var2 = premiumPreviewFragment.Q;
        ew0Var2.d.f5590b.f5563q = (premiumPreviewFragment.Q.f37912c.getY() + ew0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.V) {
            invalidate();
            premiumPreviewFragment.G.invalidate();
            premiumPreviewFragment.F.invalidate();
        }
        r1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.f43356c;
            paint.setColor(themedColor);
            r11 = 0;
            r11 = 0;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.m0 > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                if (lVar6 != null) {
                    paint.setColor(i0.a.d(premiumPreviewFragment.m0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)));
                    float measuredWidth = getMeasuredWidth();
                    lVar7 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    float height = lVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                }
            }
            canvas2 = canvas;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r1Var.f3319f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.F.getVisibility() != 0) {
            premiumPreviewFragment.f35925p0.b(premiumPreviewFragment.f35920k0.d, r11);
            premiumPreviewFragment.f35925p0.setBounds(r11, getHeight() - premiumPreviewFragment.f35920k0.d, getWidth(), getHeight());
            premiumPreviewFragment.f35925p0.draw(canvas2);
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).parentLayout;
        if (b5Var != null && z10) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).parentLayout;
            int i12 = (int) (premiumPreviewFragment.m0 * 255.0f);
            lVar5 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) b5Var2).p(canvas2, i12, lVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x4 = premiumPreviewFragment.Q.f37912c.getX() + premiumPreviewFragment.Q.getX();
        float y8 = premiumPreviewFragment.Q.f37912c.getY() + premiumPreviewFragment.Q.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        aw0 aw0Var = premiumPreviewFragment.Q.d;
        if (aw0Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = aw0Var.getMeasuredWidth();
        }
        float f9 = measuredWidth + x4;
        aw0 aw0Var2 = premiumPreviewFragment.Q.d;
        if (aw0Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = aw0Var2.getMeasuredHeight();
        }
        rectF.set(x4, y8, f9, measuredHeight + y8);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f43354a) && !premiumPreviewFragment.f35905a.G1) {
            motionEvent.offsetLocation(-x4, -y8);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f43354a = false;
                }
            } else {
                this.f43354a = true;
            }
            premiumPreviewFragment.Q.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x10 = premiumPreviewFragment.Q.f37913e.getX() + premiumPreviewFragment.Q.getX();
        float y10 = premiumPreviewFragment.Q.f37913e.getY() + premiumPreviewFragment.Q.getY();
        rectF.set(x10, y10, premiumPreviewFragment.Q.f37913e.getWidth() + x10, premiumPreviewFragment.Q.f37913e.getHeight() + y10);
        if (premiumPreviewFragment.m0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f43355b) && !premiumPreviewFragment.f35905a.G1)) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() == 0) {
                this.f43355b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f43355b = false;
            }
            premiumPreviewFragment.Q.f37913e.dispatchTouchEvent(motionEvent);
            if (this.f43355b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        aw0 aw0Var = premiumPreviewFragment.Q.d;
        aw0Var.f5590b.f5564r = aw0Var.getMeasuredWidth() / getMeasuredWidth();
        aw0 aw0Var2 = premiumPreviewFragment.Q.d;
        aw0Var2.f5590b.f5565s = aw0Var2.getMeasuredHeight() / getMeasuredHeight();
        ew0 ew0Var = premiumPreviewFragment.Q;
        ew0Var.d.f5590b.f5562p = (premiumPreviewFragment.Q.d.getX() + ew0Var.getX()) / getMeasuredWidth();
        ew0 ew0Var2 = premiumPreviewFragment.Q;
        ew0Var2.d.f5590b.f5563q = (premiumPreviewFragment.Q.d.getY() + ew0Var2.getY()) / getMeasuredHeight();
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
        premiumPreviewFragment.S = z10;
        premiumPreviewFragment.T = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.Q.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.R.getLayoutParams().height = premiumPreviewFragment.Q.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.F;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.kz kzVar = premiumPreviewFragment.L;
        kzVar.M = (premiumPreviewFragment.T + i12) - AndroidUtilities.dp(16.0f);
        kzVar.p1();
        premiumPreviewFragment.L.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f35909c;
        ArrayList arrayList2 = premiumPreviewFragment.f35907b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.H.a((fw0) arrayList2.get(i15), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((fw0) arrayList2.get(i15)).f38246e = i14;
            i14 += premiumPreviewFragment.H.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.H.a((fw0) arrayList.get(i16), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((fw0) arrayList.get(i16)).f38246e = i14;
            i14 += premiumPreviewFragment.H.getMeasuredHeight();
        }
        premiumPreviewFragment.J = i14;
    }
}
