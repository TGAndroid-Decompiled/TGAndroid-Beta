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
public abstract class yy0 extends FrameLayout {
    public static long R;
    public static final int S = 0;
    public float E;
    public ew F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public VelocityTracker M;
    public boolean N;
    public float O;
    public float P;
    public Paint Q;
    public ew f54330a;
    public View f54331b;
    public k0 f54332c;
    public org.telegram.ui.ActionBar.k d;
    public float f54333e;
    public boolean f54334f;
    public ValueAnimator h;
    public h2.f f54335n;
    public boolean f54336r;
    public int f54337s;
    public boolean f54338w;
    public org.telegram.ui.ActionBar.r4 f54339x;
    public r1.g f54340y;

    public static void f(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.g2 g2Var2, float f10) {
        int measuredWidth;
        if (g2Var != null || g2Var2 != null) {
            if (g2Var != null) {
                measuredWidth = g2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = g2Var2.getFragmentView().getMeasuredWidth();
            }
            if (g2Var != null) {
                if (g2Var.getFragmentView() != null) {
                    g2Var.getFragmentView().setAlpha(1.0f - f10);
                    g2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                g2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (g2Var2 != null) {
                if (g2Var2.getFragmentView() != null) {
                    g2Var2.getFragmentView().setAlpha(1.0f);
                    g2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                g2Var2.setPreviewReplaceProgress(f10);
            }
        }
    }

    public static int getRightPaddingSize() {
        if (org.telegram.messenger.bz.f23215p1) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f54334f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f54334f = false;
        if (!org.telegram.messenger.bz.c()) {
            this.f54333e = 0.0f;
            g();
            ew ewVar = this.f54330a;
            if (ewVar != null) {
                ewVar.onPause();
                this.f54330a.onFragmentDestroy();
                removeAllViews();
                this.f54330a = null;
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25230u4, new Object[0]);
            }
            d(false);
            return;
        }
        this.f54335n.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f54333e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new vy0(this, 0));
        this.h.addListener(new xy0(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.nr.f37956f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f54330a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f54338w) {
            f(this.F, this.f54330a, this.E);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f54333e;
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
            f11 = kVar2.f29149p0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f54330a != null && this.d != null && max > 0.0f) {
            if (this.Q == null) {
                this.Q = new Paint();
            }
            this.Q.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29734w8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.P, this.Q);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                if (max != this.d.getActionMode().getAlpha() * this.f54333e) {
                    this.d.draw(canvas);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
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

    public abstract void e(boolean z10);

    public final void g() {
        if (!this.f54338w && c()) {
            setOpenProgress(this.f54333e);
            View view = this.f54331b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f54333e) * (getMeasuredWidth() - org.telegram.messenger.g0.L(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f54333e) * org.telegram.messenger.g0.L(48.0f));
            }
            ew ewVar = this.f54330a;
            if (ewVar != null) {
                ewVar.setPreviewOpenedProgress(this.f54333e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return R;
    }

    public org.telegram.ui.ActionBar.g2 getFragment() {
        return this.f54330a;
    }

    public View getFragmentView() {
        return this.f54331b;
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
            i11 = org.telegram.messenger.g0.f24140m;
        } else {
            i11 = 0;
        }
        View view = this.f54331b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + this.f54337s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i11;
        }
        super.onMeasure(i7, i10);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.G != measuredWidth) {
            this.G = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var = this.f54339x;
        if ((r4Var != null && ((ActionBarLayout) r4Var).y()) || !c() || !this.N) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.H = motionEvent.getPointerId(0);
            this.I = true;
            this.K = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.H) {
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.K));
            int abs = Math.abs(((int) motionEvent.getY()) - this.L);
            this.M.addMovement(motionEvent);
            if (this.I && !this.J && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.I = false;
                    this.J = true;
                    this.K = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.I = false;
                }
            } else if (this.J) {
                float f10 = max;
                this.O = f10;
                this.f54333e = Utilities.i(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.H && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            this.M.computeCurrentVelocity(1000);
            if (this.J) {
                float f11 = this.O;
                float xVelocity = this.M.getXVelocity();
                float yVelocity = this.M.getYVelocity();
                if (f11 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f54333e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new vy0(this, 2));
                    this.h.addListener(new xy0(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.nr.f37956f);
                    this.h.start();
                } else {
                    b();
                }
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker2 = this.M;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.M = null;
            }
        } else if (motionEvent == null) {
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker3 = this.M;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.M = null;
            }
        }
        return this.J;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.f54331b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f54331b) {
            a();
        }
    }

    public void setCurrentTop(int i7) {
        this.P = i7;
        View view = this.f54331b;
        if (view != null) {
            view.setTranslationY((i7 - view.getTop()) + this.f54337s);
        }
        k0 k0Var = this.f54332c;
        if (k0Var != null) {
            k0Var.setTranslationY(i7 - k0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i7) {
        this.f54337s = i7;
    }

    public void setTransitionPaddingBottom(int i7) {
        ew ewVar = this.f54330a;
        if (com.google.android.gms.internal.vision.e2.s(ewVar)) {
            float f10 = i7;
            ewVar.Y0 = f10;
            ewVar.h.setTranslationY(((-f10) - ewVar.f54115h1) - ewVar.f54113g1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
