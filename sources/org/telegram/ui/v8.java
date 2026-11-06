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
public final class v8 extends org.telegram.ui.Components.rt0 {
    public final int f50598f0;
    public Object f50599g0;

    public v8(int i7, Context context, Object obj) {
        super(context, null);
        this.f50598f0 = i7;
        this.f50599g0 = obj;
    }

    @Override
    public boolean O() {
        switch (this.f50598f0) {
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
        switch (this.f50598f0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f50598f0) {
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
        switch (this.f50598f0) {
            case 9:
                m31 m31Var = (m31) this.f50599g0;
                m31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.f2) m31Var).glassEngine;
                qVar.g();
                if (!m31Var.N) {
                    org.telegram.messenger.g0.O(canvas, this, m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6), m31Var.f47620c0, 1.0f);
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
        switch (this.f50598f0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.ca0) this.f50599g0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f50598f0) {
            case 1:
                Drawable m10 = ((ym) ((org.telegram.ui.Components.ca0) this.f50599g0).f32503c0.F).m();
                if (m10 == null) {
                    return super.getNewDrawable();
                }
                return m10;
            case 5:
                if (org.telegram.messenger.iz.H0) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28168ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.f50599g0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.f50599g0 = new ColorDrawable(x02);
                    }
                    return (ColorDrawable) this.f50599g0;
                }
                return super.getNewDrawable();
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public boolean getNewDrawableMotion() {
        switch (this.f50598f0) {
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
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f50598f0) {
            case 2:
                return ((org.telegram.ui.Components.dy0) this.f50599g0).f33049c;
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
        int i13;
        int i14;
        int i15;
        switch (this.f50598f0) {
            case 0:
                ((i9) this.f50599g0).h0();
                super.onMeasure(i7, i10);
                return;
            case 1:
            case 4:
            case 5:
            case 9:
            default:
                super.onMeasure(i7, i10);
                return;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i7), ((org.telegram.ui.Components.dy0) this.f50599g0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f50599g0;
                y4Var = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                measureChildWithMargins(y4Var, i7, 0, i10, 0);
                y4Var2 = ((org.telegram.ui.ActionBar.f2) contactsActivity).simpleActionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f41155c.getLayoutParams()).topMargin = y4Var2.getMeasuredHeight();
                super.onMeasure(i7, i10);
                return;
            case 6:
                h90 h90Var = (h90) this.f50599g0;
                super.onMeasure(i7, i10);
                Q();
                int i16 = this.f37845f;
                if (i16 != 0 && i16 < org.telegram.messenger.g0.L(20.0f)) {
                    h90Var.F.clearFocus();
                    h90Var.K.clearFocus();
                }
                FrameLayout frameLayout = h90Var.H;
                if (this.f37845f > org.telegram.messenger.g0.L(20.0f)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                frameLayout.setVisibility(i11);
                return;
            case 7:
                ce0 ce0Var = (ce0) this.f50599g0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ce0Var.N.getLayoutParams();
                int i17 = 0;
                if (ce0Var.z1()) {
                    i12 = org.telegram.messenger.g0.L(226.0f);
                } else {
                    i12 = 0;
                }
                if (ce0Var.z1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    i12 -= Q();
                }
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32515w;
                if (ccVar != null && ccVar.f32525l) {
                    super.onMeasure(i7, i10);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.camera.q.D(10.0f, org.telegram.ui.Components.cc.f32515w.f32519e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), i12);
                } else {
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(14.0f) + i12;
                }
                if (!org.telegram.messenger.g0.Q1()) {
                    i17 = org.telegram.messenger.g0.f22531m;
                }
                ((ViewGroup.MarginLayoutParams) ce0Var.U.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i17;
                ((ViewGroup.MarginLayoutParams) ce0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i17;
                ((ViewGroup.MarginLayoutParams) ce0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i17;
                TextView textView = ce0Var.f44746f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i17;
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && ce0Var.f44740c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !ce0Var.f44737a0) {
                    ValueAnimator valueAnimator = ce0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ce0Var.f44740c.setVisibility(8);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f50599g0;
                View.MeasureSpec.getMode(i7);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.f41567b.getEmojiPadding();
                }
                int i18 = size2;
                int childCount = getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = getChildAt(i19);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f41567b.t0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f41567b.N1) {
                            measureChildWithMargins(childAt, i7, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f) + i18), 1073741824));
                        }
                    }
                }
                return;
            case 10:
                zh.m3 m3Var = (zh.m3) this.f50599g0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m3Var.D.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i20 = 0;
                if (zh.m3.e0(m3Var).getOccupyStatusBar()) {
                    i13 = org.telegram.messenger.g0.f22531m;
                } else {
                    i13 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i13;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) m3Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zh.m3.f0(m3Var).getOccupyStatusBar()) {
                    i14 = org.telegram.messenger.g0.f22531m;
                } else {
                    i14 = 0;
                }
                layoutParams2.topMargin = org.telegram.messenger.g0.L(47.0f) + currentActionBarHeight2 + i14;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m3Var.f60344n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zh.m3.g0(m3Var).getOccupyStatusBar()) {
                    i15 = org.telegram.messenger.g0.f22531m;
                } else {
                    i15 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i15;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) m3Var.f60348x.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zh.m3.h0(m3Var).getOccupyStatusBar()) {
                    i20 = org.telegram.messenger.g0.f22531m;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i20;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void updateColors() {
        switch (this.f50598f0) {
            case 9:
                try {
                    ((m31) this.f50599g0).q0();
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
        this.f50598f0 = 5;
    }
}
