package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class zb1 extends FrameLayout {
    public float f53929a;
    public float f53930b;
    public boolean f53931c;
    public long d;
    public final ec1 f53932e;

    public zb1(ec1 ec1Var, Activity activity) {
        super(activity);
        this.f53932e = ec1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ec1 ec1Var = this.f53932e;
        org.telegram.ui.Components.voip.y2 y2Var = ec1Var.f46721w;
        if (view == y2Var && (ec1Var.f46710n0 || ec1Var.m0)) {
            return false;
        }
        if ((view != y2Var && view != ec1Var.f46690d0 && (view != ec1Var.Z || !ec1Var.f46685b0)) || (!ec1Var.f46699g1 && ec1Var.f46703i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = ec1Var.f46697f1;
        canvas.scale(f10, f10, ec1Var.f46686b1, ec1Var.f46689c1);
        canvas.translate(ec1Var.Y0, ec1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ec1 ec1Var = this.f53932e;
        qb1 qb1Var = ec1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.E.b(false, false);
            ec1Var.f46721w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.f46712p0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.o2 o2Var;
        org.telegram.ui.Components.ip ipVar;
        ec1 ec1Var = this.f53932e;
        qb1 qb1Var = ec1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ec1Var.E.b(false, false);
            ec1Var.f46721w.a();
            org.telegram.messenger.g0.r(qb1Var);
            if (ec1Var.f46712p0 == 3) {
                org.telegram.messenger.g0.i3(qb1Var, 10000L);
            }
        }
        if (!ec1Var.f46701h1 && !ec1Var.f46683a1 && !ec1Var.f46699g1 && motionEvent.getActionMasked() != 0) {
            ec1.a(ec1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ec1Var.f46701h1 = false;
            ec1Var.f46683a1 = false;
            ec1Var.f46699g1 = false;
        }
        if (ec1Var.m0) {
            o2Var = ec1Var.f46690d0;
        } else {
            o2Var = ec1Var.f46693e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ec1Var.f46683a1) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (ec1Var.f46691d1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (ec1Var.f46694e1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / ec1Var.X0;
                    ec1Var.f46697f1 = hypot;
                    if (hypot > 1.005f && !ec1Var.f46699g1) {
                        ec1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        ec1Var.f46686b1 = x10;
                        ec1Var.V0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        ec1Var.f46689c1 = y10;
                        ec1Var.W0 = y10;
                        ec1Var.f46697f1 = 1.0f;
                        ec1Var.Y0 = 0.0f;
                        ec1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ec1Var.f46699g1 = true;
                        ec1Var.f46683a1 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = ec1Var.V0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = ec1Var.W0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = ec1Var.f46697f1;
                    ec1Var.Y0 = (-x12) / f10;
                    ec1Var.Z0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ec1.a(ec1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ec1Var.f46691d1 == motionEvent.getPointerId(0) && ec1Var.f46694e1 == motionEvent.getPointerId(1)) || (ec1Var.f46691d1 == motionEvent.getPointerId(1) && ec1Var.f46694e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ec1.a(ec1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(o2Var.getX(), o2Var.getY(), o2Var.getX() + o2Var.getMeasuredWidth(), o2Var.getY() + o2Var.getMeasuredHeight());
                rectF.inset(((o2Var.getMeasuredHeight() * o2Var.U) - o2Var.getMeasuredHeight()) / 2.0f, ((o2Var.getMeasuredWidth() * o2Var.U) - o2Var.getMeasuredWidth()) / 2.0f);
                if (!c40.E5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, o2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, o2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ec1Var.f46701h1 = contains;
                if (!contains) {
                    ec1.a(ec1Var);
                }
            }
            if (ec1Var.f46701h1 && !ec1Var.f46683a1 && motionEvent.getPointerCount() == 2) {
                ec1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ec1Var.f46686b1 = x13;
                ec1Var.V0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ec1Var.f46689c1 = y13;
                ec1Var.W0 = y13;
                ec1Var.f46697f1 = 1.0f;
                ec1Var.f46691d1 = motionEvent.getPointerId(0);
                ec1Var.f46694e1 = motionEvent.getPointerId(1);
                ec1Var.f46683a1 = true;
            }
        }
        ec1Var.f46716s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f53931c = false;
                }
            } else if (this.f53931c) {
                float x14 = motionEvent.getX() - this.f53929a;
                float y14 = motionEvent.getY() - this.f53930b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ec1Var.f46718t0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ec1Var.K0 > 300) {
                    ec1Var.K0 = System.currentTimeMillis();
                    if (ec1Var.C0) {
                        ec1Var.d(false);
                    } else if (ec1Var.f46727z0) {
                        ec1Var.r(!ec1Var.f46724x0);
                        ec1Var.f46713q0 = ec1Var.f46712p0;
                        if (!ec1Var.f46724x0 && (ipVar = ec1Var.N0) != null && ipVar.W) {
                            ipVar.f(true);
                        }
                        ec1Var.y();
                    }
                }
                this.f53931c = false;
            }
        } else {
            this.f53929a = motionEvent.getX();
            this.f53930b = motionEvent.getY();
            this.f53931c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ec1Var.f46701h1 && !this.f53931c) {
            return false;
        }
        return true;
    }
}
