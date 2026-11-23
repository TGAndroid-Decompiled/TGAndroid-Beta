package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rj extends ChatActivityEnterView {
    public int f51620t7;
    public int f51621u7;
    public int f51622v7;
    public final bn f51623w7;

    public rj(bn bnVar, Activity activity, org.telegram.ui.Components.du0 du0Var, bn bnVar2, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, du0Var, bnVar2, z10, h6Var);
        this.f51623w7 = bnVar;
    }

    public final void I2() {
        org.telegram.ui.ActionBar.k kVar;
        Interpolator interpolator;
        Interpolator interpolator2;
        bn bnVar = this.f51623w7;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.x() && !bnVar.Y9()) {
            int backgroundTop = getBackgroundTop();
            int i7 = bnVar.f45946d0;
            if (i7 != 0 && backgroundTop != i7 && this.f51620t7 == bnVar.f46064m1.getMeasuredHeight()) {
                int i10 = (this.J2 + bnVar.f45946d0) - backgroundTop;
                setAnimatedTop(i10);
                this.f32649o2.invalidate();
                ValueAnimator valueAnimator = bnVar.M9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    bnVar.M9.cancel();
                }
                View view = this.f32709w2;
                if (view != null && view.getVisibility() == 0) {
                    this.f32709w2.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.f32709w2.getLayoutParams().height) + this.J2);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                bnVar.M9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f51227b;

                    {
                        this.f51227b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                rj rjVar = this.f51227b;
                                bn bnVar2 = rjVar.f51623w7;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                rjVar.setAnimatedTop((int) floatValue);
                                View view2 = rjVar.f32709w2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    rjVar.f32709w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32709w2.getLayoutParams().height) + floatValue);
                                } else {
                                    bnVar2.M9();
                                    bnVar2.O9();
                                }
                                rjVar.f32649o2.invalidate();
                                rjVar.invalidate();
                                return;
                            default:
                                this.f51227b.F0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                bnVar.M9.addListener(new org.telegram.ui.Cells.y9(this, 6));
                bnVar.M9.setDuration(E0());
                ValueAnimator valueAnimator2 = bnVar.M9;
                Interpolator interpolator3 = pi.k.V;
                if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (interpolator2 = this.H1) != null) {
                    interpolator3 = interpolator2;
                }
                valueAnimator2.setInterpolator(interpolator3);
                bnVar.M9.setStartDelay(getLineAnimationDelay());
                if (!bnVar.L9) {
                    bnVar.M9.start();
                }
                bnVar.M9();
                bnVar.O9();
                bnVar.f45946d0 = 0;
            } else if (this.f51620t7 != bnVar.f46064m1.getMeasuredHeight()) {
                bnVar.f45946d0 = 0;
            }
            if (this.f32566d4) {
                float scrollY = (this.f51622v7 - this.F0.getScrollY()) + (this.f51621u7 - this.F0.getMeasuredHeight());
                org.telegram.ui.Components.gf gfVar = this.F0;
                gfVar.setOffsetY(gfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.F0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final rj f51227b;

                    {
                        this.f51227b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (r2) {
                            case 0:
                                rj rjVar = this.f51227b;
                                bn bnVar2 = rjVar.f51623w7;
                                float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                rjVar.setAnimatedTop((int) floatValue);
                                View view2 = rjVar.f32709w2;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    rjVar.f32709w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.f32709w2.getLayoutParams().height) + floatValue);
                                } else {
                                    bnVar2.M9();
                                    bnVar2.O9();
                                }
                                rjVar.f32649o2.invalidate();
                                rjVar.invalidate();
                                return;
                            default:
                                this.f51227b.F0.setOffsetY(((Float) valueAnimator22.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator3 = bnVar.N9;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                bnVar.N9 = ofFloat2;
                ofFloat2.setDuration(E0());
                Interpolator interpolator4 = pi.k.V;
                if (this.G1 > 0 && SystemClock.uptimeMillis() < this.G1 && (interpolator = this.H1) != null) {
                    interpolator4 = interpolator;
                }
                ofFloat2.setInterpolator(interpolator4);
                ofFloat2.setStartDelay(getLineAnimationDelay());
                ofFloat2.start();
                this.f32566d4 = false;
            }
            this.f51620t7 = bnVar.f46064m1.getMeasuredHeight();
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
        bnVar.f45946d0 = 0;
        this.f32566d4 = false;
    }

    @Override
    public final void O0(boolean z10) {
        super.O0(z10);
        bn bnVar = this.f51623w7;
        af afVar = bnVar.Rb;
        if (afVar != null) {
            org.telegram.messenger.g0.g3(afVar);
            bnVar.Rb = null;
        }
    }

    @Override
    public final void b1(float f10) {
        this.f51623w7.F7();
    }

    @Override
    public final void d1(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bn bnVar = this.f51623w7;
        if (bnVar.f45903a0 != null) {
            if (bnVar.A0 != null) {
                if (bnVar.f45929bb <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                        if (kVar2.x()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f32566d4 = true;
            this.f51621u7 = this.F0.getMeasuredHeight();
            this.f51622v7 = this.F0.getScrollY();
            bnVar.f46064m1.invalidate();
            bnVar.f45946d0 = bnVar.f45903a0.getBackgroundTop();
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
    public final void i1() {
        if (this.f51623w7.f45943cb != null) {
            return;
        }
        super.i1();
    }

    @Override
    public final boolean o1() {
        if (!this.f51623w7.f45979f6) {
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
        bn bnVar = this.f51623w7;
        m6.n nVar = bnVar.f46037jd;
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
