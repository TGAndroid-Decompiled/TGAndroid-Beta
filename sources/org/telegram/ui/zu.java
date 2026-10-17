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
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class zu extends FrameLayout {
    public int f43805a;
    public boolean f43806b;
    public boolean f43807c;
    public int d;
    public int e;
    public VelocityTracker f43808f;
    public boolean h;
    public final bv f43809n;

    public zu(bv bvVar, Context context) {
        super(context);
        this.f43809n = bvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zu.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        bv bvVar = this.f43809n;
        av[] avVarArr = bvVar.f35747f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = bvVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f24357n;
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
        this.f43807c = false;
        this.f43806b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        kVar.setEnabled(false);
        bvVar.e.setEnabled(false);
        av avVar = avVarArr[1];
        avVar.f35503f = i12;
        avVar.setVisibility(0);
        bvVar.f35749r = z10;
        bvVar.m0(true);
        if (z10) {
            avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth());
            return true;
        }
        avVarArr[1].setTranslationX(-avVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        bv bvVar = this.f43809n;
        d5Var = ((org.telegram.ui.ActionBar.n2) bvVar).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) bvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
            ((ActionBarLayout) d5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bv bvVar = this.f43809n;
        Paint paint = bvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
        kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f43809n.e.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        bv bvVar = this.f43809n;
        av[] avVarArr = bvVar.f35747f;
        kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < avVarArr.length; i12++) {
            av avVar = avVarArr[i12];
            if (avVar != null) {
                org.telegram.ui.Components.im0 im0Var = avVar.d;
                if (im0Var != null) {
                    im0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ai.u1 u1Var = avVarArr[i12].e;
                if (u1Var != null) {
                    u1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.d5 d5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        av avVar;
        av avVar2;
        int measuredWidth2;
        av avVar3;
        av avVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        bv bvVar = this.f43809n;
        av[] avVarArr = bvVar.f35747f;
        d5Var = ((org.telegram.ui.ActionBar.n2) bvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) d5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f43808f == null) {
                this.f43808f = VelocityTracker.obtain();
            }
            this.f43808f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f43806b && !this.f43807c) {
            this.f43805a = motionEvent.getPointerId(0);
            this.f43807c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f43808f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f43805a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f43806b && (((z12 = bvVar.f35749r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f43807c = true;
                    this.f43806b = false;
                    avVarArr[0].setTranslationX(0.0f);
                    av avVar5 = avVarArr[1];
                    if (bvVar.f35749r) {
                        i10 = avVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -avVarArr[0].getMeasuredWidth();
                    }
                    avVar5.setTranslationX(i10);
                    bvVar.e.j(0.0f, avVarArr[1].f35503f);
                }
            }
            if (this.f43807c && !this.f43806b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f43806b) {
                avVarArr[0].setTranslationX(x10);
                if (bvVar.f35749r) {
                    avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth() + x10);
                } else {
                    avVarArr[1].setTranslationX(x10 - avVarArr[0].getMeasuredWidth());
                }
                bvVar.e.j(Math.abs(x10) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f35503f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f43805a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f43808f.computeCurrentVelocity(1000, bvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f43808f.getXVelocity();
                f10 = this.f43808f.getYVelocity();
                if (!this.f43806b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                    if (f7 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b(motionEvent, z11);
                }
            } else {
                f7 = 0.0f;
                f10 = 0.0f;
            }
            if (this.f43806b) {
                float x11 = avVarArr[0].getX();
                bvVar.h = new AnimatorSet();
                if (Math.abs(x11) < avVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bvVar.f35750s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (bvVar.f35749r) {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(avVarArr[1], property, avVar4.getMeasuredWidth()));
                    } else {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(avVarArr[1], property, -avVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = avVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (bvVar.f35749r) {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, -avVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(avVarArr[1], property, 0.0f));
                    } else {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, avVar.getMeasuredWidth()), ObjectAnimator.ofFloat(avVarArr[1], property, 0.0f));
                    }
                }
                bvVar.h.setInterpolator(bv.f35743x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                bvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                bvVar.h.addListener(new org.telegram.ui.Components.n31(this, 21));
                bvVar.h.start();
                bvVar.f35748n = true;
                this.f43806b = false;
            } else {
                this.f43807c = false;
                kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
                kVar.setEnabled(true);
                bvVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f43808f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f43808f = null;
            }
        }
        return this.f43806b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
