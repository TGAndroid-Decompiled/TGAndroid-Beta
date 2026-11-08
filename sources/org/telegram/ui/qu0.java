package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class qu0 extends org.telegram.ui.Components.pj0 implements di.f7 {
    public final ProfileActivity f49318e3;
    public VelocityTracker f49319f3;
    public final ProfileActivity f49320g3;

    public qu0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f49320g3 = profileActivity;
        this.f49318e3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f49320g3.N) {
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
        kVar = ((org.telegram.ui.ActionBar.f2) this.f49318e3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f49320g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f49320g3;
        vv0 vv0Var = profileActivity.N;
        if (vv0Var != null) {
            if (vv0Var.H()) {
                vv0 vv0Var2 = profileActivity.N;
                if (vv0Var2.E1 && vv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.H()) {
                vv0 vv0Var3 = profileActivity.N;
                if (vv0Var3.E1 && (vv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.xs0.I0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.up0 up0Var = profileActivity.N.f40391a0;
            if (up0Var == null || !up0Var.g()) {
                org.telegram.ui.Components.yp0 yp0Var = profileActivity.N.f40395b0;
                if (yp0Var != null && yp0Var.f47344f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        RectF rectF = ProfileActivity.S6;
        this.f49320g3.p5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f49320g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f49319f3;
            if (velocityTracker2 == null) {
                this.f49319f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f49319f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f49319f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f49319f3.computeCurrentVelocity(1000);
                profileActivity.f41746h2 = this.f49319f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f49319f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f49319f3.computeCurrentVelocity(1000);
                profileActivity.f41746h2 = this.f49319f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f49319f3.recycle();
            this.f49319f3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (kVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            if (profileActivity.f41778m2 && !profileActivity.I0) {
                e42 = profileActivity.j4();
            } else {
                i10 = profileActivity.f41691a.getMeasuredWidth();
                e42 = profileActivity.e4();
            }
            if (profileActivity.P1 >= (e42 + i10) - 1.0f) {
                profileActivity.K4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f41707c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.f41691a.O0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f41746h2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
