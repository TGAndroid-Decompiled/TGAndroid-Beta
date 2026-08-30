package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vh1 extends FrameLayout {
    public float f39180a;
    public float f39181b;
    public boolean f39182c;
    public long d;
    public final ai1 e;

    public vh1(ai1 ai1Var, Activity activity) {
        super(activity);
        this.e = ai1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ai1 ai1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = ai1Var.v;
        if (view == c3Var && (ai1Var.f32622k0 || ai1Var.f32620j0)) {
            return false;
        }
        if ((view != c3Var && view != ai1Var.Z && (view != ai1Var.V || !ai1Var.X)) || (!ai1Var.f32608d1 && ai1Var.f32613f1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = ai1Var.f32606c1;
        canvas.scale(f10, f10, ai1Var.Y0, ai1Var.Z0);
        canvas.translate(ai1Var.V0, ai1Var.W0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ai1 ai1Var = this.e;
        kh1 kh1Var = ai1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ai1Var.f32640y.b(false, false);
            ai1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(kh1Var);
            if (ai1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(kh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.s2 s2Var;
        org.telegram.ui.Components.voip.d3 d3Var;
        ai1 ai1Var = this.e;
        kh1 kh1Var = ai1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ai1Var.f32640y.b(false, false);
            ai1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(kh1Var);
            if (ai1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(kh1Var, 10000L);
            }
        }
        if (!ai1Var.f32610e1 && !ai1Var.X0 && !ai1Var.f32608d1 && motionEvent.getActionMasked() != 0) {
            ai1.j(ai1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ai1Var.f32610e1 = false;
            ai1Var.X0 = false;
            ai1Var.f32608d1 = false;
        }
        if (ai1Var.f32620j0) {
            s2Var = ai1Var.Z;
        } else {
            s2Var = ai1Var.f32599a0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ai1Var.X0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ai1Var.f32600a1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ai1Var.f32603b1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ai1Var.U0;
                    ai1Var.f32606c1 = hypot;
                    if (hypot > 1.005f && !ai1Var.f32608d1) {
                        ai1Var.U0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ai1Var.Y0 = x10;
                        ai1Var.S0 = x10;
                        float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ai1Var.Z0 = y10;
                        ai1Var.T0 = y10;
                        ai1Var.f32606c1 = 1.0f;
                        ai1Var.V0 = 0.0f;
                        ai1Var.W0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ai1Var.f32608d1 = true;
                        ai1Var.X0 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float x12 = ai1Var.S0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y12 = ai1Var.T0 - ((motionEvent.getY(i11) + y11) / 2.0f);
                    float f10 = ai1Var.f32606c1;
                    ai1Var.V0 = (-x12) / f10;
                    ai1Var.W0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ai1.j(ai1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ai1Var.f32600a1 == motionEvent.getPointerId(0) && ai1Var.f32603b1 == motionEvent.getPointerId(1)) || (ai1Var.f32600a1 == motionEvent.getPointerId(1) && ai1Var.f32603b1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ai1.j(ai1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.Q) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.Q) - s2Var.getMeasuredWidth()) / 2.0f);
                if (!c60.C3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ai1Var.f32610e1 = contains;
                if (!contains) {
                    ai1.j(ai1Var);
                }
            }
            if (ai1Var.f32610e1 && !ai1Var.X0 && motionEvent.getPointerCount() == 2) {
                ai1Var.U0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ai1Var.Y0 = x13;
                ai1Var.S0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ai1Var.Z0 = y13;
                ai1Var.T0 = y13;
                ai1Var.f32606c1 = 1.0f;
                ai1Var.f32600a1 = motionEvent.getPointerId(0);
                ai1Var.f32603b1 = motionEvent.getPointerId(1);
                ai1Var.X0 = true;
            }
        }
        ai1Var.f32631s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f39182c = false;
                }
            } else if (this.f39182c) {
                float x14 = motionEvent.getX() - this.f39180a;
                float y14 = motionEvent.getY() - this.f39181b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ai1Var.f32628q0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ai1Var.H0 > 300) {
                    ai1Var.H0 = System.currentTimeMillis();
                    if (ai1Var.f32642z0) {
                        ai1Var.m(false);
                    } else if (ai1Var.f32637w0) {
                        ai1Var.A(!ai1Var.f32634u0);
                        ai1Var.f32625n0 = ai1Var.m0;
                        if (!ai1Var.f32634u0 && (d3Var = ai1Var.K0) != null && d3Var.S) {
                            d3Var.e(true);
                        }
                        ai1Var.H();
                    }
                }
                this.f39182c = false;
            }
        } else {
            this.f39180a = motionEvent.getX();
            this.f39181b = motionEvent.getY();
            this.f39182c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ai1Var.f32610e1 && !this.f39182c) {
            return false;
        }
        return true;
    }
}
