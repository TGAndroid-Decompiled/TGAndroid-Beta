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
public final class vx extends org.telegram.ui.Components.xu0 {
    public final dy A0;
    public final Paint f43596s0;
    public int f43597t0;
    public int f43598u0;
    public int f43599v0;
    public VelocityTracker f43600w0;
    public final Rect f43601x0;
    public boolean f43602y0;
    public final ud.b f43603z0;

    public vx(Context context, dy dyVar) {
        super(context, null);
        this.A0 = dyVar;
        this.f43596s0 = new Paint(1);
        this.f43601x0 = new Rect();
        this.f43603z0 = new ud.b(new g(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        mx mxVar;
        org.telegram.ui.Components.wk0 p6;
        dy dyVar = this.A0;
        if (dyVar.f37688l3 && (mxVar = dyVar.f37750y0) != null && mxVar.getVisibility() == 0) {
            mx mxVar2 = dyVar.f37750y0;
            View[] viewArr = mxVar2.f31035e;
            for (int i9 = 0; i9 < viewArr.length; i9++) {
                View view = viewArr[i9];
                if (view != null && view.getVisibility() == 0 && (p6 = org.telegram.ui.Components.n71.p(viewArr[i9])) != null) {
                    for (int i10 = 0; i10 < p6.getChildCount(); i10++) {
                        View childAt = p6.getChildAt(i10);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i9].getX(), childAt.getY() + p6.getY() + viewArr[i9].getY() + mxVar2.getY());
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        dy dyVar = this.A0;
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        float height = kVar.getHeight();
        yw ywVar = dyVar.B3;
        if (ywVar != null && ywVar.c()) {
            f10 = dyVar.B3.f38664e;
        } else {
            f10 = 0.0f;
        }
        if (dyVar.G) {
            height = e2.c.z(1.0f, dyVar.f37708p3, (1.0f - f10) * (1.0f - dyVar.f37728t1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) e2.c.z(1.0f, f10, (1.0f - dyVar.f37728t1) * (1.0f - dyVar.f37708p3) * AndroidUtilities.dp(48.0f), height + dyVar.P);
    }

    public final int b0() {
        float f10;
        dy dyVar = this.A0;
        float f11 = dyVar.J;
        yw ywVar = dyVar.B3;
        if (ywVar != null && ywVar.c()) {
            f10 = dyVar.B3.f38664e;
        } else {
            f10 = 0.0f;
        }
        return (int) e2.c.z(1.0f, dyVar.f37728t1, org.telegram.messenger.l0.y(1.0f, f10, 1.0f - dyVar.f37708p3, f11), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i9;
        org.telegram.ui.ActionBar.k kVar;
        dy dyVar = this.A0;
        cw cwVar = dyVar.f37735v0;
        SparseIntArray sparseIntArray = cwVar.f34040f0;
        int i10 = cwVar.G;
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i9, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        dyVar.f37674i3 = false;
        dyVar.f37669h3 = true;
        this.f43598u0 = (int) (motionEvent.getX() + dyVar.f37653e3);
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        kVar.setEnabled(false);
        dyVar.f37735v0.setEnabled(false);
        cy cyVar = dyVar.f37629a0[1];
        cyVar.h = i11;
        cyVar.setVisibility(0);
        dyVar.f37647d3 = z10;
        dy.f1(dyVar, false);
        dyVar.R4(true);
        if (z10) {
            cy[] cyVarArr = dyVar.f37629a0;
            cyVarArr[1].setTranslationX(cyVarArr[0].getMeasuredWidth());
            return true;
        }
        cy[] cyVarArr2 = dyVar.f37629a0;
        cyVarArr2[1].setTranslationX(-cyVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f43603z0.a(motionEvent, this) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        dy dyVar = this.A0;
        if (view == dyVar.G0) {
            return true;
        }
        if (org.telegram.ui.Components.xu0.f34770r0) {
            return super.drawChild(canvas, view, j10);
        }
        cy[] cyVarArr = dyVar.f37629a0;
        int i9 = 0;
        if (view != cyVarArr[0] && ((cyVarArr.length <= 1 || view != cyVarArr[1]) && view != dyVar.F1 && view != dyVar.f37735v0)) {
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (view == kVar && dyVar.T3 != 1.0f) {
                canvas.save();
                if (dyVar.U3) {
                    canvas.translate((1.0f - dyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float C = j3.r0.C(1.0f, dyVar.T3, 0.05f, 1.0f);
                    canvas.translate((1.0f - dyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i9 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(C, C, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i9);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (view != dyVar.F1 && view != dyVar.f37735v0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = dyVar.T3;
        if (f10 != 1.0f) {
            if (dyVar.U3) {
                canvas.translate((1.0f - dyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float C2 = j3.r0.C(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - dyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(C2, C2, 0.0f, (-getY()) + dyVar.J + a0());
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
        org.telegram.ui.Components.i5 i5Var = this.A0.f37757z3;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i5 i5Var = this.A0.f37757z3;
        if (i5Var != null) {
            i5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        cw cwVar;
        int actionMasked = motionEvent.getActionMasked();
        dy dyVar = this.A0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar.s()) {
                dyVar.U0 = true;
            }
        }
        if (Z() || (((cwVar = dyVar.f37735v0) != null && cwVar.K) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        int i12;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        dy dyVar = this.A0;
        int i14 = dyVar.f37628a;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = dyVar.f37671i0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i13 = AndroidUtilities.statusBarHeight;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        measureChildWithMargins(kVar, i9, 0, i10, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof qu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof cy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (dyVar.B3.c()) {
                            if (dyVar.f37739w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (dyVar.G) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i16 = dp3 + dyVar.L;
                        if (dyVar.f37713q3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (dyVar.V3) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        mx mxVar = dyVar.f37750y0;
                        if (childAt == mxVar) {
                            mxVar.setTranslationY(dyVar.E0);
                            dyVar.f37750y0.f29146l0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            dyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i14) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ow owVar = dyVar.f37746x1;
                            if (owVar != null && owVar.t0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == dyVar.B3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (dyVar.V3) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                dyVar.B3.setTransitionPaddingBottom(i11);
                                childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i11), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i9, 0, i10, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.f43602y0) {
            post(new ux(this, 1));
            this.f43602y0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        dy dyVar = this.A0;
        if (dyVar.f37674i3 && !dyVar.f37669h3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
