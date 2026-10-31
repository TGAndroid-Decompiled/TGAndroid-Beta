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
public final class tx extends org.telegram.ui.Components.uu0 {
    public final Paint f41960f0;
    public int f41961g0;
    public int f41962h0;
    public int f41963i0;
    public VelocityTracker f41964j0;
    public final Rect f41965k0;
    public boolean f41966l0;
    public final ge.b m0;
    public final ay f41967n0;

    public tx(Context context, ay ayVar) {
        super(context, null);
        this.f41967n0 = ayVar;
        this.f41960f0 = new Paint(1);
        this.f41965k0 = new Rect();
        this.m0 = new ge.b(new e(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tx.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        kx kxVar;
        org.telegram.ui.Components.tk0 p5;
        ay ayVar = this.f41967n0;
        if (ayVar.f35856q3 && (kxVar = ayVar.C0) != null && kxVar.getVisibility() == 0) {
            kx kxVar2 = ayVar.C0;
            View[] viewArr = kxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.w71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < org.telegram.messenger.i0.L(100.0f) + org.telegram.messenger.i0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + kxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void L() {
        ei.r rVar;
        org.telegram.messenger.tz.f();
        rVar = ((org.telegram.ui.ActionBar.k2) this.f41967n0).glassEngine;
        rVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tx.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.l lVar;
        float f7;
        ay ayVar = this.f41967n0;
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        float height = lVar.getHeight();
        xw xwVar = ayVar.F3;
        if (xwVar != null && xwVar.c()) {
            f7 = ayVar.F3.e;
        } else {
            f7 = 0.0f;
        }
        if (ayVar.K) {
            height = c3.i0.z(1.0f, ayVar.f35878u3, (1.0f - f7) * (1.0f - ayVar.f35893x1) * org.telegram.messenger.i0.L(81.0f), height);
        }
        return (int) c3.i0.z(1.0f, f7, (1.0f - ayVar.f35893x1) * (1.0f - ayVar.f35878u3) * org.telegram.messenger.i0.L(48.0f), height + ayVar.T);
    }

    public final int Z() {
        float f7;
        ay ayVar = this.f41967n0;
        float f10 = ayVar.N;
        xw xwVar = ayVar.F3;
        if (xwVar != null && xwVar.c()) {
            f7 = ayVar.F3.e;
        } else {
            f7 = 0.0f;
        }
        return (int) c3.i0.z(1.0f, ayVar.f35893x1, org.telegram.messenger.m5.A(1.0f, f7, 1.0f - ayVar.f35878u3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.l lVar;
        zx[] zxVarArr;
        zx[] zxVarArr2;
        ay ayVar = this.f41967n0;
        qx qxVar = ayVar.f35900z0;
        SparseIntArray sparseIntArray = qxVar.f30714j0;
        int i11 = qxVar.K;
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
        ayVar.f35841n3 = false;
        ayVar.f35835m3 = true;
        this.f41962h0 = (int) (motionEvent.getX() + ayVar.f35823j3);
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        lVar.setEnabled(false);
        ayVar.f35900z0.setEnabled(false);
        zx zxVar = ayVar.f35794e0[1];
        zxVar.h = i12;
        zxVar.setVisibility(0);
        ayVar.f35818i3 = z10;
        ay.i1(ayVar, false);
        ayVar.c5(true);
        if (z10) {
            ayVar.f35794e0[1].setTranslationX(zxVarArr2[0].getMeasuredWidth());
            return true;
        }
        ayVar.f35794e0[1].setTranslationX(-zxVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tx.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.m0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ay ayVar = this.f41967n0;
        if (view == ayVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.uu0.f31048e0) {
            return super.drawChild(canvas, view, j10);
        }
        zx[] zxVarArr = ayVar.f35794e0;
        int i10 = 0;
        if (view != zxVarArr[0] && ((zxVarArr.length <= 1 || view != zxVarArr[1]) && view != ayVar.J1 && view != ayVar.f35900z0)) {
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (view == lVar && ayVar.W3 != 1.0f) {
                canvas.save();
                if (ayVar.X3) {
                    canvas.translate((1.0f - ayVar.W3) * org.telegram.messenger.i0.L(40.0f) * (-1), 0.0f);
                } else {
                    float z10 = sc.e.z(1.0f, ayVar.W3, 0.05f, 1.0f);
                    canvas.translate((1.0f - ayVar.W3) * (-org.telegram.messenger.i0.L(4.0f)), 0.0f);
                    lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                    if (lVar2.getOccupyStatusBar()) {
                        i10 = org.telegram.messenger.i0.f16020m;
                    }
                    canvas.scale(z10, z10, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (view != ayVar.J1 && view != ayVar.f35900z0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f7 = ayVar.W3;
        if (f7 != 1.0f) {
            if (ayVar.X3) {
                canvas.translate((1.0f - ayVar.W3) * org.telegram.messenger.i0.L(40.0f) * (-1), 0.0f);
            } else {
                float z11 = sc.e.z(1.0f, f7, 0.05f, 1.0f);
                canvas.translate((1.0f - ayVar.W3) * (-org.telegram.messenger.i0.L(4.0f)), 0.0f);
                canvas.scale(z11, z11, 0.0f, (-getY()) + ayVar.N + Y());
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
        org.telegram.ui.Components.d5 d5Var = this.f41967n0.D3;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.d5 d5Var = this.f41967n0.D3;
        if (d5Var != null) {
            d5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        qx qxVar;
        int actionMasked = motionEvent.getActionMasked();
        ay ayVar = this.f41967n0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar.u()) {
                ayVar.Y0 = true;
            }
        }
        if (X() || (((qxVar = ayVar.f35900z0) != null && qxVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tx.onLayout(boolean, int, int, int, int):void");
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
        ay ayVar = this.f41967n0;
        int i15 = ayVar.f35772a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.t0 t0Var = ayVar.m0;
        if (t0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar5.getOccupyStatusBar()) {
                i14 = org.telegram.messenger.i0.f16020m;
            } else {
                i14 = 0;
            }
            layoutParams.topMargin = i14;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof ou) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int L = org.telegram.messenger.i0.L(10.0f);
                        int L2 = org.telegram.messenger.i0.L(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - lVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof zx) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.i0.L(2.0f) + size2;
                        if (ayVar.F3.c()) {
                            if (ayVar.f35891x) {
                                L3 = org.telegram.messenger.i0.L(50.0f) + L3;
                            }
                            if (ayVar.K) {
                                L3 = org.telegram.messenger.i0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.i0.L(48.0f) + L3;
                        }
                        int i17 = L3 + ayVar.P;
                        if (ayVar.f35883v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (ayVar.Y3) {
                            i13 = (int) (i17 * 0.05f);
                        } else {
                            i13 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i13);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), i17 + i13), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        kx kxVar = ayVar.C0;
                        if (childAt == kxVar) {
                            kxVar.setTranslationY(ayVar.I0);
                            ayVar.C0.f26464r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i15) + View.MeasureSpec.getSize(i11), 1073741824);
                            ayVar.R3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.i0.Q;
                            lVar3 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            rect.set(0, (org.telegram.messenger.i0.L(i15) + lVar3.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ow owVar = ayVar.B1;
                            if (owVar != null && owVar.r0(childAt)) {
                                if (org.telegram.messenger.i0.E) {
                                    if (org.telegram.messenger.i0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.i0.f16020m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.i0.f16020m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == ayVar.F3) {
                                int size4 = View.MeasureSpec.getSize(i11);
                                if (ayVar.Y3) {
                                    i12 = (int) (size4 * 0.05f);
                                } else {
                                    i12 = 0;
                                }
                                ayVar.F3.setTransitionPaddingBottom(i12);
                                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), size4 + i12), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.f41966l0) {
            post(new sx(this, 1));
            this.f41966l0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ay ayVar = this.f41967n0;
        if (ayVar.f35841n3 && !ayVar.f35835m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
