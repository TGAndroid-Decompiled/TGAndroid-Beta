package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class su0 extends org.telegram.ui.Components.qj0 implements di.g7 {
    public final ProfileActivity f49996e3;
    public VelocityTracker f49997f3;
    public final ProfileActivity f49998g3;

    public su0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f49998g3 = profileActivity;
        this.f49996e3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f49998g3.N) {
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
        kVar = ((org.telegram.ui.ActionBar.f2) this.f49996e3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f49998g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f49998g3;
        xv0 xv0Var = profileActivity.N;
        if (xv0Var != null) {
            if (xv0Var.H()) {
                xv0 xv0Var2 = profileActivity.N;
                if (xv0Var2.E1 && xv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.H()) {
                xv0 xv0Var3 = profileActivity.N;
                if (xv0Var3.E1 && (xv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.zs0.J0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.vp0 vp0Var = profileActivity.N.f41057a0;
            if (vp0Var == null || !vp0Var.g()) {
                org.telegram.ui.Components.zp0 zp0Var = profileActivity.N.f41061b0;
                if (zp0Var != null && zp0Var.f48549f) {
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
        RectF rectF = ProfileActivity.V6;
        this.f49998g3.s5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f49998g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f49997f3;
            if (velocityTracker2 == null) {
                this.f49997f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f49997f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f49997f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f49997f3.computeCurrentVelocity(1000);
                profileActivity.f41753h2 = this.f49997f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f49997f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f49997f3.computeCurrentVelocity(1000);
                profileActivity.f41753h2 = this.f49997f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f49997f3.recycle();
            this.f49997f3 = null;
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
            if (profileActivity.f41785m2 && !profileActivity.I0) {
                e42 = profileActivity.j4();
            } else {
                i10 = profileActivity.f41698a.getMeasuredWidth();
                e42 = profileActivity.e4();
            }
            if (profileActivity.P1 >= (e42 + i10) - 1.0f) {
                profileActivity.N4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f41714c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.f41698a.O0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f41753h2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
