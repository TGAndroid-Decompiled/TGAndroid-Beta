package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ui1 extends FrameLayout {
    public float f37284a;
    public float f37285b;
    public boolean f37286c;
    public long d;
    public final zi1 e;

    public ui1(zi1 zi1Var, Activity activity) {
        super(activity);
        this.e = zi1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zi1 zi1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = zi1Var.v;
        if (view == c3Var && (zi1Var.f39385n0 || zi1Var.m0)) {
            return false;
        }
        if ((view != c3Var && view != zi1Var.f39363c0 && (view != zi1Var.Y || !zi1Var.f39357a0)) || (!zi1Var.f39373g1 && zi1Var.f39377i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = zi1Var.f39371f1;
        canvas.scale(f7, f7, zi1Var.f39361b1, zi1Var.f39364c1);
        canvas.translate(zi1Var.Y0, zi1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        zi1 zi1Var = this.e;
        ji1 ji1Var = zi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            zi1Var.f39400y.b(false, false);
            zi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ji1Var);
            if (zi1Var.f39387p0 == 3) {
                AndroidUtilities.runOnUIThread(ji1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.r2 r2Var;
        org.telegram.ui.Components.voip.d3 d3Var;
        zi1 zi1Var = this.e;
        ji1 ji1Var = zi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            zi1Var.f39400y.b(false, false);
            zi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ji1Var);
            if (zi1Var.f39387p0 == 3) {
                AndroidUtilities.runOnUIThread(ji1Var, 10000L);
            }
        }
        if (!zi1Var.f39375h1 && !zi1Var.f39358a1 && !zi1Var.f39373g1 && motionEvent.getActionMasked() != 0) {
            zi1.j(zi1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            zi1Var.f39375h1 = false;
            zi1Var.f39358a1 = false;
            zi1Var.f39373g1 = false;
        }
        if (zi1Var.m0) {
            r2Var = zi1Var.f39363c0;
        } else {
            r2Var = zi1Var.f39365d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && zi1Var.f39358a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (zi1Var.f39366d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (zi1Var.f39368e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / zi1Var.X0;
                    zi1Var.f39371f1 = hypot;
                    if (hypot > 1.005f && !zi1Var.f39373g1) {
                        zi1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        zi1Var.f39361b1 = x10;
                        zi1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        zi1Var.f39364c1 = y3;
                        zi1Var.W0 = y3;
                        zi1Var.f39371f1 = 1.0f;
                        zi1Var.Y0 = 0.0f;
                        zi1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        zi1Var.f39373g1 = true;
                        zi1Var.f39358a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = zi1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = zi1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = zi1Var.f39371f1;
                    zi1Var.Y0 = (-x12) / f7;
                    zi1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    zi1.j(zi1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((zi1Var.f39366d1 == motionEvent.getPointerId(0) && zi1Var.f39368e1 == motionEvent.getPointerId(1)) || (zi1Var.f39366d1 == motionEvent.getPointerId(1) && zi1Var.f39368e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                zi1.j(zi1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(r2Var.getX(), r2Var.getY(), r2Var.getX() + r2Var.getMeasuredWidth(), r2Var.getY() + r2Var.getMeasuredHeight());
                rectF.inset(((r2Var.getMeasuredHeight() * r2Var.T) - r2Var.getMeasuredHeight()) / 2.0f, ((r2Var.getMeasuredWidth() * r2Var.T) - r2Var.getMeasuredWidth()) / 2.0f);
                if (!j60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, r2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, r2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                zi1Var.f39375h1 = contains;
                if (!contains) {
                    zi1.j(zi1Var);
                }
            }
            if (zi1Var.f39375h1 && !zi1Var.f39358a1 && motionEvent.getPointerCount() == 2) {
                zi1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                zi1Var.f39361b1 = x13;
                zi1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                zi1Var.f39364c1 = y12;
                zi1Var.W0 = y12;
                zi1Var.f39371f1 = 1.0f;
                zi1Var.f39366d1 = motionEvent.getPointerId(0);
                zi1Var.f39368e1 = motionEvent.getPointerId(1);
                zi1Var.f39358a1 = true;
            }
        }
        zi1Var.f39391s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f37286c = false;
                }
            } else if (this.f37286c) {
                float x14 = motionEvent.getX() - this.f37284a;
                float y13 = motionEvent.getY() - this.f37285b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = zi1Var.f39393t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - zi1Var.K0 > 300) {
                    zi1Var.K0 = System.currentTimeMillis();
                    if (zi1Var.C0) {
                        zi1Var.m(false);
                    } else if (zi1Var.f39402z0) {
                        zi1Var.A(!zi1Var.f39399x0);
                        zi1Var.f39388q0 = zi1Var.f39387p0;
                        if (!zi1Var.f39399x0 && (d3Var = zi1Var.N0) != null && d3Var.V) {
                            d3Var.e(true);
                        }
                        zi1Var.H();
                    }
                }
                this.f37286c = false;
            }
        } else {
            this.f37284a = motionEvent.getX();
            this.f37285b = motionEvent.getY();
            this.f37286c = true;
            this.d = System.currentTimeMillis();
        }
        if (!zi1Var.f39375h1 && !this.f37286c) {
            return false;
        }
        return true;
    }
}
