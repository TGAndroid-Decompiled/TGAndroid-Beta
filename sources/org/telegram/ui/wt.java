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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class wt extends FrameLayout {
    public int f51599a;
    public boolean f51600b;
    public boolean f51601c;
    public int d;
    public int f51602e;
    public VelocityTracker f51603f;
    public boolean h;
    public final yt f51604n;

    public wt(yt ytVar, Context context) {
        super(context);
        this.f51604n = ytVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wt.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i3;
        org.telegram.ui.ActionBar.k kVar;
        yt ytVar = this.f51604n;
        xt[] xtVarArr = ytVar.f52403f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ytVar.f52402e;
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
        this.f51601c = false;
        this.f51600b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        kVar.setEnabled(false);
        ytVar.f52402e.setEnabled(false);
        xt xtVar = xtVarArr[1];
        xtVar.f52100f = i11;
        xtVar.setVisibility(0);
        ytVar.f52405r = z10;
        ytVar.r0(true);
        if (z10) {
            xtVarArr[1].setTranslationX(xtVarArr[0].getMeasuredWidth());
            return true;
        }
        xtVarArr[1].setTranslationX(-xtVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        yt ytVar = this.f51604n;
        q4Var = ((org.telegram.ui.ActionBar.d2) ytVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) ytVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
            ((ActionBarLayout) q4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yt ytVar = this.f51604n;
        Paint paint = ytVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f51604n.f52402e.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        yt ytVar = this.f51604n;
        xt[] xtVarArr = ytVar.f52403f;
        kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        measureChildWithMargins(kVar, i3, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < xtVarArr.length; i11++) {
            xt xtVar = xtVarArr[i11];
            if (xtVar != null) {
                org.telegram.ui.Components.tj0 tj0Var = xtVar.d;
                if (tj0Var != null) {
                    tj0Var.setPadding(0, measuredHeight, 0, 0);
                }
                ci.j1 j1Var = xtVarArr[i11].f52099e;
                if (j1Var != null) {
                    j1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i3, 0, i10, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        boolean z10;
        float measuredWidth;
        xt xtVar;
        xt xtVar2;
        int measuredWidth2;
        xt xtVar3;
        xt xtVar4;
        boolean z11;
        boolean z12;
        boolean z13;
        int i3;
        yt ytVar = this.f51604n;
        xt[] xtVarArr = ytVar.f52403f;
        q4Var = ((org.telegram.ui.ActionBar.d2) ytVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) q4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f51603f == null) {
                this.f51603f = VelocityTracker.obtain();
            }
            this.f51603f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f51600b && !this.f51601c) {
            this.f51599a = motionEvent.getPointerId(0);
            this.f51601c = true;
            this.d = (int) motionEvent.getX();
            this.f51602e = (int) motionEvent.getY();
            this.f51603f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f51599a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f51602e);
            if (this.f51600b && (((z12 = ytVar.f52405r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f51601c = true;
                    this.f51600b = false;
                    xtVarArr[0].setTranslationX(0.0f);
                    xt xtVar5 = xtVarArr[1];
                    if (ytVar.f52405r) {
                        i3 = xtVarArr[0].getMeasuredWidth();
                    } else {
                        i3 = -xtVarArr[0].getMeasuredWidth();
                    }
                    xtVar5.setTranslationX(i3);
                    ytVar.f52402e.i(0.0f, xtVarArr[1].f52100f);
                }
            }
            if (this.f51601c && !this.f51600b) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f51600b) {
                xtVarArr[0].setTranslationX(x10);
                if (ytVar.f52405r) {
                    xtVarArr[1].setTranslationX(xtVarArr[0].getMeasuredWidth() + x10);
                } else {
                    xtVarArr[1].setTranslationX(x10 - xtVarArr[0].getMeasuredWidth());
                }
                ytVar.f52402e.i(Math.abs(x10) / xtVarArr[0].getMeasuredWidth(), xtVarArr[1].f52100f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f51599a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f51603f.computeCurrentVelocity(1000, ytVar.f52407w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f51603f.getXVelocity();
                f11 = this.f51603f.getYVelocity();
                if (!this.f51600b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b(motionEvent, z11);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f51600b) {
                float x11 = xtVarArr[0].getX();
                ytVar.h = new AnimatorSet();
                if (Math.abs(x11) < xtVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ytVar.f52406s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (ytVar.f52405r) {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(xtVarArr[1], property, xtVar4.getMeasuredWidth()));
                    } else {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(xtVarArr[1], property, -xtVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = xtVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (ytVar.f52405r) {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], property, -xtVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(xtVarArr[1], property, 0.0f));
                    } else {
                        ytVar.h.playTogether(ObjectAnimator.ofFloat(xtVarArr[0], property, xtVar.getMeasuredWidth()), ObjectAnimator.ofFloat(xtVarArr[1], property, 0.0f));
                    }
                }
                ytVar.h.setInterpolator(yt.f52398y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                ytVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                ytVar.h.addListener(new org.telegram.ui.Cells.w9(this, 23));
                ytVar.h.start();
                ytVar.f52404n = true;
                this.f51600b = false;
            } else {
                this.f51601c = false;
                kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                kVar.setEnabled(true);
                ytVar.f52402e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f51603f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f51603f = null;
            }
        }
        return this.f51600b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
