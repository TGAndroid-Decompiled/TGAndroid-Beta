package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public class x10 extends org.telegram.ui.Components.gd0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final y10 J0;

    public x10(y10 y10Var, Context context) {
        super(context);
        this.J0 = y10Var;
        new Paint(1);
        this.H0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.I0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.J0.fragmentView;
        this.I0 = Boolean.valueOf(z10);
        AndroidUtilities.setLightStatusBar(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.k kVar7;
        y10 y10Var = this.J0;
        Paint paint = y10Var.K;
        ai.bd bdVar = y10Var.f43336y;
        int i11 = 0;
        if (!y10Var.f43330f) {
            if (y10Var.h) {
                float f10 = y10Var.f43331n + 0.016f;
                y10Var.f43331n = f10;
                if (f10 > 3.0f) {
                    y10Var.h = false;
                }
            } else {
                float f11 = y10Var.f43331n - 0.016f;
                y10Var.f43331n = f11;
                if (f11 < 1.0f) {
                    y10Var.h = true;
                }
            }
        }
        if (y10Var.f43329c.getLayoutManager() != null) {
            view = y10Var.f43329c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        y10Var.f43332r = i11;
        kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((y10Var.f43332r - dp) / (y10Var.J - dp));
        y10Var.v = f12;
        float f13 = 0.0f;
        y10Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (y10Var.f43332r < dp2) {
            y10Var.f43332r = dp2;
        }
        float f14 = y10Var.f43335x;
        y10Var.f43335x = 0.0f;
        if (y10Var.f43332r < AndroidUtilities.dp(30.0f) + dp2) {
            y10Var.f43335x = ((AndroidUtilities.dp(30.0f) + dp2) - y10Var.f43332r) / AndroidUtilities.dp(30.0f);
        }
        if (y10Var.H) {
            y10Var.f43335x = 1.0f;
            y10Var.v = 1.0f;
        }
        if (f14 != y10Var.f43335x) {
            y10Var.f43329c.invalidate();
        }
        y10Var.s0(y10Var.v);
        int i12 = y10Var.f43332r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = bdVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) bdVar.d;
        TextView textView = (TextView) bdVar.f1057b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - y10Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - y10Var.I) - textView.getMeasuredHeight()) / 2.0f) + y10Var.I) - bdVar.getTop()) - textView.getTop(), dp3);
        bdVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f15 = y10Var.v;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f15, 0.4f, 0.6f);
        if (f15 > 0.5f) {
            f7 = (f15 - 0.5f) / 0.5f;
        } else {
            f7 = 0.0f;
        }
        float f16 = 1.0f - f7;
        frameLayout.setScaleX(y3);
        frameLayout.setScaleY(y3);
        frameLayout.setAlpha(f16);
        ((FrameLayout) bdVar.e).setAlpha(f16);
        ((org.telegram.ui.Components.x90) bdVar.f1058c).setAlpha(f16);
        y10Var.e.setAlpha(1.0f - y10Var.v);
        y10Var.e.setTranslationY((frameLayout.getY() + bdVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f17 = y10Var.v;
        if (f17 > 0.3f) {
            f13 = (f17 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - f13)) * dp4);
        if (!y10Var.f43330f) {
            invalidate();
        }
        y10Var.f43327a.d(0, (-getMeasuredWidth()) * 0.1f * y10Var.f43331n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (y10Var.M) {
            int themedColor = y10Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20936a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y10Var.f43327a.f46195f);
        }
        int themedColor2 = y10Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21100j5);
        if (y10Var.M) {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Tj;
        }
        int f18 = i0.a.f(f16, themedColor2, y10Var.getThemedColor(i10));
        kVar5 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        kVar5.getBackButton().setColorFilter(f18);
        textView.setTextColor(f18);
        paint.setAlpha((int) ((1.0f - f16) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        d6Var = ((org.telegram.ui.ActionBar.n2) y10Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f16 <= 0.01f && y10Var.q0()) {
            d5Var = ((org.telegram.ui.ActionBar.n2) y10Var).parentLayout;
            kVar7 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
            ((ActionBarLayout) d5Var).p(canvas, 255, kVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        y10 y10Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (ih.j.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.G0 = true;
                    }
                }
                if (this.G0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.G0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        ai.bd bdVar = y10Var.f43336y;
        float x10 = bdVar.getX();
        FrameLayout frameLayout = (FrameLayout) bdVar.e;
        FrameLayout frameLayout2 = (FrameLayout) bdVar.d;
        org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) bdVar.f1058c;
        float x11 = x90Var.getX() + x10;
        float y3 = x90Var.getY() + bdVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, x90Var.getMeasuredWidth() + x11, x90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || y10Var.f43329c.I1 || (layout = x90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && y10Var.f43335x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.E0 = false;
                        }
                    } else {
                        this.E0 = true;
                    }
                    x90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + bdVar.getX();
        float y10 = frameLayout2.getY() + bdVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !y10Var.f43329c.I1 && isClickable && y10Var.f43335x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.D0 = false;
                }
            } else {
                this.D0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + bdVar.getX();
        float y11 = frameLayout.getY() + bdVar.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !y10Var.f43329c.I1 && y10Var.f43335x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.F0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.F0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.F0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        y10 y10Var = this.J0;
        if (view == y10Var.f43329c) {
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
            canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j10);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x10.onMeasure(int, int):void");
    }
}
