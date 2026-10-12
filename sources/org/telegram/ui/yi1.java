package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yi1 extends FrameLayout {
    public float f42174a;
    public float f42175b;
    public boolean f42176c;
    public long d;
    public final dj1 e;

    public yi1(dj1 dj1Var, Activity activity) {
        super(activity);
        this.e = dj1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        dj1 dj1Var = this.e;
        org.telegram.ui.Components.voip.b3 b3Var = dj1Var.v;
        if (view == b3Var && (dj1Var.f35303n0 || dj1Var.m0)) {
            return false;
        }
        if ((view != b3Var && view != dj1Var.f35281c0 && (view != dj1Var.Y || !dj1Var.f35275a0)) || (!dj1Var.f35291g1 && dj1Var.f35295i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = dj1Var.f35289f1;
        canvas.scale(f7, f7, dj1Var.f35279b1, dj1Var.f35282c1);
        canvas.translate(dj1Var.Y0, dj1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dj1 dj1Var = this.e;
        ni1 ni1Var = dj1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            dj1Var.f35318y.b(false, false);
            dj1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ni1Var);
            if (dj1Var.f35305p0 == 3) {
                AndroidUtilities.runOnUIThread(ni1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.r2 r2Var;
        org.telegram.ui.Components.voip.c3 c3Var;
        dj1 dj1Var = this.e;
        ni1 ni1Var = dj1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            dj1Var.f35318y.b(false, false);
            dj1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ni1Var);
            if (dj1Var.f35305p0 == 3) {
                AndroidUtilities.runOnUIThread(ni1Var, 10000L);
            }
        }
        if (!dj1Var.f35293h1 && !dj1Var.f35276a1 && !dj1Var.f35291g1 && motionEvent.getActionMasked() != 0) {
            dj1.i(dj1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            dj1Var.f35293h1 = false;
            dj1Var.f35276a1 = false;
            dj1Var.f35291g1 = false;
        }
        if (dj1Var.m0) {
            r2Var = dj1Var.f35281c0;
        } else {
            r2Var = dj1Var.f35283d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && dj1Var.f35276a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (dj1Var.f35284d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (dj1Var.f35286e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / dj1Var.X0;
                    dj1Var.f35289f1 = hypot;
                    if (hypot > 1.005f && !dj1Var.f35291g1) {
                        dj1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        dj1Var.f35279b1 = x10;
                        dj1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        dj1Var.f35282c1 = y3;
                        dj1Var.W0 = y3;
                        dj1Var.f35289f1 = 1.0f;
                        dj1Var.Y0 = 0.0f;
                        dj1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        dj1Var.f35291g1 = true;
                        dj1Var.f35276a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = dj1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = dj1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = dj1Var.f35289f1;
                    dj1Var.Y0 = (-x12) / f7;
                    dj1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    dj1.i(dj1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((dj1Var.f35284d1 == motionEvent.getPointerId(0) && dj1Var.f35286e1 == motionEvent.getPointerId(1)) || (dj1Var.f35284d1 == motionEvent.getPointerId(1) && dj1Var.f35286e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                dj1.i(dj1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(r2Var.getX(), r2Var.getY(), r2Var.getX() + r2Var.getMeasuredWidth(), r2Var.getY() + r2Var.getMeasuredHeight());
                rectF.inset(((r2Var.getMeasuredHeight() * r2Var.T) - r2Var.getMeasuredHeight()) / 2.0f, ((r2Var.getMeasuredWidth() * r2Var.T) - r2Var.getMeasuredWidth()) / 2.0f);
                if (!n60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, r2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, r2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                dj1Var.f35293h1 = contains;
                if (!contains) {
                    dj1.i(dj1Var);
                }
            }
            if (dj1Var.f35293h1 && !dj1Var.f35276a1 && motionEvent.getPointerCount() == 2) {
                dj1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                dj1Var.f35279b1 = x13;
                dj1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                dj1Var.f35282c1 = y12;
                dj1Var.W0 = y12;
                dj1Var.f35289f1 = 1.0f;
                dj1Var.f35284d1 = motionEvent.getPointerId(0);
                dj1Var.f35286e1 = motionEvent.getPointerId(1);
                dj1Var.f35276a1 = true;
            }
        }
        dj1Var.f35309s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f42176c = false;
                }
            } else if (this.f42176c) {
                float x14 = motionEvent.getX() - this.f42174a;
                float y13 = motionEvent.getY() - this.f42175b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = dj1Var.f35311t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - dj1Var.K0 > 300) {
                    dj1Var.K0 = System.currentTimeMillis();
                    if (dj1Var.C0) {
                        dj1Var.l(false);
                    } else if (dj1Var.f35320z0) {
                        dj1Var.z(!dj1Var.f35317x0);
                        dj1Var.f35306q0 = dj1Var.f35305p0;
                        if (!dj1Var.f35317x0 && (c3Var = dj1Var.N0) != null && c3Var.V) {
                            c3Var.e(true);
                        }
                        dj1Var.G();
                    }
                }
                this.f42176c = false;
            }
        } else {
            this.f42174a = motionEvent.getX();
            this.f42175b = motionEvent.getY();
            this.f42176c = true;
            this.d = System.currentTimeMillis();
        }
        if (!dj1Var.f35293h1 && !this.f42176c) {
            return false;
        }
        return true;
    }
}
