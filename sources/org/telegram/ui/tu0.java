package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
public final class tu0 extends org.telegram.ui.Components.pj0 implements di.g7 {
    public final ProfileActivity f50345e3;
    public VelocityTracker f50346f3;
    public final ProfileActivity f50347g3;

    public tu0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f50347g3 = profileActivity;
        this.f50345e3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f50347g3.N) {
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
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.f50345e3).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f50347g3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f50347g3;
        yv0 yv0Var = profileActivity.N;
        if (yv0Var != null) {
            if (yv0Var.H()) {
                yv0 yv0Var2 = profileActivity.N;
                if (yv0Var2.E1 && yv0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.H()) {
                yv0 yv0Var3 = profileActivity.N;
                if (yv0Var3.E1 && (yv0Var3.getClosestTab() == 8 || org.telegram.ui.Components.ys0.J0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.up0 up0Var = profileActivity.N.f40649a0;
            if (up0Var == null || !up0Var.g()) {
                org.telegram.ui.Components.yp0 yp0Var = profileActivity.N.f40653b0;
                if (yp0Var != null && yp0Var.f48865f) {
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
        this.f50347g3.s5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        int i7;
        int e42;
        int action = motionEvent.getAction();
        ProfileActivity profileActivity = this.f50347g3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f50346f3;
            if (velocityTracker2 == null) {
                this.f50346f3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f50346f3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f50346f3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f50346f3.computeCurrentVelocity(1000);
                profileActivity.f41744h2 = this.f50346f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f50346f3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f50346f3.computeCurrentVelocity(1000);
                profileActivity.f41744h2 = this.f50346f3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f50346f3.recycle();
            this.f50346f3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (lVar.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22561m;
            } else {
                i7 = 0;
            }
            int i10 = currentActionBarHeight + i7;
            if (profileActivity.f41776m2 && !profileActivity.I0) {
                e42 = profileActivity.j4();
            } else {
                i10 = profileActivity.f41689a.getMeasuredWidth();
                e42 = profileActivity.e4();
            }
            if (profileActivity.P1 >= (e42 + i10) - 1.0f) {
                profileActivity.N4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f41705c.m(0)) != null) {
            if (profileActivity.N1) {
                profileActivity.N1 = false;
                profileActivity.f41689a.O0 = true;
            }
            ProfileActivity.R0(profileActivity, m10, profileActivity.f41744h2);
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
