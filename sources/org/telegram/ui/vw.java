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
public final class vw extends org.telegram.ui.Components.du0 {
    public final Paint f52899g0;
    public int f52900h0;
    public int f52901i0;
    public int f52902j0;
    public VelocityTracker f52903k0;
    public final Rect f52904l0;
    public boolean m0;
    public final org.telegram.ui.Cells.m9 f52905n0;
    public final cx f52906o0;

    public vw(Context context, cx cxVar) {
        super(context, null);
        this.f52906o0 = cxVar;
        this.f52899g0 = new Paint(1);
        this.f52904l0 = new Rect();
        this.f52905n0 = new org.telegram.ui.Cells.m9(new f(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        kw kwVar;
        org.telegram.ui.Components.ek0 k10;
        cx cxVar = this.f52906o0;
        if (cxVar.f46788s3 && (kwVar = cxVar.D0) != null && kwVar.getVisibility() == 0) {
            kw kwVar2 = cxVar.D0;
            View[] viewArr = kwVar2.f36435e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (k10 = org.telegram.ui.Components.j71.k(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < k10.getChildCount(); i10++) {
                        View childAt = k10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + k10.getY() + viewArr[i7].getY() + kwVar2.getY());
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
        org.telegram.messenger.cz.f();
        qVar = ((org.telegram.ui.ActionBar.g2) this.f52906o0).glassEngine;
        qVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        cx cxVar = this.f52906o0;
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        float height = kVar.getHeight();
        xv xvVar = cxVar.H3;
        if (xvVar != null && xvVar.c()) {
            f10 = cxVar.H3.f54337e;
        } else {
            f10 = 0.0f;
        }
        if (cxVar.L) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, cxVar.f46809w3, (1.0f - f10) * (1.0f - cxVar.f46824z1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, (1.0f - cxVar.f46824z1) * (1.0f - cxVar.f46809w3) * org.telegram.messenger.g0.L(48.0f), height + cxVar.U);
    }

    public final int Z() {
        float f10;
        cx cxVar = this.f52906o0;
        float f11 = cxVar.O;
        xv xvVar = cxVar.H3;
        if (xvVar != null && xvVar.c()) {
            f10 = cxVar.H3.f54337e;
        } else {
            f10 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, cxVar.f46824z1, org.telegram.messenger.f3.A(1.0f, f10, 1.0f - cxVar.f46809w3, f11), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        bx[] bxVarArr;
        bx[] bxVarArr2;
        cx cxVar = this.f52906o0;
        rw rwVar = cxVar.A0;
        SparseIntArray sparseIntArray = rwVar.f39406k0;
        int i10 = rwVar.L;
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
        cxVar.f46771p3 = false;
        cxVar.f46767o3 = true;
        this.f52901i0 = (int) (motionEvent.getX() + cxVar.f46753l3);
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        kVar.setEnabled(false);
        cxVar.A0.setEnabled(false);
        bx bxVar = cxVar.f46722f0[1];
        bxVar.h = i11;
        bxVar.setVisibility(0);
        cxVar.f46749k3 = z10;
        cx.i1(cxVar, false);
        cxVar.l5(true);
        if (z10) {
            cxVar.f46722f0[1].setTranslationX(bxVarArr2[0].getMeasuredWidth());
            return true;
        }
        cxVar.f46722f0[1].setTranslationX(-bxVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f52905n0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cx cxVar = this.f52906o0;
        if (view == cxVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.du0.f34573f0) {
            return super.drawChild(canvas, view, j3);
        }
        bx[] bxVarArr = cxVar.f46722f0;
        int i7 = 0;
        if (view != bxVarArr[0] && ((bxVarArr.length <= 1 || view != bxVarArr[1]) && view != cxVar.L1 && view != cxVar.A0)) {
            kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            if (view == kVar && cxVar.f46704b4 != 1.0f) {
                canvas.save();
                if (cxVar.f46710c4) {
                    canvas.translate((1.0f - cxVar.f46704b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, cxVar.f46704b4, 0.05f, 1.0f);
                    canvas.translate((1.0f - cxVar.f46704b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i7 = org.telegram.messenger.g0.f24040m;
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
        if (view != cxVar.L1 && view != cxVar.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = cxVar.f46704b4;
        if (f10 != 1.0f) {
            if (cxVar.f46710c4) {
                canvas.translate((1.0f - cxVar.f46704b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
            } else {
                float t10 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - cxVar.f46704b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                canvas.scale(t10, t10, 0.0f, (-getY()) + cxVar.O + Y());
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
        org.telegram.ui.Components.n5 n5Var = this.f52906o0.F3;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5 n5Var = this.f52906o0.F3;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        rw rwVar;
        int actionMasked = motionEvent.getActionMasked();
        cx cxVar = this.f52906o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            if (kVar.x()) {
                cxVar.f46695a1 = true;
            }
        }
        if (X() || (((rwVar = cxVar.A0) != null && rwVar.P) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.onLayout(boolean, int, int, int, int):void");
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
        cx cxVar = this.f52906o0;
        int i14 = cxVar.f46693a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = cxVar.f46760n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f24040m;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof rt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof bx) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (cxVar.H3.c()) {
                            if (cxVar.f46811x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (cxVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i16 = L3 + cxVar.Q;
                        if (cxVar.f46815x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (cxVar.f46714d4) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        kw kwVar = cxVar.D0;
                        if (childAt == kwVar) {
                            kwVar.setTranslationY(cxVar.J0);
                            cxVar.D0.f40516s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            cxVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i14) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            nv nvVar = cxVar.D1;
                            if (nvVar != null && nvVar.T0(childAt)) {
                                if (org.telegram.messenger.g0.E) {
                                    if (org.telegram.messenger.g0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.f24040m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f24040m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == cxVar.H3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (cxVar.f46714d4) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                cxVar.H3.setTransitionPaddingBottom(i11);
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
            post(new uw(this, 1));
            this.m0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        cx cxVar = this.f52906o0;
        if (cxVar.f46771p3 && !cxVar.f46767o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
