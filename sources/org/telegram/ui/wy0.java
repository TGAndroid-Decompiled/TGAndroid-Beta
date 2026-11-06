package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class wy0 extends FrameLayout {
    public static long Q;
    public static final int R = 0;
    public float D;
    public zv E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public VelocityTracker L;
    public boolean M;
    public float N;
    public float O;
    public Paint P;
    public zv f51662a;
    public View f51663b;
    public k0 f51664c;
    public org.telegram.ui.ActionBar.k d;
    public float f51665e;
    public boolean f51666f;
    public ValueAnimator h;
    public h2.f f51667n;
    public boolean f51668r;
    public int f51669s;
    public boolean f51670w;
    public org.telegram.ui.ActionBar.q4 f51671x;
    public r1.g f51672y;

    public static void f(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f2 f2Var2, float f10) {
        int measuredWidth;
        if (f2Var != null || f2Var2 != null) {
            if (f2Var != null) {
                measuredWidth = f2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = f2Var2.getFragmentView().getMeasuredWidth();
            }
            if (f2Var != null) {
                if (f2Var.getFragmentView() != null) {
                    f2Var.getFragmentView().setAlpha(1.0f - f10);
                    f2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                f2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (f2Var2 != null) {
                if (f2Var2.getFragmentView() != null) {
                    f2Var2.getFragmentView().setAlpha(1.0f);
                    f2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                f2Var2.setPreviewReplaceProgress(f10);
            }
        }
    }

    public static int getRightPaddingSize() {
        if (org.telegram.messenger.iz.f23399p1) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f51666f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f51666f = false;
        if (!org.telegram.messenger.iz.c()) {
            this.f51665e = 0.0f;
            g();
            zv zvVar = this.f51662a;
            if (zvVar != null) {
                zvVar.onPause();
                this.f51662a.onFragmentDestroy();
                removeAllViews();
                this.f51662a = null;
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25051r4, new Object[0]);
            }
            d(false);
            return;
        }
        this.f51667n.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51665e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ty0(this, 0));
        this.h.addListener(new vy0(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.xq.f40310f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f51662a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z9);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f51670w) {
            f(this.E, this.f51662a, this.D);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f51665e;
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null && kVar.getActionMode() != null) {
            f10 = this.d.getActionMode().getAlpha();
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.ActionBar.k kVar2 = this.d;
        if (kVar2 == null) {
            f11 = 0.0f;
        } else {
            f11 = kVar2.f27677o0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f51662a != null && this.d != null && max > 0.0f) {
            if (this.P == null) {
                this.P = new Paint();
            }
            this.P.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28204w8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.O, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.O, this.P);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                if (max != this.d.getActionMode().getAlpha() * this.f51665e) {
                    this.d.draw(canvas);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.O, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
                    this.d.getActionMode().draw(canvas);
                    canvas.restore();
                } else {
                    this.d.getActionMode().draw(canvas);
                }
            } else {
                this.d.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (view == kVar && kVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public abstract void e(boolean z9);

    public final void g() {
        if (!this.f51670w && c()) {
            setOpenProgress(this.f51665e);
            View view = this.f51663b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f51665e) * (getMeasuredWidth() - org.telegram.messenger.g0.L(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f51665e) * org.telegram.messenger.g0.L(48.0f));
            }
            zv zvVar = this.f51662a;
            if (zvVar != null) {
                zvVar.setPreviewOpenedProgress(this.f51665e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return Q;
    }

    public org.telegram.ui.ActionBar.f2 getFragment() {
        return this.f51662a;
    }

    public View getFragmentView() {
        return this.f51663b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (getOccupyStatusbar()) {
            i11 = org.telegram.messenger.g0.f22531m;
        } else {
            i11 = 0;
        }
        View view = this.f51663b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + this.f51669s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i11;
        }
        super.onMeasure(i7, i10);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.F != measuredWidth) {
            this.F = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var = this.f51671x;
        if ((q4Var != null && ((ActionBarLayout) q4Var).y()) || !c() || !this.M) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.G = motionEvent.getPointerId(0);
            this.H = true;
            this.J = (int) motionEvent.getX();
            this.K = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.G) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.J));
            int abs = Math.abs(((int) motionEvent.getY()) - this.K);
            this.L.addMovement(motionEvent);
            if (this.H && !this.I && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.H = false;
                    this.I = true;
                    this.J = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.H = false;
                }
            } else if (this.I) {
                float f10 = max;
                this.N = f10;
                this.f51665e = Utilities.i(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.G && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.computeCurrentVelocity(1000);
            if (this.I) {
                float f11 = this.N;
                float xVelocity = this.L.getXVelocity();
                float yVelocity = this.L.getYVelocity();
                if (f11 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51665e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new ty0(this, 2));
                    this.h.addListener(new vy0(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.xq.f40310f);
                    this.h.start();
                } else {
                    b();
                }
            }
            this.H = false;
            this.I = false;
            VelocityTracker velocityTracker2 = this.L;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.L = null;
            }
        } else if (motionEvent == null) {
            this.H = false;
            this.I = false;
            VelocityTracker velocityTracker3 = this.L;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.L = null;
            }
        }
        return this.I;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.f51663b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f51663b) {
            a();
        }
    }

    public void setCurrentTop(int i7) {
        this.O = i7;
        View view = this.f51663b;
        if (view != null) {
            view.setTranslationY((i7 - view.getTop()) + this.f51669s);
        }
        k0 k0Var = this.f51664c;
        if (k0Var != null) {
            k0Var.setTranslationY(i7 - k0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i7) {
        this.f51669s = i7;
    }

    public void setTransitionPaddingBottom(int i7) {
        zv zvVar = this.f51662a;
        if (com.google.android.recaptcha.internal.a.u(zvVar)) {
            float f10 = i7;
            zvVar.X0 = f10;
            zvVar.h.setTranslationY(((-f10) - zvVar.f50635f1) - zvVar.f50632e1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
