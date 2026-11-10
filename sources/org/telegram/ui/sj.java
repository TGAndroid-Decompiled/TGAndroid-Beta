package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sj extends ChatActivityEnterView {
    public int f49861t5;
    public int f49862u5;
    public int f49863v5;
    public final cn f49864w5;

    public sj(cn cnVar, Activity activity, org.telegram.ui.Components.st0 st0Var, cn cnVar2, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, st0Var, cnVar2, z9, h6Var);
        this.f49864w5 = cnVar;
    }

    @Override
    public final void A0(float f10) {
        this.f49864w5.F7();
    }

    @Override
    public final void C0(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        cn cnVar = this.f49864w5;
        if (cnVar.Z != null) {
            if (cnVar.f44741z0 != null) {
                if (cnVar.Za <= 0.0f) {
                    lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                        if (lVar2.x()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f31111n3 = true;
            this.f49862u5 = this.E0.getMeasuredHeight();
            this.f49863v5 = this.E0.getScrollY();
            cnVar.l1.invalidate();
            cnVar.f44447c0 = cnVar.Z.getBackgroundTop();
        }
    }

    @Override
    public final void H0() {
        if (this.f49864w5.f44429ab != null) {
            return;
        }
        super.H0();
    }

    @Override
    public final boolean N0() {
        if (!this.f49864w5.f44466d6) {
            return false;
        }
        return true;
    }

    public final void V1() {
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.f49864w5;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (!lVar.x() && !cnVar.X9()) {
            int backgroundTop = getBackgroundTop();
            int i7 = cnVar.f44447c0;
            if (i7 != 0 && backgroundTop != i7 && this.f49861t5 == cnVar.l1.getMeasuredHeight()) {
                int i10 = (this.T1 + cnVar.f44447c0) - backgroundTop;
                setAnimatedTop(i10);
                this.f31173y1.invalidate();
                ValueAnimator valueAnimator = cnVar.K9;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    cnVar.K9.cancel();
                }
                View view = this.G1;
                if (view != null && view.getVisibility() == 0) {
                    this.G1.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + this.T1);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i10, 0.0f);
                cnVar.K9 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sj f49428b;

                    {
                        this.f49428b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                sj sjVar = this.f49428b;
                                cn cnVar2 = sjVar.f49864w5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                sjVar.setAnimatedTop((int) floatValue);
                                View view2 = sjVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    cnVar2.L9();
                                    cnVar2.N9();
                                }
                                sjVar.f31173y1.invalidate();
                                sjVar.invalidate();
                                return;
                            default:
                                this.f49428b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                cnVar.K9.addListener(new va(this, 5));
                cnVar.K9.setDuration(250L);
                cnVar.K9.setInterpolator(mi.l.V);
                if (!cnVar.J9) {
                    cnVar.K9.start();
                }
                cnVar.L9();
                cnVar.N9();
                cnVar.f44447c0 = 0;
            } else if (this.f49861t5 != cnVar.l1.getMeasuredHeight()) {
                cnVar.f44447c0 = 0;
            }
            if (this.f31111n3) {
                float scrollY = (this.f49863v5 - this.E0.getScrollY()) + (this.f49862u5 - this.E0.getMeasuredHeight());
                org.telegram.ui.Components.we weVar = this.E0;
                weVar.setOffsetY(weVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final sj f49428b;

                    {
                        this.f49428b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                sj sjVar = this.f49428b;
                                cn cnVar2 = sjVar.f49864w5;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                sjVar.setAnimatedTop((int) floatValue);
                                View view2 = sjVar.G1;
                                if (view2 != null && view2.getVisibility() == 0) {
                                    sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + floatValue);
                                } else {
                                    cnVar2.L9();
                                    cnVar2.N9();
                                }
                                sjVar.f31173y1.invalidate();
                                sjVar.invalidate();
                                return;
                            default:
                                this.f49428b.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = cnVar.L9;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                cnVar.L9 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.l.V);
                ofFloat2.start();
                this.f31111n3 = false;
            }
            this.f49861t5 = cnVar.l1.getMeasuredHeight();
            return;
        }
        ValueAnimator valueAnimator3 = cnVar.L9;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = cnVar.K9;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        cnVar.f44447c0 = 0;
        this.f31111n3 = false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void o0(boolean z9) {
        super.o0(z9);
        cn cnVar = this.f49864w5;
        bf bfVar = cnVar.Pb;
        if (bfVar != null) {
            org.telegram.messenger.g0.h3(bfVar);
            cnVar.Pb = null;
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
    public final void setVisibility(int i7) {
        boolean z9;
        super.setVisibility(i7);
        cn cnVar = this.f49864w5;
        m6.n nVar = cnVar.f44526hd;
        boolean z10 = false;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getMeasuredWidth() > 0 && !cnVar.Xc) {
            z10 = true;
        }
        nVar.h(1, z9, z10);
    }
}
