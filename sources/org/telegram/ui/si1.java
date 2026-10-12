package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class si1 extends FrameLayout {
    public float f41932a;
    public float f41933b;
    public boolean f41934c;
    public long d;
    public final xi1 f41935e;

    public si1(xi1 xi1Var, Activity activity) {
        super(activity);
        this.f41935e = xi1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        xi1 xi1Var = this.f41935e;
        org.telegram.ui.Components.voip.d3 d3Var = xi1Var.v;
        if (view == d3Var && (xi1Var.f44008n0 || xi1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != xi1Var.f43985c0 && (view != xi1Var.Y || !xi1Var.f43979a0)) || (!xi1Var.f43996g1 && xi1Var.f44000i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = xi1Var.f43994f1;
        canvas.scale(f7, f7, xi1Var.f43983b1, xi1Var.f43986c1);
        canvas.translate(xi1Var.Y0, xi1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xi1 xi1Var = this.f41935e;
        hi1 hi1Var = xi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            xi1Var.f44023y.b(false, false);
            xi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(hi1Var);
            if (xi1Var.f44010p0 == 3) {
                AndroidUtilities.runOnUIThread(hi1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        xi1 xi1Var = this.f41935e;
        hi1 hi1Var = xi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            xi1Var.f44023y.b(false, false);
            xi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(hi1Var);
            if (xi1Var.f44010p0 == 3) {
                AndroidUtilities.runOnUIThread(hi1Var, 10000L);
            }
        }
        if (!xi1Var.f43998h1 && !xi1Var.f43980a1 && !xi1Var.f43996g1 && motionEvent.getActionMasked() != 0) {
            xi1.i(xi1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            xi1Var.f43998h1 = false;
            xi1Var.f43980a1 = false;
            xi1Var.f43996g1 = false;
        }
        if (xi1Var.m0) {
            t2Var = xi1Var.f43985c0;
        } else {
            t2Var = xi1Var.f43987d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && xi1Var.f43980a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (xi1Var.f43988d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (xi1Var.f43991e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / xi1Var.X0;
                    xi1Var.f43994f1 = hypot;
                    if (hypot > 1.005f && !xi1Var.f43996g1) {
                        xi1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        xi1Var.f43983b1 = x10;
                        xi1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        xi1Var.f43986c1 = y3;
                        xi1Var.W0 = y3;
                        xi1Var.f43994f1 = 1.0f;
                        xi1Var.Y0 = 0.0f;
                        xi1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        xi1Var.f43996g1 = true;
                        xi1Var.f43980a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = xi1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = xi1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = xi1Var.f43994f1;
                    xi1Var.Y0 = (-x12) / f7;
                    xi1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    xi1.i(xi1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((xi1Var.f43988d1 == motionEvent.getPointerId(0) && xi1Var.f43991e1 == motionEvent.getPointerId(1)) || (xi1Var.f43988d1 == motionEvent.getPointerId(1) && xi1Var.f43991e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                xi1.i(xi1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!i60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                xi1Var.f43998h1 = contains;
                if (!contains) {
                    xi1.i(xi1Var);
                }
            }
            if (xi1Var.f43998h1 && !xi1Var.f43980a1 && motionEvent.getPointerCount() == 2) {
                xi1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                xi1Var.f43983b1 = x13;
                xi1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                xi1Var.f43986c1 = y12;
                xi1Var.W0 = y12;
                xi1Var.f43994f1 = 1.0f;
                xi1Var.f43988d1 = motionEvent.getPointerId(0);
                xi1Var.f43991e1 = motionEvent.getPointerId(1);
                xi1Var.f43980a1 = true;
            }
        }
        xi1Var.f44014s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f41934c = false;
                }
            } else if (this.f41934c) {
                float x14 = motionEvent.getX() - this.f41932a;
                float y13 = motionEvent.getY() - this.f41933b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = xi1Var.f44016t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - xi1Var.K0 > 300) {
                    xi1Var.K0 = System.currentTimeMillis();
                    if (xi1Var.C0) {
                        xi1Var.l(false);
                    } else if (xi1Var.f44025z0) {
                        xi1Var.z(!xi1Var.f44022x0);
                        xi1Var.f44011q0 = xi1Var.f44010p0;
                        if (!xi1Var.f44022x0 && (e3Var = xi1Var.N0) != null && e3Var.V) {
                            e3Var.e(true);
                        }
                        xi1Var.G();
                    }
                }
                this.f41934c = false;
            }
        } else {
            this.f41932a = motionEvent.getX();
            this.f41933b = motionEvent.getY();
            this.f41934c = true;
            this.d = System.currentTimeMillis();
        }
        if (!xi1Var.f43998h1 && !this.f41934c) {
            return false;
        }
        return true;
    }
}
