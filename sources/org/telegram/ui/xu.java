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
public final class xu extends FrameLayout {
    public int f45853a;
    public boolean f45854b;
    public boolean f45855c;
    public int d;
    public int e;
    public VelocityTracker f45856f;
    public boolean h;
    public final zu f45857n;

    public xu(zu zuVar, Context context) {
        super(context);
        this.f45857n = zuVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xu.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        zu zuVar = this.f45857n;
        yu[] yuVarArr = zuVar.f46363f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = zuVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f26298n;
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
        this.f45855c = false;
        this.f45854b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        kVar.setEnabled(false);
        zuVar.e.setEnabled(false);
        yu yuVar = yuVarArr[1];
        yuVar.f46111f = i12;
        yuVar.setVisibility(0);
        zuVar.f46365r = z10;
        zuVar.n0(true);
        if (z10) {
            yuVarArr[1].setTranslationX(yuVarArr[0].getMeasuredWidth());
            return true;
        }
        yuVarArr[1].setTranslationX(-yuVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        zu zuVar = this.f45857n;
        j5Var = ((org.telegram.ui.ActionBar.r2) zuVar).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) zuVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
            ((ActionBarLayout) j5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zu zuVar = this.f45857n;
        Paint paint = zuVar.d;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
        kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f45857n.e.H && !onTouchEvent(motionEvent)) {
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
        zu zuVar = this.f45857n;
        yu[] yuVarArr = zuVar.f46363f;
        kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < yuVarArr.length; i12++) {
            yu yuVar = yuVarArr[i12];
            if (yuVar != null) {
                org.telegram.ui.Components.mm0 mm0Var = yuVar.d;
                if (mm0Var != null) {
                    mm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.r1 r1Var = yuVarArr[i12].e;
                if (r1Var != null) {
                    r1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j5 j5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        yu yuVar;
        yu yuVar2;
        int measuredWidth2;
        yu yuVar3;
        yu yuVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        zu zuVar = this.f45857n;
        yu[] yuVarArr = zuVar.f46363f;
        j5Var = ((org.telegram.ui.ActionBar.r2) zuVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) j5Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f45856f == null) {
                this.f45856f = VelocityTracker.obtain();
            }
            this.f45856f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f45854b && !this.f45855c) {
            this.f45853a = motionEvent.getPointerId(0);
            this.f45855c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f45856f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f45853a) {
            int x9 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f45854b && (((z12 = zuVar.f46365r) && x9 > 0) || (!z12 && x9 < 0))) {
                if (x9 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f45855c = true;
                    this.f45854b = false;
                    yuVarArr[0].setTranslationX(0.0f);
                    yu yuVar5 = yuVarArr[1];
                    if (zuVar.f46365r) {
                        i10 = yuVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -yuVarArr[0].getMeasuredWidth();
                    }
                    yuVar5.setTranslationX(i10);
                    zuVar.e.i(0.0f, yuVarArr[1].f46111f);
                }
            }
            if (this.f45855c && !this.f45854b) {
                if (Math.abs(x9) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x9) > abs) {
                    if (x9 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f45854b) {
                yuVarArr[0].setTranslationX(x9);
                if (zuVar.f46365r) {
                    yuVarArr[1].setTranslationX(yuVarArr[0].getMeasuredWidth() + x9);
                } else {
                    yuVarArr[1].setTranslationX(x9 - yuVarArr[0].getMeasuredWidth());
                }
                zuVar.e.i(Math.abs(x9) / yuVarArr[0].getMeasuredWidth(), yuVarArr[1].f46111f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f45853a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f45856f.computeCurrentVelocity(1000, zuVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f45856f.getXVelocity();
                f10 = this.f45856f.getYVelocity();
                if (!this.f45854b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f45854b) {
                float x10 = yuVarArr[0].getX();
                zuVar.h = new AnimatorSet();
                if (Math.abs(x10) < yuVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zuVar.f46366s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x10);
                    if (zuVar.f46365r) {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(yuVarArr[1], property, yuVar4.getMeasuredWidth()));
                    } else {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(yuVarArr[1], property, -yuVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = yuVarArr[0].getMeasuredWidth() - Math.abs(x10);
                    if (zuVar.f46365r) {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], property, -yuVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(yuVarArr[1], property, 0.0f));
                    } else {
                        zuVar.h.playTogether(ObjectAnimator.ofFloat(yuVarArr[0], property, yuVar.getMeasuredWidth()), ObjectAnimator.ofFloat(yuVarArr[1], property, 0.0f));
                    }
                }
                zuVar.h.setInterpolator(zu.f46359x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                zuVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                zuVar.h.addListener(new org.telegram.ui.Components.h31(this, 23));
                zuVar.h.start();
                zuVar.f46364n = true;
                this.f45854b = false;
            } else {
                this.f45855c = false;
                kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
                kVar.setEnabled(true);
                zuVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f45856f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f45856f = null;
            }
        }
        return this.f45854b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
