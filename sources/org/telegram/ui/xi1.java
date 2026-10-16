package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xi1 extends FrameLayout {
    public float f41579a;
    public float f41580b;
    public boolean f41581c;
    public long d;
    public final cj1 e;

    public xi1(cj1 cj1Var, Activity activity) {
        super(activity);
        this.e = cj1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        cj1 cj1Var = this.e;
        org.telegram.ui.Components.voip.b3 b3Var = cj1Var.v;
        if (view == b3Var && (cj1Var.f34705n0 || cj1Var.m0)) {
            return false;
        }
        if ((view != b3Var && view != cj1Var.f34683c0 && (view != cj1Var.Y || !cj1Var.f34677a0)) || (!cj1Var.f34693g1 && cj1Var.f34697i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = cj1Var.f34691f1;
        canvas.scale(f7, f7, cj1Var.f34681b1, cj1Var.f34684c1);
        canvas.translate(cj1Var.Y0, cj1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        cj1 cj1Var = this.e;
        mi1 mi1Var = cj1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            cj1Var.f34720y.b(false, false);
            cj1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(mi1Var);
            if (cj1Var.f34707p0 == 3) {
                AndroidUtilities.runOnUIThread(mi1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.q2 q2Var;
        org.telegram.ui.Components.voip.c3 c3Var;
        cj1 cj1Var = this.e;
        mi1 mi1Var = cj1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            cj1Var.f34720y.b(false, false);
            cj1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(mi1Var);
            if (cj1Var.f34707p0 == 3) {
                AndroidUtilities.runOnUIThread(mi1Var, 10000L);
            }
        }
        if (!cj1Var.f34695h1 && !cj1Var.f34678a1 && !cj1Var.f34693g1 && motionEvent.getActionMasked() != 0) {
            cj1.i(cj1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            cj1Var.f34695h1 = false;
            cj1Var.f34678a1 = false;
            cj1Var.f34693g1 = false;
        }
        if (cj1Var.m0) {
            q2Var = cj1Var.f34683c0;
        } else {
            q2Var = cj1Var.f34685d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && cj1Var.f34678a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (cj1Var.f34686d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (cj1Var.f34688e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / cj1Var.X0;
                    cj1Var.f34691f1 = hypot;
                    if (hypot > 1.005f && !cj1Var.f34693g1) {
                        cj1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        cj1Var.f34681b1 = x10;
                        cj1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        cj1Var.f34684c1 = y3;
                        cj1Var.W0 = y3;
                        cj1Var.f34691f1 = 1.0f;
                        cj1Var.Y0 = 0.0f;
                        cj1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        cj1Var.f34693g1 = true;
                        cj1Var.f34678a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = cj1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = cj1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = cj1Var.f34691f1;
                    cj1Var.Y0 = (-x12) / f7;
                    cj1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    cj1.i(cj1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((cj1Var.f34686d1 == motionEvent.getPointerId(0) && cj1Var.f34688e1 == motionEvent.getPointerId(1)) || (cj1Var.f34686d1 == motionEvent.getPointerId(1) && cj1Var.f34688e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                cj1.i(cj1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (!n60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                cj1Var.f34695h1 = contains;
                if (!contains) {
                    cj1.i(cj1Var);
                }
            }
            if (cj1Var.f34695h1 && !cj1Var.f34678a1 && motionEvent.getPointerCount() == 2) {
                cj1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                cj1Var.f34681b1 = x13;
                cj1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                cj1Var.f34684c1 = y12;
                cj1Var.W0 = y12;
                cj1Var.f34691f1 = 1.0f;
                cj1Var.f34686d1 = motionEvent.getPointerId(0);
                cj1Var.f34688e1 = motionEvent.getPointerId(1);
                cj1Var.f34678a1 = true;
            }
        }
        cj1Var.f34711s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f41581c = false;
                }
            } else if (this.f41581c) {
                float x14 = motionEvent.getX() - this.f41579a;
                float y13 = motionEvent.getY() - this.f41580b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = cj1Var.f34713t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - cj1Var.K0 > 300) {
                    cj1Var.K0 = System.currentTimeMillis();
                    if (cj1Var.C0) {
                        cj1Var.l(false);
                    } else if (cj1Var.f34722z0) {
                        cj1Var.z(!cj1Var.f34719x0);
                        cj1Var.f34708q0 = cj1Var.f34707p0;
                        if (!cj1Var.f34719x0 && (c3Var = cj1Var.N0) != null && c3Var.V) {
                            c3Var.e(true);
                        }
                        cj1Var.G();
                    }
                }
                this.f41581c = false;
            }
        } else {
            this.f41579a = motionEvent.getX();
            this.f41580b = motionEvent.getY();
            this.f41581c = true;
            this.d = System.currentTimeMillis();
        }
        if (!cj1Var.f34695h1 && !this.f41581c) {
            return false;
        }
        return true;
    }
}
