package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class um0 extends org.telegram.ui.Components.qt0 {
    public int f50143g0;
    public boolean f50144h0;
    public boolean f50145i0;
    public int f50146j0;
    public int f50147k0;
    public VelocityTracker f50148l0;
    public boolean m0;
    public final vm0 f50149n0;

    public um0(vm0 vm0Var, Context context) {
        super(context, null);
        this.f50149n0 = vm0Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um0.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        int i3;
        org.telegram.ui.ActionBar.k kVar;
        vm0 vm0Var = this.f50149n0;
        org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.f50558n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = vm0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
        int i10 = scrollSlidingTextTabStrip.f31610n;
        if (z10) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i3, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f50145i0 = false;
        this.f50144h0 = true;
        this.f50146j0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
        kVar.setEnabled(false);
        vm0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[1];
        x4Var.f28803b = i11;
        x4Var.setVisibility(0);
        vm0Var.f50561w = z10;
        vm0Var.o0(true);
        if (z10) {
            x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth());
            return true;
        }
        x4VarArr[1].setTranslationX(-x4VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        vm0 vm0Var = this.f50149n0;
        kVar = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.k6.f28002k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        vm0 vm0Var = this.f50149n0;
        Paint paint = vm0Var.f50557f;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false));
        kVar = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.f50149n0.h.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        org.telegram.ui.ActionBar.x4 x4Var;
        org.telegram.ui.ActionBar.x4 x4Var2;
        int measuredWidth2;
        org.telegram.ui.ActionBar.x4 x4Var3;
        org.telegram.ui.ActionBar.x4 x4Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i3;
        vm0 vm0Var = this.f50149n0;
        org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.f50558n;
        q4Var = ((org.telegram.ui.ActionBar.d2) vm0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) q4Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f50148l0 == null) {
                this.f50148l0 = VelocityTracker.obtain();
            }
            this.f50148l0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f50144h0 && !this.f50145i0) {
            this.f50143g0 = motionEvent.getPointerId(0);
            this.f50145i0 = true;
            this.f50146j0 = (int) motionEvent.getX();
            this.f50147k0 = (int) motionEvent.getY();
            this.f50148l0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f50143g0) {
            int x10 = (int) (motionEvent.getX() - this.f50146j0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f50147k0);
            if (this.f50144h0 && (((z12 = vm0Var.f50561w) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!Y(motionEvent, z13)) {
                    this.f50145i0 = true;
                    this.f50144h0 = false;
                    x4VarArr[0].setTranslationX(0.0f);
                    org.telegram.ui.ActionBar.x4 x4Var5 = x4VarArr[1];
                    if (vm0Var.f50561w) {
                        i3 = x4VarArr[0].getMeasuredWidth();
                    } else {
                        i3 = -x4VarArr[0].getMeasuredWidth();
                    }
                    x4Var5.setTranslationX(i3);
                    vm0Var.h.i(0.0f, x4VarArr[1].f28803b);
                }
            }
            if (this.f50145i0 && !this.f50144h0) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    Y(motionEvent, z14);
                }
            } else if (this.f50144h0) {
                x4VarArr[0].setTranslationX(x10);
                if (vm0Var.f50561w) {
                    x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth() + x10);
                } else {
                    x4VarArr[1].setTranslationX(x10 - x4VarArr[0].getMeasuredWidth());
                }
                vm0Var.h.i(Math.abs(x10) / x4VarArr[0].getMeasuredWidth(), x4VarArr[1].f28803b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f50143g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f50148l0.computeCurrentVelocity(1000, vm0Var.f50563y);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f50148l0.getXVelocity();
                f11 = this.f50148l0.getYVelocity();
                if (!this.f50144h0 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Y(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f50144h0) {
                float x11 = x4VarArr[0].getX();
                vm0Var.f50559r = new AnimatorSet();
                if (Math.abs(x11) < x4VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vm0Var.f50562x = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (vm0Var.f50561w) {
                        vm0Var.f50559r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(x4VarArr[1], property, x4Var4.getMeasuredWidth()));
                    } else {
                        vm0Var.f50559r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(x4VarArr[1], property, -x4Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = x4VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (vm0Var.f50561w) {
                        vm0Var.f50559r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, -x4Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(x4VarArr[1], property, 0.0f));
                    } else {
                        vm0Var.f50559r.playTogether(ObjectAnimator.ofFloat(x4VarArr[0], property, x4Var.getMeasuredWidth()), ObjectAnimator.ofFloat(x4VarArr[1], property, 0.0f));
                    }
                }
                vm0Var.f50559r.setInterpolator(vm0.E);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                vm0Var.f50559r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                vm0Var.f50559r.addListener(new y20(this, 9));
                vm0Var.f50559r.start();
                vm0Var.f50560s = true;
                this.f50144h0 = false;
            } else {
                this.f50145i0 = false;
                kVar = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
                kVar.setEnabled(true);
                vm0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f50148l0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f50148l0 = null;
            }
        }
        return this.f50144h0;
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
