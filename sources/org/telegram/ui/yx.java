package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class yx extends org.telegram.ui.Components.zu0 {
    public final gy A0;

    public final Paint f44955s0;

    public int f44956t0;

    public int f44957u0;

    public int f44958v0;

    public VelocityTracker f44959w0;

    public final Rect f44960x0;

    public boolean f44961y0;

    public final vd.b f44962z0;

    public yx(Context context, gy gyVar) {
        super(context, null);
        this.A0 = gyVar;
        this.f44955s0 = new Paint(1);
        this.f44960x0 = new Rect();
        this.f44962z0 = new vd.b(new g(this, 15));
    }

    @Override
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            gy gyVar = this.A0;
            if (gyVar.f38544i4 != null && ng.c.c(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider)) {
                int i10 = (((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider == null ? org.telegram.ui.ActionBar.g6.I.q() : ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider.a()) ? 178 : 216;
                canvas.save();
                canvas.translate(0.0f, -f10);
                gyVar.f38544i4.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(i10);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override
    public final void L(Canvas canvas, ArrayList arrayList) {
        px pxVar;
        org.telegram.ui.Components.zk0 zk0VarP;
        gy gyVar = this.A0;
        if (gyVar.f38557l3 && (pxVar = gyVar.f38619y0) != null && pxVar.getVisibility() == 0) {
            px pxVar2 = gyVar.f38619y0;
            View[] viewArr = pxVar2.f31545e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (zk0VarP = org.telegram.ui.Components.p71.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < zk0VarP.getChildCount(); i11++) {
                        View childAt = zk0VarP.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int iSave = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + zk0VarP.getY() + viewArr[i10].getY() + pxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(iSave);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void M() {
        super.M();
        this.A0.m3();
    }

    @Override
    public final boolean O() {
        return true;
    }

    public final boolean Z() {
        AnimatorSet animatorSet;
        gy gyVar = this.A0;
        if (!gyVar.f38511c3) {
            return false;
        }
        if (gyVar.f38528f3) {
            if (Math.abs(gyVar.f38498a0[0].getTranslationX()) < 1.0f) {
                gyVar.f38498a0[0].setTranslationX(0.0f);
                fy[] fyVarArr = gyVar.f38498a0;
                fyVarArr[1].setTranslationX(fyVarArr[0].getMeasuredWidth() * (gyVar.f38516d3 ? 1 : -1));
                gy.f1(gyVar, true);
                animatorSet = gyVar.f38505b3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    gyVar.f38505b3 = null;
                }
                gyVar.f38511c3 = false;
            }
        } else if (Math.abs(gyVar.f38498a0[1].getTranslationX()) < 1.0f) {
            fy fyVar = gyVar.f38498a0[0];
            fyVar.setTranslationX(fyVar.getMeasuredWidth() * (gyVar.f38516d3 ? -1 : 1));
            gyVar.f38498a0[1].setTranslationX(0.0f);
            gy.f1(gyVar, true);
            animatorSet = gyVar.f38505b3;
            if (animatorSet != null) {
                animatorSet.cancel();
                gyVar.f38505b3 = null;
            }
            gyVar.f38511c3 = false;
        }
        return gyVar.f38511c3;
    }

    public final int a0() {
        gy gyVar = this.A0;
        float height = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getHeight();
        bx bxVar = gyVar.B3;
        float f10 = (bxVar == null || !bxVar.c()) ? 0.0f : gyVar.B3.f38299e;
        if (gyVar.G) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, gyVar.f38577p3, (1.0f - f10) * (1.0f - gyVar.f38597t1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - gyVar.f38597t1) * (1.0f - gyVar.f38577p3) * AndroidUtilities.dp(48.0f), height + gyVar.P);
    }

    public final int b0() {
        gy gyVar = this.A0;
        float f10 = gyVar.J;
        bx bxVar = gyVar.B3;
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, gyVar.f38597t1, org.telegram.messenger.y1.z(1.0f, (bxVar == null || !bxVar.c()) ? 0.0f : gyVar.B3.f38299e, 1.0f - gyVar.f38577p3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        gy gyVar = this.A0;
        fw fwVar = gyVar.f38604v0;
        int i10 = fwVar.f35078f0.get(fwVar.G + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        gyVar.f38543i3 = false;
        gyVar.f38538h3 = true;
        this.f44957u0 = (int) (motionEvent.getX() + gyVar.f38522e3);
        ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.setEnabled(false);
        gyVar.f38604v0.setEnabled(false);
        fy fyVar = gyVar.f38498a0[1];
        fyVar.h = i10;
        fyVar.setVisibility(0);
        gyVar.f38516d3 = z10;
        gy.f1(gyVar, false);
        gyVar.R4(true);
        if (z10) {
            fy[] fyVarArr = gyVar.f38498a0;
            fyVarArr[1].setTranslationX(fyVarArr[0].getMeasuredWidth());
            return true;
        }
        fy[] fyVarArr2 = gyVar.f38498a0;
        fyVarArr2[1].setTranslationX(-fyVarArr2[0].getMeasuredWidth());
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        float f12;
        float f13;
        bx bxVar;
        vx vxVar;
        float f14;
        ag.s0 s0Var;
        float f15;
        vx vxVar2;
        bx bxVar2;
        gy gyVar = this.A0;
        Paint paint = gyVar.f38503b1;
        if (Build.VERSION.SDK_INT >= 31 && gyVar.f38539h4 != null) {
            gyVar.m3();
        }
        if (gyVar.M && (((bxVar2 = gyVar.B3) == null || !bxVar2.c()) && gyVar.f38577p3 == 0.0f)) {
            gyVar.M = false;
            int i10 = (gyVar.Z3() && gyVar.f38498a0[0].f38232s == 0) ? 1 : 0;
            cy cyVar = gyVar.f38498a0[0].f38225a;
            if (gyVar.N) {
                if (gyVar.X0) {
                    i10 = 0;
                } else {
                    if (i10 == 0) {
                        gyVar.N = false;
                    }
                    if (gyVar.N) {
                        f2.o1 o1VarL = cyVar.L(0, false);
                        if (o1VarL == null) {
                            gyVar.N = false;
                        } else {
                            View view = o1VarL.f5789a;
                            if (view.getBottom() <= cyVar.getPaddingTop() - AndroidUtilities.dp(81.0f) || view.getTop() >= cyVar.getPaddingTop()) {
                                gyVar.N = false;
                            }
                        }
                        if (gyVar.N && i10 == 1) {
                            i10 = 0;
                        }
                    }
                }
            }
            f2.o1 o1VarL2 = cyVar.L(i10, false);
            if (o1VarL2 != null) {
                float paddingTop = cyVar.getPaddingTop() - o1VarL2.f5789a.getY();
                if (paddingTop >= 0.0f) {
                    float f16 = -paddingTop;
                    float f17 = -gyVar.T3();
                    if (f16 < f17) {
                        f16 = f17;
                    } else if (f16 > 0.0f) {
                        f16 = 0.0f;
                    }
                    gyVar.C4(f16);
                } else {
                    gyVar.C4(0.0f);
                }
            } else {
                gyVar.C4(-gyVar.T3());
            }
        }
        int iA0 = a0();
        int iB0 = ((org.telegram.ui.ActionBar.n2) gyVar).inPreviewMode ? AndroidUtilities.statusBarHeight : b0();
        int i11 = iB0 + iA0;
        gyVar.B3.setCurrentTop(i11);
        boolean z10 = gyVar.f38567n3;
        Rect rect = this.f44960x0;
        Paint paint2 = this.f44955s0;
        if (!z10) {
            f10 = 1.0f;
            f11 = 81.0f;
            if (!((org.telegram.ui.ActionBar.n2) gyVar).inPreviewMode) {
                if (gyVar.f38577p3 > 0.0f) {
                    paint2.setColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                    rect.set(0, Math.max(0, iB0), getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.f38597t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.f44960x0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, iB0), getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.f38597t1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.f44960x0, paint, true);
                }
            }
            gyVar.f38594s3 = 0.0f;
            gyVar.f38588r3 = 0.0f;
            if (gyVar.G) {
                f12 = 81.0f;
            } else {
                f12 = 0.0f;
            }
            float fDp = AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(f12) + gyVar.J;
            float f18 = gyVar.f38577p3;
            if (gyVar.G) {
                f13 = 81.0f;
            } else {
                f13 = 0.0f;
            }
            float fMin = gyVar.f38594s3 - Math.min(fDp, f18 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(f13)));
            gyVar.f38594s3 = fMin;
            gyVar.f38588r3 = fMin;
            bxVar = gyVar.B3;
            if (bxVar == null && bxVar.c()) {
                float f19 = gyVar.B3.f38299e;
                float fT3 = gyVar.f38594s3 - ((gyVar.T3() + gyVar.J) * f19);
                gyVar.f38594s3 = fT3;
                gyVar.f38588r3 = fT3;
                float fClamp = gyVar.C0 ? f10 - Utilities.clamp(f19 / 0.5f, f10, 0.0f) : 1.0f;
                fw fwVar = gyVar.f38604v0;
                if (fwVar != null && fwVar.getVisibility() == 0) {
                    gyVar.f38594s3 -= (f10 - gyVar.f38584r.f48497e) * gyVar.f38604v0.getMeasuredHeight();
                }
                vx vxVar3 = gyVar.T;
                if (vxVar3 != null) {
                    vxVar3.setTranslationY(gyVar.W3() + AndroidUtilities.lerp(gyVar.J + gyVar.f38594s3, -AndroidUtilities.dp(gyVar.G ? 81.0f : 0.0f), f19));
                }
                if (gyVar.f38618y) {
                    boolean z11 = gyVar.A;
                    float f20 = z11 ? 0.0f : gyVar.J;
                    f15 = -AndroidUtilities.lerp((-f20) + AndroidUtilities.dp((z11 || !gyVar.f38608w) ? 0.0f : 50.0f), f20, gyVar.B3.f38299e);
                } else {
                    f15 = 0.0f;
                }
                gyVar.f38498a0[0].setTranslationY(f15 - (((gyVar.G ? AndroidUtilities.dp(f11) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * gyVar.B3.f38299e));
                f14 = fClamp;
            } else {
                vxVar = gyVar.T;
                if (vxVar != null) {
                    vxVar.setTranslationY(AndroidUtilities.lerp(((gyVar.J + gyVar.f38594s3) + gyVar.P) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((gyVar.G ? 81 : 0) + 48), gyVar.f38597t1));
                }
                f14 = 1.0f;
            }
            gyVar.S4();
            gy.N2(gyVar, f14);
            super.dispatchDraw(canvas);
            gy.O2(gyVar, canvas2, i11);
            s0Var = gyVar.G0;
            if (s0Var != null && s0Var.getVisibility() == 0) {
                if (gyVar.G0.getAlpha() != f10) {
                    gyVar.G0.draw(canvas2);
                } else if (gyVar.G0.getAlpha() != 0.0f) {
                    Canvas canvas3 = canvas2;
                    canvas3.saveLayerAlpha(gyVar.G0.getLeft(), gyVar.G0.getTop(), gyVar.G0.getRight(), gyVar.G0.getBottom(), (int) (gyVar.G0.getAlpha() * 255.0f), 31);
                    canvas2 = canvas3;
                    canvas2.translate(gyVar.G0.getLeft(), gyVar.G0.getTop());
                    gyVar.G0.draw(canvas2);
                    canvas2.restore();
                }
            }
            if (!gyVar.S && gyVar.T2 == 0) {
                AndroidUtilities.drawNavigationBarProtection(canvas2, this, gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), gyVar.f38512c4);
            }
            gyVar.R = true;
        }
        float f21 = gyVar.f38597t1;
        if (f21 == 1.0f) {
            paint2.setColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        } else if (f21 == 0.0f && (vxVar2 = gyVar.T) != null) {
            vxVar2.setTranslationY(gyVar.W3() + gyVar.J);
        }
        rect.set(0, iB0, getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.f38597t1 * 2.0f));
        float f22 = gyVar.f38597t1;
        if (f22 < 0.0f) {
            if (f22 == 1.0f) {
                paint = paint2;
            }
            f10 = 1.0f;
            f11 = 81.0f;
            J(canvas, 0.0f, this.f44960x0, paint, true);
        } else {
            f10 = 1.0f;
            f11 = 81.0f;
        }
        float f23 = gyVar.f38597t1;
        if (f23 > 0.0f && f23 < f10) {
            paint2.setColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
            if (!gyVar.f38557l3 && gyVar.f38561m3) {
                rect.set(0, iB0, getMeasuredWidth(), i11 - AndroidUtilities.dp(gyVar.f38597t1 * 2.0f));
                J(canvas, 0.0f, this.f44960x0, paint2, true);
            }
            vx vxVar4 = gyVar.T;
            if (vxVar4 != null) {
                int height = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getHeight();
                fw fwVar2 = gyVar.f38604v0;
                vxVar4.setTranslationY(gyVar.W3() + (i11 - (height + (fwVar2 != null ? fwVar2.getMeasuredHeight() : 0))));
            }
        }
        canvas2 = canvas;
        gyVar.f38594s3 = 0.0f;
        gyVar.f38588r3 = 0.0f;
        if (gyVar.G) {
            f12 = 81.0f;
        } else {
            f12 = 0.0f;
        }
        float fDp2 = AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(f12) + gyVar.J;
        float f110 = gyVar.f38577p3;
        if (gyVar.G) {
            f13 = 81.0f;
        } else {
            f13 = 0.0f;
        }
        float fMin2 = gyVar.f38594s3 - Math.min(fDp2, f110 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(f13)));
        gyVar.f38594s3 = fMin2;
        gyVar.f38588r3 = fMin2;
        bxVar = gyVar.B3;
        if (bxVar == null) {
            vxVar = gyVar.T;
            if (vxVar != null) {
                vxVar.setTranslationY(AndroidUtilities.lerp(((gyVar.J + gyVar.f38594s3) + gyVar.P) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((gyVar.G ? 81 : 0) + 48), gyVar.f38597t1));
            }
            f14 = 1.0f;
        } else {
            vxVar = gyVar.T;
            if (vxVar != null) {
                vxVar.setTranslationY(AndroidUtilities.lerp(((gyVar.J + gyVar.f38594s3) + gyVar.P) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((gyVar.G ? 81 : 0) + 48), gyVar.f38597t1));
            }
            f14 = 1.0f;
        }
        gyVar.S4();
        gy.N2(gyVar, f14);
        super.dispatchDraw(canvas);
        gy.O2(gyVar, canvas2, i11);
        s0Var = gyVar.G0;
        if (s0Var != null) {
            if (gyVar.G0.getAlpha() != f10) {
                gyVar.G0.draw(canvas2);
            } else if (gyVar.G0.getAlpha() != 0.0f) {
                Canvas canvas4 = canvas2;
                canvas4.saveLayerAlpha(gyVar.G0.getLeft(), gyVar.G0.getTop(), gyVar.G0.getRight(), gyVar.G0.getBottom(), (int) (gyVar.G0.getAlpha() * 255.0f), 31);
                canvas2 = canvas4;
                canvas2.translate(gyVar.G0.getLeft(), gyVar.G0.getTop());
                gyVar.G0.draw(canvas2);
                canvas2.restore();
            }
        }
        if (!gyVar.S) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), gyVar.f38512c4);
        }
        gyVar.R = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f44962z0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gy gyVar = this.A0;
        if (view == gyVar.G0) {
            return true;
        }
        if (org.telegram.ui.Components.zu0.f35365r0) {
            return super.drawChild(canvas, view, j10);
        }
        fy[] fyVarArr = gyVar.f38498a0;
        if (view != fyVarArr[0] && ((fyVarArr.length <= 1 || view != fyVarArr[1]) && view != gyVar.F1 && view != gyVar.f38604v0)) {
            if (view != ((org.telegram.ui.ActionBar.n2) gyVar).actionBar || gyVar.T3 == 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            if (gyVar.U3) {
                canvas.translate((1.0f - gyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float fB = org.telegram.ui.Cells.pa.b(1.0f, gyVar.T3, 0.05f, 1.0f);
                canvas.translate((1.0f - gyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(fB, fB, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
            }
            boolean zDrawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return zDrawChild;
        }
        canvas.save();
        if (view != gyVar.F1 && view != gyVar.f38604v0) {
            canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
        }
        float f10 = gyVar.T3;
        if (f10 != 1.0f) {
            if (gyVar.U3) {
                canvas.translate((1.0f - gyVar.T3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
            } else {
                float fB2 = org.telegram.ui.Cells.pa.b(1.0f, f10, 0.05f, 1.0f);
                canvas.translate((1.0f - gyVar.T3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                canvas.scale(fB2, fB2, 0.0f, (-getY()) + gyVar.J + a0());
            }
        }
        boolean zDrawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild2;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.i5 i5Var = this.A0.f38626z3;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i5 i5Var = this.A0.f38626z3;
        if (i5Var != null) {
            i5Var.b();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fw fwVar;
        int actionMasked = motionEvent.getActionMasked();
        gy gyVar = this.A0;
        if ((actionMasked == 1 || actionMasked == 3) && ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.t()) {
            gyVar.U0 = true;
        }
        return Z() || ((fwVar = gyVar.f38604v0) != null && fwVar.K) || onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gy gyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        yw ywVar;
        yw ywVar2;
        yx yxVar = this;
        int childCount = yxVar.getChildCount();
        int iR = yxVar.R();
        yxVar.setBottomClip(0);
        int measuredWidth = yxVar.getMeasuredWidth();
        int measuredHeight2 = yxVar.getMeasuredHeight();
        int i19 = 0;
        while (true) {
            gyVar = yxVar.A0;
            if (i19 >= childCount) {
                break;
            }
            View childAt = yxVar.getChildAt(i19);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 != 1) {
                    if (i22 != 5) {
                        i16 = layoutParams.leftMargin;
                    } else {
                        i14 = measuredWidth - measuredWidth2;
                        i15 = layoutParams.rightMargin;
                    }
                    if (i21 != 16) {
                        if (i21 != 48) {
                            measuredHeight = layoutParams.topMargin + yxVar.getPaddingTop();
                        } else if (i21 != 80) {
                            measuredHeight = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight2 - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != gyVar.T || childAt == gyVar.V || childAt == (ywVar2 = gyVar.A0)) {
                            measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                            if (childAt != gyVar.T && childAt != gyVar.A0 && childAt != gyVar.V) {
                                measuredHeight += AndroidUtilities.dp(48.0f);
                            }
                            if (gyVar.G && childAt == gyVar.T) {
                                measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                            }
                            ywVar = gyVar.A0;
                            if (childAt == ywVar && ywVar.getPremiumHint() != null) {
                                gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                            }
                            if (childAt == gyVar.T) {
                                measuredHeight += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == gyVar.f38619y0) {
                            measuredHeight = -AndroidUtilities.dp(gyVar.f38497a);
                        } else if (childAt instanceof tu) {
                            measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                        } else if (childAt instanceof fy) {
                            measuredHeight = 0;
                        } else if (childAt == gyVar.F1 || childAt == gyVar.G1 || childAt == gyVar.f38604v0) {
                            measuredHeight = AndroidUtilities.dp(48.0f) + ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight() + measuredHeight;
                        } else if (ywVar2 == null || ywVar2.getPremiumHint() != childAt) {
                        }
                        childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                    } else {
                        i17 = ((measuredHeight2 - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    measuredHeight = i17 - i18;
                    if (childAt != gyVar.T) {
                        measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                        if (childAt != gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(48.0f);
                        }
                        if (gyVar.G) {
                            measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                        }
                        ywVar = gyVar.A0;
                        if (childAt == ywVar) {
                            gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                        }
                        if (childAt == gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(2.0f);
                        }
                        childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                    } else {
                        measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                        if (childAt != gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(48.0f);
                        }
                        if (gyVar.G) {
                            measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                        }
                        ywVar = gyVar.A0;
                        if (childAt == ywVar) {
                            gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                        }
                        if (childAt == gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(2.0f);
                        }
                        childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                    }
                } else {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i21 != 16) {
                    if (i21 != 48) {
                        measuredHeight = layoutParams.topMargin + yxVar.getPaddingTop();
                    } else if (i21 != 80) {
                        measuredHeight = layoutParams.topMargin;
                    } else {
                        i17 = measuredHeight2 - measuredHeight3;
                        i18 = layoutParams.bottomMargin;
                    }
                    if (childAt != gyVar.T) {
                        measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                        if (childAt != gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(48.0f);
                        }
                        if (gyVar.G) {
                            measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                        }
                        ywVar = gyVar.A0;
                        if (childAt == ywVar) {
                            gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                        }
                        if (childAt == gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(2.0f);
                        }
                        childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                    } else {
                        measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                        if (childAt != gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(48.0f);
                        }
                        if (gyVar.G) {
                            measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                        }
                        ywVar = gyVar.A0;
                        if (childAt == ywVar) {
                            gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                        }
                        if (childAt == gyVar.T) {
                            measuredHeight += AndroidUtilities.dp(2.0f);
                        }
                        childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                    }
                } else {
                    i17 = ((measuredHeight2 - measuredHeight3) / 2) + layoutParams.topMargin;
                    i18 = layoutParams.bottomMargin;
                }
                measuredHeight = i17 - i18;
                if (childAt != gyVar.T) {
                    measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                    if (childAt != gyVar.T) {
                        measuredHeight += AndroidUtilities.dp(48.0f);
                    }
                    if (gyVar.G) {
                        measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                    }
                    ywVar = gyVar.A0;
                    if (childAt == ywVar) {
                        gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                    }
                    if (childAt == gyVar.T) {
                        measuredHeight += AndroidUtilities.dp(2.0f);
                    }
                    childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                } else {
                    measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight();
                    if (childAt != gyVar.T) {
                        measuredHeight += AndroidUtilities.dp(48.0f);
                    }
                    if (gyVar.G) {
                        measuredHeight = AndroidUtilities.dp(81.0f) + measuredHeight;
                    }
                    ywVar = gyVar.A0;
                    if (childAt == ywVar) {
                        gyVar.A0.getPremiumHint().layout(i16, org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3), i16 + measuredWidth2, gyVar.A0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.rl.C(54.0f, measuredHeight, measuredHeight3));
                    }
                    if (childAt == gyVar.T) {
                        measuredHeight += AndroidUtilities.dp(2.0f);
                    }
                    childAt.layout(i16, measuredHeight, measuredWidth2 + i16, measuredHeight3 + measuredHeight);
                }
            }
            i19++;
            yxVar = this;
        }
        px pxVar = gyVar.f38619y0;
        if (pxVar != null) {
            pxVar.setKeyboardHeight(iR);
        }
        S();
        gyVar.X4();
        gyVar.S4();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        gy gyVar = this.A0;
        int i12 = gyVar.f38497a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.v0 v0Var = gyVar.f38540i0;
        if (v0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v0Var.getLayoutParams();
            layoutParams.topMargin = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        measureChildWithMargins(((org.telegram.ui.ActionBar.n2) gyVar).actionBar, i10, 0, i11, 0);
        int iR = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8 && childAt != ((org.telegram.ui.ActionBar.n2) gyVar).actionBar) {
                if (childAt instanceof tu) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), (AndroidUtilities.dp(2.0f) + View.MeasureSpec.getSize(i11)) - ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight()), 1073741824));
                } else if (childAt instanceof fy) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    int iDp = AndroidUtilities.dp(2.0f) + size2;
                    if (gyVar.B3.c()) {
                        if (gyVar.f38608w) {
                            iDp = AndroidUtilities.dp(50.0f) + iDp;
                        }
                        if (gyVar.G) {
                            iDp = AndroidUtilities.dp(81.0f) + iDp;
                        }
                        iDp = AndroidUtilities.dp(48.0f) + iDp;
                    }
                    int i14 = iDp + gyVar.L;
                    if (gyVar.f38582q3 == null) {
                        childAt.setTranslationY(0.0f);
                    }
                    int i15 = gyVar.V3 ? (int) (i14 * 0.05f) : 0;
                    childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                    childAt.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), 1073741824));
                    childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                } else {
                    px pxVar = gyVar.f38619y0;
                    if (childAt == pxVar) {
                        pxVar.setTranslationY(gyVar.E0);
                        gyVar.f38619y0.f29753l0.setKeyboardHeight(iR);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), 1073741824);
                        gyVar.G3(true);
                        childAt.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                        AndroidUtilities.rectTmp2.set(0, (AndroidUtilities.dp(i12) + ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    } else {
                        rw rwVar = gyVar.f38615x1;
                        if (rwVar == null || !rwVar.u0(childAt)) {
                            if (childAt == gyVar.B3) {
                                int size3 = View.MeasureSpec.getSize(i11);
                                int i16 = gyVar.V3 ? (int) (size3 * 0.05f) : 0;
                                gyVar.B3.setTransitionPaddingBottom(i16);
                                childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size3 + i16), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            }
                        } else if (!AndroidUtilities.isInMultiwindow) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
            }
        }
        if (z10 != this.f44961y0) {
            post(new xx(this, 1));
            this.f44961y0 = z10;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        gy gyVar = this.A0;
        if (gyVar.f38543i3 && !gyVar.f38538h3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
