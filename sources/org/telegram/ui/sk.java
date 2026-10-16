package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sk extends ChatActivityEnterView {
    public int f39836o5;
    public int p5;
    public int f39837q5;
    public final fo f39838r5;

    public sk(fo foVar, Activity activity, org.telegram.ui.Components.ow0 ow0Var, fo foVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, ow0Var, foVar2, z10, c6Var);
        this.f39838r5 = foVar;
    }

    @Override
    public final void A0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        fo foVar = this.f39838r5;
        if (foVar.Y != null) {
            if (foVar.f35861x0 != null) {
                if (foVar.Ea <= 0.0f) {
                    kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                        if (kVar2.t()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f22632n3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f39837q5 = this.E0.getScrollY();
            foVar.X0.invalidate();
            foVar.f35585b0 = foVar.Y.getBackgroundTop();
        }
    }

    @Override
    public final void F0() {
        if (this.f39838r5.Fa != null) {
            return;
        }
        super.F0();
    }

    @Override
    public final boolean L0() {
        if (!this.f39838r5.N5) {
            return false;
        }
        return true;
    }

    public final void Q1() {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.f39838r5;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (!kVar.t() && !foVar.F9()) {
            int backgroundTop = getBackgroundTop();
            int i10 = foVar.f35585b0;
            if (i10 != 0 && backgroundTop != i10 && this.f39836o5 == foVar.X0.getMeasuredHeight()) {
                int i11 = (this.T1 + foVar.f35585b0) - backgroundTop;
                setAnimatedTop(i11);
                this.f22690y1.invalidate();
                ValueAnimator valueAnimator = foVar.p9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    foVar.p9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i11, 0.0f);
                foVar.p9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sk f39543b;

                    {
                        this.f39543b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                sk skVar = this.f39543b;
                                fo foVar2 = skVar.f39838r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                skVar.setAnimatedTop((int) floatValue);
                                View view2 = skVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    foVar2.t9();
                                    foVar2.w9();
                                }
                                skVar.f22690y1.invalidate();
                                skVar.invalidate();
                                return;
                            default:
                                this.f39543b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                foVar.p9.addListener(new u0(this, 22));
                foVar.p9.setDuration(250L);
                foVar.p9.setInterpolator(ki.n.V);
                if (!foVar.f35756o9) {
                    foVar.p9.start();
                }
                foVar.t9();
                foVar.w9();
                foVar.f35585b0 = 0;
            } else if (this.f39836o5 != foVar.X0.getMeasuredHeight()) {
                foVar.f35585b0 = 0;
            }
            if (this.f22632n3) {
                float scrollY = (this.f39837q5 - this.E0.getScrollY()) + (this.p5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.rf rfVar = this.E0;
                rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sk f39543b;

                    {
                        this.f39543b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                sk skVar = this.f39543b;
                                fo foVar2 = skVar.f39838r5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                skVar.setAnimatedTop((int) floatValue);
                                View view2 = skVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    foVar2.t9();
                                    foVar2.w9();
                                }
                                skVar.f22690y1.invalidate();
                                skVar.invalidate();
                                return;
                            default:
                                this.f39543b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = foVar.f35777q9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                foVar.f35777q9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ki.n.V);
                ofFloat2.start();
                this.f22632n3 = false;
            }
            this.f39836o5 = foVar.X0.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = foVar.f35777q9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = foVar.p9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        foVar.f35585b0 = 0;
        this.f22632n3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void o0(boolean z10) {
        super.o0(z10);
        fo foVar = this.f39838r5;
        wf wfVar = foVar.f35745nb;
        if (wfVar != null) {
            AndroidUtilities.runOnUIThread(wfVar);
            foVar.f35745nb = null;
        }
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
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        fo foVar = this.f39838r5;
        j6.l lVar = foVar.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0 && !foVar.f35794rc) {
            z11 = true;
        }
        lVar.i(1, z10, z11);
    }

    @Override
    public final void y0(float f7) {
        this.f39838r5.t7();
    }
}
