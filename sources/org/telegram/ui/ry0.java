package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ry0 extends org.telegram.ui.Components.nm0 implements di.o7 {
    public final ProfileActivity f43189f3;
    public VelocityTracker f43190g3;
    public final ProfileActivity f43191h3;

    public ry0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f43191h3 = profileActivity;
        this.f43189f3 = profileActivity;
    }

    @Override
    public final boolean F0(View view) {
        if (view != this.f43191h3.N) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean H0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.f43189f3).actionBar;
        iArr[0] = kVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f43191h3.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.f43191h3;
        xz0 xz0Var = profileActivity.N;
        if (xz0Var != null) {
            if (xz0Var.F()) {
                xz0 xz0Var2 = profileActivity.N;
                if (xz0Var2.E1 && xz0Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.N.F()) {
                xz0 xz0Var3 = profileActivity.N;
                if (xz0Var3.E1 && (xz0Var3.getClosestTab() == 8 || org.telegram.ui.Components.bw0.E0(profileActivity.N.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.ws0 ws0Var = profileActivity.N.f26925a0;
            if (ws0Var == null || !ws0Var.g()) {
                org.telegram.ui.Components.at0 at0Var = profileActivity.N.f26928b0;
                if (at0Var != null && at0Var.f41611f) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = ProfileActivity.R6;
        this.f43191h3.g5();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        int X3;
        int action = motionEvent.getAction();
        boolean z10 = true;
        ProfileActivity profileActivity = this.f43191h3;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.f43190g3;
            if (velocityTracker2 == null) {
                this.f43190g3 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.f43190g3.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.f43190g3;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f43190g3.computeCurrentVelocity(1000);
                profileActivity.f36033i2 = this.f43190g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.f43190g3) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.f43190g3.computeCurrentVelocity(1000);
                profileActivity.f36033i2 = this.f43190g3.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.f43190g3.recycle();
            this.f43190g3 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int i12 = currentActionBarHeight + i11;
            if (profileActivity.f36066n2 && !profileActivity.I0) {
                X3 = profileActivity.c4();
            } else {
                i12 = profileActivity.f35972a.getMeasuredWidth();
                X3 = profileActivity.X3();
            }
            if (profileActivity.Q1 >= (X3 + i12) - 1.0f) {
                profileActivity.E4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f35987c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.f35972a.O0 = true;
            }
            if (profileActivity.f36073o2) {
                if (profileActivity.f36080p2) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
                    if (kVar.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.f35972a.w0(0, ((m10.getTop() - profileActivity.f35972a.getMeasuredWidth()) - profileActivity.X3()) + currentActionBarHeight2 + i10, org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
                profileActivity.f35972a.w0(0, m10.getTop() - profileActivity.c4(), org.telegram.ui.Components.ds.h);
                return onTouchEvent;
            }
            if (profileActivity.X3() <= 0) {
                z10 = false;
            }
            if (z10) {
                float f7 = profileActivity.Q1;
                if (f7 > 0.0f && ((f7 < profileActivity.c4() * 0.6f || profileActivity.f36033i2 < -1000.0f) && profileActivity.Q1 > profileActivity.X3() * 0.6f)) {
                    profileActivity.f35972a.w0(0, (int) (profileActivity.Q1 - profileActivity.X3()), org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.Q1;
                if (f10 > 0.0f && f10 < profileActivity.X3() * 0.6f) {
                    profileActivity.f35972a.w0(0, (int) (profileActivity.X3() - profileActivity.Q1), org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.Q1;
                if (f11 > 0.0f && profileActivity.f36033i2 < -1000.0f) {
                    profileActivity.f35972a.w0(0, (int) f11, org.telegram.ui.Components.ds.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.Q1 > 0.0f) {
                profileActivity.f35972a.w0(0, m10.getTop() - profileActivity.c4(), org.telegram.ui.Components.ds.h);
            }
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
