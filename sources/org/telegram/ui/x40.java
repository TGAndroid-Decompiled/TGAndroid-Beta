package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
public final class x40 extends org.telegram.ui.Components.nw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final u50 D0;
    public boolean f43466w0;
    public final RectF f43467x0;
    public int f43468y0;
    public boolean f43469z0;

    public x40(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = u50Var;
        this.f43466w0 = false;
        this.f43467x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u50 u50Var = this.D0;
        x20 x20Var = u50Var.e;
        g30 g30Var = u50Var.f42266m2;
        z40 z40Var = u50Var.Q;
        k30 k30Var = u50Var.a2;
        if (u50Var.f42293s2) {
            if (view == z40Var) {
                int childCount = z40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = z40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == k30Var || view == x20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (u50.G3 || k30Var.f31672c != 1.0f || (view != u50Var.O && view != u50Var.f42242g0 && view != u50Var.N && view != u50Var.f42234e1 && view != u50Var.f42322z1 && view != u50Var.U0)) {
            if (u50Var.F2 && view == k30Var) {
                canvas.save();
                canvas.translate(g30Var.getX() + k30Var.getX(), g30Var.getY() + k30Var.getY());
                g30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != u50Var.C2 && view != u50Var.f42235e2 && view != u50Var.X2 && (!u50Var.f42263l2 || !u50Var.f42244g2 || (view != z40Var && view != x20Var && view != u50Var.f42225c0))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0.Z.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int dp = AndroidUtilities.dp(74.0f);
        u50 u50Var = this.D0;
        ImageReceiver imageReceiver = u50Var.Z;
        Drawable drawable = u50Var.f42238f0;
        k30 k30Var = u50Var.a2;
        float f10 = u50Var.f42318y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        u50Var.R1();
        if (k30Var.f31672c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f21474t0.setColor(u50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f43467x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.k6.f21474t0);
            }
            org.telegram.ui.ActionBar.k6.f21474t0.setColor(Color.argb((int) (u50Var.O.getAlpha() * 255.0f), (int) (Color.red(u50Var.V1) * 0.8f), (int) (Color.green(u50Var.V1) * 0.8f), (int) (Color.blue(u50Var.V1) * 0.8f)));
            float statusBarHeight = u50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.k6.f21474t0);
            e40 e40Var = u50Var.f42321z0;
            if (e40Var != null) {
                org.telegram.ui.ActionBar.k6.f21474t0.setColor(e40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, u50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.k6.f21474t0);
            }
        }
        if (k30Var.f31672c != 0.0f) {
            org.telegram.ui.ActionBar.k6.f21474t0.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21247gg, false), (int) (k30Var.f31672c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21474t0);
        }
        if (u50Var.r1() && LiteMode.isEnabled(512)) {
            if (k30Var.f31672c < 0.15d) {
                if (!u50Var.f42323z2) {
                    u50Var.f42323z2 = true;
                    u50Var.z1();
                }
            } else if (u50Var.f42323z2) {
                u50Var.f42323z2 = false;
                AndroidUtilities.cancelRunOnUIThread(u50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        u50 u50Var = this.D0;
        n30 n30Var = u50Var.C2;
        if (u50Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = u50Var.f42235e2.getX();
            float y10 = u50Var.f42235e2.getY();
            float x12 = u50Var.f42235e2.getX() + u50Var.f42235e2.getMeasuredWidth();
            float y11 = u50Var.f42235e2.getY() + u50Var.f42235e2.getMeasuredHeight();
            RectF rectF = this.f43467x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(n30Var.getX(), n30Var.getY(), n30Var.getX() + n30Var.getMeasuredWidth(), n30Var.getY() + n30Var.getMeasuredWidth() + u50Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                u50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && u50Var.f42318y0 != 0.0f && motionEvent.getY() < u50Var.f42318y0 - AndroidUtilities.dp(37.0f) && u50Var.O.getAlpha() == 0.0f && !u50Var.f42240f2 && u50Var.f42321z0 == null && !u50Var.a2.f31670b) {
            u50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        u50 u50Var = this.D0;
        if (u50Var.X2 != null && i10 == 4) {
            u50Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        u50 u50Var = this.D0;
        View view = u50Var.K2;
        View view2 = u50Var.J2;
        x20 x20Var = u50Var.e;
        k30 k30Var = u50Var.a2;
        z40 z40Var = u50Var.Q;
        if (u50.G3 && this.A0 != u50Var.I2 && this.B0) {
            f7 = z40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = u50Var.I2;
        k30Var.f31691s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        k30Var.f31691s = false;
        u50.J0(u50Var);
        this.B0 = true;
        if (z11 && z40Var.getLeft() != f7) {
            float left = f7 - z40Var.getLeft();
            z40Var.setTranslationX(left);
            x20Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = z40Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
            duration.setInterpolator(zrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(zrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(zrVar).start();
            x20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(zrVar).start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int dp;
        float f7;
        float f10;
        int dp2;
        float f11;
        int i12;
        int i13;
        int i14;
        int b10;
        int i15;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        u50 u50Var = this.D0;
        u30 u30Var = u50Var.G;
        d30 d30Var = u50Var.N;
        LinearLayout linearLayout = u50Var.f42322z1;
        p40 p40Var = u50Var.O;
        a60 a60Var = u50Var.f42275o2;
        org.telegram.ui.Components.y20 y20Var = u50Var.f42279p2;
        org.telegram.ui.Components.vz vzVar = u50Var.Y;
        org.telegram.ui.Components.voip.t2 t2Var = u50Var.f42307w;
        org.telegram.ui.ActionBar.n5 n5Var = u50Var.U;
        View view = u50Var.f42242g0;
        x20 x20Var = u50Var.e;
        View view2 = u50Var.K2;
        View view3 = u50Var.J2;
        ArrayList arrayList = u50Var.Y1;
        org.telegram.ui.ActionBar.n5 n5Var2 = u50Var.W;
        s30 s30Var = u50Var.H;
        ArrayList arrayList2 = u50Var.Z1;
        org.telegram.ui.Components.lm0 lm0Var = u50Var.f42271n2;
        z40 z40Var = u50Var.Q;
        k30 k30Var = u50Var.a2;
        g30 g30Var = u50Var.f42266m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f43466w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        k30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !u50Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (u50.F3 != z10) {
            u50.F3 = z10;
            if (t2Var.getMeasuredWidth() == 0) {
                int i23 = t2Var.getLayoutParams().width;
            }
            u50.H0(u50Var);
            if (u50.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            vzVar.y1(i21);
            z40Var.a0();
            g30Var.a0();
            this.f43469z0 = true;
            TextView textView = u50Var.S;
            if (textView != null) {
                if (!u50.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (u50Var.q1() == z10 && u50Var.r1() && !k30Var.f31670b && !u50Var.f42217a1.visibleVideoParticipants.isEmpty()) {
                u50Var.e1(u50Var.f42217a1.visibleVideoParticipants.get(0));
                k30Var.e();
            }
        }
        if (u50.G3 != z11) {
            u50.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            lm0Var.setVisibility(i20);
            z40Var.a0();
            g30Var.a0();
            z12 = true;
            this.f43469z0 = true;
        } else {
            z12 = true;
        }
        if (this.f43469z0) {
            u50Var.O0(z12);
            u50Var.P.l();
            y20Var.G(lm0Var, false);
            if (u50.G3) {
                a60Var.I(lm0Var, false);
            }
            if (u50.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            lm0Var.setVisibility(i16);
            if (u50.G3 && !k30Var.f31670b) {
                z13 = true;
            } else {
                z13 = false;
            }
            a60Var.H(lm0Var, z13, true);
            boolean z16 = u50.G3;
            if (z16 && !k30Var.f31670b) {
                z14 = false;
            } else {
                z14 = true;
            }
            u50Var.P2 = z14;
            if (!z16 && k30Var.f31670b) {
                z15 = true;
            } else {
                z15 = false;
            }
            y20Var.F(g30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            g30Var.setVisibility(i17);
            if (!u50.G3 && k30Var.f31670b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            z40Var.setVisibility(i18);
            if (u50.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            vzVar.y1(i19);
            u50Var.O1(false, false);
            z40Var.a0();
            g30Var.a0();
            AndroidUtilities.updateVisibleRows(z40Var);
            this.f43469z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            k30Var.setIsTablet(u50.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (u50Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (u50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u50Var.f42254j0[i26].getLayoutParams();
            if (u50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (lm0Var != null) {
            ((FrameLayout.LayoutParams) lm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (s30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) s30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (u50Var.r1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) z40Var.getLayoutParams();
        if (u50.G3) {
            if (u50Var.I2) {
                i15 = 5;
            } else {
                i15 = 1;
            }
            layoutParams3.gravity = i15;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp4;
            layoutParams3.rightMargin = dp4;
            layoutParams3.bottomMargin = dp3;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp2 = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (u50.F3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp2 = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp3;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp5 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp5;
                layoutParams3.rightMargin = dp5;
            }
        }
        int i27 = 81;
        if (u50.F3 && !u50.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (u50.G3) {
                if (u50Var.I2) {
                    i13 = 85;
                } else {
                    i13 = 81;
                }
                layoutParams4.gravity = i13;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp3;
            if (u50.G3) {
                if (u50Var.I2) {
                    i12 = 85;
                } else {
                    i12 = 81;
                }
                layoutParams5.gravity = i12;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (u50.F3) {
            g30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            g30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) x20Var.getLayoutParams();
        if (u50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (u50Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (u50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (u50.F3 && !u50.G3) {
            ((FrameLayout.LayoutParams) p40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) p40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) d30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) g30Var.getLayoutParams();
        if (u50.F3) {
            if (((s4.b0) g30Var.getLayoutManager()).f46330o != 1) {
                ((s4.b0) g30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) g30Var.getLayoutManager()).f46330o != 0) {
                ((s4.b0) g30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        u30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) u30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (s30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) s30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (u50.G3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.v0.b(8.0f, i25 - max, 0);
        }
        if (z40Var.getPaddingTop() != b10 || z40Var.getPaddingBottom() != dp2) {
            z40Var.setPadding(i14, b10, i14, dp2);
        }
        s50 s50Var = u50Var.B1;
        if (s50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) s50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = u50.I0(u50Var);
            if (I0 != null) {
                int measuredHeight = ((x20Var.getMeasuredHeight() / 2) + x20Var.getTop()) - (u50Var.f42290s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i2.o1.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        j50 j50Var = u50Var.U0;
        if (j50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) j50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = u50.I0(u50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (n5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) n5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) u50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    n5Var.setVisibility(0);
                    n5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            n5Var.setVisibility(4);
            n5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(k30Var.f31670b, true);
        }
        this.f43466w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f43468y0) {
            this.f43468y0 = measuredHeight3;
            u50Var.d1(false);
        }
        u50Var.f42288r2.f31583f = getMeasuredWidth();
        u50Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.D0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f43466w0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.D0.R1();
    }
}
