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
public final class v8 extends org.telegram.ui.Components.st0 {
    public final int f50652f0;
    public Object f50653g0;

    public v8(int i7, Context context, Object obj) {
        super(context, null);
        this.f50652f0 = i7;
        this.f50653g0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f50652f0) {
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
        switch (this.f50652f0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f50652f0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.gy) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.gy) view).getLayoutParams();
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
        switch (this.f50652f0) {
            case 9:
                o31 o31Var = (o31) this.f50653g0;
                o31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.f2) o31Var).glassEngine;
                qVar.g();
                if (!o31Var.N) {
                    org.telegram.messenger.g0.O(canvas, this, o31Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6), o31Var.f48413c0, 1.0f);
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
        switch (this.f50652f0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.ca0) this.f50653g0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f50652f0) {
            case 1:
                Drawable m10 = ((an) ((org.telegram.ui.Components.ca0) this.f50653g0).f32524c0.F).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 5:
                if (org.telegram.messenger.iz.H0) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28210ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f50653g0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f50653g0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f50653g0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f50652f0) {
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
    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        switch (this.f50652f0) {
            case 2:
                return ((org.telegram.ui.Components.ey0) this.f50653g0).f33354c;
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
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i11;
        int i12;
        switch (this.f50652f0) {
            case 0:
                ((i9) this.f50653g0).h0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.ey0) this.f50653g0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f50653g0;
                z4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                measureChildWithMargins(z4Var, i7, 0, i10, 0);
                z4Var2 = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f41181c.getLayoutParams()).topMargin = z4Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                return;
            case 6:
                k90 k90Var = (k90) this.f50653g0;
                super.onMeasure(i7, i10);
                Q();
                int i13 = this.f38069f;
                if (i13 != 0 && i13 < org.telegram.messenger.g0.L(20.0f)) {
                    k90Var.F.clearFocus();
                    k90Var.K.clearFocus();
                }
                FrameLayout frameLayout = k90Var.H;
                if (this.f38069f > org.telegram.messenger.g0.L(20.0f)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
                return;
            case 7:
                fe0 fe0Var = (fe0) this.f50653g0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fe0Var.N.getLayoutParams();
                int i14 = 0;
                if (fe0Var.z1()) {
                    i12 = org.telegram.messenger.g0.L(226.0f);
                } else {
                    i12 = 0;
                }
                if (fe0Var.z1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    i12 -= Q();
                }
                org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
                if (bcVar != null && bcVar.f32205l) {
                    super.onMeasure(i7, i10);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.camera.q.D(10.0f, org.telegram.ui.Components.bc.f32195w.f32199e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i12);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i12;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i14 = org.telegram.messenger.g0.f22561m;
                }
                ((ViewGroup.MarginLayoutParams) fe0Var.U.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) fe0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) fe0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                TextView textView = fe0Var.f45702f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && fe0Var.f45696c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !fe0Var.f45693a0) {
                    ValueAnimator valueAnimator = fe0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fe0Var.f45696c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f50653g0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f41593b.getEmojiPadding();
                }
                int i15 = size2;
                int childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f41593b.t0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f41593b.N1) {
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
        switch (this.f50652f0) {
            case 9:
                try {
                    ((o31) this.f50653g0).q0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                return;
        }
    }

    public v8(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context, r4Var);
        this.f50652f0 = 5;
    }
}
