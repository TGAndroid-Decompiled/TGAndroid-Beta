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
public final class qv extends FrameLayout {
    public int f39219a;
    public boolean f39220b;
    public boolean f39221c;
    public int d;
    public int e;
    public VelocityTracker f39222f;
    public boolean h;
    public final sv f39223n;

    public qv(sv svVar, Context context) {
        super(context);
        this.f39223n = svVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qv.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        sv svVar = this.f39223n;
        rv[] rvVarArr = svVar.f39952f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = svVar.e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i11 = scrollSlidingTextTabStrip.f23002n;
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
        this.f39221c = false;
        this.f39220b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
        kVar.setEnabled(false);
        svVar.e.setEnabled(false);
        rv rvVar = rvVarArr[1];
        rvVar.f39594f = i12;
        rvVar.setVisibility(0);
        svVar.f39954r = z10;
        svVar.m0(true);
        if (z10) {
            rvVarArr[1].setTranslationX(rvVarArr[0].getMeasuredWidth());
            return true;
        }
        rvVarArr[1].setTranslationX(-rvVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        sv svVar = this.f39223n;
        b5Var = ((org.telegram.ui.ActionBar.m2) svVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) svVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sv svVar = this.f39223n;
        Paint paint = svVar.d;
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f39223n.e.H && !onTouchEvent(motionEvent)) {
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
        sv svVar = this.f39223n;
        rv[] rvVarArr = svVar.f39952f;
        kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i12 = 0; i12 < rvVarArr.length; i12++) {
            rv rvVar = rvVarArr[i12];
            if (rvVar != null) {
                org.telegram.ui.Components.mm0 mm0Var = rvVar.d;
                if (mm0Var != null) {
                    mm0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.o0 o0Var = rvVarArr[i12].e;
                if (o0Var != null) {
                    o0Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        rv rvVar;
        rv rvVar2;
        int measuredWidth2;
        rv rvVar3;
        rv rvVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        sv svVar = this.f39223n;
        rv[] rvVarArr = svVar.f39952f;
        b5Var = ((org.telegram.ui.ActionBar.m2) svVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f39222f == null) {
                this.f39222f = VelocityTracker.obtain();
            }
            this.f39222f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f39220b && !this.f39221c) {
            this.f39219a = motionEvent.getPointerId(0);
            this.f39221c = true;
            this.d = (int) motionEvent.getX();
            this.e = (int) motionEvent.getY();
            this.f39222f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f39219a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.e);
            if (this.f39220b && (((z12 = svVar.f39954r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f39221c = true;
                    this.f39220b = false;
                    rvVarArr[0].setTranslationX(0.0f);
                    rv rvVar5 = rvVarArr[1];
                    if (svVar.f39954r) {
                        i10 = rvVarArr[0].getMeasuredWidth();
                    } else {
                        i10 = -rvVarArr[0].getMeasuredWidth();
                    }
                    rvVar5.setTranslationX(i10);
                    svVar.e.j(0.0f, rvVarArr[1].f39594f);
                }
            }
            if (this.f39221c && !this.f39220b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f39220b) {
                rvVarArr[0].setTranslationX(x10);
                if (svVar.f39954r) {
                    rvVarArr[1].setTranslationX(rvVarArr[0].getMeasuredWidth() + x10);
                } else {
                    rvVarArr[1].setTranslationX(x10 - rvVarArr[0].getMeasuredWidth());
                }
                svVar.e.j(Math.abs(x10) / rvVarArr[0].getMeasuredWidth(), rvVarArr[1].f39594f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f39219a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f39222f.computeCurrentVelocity(1000, svVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f7 = this.f39222f.getXVelocity();
                f10 = this.f39222f.getYVelocity();
                if (!this.f39220b && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
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
            if (this.f39220b) {
                float x11 = rvVarArr[0].getX();
                svVar.h = new AnimatorSet();
                if (Math.abs(x11) < rvVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                svVar.f39955s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (svVar.f39954r) {
                        svVar.h.playTogether(ObjectAnimator.ofFloat(rvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(rvVarArr[1], property, rvVar4.getMeasuredWidth()));
                    } else {
                        svVar.h.playTogether(ObjectAnimator.ofFloat(rvVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(rvVarArr[1], property, -rvVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = rvVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (svVar.f39954r) {
                        svVar.h.playTogether(ObjectAnimator.ofFloat(rvVarArr[0], property, -rvVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(rvVarArr[1], property, 0.0f));
                    } else {
                        svVar.h.playTogether(ObjectAnimator.ofFloat(rvVarArr[0], property, rvVar.getMeasuredWidth()), ObjectAnimator.ofFloat(rvVarArr[1], property, 0.0f));
                    }
                }
                svVar.h.setInterpolator(sv.f39948x);
                int measuredWidth3 = getMeasuredWidth();
                float f11 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f11) + f11;
                float abs2 = Math.abs(f7);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                svVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                svVar.h.addListener(new org.telegram.ui.Components.v61(this, 19));
                svVar.h.start();
                svVar.f39953n = true;
                this.f39220b = false;
            } else {
                this.f39221c = false;
                kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
                kVar.setEnabled(true);
                svVar.e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f39222f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f39222f = null;
            }
        }
        return this.f39220b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
