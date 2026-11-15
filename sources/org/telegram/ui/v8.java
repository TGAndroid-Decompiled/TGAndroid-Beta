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
    public final int f52158g0;
    public Object f52159h0;

    public v8(int i7, Context context, Object obj) {
        super(context, null);
        this.f52158g0 = i7;
        this.f52159h0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f52158g0) {
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
        switch (this.f52158g0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f52158g0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.ly) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.ly) view).getLayoutParams();
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
        switch (this.f52158g0) {
            case 9:
                k31 k31Var = (k31) this.f52159h0;
                k31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.e2) k31Var).glassEngine;
                qVar.g();
                if (!k31Var.O) {
                    org.telegram.messenger.g0.O(canvas, this, k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6), k31Var.f48521d0, 1.0f);
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
        switch (this.f52158g0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.ea0) this.f52159h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f52158g0) {
            case 1:
                Drawable m10 = ((ym) ((org.telegram.ui.Components.ea0) this.f52159h0).f34260d0.G).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 5:
                if (org.telegram.messenger.gz.H0) {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29169ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f52159h0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f52159h0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f52159h0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f52158g0) {
            case 5:
                if (!org.telegram.messenger.gz.H0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f52158g0) {
            case 2:
                return ((org.telegram.ui.Components.gy0) this.f52159h0).f35094c;
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
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
        int i11;
        int i12;
        switch (this.f52158g0) {
            case 0:
                ((i9) this.f52159h0).h0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.gy0) this.f52159h0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f52159h0;
                w4Var = ((org.telegram.ui.ActionBar.e2) contactsActivity).simpleActionBar;
                measureChildWithMargins(w4Var, i7, 0, i10, 0);
                w4Var2 = ((org.telegram.ui.ActionBar.e2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f42536c.getLayoutParams()).topMargin = w4Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                return;
            case 6:
                i90 i90Var = (i90) this.f52159h0;
                super.onMeasure(i7, i10);
                Q();
                int i13 = this.f39417f;
                if (i13 != 0 && i13 < org.telegram.messenger.g0.L(20.0f)) {
                    i90Var.G.clearFocus();
                    i90Var.L.clearFocus();
                }
                FrameLayout frameLayout = i90Var.I;
                if (this.f39417f > org.telegram.messenger.g0.L(20.0f)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
                return;
            case 7:
                ce0 ce0Var = (ce0) this.f52159h0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ce0Var.O.getLayoutParams();
                int i14 = 0;
                if (ce0Var.z1()) {
                    i12 = org.telegram.messenger.g0.L(226.0f);
                } else {
                    i12 = 0;
                }
                if (ce0Var.z1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    i12 -= Q();
                }
                org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
                if (xbVar != null && xbVar.f41637l) {
                    super.onMeasure(i7, i10);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.i20.D(10.0f, org.telegram.ui.Components.xb.f41627w.f41631e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i12);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i12;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i14 = org.telegram.messenger.g0.f23605m;
                }
                ((ViewGroup.MarginLayoutParams) ce0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) ce0Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                ((ViewGroup.MarginLayoutParams) ce0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                TextView textView = ce0Var.f46085g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i14;
                }
                if (ce0Var.f46092n0.getMinimumHeight() != i14) {
                    ce0Var.f46092n0.setMinimumHeight(i14);
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && ce0Var.f46078c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !ce0Var.f46077b0) {
                    ValueAnimator valueAnimator = ce0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ce0Var.f46078c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f52159h0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f42964b.getEmojiPadding();
                }
                int i15 = size2;
                int childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f42964b.H0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f42964b.f32302v2) {
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
        switch (this.f52158g0) {
            case 9:
                try {
                    ((k31) this.f52159h0).q0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                return;
        }
    }

    public v8(Context context, org.telegram.ui.ActionBar.o4 o4Var) {
        super(context, o4Var);
        this.f52158g0 = 5;
    }
}
