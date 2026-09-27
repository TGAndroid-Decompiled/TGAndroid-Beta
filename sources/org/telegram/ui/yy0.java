package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yy0 extends org.telegram.ui.Components.yl0 implements ai.s9 {
    public final ProfileActivity X2;
    public VelocityTracker Y2;
    public final ProfileActivity Z2;

    public yy0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.Z2 = profileActivity;
        this.X2 = profileActivity;
    }

    @Override
    public final boolean G0(View view) {
        if (view != this.Z2.O) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean I0(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.j);
    }

    @Override
    public final void a(int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.X2).actionBar;
        iArr[0] = lVar.getMeasuredHeight();
        iArr[1] = getMeasuredHeight() - getPaddingBottom();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.Z2.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ProfileActivity profileActivity = this.Z2;
        e01 e01Var = profileActivity.O;
        if (e01Var != null) {
            if (e01Var.C()) {
                e01 e01Var2 = profileActivity.O;
                if (e01Var2.C1 && e01Var2.getClosestTab() == 13) {
                    return false;
                }
            }
            if (profileActivity.O.C()) {
                e01 e01Var3 = profileActivity.O;
                if (e01Var3.C1 && (e01Var3.getClosestTab() == 8 || org.telegram.ui.Components.lv0.w0(profileActivity.O.getClosestTab()))) {
                    return false;
                }
            }
            org.telegram.ui.Components.bs0 bs0Var = profileActivity.O.V;
            if (bs0Var == null || !bs0Var.g()) {
                org.telegram.ui.Components.gs0 gs0Var = profileActivity.O.W;
                if (gs0Var != null && gs0Var.f37628w) {
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
        this.Z2.U4();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View m10;
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        int O3;
        int action = motionEvent.getAction();
        boolean z10 = true;
        ProfileActivity profileActivity = this.Z2;
        if (action == 0) {
            VelocityTracker velocityTracker2 = this.Y2;
            if (velocityTracker2 == null) {
                this.Y2 = VelocityTracker.obtain();
            } else {
                velocityTracker2.clear();
            }
            this.Y2.addMovement(motionEvent);
        } else if (action == 2) {
            VelocityTracker velocityTracker3 = this.Y2;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.Y2.computeCurrentVelocity(1000);
                profileActivity.f31587i2 = this.Y2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        } else if ((action == 1 || action == 3) && (velocityTracker = this.Y2) != null) {
            if (action == 1) {
                velocityTracker.addMovement(motionEvent);
                this.Y2.computeCurrentVelocity(1000);
                profileActivity.f31587i2 = this.Y2.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            this.Y2.recycle();
            this.Y2 = null;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int i12 = currentActionBarHeight + i11;
            if (profileActivity.f31619n2 && !profileActivity.I0) {
                O3 = profileActivity.T3();
            } else {
                i12 = profileActivity.f31526a.getMeasuredWidth();
                O3 = profileActivity.O3();
            }
            if (profileActivity.Q1 >= (O3 + i12) - 1.0f) {
                profileActivity.w4(true);
                onTouchEvent = false;
            }
        }
        if ((action == 1 || action == 3) && (m10 = profileActivity.f31541c.m(0)) != null) {
            if (profileActivity.O1) {
                profileActivity.O1 = false;
                profileActivity.f31526a.N0 = true;
            }
            if (profileActivity.f31626o2) {
                if (profileActivity.f31633p2) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (lVar.getOccupyStatusBar()) {
                        i10 = AndroidUtilities.statusBarHeight;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.f31526a.w0(0, ((m10.getTop() - profileActivity.f31526a.getMeasuredWidth()) - profileActivity.O3()) + currentActionBarHeight2 + i10, org.telegram.ui.Components.sr.h);
                    return onTouchEvent;
                }
                profileActivity.f31526a.w0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.sr.h);
                return onTouchEvent;
            }
            if (profileActivity.O3() <= 0) {
                z10 = false;
            }
            if (z10) {
                float f7 = profileActivity.Q1;
                if (f7 > 0.0f && ((f7 < profileActivity.T3() * 0.6f || profileActivity.f31587i2 < -1000.0f) && profileActivity.Q1 > profileActivity.O3() * 0.6f)) {
                    profileActivity.f31526a.w0(0, (int) (profileActivity.Q1 - profileActivity.O3()), org.telegram.ui.Components.sr.h);
                    return onTouchEvent;
                }
            }
            if (z10) {
                float f10 = profileActivity.Q1;
                if (f10 > 0.0f && f10 < profileActivity.O3() * 0.6f) {
                    profileActivity.f31526a.w0(0, (int) (profileActivity.O3() - profileActivity.Q1), org.telegram.ui.Components.sr.h);
                    return onTouchEvent;
                }
            }
            if (!z10) {
                float f11 = profileActivity.Q1;
                if (f11 > 0.0f && profileActivity.f31587i2 < -1000.0f) {
                    profileActivity.f31526a.w0(0, (int) f11, org.telegram.ui.Components.sr.h);
                    return onTouchEvent;
                }
            }
            if (profileActivity.Q1 > 0.0f) {
                profileActivity.f31526a.w0(0, m10.getTop() - profileActivity.T3(), org.telegram.ui.Components.sr.h);
            }
        }
        return onTouchEvent;
    }

    @Override
    public final void r0(View view, View view2) {
    }
}
