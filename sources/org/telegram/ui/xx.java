package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class xx extends org.telegram.ui.Components.hv0 {
    public final fy A0;
    public final Paint f44662s0;
    public int f44663t0;
    public int f44664u0;
    public int f44665v0;
    public VelocityTracker f44666w0;
    public final Rect f44667x0;
    public boolean f44668y0;
    public final wd.b f44669z0;

    public xx(Context context, fy fyVar) {
        super(context, null);
        this.A0 = fyVar;
        this.f44662s0 = new Paint(1);
        this.f44667x0 = new Rect();
        this.f44669z0 = new wd.b(new h(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        ox oxVar;
        org.telegram.ui.Components.jl0 p10;
        fy fyVar = this.A0;
        if (fyVar.f38315l3 && (oxVar = fyVar.f38377y0) != null && oxVar.getVisibility() == 0) {
            ox oxVar2 = fyVar.f38377y0;
            View[] viewArr = oxVar2.f35261e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.z71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + oxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void M() {
        super.M();
        this.A0.m3();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.l lVar;
        float f9;
        fy fyVar = this.A0;
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        float height = lVar.getHeight();
        ax axVar = fyVar.B3;
        if (axVar != null && axVar.c()) {
            f9 = fyVar.B3.f38759e;
        } else {
            f9 = 0.0f;
        }
        if (fyVar.G) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, fyVar.f38335p3, (1.0f - f9) * (1.0f - fyVar.f38355t1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f9, (1.0f - fyVar.f38355t1) * (1.0f - fyVar.f38335p3) * AndroidUtilities.dp(48.0f), height + fyVar.P);
    }

    public final int b0() {
        float f9;
        fy fyVar = this.A0;
        float f10 = fyVar.J;
        ax axVar = fyVar.B3;
        if (axVar != null && axVar.c()) {
            f9 = fyVar.B3.f38759e;
        } else {
            f9 = 0.0f;
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, fyVar.f38355t1, org.telegram.messenger.x3.y(1.0f, f9, 1.0f - fyVar.f38335p3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        fy fyVar = this.A0;
        ew ewVar = fyVar.f38362v0;
        SparseIntArray sparseIntArray = ewVar.f28236f0;
        int i11 = ewVar.G;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = sparseIntArray.get(i11 + i10, -1);
        if (i12 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        fyVar.f38301i3 = false;
        fyVar.f38296h3 = true;
        this.f44664u0 = (int) (motionEvent.getX() + fyVar.f38280e3);
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        lVar.setEnabled(false);
        fyVar.f38362v0.setEnabled(false);
        ey eyVar = fyVar.f38256a0[1];
        eyVar.h = i12;
        eyVar.setVisibility(0);
        fyVar.f38274d3 = z10;
        fy.f1(fyVar, false);
        fyVar.R4(true);
        if (z10) {
            ey[] eyVarArr = fyVar.f38256a0;
            eyVarArr[1].setTranslationX(eyVarArr[0].getMeasuredWidth());
            return true;
        }
        ey[] eyVarArr2 = fyVar.f38256a0;
        eyVarArr2[1].setTranslationX(-eyVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f44669z0.a(motionEvent, this) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        fy fyVar = this.A0;
        if (view == fyVar.G0) {
            return true;
        }
        if (org.telegram.ui.Components.hv0.f29235r0) {
            return super.drawChild(canvas, view, j10);
        }
        ey[] eyVarArr = fyVar.f38256a0;
        int i10 = 0;
        if (view != eyVarArr[0] && ((eyVarArr.length <= 1 || view != eyVarArr[1]) && view != fyVar.F1 && view != fyVar.f38362v0)) {
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (view == lVar && fyVar.T3 != 1.0f) {
                canvas.save();
                if (fyVar.U3) {
                    canvas.translate((1.0f - fyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = th.b(1.0f, fyVar.T3, 0.05f, 1.0f);
                    canvas.translate((1.0f - fyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                    if (lVar2.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(b10, b10, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (view != fyVar.F1 && view != fyVar.f38362v0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f9 = fyVar.T3;
        if (f9 != 1.0f) {
            if (fyVar.U3) {
                canvas.translate((1.0f - fyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float b11 = th.b(1.0f, f9, 0.05f, 1.0f);
                canvas.translate((1.0f - fyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(b11, b11, 0.0f, (-getY()) + fyVar.J + a0());
            }
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.n5 n5Var = this.A0.f38384z3;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5 n5Var = this.A0.f38384z3;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        ew ewVar;
        int actionMasked = motionEvent.getActionMasked();
        fy fyVar = this.A0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar.s()) {
                fyVar.U0 = true;
            }
        }
        if (Z() || (((ewVar = fyVar.f38362v0) != null && ewVar.K) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        org.telegram.ui.ActionBar.l lVar3;
        int i13;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i14;
        fy fyVar = this.A0;
        int i15 = fyVar.f38255a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = fyVar.f38298i0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof ru) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - lVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof ey) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (fyVar.B3.c()) {
                            if (fyVar.f38366w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (fyVar.G) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + fyVar.L;
                        if (fyVar.f38340q3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (fyVar.V3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        ox oxVar = fyVar.f38377y0;
                        if (childAt == oxVar) {
                            oxVar.setTranslationY(fyVar.E0);
                            fyVar.f38377y0.f32999l0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            fyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            lVar3 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + lVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            qw qwVar = fyVar.f38373x1;
                            if (qwVar != null && qwVar.u0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == fyVar.B3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (fyVar.V3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                fyVar.B3.setTransitionPaddingBottom(i12);
                                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i12), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.f44668y0) {
            post(new wx(this, 1));
            this.f44668y0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        fy fyVar = this.A0;
        if (fyVar.f38301i3 && !fyVar.f38296h3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
