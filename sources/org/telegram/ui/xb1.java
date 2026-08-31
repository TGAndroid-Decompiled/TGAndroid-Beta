package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class xb1 extends org.telegram.ui.Components.tl0 {
    public boolean U2;
    public float V2;
    public final ed1 W2;

    public xb1(Context context, ed1 ed1Var) {
        super(context, null);
        this.W2 = ed1Var;
    }

    @Override
    public final boolean F0(View view) {
        f2.m1 T;
        xb1 xb1Var = this.W2.f36531r0;
        View F = xb1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = xb1Var.T(F);
        }
        if (T != null && T.f5879f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f2.m1 T;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.getMessageObject();
            ImageReceiver avatarImage = t1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = t1Var.m3();
                ed1 ed1Var = this.W2;
                if (m32 && (T = ed1Var.f36531r0.T(view)) != null) {
                    if (ed1Var.f36531r0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = t1Var.getTranslationX();
                int layoutHeight = t1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = ed1Var.f36531r0.getMeasuredHeight() - ed1Var.f36531r0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (t1Var.n3() && (r11 = ed1Var.f36531r0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        f2.m1 T2 = ed1Var.f36531r0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f5875a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.t1) && ((org.telegram.ui.Cells.t1) view2).n3()) {
                            top = top2;
                        } else {
                            top = top2;
                            break;
                        }
                    }
                }
                if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                    layoutHeight = AndroidUtilities.dp(48.0f) + top;
                }
                int i11 = (translationX > 0.0f ? 1 : (translationX == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.translate(translationX, 0.0f);
                }
                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                avatarImage.draw(canvas);
                if (i11 != 0) {
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }

    @Override
    public final void h1(View view, float f10, float f11, boolean z4) {
        if (z4 && (view instanceof org.telegram.ui.Cells.t1) && !((org.telegram.ui.Cells.t1) view).i3(f10)) {
            return;
        }
        super.h1(view, f10, f11, z4);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.W2.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ed1 ed1Var = this.W2;
        if (action == 1) {
            if (!ed1Var.f36524o0 && (ed1Var.f36550y1 instanceof pi1) && ed1Var.I0[0].getVisibility() == 0) {
                ed1Var.f1(0, false, true);
            }
            ed1Var.f36524o0 = false;
        }
        if (ed1Var.X1) {
            if (motionEvent.getAction() == 0) {
                this.V2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.U2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.U2 && Math.abs(this.V2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.U2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.U2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            ed1Var.P1.a(motionEvent);
        }
        if (!this.U2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ed1 ed1Var = this.W2;
        int i10 = 0;
        if (ed1Var.G0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr = ed1Var.G0;
                if (i11 >= n81VarArr.length) {
                    break;
                }
                n81VarArr[i11].invalidate();
                i11++;
            }
        }
        if (ed1Var.H0 != null) {
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr2 = ed1Var.H0;
                if (i10 >= n81VarArr2.length) {
                    break;
                }
                n81VarArr2[i10].invalidate();
                i10++;
            }
        }
        bc1 bc1Var = ed1Var.A0;
        if (bc1Var != null) {
            bc1Var.invalidate();
        }
        bc1 bc1Var2 = ed1Var.B0;
        if (bc1Var2 != null) {
            bc1Var2.invalidate();
        }
    }
}
