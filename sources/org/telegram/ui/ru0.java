package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class ru0 extends org.telegram.ui.Components.ek0 implements fi.w6 {
    public final ProfileActivity f51803f3;
    public VelocityTracker f51804g3;
    public final ProfileActivity f51805h3;

    public ru0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f51805h3 = profileActivity;
        this.f51803f3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f51805h3.O) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f51803f3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f51805h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f51805h3;
        wv0 wv0Var = profileActivity.O;
        if (wv0Var != null) {
            if (wv0Var.H()) {
                wv0 wv0Var2 = profileActivity.O;
                if (wv0Var2.F1 && wv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.H()) {
                wv0 wv0Var3 = profileActivity.O;
                if (wv0Var3.F1 && (wv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.jt0.J0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.gq0 gq0Var = profileActivity.O.f36568b0;
            if (gq0Var == null || !gq0Var.g()) {
                org.telegram.ui.Components.jq0 jq0Var = profileActivity.O.f36572c0;
                if (jq0Var != null && jq0Var.f50354f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        RectF rectF = ProfileActivity.Z6;
        this.f51805h3.s5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f51805h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f51804g3;
            if (velocityTracker2 == null) {
                this.f51804g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f51804g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f51804g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f51804g3.computeCurrentVelocity(1000);
                profileActivity.f43587j2 = this.f51804g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f51804g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f51804g3.computeCurrentVelocity(1000);
                profileActivity.f43587j2 = this.f51804g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f51804g3.recycle();
            this.f51804g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f24004m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            if (profileActivity.f43619o2 && !profileActivity.J0) {
                e42 = profileActivity.j4();
            } else {
                i10 = profileActivity.f43518a.getMeasuredWidth();
                e42 = profileActivity.e4();
            }
            if (profileActivity.Q1 >= (e42 + i10) - 1.0f) {
                profileActivity.N4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f43534c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.f43518a.P0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f43587j2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
