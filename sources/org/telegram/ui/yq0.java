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
public final class yq0 extends org.telegram.ui.Components.mw0 {
    public int A0;
    public VelocityTracker B0;
    public boolean C0;
    public final br0 D0;
    public int f43601w0;
    public boolean f43602x0;
    public boolean f43603y0;
    public int f43604z0;

    public yq0(br0 br0Var, Context context) {
        super(context, null);
        this.D0 = br0Var;
    }

    public final boolean Z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yq0.Z():boolean");
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        br0 br0Var = this.D0;
        zq0[] zq0VarArr = br0Var.f35210n;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = br0Var.h;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24325n;
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
        this.f43603y0 = false;
        this.f43602x0 = true;
        this.f43604z0 = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
        kVar.setEnabled(false);
        br0Var.h.setEnabled(false);
        zq0 zq0Var = zq0VarArr[1];
        zq0Var.f43880e = i12;
        zq0Var.setVisibility(0);
        br0Var.v = z10;
        br0Var.j0(true);
        if (z10) {
            zq0VarArr[1].setTranslationX(zq0VarArr[0].getMeasuredWidth());
            return true;
        }
        zq0VarArr[1].setTranslationX(-zq0VarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        br0 br0Var = this.D0;
        kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
        int measuredHeight = kVar.getMeasuredHeight();
        kVar2 = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
        float translationY = measuredHeight + ((int) kVar2.getTranslationY());
        canvas.drawLine(0.0f, translationY, getWidth(), translationY, org.telegram.ui.ActionBar.i6.f20950k0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        br0 br0Var = this.D0;
        Paint paint = br0Var.f35209f;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!Z() && !this.D0.h.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yq0.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c5 c5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        zq0 zq0Var;
        zq0 zq0Var2;
        int measuredWidth2;
        zq0 zq0Var3;
        zq0 zq0Var4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        br0 br0Var = this.D0;
        zq0[] zq0VarArr = br0Var.f35210n;
        c5Var = ((org.telegram.ui.ActionBar.n2) br0Var).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) c5Var).j() || Z()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.B0 == null) {
                this.B0 = VelocityTracker.obtain();
            }
            this.B0.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f43602x0 && !this.f43603y0) {
            this.f43601w0 = motionEvent.getPointerId(0);
            this.f43603y0 = true;
            this.f43604z0 = (int) motionEvent.getX();
            this.A0 = (int) motionEvent.getY();
            this.B0.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f43601w0) {
            int x10 = (int) (motionEvent.getX() - this.f43604z0);
            int abs = Math.abs(((int) motionEvent.getY()) - this.A0);
            if (this.f43602x0 && (((z12 = br0Var.v) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!a0(motionEvent, z13)) {
                    this.f43603y0 = true;
                    this.f43602x0 = false;
                    zq0VarArr[0].setTranslationX(0.0f);
                    zq0 zq0Var5 = zq0VarArr[1];
                    if (br0Var.v) {
                        i10 = zq0VarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -zq0VarArr[0].getMeasuredWidth();
                    }
                    zq0Var5.setTranslationX(i10);
                    br0Var.h.j(0.0f, zq0VarArr[1].f43880e);
                }
            }
            if (this.f43603y0 && !this.f43602x0) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    a0(motionEvent, z14);
                }
            } else if (this.f43602x0) {
                zq0VarArr[0].setTranslationX(x10);
                if (br0Var.v) {
                    zq0VarArr[1].setTranslationX(zq0VarArr[0].getMeasuredWidth() + x10);
                } else {
                    zq0VarArr[1].setTranslationX(x10 - zq0VarArr[0].getMeasuredWidth());
                }
                br0Var.h.j(Math.abs(x10) / zq0VarArr[0].getMeasuredWidth(), zq0VarArr[1].f43880e);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f43601w0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.B0.computeCurrentVelocity(1000, br0Var.f35214x);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.B0.getXVelocity();
                f10 = this.B0.getYVelocity();
                if (!this.f43602x0 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a0(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f43602x0) {
                float x11 = zq0VarArr[0].getX();
                br0Var.f35211r = new AnimatorSet();
                if (Math.abs(x11) < zq0VarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                br0Var.f35213w = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (br0Var.v) {
                        br0Var.f35211r.playTogether(ObjectAnimator.ofFloat(zq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(zq0VarArr[1], property, zq0Var4.getMeasuredWidth()));
                    } else {
                        br0Var.f35211r.playTogether(ObjectAnimator.ofFloat(zq0VarArr[0], property, 0.0f), ObjectAnimator.ofFloat(zq0VarArr[1], property, -zq0Var3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = zq0VarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (br0Var.v) {
                        br0Var.f35211r.playTogether(ObjectAnimator.ofFloat(zq0VarArr[0], property, -zq0Var2.getMeasuredWidth()), ObjectAnimator.ofFloat(zq0VarArr[1], property, 0.0f));
                    } else {
                        br0Var.f35211r.playTogether(ObjectAnimator.ofFloat(zq0VarArr[0], property, zq0Var.getMeasuredWidth()), ObjectAnimator.ofFloat(zq0VarArr[1], property, 0.0f));
                    }
                }
                br0Var.f35211r.setInterpolator(br0.f35204y);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                br0Var.f35211r.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                br0Var.f35211r.addListener(new ap0(this, 1));
                br0Var.f35211r.start();
                br0Var.f35212s = true;
                this.f43602x0 = false;
            } else {
                this.f43603y0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                kVar.setEnabled(true);
                br0Var.h.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.B0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.B0 = null;
            }
        }
        return this.f43602x0;
    }

    @Override
    public final void requestLayout() {
        if (this.C0) {
            return;
        }
        super.requestLayout();
    }
}
