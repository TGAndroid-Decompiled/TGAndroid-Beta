package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class zb1 extends FrameLayout {
    public float f52520a;
    public float f52521b;
    public boolean f52522c;
    public long d;
    public final ec1 f52523e;

    public zb1(ec1 ec1Var, Activity activity) {
        super(activity);
        this.f52523e = ec1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ec1 ec1Var = this.f52523e;
        org.telegram.ui.Components.voip.u2 u2Var = ec1Var.f45311w;
        if (view == u2Var && (ec1Var.m0 || ec1Var.f45298l0)) {
            return false;
        }
        if ((view != u2Var && view != ec1Var.f45278c0 && (view != ec1Var.Y || !ec1Var.f45272a0)) || (!ec1Var.f45287f1 && ec1Var.f45291h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = ec1Var.f45284e1;
        canvas.scale(f10, f10, ec1Var.f45273a1, ec1Var.f45276b1);
        canvas.translate(ec1Var.X0, ec1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ec1 ec1Var = this.f52523e;
        qb1 qb1Var = ec1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.D.b(false, false);
            ec1Var.f45311w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.f45301o0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.k2 k2Var;
        org.telegram.ui.Components.zo zoVar;
        ec1 ec1Var = this.f52523e;
        qb1 qb1Var = ec1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.D.b(false, false);
            ec1Var.f45311w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.f45301o0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        if (!ec1Var.f45289g1 && !ec1Var.Z0 && !ec1Var.f45287f1 && motionEvent.getActionMasked() != 0) {
            ec1.a(ec1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ec1Var.f45289g1 = false;
            ec1Var.Z0 = false;
            ec1Var.f45287f1 = false;
        }
        if (ec1Var.f45298l0) {
            k2Var = ec1Var.f45278c0;
        } else {
            k2Var = ec1Var.f45280d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ec1Var.Z0) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (ec1Var.f45279c1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (ec1Var.f45281d1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / ec1Var.W0;
                    ec1Var.f45284e1 = hypot;
                    if (hypot > 1.005f && !ec1Var.f45287f1) {
                        ec1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        ec1Var.f45273a1 = x10;
                        ec1Var.U0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        ec1Var.f45276b1 = y10;
                        ec1Var.V0 = y10;
                        ec1Var.f45284e1 = 1.0f;
                        ec1Var.X0 = 0.0f;
                        ec1Var.Y0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ec1Var.f45287f1 = true;
                        ec1Var.Z0 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = ec1Var.U0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = ec1Var.V0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = ec1Var.f45284e1;
                    ec1Var.X0 = (-x12) / f10;
                    ec1Var.Y0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ec1.a(ec1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ec1Var.f45279c1 == motionEvent.getPointerId(0) && ec1Var.f45281d1 == motionEvent.getPointerId(1)) || (ec1Var.f45279c1 == motionEvent.getPointerId(1) && ec1Var.f45281d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ec1.a(ec1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (!c40.f44541w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ec1Var.f45289g1 = contains;
                if (!contains) {
                    ec1.a(ec1Var);
                }
            }
            if (ec1Var.f45289g1 && !ec1Var.Z0 && motionEvent.getPointerCount() == 2) {
                ec1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ec1Var.f45273a1 = x13;
                ec1Var.U0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ec1Var.f45276b1 = y13;
                ec1Var.V0 = y13;
                ec1Var.f45284e1 = 1.0f;
                ec1Var.f45279c1 = motionEvent.getPointerId(0);
                ec1Var.f45281d1 = motionEvent.getPointerId(1);
                ec1Var.Z0 = true;
            }
        }
        ec1Var.f45306s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f52522c = false;
                }
            } else if (this.f52522c) {
                float x14 = motionEvent.getX() - this.f52520a;
                float y14 = motionEvent.getY() - this.f52521b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ec1Var.f45307s0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ec1Var.J0 > 300) {
                    ec1Var.J0 = System.currentTimeMillis();
                    if (ec1Var.B0) {
                        ec1Var.d(false);
                    } else if (ec1Var.f45316y0) {
                        ec1Var.r(!ec1Var.f45312w0);
                        ec1Var.f45302p0 = ec1Var.f45301o0;
                        if (!ec1Var.f45312w0 && (zoVar = ec1Var.M0) != null && zoVar.V) {
                            zoVar.f(true);
                        }
                        ec1Var.y();
                    }
                }
                this.f52522c = false;
            }
        } else {
            this.f52520a = motionEvent.getX();
            this.f52521b = motionEvent.getY();
            this.f52522c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ec1Var.f45289g1 && !this.f52522c) {
            return false;
        }
        return true;
    }
}
