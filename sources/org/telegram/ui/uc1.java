package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class uc1 extends org.telegram.ui.Components.wm0 {
    public boolean V2;
    public float W2;
    public final zd1 X2;

    public uc1(Context context, zd1 zd1Var) {
        super(context, null);
        this.X2 = zd1Var;
    }

    @Override
    public final boolean F0(View view) {
        s4.d1 T;
        uc1 uc1Var = this.X2.f44789u0;
        View F = uc1Var.F(view);
        if (F == null) {
            T = null;
        } else {
            T = uc1Var.T(F);
        }
        if (T != null && T.f47901f == 2) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s4.d1 T;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.getMessageObject();
            ImageReceiver avatarImage = u1Var.getAvatarImage();
            if (avatarImage != null) {
                int top = view.getTop();
                boolean m32 = u1Var.m3();
                zd1 zd1Var = this.X2;
                if (m32 && (T = zd1Var.f44789u0.T(view)) != null) {
                    if (zd1Var.f44789u0.K(T.b() - 1) != null) {
                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                        avatarImage.draw(canvas);
                        return drawChild;
                    }
                }
                float translationX = u1Var.getTranslationX();
                int layoutHeight = u1Var.getLayoutHeight() + view.getTop();
                int measuredHeight = zd1Var.f44789u0.getMeasuredHeight() - zd1Var.f44789u0.getPaddingBottom();
                if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (u1Var.n3() && (r11 = zd1Var.f44789u0.T(view)) != null) {
                    int i10 = 0;
                    while (i10 < 20) {
                        i10++;
                        s4.d1 T2 = zd1Var.f44789u0.K(T2.b() + 1);
                        if (T2 == null) {
                            break;
                        }
                        View view2 = T2.f47897a;
                        int top2 = view2.getTop();
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                            translationX = Math.min(view2.getTranslationX(), translationX);
                        }
                        if ((view2 instanceof org.telegram.ui.Cells.u1) && ((org.telegram.ui.Cells.u1) view2).n3()) {
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
    public final void h1(View view, float f7, float f10, boolean z10) {
        if (z10 && (view instanceof org.telegram.ui.Cells.u1) && !((org.telegram.ui.Cells.u1) view).i3(f7)) {
            return;
        }
        super.h1(view, f7, f10, z10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.X2.V0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        zd1 zd1Var = this.X2;
        if (action == 1) {
            if (!zd1Var.f44782r0 && (zd1Var.B1 instanceof jj1) && zd1Var.L0[0].getVisibility() == 0) {
                zd1Var.f1(0, false, true);
            }
            zd1Var.f44782r0 = false;
        }
        if (zd1Var.a2) {
            if (motionEvent.getAction() == 0) {
                this.W2 = motionEvent.getX();
                motionEvent.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.V2 = true;
            } else if (motionEvent.getAction() == 2) {
                if (!this.V2 && Math.abs(this.W2 - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    this.V2 = true;
                }
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.V2 = false;
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            zd1Var.S1.a(motionEvent);
        }
        if (!this.V2 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        zd1 zd1Var = this.X2;
        int i10 = 0;
        if (zd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.v91[] v91VarArr = zd1Var.J0;
                if (i11 >= v91VarArr.length) {
                    break;
                }
                v91VarArr[i11].invalidate();
                i11++;
            }
        }
        if (zd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.v91[] v91VarArr2 = zd1Var.K0;
                if (i10 >= v91VarArr2.length) {
                    break;
                }
                v91VarArr2[i10].invalidate();
                i10++;
            }
        }
        xc1 xc1Var = zd1Var.D0;
        if (xc1Var != null) {
            xc1Var.invalidate();
        }
        xc1 xc1Var2 = zd1Var.E0;
        if (xc1Var2 != null) {
            xc1Var2.invalidate();
        }
    }
}
