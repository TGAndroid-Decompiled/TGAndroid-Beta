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
public final class v8 extends org.telegram.ui.Components.au0 {
    public final int f52724g0;
    public Object f52725h0;

    public v8(int i7, Context context, Object obj) {
        super(context, null);
        this.f52724g0 = i7;
        this.f52725h0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f52724g0) {
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
        switch (this.f52724g0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f52724g0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.ry) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.ry) view).getLayoutParams();
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
        ri.q qVar;
        switch (this.f52724g0) {
            case 9:
                o31 o31Var = (o31) this.f52725h0;
                o31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.h2) o31Var).glassEngine;
                qVar.g();
                if (!o31Var.O) {
                    org.telegram.messenger.g0.O(canvas, this, o31Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6), o31Var.f50448d0, 1.0f);
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
        switch (this.f52724g0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.oa0) this.f52725h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f52724g0) {
            case 1:
                Drawable c10 = ((zm) ((org.telegram.ui.Components.oa0) this.f52725h0).f38045d0.G).c();
                if (c10 == null) {
                    return super.getNewDrawable();
                }
                return c10;
            case 5:
                if (org.telegram.messenger.bz.H0) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29716ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f52725h0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f52725h0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f52725h0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f52724g0) {
            case 5:
                if (!org.telegram.messenger.bz.H0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.i6 getResourceProvider() {
        switch (this.f52724g0) {
            case 2:
                return ((org.telegram.ui.Components.ny0) this.f52725h0).f37877c;
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
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        int i11;
        int i12;
        switch (this.f52724g0) {
            case 0:
                ((i9) this.f52725h0).h0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.ny0) this.f52725h0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f52725h0;
                a5Var = ((org.telegram.ui.ActionBar.h2) contactsActivity).simpleActionBar;
                measureChildWithMargins(a5Var, i7, 0, i10, 0);
                a5Var2 = ((org.telegram.ui.ActionBar.h2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f42980c.getLayoutParams()).topMargin = a5Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                return;
            case 6:
                j90 j90Var = (j90) this.f52725h0;
                super.onMeasure(i7, i10);
                Q();
                int i13 = this.f33463f;
                if (i13 != 0 && i13 < org.telegram.messenger.g0.L(20.0f)) {
                    j90Var.G.clearFocus();
                    j90Var.L.clearFocus();
                }
                FrameLayout frameLayout = j90Var.I;
                if (this.f33463f > org.telegram.messenger.g0.L(20.0f)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
                return;
            case 7:
                de0 de0Var = (de0) this.f52725h0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) de0Var.O.getLayoutParams();
                int i14 = 0;
                if (de0Var.z1()) {
                    i12 = org.telegram.messenger.g0.L(226.0f);
                } else {
                    i12 = 0;
                }
                if (de0Var.z1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    i12 -= Q();
                }
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
                if (gcVar != null && gcVar.f35463l) {
                    super.onMeasure(i7, i10);
                    marginLayoutParams.bottomMargin = org.telegram.ui.Cells.c0.i(10.0f, org.telegram.ui.Components.gc.f35453w.f35457e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i12);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i12;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i14 = org.telegram.messenger.g0.f24115m;
                }
                ((ViewGroup.MarginLayoutParams) de0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) de0Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) de0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                TextView textView = de0Var.f46944g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                }
                if (de0Var.f46951n0.getMinimumHeight() != i14) {
                    de0Var.f46951n0.setMinimumHeight(i14);
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && de0Var.f46937c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !de0Var.f46936b0) {
                    ValueAnimator valueAnimator = de0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    de0Var.f46937c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f52725h0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f43409b.getEmojiPadding();
                }
                int i15 = size2;
                int childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f43409b.P0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f43409b.B2) {
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
        switch (this.f52724g0) {
            case 9:
                try {
                    ((o31) this.f52725h0).q0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                return;
        }
    }

    public v8(Context context, org.telegram.ui.ActionBar.s4 s4Var) {
        super(context, s4Var);
        this.f52724g0 = 5;
    }
}
