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
public final class u40 extends org.telegram.ui.Components.lw0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final q50 D0;
    public boolean f41801w0;
    public final RectF f41802x0;
    public int f41803y0;
    public boolean f41804z0;

    public u40(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = q50Var;
        this.f41801w0 = false;
        this.f41802x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        q50 q50Var = this.D0;
        u20 u20Var = q50Var.e;
        d30 d30Var = q50Var.f40425m2;
        w40 w40Var = q50Var.Q;
        h30 h30Var = q50Var.a2;
        if (q50Var.f40452s2) {
            if (view == w40Var) {
                int childCount = w40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = w40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == h30Var || view == u20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (q50.G3 || h30Var.f31517c != 1.0f || (view != q50Var.O && view != q50Var.f40401g0 && view != q50Var.N && view != q50Var.f40393e1 && view != q50Var.f40481z1 && view != q50Var.U0)) {
            if (q50Var.F2 && view == h30Var) {
                canvas.save();
                canvas.translate(d30Var.getX() + h30Var.getX(), d30Var.getY() + h30Var.getY());
                d30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != q50Var.C2 && view != q50Var.f40394e2 && view != q50Var.X2 && (!q50Var.f40422l2 || !q50Var.f40403g2 || (view != w40Var && view != u20Var && view != q50Var.f40384c0))) {
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
        q50 q50Var = this.D0;
        ImageReceiver imageReceiver = q50Var.Z;
        Drawable drawable = q50Var.f40397f0;
        h30 h30Var = q50Var.a2;
        float f10 = q50Var.f40477y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        q50Var.R1();
        if (h30Var.f31517c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f21280t0.setColor(q50Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f41802x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f21280t0);
            }
            org.telegram.ui.ActionBar.h6.f21280t0.setColor(Color.argb((int) (q50Var.O.getAlpha() * 255.0f), (int) (Color.red(q50Var.V1) * 0.8f), (int) (Color.green(q50Var.V1) * 0.8f), (int) (Color.blue(q50Var.V1) * 0.8f)));
            float statusBarHeight = q50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.h6.f21280t0);
            b40 b40Var = q50Var.f40480z0;
            if (b40Var != null) {
                org.telegram.ui.ActionBar.h6.f21280t0.setColor(b40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, q50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.h6.f21280t0);
            }
        }
        if (h30Var.f31517c != 0.0f) {
            org.telegram.ui.ActionBar.h6.f21280t0.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21053gg, false), (int) (h30Var.f31517c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f21280t0);
        }
        if (q50Var.s1() && LiteMode.isEnabled(512)) {
            if (h30Var.f31517c < 0.15d) {
                if (!q50Var.f40482z2) {
                    q50Var.f40482z2 = true;
                    q50Var.A1();
                }
            } else if (q50Var.f40482z2) {
                q50Var.f40482z2 = false;
                AndroidUtilities.cancelRunOnUIThread(q50Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q50 q50Var = this.D0;
        k30 k30Var = q50Var.C2;
        if (q50Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = q50Var.f40394e2.getX();
            float y10 = q50Var.f40394e2.getY();
            float x12 = q50Var.f40394e2.getX() + q50Var.f40394e2.getMeasuredWidth();
            float y11 = q50Var.f40394e2.getY() + q50Var.f40394e2.getMeasuredHeight();
            RectF rectF = this.f41802x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(k30Var.getX(), k30Var.getY(), k30Var.getX() + k30Var.getMeasuredWidth(), k30Var.getY() + k30Var.getMeasuredWidth() + q50Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                q50Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && q50Var.f40477y0 != 0.0f && motionEvent.getY() < q50Var.f40477y0 - AndroidUtilities.dp(37.0f) && q50Var.O.getAlpha() == 0.0f && !q50Var.f40399f2 && q50Var.f40480z0 == null && !q50Var.a2.f31515b) {
            q50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        q50 q50Var = this.D0;
        if (q50Var.X2 != null && i10 == 4) {
            q50Var.e1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        q50 q50Var = this.D0;
        View view = q50Var.K2;
        View view2 = q50Var.J2;
        u20 u20Var = q50Var.e;
        h30 h30Var = q50Var.a2;
        w40 w40Var = q50Var.Q;
        if (q50.G3 && this.A0 != q50Var.I2 && this.B0) {
            f7 = w40Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = q50Var.I2;
        h30Var.f31536s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        h30Var.f31536s = false;
        q50.K0(q50Var);
        this.B0 = true;
        if (z11 && w40Var.getLeft() != f7) {
            float left = f7 - w40Var.getLeft();
            w40Var.setTranslationX(left);
            u20Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = w40Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25021f;
            duration.setInterpolator(bsVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
            u20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(bsVar).start();
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
        int y3;
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
        q50 q50Var = this.D0;
        r30 r30Var = q50Var.G;
        a30 a30Var = q50Var.N;
        LinearLayout linearLayout = q50Var.f40481z1;
        m40 m40Var = q50Var.O;
        w50 w50Var = q50Var.f40434o2;
        org.telegram.ui.Components.a30 a30Var2 = q50Var.f40438p2;
        org.telegram.ui.Components.xz xzVar = q50Var.Y;
        org.telegram.ui.Components.voip.t2 t2Var = q50Var.f40466w;
        org.telegram.ui.ActionBar.j5 j5Var = q50Var.U;
        View view = q50Var.f40401g0;
        u20 u20Var = q50Var.e;
        View view2 = q50Var.K2;
        View view3 = q50Var.J2;
        ArrayList arrayList = q50Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = q50Var.W;
        p30 p30Var = q50Var.H;
        ArrayList arrayList2 = q50Var.Z1;
        org.telegram.ui.Components.jm0 jm0Var = q50Var.f40430n2;
        w40 w40Var = q50Var.Q;
        h30 h30Var = q50Var.a2;
        d30 d30Var = q50Var.f40425m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f41801w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        h30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !q50Var.s1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (q50.F3 != z10) {
            q50.F3 = z10;
            if (t2Var.getMeasuredWidth() == 0) {
                int i23 = t2Var.getLayoutParams().width;
            }
            q50.I0(q50Var);
            if (q50.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            xzVar.y1(i21);
            w40Var.a0();
            d30Var.a0();
            this.f41804z0 = true;
            TextView textView = q50Var.S;
            if (textView != null) {
                if (!q50.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (q50Var.r1() == z10 && q50Var.s1() && !h30Var.f31515b && !q50Var.f40376a1.visibleVideoParticipants.isEmpty()) {
                q50Var.f1(q50Var.f40376a1.visibleVideoParticipants.get(0));
                h30Var.e();
            }
        }
        if (q50.G3 != z11) {
            q50.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            jm0Var.setVisibility(i20);
            w40Var.a0();
            d30Var.a0();
            z12 = true;
            this.f41804z0 = true;
        } else {
            z12 = true;
        }
        if (this.f41804z0) {
            q50Var.P0(z12);
            q50Var.P.l();
            a30Var2.G(jm0Var, false);
            if (q50.G3) {
                w50Var.I(jm0Var, false);
            }
            if (q50.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            jm0Var.setVisibility(i16);
            if (q50.G3 && !h30Var.f31515b) {
                z13 = true;
            } else {
                z13 = false;
            }
            w50Var.H(jm0Var, z13, true);
            boolean z16 = q50.G3;
            if (z16 && !h30Var.f31515b) {
                z14 = false;
            } else {
                z14 = true;
            }
            q50Var.P2 = z14;
            if (!z16 && h30Var.f31515b) {
                z15 = true;
            } else {
                z15 = false;
            }
            a30Var2.F(d30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            d30Var.setVisibility(i17);
            if (!q50.G3 && h30Var.f31515b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            w40Var.setVisibility(i18);
            if (q50.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            xzVar.y1(i19);
            q50Var.O1(false, false);
            w40Var.a0();
            d30Var.a0();
            AndroidUtilities.updateVisibleRows(w40Var);
            this.f41804z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            h30Var.setIsTablet(q50.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (q50Var.s1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h30Var.getLayoutParams();
        if (q50.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q50Var.f40413j0[i26].getLayoutParams();
            if (q50.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (jm0Var != null) {
            ((FrameLayout.LayoutParams) jm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (p30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) p30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (q50Var.s1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w40Var.getLayoutParams();
        if (q50.G3) {
            if (q50Var.I2) {
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
            if (q50.F3) {
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
        if (q50.F3 && !q50.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (q50.G3) {
                if (q50Var.I2) {
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
            if (q50.G3) {
                if (q50Var.I2) {
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
        if (q50.F3) {
            d30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            d30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) u20Var.getLayoutParams();
        if (q50.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (q50Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (q50.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (q50.F3 && !q50.G3) {
            ((FrameLayout.LayoutParams) m40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) m40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) a30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) d30Var.getLayoutParams();
        if (q50.F3) {
            if (((s4.b0) d30Var.getLayoutManager()).f45905o != 1) {
                ((s4.b0) d30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) d30Var.getLayoutManager()).f45905o != 0) {
                ((s4.b0) d30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        r30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (p30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) p30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (q50.G3) {
            y3 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            y3 = org.telegram.messenger.g0.y(8.0f, i25 - max, 0);
        }
        if (w40Var.getPaddingTop() != y3 || w40Var.getPaddingBottom() != dp2) {
            w40Var.setPadding(i14, y3, i14, dp2);
        }
        o50 o50Var = q50Var.B1;
        if (o50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) o50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = q50.J0(q50Var);
            if (J0 != null) {
                int measuredHeight = ((u20Var.getMeasuredHeight() / 2) + u20Var.getTop()) - (q50Var.f40449s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + y3;
                layoutParams9.topMargin = i2.e.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        f50 f50Var = q50Var.U0;
        if (f50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) f50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = q50.J0(q50Var);
            if (J02 != null) {
                layoutParams10.height = J02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = J02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (j5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - y3)) / 2) + y3;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) q50Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(h30Var.f31515b, true);
        }
        this.f41801w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f41803y0) {
            this.f41803y0 = measuredHeight3;
            q50Var.e1(false);
        }
        q50Var.f40447r2.f31428f = getMeasuredWidth();
        q50Var.Z0();
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
        if (this.f41801w0) {
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
