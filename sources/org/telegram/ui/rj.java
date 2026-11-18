package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rj extends ChatActivityEnterView {
    public int f51620o7;
    public int f51621p7;
    public int f51622q7;
    public final bn f51623r7;

    public rj(bn bnVar, Activity activity, org.telegram.ui.Components.au0 au0Var, bn bnVar2, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, au0Var, bnVar2, z10, i6Var);
        this.f51623r7 = bnVar;
    }

    public final void F2() {
        org.telegram.ui.ActionBar.k kVar;
        Interpolator interpolator;
        Interpolator interpolator2;
        bn bnVar = this.f51623r7;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (!kVar.y() && !bnVar.Y9()) {
            int backgroundTop = getBackgroundTop();
            int i7 = bnVar.f45975d0;
            if (i7 != 0 && backgroundTop != i7 && this.f51620o7 == bnVar.f46093m1.getMeasuredHeight()) {
                int i10 = (this.H2 + bnVar.f45975d0) - backgroundTop;
                setAnimatedTop(i10);
                this.f32636m2.invalidate();
                ValueAnimator valueAnimator = bnVar.M9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    bnVar.M9.cancel();
                }
                View view = this.f32692u2;
                if (view != null && view.getVisibility() == 0) {
                    this.f32692u2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.f32692u2.getLayoutParams().height) + this.H2);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                bnVar.M9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f51276b;

                    {
                        this.f51276b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                rj rjVar = this.f51276b;
                                bn bnVar2 = rjVar.f51623r7;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                rjVar.setAnimatedTop((int) floatValue);
                                View view2 = rjVar.f32692u2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    rjVar.f32692u2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32692u2.getLayoutParams().height) + floatValue);
                                } else {
                                    bnVar2.M9();
                                    bnVar2.O9();
                                }
                                rjVar.f32636m2.invalidate();
                                rjVar.invalidate();
                                return;
                            default:
                                this.f51276b.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                bnVar.M9.addListener(new org.telegram.ui.Cells.x9(this, 6));
                bnVar.M9.setDuration(A0());
                ValueAnimator valueAnimator2 = bnVar.M9;
                Interpolator interpolator3 = pi.k.V;
                if (this.E1 > 0 && SystemClock.uptimeMillis() < this.E1 && (interpolator2 = this.F1) != null) {
                    interpolator3 = interpolator2;
                }
                valueAnimator2.setInterpolator(interpolator3);
                bnVar.M9.setStartDelay(getLineAnimationDelay());
                if (!bnVar.L9) {
                    bnVar.M9.start();
                }
                bnVar.M9();
                bnVar.O9();
                bnVar.f45975d0 = 0;
            } else if (this.f51620o7 != bnVar.f46093m1.getMeasuredHeight()) {
                bnVar.f45975d0 = 0;
            }
            if (this.f32553b4) {
                float scrollY = (this.f51622q7 - this.F0.getScrollY()) + (this.f51621p7 - this.F0.getMeasuredHeight());
                org.telegram.ui.Components.gf gfVar = this.F0;
                gfVar.setOffsetY(gfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f51276b;

                    {
                        this.f51276b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (r2) {
                            case 0:
                                rj rjVar = this.f51276b;
                                bn bnVar2 = rjVar.f51623r7;
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                rjVar.setAnimatedTop((int) floatValue);
                                View view2 = rjVar.f32692u2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    rjVar.f32692u2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32692u2.getLayoutParams().height) + floatValue);
                                } else {
                                    bnVar2.M9();
                                    bnVar2.O9();
                                }
                                rjVar.f32636m2.invalidate();
                                rjVar.invalidate();
                                return;
                            default:
                                this.f51276b.F0.setOffsetY(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator3 = bnVar.N9;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                bnVar.N9 = ofFloat2;
                ofFloat2.setDuration(A0());
                Interpolator interpolator4 = pi.k.V;
                if (this.E1 > 0 && SystemClock.uptimeMillis() < this.E1 && (interpolator = this.F1) != null) {
                    interpolator4 = interpolator;
                }
                ofFloat2.setInterpolator(interpolator4);
                ofFloat2.setStartDelay(getLineAnimationDelay());
                ofFloat2.start();
                this.f32553b4 = false;
            }
            this.f51620o7 = bnVar.f46093m1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator4 = bnVar.N9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = bnVar.M9;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        bnVar.f45975d0 = 0;
        this.f32553b4 = false;
    }

    @Override
    public final void K0(boolean z10) {
        super.K0(z10);
        bn bnVar = this.f51623r7;
        af afVar = bnVar.Rb;
        if (afVar != null) {
            org.telegram.messenger.g0.g3(afVar);
            bnVar.Rb = null;
        }
    }

    @Override
    public final void X0(float f10) {
        this.f51623r7.F7();
    }

    @Override
    public final void Z0(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bn bnVar = this.f51623r7;
        if (bnVar.f45932a0 != null) {
            if (bnVar.A0 != null) {
                if (bnVar.f45958bb <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                        if (kVar2.y()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f32553b4 = true;
            this.f51621p7 = this.F0.getMeasuredHeight();
            this.f51622q7 = this.F0.getScrollY();
            bnVar.f46093m1.invalidate();
            bnVar.f45975d0 = bnVar.f45932a0.getBackgroundTop();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e1() {
        if (this.f51623r7.f45972cb != null) {
            return;
        }
        super.e1();
    }

    @Override
    public final boolean k1() {
        if (!this.f51623r7.f46008f6) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        super.setVisibility(i7);
        bn bnVar = this.f51623r7;
        m6.n nVar = bnVar.f46066jd;
        boolean z11 = false;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !bnVar.Zc) {
            z11 = true;
        }
        nVar.h(1, z10, z11);
    }
}
