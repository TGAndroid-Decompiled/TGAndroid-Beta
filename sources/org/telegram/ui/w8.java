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
public final class w8 extends org.telegram.ui.Components.uu0 {
    public final int f42897f0;
    public Object f42898g0;

    public w8(Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context, z4Var);
        this.f42897f0 = 5;
    }

    @Override
    public boolean O() {
        switch (this.f42897f0) {
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
        switch (this.f42897f0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f42897f0) {
            case 4:
                if (view instanceof org.telegram.ui.Components.vy) {
                    ViewGroup.LayoutParams layoutParams = ((org.telegram.ui.Components.vy) view).getLayoutParams();
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
        switch (this.f42897f0) {
            case 9:
                e51 e51Var = (e51) this.f42898g0;
                e51Var.o0();
                super.dispatchDraw(canvas);
                e51.h0(e51Var).g();
                if (!e51Var.N) {
                    org.telegram.messenger.i0.O(canvas, this, e51Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6), e51Var.f36936c0, 1.0f);
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
        switch (this.f42897f0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.ua0) this.f42898g0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f42897f0) {
            case 1:
                Drawable m10 = ((sn) ((org.telegram.ui.Components.ua0) this.f42898g0).f30881c0.F).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 5:
                if (org.telegram.messenger.tz.H0) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f42898g0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f42898g0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f42898g0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f42897f0) {
            case 5:
                if (!org.telegram.messenger.tz.H0 && super.getNewDrawableMotion()) {
                    return true;
                }
                return false;
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.p6 getResourceProvider() {
        switch (this.f42897f0) {
            case 2:
                return ((org.telegram.ui.Components.iz0) this.f42898g0).f27150c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f42897f0) {
            case 0:
                ((j9) this.f42898g0).g0();
                super.onMeasure(i10, i11);
                return;
            case 1:
            case 4:
            case 5:
            case 9:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.iz0) this.f42898g0).d.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f42898g0;
                i5Var = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                measureChildWithMargins(i5Var, i10, 0, i11, 0);
                i5Var2 = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f33282c.getLayoutParams()).topMargin = i5Var2.getMeasuredHeight();
                super.onMeasure(i10, i11);
                return;
            case 6:
                ma0 ma0Var = (ma0) this.f42898g0;
                super.onMeasure(i10, i11);
                Q();
                int i17 = this.f31056f;
                if (i17 != 0 && i17 < org.telegram.messenger.i0.L(20.0f)) {
                    ma0Var.F.clearFocus();
                    ma0Var.K.clearFocus();
                }
                FrameLayout frameLayout = ma0Var.H;
                if (this.f31056f > org.telegram.messenger.i0.L(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 7:
                hf0 hf0Var = (hf0) this.f42898g0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hf0Var.N.getLayoutParams();
                int i18 = 0;
                if (hf0Var.p1()) {
                    i13 = org.telegram.messenger.i0.L(226.0f);
                } else {
                    i13 = 0;
                }
                if (hf0Var.p1() && Q() > org.telegram.messenger.i0.L(20.0f)) {
                    i13 -= Q();
                }
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
                if (wbVar != null && wbVar.f32137l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.z20.D(10.0f, org.telegram.ui.Components.wb.f32128w.e.getMeasuredHeight() + org.telegram.messenger.i0.L(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.i0.L(14.0f) + i13;
                }
                if (!org.telegram.messenger.i0.Q1()) {
                    i18 = org.telegram.messenger.i0.f16020m;
                }
                ((ViewGroup.MarginLayoutParams) hf0Var.U.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) hf0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) hf0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i18;
                TextView textView = hf0Var.f37927f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(16.0f) + i18;
                }
                if (Q() > org.telegram.messenger.i0.L(20.0f) && hf0Var.f37922c.getVisibility() != 8 && !org.telegram.messenger.i0.C1() && !hf0Var.f37919a0) {
                    ValueAnimator valueAnimator = hf0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    hf0Var.f37922c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f42898g0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.i0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f33680b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f33680b.r0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f33680b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 10:
                ph.r3 r3Var = (ph.r3) this.f42898g0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r3Var.D.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int i21 = 0;
                if (ph.r3.d0(r3Var).getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.i0.f16020m;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r3Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (ph.r3.e0(r3Var).getOccupyStatusBar()) {
                    i15 = org.telegram.messenger.i0.f16020m;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = org.telegram.messenger.i0.L(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r3Var.f45296n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (ph.r3.f0(r3Var).getOccupyStatusBar()) {
                    i16 = org.telegram.messenger.i0.f16020m;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) r3Var.f45300x.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (ph.r3.g0(r3Var).getOccupyStatusBar()) {
                    i21 = org.telegram.messenger.i0.f16020m;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void updateColors() {
        switch (this.f42897f0) {
            case 9:
                try {
                    ((e51) this.f42898g0).p0();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                return;
        }
    }

    public w8(Object obj, Context context, int i10) {
        super(context, null);
        this.f42897f0 = i10;
        this.f42898g0 = obj;
    }
}
