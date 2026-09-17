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
public class s20 extends org.telegram.ui.Components.mc0 {
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public final Paint G0;
    public Boolean H0;
    public final t20 I0;

    public s20(t20 t20Var, Context context) {
        super(context);
        this.I0 = t20Var;
        new Paint(1);
        this.G0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.H0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.I0.fragmentView;
        this.H0 = Boolean.valueOf(z10);
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.k kVar7;
        t20 t20Var = this.I0;
        Paint paint = t20Var.K;
        q20 q20Var = t20Var.f37630y;
        int i11 = 0;
        if (!t20Var.f37624f) {
            if (t20Var.h) {
                float f10 = t20Var.f37625n + 0.016f;
                t20Var.f37625n = f10;
                if (f10 > 3.0f) {
                    t20Var.h = false;
                }
            } else {
                float f11 = t20Var.f37625n - 0.016f;
                t20Var.f37625n = f11;
                if (f11 < 1.0f) {
                    t20Var.h = true;
                }
            }
        }
        if (t20Var.f37623c.getLayoutManager() != null) {
            view = t20Var.f37623c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        t20Var.f37626r = i11;
        kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((t20Var.f37626r - dp) / (t20Var.J - dp));
        t20Var.v = f12;
        float f13 = 0.0f;
        t20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (t20Var.f37626r < dp2) {
            t20Var.f37626r = dp2;
        }
        float f14 = t20Var.f37629x;
        t20Var.f37629x = 0.0f;
        if (t20Var.f37626r < AndroidUtilities.dp(30.0f) + dp2) {
            t20Var.f37629x = ((AndroidUtilities.dp(30.0f) + dp2) - t20Var.f37626r) / AndroidUtilities.dp(30.0f);
        }
        if (t20Var.H) {
            t20Var.f37629x = 1.0f;
            t20Var.v = 1.0f;
        }
        if (f14 != t20Var.f37629x) {
            t20Var.f37623c.invalidate();
        }
        int i12 = t20Var.f37626r;
        kVar3 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = q20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) q20Var.d;
        TextView textView = (TextView) q20Var.f36779b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - t20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - t20Var.I) - textView.getMeasuredHeight()) / 2.0f) + t20Var.I) - q20Var.getTop()) - textView.getTop(), dp3);
        q20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f15 = t20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f15, 0.4f, 0.6f);
        if (f15 > 0.5f) {
            f7 = (f15 - 0.5f) / 0.5f;
        } else {
            f7 = 0.0f;
        }
        float f16 = 1.0f - f7;
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f16);
        ((FrameLayout) q20Var.e).setAlpha(f16);
        ((org.telegram.ui.Components.c90) q20Var.f36780c).setAlpha(f16);
        t20Var.e.setAlpha(1.0f - t20Var.v);
        t20Var.e.setTranslationY((frameLayout.getY() + q20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f17 = t20Var.v;
        if (f17 > 0.3f) {
            f13 = (f17 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - f13)) * dp4);
        if (!t20Var.f37624f) {
            invalidate();
        }
        t20Var.f37621a.d(0, (-getMeasuredWidth()) * 0.1f * t20Var.f37625n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (t20Var.M) {
            int themedColor = t20Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7);
            Paint paint2 = this.G0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), t20Var.f37621a.f42578f);
        }
        int themedColor2 = t20Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18969j5);
        if (t20Var.M) {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Tj;
        }
        int d = i0.a.d(f16, themedColor2, t20Var.getThemedColor(i10));
        kVar5 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f16) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        f6Var = ((org.telegram.ui.ActionBar.o2) t20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f16 <= 0.01f && t20Var.q0()) {
            e5Var = ((org.telegram.ui.ActionBar.o2) t20Var).parentLayout;
            kVar7 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
            ((ActionBarLayout) e5Var).p(canvas, 255, kVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        t20 t20Var = this.I0;
        kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (hh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.F0 = true;
                    }
                }
                if (this.F0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.F0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        q20 q20Var = t20Var.f37630y;
        float x10 = q20Var.getX();
        FrameLayout frameLayout = (FrameLayout) q20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) q20Var.d;
        org.telegram.ui.Components.c90 c90Var = (org.telegram.ui.Components.c90) q20Var.f36780c;
        float x11 = c90Var.getX() + x10;
        float y3 = c90Var.getY() + q20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, c90Var.getMeasuredWidth() + x11, c90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.D0) || t20Var.f37623c.K1 || (layout = c90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && t20Var.f37629x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.D0 = false;
                        }
                    } else {
                        this.D0 = true;
                    }
                    c90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + q20Var.getX();
        float y10 = frameLayout2.getY() + q20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !t20Var.f37623c.K1 && isClickable && t20Var.f37629x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.C0 = false;
                }
            } else {
                this.C0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + q20Var.getX();
        float y11 = frameLayout.getY() + q20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.E0) && !t20Var.f37623c.K1 && t20Var.f37629x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.E0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.E0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.E0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        t20 t20Var = this.I0;
        if (view == t20Var.f37623c) {
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
            canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j3);
            canvas.restore();
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s20.onMeasure(int, int):void");
    }
}
