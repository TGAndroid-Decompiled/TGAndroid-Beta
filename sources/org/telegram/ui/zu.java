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
    public int f45250a;
    public boolean f45251b;
    public boolean f45252c;
    public int d;
    public int f45253e;
    public VelocityTracker f45254f;
    public boolean h;
    public final bv f45255n;

    public zu(bv bvVar, Context context) {
        super(context);
        this.f45255n = bvVar;
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zu.a():boolean");
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        int i9;
        org.telegram.ui.ActionBar.k kVar;
        bv bvVar = this.f45255n;
        av[] avVarArr = bvVar.f37000f;
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = bvVar.f36999e;
        SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.K;
        int i10 = scrollSlidingTextTabStrip.f26527n;
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i11 = sparseIntArray.get(i10 + i9, -1);
        if (i11 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f45252c = false;
        this.f45251b = true;
        this.d = (int) motionEvent.getX();
        kVar = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
        kVar.setEnabled(false);
        bvVar.f36999e.setEnabled(false);
        av avVar = avVarArr[1];
        avVar.f36560f = i11;
        avVar.setVisibility(0);
        bvVar.f37002r = z10;
        bvVar.l0(true);
        if (z10) {
            avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth());
            return true;
        }
        avVarArr[1].setTranslationX(-avVarArr[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        super.dispatchDraw(canvas);
        bv bvVar = this.f45255n;
        b5Var = ((org.telegram.ui.ActionBar.o2) bvVar).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) bvVar).parentLayout;
            kVar = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
            int measuredHeight = kVar.getMeasuredHeight();
            kVar2 = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
            ((ActionBarLayout) b5Var2).q(canvas, measuredHeight + ((int) kVar2.getTranslationY()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bv bvVar = this.f45255n;
        Paint paint = bvVar.d;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        kVar = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
        kVar2 = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
        canvas.drawRect(0.0f, kVar2.getTranslationY() + kVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a() && !this.f45255n.f36999e.D && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        bv bvVar = this.f45255n;
        av[] avVarArr = bvVar.f37000f;
        kVar = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
        measureChildWithMargins(kVar, i9, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        this.h = true;
        for (int i11 = 0; i11 < avVarArr.length; i11++) {
            av avVar = avVarArr[i11];
            if (avVar != null) {
                org.telegram.ui.Components.wk0 wk0Var = avVar.d;
                if (wk0Var != null) {
                    wk0Var.setPadding(0, measuredHeight, 0, 0);
                }
                gh.f1 f1Var = avVarArr[i11].f36559e;
                if (f1Var != null) {
                    f1Var.setPadding(0, measuredHeight, 0, 0);
                }
            }
        }
        this.h = false;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar3 = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
                if (childAt != kVar3) {
                    measureChildWithMargins(childAt, i9, 0, i10, 0);
                }
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var;
        float f10;
        float f11;
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
        int i9;
        bv bvVar = this.f45255n;
        av[] avVarArr = bvVar.f37000f;
        b5Var = ((org.telegram.ui.ActionBar.o2) bvVar).parentLayout;
        boolean z14 = false;
        if (((ActionBarLayout) b5Var).j() || a()) {
            return false;
        }
        if (motionEvent != null) {
            if (this.f45254f == null) {
                this.f45254f = VelocityTracker.obtain();
            }
            this.f45254f.addMovement(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f45251b && !this.f45252c) {
            this.f45250a = motionEvent.getPointerId(0);
            this.f45252c = true;
            this.d = (int) motionEvent.getX();
            this.f45253e = (int) motionEvent.getY();
            this.f45254f.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f45250a) {
            int x10 = (int) (motionEvent.getX() - this.d);
            int abs = Math.abs(((int) motionEvent.getY()) - this.f45253e);
            if (this.f45251b && (((z12 = bvVar.f37002r) && x10 > 0) || (!z12 && x10 < 0))) {
                if (x10 < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!b(motionEvent, z13)) {
                    this.f45252c = true;
                    this.f45251b = false;
                    avVarArr[0].setTranslationX(0.0f);
                    av avVar5 = avVarArr[1];
                    if (bvVar.f37002r) {
                        i9 = avVarArr[0].getMeasuredWidth();
                    } else {
                        i9 = -avVarArr[0].getMeasuredWidth();
                    }
                    avVar5.setTranslationX(i9);
                    bvVar.f36999e.j(0.0f, avVarArr[1].f36560f);
                }
            }
            if (this.f45252c && !this.f45251b) {
                if (Math.abs(x10) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x10) > abs) {
                    if (x10 < 0) {
                        z14 = true;
                    }
                    b(motionEvent, z14);
                }
            } else if (this.f45251b) {
                avVarArr[0].setTranslationX(x10);
                if (bvVar.f37002r) {
                    avVarArr[1].setTranslationX(avVarArr[0].getMeasuredWidth() + x10);
                } else {
                    avVarArr[1].setTranslationX(x10 - avVarArr[0].getMeasuredWidth());
                }
                bvVar.f36999e.j(Math.abs(x10) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f36560f);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.f45250a && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.f45254f.computeCurrentVelocity(1000, bvVar.v);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f10 = this.f45254f.getXVelocity();
                f11 = this.f45254f.getYVelocity();
                if (!this.f45251b && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
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
            if (this.f45251b) {
                float x11 = avVarArr[0].getX();
                bvVar.h = new AnimatorSet();
                if (Math.abs(x11) < avVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bvVar.f37003s = z10;
                Property property = View.TRANSLATION_X;
                if (z10) {
                    measuredWidth = Math.abs(x11);
                    if (bvVar.f37002r) {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(avVarArr[1], property, avVar4.getMeasuredWidth()));
                    } else {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(avVarArr[1], property, -avVar3.getMeasuredWidth()));
                    }
                } else {
                    measuredWidth = avVarArr[0].getMeasuredWidth() - Math.abs(x11);
                    if (bvVar.f37002r) {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, -avVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(avVarArr[1], property, 0.0f));
                    } else {
                        bvVar.h.playTogether(ObjectAnimator.ofFloat(avVarArr[0], property, avVar.getMeasuredWidth()), ObjectAnimator.ofFloat(avVarArr[1], property, 0.0f));
                    }
                }
                bvVar.h.setInterpolator(bv.f36995x);
                int measuredWidth3 = getMeasuredWidth();
                float f12 = measuredWidth3 / 2;
                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f12) + f12;
                float abs2 = Math.abs(f10);
                if (abs2 > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                bvVar.h.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                bvVar.h.addListener(new org.telegram.ui.Components.y11(this, 21));
                bvVar.h.start();
                bvVar.f37001n = true;
                this.f45251b = false;
            } else {
                this.f45252c = false;
                kVar = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
                kVar.setEnabled(true);
                bvVar.f36999e.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.f45254f;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f45254f = null;
            }
        }
        return this.f45251b;
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }
}
