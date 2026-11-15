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
public final class rw extends org.telegram.ui.Components.st0 {
    public final Paint f51035g0;
    public int f51036h0;
    public int f51037i0;
    public int f51038j0;
    public VelocityTracker f51039k0;
    public final Rect f51040l0;
    public boolean m0;
    public final org.telegram.ui.Cells.k9 f51041n0;
    public final yw f51042o0;

    public rw(Context context, yw ywVar) {
        super(context, null);
        this.f51042o0 = ywVar;
        this.f51035g0 = new Paint(1);
        this.f51040l0 = new Rect();
        this.f51041n0 = new org.telegram.ui.Cells.k9(new f(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rw.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        hw hwVar;
        org.telegram.ui.Components.uj0 m10;
        yw ywVar = this.f51042o0;
        if (ywVar.f53739s3 && (hwVar = ywVar.D0) != null && hwVar.getVisibility() == 0) {
            hw hwVar2 = ywVar.D0;
            View[] viewArr = hwVar2.f41297e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (m10 = org.telegram.ui.Components.w61.m(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < m10.getChildCount(); i10++) {
                        View childAt = m10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + m10.getY() + viewArr[i7].getY() + hwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void K() {
        ri.q qVar;
        org.telegram.messenger.gz.f();
        qVar = ((org.telegram.ui.ActionBar.e2) this.f51042o0).glassEngine;
        qVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rw.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        yw ywVar = this.f51042o0;
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        float height = kVar.getHeight();
        uv uvVar = ywVar.H3;
        if (uvVar != null && uvVar.c()) {
            f10 = ywVar.H3.f52060e;
        } else {
            f10 = 0.0f;
        }
        if (ywVar.L) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, ywVar.f53760w3, (1.0f - f10) * (1.0f - ywVar.f53775z1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, (1.0f - ywVar.f53775z1) * (1.0f - ywVar.f53760w3) * org.telegram.messenger.g0.L(48.0f), height + ywVar.U);
    }

    public final int Z() {
        float f10;
        yw ywVar = this.f51042o0;
        float f11 = ywVar.O;
        uv uvVar = ywVar.H3;
        if (uvVar != null && uvVar.c()) {
            f10 = ywVar.H3.f52060e;
        } else {
            f10 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, ywVar.f53775z1, org.telegram.messenger.k5.A(1.0f, f10, 1.0f - ywVar.f53760w3, f11), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        xw[] xwVarArr;
        xw[] xwVarArr2;
        yw ywVar = this.f51042o0;
        ow owVar = ywVar.A0;
        SparseIntArray sparseIntArray = owVar.f35796k0;
        int i10 = owVar.L;
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ywVar.f53722p3 = false;
        ywVar.f53718o3 = true;
        this.f51037i0 = (int) (motionEvent.getX() + ywVar.f53704l3);
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        kVar.setEnabled(false);
        ywVar.A0.setEnabled(false);
        xw xwVar = ywVar.f53673f0[1];
        xwVar.h = i11;
        xwVar.setVisibility(0);
        ywVar.f53700k3 = z10;
        yw.j1(ywVar, false);
        ywVar.d5(true);
        if (z10) {
            ywVar.f53673f0[1].setTranslationX(xwVarArr2[0].getMeasuredWidth());
            return true;
        }
        ywVar.f53673f0[1].setTranslationX(-xwVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f51041n0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.f51042o0;
        if (view == ywVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.st0.f39409f0) {
            return super.drawChild(canvas, view, j3);
        }
        xw[] xwVarArr = ywVar.f53673f0;
        int i7 = 0;
        if (view != xwVarArr[0] && ((xwVarArr.length <= 1 || view != xwVarArr[1]) && view != ywVar.L1 && view != ywVar.A0)) {
            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (view == kVar && ywVar.Y3 != 1.0f) {
                canvas.save();
                if (ywVar.Z3) {
                    canvas.translate((1.0f - ywVar.Y3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, ywVar.Y3, 0.05f, 1.0f);
                    canvas.translate((1.0f - ywVar.Y3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i7 = org.telegram.messenger.g0.f23603m;
                    }
                    canvas.scale(t6, t6, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + i7);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (view != ywVar.L1 && view != ywVar.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = ywVar.Y3;
        if (f10 != 1.0f) {
            if (ywVar.Z3) {
                canvas.translate((1.0f - ywVar.Y3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
            } else {
                float t10 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - ywVar.Y3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                canvas.scale(t10, t10, 0.0f, (-getY()) + ywVar.O + Y());
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
        org.telegram.ui.Components.e5 e5Var = this.f51042o0.F3;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5 e5Var = this.f51042o0.F3;
        if (e5Var != null) {
            e5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        ow owVar;
        int actionMasked = motionEvent.getActionMasked();
        yw ywVar = this.f51042o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (kVar.x()) {
                ywVar.f53646a1 = true;
            }
        }
        if (X() || (((owVar = ywVar.A0) != null && owVar.P) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rw.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        int i12;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        int i13;
        yw ywVar = this.f51042o0;
        int i14 = ywVar.f53644a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = ywVar.f53711n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f23603m;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof pt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof xw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (ywVar.H3.c()) {
                            if (ywVar.f53762x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (ywVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i16 = L3 + ywVar.Q;
                        if (ywVar.f53766x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (ywVar.f53649a4) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        hw hwVar = ywVar.D0;
                        if (childAt == hwVar) {
                            hwVar.setTranslationY(ywVar.J0);
                            ywVar.D0.f36063s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            ywVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i14) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            kv kvVar = ywVar.D1;
                            if (kvVar != null && kvVar.H0(childAt)) {
                                if (org.telegram.messenger.g0.E) {
                                    if (org.telegram.messenger.g0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.f23603m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f23603m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == ywVar.H3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (ywVar.f53649a4) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                ywVar.H3.setTransitionPaddingBottom(i11);
                                childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i11), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i7, 0, i10, 0);
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.m0) {
            post(new qw(this, 1));
            this.m0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        yw ywVar = this.f51042o0;
        if (ywVar.f53722p3 && !ywVar.f53718o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
