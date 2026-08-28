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
    public boolean f43322a;
    public boolean f43323b;
    public final Paint f43324c;
    public final PremiumPreviewFragment d;

    public uv0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f43324c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        zf.w1 w1Var;
        float f12;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f35845d0;
        zf.z0 z0Var = premiumPreviewFragment.f35852i0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f35860q0 != null) {
            premiumPreviewFragment.i0();
        }
        if (!premiumPreviewFragment.V) {
            if (premiumPreviewFragment.W) {
                float f13 = premiumPreviewFragment.X + 0.016f;
                premiumPreviewFragment.X = f13;
                if (f13 > 3.0f) {
                    premiumPreviewFragment.W = false;
                }
            } else {
                float f14 = premiumPreviewFragment.X - 0.016f;
                premiumPreviewFragment.X = f14;
                if (f14 < 1.0f) {
                    premiumPreviewFragment.W = true;
                }
            }
        }
        if (premiumPreviewFragment.f35839a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f35839a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.Y = bottom;
        kVar = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        float f15 = 16.0f;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f16 = 1.0f - ((premiumPreviewFragment.Y - dp) / (premiumPreviewFragment.U - dp));
        premiumPreviewFragment.f35842b0 = f16;
        premiumPreviewFragment.f35842b0 = Utilities.clamp(f16, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.Y < dp2) {
            premiumPreviewFragment.Y = dp2;
        }
        float f17 = premiumPreviewFragment.m0;
        premiumPreviewFragment.m0 = 0.0f;
        if (premiumPreviewFragment.Y < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.m0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.Y) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.S) {
            premiumPreviewFragment.m0 = 1.0f;
            premiumPreviewFragment.f35842b0 = 1.0f;
        }
        if (f17 != premiumPreviewFragment.m0) {
            premiumPreviewFragment.f35839a.invalidate();
        }
        int i9 = premiumPreviewFragment.Y;
        kVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        int measuredHeight = i9 - ((premiumPreviewFragment.Q.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.T);
        if (premiumPreviewFragment.Q.f38359e.getVisibility() == 0) {
            f10 = 24.0f;
        } else {
            f10 = 16.0f;
        }
        int dp3 = AndroidUtilities.dp(f10) + measuredHeight;
        kVar4 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.T) - premiumPreviewFragment.Q.f38356a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.T) - premiumPreviewFragment.Q.getTop()) - premiumPreviewFragment.Q.f38356a.getTop(), AndroidUtilities.dp(24.0f) + dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.Q.setTranslationY(max);
        bw0 bw0Var = premiumPreviewFragment.Q.d;
        if (premiumPreviewFragment.f35844c0 == 1) {
            f15 = 9.0f;
        }
        bw0Var.setTranslationY(dp4 + AndroidUtilities.dp(f15));
        float f18 = premiumPreviewFragment.f35842b0;
        float z11 = e2.c.z(1.0f, f18, 0.4f, 0.6f);
        if (f18 > 0.5f) {
            f11 = (f18 - 0.5f) / 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f19 = 1.0f - f11;
        premiumPreviewFragment.Q.d.setScaleX(z11);
        premiumPreviewFragment.Q.d.setScaleY(z11);
        premiumPreviewFragment.Q.d.setAlpha(f19);
        premiumPreviewFragment.Q.f38357b.setAlpha(f19);
        premiumPreviewFragment.Q.f38359e.setAlpha(f19);
        premiumPreviewFragment.R.setAlpha(1.0f - premiumPreviewFragment.f35842b0);
        premiumPreviewFragment.R.setTranslationY(premiumPreviewFragment.Q.f38358c.getY() + premiumPreviewFragment.Q.getY() + ((-(w1Var.getMeasuredHeight() - premiumPreviewFragment.Q.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.Q.f38356a.getLeft();
        float f20 = premiumPreviewFragment.f35842b0;
        if (f20 > 0.3f) {
            f12 = (f20 - 0.3f) / 0.7f;
        } else {
            f12 = 0.0f;
        }
        premiumPreviewFragment.Q.f38356a.setTranslationX((1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - f12)) * dp5);
        fw0 fw0Var = premiumPreviewFragment.Q;
        fw0Var.d.f205b.f175p = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.X) + (premiumPreviewFragment.Q.f38358c.getX() + fw0Var.getX())) / getMeasuredWidth();
        fw0 fw0Var2 = premiumPreviewFragment.Q;
        fw0Var2.d.f205b.f176q = (premiumPreviewFragment.Q.f38358c.getY() + fw0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.V) {
            invalidate();
            premiumPreviewFragment.G.invalidate();
            premiumPreviewFragment.F.invalidate();
        }
        z0Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.f43324c;
            paint.setColor(themedColor);
            r11 = 0;
            r11 = 0;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.m0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.d(premiumPreviewFragment.m0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                }
            }
            canvas2 = canvas;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), z0Var.f50792f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.F.getVisibility() != 0) {
            premiumPreviewFragment.f35859p0.b(premiumPreviewFragment.f35854k0.d, r11);
            premiumPreviewFragment.f35859p0.setBounds(r11, getHeight() - premiumPreviewFragment.f35854k0.d, getWidth(), getHeight());
            premiumPreviewFragment.f35859p0.draw(canvas2);
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).parentLayout;
        if (b5Var != null && z10) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).parentLayout;
            int i11 = (int) (premiumPreviewFragment.m0 * 255.0f);
            kVar5 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) b5Var2).p(canvas2, i11, kVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.Q.f38358c.getX() + premiumPreviewFragment.Q.getX();
        float y10 = premiumPreviewFragment.Q.f38358c.getY() + premiumPreviewFragment.Q.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        bw0 bw0Var = premiumPreviewFragment.Q.d;
        if (bw0Var == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = bw0Var.getMeasuredWidth();
        }
        float f10 = measuredWidth + x10;
        bw0 bw0Var2 = premiumPreviewFragment.Q.d;
        if (bw0Var2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = bw0Var2.getMeasuredHeight();
        }
        rectF.set(x10, y10, f10, measuredHeight + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f43322a) && !premiumPreviewFragment.f35839a.G1) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f43322a = false;
                }
            } else {
                this.f43322a = true;
            }
            premiumPreviewFragment.Q.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.Q.f38359e.getX() + premiumPreviewFragment.Q.getX();
        float y11 = premiumPreviewFragment.Q.f38359e.getY() + premiumPreviewFragment.Q.getY();
        rectF.set(x11, y11, premiumPreviewFragment.Q.f38359e.getWidth() + x11, premiumPreviewFragment.Q.f38359e.getHeight() + y11);
        if (premiumPreviewFragment.m0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f43323b) && !premiumPreviewFragment.f35839a.G1)) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0) {
                this.f43323b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f43323b = false;
            }
            premiumPreviewFragment.Q.f38359e.dispatchTouchEvent(motionEvent);
            if (this.f43323b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        bw0 bw0Var = premiumPreviewFragment.Q.d;
        bw0Var.f205b.f177r = bw0Var.getMeasuredWidth() / getMeasuredWidth();
        bw0 bw0Var2 = premiumPreviewFragment.Q.d;
        bw0Var2.f205b.f178s = bw0Var2.getMeasuredHeight() / getMeasuredHeight();
        fw0 fw0Var = premiumPreviewFragment.Q;
        fw0Var.d.f205b.f175p = (premiumPreviewFragment.Q.d.getX() + fw0Var.getX()) / getMeasuredWidth();
        fw0 fw0Var2 = premiumPreviewFragment.Q;
        fw0Var2.d.f205b.f176q = (premiumPreviewFragment.Q.d.getY() + fw0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11 = 0;
        if (View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.S = z10;
        premiumPreviewFragment.T = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.Q.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.R.getLayoutParams().height = premiumPreviewFragment.Q.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.F;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i11 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.bz bzVar = premiumPreviewFragment.L;
        bzVar.M = (premiumPreviewFragment.T + i11) - AndroidUtilities.dp(16.0f);
        bzVar.p1();
        premiumPreviewFragment.L.S = i11;
        super.onMeasure(i9, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.r0();
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f35843c;
        ArrayList arrayList2 = premiumPreviewFragment.f35841b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.H.a((gw0) arrayList2.get(i14), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((gw0) arrayList2.get(i14)).f38613e = i13;
            i13 += premiumPreviewFragment.H.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.H.a((gw0) arrayList.get(i15), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
            ((gw0) arrayList.get(i15)).f38613e = i13;
            i13 += premiumPreviewFragment.H.getMeasuredHeight();
        }
        premiumPreviewFragment.J = i13;
    }
}
