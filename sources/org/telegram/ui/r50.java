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
public final class r50 extends org.telegram.ui.Components.ow0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final n60 D0;
    public boolean f39592w0;
    public final RectF f39593x0;
    public int f39594y0;
    public boolean f39595z0;

    public r50(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = n60Var;
        this.f39592w0 = false;
        this.f39593x0 = new RectF();
        this.C0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        n60 n60Var = this.D0;
        r30 r30Var = n60Var.e;
        a40 a40Var = n60Var.f38491m2;
        t50 t50Var = n60Var.Q;
        e40 e40Var = n60Var.a2;
        if (n60Var.f38518s2) {
            if (view == t50Var) {
                int childCount = t50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = t50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == e40Var || view == r30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (n60.G3 || e40Var.f30283c != 1.0f || (view != n60Var.O && view != n60Var.f38467g0 && view != n60Var.N && view != n60Var.f38459e1 && view != n60Var.f38547z1 && view != n60Var.U0)) {
            if (n60Var.F2 && view == e40Var) {
                canvas.save();
                canvas.translate(a40Var.getX() + e40Var.getX(), a40Var.getY() + e40Var.getY());
                a40Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != n60Var.C2 && view != n60Var.f38460e2 && view != n60Var.X2 && (!n60Var.f38488l2 || !n60Var.f38469g2 || (view != t50Var && view != r30Var && view != n60Var.f38450c0))) {
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
        n60 n60Var = this.D0;
        ImageReceiver imageReceiver = n60Var.Z;
        Drawable drawable = n60Var.f38463f0;
        e40 e40Var = n60Var.a2;
        float f10 = n60Var.f38543y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
            int dp3 = (dp - i20) - AndroidUtilities.dp(14.0f);
            i21 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / dp3);
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        n60Var.R1();
        if (e40Var.f30283c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f20191t0.setColor(n60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
                float dp4 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.f39593x0;
                rectF.set(i16, i17 + paddingTop, measuredWidth - i18, dp4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.g6.f20191t0);
            }
            org.telegram.ui.ActionBar.g6.f20191t0.setColor(Color.argb((int) (n60Var.O.getAlpha() * 255.0f), (int) (Color.red(n60Var.V1) * 0.8f), (int) (Color.green(n60Var.V1) * 0.8f), (int) (Color.blue(n60Var.V1) * 0.8f)));
            float statusBarHeight = n60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.g6.f20191t0);
            y40 y40Var = n60Var.f38546z0;
            if (y40Var != null) {
                org.telegram.ui.ActionBar.g6.f20191t0.setColor(y40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth3 - i15, n60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.g6.f20191t0);
            }
        }
        if (e40Var.f30283c != 0.0f) {
            org.telegram.ui.ActionBar.g6.f20191t0.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19964gg, false), (int) (e40Var.f30283c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f20191t0);
        }
        if (n60Var.s1() && LiteMode.isEnabled(512)) {
            if (e40Var.f30283c < 0.15d) {
                if (!n60Var.f38548z2) {
                    n60Var.f38548z2 = true;
                    n60Var.A1();
                }
            } else if (n60Var.f38548z2) {
                n60Var.f38548z2 = false;
                AndroidUtilities.cancelRunOnUIThread(n60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n60 n60Var = this.D0;
        h40 h40Var = n60Var.C2;
        if (n60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = n60Var.f38460e2.getX();
            float y10 = n60Var.f38460e2.getY();
            float x12 = n60Var.f38460e2.getX() + n60Var.f38460e2.getMeasuredWidth();
            float y11 = n60Var.f38460e2.getY() + n60Var.f38460e2.getMeasuredHeight();
            RectF rectF = this.f39593x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(h40Var.getX(), h40Var.getY(), h40Var.getX() + h40Var.getMeasuredWidth(), h40Var.getY() + h40Var.getMeasuredWidth() + n60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                n60Var.e1(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && n60Var.f38543y0 != 0.0f && motionEvent.getY() < n60Var.f38543y0 - AndroidUtilities.dp(37.0f) && n60Var.O.getAlpha() == 0.0f && !n60Var.f38465f2 && n60Var.f38546z0 == null && !n60Var.a2.f30281b) {
            n60Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        n60 n60Var = this.D0;
        if (n60Var.X2 != null && i10 == 4) {
            n60Var.e1(true);
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        float f7;
        n60 n60Var = this.D0;
        View view = n60Var.K2;
        View view2 = n60Var.J2;
        r30 r30Var = n60Var.e;
        e40 e40Var = n60Var.a2;
        t50 t50Var = n60Var.Q;
        if (n60.G3 && this.A0 != n60Var.I2 && this.B0) {
            f7 = t50Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f7 = 0.0f;
        }
        this.A0 = n60Var.I2;
        e40Var.f30302s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        e40Var.f30302s = false;
        n60.K0(n60Var);
        this.B0 = true;
        if (z11 && t50Var.getLeft() != f7) {
            float left = f7 - t50Var.getLeft();
            t50Var.setTranslationX(left);
            r30Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = t50Var.animate().translationX(0.0f).setDuration(350L);
            org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
            duration.setInterpolator(esVar).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(esVar).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(esVar).start();
            r30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(esVar).start();
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
        int z13;
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        boolean z16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        n60 n60Var = this.D0;
        o40 o40Var = n60Var.G;
        x30 x30Var = n60Var.N;
        LinearLayout linearLayout = n60Var.f38547z1;
        j50 j50Var = n60Var.O;
        s60 s60Var = n60Var.f38500o2;
        org.telegram.ui.Components.f30 f30Var = n60Var.f38504p2;
        org.telegram.ui.Components.a00 a00Var = n60Var.Y;
        org.telegram.ui.Components.voip.u2 u2Var = n60Var.f38532w;
        org.telegram.ui.ActionBar.h5 h5Var = n60Var.U;
        View view = n60Var.f38467g0;
        r30 r30Var = n60Var.e;
        View view2 = n60Var.K2;
        View view3 = n60Var.J2;
        ArrayList arrayList = n60Var.Y1;
        org.telegram.ui.ActionBar.h5 h5Var2 = n60Var.W;
        m40 m40Var = n60Var.H;
        ArrayList arrayList2 = n60Var.Z1;
        org.telegram.ui.Components.mm0 mm0Var = n60Var.f38496n2;
        t50 t50Var = n60Var.Q;
        e40 e40Var = n60Var.a2;
        a40 a40Var = n60Var.f38491m2;
        int size = View.MeasureSpec.getSize(i11);
        this.f39592w0 = true;
        if (View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet()) {
            z10 = true;
        } else {
            z10 = false;
        }
        View.MeasureSpec.getSize(i10);
        e40Var.getClass();
        if (AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !n60Var.s1()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (n60.F3 != z10) {
            n60.F3 = z10;
            if (u2Var.getMeasuredWidth() == 0) {
                int i23 = u2Var.getLayoutParams().width;
            }
            n60.I0(n60Var);
            if (n60.F3) {
                i21 = 6;
            } else {
                i21 = 2;
            }
            a00Var.y1(i21);
            t50Var.a0();
            a40Var.a0();
            this.f39595z0 = true;
            TextView textView = n60Var.S;
            if (textView != null) {
                if (!n60.F3) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                textView.setVisibility(i22);
            }
            if (n60Var.r1() == z10 && n60Var.s1() && !e40Var.f30281b && !n60Var.f38442a1.visibleVideoParticipants.isEmpty()) {
                n60Var.f1(n60Var.f38442a1.visibleVideoParticipants.get(0));
                e40Var.e();
            }
        }
        if (n60.G3 != z11) {
            n60.G3 = z11;
            if (z11) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            mm0Var.setVisibility(i20);
            t50Var.a0();
            a40Var.a0();
            z12 = true;
            this.f39595z0 = true;
        } else {
            z12 = true;
        }
        if (this.f39595z0) {
            n60Var.P0(z12);
            n60Var.P.l();
            f30Var.G(mm0Var, false);
            if (n60.G3) {
                s60Var.I(mm0Var, false);
            }
            if (n60.G3) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            mm0Var.setVisibility(i16);
            if (n60.G3 && !e40Var.f30281b) {
                z14 = true;
            } else {
                z14 = false;
            }
            s60Var.H(mm0Var, z14, true);
            boolean z17 = n60.G3;
            if (z17 && !e40Var.f30281b) {
                z15 = false;
            } else {
                z15 = true;
            }
            n60Var.P2 = z15;
            if (!z17 && e40Var.f30281b) {
                z16 = true;
            } else {
                z16 = false;
            }
            f30Var.F(a40Var, z16);
            if (z16) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            a40Var.setVisibility(i17);
            if (!n60.G3 && e40Var.f30281b) {
                i18 = 8;
            } else {
                i18 = 0;
            }
            t50Var.setVisibility(i18);
            if (n60.F3) {
                i19 = 6;
            } else {
                i19 = 2;
            }
            a00Var.y1(i19);
            n60Var.O1(false, false);
            t50Var.a0();
            a40Var.a0();
            AndroidUtilities.updateVisibleRows(t50Var);
            this.f39595z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            e40Var.setIsTablet(n60.G3);
            for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i24)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (n60Var.s1()) {
            dp = AndroidUtilities.dp(72.0f);
        } else {
            dp = AndroidUtilities.dp(245.0f);
        }
        int i25 = paddingTop - dp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e40Var.getLayoutParams();
        if (n60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i26 = 0; i26 < 2; i26++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) n60Var.f38479j0[i26].getLayoutParams();
            if (n60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (mm0Var != null) {
            ((FrameLayout.LayoutParams) mm0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (m40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (n60Var.s1()) {
            f7 = 40.0f;
        } else {
            f7 = 90.0f;
        }
        int dp3 = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t50Var.getLayoutParams();
        if (n60.G3) {
            if (n60Var.I2) {
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
            if (n60.F3) {
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
        if (n60.F3 && !n60.G3) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        } else {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp3;
            if (n60.G3) {
                if (n60Var.I2) {
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
            if (n60.G3) {
                if (n60Var.I2) {
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
        if (n60.F3) {
            a40Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            a40Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) r30Var.getLayoutParams();
        if (n60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            if (n60Var.I2) {
                i27 = 85;
            }
            layoutParams6.gravity = i27;
            layoutParams6.rightMargin = 0;
        } else if (n60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (n60.F3 && !n60.G3) {
            ((FrameLayout.LayoutParams) j50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) j50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) x30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
        if (n60.F3) {
            if (((s4.b0) a40Var.getLayoutManager()).f44826o != 1) {
                ((s4.b0) a40Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.b0) a40Var.getLayoutManager()).f44826o != 0) {
                ((s4.b0) a40Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        o40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) o40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (m40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (i25 / 5) * 3);
        if (n60.G3) {
            z13 = 0;
            i14 = 0;
        } else {
            i14 = 0;
            z13 = org.telegram.messenger.q.z(8.0f, i25 - max, 0);
        }
        if (t50Var.getPaddingTop() != z13 || t50Var.getPaddingBottom() != dp2) {
            t50Var.setPadding(i14, z13, i14, dp2);
        }
        l60 l60Var = n60Var.B1;
        if (l60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) l60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J0 = n60.J0(n60Var);
            if (J0 != null) {
                int measuredHeight = ((r30Var.getMeasuredHeight() / 2) + r30Var.getTop()) - (n60Var.f38515s.getMeasuredHeight() / 2);
                int measuredHeight2 = J0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + z13;
                layoutParams9.topMargin = i2.d.z(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        c60 c60Var = n60Var.U0;
        if (c60Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) c60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l J02 = n60.J0(n60Var);
            if (J02 != null) {
                layoutParams10.height = J02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = J02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp6 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp6;
                layoutParams10.rightMargin = dp6;
            }
        }
        if (h5Var2 != null) {
            int dp7 = ((AndroidUtilities.dp(60.0f) + (i25 - z13)) / 2) + z13;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h5Var.getLayoutParams();
            layoutParams11.topMargin = dp7 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) h5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp7;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) n60Var.V.getLayoutParams();
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
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i28)).g(e40Var.f30281b, true);
        }
        this.f39592w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.f39594y0) {
            this.f39594y0 = measuredHeight3;
            n60Var.e1(false);
        }
        n60Var.f38513r2.f30196f = getMeasuredWidth();
        n60Var.Z0();
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
        if (this.f39592w0) {
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
