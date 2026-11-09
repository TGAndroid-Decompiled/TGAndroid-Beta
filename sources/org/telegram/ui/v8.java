package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class v8 extends org.telegram.ui.Components.tt0 {
    public final int f50597f0;
    public Object f50598g0;

    public v8(int i7, Context context, Object obj) {
        super(context, null);
        this.f50597f0 = i7;
        this.f50598g0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f50597f0) {
            case 2:
                return false;
            case 5:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public boolean P() {
        switch (this.f50597f0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f50597f0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.hy) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.hy) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                return;
            default:
                super.addView(view);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        switch (this.f50597f0) {
            case 9:
                n31 n31Var = (n31) this.f50598g0;
                n31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.f2) n31Var).glassEngine;
                qVar.g();
                if (!n31Var.N) {
                    org.telegram.messenger.g0.O(canvas, this, n31Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6), n31Var.f48079c0, 1.0f);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f50597f0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.da0) this.f50598g0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f50597f0) {
            case 1:
                Drawable m10 = ((an) ((org.telegram.ui.Components.da0) this.f50598g0).f32920c0.F).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 5:
                if (org.telegram.messenger.iz.H0) {
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28185ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f50598g0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f50598g0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f50598g0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f50597f0) {
            case 5:
                if (!org.telegram.messenger.iz.H0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.f50597f0) {
            case 2:
                return ((org.telegram.ui.Components.fy0) this.f50598g0).f33756c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        int i11;
        int i12;
        switch (this.f50597f0) {
            case 0:
                ((i9) this.f50598g0).h0();
                super.onMeasure(i7, i10);
                return;
            case 1:
            case 4:
            case 5:
            default:
                super.onMeasure(i7, i10);
                return;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.fy0) this.f50598g0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f50598g0;
                y4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                measureChildWithMargins(y4Var, i7, 0, i10, 0);
                y4Var2 = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f41190c.getLayoutParams()).topMargin = y4Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                return;
            case 6:
                j90 j90Var = (j90) this.f50598g0;
                super.onMeasure(i7, i10);
                Q();
                int i13 = this.f38497f;
                if (i13 != 0 && i13 < org.telegram.messenger.g0.L(20.0f)) {
                    j90Var.F.clearFocus();
                    j90Var.K.clearFocus();
                }
                FrameLayout frameLayout = j90Var.H;
                if (this.f38497f > org.telegram.messenger.g0.L(20.0f)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
                return;
            case 7:
                ee0 ee0Var = (ee0) this.f50598g0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ee0Var.N.getLayoutParams();
                int i14 = 0;
                if (ee0Var.z1()) {
                    i12 = org.telegram.messenger.g0.L(226.0f);
                } else {
                    i12 = 0;
                }
                if (ee0Var.z1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    i12 -= Q();
                }
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
                if (ccVar != null && ccVar.f32629l) {
                    super.onMeasure(i7, i10);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.camera.q.D(10.0f, org.telegram.ui.Components.cc.f32619w.f32623e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i12);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i12;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i14 = org.telegram.messenger.g0.f22557m;
                }
                ((ViewGroup.MarginLayoutParams) ee0Var.U.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) ee0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) ee0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                TextView textView = ee0Var.f45378f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && ee0Var.f45372c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !ee0Var.f45369a0) {
                    ValueAnimator valueAnimator = ee0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ee0Var.f45372c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f50598g0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f41602b.getEmojiPadding();
                }
                int i15 = size2;
                int childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f41602b.t0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f41602b.N1) {
                            measureChildWithMargins(childAt, i7, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f) + i15), 1073741824));
                        }
                    }
                }
                return;
        }
    }

    @Override
    public void updateColors() {
        switch (this.f50597f0) {
            case 9:
                try {
                    ((n31) this.f50598g0).q0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                return;
        }
    }

    public v8(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.f50597f0 = 5;
    }
}
