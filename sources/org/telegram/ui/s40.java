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
public final class s40 extends org.telegram.ui.Components.xu0 {
    public boolean f42554s0;
    public final RectF f42555t0;
    public int f42556u0;
    public boolean f42557v0;
    public boolean f42558w0;
    public boolean f42559x0;
    public final HashMap f42560y0;
    public final o50 f42561z0;

    public s40(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f42561z0 = o50Var;
        this.f42554s0 = false;
        this.f42555t0 = new RectF();
        this.f42560y0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        o50 o50Var = this.f42561z0;
        s20 s20Var = o50Var.f40897e;
        c30 c30Var = o50Var.f40917i2;
        u40 u40Var = o50Var.M;
        g30 g30Var = o50Var.W1;
        if (o50Var.f40940o2) {
            if (view == u40Var) {
                int childCount = u40Var.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = u40Var.getChildAt(i9);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == g30Var || view == s20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (o50.C3 || g30Var.f33600c != 1.0f || (view != o50Var.K && view != o50Var.f40889c0 && view != o50Var.J && view != o50Var.f40882a1 && view != o50Var.f40969v1 && view != o50Var.Q0)) {
            if (o50Var.B2 && view == g30Var) {
                canvas.save();
                canvas.translate(c30Var.getX() + g30Var.getX(), c30Var.getY() + g30Var.getY());
                c30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != o50Var.f40985y2 && view != o50Var.a2 && view != o50Var.T2 && (!o50Var.f40913h2 || !o50Var.f40891c2 || (view != u40Var && view != s20Var && view != o50Var.Y))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42561z0.V.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42561z0.V.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int dp = AndroidUtilities.dp(74.0f);
        o50 o50Var = this.f42561z0;
        ImageReceiver imageReceiver = o50Var.V;
        Drawable drawable = o50Var.f40884b0;
        g30 g30Var = o50Var.W1;
        float f11 = o50Var.f40964u0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i9 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
        int i21 = i9 + dp2;
        i10 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
        if (i10 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i19 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
            int dp3 = (dp - i19) - AndroidUtilities.dp(14.0f);
            i20 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i20) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f11 -= currentActionBarHeight;
            i21 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        o50Var.Q1();
        if (g30Var.f33600c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i21);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(o50Var.R1);
                i15 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                i18 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingTop;
                float dp4 = i18 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f42555t0;
                rectF.set(i15, i16 + paddingTop, measuredWidth - i17, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.f23279t0);
            }
            org.telegram.ui.ActionBar.f6.f23279t0.setColor(Color.argb((int) (o50Var.K.getAlpha() * 255.0f), (int) (Color.red(o50Var.R1) * 0.8f), (int) (Color.green(o50Var.R1) * 0.8f), (int) (Color.blue(o50Var.R1) * 0.8f)));
            float statusBarHeight = o50Var.getStatusBarHeight();
            i11 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i12 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
            canvas.drawRect(i11, 0.0f, measuredWidth2 - i12, statusBarHeight, org.telegram.ui.ActionBar.f6.f23279t0);
            a40 a40Var = o50Var.f40968v0;
            if (a40Var != null) {
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(a40Var.getBackgroundColor());
                i13 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                float f12 = i13;
                int measuredWidth3 = getMeasuredWidth();
                i14 = ((org.telegram.ui.ActionBar.f3) o50Var).backgroundPaddingLeft;
                canvas.drawRect(f12, 0.0f, measuredWidth3 - i14, o50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.f6.f23279t0);
            }
        }
        if (g30Var.f33600c != 0.0f) {
            org.telegram.ui.ActionBar.f6.f23279t0.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23065gg, false), (int) (g30Var.f33600c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23279t0);
        }
        if (o50Var.r1() && LiteMode.isEnabled(512)) {
            if (g30Var.f33600c < 0.15d) {
                if (!o50Var.f40970v2) {
                    o50Var.f40970v2 = true;
                    o50Var.z1();
                }
            } else if (o50Var.f40970v2) {
                o50Var.f40970v2 = false;
                AndroidUtilities.cancelRunOnUIThread(o50Var.f40975w2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o50 o50Var = this.f42561z0;
        j30 j30Var = o50Var.f40985y2;
        if (o50Var.T2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = o50Var.a2.getX();
            float y11 = o50Var.a2.getY();
            float x12 = o50Var.a2.getX() + o50Var.a2.getMeasuredWidth();
            float y12 = o50Var.a2.getY() + o50Var.a2.getMeasuredHeight();
            RectF rectF = this.f42555t0;
            rectF.set(x11, y11, x12, y12);
            boolean z10 = !rectF.contains(x10, y10);
            rectF.set(j30Var.getX(), j30Var.getY(), j30Var.getX() + j30Var.getMeasuredWidth(), j30Var.getY() + j30Var.getMeasuredWidth() + o50Var.T2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z10 = false;
            }
            if (z10) {
                o50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && o50Var.f40964u0 != 0.0f && motionEvent.getY() < o50Var.f40964u0 - AndroidUtilities.dp(37.0f) && o50Var.K.getAlpha() == 0.0f && !o50Var.f40886b2 && o50Var.f40968v0 == null && !o50Var.W1.f33598b) {
            o50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        o50 o50Var = this.f42561z0;
        if (o50Var.T2 != null && i9 == 4) {
            o50Var.d1(true);
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float f10;
        boolean z11;
        o50 o50Var = this.f42561z0;
        View view = o50Var.G2;
        View view2 = o50Var.F2;
        s20 s20Var = o50Var.f40897e;
        g30 g30Var = o50Var.W1;
        u40 u40Var = o50Var.M;
        if (o50.C3 && this.f42558w0 != o50Var.E2 && this.f42559x0) {
            f10 = u40Var.getX();
            z11 = true;
        } else {
            f10 = 0.0f;
            z11 = false;
        }
        this.f42558w0 = o50Var.E2;
        g30Var.f33620s = true;
        super.onLayout(z10, i9, i10, i11, i12);
        g30Var.f33620s = false;
        o50.I0(o50Var);
        this.f42559x0 = true;
        if (z11 && u40Var.getLeft() != f10) {
            float left = f10 - u40Var.getLeft();
            u40Var.setTranslationX(left);
            s20Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = u40Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
            duration.setInterpolator(grVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
            s20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(grVar).start();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int dp;
        float f10;
        float f11;
        int dp2;
        float f12;
        int i11;
        int i12;
        int i13;
        int z13;
        int i14;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        o50 o50Var = this.f42561z0;
        q30 q30Var = o50Var.C;
        z20 z20Var = o50Var.J;
        LinearLayout linearLayout = o50Var.f40969v1;
        k40 k40Var = o50Var.K;
        u50 u50Var = o50Var.f40925k2;
        org.telegram.ui.Components.c20 c20Var = o50Var.f40928l2;
        org.telegram.ui.Components.az azVar = o50Var.U;
        org.telegram.ui.Components.voip.u2 u2Var = o50Var.f40972w;
        org.telegram.ui.ActionBar.h5 h5Var = o50Var.Q;
        View view = o50Var.f40889c0;
        s20 s20Var = o50Var.f40897e;
        View view2 = o50Var.G2;
        View view3 = o50Var.F2;
        ArrayList arrayList = o50Var.U1;
        org.telegram.ui.ActionBar.h5 h5Var2 = o50Var.S;
        o30 o30Var = o50Var.D;
        ArrayList arrayList2 = o50Var.V1;
        org.telegram.ui.Components.wk0 wk0Var = o50Var.f40921j2;
        u40 u40Var = o50Var.M;
        g30 g30Var = o50Var.W1;
        c30 c30Var = o50Var.f40917i2;
        int size = View.MeasureSpec.getSize(i10);
        this.f42554s0 = true;
        if (View.MeasureSpec.getSize(i9) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i9);
        g30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i9) > size && !o50Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (o50.B3 != z10) {
            o50.B3 = z10;
            if (u2Var.getMeasuredWidth() == 0) {
                int i22 = u2Var.getLayoutParams().width;
            }
            o50.G0(o50Var);
            if (o50.B3) {
                i20 = 6;
            } else {
                i20 = 2;
            }
            azVar.y1(i20);
            u40Var.a0();
            c30Var.a0();
            this.f42557v0 = true;
            TextView textView = o50Var.O;
            if (textView != null) {
                if (!o50.B3) {
                    i21 = 0;
                } else {
                    i21 = 8;
                }
                textView.setVisibility(i21);
            }
            if (o50Var.q1() == z10 && o50Var.r1() && !g30Var.f33598b && !o50Var.W0.visibleVideoParticipants.isEmpty()) {
                o50Var.e1(o50Var.W0.visibleVideoParticipants.get(0));
                g30Var.e();
            }
        }
        if (o50.C3 != z11) {
            o50.C3 = z11;
            if (z11) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            wk0Var.setVisibility(i19);
            u40Var.a0();
            c30Var.a0();
            z12 = true;
            this.f42557v0 = true;
        } else {
            z12 = true;
        }
        if (this.f42557v0) {
            o50Var.O0(z12);
            o50Var.L.l();
            c20Var.G(wk0Var, false);
            if (o50.C3) {
                u50Var.I(wk0Var, false);
            }
            if (o50.C3) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            wk0Var.setVisibility(i15);
            if (o50.C3 && !g30Var.f33598b) {
                z14 = true;
            } else {
                z14 = false;
            }
            u50Var.H(wk0Var, z14, true);
            boolean z17 = o50.C3;
            if (z17 && !g30Var.f33598b) {
                z15 = false;
            } else {
                z15 = true;
            }
            o50Var.L2 = z15;
            if (!z17 && g30Var.f33598b) {
                z16 = true;
            } else {
                z16 = false;
            }
            c20Var.F(c30Var, z16);
            if (z16) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            c30Var.setVisibility(i16);
            if (!o50.C3 && g30Var.f33598b) {
                i17 = 8;
            } else {
                i17 = 0;
            }
            u40Var.setVisibility(i17);
            if (o50.B3) {
                i18 = 6;
            } else {
                i18 = 2;
            }
            azVar.y1(i18);
            o50Var.N1(false, false);
            u40Var.a0();
            c30Var.a0();
            AndroidUtilities.updateVisibleRows(u40Var);
            this.f42557v0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            g30Var.setIsTablet(o50.C3);
            for (int i23 = 0; i23 < arrayList2.size(); i23++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i23)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (o50Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i24 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g30Var.getLayoutParams();
        if (o50.C3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i25 = 0; i25 < 2; i25++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o50Var.f40903f0[i25].getLayoutParams();
            if (o50.C3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (wk0Var != null) {
            ((FrameLayout.LayoutParams) wk0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (o30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (o50Var.r1()) {
            f10 = 40.0f;
        } else {
            f10 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) u40Var.getLayoutParams();
        if (o50.C3) {
            if (o50Var.E2) {
                i14 = 5;
            } else {
                i14 = 1;
            }
            layoutParams3.gravity = i14;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp4;
            layoutParams3.rightMargin = dp4;
            layoutParams3.bottomMargin = dp3;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp2 = AndroidUtilities.dp(60.0f);
            f11 = 90.0f;
        } else {
            f11 = 90.0f;
            if (o50.B3) {
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
        int i26 = 81;
        if (o50.B3 && !o50.C3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f12 = 320.0f;
        } else {
            f12 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (o50.C3) {
                if (o50Var.E2) {
                    i12 = 85;
                } else {
                    i12 = 81;
                }
                layoutParams4.gravity = i12;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp3;
            if (o50.C3) {
                if (o50Var.E2) {
                    i11 = 85;
                } else {
                    i11 = 81;
                }
                layoutParams5.gravity = i11;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (o50.B3) {
            c30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            c30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) s20Var.getLayoutParams();
        if (o50.C3) {
            layoutParams6.width = AndroidUtilities.dp(f12);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (o50Var.E2) {
                i26 = 85;
            }
            layoutParams6.gravity = i26;
            layoutParams6.rightMargin = 0;
        } else if (o50.B3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (o50.B3 && !o50.C3) {
            ((FrameLayout.LayoutParams) k40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) z20Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f11);
        } else {
            ((FrameLayout.LayoutParams) k40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) z20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) c30Var.getLayoutParams();
        if (o50.B3) {
            if (((f2.m0) c30Var.getLayoutManager()).f5432o != 1) {
                ((f2.m0) c30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.m0) c30Var.getLayoutManager()).f5432o != 0) {
                ((f2.m0) c30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        q30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) q30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (o30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i24 / 5) * 3);
        if (o50.C3) {
            z13 = 0;
            i13 = 0;
        } else {
            i13 = 0;
            z13 = org.telegram.messenger.l0.z(8.0f, i24 - max, 0);
        }
        if (u40Var.getPaddingTop() != z13 || u40Var.getPaddingBottom() != dp2) {
            u40Var.setPadding(i13, z13, i13, dp2);
        }
        m50 m50Var = o50Var.f40979x1;
        if (m50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) m50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l H0 = o50.H0(o50Var);
            if (H0 != null) {
                int measuredHeight = ((s20Var.getMeasuredHeight() / 2) + s20Var.getTop()) - (o50Var.f40955s.getMeasuredHeight() / 2);
                int measuredHeight2 = H0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z13;
                layoutParams9.topMargin = j3.r0.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        d50 d50Var = o50Var.Q0;
        if (d50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) d50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l H02 = o50.H0(o50Var);
            if (H02 != null) {
                layoutParams10.height = H02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = H02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (h5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i24 - z13)) / 2) + z13;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) o50Var.R.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    h5Var.setVisibility(0);
                    h5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp7;
                }
            }
            h5Var.setVisibility(4);
            h5Var2.setVisibility(4);
            layoutParams13.topMargin = dp7 - AndroidUtilities.dp(20.0f);
        }
        for (int i27 = 0; i27 < arrayList.size(); i27++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i27)).g(g30Var.f33598b, true);
        }
        this.f42554s0 = false;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f42556u0) {
            this.f42556u0 = measuredHeight3;
            o50Var.d1(false);
        }
        o50Var.f40936n2.f33541f = getMeasuredWidth();
        o50Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f42561z0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f42554s0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f42561z0.Q1();
    }
}
