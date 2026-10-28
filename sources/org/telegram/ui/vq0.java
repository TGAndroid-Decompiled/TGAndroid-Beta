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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class vq0 extends org.telegram.ui.Components.ww0 {
    public int f44400l0;
    public boolean m0;
    public boolean f44401n0;
    public int f44402o0;
    public int f44403p0;
    public VelocityTracker f44404q0;
    public boolean f44405r0;
    public final xq0 f44406s0;

    public vq0(xq0 xq0Var, Context context) {
        super(context, null);
        this.f44406s0 = xq0Var;
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vq0.X():boolean");
    }

    public final boolean Y(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        xq0 xq0Var = this.f44406s0;
        org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.f45764n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = xq0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f26302n;
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
        this.f44401n0 = false;
        this.m0 = true;
        this.f44402o0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        kVar.setEnabled(false);
        xq0Var.h.setEnabled(false);
        org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[1];
        q5Var.f22990b = i12;
        q5Var.setVisibility(0);
        xq0Var.v = z10;
        xq0Var.k0(true);
        if (z10) {
            q5VarArr[1].setTranslationX(q5VarArr[0].getMeasuredWidth());
            return true;
        }
        q5VarArr[1].setTranslationX(-q5VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        xq0 xq0Var = this.f44406s0;
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.y6.f23479k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        xq0 xq0Var = this.f44406s0;
        Paint paint = xq0Var.f45763f;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23300a7, false));
        kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!X() && !this.f44406s0.h.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j5 j5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        org.telegram.ui.ActionBar.q5 q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2;
        int measuredWidth2;
        org.telegram.ui.ActionBar.q5 q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        xq0 xq0Var = this.f44406s0;
        org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.f45764n;
        j5Var = ((org.telegram.ui.ActionBar.r2) xq0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) j5Var).i() || X()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f44404q0 == null) {
                this.f44404q0 = VelocityTracker.obtain();
            }
            this.f44404q0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.m0 && !this.f44401n0) {
            this.f44400l0 = motionEvent.getPointerId(0);
            this.f44401n0 = true;
            this.f44402o0 = (int) motionEvent.getX();
            this.f44403p0 = (int) motionEvent.getY();
            this.f44404q0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f44400l0) {
            int x9 = (int) (motionEvent.getX() - this.f44402o0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f44403p0);
            if (this.m0 && (((z12 = xq0Var.v) && x9 > 0) || (!z12 && x9 < 0))) {
                if (x9 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!Y(motionEvent, z13)) {
                    this.f44401n0 = true;
                    this.m0 = false;
                    q5VarArr[0].setTranslationX(0.0f);
                    org.telegram.ui.ActionBar.q5 q5Var5 = q5VarArr[1];
                    if (xq0Var.v) {
                        i10 = q5VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -q5VarArr[0].getMeasuredWidth();
                    }
                    q5Var5.setTranslationX(i10);
                    xq0Var.h.i(0.0f, q5VarArr[1].f22990b);
                }
            }
            if (this.f44401n0 && !this.m0) {
                if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                    if (x9 < 0) {
                        z14 = true;
                    }
                    Y(motionEvent, z14);
                }
            } else if (this.m0) {
                q5VarArr[0].setTranslationX(x9);
                if (xq0Var.v) {
                    q5VarArr[1].setTranslationX(q5VarArr[0].getMeasuredWidth() + x9);
                } else {
                    q5VarArr[1].setTranslationX(x9 - q5VarArr[0].getMeasuredWidth());
                }
                xq0Var.h.i(Math.abs(x9) / q5VarArr[0].getMeasuredWidth(), q5VarArr[1].f22990b);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f44400l0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f44404q0.computeCurrentVelocity(1000, xq0Var.f45768x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f44404q0.getXVelocity();
                f10 = this.f44404q0.getYVelocity();
                if (!this.m0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Y(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.m0) {
                float x10 = q5VarArr[0].getX();
                xq0Var.f45765r = new AnimatorSet();
                if (Math.abs(x10) < q5VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xq0Var.f45767w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x10);
                    if (xq0Var.v) {
                        xq0Var.f45765r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(q5VarArr[1], property, q5Var4.getMeasuredWidth()));
                    } else {
                        xq0Var.f45765r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(q5VarArr[1], property, -q5Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = q5VarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (xq0Var.v) {
                        xq0Var.f45765r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], property, -q5Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(q5VarArr[1], property, 0.0f));
                    } else {
                        xq0Var.f45765r.playTogether(ObjectAnimator.ofFloat(q5VarArr[0], property, q5Var.getMeasuredWidth()), ObjectAnimator.ofFloat(q5VarArr[1], property, 0.0f));
                    }
                }
                xq0Var.f45765r.setInterpolator(xq0.f45759y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                xq0Var.f45765r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                xq0Var.f45765r.addListener(new k50(this, 9));
                xq0Var.f45765r.start();
                xq0Var.f45766s = true;
                this.m0 = false;
            } else {
                this.f44401n0 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
                kVar.setEnabled(true);
                xq0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f44404q0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44404q0 = null;
            }
        }
        return this.m0;
    }

    @Override
    public final void requestLayout() {
        if (this.f44405r0) {
            return;
        }
        super.requestLayout();
    }
}
