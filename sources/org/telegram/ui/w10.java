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
public class w10 extends org.telegram.ui.Components.tb0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final Paint D0;
    public Boolean E0;
    public final x10 F0;
    public boolean f43635z0;

    public w10(x10 x10Var, Context context) {
        super(context);
        this.F0 = x10Var;
        new Paint(1);
        this.D0 = new Paint(1);
    }

    private void setLightStatusBar(int i9) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i9) >= 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.E0;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        View view = this.F0.fragmentView;
        this.E0 = Boolean.valueOf(z10);
        AndroidUtilities.setLightStatusBar(view, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        float f10;
        int i9;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.k kVar7;
        x10 x10Var = this.F0;
        Paint paint = x10Var.G;
        fg.a aVar = x10Var.f44322y;
        int i10 = 0;
        if (!x10Var.f44316f) {
            if (x10Var.h) {
                float f11 = x10Var.f44317n + 0.016f;
                x10Var.f44317n = f11;
                if (f11 > 3.0f) {
                    x10Var.h = false;
                }
            } else {
                float f12 = x10Var.f44317n - 0.016f;
                x10Var.f44317n = f12;
                if (f12 < 1.0f) {
                    x10Var.h = true;
                }
            }
        }
        if (x10Var.f44314c.getLayoutManager() != null) {
            view = x10Var.f44314c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i10 = view.getBottom();
        }
        x10Var.f44318r = i10;
        kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f13 = 1.0f - ((x10Var.f44318r - dp) / (x10Var.F - dp));
        x10Var.v = f13;
        float f14 = 0.0f;
        x10Var.v = Utilities.clamp(f13, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (x10Var.f44318r < dp2) {
            x10Var.f44318r = dp2;
        }
        float f15 = x10Var.f44321x;
        x10Var.f44321x = 0.0f;
        if (x10Var.f44318r < AndroidUtilities.dp(30.0f) + dp2) {
            x10Var.f44321x = ((AndroidUtilities.dp(30.0f) + dp2) - x10Var.f44318r) / AndroidUtilities.dp(30.0f);
        }
        if (x10Var.D) {
            x10Var.f44321x = 1.0f;
            x10Var.v = 1.0f;
        }
        if (f15 != x10Var.f44321x) {
            x10Var.f44314c.invalidate();
        }
        int i11 = x10Var.f44318r;
        kVar3 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.f6274b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i11 - ((measuredHeight2 + measuredHeight) - x10Var.E));
        kVar4 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - x10Var.E) - textView.getMeasuredHeight()) / 2.0f) + x10Var.E) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f16 = x10Var.v;
        float z10 = e2.c.z(1.0f, f16, 0.4f, 0.6f);
        if (f16 > 0.5f) {
            f10 = (f16 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f17 = 1.0f - f10;
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f17);
        ((FrameLayout) aVar.f6276e).setAlpha(f17);
        ((org.telegram.ui.Components.l80) aVar.f6275c).setAlpha(f17);
        x10Var.f44315e.setAlpha(1.0f - x10Var.v);
        x10Var.f44315e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f18 = x10Var.v;
        if (f18 > 0.3f) {
            f14 = (f18 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - f14)) * dp4);
        if (!x10Var.f44316f) {
            invalidate();
        }
        x10Var.f44312a.d(0, (-getMeasuredWidth()) * 0.1f * x10Var.f44317n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (x10Var.I) {
            int themedColor = x10Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7);
            Paint paint2 = this.D0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x10Var.f44312a.f50792f);
        }
        int themedColor2 = x10Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5);
        if (x10Var.I) {
            i9 = org.telegram.ui.ActionBar.f6.G6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.Tj;
        }
        int d = i0.a.d(f17, themedColor2, x10Var.getThemedColor(i9));
        kVar5 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f17) * 255.0f));
        int i12 = org.telegram.ui.ActionBar.f6.Sj;
        b6Var = ((org.telegram.ui.ActionBar.o2) x10Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f17 <= 0.01f && x10Var.p0()) {
            b5Var = ((org.telegram.ui.ActionBar.o2) x10Var).parentLayout;
            kVar7 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
            ((ActionBarLayout) b5Var).p(canvas, 255, kVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        x10 x10Var = this.F0;
        kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (pg.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.C0 = true;
                    }
                }
                if (this.C0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.C0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        fg.a aVar = x10Var.f44322y;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.f6276e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) aVar.f6275c;
        float x11 = l80Var.getX() + x10;
        float y10 = l80Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y10, l80Var.getMeasuredWidth() + x11, l80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.A0) || x10Var.f44314c.G1 || (layout = l80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && x10Var.f44321x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.A0 = false;
                        }
                    } else {
                        this.A0 = true;
                    }
                    l80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f43635z0) && !x10Var.f44314c.G1 && isClickable && x10Var.f44321x < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f43635z0 = false;
                }
            } else {
                this.f43635z0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.B0) && !x10Var.f44314c.G1 && x10Var.f44321x < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.B0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.B0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.B0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        x10 x10Var = this.F0;
        if (view == x10Var.f44314c) {
            canvas.save();
            kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w10.onMeasure(int, int):void");
    }
}
