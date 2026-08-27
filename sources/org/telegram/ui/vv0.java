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

public final class vv0 extends FrameLayout {

    public boolean f43527a;

    public boolean f43528b;

    public final Paint f43529c;
    public final PremiumPreviewFragment d;

    public vv0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f43529c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ?? r11;
        Canvas canvas2;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f35848d0;
        ag.i2 i2Var = premiumPreviewFragment.f35855i0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f35863q0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.V) {
            if (premiumPreviewFragment.W) {
                float f10 = premiumPreviewFragment.X + 0.016f;
                premiumPreviewFragment.X = f10;
                if (f10 > 3.0f) {
                    premiumPreviewFragment.W = false;
                }
            } else {
                float f11 = premiumPreviewFragment.X - 0.016f;
                premiumPreviewFragment.X = f11;
                if (f11 < 1.0f) {
                    premiumPreviewFragment.W = true;
                }
            }
        }
        View viewM = premiumPreviewFragment.f35842a.getLayoutManager() != null ? premiumPreviewFragment.f35842a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.Y = viewM == null ? 0 : viewM.getBottom();
        int iDp = AndroidUtilities.dp(16.0f) + ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getBottom();
        float f12 = 1.0f - ((premiumPreviewFragment.Y - iDp) / (premiumPreviewFragment.U - iDp));
        premiumPreviewFragment.f35845b0 = f12;
        premiumPreviewFragment.f35845b0 = Utilities.clamp(f12, 1.0f, 0.0f);
        int iDp2 = AndroidUtilities.dp(16.0f) + ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getBottom();
        if (premiumPreviewFragment.Y < iDp2) {
            premiumPreviewFragment.Y = iDp2;
        }
        float f13 = premiumPreviewFragment.m0;
        premiumPreviewFragment.m0 = 0.0f;
        if (premiumPreviewFragment.Y < AndroidUtilities.dp(30.0f) + iDp2) {
            premiumPreviewFragment.m0 = ((AndroidUtilities.dp(30.0f) + iDp2) - premiumPreviewFragment.Y) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.S) {
            premiumPreviewFragment.m0 = 1.0f;
            premiumPreviewFragment.f35845b0 = 1.0f;
        }
        if (f13 != premiumPreviewFragment.m0) {
            premiumPreviewFragment.f35842a.invalidate();
        }
        float fMax = Math.max((((((((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getMeasuredHeight() - premiumPreviewFragment.T) - premiumPreviewFragment.Q.f38214a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.T) - premiumPreviewFragment.Q.getTop()) - premiumPreviewFragment.Q.f38214a.getTop(), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(premiumPreviewFragment.Q.f38217e.getVisibility() == 0 ? 24.0f : 16.0f) + (premiumPreviewFragment.Y - ((premiumPreviewFragment.Q.getMeasuredHeight() + ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getMeasuredHeight()) - premiumPreviewFragment.T)));
        float fDp = ((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.Q.setTranslationY(fMax);
        premiumPreviewFragment.Q.d.setTranslationY(fDp + AndroidUtilities.dp(premiumPreviewFragment.f35847c0 == 1 ? 9.0f : 16.0f));
        float f14 = premiumPreviewFragment.f35845b0;
        float fZ = com.google.android.recaptcha.internal.a.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.Q.d.setScaleX(fZ);
        premiumPreviewFragment.Q.d.setScaleY(fZ);
        premiumPreviewFragment.Q.d.setAlpha(f15);
        premiumPreviewFragment.Q.f38215b.setAlpha(f15);
        premiumPreviewFragment.Q.f38217e.setAlpha(f15);
        premiumPreviewFragment.R.setAlpha(1.0f - premiumPreviewFragment.f35845b0);
        ag.k3 k3Var = premiumPreviewFragment.R;
        k3Var.setTranslationY(premiumPreviewFragment.Q.f38216c.getY() + premiumPreviewFragment.Q.getY() + ((-(k3Var.getMeasuredHeight() - premiumPreviewFragment.Q.d.getMeasuredWidth())) / 2.0f));
        float fDp2 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.Q.f38214a.getLeft();
        float f16 = premiumPreviewFragment.f35845b0;
        premiumPreviewFragment.Q.f38214a.setTranslationX((1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * fDp2);
        fw0 fw0Var = premiumPreviewFragment.Q;
        fw0Var.d.f2129b.f2101p = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.X) + (premiumPreviewFragment.Q.f38216c.getX() + fw0Var.getX())) / getMeasuredWidth();
        fw0 fw0Var2 = premiumPreviewFragment.Q;
        fw0Var2.d.f2129b.f2102q = (premiumPreviewFragment.Q.f38216c.getY() + fw0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.V) {
            invalidate();
            premiumPreviewFragment.G.invalidate();
            premiumPreviewFragment.F.invalidate();
        }
        i2Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.X, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.f43529c;
            paint.setColor(themedColor);
            r11 = 0;
            r11 = 0;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.m0 <= 0.0f || ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar == null) {
                canvas2 = canvas;
            } else {
                paint.setColor(i0.b.d(premiumPreviewFragment.m0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getHeight(), paint);
            }
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), i2Var.f458f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.F.getVisibility() != 0) {
            premiumPreviewFragment.f35862p0.b(premiumPreviewFragment.f35857k0.d, r11);
            premiumPreviewFragment.f35862p0.setBounds(r11, getHeight() - premiumPreviewFragment.f35857k0.d, getWidth(), getHeight());
            premiumPreviewFragment.f35862p0.draw(canvas2);
        }
        if (((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).parentLayout == null || !z10) {
            return;
        }
        ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).parentLayout).p(canvas2, (int) (premiumPreviewFragment.m0 * 255.0f), ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar.getBottom());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x8 = premiumPreviewFragment.Q.f38216c.getX() + premiumPreviewFragment.Q.getX();
        float y10 = premiumPreviewFragment.Q.f38216c.getY() + premiumPreviewFragment.Q.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        bw0 bw0Var = premiumPreviewFragment.Q.d;
        float measuredWidth = (bw0Var == null ? 0 : bw0Var.getMeasuredWidth()) + x8;
        bw0 bw0Var2 = premiumPreviewFragment.Q.d;
        rectF.set(x8, y10, measuredWidth, (bw0Var2 == null ? 0 : bw0Var2.getMeasuredHeight()) + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f43527a) && !premiumPreviewFragment.f35842a.G1) {
            motionEvent.offsetLocation(-x8, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.f43527a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f43527a = false;
            }
            premiumPreviewFragment.Q.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x10 = premiumPreviewFragment.Q.f38217e.getX() + premiumPreviewFragment.Q.getX();
        float y11 = premiumPreviewFragment.Q.f38217e.getY() + premiumPreviewFragment.Q.getY();
        rectF.set(x10, y11, premiumPreviewFragment.Q.f38217e.getWidth() + x10, premiumPreviewFragment.Q.f38217e.getHeight() + y11);
        if (premiumPreviewFragment.m0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f43528b) && !premiumPreviewFragment.f35842a.G1)) {
            motionEvent.offsetLocation(-x10, -y11);
            if (motionEvent.getAction() == 0) {
                this.f43528b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f43528b = false;
            }
            premiumPreviewFragment.Q.f38217e.dispatchTouchEvent(motionEvent);
            if (this.f43528b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        bw0 bw0Var = premiumPreviewFragment.Q.d;
        bw0Var.f2129b.f2103r = bw0Var.getMeasuredWidth() / getMeasuredWidth();
        bw0 bw0Var2 = premiumPreviewFragment.Q.d;
        bw0Var2.f2129b.f2104s = bw0Var2.getMeasuredHeight() / getMeasuredHeight();
        fw0 fw0Var = premiumPreviewFragment.Q;
        fw0Var.d.f2129b.f2101p = (premiumPreviewFragment.Q.d.getX() + fw0Var.getX()) / getMeasuredWidth();
        fw0 fw0Var2 = premiumPreviewFragment.Q;
        fw0Var2.d.f2129b.f2102q = (premiumPreviewFragment.Q.d.getY() + fw0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp = 0;
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.S = z10;
        premiumPreviewFragment.T = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.Q.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.R.getLayoutParams().height = premiumPreviewFragment.Q.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.F;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            iDp = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.dz dzVar = premiumPreviewFragment.L;
        dzVar.M = (premiumPreviewFragment.T + iDp) - AndroidUtilities.dp(16.0f);
        dzVar.p1();
        premiumPreviewFragment.L.S = iDp;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f35846c;
        ArrayList arrayList2 = premiumPreviewFragment.f35844b;
        int measuredHeight = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.H.a((gw0) arrayList2.get(i14), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((gw0) arrayList2.get(i14)).f38489e = measuredHeight;
            measuredHeight += premiumPreviewFragment.H.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.H.a((gw0) arrayList.get(i15), false);
            premiumPreviewFragment.H.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((gw0) arrayList.get(i15)).f38489e = measuredHeight;
            measuredHeight += premiumPreviewFragment.H.getMeasuredHeight();
        }
        premiumPreviewFragment.J = measuredHeight;
    }
}
