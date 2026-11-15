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
public abstract class uy0 extends FrameLayout {
    public static long R;
    public static final int S = 0;
    public float E;
    public bw F;
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
    public bw f52055a;
    public View f52056b;
    public k0 f52057c;
    public org.telegram.ui.ActionBar.k d;
    public float f52058e;
    public boolean f52059f;
    public ValueAnimator h;
    public h2.f f52060n;
    public boolean f52061r;
    public int f52062s;
    public boolean f52063w;
    public org.telegram.ui.ActionBar.o4 f52064x;
    public r1.g f52065y;

    public static void f(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e2 e2Var2, float f10) {
        int measuredWidth;
        if (e2Var != null || e2Var2 != null) {
            if (e2Var != null) {
                measuredWidth = e2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = e2Var2.getFragmentView().getMeasuredWidth();
            }
            if (e2Var != null) {
                if (e2Var.getFragmentView() != null) {
                    e2Var.getFragmentView().setAlpha(1.0f - f10);
                    e2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                e2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (e2Var2 != null) {
                if (e2Var2.getFragmentView() != null) {
                    e2Var2.getFragmentView().setAlpha(1.0f);
                    e2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                e2Var2.setPreviewReplaceProgress(f10);
            }
        }
    }

    public static int getRightPaddingSize() {
        if (org.telegram.messenger.gz.f23974p1) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f52059f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f52059f = false;
        if (!org.telegram.messenger.gz.c()) {
            this.f52058e = 0.0f;
            g();
            bw bwVar = this.f52055a;
            if (bwVar != null) {
                bwVar.onPause();
                this.f52055a.onFragmentDestroy();
                removeAllViews();
                this.f52055a = null;
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25565r4, new Object[0]);
            }
            d(false);
            return;
        }
        this.f52060n.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52058e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ry0(this, 0));
        this.h.addListener(new ty0(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.er.f34419f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f52055a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f52063w) {
            f(this.F, this.f52055a, this.E);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f52058e;
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
            f11 = kVar2.f29306p0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f52055a != null && this.d != null && max > 0.0f) {
            if (this.Q == null) {
                this.Q = new Paint();
            }
            this.Q.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29205w8, false));
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
                if (max != this.d.getActionMode().getAlpha() * this.f52058e) {
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
        if (!this.f52063w && c()) {
            setOpenProgress(this.f52058e);
            View view = this.f52056b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f52058e) * (getMeasuredWidth() - org.telegram.messenger.g0.L(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f52058e) * org.telegram.messenger.g0.L(48.0f));
            }
            bw bwVar = this.f52055a;
            if (bwVar != null) {
                bwVar.setPreviewOpenedProgress(this.f52058e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return R;
    }

    public org.telegram.ui.ActionBar.e2 getFragment() {
        return this.f52055a;
    }

    public View getFragmentView() {
        return this.f52056b;
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
            i11 = org.telegram.messenger.g0.f23605m;
        } else {
            i11 = 0;
        }
        View view = this.f52056b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + this.f52062s;
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
        org.telegram.ui.ActionBar.o4 o4Var = this.f52064x;
        if ((o4Var != null && ((ActionBarLayout) o4Var).y()) || !c() || !this.N) {
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
                this.f52058e = Utilities.i(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
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
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52058e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new ry0(this, 2));
                    this.h.addListener(new ty0(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.er.f34419f);
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
        if (view == this.f52056b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f52056b) {
            a();
        }
    }

    public void setCurrentTop(int i7) {
        this.P = i7;
        View view = this.f52056b;
        if (view != null) {
            view.setTranslationY((i7 - view.getTop()) + this.f52062s);
        }
        k0 k0Var = this.f52057c;
        if (k0Var != null) {
            k0Var.setTranslationY(i7 - k0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i7) {
        this.f52062s = i7;
    }

    public void setTransitionPaddingBottom(int i7) {
        bw bwVar = this.f52055a;
        if (com.google.android.gms.internal.vision.e2.s(bwVar)) {
            float f10 = i7;
            bwVar.Y0 = f10;
            bwVar.h.setTranslationY(((-f10) - bwVar.f51853g1) - bwVar.f51851f1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
