package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sk extends ChatActivityEnterView {
    public int R5;
    public int S5;
    public int T5;
    public final eo U5;

    public sk(eo eoVar, Activity activity, org.telegram.ui.Components.yw0 yw0Var, eo eoVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, yw0Var, eoVar2, z10, c6Var);
        this.U5 = eoVar;
    }

    @Override
    public final void C0(float f7) {
        this.U5.t7();
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        eo eoVar = this.U5;
        if (eoVar.Y != null) {
            if (eoVar.f37478x0 != null) {
                if (eoVar.Ea <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                        if (kVar2.u()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.P3 = true;
            this.S5 = this.E0.getMeasuredHeight();
            this.T5 = this.E0.getScrollY();
            eoVar.X0.invalidate();
            eoVar.f37202b0 = eoVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void J0() {
        if (this.U5.Fa != null) {
            return;
        }
        super.J0();
    }

    @Override
    public final boolean P0() {
        if (!this.U5.N5) {
            return false;
        }
        return true;
    }

    public final void Y1() {
        org.telegram.ui.ActionBar.k kVar;
        eo eoVar = this.U5;
        kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
        if (!kVar.u() && !eoVar.F9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = eoVar.f37202b0;
            if (i10 != 0 && backgroundTop != i10 && this.R5 == eoVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + eoVar.f37202b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f23766y1.invalidate();
                ValueAnimator valueAnimator = eoVar.f37382p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    eoVar.f37382p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                eoVar.f37382p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sk f41671b;

                    {
                        this.f41671b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                sk skVar = this.f41671b;
                                eo eoVar2 = skVar.U5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                skVar.setAnimatedTop((int) floatValue);
                                View view2 = skVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    eoVar2.t9();
                                    eoVar2.w9();
                                }
                                skVar.f23766y1.invalidate();
                                skVar.invalidate();
                                return;
                            default:
                                this.f41671b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                eoVar.f37382p9.addListener(new w4(this, 19));
                eoVar.f37382p9.setDuration(250L);
                eoVar.f37382p9.setInterpolator(ji.n.V);
                if (!eoVar.o9) {
                    eoVar.f37382p9.start();
                }
                eoVar.t9();
                eoVar.w9();
                eoVar.f37202b0 = 0;
            } else if (this.R5 != eoVar.X0.getMeasuredHeight()) {
                eoVar.f37202b0 = 0;
            }
            if (this.P3) {
                float scrollY = (this.T5 - this.E0.getScrollY()) + (this.S5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.uf ufVar = this.E0;
                ufVar.setOffsetY(ufVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sk f41671b;

                    {
                        this.f41671b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                sk skVar = this.f41671b;
                                eo eoVar2 = skVar.U5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                skVar.setAnimatedTop((int) floatValue);
                                View view2 = skVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    eoVar2.t9();
                                    eoVar2.w9();
                                }
                                skVar.f23766y1.invalidate();
                                skVar.invalidate();
                                return;
                            default:
                                this.f41671b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = eoVar.f37394q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                eoVar.f37394q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                this.P3 = false;
            }
            this.R5 = eoVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = eoVar.f37394q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = eoVar.f37382p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        eoVar.f37202b0 = 0;
        this.P3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
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
    public final void r0(boolean z10) {
        super.r0(z10);
        eo eoVar = this.U5;
        vf vfVar = eoVar.nb;
        if (vfVar != null) {
            AndroidUtilities.runOnUIThread(vfVar);
            eoVar.nb = null;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        eo eoVar = this.U5;
        j6.l lVar = eoVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !eoVar.f37411rc) {
            z11 = true;
        }
        lVar.i(1, z10, z11);
    }
}
