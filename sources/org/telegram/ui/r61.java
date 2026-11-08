package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r61 extends org.telegram.ui.Components.pj0 {
    public boolean f49395e3;
    public float f49396f3;
    public final v71 f49397g3;

    public r61(Context context, v71 v71Var) {
        super(context, null);
        this.f49397g3 = v71Var;
    }

    @Override
    public final boolean F0(View view) {
        v4.d1 T;
        r61 r61Var = this.f49397g3.f50577v0;
        View F = r61Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = r61Var.T(F);
        }
        if (T != null && T.f57047f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v4.d1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.getMessageObject();
            ImageReceiver avatarImage = q1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean H2 = q1Var.H2();
                v71 v71Var = this.f49397g3;
                if (H2 && (T = v71Var.f50577v0.T(view)) != null) {
                    if (v71Var.f50577v0.K(T.b() - 1) != null) {
                        avatarImage.L0 = -org.telegram.messenger.g0.L(1000.0f);
                        avatarImage.h(canvas, null);
                        return drawChild;
                    }
                }
                float translationX = q1Var.getTranslationX();
                int layoutHeight = q1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = v71Var.f50577v0.getMeasuredHeight() - v71Var.f50577v0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (q1Var.I2() && (r12 = v71Var.f50577v0.T(view)) != null) {
                    int i7 = 0;
                    while (i7 < 20) {
                        i7++;
                        v4.d1 T2 = v71Var.f50577v0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f57043a;
                        int top2 = view2.getTop();
                        if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.q1) && ((org.telegram.ui.Cells.q1) view2).I2()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - org.telegram.messenger.g0.L(48.0f) < top) {
                    layoutHeight = org.telegram.messenger.g0.L(48.0f) + top;
                }
                int i10 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i10 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.L0 = layoutHeight - org.telegram.messenger.g0.L(44.0f);
                avatarImage.h(canvas, null);
                if (i10 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void j1(View view, float f10, float f11, boolean z9) {
        if (z9 && (view instanceof org.telegram.ui.Cells.q1) && !((org.telegram.ui.Cells.q1) view).B2(f10)) {
            return;
        }
        super.j1(view, f10, f11, z9);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f49397g3.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        v71 v71Var = this.f49397g3;
        if (action == 1) {
            if (!v71Var.f50571s0 && (v71Var.C1 instanceof pc1) && v71Var.M0[0].getVisibility() == 0) {
                v71Var.k1(0, false, true);
            }
            v71Var.f50571s0 = false;
        }
        if (v71Var.f50527b2) {
            if (motionEvent.getAction() == 0) {
                this.f49396f3 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f49395e3 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.f49395e3 && Math.abs(this.f49396f3 - motionEvent.getX()) > org.telegram.messenger.g0.f22542e) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.f49395e3 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f49395e3 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            v71Var.T1.a(motionEvent);
        }
        if (!this.f49395e3 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        v71 v71Var = this.f49397g3;
        int i7 = 0;
        if (v71Var.K0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr = v71Var.K0;
                if (i10 >= w61VarArr.length) {
                    break;
                }
                w61VarArr[i10].invalidate();
                i10++;
            }
        }
        if (v71Var.L0 != null) {
            while (true) {
                org.telegram.ui.Components.w61[] w61VarArr2 = v71Var.L0;
                if (i7 >= w61VarArr2.length) {
                    break;
                }
                w61VarArr2[i7].invalidate();
                i7++;
            }
        }
        u61 u61Var = v71Var.E0;
        if (u61Var != null) {
            u61Var.invalidate();
        }
        u61 u61Var2 = v71Var.F0;
        if (u61Var2 != null) {
            u61Var2.invalidate();
        }
    }
}
