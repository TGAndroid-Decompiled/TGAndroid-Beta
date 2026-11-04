package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ub1 extends FrameLayout {
    public float f50033a;
    public float f50034b;
    public boolean f50035c;
    public long d;
    public final zb1 f50036e;

    public ub1(zb1 zb1Var, Activity activity) {
        super(activity);
        this.f50036e = zb1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zb1 zb1Var = this.f50036e;
        org.telegram.ui.Components.voip.j2 j2Var = zb1Var.f52645w;
        if (view == j2Var && (zb1Var.f52635o0 || zb1Var.f52633n0)) {
            return false;
        }
        if ((view != j2Var && view != zb1Var.f52613d0 && (view != zb1Var.Z || !zb1Var.f52608b0)) || (!zb1Var.f52624h1 && zb1Var.f52628j1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = zb1Var.f52622g1;
        canvas.scale(f10, f10, zb1Var.f52612c1, zb1Var.f52614d1);
        canvas.translate(zb1Var.Z0, zb1Var.f52606a1);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        zb1 zb1Var = this.f50036e;
        kb1 kb1Var = zb1Var.U0;
        if (motionEvent.getActionMasked() == 1) {
            zb1Var.E.b(false, false);
            zb1Var.f52645w.a();
            org.telegram.messenger.g0.r(kb1Var);
            if (zb1Var.f52637q0 == 3) {
                org.telegram.messenger.g0.i3(kb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.z1 z1Var;
        org.telegram.ui.Components.zo zoVar;
        zb1 zb1Var = this.f50036e;
        kb1 kb1Var = zb1Var.U0;
        if (motionEvent.getActionMasked() == 1) {
            zb1Var.E.b(false, false);
            zb1Var.f52645w.a();
            org.telegram.messenger.g0.r(kb1Var);
            if (zb1Var.f52637q0 == 3) {
                org.telegram.messenger.g0.i3(kb1Var, 10000L);
            }
        }
        if (!zb1Var.f52626i1 && !zb1Var.f52609b1 && !zb1Var.f52624h1 && motionEvent.getActionMasked() != 0) {
            zb1.a(zb1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            zb1Var.f52626i1 = false;
            zb1Var.f52609b1 = false;
            zb1Var.f52624h1 = false;
        }
        if (zb1Var.f52633n0) {
            z1Var = zb1Var.f52613d0;
        } else {
            z1Var = zb1Var.f52616e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && zb1Var.f52609b1) {
                int i3 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (zb1Var.f52617e1 == motionEvent.getPointerId(i11)) {
                        i3 = i11;
                    }
                    if (zb1Var.f52620f1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i3 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i3), motionEvent.getY(i10) - motionEvent.getY(i3))) / zb1Var.Y0;
                    zb1Var.f52622g1 = hypot;
                    if (hypot > 1.005f && !zb1Var.f52624h1) {
                        zb1Var.Y0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i3), motionEvent.getY(i10) - motionEvent.getY(i3));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i3)) / 2.0f;
                        zb1Var.f52612c1 = x10;
                        zb1Var.W0 = x10;
                        float y9 = (motionEvent.getY(i10) + motionEvent.getY(i3)) / 2.0f;
                        zb1Var.f52614d1 = y9;
                        zb1Var.X0 = y9;
                        zb1Var.f52622g1 = 1.0f;
                        zb1Var.Z0 = 0.0f;
                        zb1Var.f52606a1 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        zb1Var.f52624h1 = true;
                        zb1Var.f52609b1 = true;
                    }
                    float x11 = motionEvent.getX(i3);
                    float y10 = motionEvent.getY(i3);
                    float x12 = zb1Var.W0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y11 = zb1Var.X0 - ((motionEvent.getY(i10) + y10) / 2.0f);
                    float f10 = zb1Var.f52622g1;
                    zb1Var.Z0 = (-x12) / f10;
                    zb1Var.f52606a1 = (-y11) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    zb1.a(zb1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((zb1Var.f52617e1 == motionEvent.getPointerId(0) && zb1Var.f52620f1 == motionEvent.getPointerId(1)) || (zb1Var.f52617e1 == motionEvent.getPointerId(1) && zb1Var.f52620f1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                zb1.a(zb1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(z1Var.getX(), z1Var.getY(), z1Var.getX() + z1Var.getMeasuredWidth(), z1Var.getY() + z1Var.getMeasuredHeight());
                rectF.inset(((z1Var.getMeasuredHeight() * z1Var.U) - z1Var.getMeasuredHeight()) / 2.0f, ((z1Var.getMeasuredWidth() * z1Var.U) - z1Var.getMeasuredWidth()) / 2.0f);
                if (!x30.f51713x5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, z1Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, z1Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                zb1Var.f52626i1 = contains;
                if (!contains) {
                    zb1.a(zb1Var);
                }
            }
            if (zb1Var.f52626i1 && !zb1Var.f52609b1 && motionEvent.getPointerCount() == 2) {
                zb1Var.Y0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                zb1Var.f52612c1 = x13;
                zb1Var.W0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                zb1Var.f52614d1 = y12;
                zb1Var.X0 = y12;
                zb1Var.f52622g1 = 1.0f;
                zb1Var.f52617e1 = motionEvent.getPointerId(0);
                zb1Var.f52620f1 = motionEvent.getPointerId(1);
                zb1Var.f52609b1 = true;
            }
        }
        zb1Var.f52640s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f50035c = false;
                }
            } else if (this.f50035c) {
                float x14 = motionEvent.getX() - this.f50033a;
                float y13 = motionEvent.getY() - this.f50034b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y13 * y13) + (x14 * x14);
                float f12 = zb1Var.f52643u0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - zb1Var.L0 > 300) {
                    zb1Var.L0 = System.currentTimeMillis();
                    if (zb1Var.D0) {
                        zb1Var.e(false);
                    } else if (zb1Var.A0) {
                        zb1Var.z(!zb1Var.f52650y0);
                        zb1Var.f52639r0 = zb1Var.f52637q0;
                        if (!zb1Var.f52650y0 && (zoVar = zb1Var.O0) != null && zoVar.W) {
                            zoVar.f(true);
                        }
                        zb1Var.G();
                    }
                }
                this.f50035c = false;
            }
        } else {
            this.f50033a = motionEvent.getX();
            this.f50034b = motionEvent.getY();
            this.f50035c = true;
            this.d = System.currentTimeMillis();
        }
        if (!zb1Var.f52626i1 && !this.f50035c) {
            return false;
        }
        return true;
    }
}
