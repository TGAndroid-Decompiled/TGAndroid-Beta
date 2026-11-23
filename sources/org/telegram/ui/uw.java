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
public final class uw extends org.telegram.ui.Components.cu0 {
    public final Paint f52734g0;
    public int f52735h0;
    public int f52736i0;
    public int f52737j0;
    public VelocityTracker f52738k0;
    public final Rect f52739l0;
    public boolean m0;
    public final org.telegram.ui.Cells.l9 f52740n0;
    public final bx f52741o0;

    public uw(Context context, bx bxVar) {
        super(context, null);
        this.f52741o0 = bxVar;
        this.f52734g0 = new Paint(1);
        this.f52739l0 = new Rect();
        this.f52740n0 = new org.telegram.ui.Cells.l9(new f(this, 14));
    }

    @Override
    public final void H(android.graphics.Canvas r10, float r11, android.graphics.Rect r12, android.graphics.Paint r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.H(android.graphics.Canvas, float, android.graphics.Rect, android.graphics.Paint, boolean):void");
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        jw jwVar;
        org.telegram.ui.Components.ek0 m10;
        bx bxVar = this.f52741o0;
        if (bxVar.f46615s3 && (jwVar = bxVar.D0) != null && jwVar.getVisibility() == 0) {
            jw jwVar2 = bxVar.D0;
            View[] viewArr = jwVar2.f36665e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (m10 = org.telegram.ui.Components.k71.m(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < m10.getChildCount(); i10++) {
                        View childAt = m10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + m10.getY() + viewArr[i7].getY() + jwVar2.getY());
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
        org.telegram.messenger.bz.f();
        qVar = ((org.telegram.ui.ActionBar.g2) this.f52741o0).glassEngine;
        qVar.g();
    }

    @Override
    public final boolean N() {
        return true;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.X():boolean");
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        bx bxVar = this.f52741o0;
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        float height = kVar.getHeight();
        wv wvVar = bxVar.H3;
        if (wvVar != null && wvVar.c()) {
            f10 = bxVar.H3.f54122e;
        } else {
            f10 = 0.0f;
        }
        if (bxVar.L) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, bxVar.f46636w3, (1.0f - f10) * (1.0f - bxVar.f46651z1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f10, (1.0f - bxVar.f46651z1) * (1.0f - bxVar.f46636w3) * org.telegram.messenger.g0.L(48.0f), height + bxVar.U);
    }

    public final int Z() {
        float f10;
        bx bxVar = this.f52741o0;
        float f11 = bxVar.O;
        wv wvVar = bxVar.H3;
        if (wvVar != null && wvVar.c()) {
            f10 = bxVar.H3.f54122e;
        } else {
            f10 = 0.0f;
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, bxVar.f46651z1, org.telegram.messenger.f3.A(1.0f, f10, 1.0f - bxVar.f46636w3, f11), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        ax[] axVarArr;
        ax[] axVarArr2;
        bx bxVar = this.f52741o0;
        qw qwVar = bxVar.A0;
        SparseIntArray sparseIntArray = qwVar.f38304k0;
        int i10 = qwVar.L;
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
        bxVar.f46598p3 = false;
        bxVar.f46594o3 = true;
        this.f52736i0 = (int) (motionEvent.getX() + bxVar.f46580l3);
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        kVar.setEnabled(false);
        bxVar.A0.setEnabled(false);
        ax axVar = bxVar.f46549f0[1];
        axVar.h = i11;
        axVar.setVisibility(0);
        bxVar.f46576k3 = z10;
        bx.i1(bxVar, false);
        bxVar.l5(true);
        if (z10) {
            bxVar.f46549f0[1].setTranslationX(axVarArr2[0].getMeasuredWidth());
            return true;
        }
        bxVar.f46549f0[1].setTranslationX(-axVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f52740n0.a(this, motionEvent) && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bx bxVar = this.f52741o0;
        if (view == bxVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.cu0.f34132f0) {
            return super.drawChild(canvas, view, j3);
        }
        ax[] axVarArr = bxVar.f46549f0;
        int i7 = 0;
        if (view != axVarArr[0] && ((axVarArr.length <= 1 || view != axVarArr[1]) && view != bxVar.L1 && view != bxVar.A0)) {
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (view == kVar && bxVar.f46531b4 != 1.0f) {
                canvas.save();
                if (bxVar.f46537c4) {
                    canvas.translate((1.0f - bxVar.f46531b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, bxVar.f46531b4, 0.05f, 1.0f);
                    canvas.translate((1.0f - bxVar.f46531b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                    if (kVar2.getOccupyStatusBar()) {
                        i7 = org.telegram.messenger.g0.f24220m;
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
        if (view != bxVar.L1 && view != bxVar.A0) {
            canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = bxVar.f46531b4;
        if (f10 != 1.0f) {
            if (bxVar.f46537c4) {
                canvas.translate((1.0f - bxVar.f46531b4) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
            } else {
                float t10 = com.google.android.gms.internal.vision.e2.t(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - bxVar.f46531b4) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                canvas.scale(t10, t10, 0.0f, (-getY()) + bxVar.O + Y());
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
        org.telegram.ui.Components.m5 m5Var = this.f52741o0.F3;
        if (m5Var != null) {
            m5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.m5 m5Var = this.f52741o0.F3;
        if (m5Var != null) {
            m5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        qw qwVar;
        int actionMasked = motionEvent.getActionMasked();
        bx bxVar = this.f52741o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar.x()) {
                bxVar.f46522a1 = true;
            }
        }
        if (X() || (((qwVar = bxVar.A0) != null && qwVar.P) || onTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.onLayout(boolean, int, int, int, int):void");
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
        bx bxVar = this.f52741o0;
        int i14 = bxVar.f46520a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size2 > size) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = bxVar.f46587n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar5.getOccupyStatusBar()) {
                i13 = org.telegram.messenger.g0.f24220m;
            } else {
                i13 = 0;
            }
            layoutParams.topMargin = i13;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof qt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), 1073741824));
                    } else if (childAt instanceof ax) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (bxVar.H3.c()) {
                            if (bxVar.f46638x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (bxVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i16 = L3 + bxVar.Q;
                        if (bxVar.f46642x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        if (bxVar.f46541d4) {
                            i12 = (int) (i16 * 0.05f);
                        } else {
                            i12 = 0;
                        }
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i12);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i16 + i12), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        jw jwVar = bxVar.D0;
                        if (childAt == jwVar) {
                            jwVar.setTranslationY(bxVar.J0);
                            bxVar.D0.f40098s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i14) + View.MeasureSpec.getSize(i10), 1073741824);
                            bxVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i14) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            mv mvVar = bxVar.D1;
                            if (mvVar != null && mvVar.U0(childAt)) {
                                if (org.telegram.messenger.g0.E) {
                                    if (org.telegram.messenger.g0.Q1()) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.f24220m)), 1073741824));
                                    } else {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.f24220m), 1073741824));
                                    }
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                                }
                            } else if (childAt == bxVar.H3) {
                                int size4 = View.MeasureSpec.getSize(i10);
                                if (bxVar.f46541d4) {
                                    i11 = (int) (size4 * 0.05f);
                                } else {
                                    i11 = 0;
                                }
                                bxVar.H3.setTransitionPaddingBottom(i11);
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
            post(new tw(this, 1));
            this.m0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        bx bxVar = this.f52741o0;
        if (bxVar.f46598p3 && !bxVar.f46594o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
