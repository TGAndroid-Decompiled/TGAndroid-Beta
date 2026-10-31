package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class wd1 extends FrameLayout {
    public float f42952a;
    public float f42953b;
    public boolean f42954c;
    public long d;
    public final be1 e;

    public wd1(be1 be1Var, Activity activity) {
        super(activity);
        this.e = be1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        be1 be1Var = this.e;
        org.telegram.ui.Components.voip.j2 j2Var = be1Var.f36236w;
        if (view == j2Var && (be1Var.f36225n0 || be1Var.m0)) {
            return false;
        }
        if ((view != j2Var && view != be1Var.f36203c0 && (view != be1Var.Y || !be1Var.f36197a0)) || (!be1Var.f36213g1 && be1Var.f36217i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = be1Var.f36211f1;
        canvas.scale(f7, f7, be1Var.f36201b1, be1Var.f36204c1);
        canvas.translate(be1Var.Y0, be1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        be1 be1Var = this.e;
        md1 md1Var = be1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            be1Var.D.b(false, false);
            be1Var.f36236w.a();
            org.telegram.messenger.i0.r(md1Var);
            if (be1Var.f36227p0 == 3) {
                org.telegram.messenger.i0.h3(md1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.y1 y1Var;
        org.telegram.ui.Components.voip.k2 k2Var;
        be1 be1Var = this.e;
        md1 md1Var = be1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            be1Var.D.b(false, false);
            be1Var.f36236w.a();
            org.telegram.messenger.i0.r(md1Var);
            if (be1Var.f36227p0 == 3) {
                org.telegram.messenger.i0.h3(md1Var, 10000L);
            }
        }
        if (!be1Var.f36215h1 && !be1Var.f36198a1 && !be1Var.f36213g1 && motionEvent.getActionMasked() != 0) {
            be1.a(be1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            be1Var.f36215h1 = false;
            be1Var.f36198a1 = false;
            be1Var.f36213g1 = false;
        }
        if (be1Var.m0) {
            y1Var = be1Var.f36203c0;
        } else {
            y1Var = be1Var.f36205d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && be1Var.f36198a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (be1Var.f36206d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (be1Var.f36208e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / be1Var.X0;
                    be1Var.f36211f1 = hypot;
                    if (hypot > 1.005f && !be1Var.f36213g1) {
                        be1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        be1Var.f36201b1 = x10;
                        be1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        be1Var.f36204c1 = y3;
                        be1Var.W0 = y3;
                        be1Var.f36211f1 = 1.0f;
                        be1Var.Y0 = 0.0f;
                        be1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        be1Var.f36213g1 = true;
                        be1Var.f36198a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = be1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = be1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = be1Var.f36211f1;
                    be1Var.Y0 = (-x12) / f7;
                    be1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    be1.a(be1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((be1Var.f36206d1 == motionEvent.getPointerId(0) && be1Var.f36208e1 == motionEvent.getPointerId(1)) || (be1Var.f36206d1 == motionEvent.getPointerId(1) && be1Var.f36208e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                be1.a(be1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(y1Var.getX(), y1Var.getY(), y1Var.getX() + y1Var.getMeasuredWidth(), y1Var.getY() + y1Var.getMeasuredHeight());
                rectF.inset(((y1Var.getMeasuredHeight() * y1Var.T) - y1Var.getMeasuredHeight()) / 2.0f, ((y1Var.getMeasuredWidth() * y1Var.T) - y1Var.getMeasuredWidth()) / 2.0f);
                if (!b50.f35991w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, y1Var.getMeasuredHeight() - org.telegram.messenger.i0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, y1Var.getMeasuredWidth() - org.telegram.messenger.i0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                be1Var.f36215h1 = contains;
                if (!contains) {
                    be1.a(be1Var);
                }
            }
            if (be1Var.f36215h1 && !be1Var.f36198a1 && motionEvent.getPointerCount() == 2) {
                be1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                be1Var.f36201b1 = x13;
                be1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                be1Var.f36204c1 = y12;
                be1Var.W0 = y12;
                be1Var.f36211f1 = 1.0f;
                be1Var.f36206d1 = motionEvent.getPointerId(0);
                be1Var.f36208e1 = motionEvent.getPointerId(1);
                be1Var.f36198a1 = true;
            }
        }
        be1Var.f36231s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f42954c = false;
                }
            } else if (this.f42954c) {
                float x14 = motionEvent.getX() - this.f42952a;
                float y13 = motionEvent.getY() - this.f42953b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = be1Var.f36233t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - be1Var.K0 > 300) {
                    be1Var.K0 = System.currentTimeMillis();
                    if (be1Var.C0) {
                        be1Var.e(false);
                    } else if (be1Var.f36242z0) {
                        be1Var.z(!be1Var.f36239x0);
                        be1Var.f36228q0 = be1Var.f36227p0;
                        if (!be1Var.f36239x0 && (k2Var = be1Var.N0) != null && k2Var.V) {
                            k2Var.e(true);
                        }
                        be1Var.G();
                    }
                }
                this.f42954c = false;
            }
        } else {
            this.f42952a = motionEvent.getX();
            this.f42953b = motionEvent.getY();
            this.f42954c = true;
            this.d = System.currentTimeMillis();
        }
        if (!be1Var.f36215h1 && !this.f42954c) {
            return false;
        }
        return true;
    }
}
