package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xh1 extends FrameLayout {
    public float f43075a;
    public float f43076b;
    public boolean f43077c;
    public long d;
    public final ci1 f43078e;

    public xh1(ci1 ci1Var, Activity activity) {
        super(activity);
        this.f43078e = ci1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ci1 ci1Var = this.f43078e;
        org.telegram.ui.Components.voip.d3 d3Var = ci1Var.v;
        if (view == d3Var && (ci1Var.f35843k0 || ci1Var.f35841j0)) {
            return false;
        }
        if ((view != d3Var && view != ci1Var.Z && (view != ci1Var.V || !ci1Var.X)) || (!ci1Var.f35828d1 && ci1Var.f35834f1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = ci1Var.f35826c1;
        canvas.scale(f10, f10, ci1Var.Y0, ci1Var.Z0);
        canvas.translate(ci1Var.V0, ci1Var.W0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ci1 ci1Var = this.f43078e;
        mh1 mh1Var = ci1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ci1Var.f35861y.b(false, false);
            ci1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(mh1Var);
            if (ci1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(mh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        ci1 ci1Var = this.f43078e;
        mh1 mh1Var = ci1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ci1Var.f35861y.b(false, false);
            ci1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(mh1Var);
            if (ci1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(mh1Var, 10000L);
            }
        }
        if (!ci1Var.f35831e1 && !ci1Var.X0 && !ci1Var.f35828d1 && motionEvent.getActionMasked() != 0) {
            ci1.j(ci1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ci1Var.f35831e1 = false;
            ci1Var.X0 = false;
            ci1Var.f35828d1 = false;
        }
        if (ci1Var.f35841j0) {
            t2Var = ci1Var.Z;
        } else {
            t2Var = ci1Var.f35819a0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ci1Var.X0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ci1Var.f35820a1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ci1Var.f35823b1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ci1Var.U0;
                    ci1Var.f35826c1 = hypot;
                    if (hypot > 1.005f && !ci1Var.f35828d1) {
                        ci1Var.U0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ci1Var.Y0 = x10;
                        ci1Var.S0 = x10;
                        float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ci1Var.Z0 = y10;
                        ci1Var.T0 = y10;
                        ci1Var.f35826c1 = 1.0f;
                        ci1Var.V0 = 0.0f;
                        ci1Var.W0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ci1Var.f35828d1 = true;
                        ci1Var.X0 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float x12 = ci1Var.S0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y12 = ci1Var.T0 - ((motionEvent.getY(i11) + y11) / 2.0f);
                    float f10 = ci1Var.f35826c1;
                    ci1Var.V0 = (-x12) / f10;
                    ci1Var.W0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ci1.j(ci1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ci1Var.f35820a1 == motionEvent.getPointerId(0) && ci1Var.f35823b1 == motionEvent.getPointerId(1)) || (ci1Var.f35820a1 == motionEvent.getPointerId(1) && ci1Var.f35823b1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ci1.j(ci1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.Q) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.Q) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!d60.C3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ci1Var.f35831e1 = contains;
                if (!contains) {
                    ci1.j(ci1Var);
                }
            }
            if (ci1Var.f35831e1 && !ci1Var.X0 && motionEvent.getPointerCount() == 2) {
                ci1Var.U0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ci1Var.Y0 = x13;
                ci1Var.S0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ci1Var.Z0 = y13;
                ci1Var.T0 = y13;
                ci1Var.f35826c1 = 1.0f;
                ci1Var.f35820a1 = motionEvent.getPointerId(0);
                ci1Var.f35823b1 = motionEvent.getPointerId(1);
                ci1Var.X0 = true;
            }
        }
        ci1Var.f35852s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f43077c = false;
                }
            } else if (this.f43077c) {
                float x14 = motionEvent.getX() - this.f43075a;
                float y14 = motionEvent.getY() - this.f43076b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ci1Var.f35849q0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ci1Var.H0 > 300) {
                    ci1Var.H0 = System.currentTimeMillis();
                    if (ci1Var.f35863z0) {
                        ci1Var.m(false);
                    } else if (ci1Var.f35858w0) {
                        ci1Var.A(!ci1Var.f35855u0);
                        ci1Var.f35846n0 = ci1Var.m0;
                        if (!ci1Var.f35855u0 && (e3Var = ci1Var.K0) != null && e3Var.S) {
                            e3Var.e(true);
                        }
                        ci1Var.H();
                    }
                }
                this.f43077c = false;
            }
        } else {
            this.f43075a = motionEvent.getX();
            this.f43076b = motionEvent.getY();
            this.f43077c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ci1Var.f35831e1 && !this.f43077c) {
            return false;
        }
        return true;
    }
}
