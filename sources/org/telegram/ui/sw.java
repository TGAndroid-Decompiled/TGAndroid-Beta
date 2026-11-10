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
public final class sw extends org.telegram.ui.Components.st0 {
    public final Paint f49963f0;
    public int f49964g0;
    public int f49965h0;
    public int f49966i0;
    public VelocityTracker f49967j0;
    public final Rect f49968k0;
    public boolean f49969l0;
    public final org.telegram.ui.Cells.l9 m0;
    public final zw f49970n0;

    public sw(Context context, zw zwVar) {
        super(context, null);
        this.f49970n0 = zwVar;
        this.f49963f0 = new Paint(1);
        this.f49968k0 = new Rect();
        this.m0 = new org.telegram.ui.Cells.l9(new f(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        iw iwVar;
        org.telegram.ui.Components.pj0 p10;
        zw zwVar = this.f49970n0;
        if (zwVar.f52643r3 && (iwVar = zwVar.C0) != null && iwVar.getVisibility() == 0) {
            iw iwVar2 = zwVar.C0;
            View[] viewArr = iwVar2.f38893e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.v61.p(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < p10.getChildCount(); i10++) {
                        View childAt = p10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + p10.getY() + viewArr[i7].getY() + iwVar2.getY());
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
        oi.q qVar;
        org.telegram.messenger.iz.f();
        qVar = ((org.telegram.ui.ActionBar.f2) this.f49970n0).glassEngine;
        qVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.l lVar;
        float f10;
        zw zwVar = this.f49970n0;
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        float height = lVar.getHeight();
        vv vvVar = zwVar.G3;
        if (vvVar != null && vvVar.c()) {
            f10 = zwVar.G3.f43847e;
        } else {
            f10 = 0.0f;
        }
        if (zwVar.K) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, zwVar.f52664v3, (1.0f - f10) * (1.0f - zwVar.f52680y1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - zwVar.f52680y1) * (1.0f - zwVar.f52664v3) * org.telegram.messenger.g0.L(48.0f), height + zwVar.T);
    }

    public final int Z() {
        float f10;
        zw zwVar = this.f49970n0;
        float f11 = zwVar.N;
        vv vvVar = zwVar.G3;
        if (vvVar != null && vvVar.c()) {
            f10 = zwVar.G3.f43847e;
        } else {
            f10 = 0.0f;
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, zwVar.f52680y1, org.telegram.messenger.k5.A(1.0f, f10, 1.0f - zwVar.f52664v3, f11), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.l lVar;
        yw[] ywVarArr;
        yw[] ywVarArr2;
        zw zwVar = this.f49970n0;
        pw pwVar = zwVar.f52683z0;
        SparseIntArray sparseIntArray = pwVar.f33377j0;
        int i10 = pwVar.K;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        zwVar.f52628o3 = false;
        zwVar.f52623n3 = true;
        this.f49965h0 = (int) (motionEvent.getX() + zwVar.f52610k3);
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        lVar.setEnabled(false);
        zwVar.f52683z0.setEnabled(false);
        yw ywVar = zwVar.f52577e0[1];
        ywVar.h = i11;
        ywVar.setVisibility(0);
        zwVar.j3 = z9;
        zw.j1(zwVar, false);
        zwVar.d5(true);
        if (z9) {
            zwVar.f52577e0[1].setTranslationX(ywVarArr2[0].getMeasuredWidth());
            return true;
        }
        zwVar.f52577e0[1].setTranslationX(-ywVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.m0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zw zwVar = this.f49970n0;
        if (view == zwVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.st0.f38060e0) {
            return super.drawChild(canvas, view, j3);
        }
        yw[] ywVarArr = zwVar.f52577e0;
        int i7 = 0;
        if (view != ywVarArr[0] && ((ywVarArr.length <= 1 || view != ywVarArr[1]) && view != zwVar.K1 && view != zwVar.f52683z0)) {
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (view == lVar && zwVar.X3 != 1.0f) {
                canvas.save();
                if (zwVar.Y3) {
                    canvas.translate((1.0f - zwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float v = com.google.android.recaptcha.internal.a.v(1.0f, zwVar.X3, 0.05f, 1.0f);
                    canvas.translate((1.0f - zwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                    if (lVar2.getOccupyStatusBar()) {
                        i7 = org.telegram.messenger.g0.f22561m;
                    }
                    canvas.scale(v, v, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + i7);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (view != zwVar.K1 && view != zwVar.f52683z0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = zwVar.X3;
        if (f10 != 1.0f) {
            if (zwVar.Y3) {
                canvas.translate((1.0f - zwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
            } else {
                float v10 = com.google.android.recaptcha.internal.a.v(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - zwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                canvas.scale(v10, v10, 0.0f, (-getY()) + zwVar.N + Y());
            }
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
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
        org.telegram.ui.Components.f5 f5Var = this.f49970n0.E3;
        if (f5Var != null) {
            f5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.f5 f5Var = this.f49970n0.E3;
        if (f5Var != null) {
            f5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        pw pwVar;
        int actionMasked = motionEvent.getActionMasked();
        zw zwVar = this.f49970n0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar.x()) {
                zwVar.Z0 = true;
            }
        }
        if (X() || (((pwVar = zwVar.f52683z0) != null && pwVar.O) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        org.telegram.ui.ActionBar.l lVar3;
        int i12;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        int i13;
        zw zwVar = this.f49970n0;
        int i14 = zwVar.f52554a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z9 = true;
        } else {
            z9 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.r0 r0Var = zwVar.m0;
        if (r0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar5.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f22561m;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        measureChildWithMargins(lVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof pt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - lVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof yw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (zwVar.G3.c()) {
                            if (zwVar.f52672x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (zwVar.K) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i16 = L3 + zwVar.P;
                        if (zwVar.f52670w3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (zwVar.Z3) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        iw iwVar = zwVar.C0;
                        if (childAt == iwVar) {
                            iwVar.setTranslationY(zwVar.I0);
                            zwVar.C0.f33603r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            zwVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            lVar3 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i14) + lVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            mv mvVar = zwVar.C1;
                            if (mvVar != null && mvVar.t0(childAt)) {
                                if (org.telegram.messenger.g0.E) {
                                    if (org.telegram.messenger.g0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.f22561m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f22561m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == zwVar.G3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (zwVar.Z3) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                zwVar.G3.setTransitionPaddingBottom(i11);
                                childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i11), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i7, 0, i10, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z9 != this.f49969l0) {
            post(new rw(this, 1));
            this.f49969l0 = z9;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        zw zwVar = this.f49970n0;
        if (zwVar.f52628o3 && !zwVar.f52623n3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}
