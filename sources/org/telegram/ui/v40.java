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
public final class v40 extends org.telegram.ui.Components.hv0 {
    public boolean f43416s0;
    public final RectF f43417t0;
    public int f43418u0;
    public boolean f43419v0;
    public boolean f43420w0;
    public boolean f43421x0;
    public final HashMap f43422y0;
    public final r50 f43423z0;

    public v40(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f43423z0 = r50Var;
        this.f43416s0 = false;
        this.f43417t0 = new RectF();
        this.f43422y0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v40.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r50 r50Var = this.f43423z0;
        w20 w20Var = r50Var.f41884e;
        f30 f30Var = r50Var.f41904i2;
        x40 x40Var = r50Var.M;
        j30 j30Var = r50Var.W1;
        if (r50Var.f41927o2) {
            if (view == x40Var) {
                int childCount = x40Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = x40Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == j30Var || view == w20Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (r50.C3 || j30Var.f33798c != 1.0f || (view != r50Var.K && view != r50Var.f41877c0 && view != r50Var.J && view != r50Var.f41869a1 && view != r50Var.f41956v1 && view != r50Var.Q0)) {
            if (r50Var.B2 && view == j30Var) {
                canvas.save();
                canvas.translate(f30Var.getX() + j30Var.getX(), f30Var.getY() + j30Var.getY());
                f30Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != r50Var.f41972y2 && view != r50Var.a2 && view != r50Var.T2 && (!r50Var.f41900h2 || !r50Var.f41879c2 || (view != x40Var && view != w20Var && view != r50Var.Y))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43423z0.V.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43423z0.V.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f9;
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
        r50 r50Var = this.f43423z0;
        ImageReceiver imageReceiver = r50Var.V;
        Drawable drawable = r50Var.f41872b0;
        j30 j30Var = r50Var.W1;
        float f10 = r50Var.f41951u0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f9 = 1.0f - min;
        } else {
            f9 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        r50Var.Q1();
        if (j30Var.f33798c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f9 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23340t0.setColor(r50Var.R1);
                i16 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f43417t0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f9, AndroidUtilities.dp(12.0f) * f9, org.telegram.ui.ActionBar.g6.f23340t0);
            }
            org.telegram.ui.ActionBar.g6.f23340t0.setColor(Color.argb((int) (r50Var.K.getAlpha() * 255.0f), (int) (Color.red(r50Var.R1) * 0.8f), (int) (Color.green(r50Var.R1) * 0.8f), (int) (Color.blue(r50Var.R1) * 0.8f)));
            float statusBarHeight = r50Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.g6.f23340t0);
            d40 d40Var = r50Var.f41955v0;
            if (d40Var != null) {
                org.telegram.ui.ActionBar.g6.f23340t0.setColor(d40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, r50Var.getStatusBarHeight(), org.telegram.ui.ActionBar.g6.f23340t0);
            }
        }
        if (j30Var.f33798c != 0.0f) {
            org.telegram.ui.ActionBar.g6.f23340t0.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126gg, false), (int) (j30Var.f33798c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23340t0);
        }
        if (r50Var.r1() && LiteMode.isEnabled(512)) {
            if (j30Var.f33798c < 0.15d) {
                if (!r50Var.f41957v2) {
                    r50Var.f41957v2 = true;
                    r50Var.z1();
                }
            } else if (r50Var.f41957v2) {
                r50Var.f41957v2 = false;
                AndroidUtilities.cancelRunOnUIThread(r50Var.f41962w2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r50 r50Var = this.f43423z0;
        m30 m30Var = r50Var.f41972y2;
        if (r50Var.T2 != null && motionEvent.getAction() == 0) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            float x10 = r50Var.a2.getX();
            float y10 = r50Var.a2.getY();
            float x11 = r50Var.a2.getX() + r50Var.a2.getMeasuredWidth();
            float y11 = r50Var.a2.getY() + r50Var.a2.getMeasuredHeight();
            RectF rectF = this.f43417t0;
            rectF.set(x10, y10, x11, y11);
            boolean z10 = !rectF.contains(x4, y8);
            rectF.set(m30Var.getX(), m30Var.getY(), m30Var.getX() + m30Var.getMeasuredWidth(), m30Var.getY() + m30Var.getMeasuredWidth() + r50Var.T2.getMeasuredHeight());
            if (rectF.contains(x4, y8)) {
                z10 = false;
            }
            if (z10) {
                r50Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && r50Var.f41951u0 != 0.0f && motionEvent.getY() < r50Var.f41951u0 - AndroidUtilities.dp(37.0f) && r50Var.K.getAlpha() == 0.0f && !r50Var.f41874b2 && r50Var.f41955v0 == null && !r50Var.W1.f33796b) {
            r50Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        r50 r50Var = this.f43423z0;
        if (r50Var.T2 != null && i10 == 4) {
            r50Var.d1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f9;
        boolean z11;
        r50 r50Var = this.f43423z0;
        View view = r50Var.G2;
        View view2 = r50Var.F2;
        w20 w20Var = r50Var.f41884e;
        j30 j30Var = r50Var.W1;
        x40 x40Var = r50Var.M;
        if (r50.C3 && this.f43420w0 != r50Var.E2 && this.f43421x0) {
            f9 = x40Var.getX();
            z11 = true;
        } else {
            f9 = 0.0f;
            z11 = false;
        }
        this.f43420w0 = r50Var.E2;
        j30Var.f33818s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        j30Var.f33818s = false;
        r50.J0(r50Var);
        this.f43421x0 = true;
        if (z11 && x40Var.getLeft() != f9) {
            float left = f9 - x40Var.getLeft();
            x40Var.setTranslationX(left);
            w20Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = x40Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
            duration.setInterpolator(jrVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(jrVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(jrVar).start();
            w20Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(jrVar).start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int dp;
        float f9;
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
        r50 r50Var = this.f43423z0;
        t30 t30Var = r50Var.C;
        c30 c30Var = r50Var.J;
        LinearLayout linearLayout = r50Var.f41956v1;
        n40 n40Var = r50Var.K;
        x50 x50Var = r50Var.f41912k2;
        org.telegram.ui.Components.o20 o20Var = r50Var.f41915l2;
        org.telegram.ui.Components.jz jzVar = r50Var.U;
        org.telegram.ui.Components.voip.x2 x2Var = r50Var.f41959w;
        org.telegram.ui.ActionBar.h5 h5Var = r50Var.Q;
        View view = r50Var.f41877c0;
        w20 w20Var = r50Var.f41884e;
        View view2 = r50Var.G2;
        View view3 = r50Var.F2;
        ArrayList arrayList = r50Var.U1;
        org.telegram.ui.ActionBar.h5 h5Var2 = r50Var.S;
        r30 r30Var = r50Var.D;
        ArrayList arrayList2 = r50Var.V1;
        org.telegram.ui.Components.jl0 jl0Var = r50Var.f41908j2;
        x40 x40Var = r50Var.M;
        j30 j30Var = r50Var.W1;
        f30 f30Var = r50Var.f41904i2;
        int size = View.MeasureSpec.getSize(i11);
        this.f43416s0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        j30Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !r50Var.r1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (r50.B3 != z10) {
            r50.B3 = z10;
            if (x2Var.getMeasuredWidth() == 0) {
                int i23 = x2Var.getLayoutParams().width;
            }
            r50.H0(r50Var);
            if (r50.B3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            jzVar.y1(i21);
            x40Var.a0();
            f30Var.a0();
            this.f43419v0 = true;
            TextView textView = r50Var.O;
            if (textView != null) {
                if (!r50.B3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (r50Var.q1() == z10 && r50Var.r1() && !j30Var.f33796b && !r50Var.W0.visibleVideoParticipants.isEmpty()) {
                r50Var.e1(r50Var.W0.visibleVideoParticipants.get(0));
                j30Var.e();
            }
        }
        if (r50.C3 != z11) {
            r50.C3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            jl0Var.setVisibility(i20);
            x40Var.a0();
            f30Var.a0();
            z12 = true;
            this.f43419v0 = true;
        } else {
            z12 = true;
        }
        if (this.f43419v0) {
            r50Var.O0(z12);
            r50Var.L.l();
            o20Var.G(jl0Var, false);
            if (r50.C3) {
                x50Var.I(jl0Var, false);
            }
            if (r50.C3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            jl0Var.setVisibility(i16);
            if (r50.C3 && !j30Var.f33796b) {
                z13 = true;
            } else {
                z13 = false;
            }
            x50Var.H(jl0Var, z13, true);
            boolean z16 = r50.C3;
            if (z16 && !j30Var.f33796b) {
                z14 = false;
            } else {
                z14 = true;
            }
            r50Var.L2 = z14;
            if (!z16 && j30Var.f33796b) {
                z15 = true;
            } else {
                z15 = false;
            }
            o20Var.F(f30Var, z15);
            if (z15) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            f30Var.setVisibility(i17);
            if (!r50.C3 && j30Var.f33796b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            x40Var.setVisibility(i18);
            if (r50.B3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            jzVar.y1(i19);
            r50Var.N1(false, false);
            x40Var.a0();
            f30Var.a0();
            AndroidUtilities.updateVisibleRows(x40Var);
            this.f43419v0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            j30Var.setIsTablet(r50.C3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (r50Var.r1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j30Var.getLayoutParams();
        if (r50.C3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r50Var.f41890f0[i26].getLayoutParams();
            if (r50.C3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (jl0Var != null) {
            ((FrameLayout.LayoutParams) jl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (r50Var.r1()) {
            f9 = 40.0f;
        } else {
            f9 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f9);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x40Var.getLayoutParams();
        if (r50.C3) {
            if (r50Var.E2) {
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
            layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            dp2 = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (r50.B3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp2 = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp3;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int dp5 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp5;
                layoutParams3.rightMargin = dp5;
            }
        }
        int i27 = 81;
        if (r50.B3 && !r50.C3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (r50.C3) {
                if (r50Var.E2) {
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
            if (r50.C3) {
                if (r50Var.E2) {
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
        if (r50.B3) {
            f30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            f30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) w20Var.getLayoutParams();
        if (r50.C3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (r50Var.E2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (r50.B3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (r50.B3 && !r50.C3) {
            ((FrameLayout.LayoutParams) n40Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) n40Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) c30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) f30Var.getLayoutParams();
        if (r50.B3) {
            if (((f2.j0) f30Var.getLayoutManager()).f6362o != 1) {
                ((f2.j0) f30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.j0) f30Var.getLayoutManager()).f6362o != 0) {
                ((f2.j0) f30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        t30Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (r30Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) r30Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (r50.C3) {
            b10 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            b10 = org.telegram.messenger.x3.b(8.0f, i25 - max, 0);
        }
        if (x40Var.getPaddingTop() != b10 || x40Var.getPaddingBottom() != dp2) {
            x40Var.setPadding(i14, b10, i14, dp2);
        }
        p50 p50Var = r50Var.f41966x1;
        if (p50Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) p50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = r50.I0(r50Var);
            if (I0 != null) {
                int measuredHeight = ((w20Var.getMeasuredHeight() / 2) + w20Var.getTop()) - (r50Var.f41942s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = j7.l1.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        g50 g50Var = r50Var.Q0;
        if (g50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) g50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = r50.I0(r50Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (h5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) r50Var.R.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
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
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i28)).g(j30Var.f33796b, true);
        }
        this.f43416s0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f43418u0) {
            this.f43418u0 = measuredHeight3;
            r50Var.d1(false);
        }
        r50Var.f41923n2.f33720f = getMeasuredWidth();
        r50Var.Y0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f43423z0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f43416s0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f43423z0.Q1();
    }
}
