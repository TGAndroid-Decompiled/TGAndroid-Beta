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
public final class w8 extends org.telegram.ui.Components.cu0 {
    public final int f53197g0;
    public Object f53198h0;

    public w8(int i7, Context context, Object obj) {
        super(context, null);
        this.f53197g0 = i7;
        this.f53198h0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f53197g0) {
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
        switch (this.f53197g0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f53197g0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.qy) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.qy) view).getLayoutParams();
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
        switch (this.f53197g0) {
            case 9:
                n31 n31Var = (n31) this.f53198h0;
                n31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.g2) n31Var).glassEngine;
                qVar.g();
                if (!n31Var.O) {
                    org.telegram.messenger.g0.O(canvas, this, n31Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6), n31Var.f50194d0, 1.0f);
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
        switch (this.f53197g0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.na0) this.f53198h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f53197g0) {
            case 1:
                Drawable m10 = ((zm) ((org.telegram.ui.Components.na0) this.f53198h0).f37742d0.G).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 5:
                if (org.telegram.messenger.bz.H0) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29771ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f53198h0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f53198h0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f53198h0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f53197g0) {
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
        switch (this.f53197g0) {
            case 2:
                return ((org.telegram.ui.Components.oy0) this.f53198h0).f38280c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i11;
        int i12;
        switch (this.f53197g0) {
            case 0:
                ((j9) this.f53198h0).h0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.oy0) this.f53198h0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f53198h0;
                z4Var = ((org.telegram.ui.ActionBar.g2) contactsActivity).simpleActionBar;
                measureChildWithMargins(z4Var, i7, 0, i10, 0);
                z4Var2 = ((org.telegram.ui.ActionBar.g2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f43100c.getLayoutParams()).topMargin = z4Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                return;
            case 6:
                j90 j90Var = (j90) this.f53198h0;
                super.onMeasure(i7, i10);
                Q();
                int i13 = this.f34142f;
                if (i13 != 0 && i13 < org.telegram.messenger.g0.L(20.0f)) {
                    j90Var.G.clearFocus();
                    j90Var.L.clearFocus();
                }
                FrameLayout frameLayout = j90Var.I;
                if (this.f34142f > org.telegram.messenger.g0.L(20.0f)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
                return;
            case 7:
                de0 de0Var = (de0) this.f53198h0;
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
                org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
                if (fcVar != null && fcVar.f35093l) {
                    super.onMeasure(i7, i10);
                    marginLayoutParams.bottomMargin = org.telegram.ui.Cells.c0.i(10.0f, org.telegram.ui.Components.fc.f35083w.f35087e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i12);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i12;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i14 = org.telegram.messenger.g0.f24220m;
                }
                ((ViewGroup.MarginLayoutParams) de0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) de0Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) de0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                TextView textView = de0Var.f47060g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                }
                if (de0Var.f47067n0.getMinimumHeight() != i14) {
                    de0Var.f47067n0.setMinimumHeight(i14);
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && de0Var.f47053c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !de0Var.f47052b0) {
                    ValueAnimator valueAnimator = de0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    de0Var.f47053c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f53198h0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f43535b.getEmojiPadding();
                }
                int i15 = size2;
                int childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f43535b.U0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f43535b.D2) {
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
        switch (this.f53197g0) {
            case 9:
                try {
                    ((n31) this.f53198h0).q0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                return;
        }
    }

    public w8(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context, r4Var);
        this.f53197g0 = 5;
    }
}
