package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ri1 extends FrameLayout {
    public float f41434a;
    public float f41435b;
    public boolean f41436c;
    public long d;
    public final wi1 f41437e;

    public ri1(wi1 wi1Var, Activity activity) {
        super(activity);
        this.f41437e = wi1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        wi1 wi1Var = this.f41437e;
        org.telegram.ui.Components.voip.c3 c3Var = wi1Var.v;
        if (view == c3Var && (wi1Var.f43654n0 || wi1Var.m0)) {
            return false;
        }
        if ((view != c3Var && view != wi1Var.f43631c0 && (view != wi1Var.Y || !wi1Var.f43625a0)) || (!wi1Var.f43642g1 && wi1Var.f43646i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = wi1Var.f43640f1;
        canvas.scale(f7, f7, wi1Var.f43629b1, wi1Var.f43632c1);
        canvas.translate(wi1Var.Y0, wi1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wi1 wi1Var = this.f41437e;
        fi1 fi1Var = wi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            wi1Var.f43669y.b(false, false);
            wi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(fi1Var);
            if (wi1Var.f43656p0 == 3) {
                AndroidUtilities.runOnUIThread(fi1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.s2 s2Var;
        org.telegram.ui.Components.voip.d3 d3Var;
        wi1 wi1Var = this.f41437e;
        fi1 fi1Var = wi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            wi1Var.f43669y.b(false, false);
            wi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(fi1Var);
            if (wi1Var.f43656p0 == 3) {
                AndroidUtilities.runOnUIThread(fi1Var, 10000L);
            }
        }
        if (!wi1Var.f43644h1 && !wi1Var.f43626a1 && !wi1Var.f43642g1 && motionEvent.getActionMasked() != 0) {
            wi1.i(wi1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            wi1Var.f43644h1 = false;
            wi1Var.f43626a1 = false;
            wi1Var.f43642g1 = false;
        }
        if (wi1Var.m0) {
            s2Var = wi1Var.f43631c0;
        } else {
            s2Var = wi1Var.f43633d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && wi1Var.f43626a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (wi1Var.f43634d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (wi1Var.f43637e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / wi1Var.X0;
                    wi1Var.f43640f1 = hypot;
                    if (hypot > 1.005f && !wi1Var.f43642g1) {
                        wi1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        wi1Var.f43629b1 = x10;
                        wi1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        wi1Var.f43632c1 = y3;
                        wi1Var.W0 = y3;
                        wi1Var.f43640f1 = 1.0f;
                        wi1Var.Y0 = 0.0f;
                        wi1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        wi1Var.f43642g1 = true;
                        wi1Var.f43626a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = wi1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = wi1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = wi1Var.f43640f1;
                    wi1Var.Y0 = (-x12) / f7;
                    wi1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    wi1.i(wi1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((wi1Var.f43634d1 == motionEvent.getPointerId(0) && wi1Var.f43637e1 == motionEvent.getPointerId(1)) || (wi1Var.f43634d1 == motionEvent.getPointerId(1) && wi1Var.f43637e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                wi1.i(wi1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.T) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.T) - s2Var.getMeasuredWidth()) / 2.0f);
                if (!g60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                wi1Var.f43644h1 = contains;
                if (!contains) {
                    wi1.i(wi1Var);
                }
            }
            if (wi1Var.f43644h1 && !wi1Var.f43626a1 && motionEvent.getPointerCount() == 2) {
                wi1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                wi1Var.f43629b1 = x13;
                wi1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                wi1Var.f43632c1 = y12;
                wi1Var.W0 = y12;
                wi1Var.f43640f1 = 1.0f;
                wi1Var.f43634d1 = motionEvent.getPointerId(0);
                wi1Var.f43637e1 = motionEvent.getPointerId(1);
                wi1Var.f43626a1 = true;
            }
        }
        wi1Var.f43660s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f41436c = false;
                }
            } else if (this.f41436c) {
                float x14 = motionEvent.getX() - this.f41434a;
                float y13 = motionEvent.getY() - this.f41435b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = wi1Var.f43662t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - wi1Var.K0 > 300) {
                    wi1Var.K0 = System.currentTimeMillis();
                    if (wi1Var.C0) {
                        wi1Var.l(false);
                    } else if (wi1Var.f43671z0) {
                        wi1Var.z(!wi1Var.f43668x0);
                        wi1Var.f43657q0 = wi1Var.f43656p0;
                        if (!wi1Var.f43668x0 && (d3Var = wi1Var.N0) != null && d3Var.V) {
                            d3Var.e(true);
                        }
                        wi1Var.G();
                    }
                }
                this.f41436c = false;
            }
        } else {
            this.f41434a = motionEvent.getX();
            this.f41435b = motionEvent.getY();
            this.f41436c = true;
            this.d = System.currentTimeMillis();
        }
        if (!wi1Var.f43644h1 && !this.f41436c) {
            return false;
        }
        return true;
    }
}
