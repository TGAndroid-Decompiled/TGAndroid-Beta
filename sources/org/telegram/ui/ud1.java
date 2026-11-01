package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ud1 extends FrameLayout {
    public float f41917a;
    public float f41918b;
    public boolean f41919c;
    public long d;
    public final zd1 e;

    public ud1(zd1 zd1Var, Activity activity) {
        super(activity);
        this.e = zd1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zd1 zd1Var = this.e;
        org.telegram.ui.Components.voip.k2 k2Var = zd1Var.f43975w;
        if (view == k2Var && (zd1Var.f43964n0 || zd1Var.m0)) {
            return false;
        }
        if ((view != k2Var && view != zd1Var.f43942c0 && (view != zd1Var.Y || !zd1Var.f43936a0)) || (!zd1Var.f43952g1 && zd1Var.f43956i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = zd1Var.f43950f1;
        canvas.scale(f7, f7, zd1Var.f43940b1, zd1Var.f43943c1);
        canvas.translate(zd1Var.Y0, zd1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        zd1 zd1Var = this.e;
        kd1 kd1Var = zd1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            zd1Var.D.b(false, false);
            zd1Var.f43975w.a();
            org.telegram.messenger.i0.r(kd1Var);
            if (zd1Var.f43966p0 == 3) {
                org.telegram.messenger.i0.h3(kd1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.z1 z1Var;
        org.telegram.ui.Components.voip.l2 l2Var;
        zd1 zd1Var = this.e;
        kd1 kd1Var = zd1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            zd1Var.D.b(false, false);
            zd1Var.f43975w.a();
            org.telegram.messenger.i0.r(kd1Var);
            if (zd1Var.f43966p0 == 3) {
                org.telegram.messenger.i0.h3(kd1Var, 10000L);
            }
        }
        if (!zd1Var.f43954h1 && !zd1Var.f43937a1 && !zd1Var.f43952g1 && motionEvent.getActionMasked() != 0) {
            zd1.a(zd1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            zd1Var.f43954h1 = false;
            zd1Var.f43937a1 = false;
            zd1Var.f43952g1 = false;
        }
        if (zd1Var.m0) {
            z1Var = zd1Var.f43942c0;
        } else {
            z1Var = zd1Var.f43944d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && zd1Var.f43937a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (zd1Var.f43945d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (zd1Var.f43947e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / zd1Var.X0;
                    zd1Var.f43950f1 = hypot;
                    if (hypot > 1.005f && !zd1Var.f43952g1) {
                        zd1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        zd1Var.f43940b1 = x10;
                        zd1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        zd1Var.f43943c1 = y3;
                        zd1Var.W0 = y3;
                        zd1Var.f43950f1 = 1.0f;
                        zd1Var.Y0 = 0.0f;
                        zd1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        zd1Var.f43952g1 = true;
                        zd1Var.f43937a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = zd1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = zd1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = zd1Var.f43950f1;
                    zd1Var.Y0 = (-x12) / f7;
                    zd1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    zd1.a(zd1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((zd1Var.f43945d1 == motionEvent.getPointerId(0) && zd1Var.f43947e1 == motionEvent.getPointerId(1)) || (zd1Var.f43945d1 == motionEvent.getPointerId(1) && zd1Var.f43947e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                zd1.a(zd1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(z1Var.getX(), z1Var.getY(), z1Var.getX() + z1Var.getMeasuredWidth(), z1Var.getY() + z1Var.getMeasuredHeight());
                rectF.inset(((z1Var.getMeasuredHeight() * z1Var.T) - z1Var.getMeasuredHeight()) / 2.0f, ((z1Var.getMeasuredWidth() * z1Var.T) - z1Var.getMeasuredWidth()) / 2.0f);
                if (!a50.f35575w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, z1Var.getMeasuredHeight() - org.telegram.messenger.i0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, z1Var.getMeasuredWidth() - org.telegram.messenger.i0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                zd1Var.f43954h1 = contains;
                if (!contains) {
                    zd1.a(zd1Var);
                }
            }
            if (zd1Var.f43954h1 && !zd1Var.f43937a1 && motionEvent.getPointerCount() == 2) {
                zd1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                zd1Var.f43940b1 = x13;
                zd1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                zd1Var.f43943c1 = y12;
                zd1Var.W0 = y12;
                zd1Var.f43950f1 = 1.0f;
                zd1Var.f43945d1 = motionEvent.getPointerId(0);
                zd1Var.f43947e1 = motionEvent.getPointerId(1);
                zd1Var.f43937a1 = true;
            }
        }
        zd1Var.f43970s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f41919c = false;
                }
            } else if (this.f41919c) {
                float x14 = motionEvent.getX() - this.f41917a;
                float y13 = motionEvent.getY() - this.f41918b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = zd1Var.f43972t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - zd1Var.K0 > 300) {
                    zd1Var.K0 = System.currentTimeMillis();
                    if (zd1Var.C0) {
                        zd1Var.e(false);
                    } else if (zd1Var.f43981z0) {
                        zd1Var.z(!zd1Var.f43978x0);
                        zd1Var.f43967q0 = zd1Var.f43966p0;
                        if (!zd1Var.f43978x0 && (l2Var = zd1Var.N0) != null && l2Var.V) {
                            l2Var.e(true);
                        }
                        zd1Var.G();
                    }
                }
                this.f41919c = false;
            }
        } else {
            this.f41917a = motionEvent.getX();
            this.f41918b = motionEvent.getY();
            this.f41919c = true;
            this.d = System.currentTimeMillis();
        }
        if (!zd1Var.f43954h1 && !this.f41919c) {
            return false;
        }
        return true;
    }
}
