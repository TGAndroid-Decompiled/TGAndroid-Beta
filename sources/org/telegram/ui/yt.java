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
public final class yt extends FrameLayout {
    public int f52303a;
    public boolean f52304b;
    public boolean f52305c;
    public int d;
    public int f52306e;
    public VelocityTracker f52307f;
    public boolean h;
    public final au f52308n;

    public yt(au auVar, Context context) {
        super(context);
        this.f52308n = auVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yt.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.k kVar;
        au auVar = this.f52308n;
        zt[] ztVarArr = auVar.f44099f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = auVar.f44098e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.O;
        int i10 = scrollSlidingTextTabStrip.f31538n;
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i7, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f52305c = false;
        this.f52304b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
        kVar.setEnabled(false);
        auVar.f44098e.setEnabled(false);
        zt ztVar = ztVarArr[1];
        ztVar.f52680f = i11;
        ztVar.setVisibility(0);
        auVar.f44101r = z9;
        auVar.r0(true);
        if (z9) {
            ztVarArr[1].setTranslationX(ztVarArr[0].getMeasuredWidth());
            return true;
        }
        ztVarArr[1].setTranslationX(-ztVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        au auVar = this.f52308n;
        q4Var = ((org.telegram.ui.ActionBar.f2) auVar).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) auVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
            ((ActionBarLayout) q4Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        au auVar = this.f52308n;
        Paint paint = auVar.d;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
        kVar = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f52308n.f44098e.H && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        au auVar = this.f52308n;
        zt[] ztVarArr = auVar.f44099f;
        kVar = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < ztVarArr.length; i11++) {
            zt ztVar = ztVarArr[i11];
            if (ztVar != null) {
                org.telegram.ui.Components.pj0 pj0Var = ztVar.d;
                if (pj0Var != null) {
                    pj0Var.setPadding(0, measuredHeight, 0, 0);
                }
                bi.q1 q1Var = ztVarArr[i11].f52679e;
                if (q1Var != null) {
                    q1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i7, 0, i10, 0);
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
        boolean z9;
        float measuredWidth;
        zt ztVar;
        zt ztVar2;
        int measuredWidth2;
        zt ztVar3;
        zt ztVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        au auVar = this.f52308n;
        zt[] ztVarArr = auVar.f44099f;
        q4Var = ((org.telegram.ui.ActionBar.f2) auVar).parentLayout;
        boolean z13 = false;
        if (((ActionBarLayout) q4Var).i() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f52307f == null) {
                this.f52307f = VelocityTracker.obtain();
            }
            this.f52307f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f52304b && !this.f52305c) {
            this.f52303a = motionEvent.getPointerId(0);
            this.f52305c = true;
            this.d = (int) motionEvent.getX();
            this.f52306e = (int) motionEvent.getY();
            this.f52307f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f52303a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f52306e);
            if (this.f52304b && (((z11 = auVar.f44101r) && x10 > 0) || (!z11 && x10 < 0))) {
                if (x10 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!b(motionEvent, z12)) {
                    this.f52305c = true;
                    this.f52304b = false;
                    ztVarArr[0].setTranslationX(0.0f);
                    zt ztVar5 = ztVarArr[1];
                    if (auVar.f44101r) {
                        i7 = ztVarArr[0].getMeasuredWidth();
                    } else {
                        i7 = -ztVarArr[0].getMeasuredWidth();
                    }
                    ztVar5.setTranslationX(i7);
                    auVar.f44098e.i(0.0f, ztVarArr[1].f52680f);
                }
            }
            if (this.f52305c && !this.f52304b) {
                if (Math.abs(x10) >= org.telegram.messenger.g0.a1(true, 0.3f) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z13 = true;
                    }
                    b(motionEvent, z13);
                }
            } else if (this.f52304b) {
                ztVarArr[0].setTranslationX(x10);
                if (auVar.f44101r) {
                    ztVarArr[1].setTranslationX(ztVarArr[0].getMeasuredWidth() + x10);
                } else {
                    ztVarArr[1].setTranslationX(x10 - ztVarArr[0].getMeasuredWidth());
                }
                auVar.f44098e.i(Math.abs(x10) / ztVarArr[0].getMeasuredWidth(), ztVarArr[1].f52680f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f52303a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f52307f.computeCurrentVelocity(1000, auVar.f44103w);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f52307f.getXVelocity();
                f11 = this.f52307f.getYVelocity();
                if (!this.f52304b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                    if (f10 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b(motionEvent, z10);
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (this.f52304b) {
                float x11 = ztVarArr[0].getX();
                auVar.h = new AnimatorSet();
                if (Math.abs(x11) < ztVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                auVar.f44102s = z9;
                Property property = View.TRANSLATION_X;
                if (z9) {
                    measuredWidth = Math.abs(x11);
                    if (auVar.f44101r) {
                        auVar.h.playTogether(ObjectAnimator.ofFloat(ztVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ztVarArr[1], property, ztVar4.getMeasuredWidth()));
                    } else {
                        auVar.h.playTogether(ObjectAnimator.ofFloat(ztVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ztVarArr[1], property, -ztVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = ztVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (auVar.f44101r) {
                        auVar.h.playTogether(ObjectAnimator.ofFloat(ztVarArr[0], property, -ztVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(ztVarArr[1], property, 0.0f));
                    } else {
                        auVar.h.playTogether(ObjectAnimator.ofFloat(ztVarArr[0], property, ztVar.getMeasuredWidth()), ObjectAnimator.ofFloat(ztVarArr[1], property, 0.0f));
                    }
                }
                auVar.h.setInterpolator(au.f44094y);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                auVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                auVar.h.addListener(new va(this, 23));
                auVar.h.start();
                auVar.f44100n = true;
                this.f52304b = false;
            } else {
                this.f52305c = false;
                kVar = ((org.telegram.ui.ActionBar.f2) auVar).actionBar;
                kVar.setEnabled(true);
                auVar.f44098e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f52307f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f52307f = null;
            }
        }
        return this.f52304b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
