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
public final class wx extends org.telegram.ui.Components.jw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final oe.b D0;
    public final ey E0;
    public final Paint f42945w0;
    public int f42946x0;
    public int f42947y0;
    public int f42948z0;

    public wx(Context context, ey eyVar) {
        super(context, null);
        this.E0 = eyVar;
        this.f42945w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new oe.b(new g(this, 15));
    }

    @Override
    public final void J(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.J(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        nx nxVar;
        org.telegram.ui.Components.im0 p5;
        ey eyVar = this.E0;
        if (eyVar.f36692q3 && (nxVar = eyVar.C0) != null && nxVar.getVisibility() == 0) {
            nx nxVar2 = eyVar.C0;
            View[] viewArr = nxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.c91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + nxVar2.getY());
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
        this.E0.j3();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.Z():boolean");
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        float f7;
        ey eyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        float height = kVar.getHeight();
        yw ywVar = eyVar.G3;
        if (ywVar != null && ywVar.c()) {
            f7 = eyVar.G3.e;
        } else {
            f7 = 0.0f;
        }
        if (eyVar.K) {
            height = com.google.android.gms.internal.cast.a6.x(1.0f, eyVar.f36714u3, (1.0f - f7) * (1.0f - eyVar.f36729x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.cast.a6.x(1.0f, f7, (1.0f - eyVar.f36729x1) * (1.0f - eyVar.f36714u3) * AndroidUtilities.dp(48.0f), height + eyVar.T);
    }

    public final int b0() {
        float f7;
        ey eyVar = this.E0;
        float f10 = eyVar.N;
        yw ywVar = eyVar.G3;
        if (ywVar != null && ywVar.c()) {
            f7 = eyVar.G3.e;
        } else {
            f7 = 0.0f;
        }
        return (int) com.google.android.gms.internal.cast.a6.x(1.0f, eyVar.f36729x1, org.telegram.messenger.q.z(1.0f, f7, 1.0f - eyVar.f36714u3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        dy[] dyVarArr;
        dy[] dyVarArr2;
        ey eyVar = this.E0;
        cw cwVar = eyVar.f36736z0;
        SparseIntArray sparseIntArray = cwVar.f30104j0;
        int i11 = cwVar.K;
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
        eyVar.f36677n3 = false;
        eyVar.f36671m3 = true;
        this.f42947y0 = (int) (motionEvent.getX() + eyVar.f36659j3);
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        kVar.setEnabled(false);
        eyVar.f36736z0.setEnabled(false);
        dy dyVar = eyVar.f36630e0[1];
        dyVar.h = i12;
        dyVar.setVisibility(0);
        eyVar.f36654i3 = z10;
        ey.c1(eyVar, false);
        eyVar.P4(true);
        if (z10) {
            eyVar.f36630e0[1].setTranslationX(dyVarArr2[0].getMeasuredWidth());
            return true;
        }
        eyVar.f36630e0[1].setTranslationX(-dyVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.D0.a(motionEvent, this) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.E0;
        if (view == eyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.jw0.f27610v0) {
            return super.drawChild(canvas, view, j10);
        }
        dy[] dyVarArr = eyVar.f36630e0;
        int i10 = 0;
        if (view != dyVarArr[0] && ((dyVarArr.length <= 1 || view != dyVarArr[1]) && view != eyVar.J1 && view != eyVar.f36736z0)) {
            kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
            if (view == kVar && eyVar.X3 != 1.0f) {
                canvas.save();
                if (eyVar.Y3) {
                    canvas.translate((1.0f - eyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float D = com.google.android.gms.internal.cast.a6.D(1.0f, eyVar.X3, 0.05f, 1.0f);
                    canvas.translate((1.0f - eyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    }
                    canvas.scale(D, D, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (view != eyVar.J1 && view != eyVar.f36736z0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = eyVar.X3;
        if (f7 != 1.0f) {
            if (eyVar.Y3) {
                canvas.translate((1.0f - eyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float D2 = com.google.android.gms.internal.cast.a6.D(1.0f, f7, 0.05f, 1.0f);
                canvas.translate((1.0f - eyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(D2, D2, 0.0f, (-getY()) + eyVar.N + a0());
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
        org.telegram.ui.Components.p5 p5Var = this.E0.E3;
        if (p5Var != null) {
            p5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5 p5Var = this.E0.E3;
        if (p5Var != null) {
            p5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        cw cwVar;
        int actionMasked = motionEvent.getActionMasked();
        ey eyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
            if (kVar.s()) {
                eyVar.Y0 = true;
            }
        }
        if (Z() || (((cwVar = eyVar.f36736z0) != null && cwVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        int i13;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i14;
        ey eyVar = this.E0;
        int i15 = eyVar.f36608a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.u0 u0Var = eyVar.m0;
        if (u0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof pu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof dy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (eyVar.G3.c()) {
                            if (eyVar.f36721w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (eyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i17 = dp3 + eyVar.P;
                        if (eyVar.f36719v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (eyVar.Z3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        nx nxVar = eyVar.C0;
                        if (childAt == nxVar) {
                            nxVar.setTranslationY(eyVar.I0);
                            eyVar.C0.f31353p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            eyVar.E3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i15) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ow owVar = eyVar.B1;
                            if (owVar != null && owVar.s0(childAt)) {
                                if (AndroidUtilities.isInMultiwindow) {
                                    if (AndroidUtilities.isTablet()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == eyVar.G3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (eyVar.Z3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                eyVar.G3.setTransitionPaddingBottom(i12);
                                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i12), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.C0) {
            post(new vx(this, 1));
            this.C0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ey eyVar = this.E0;
        if (eyVar.f36677n3 && !eyVar.f36671m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
