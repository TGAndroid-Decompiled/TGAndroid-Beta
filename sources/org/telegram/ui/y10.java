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
public class y10 extends org.telegram.ui.Components.ic0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final Paint D0;
    public Boolean E0;
    public final z10 F0;
    public boolean f44697z0;

    public y10(z10 z10Var, Context context) {
        super(context);
        this.F0 = z10Var;
        new Paint(1);
        this.D0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10;
        if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        float f9;
        int i10;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.l lVar7;
        z10 z10Var = this.F0;
        Paint paint = z10Var.G;
        ig.a aVar = z10Var.f45023y;
        int i11 = 0;
        if (!z10Var.f45017f) {
            if (z10Var.h) {
                float f10 = z10Var.f45018n + 0.016f;
                z10Var.f45018n = f10;
                if (f10 > 3.0f) {
                    z10Var.h = false;
                }
            } else {
                float f11 = z10Var.f45018n - 0.016f;
                z10Var.f45018n = f11;
                if (f11 < 1.0f) {
                    z10Var.h = true;
                }
            }
        }
        if (z10Var.f45015c.getLayoutManager() != null) {
            view = z10Var.f45015c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        z10Var.f45019r = i11;
        lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
        float f12 = 1.0f - ((z10Var.f45019r - dp) / (z10Var.F - dp));
        z10Var.v = f12;
        float f13 = 0.0f;
        z10Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
        if (z10Var.f45019r < dp2) {
            z10Var.f45019r = dp2;
        }
        float f14 = z10Var.f45022x;
        z10Var.f45022x = 0.0f;
        if (z10Var.f45019r < AndroidUtilities.dp(30.0f) + dp2) {
            z10Var.f45022x = ((AndroidUtilities.dp(30.0f) + dp2) - z10Var.f45019r) / AndroidUtilities.dp(30.0f);
        }
        if (z10Var.D) {
            z10Var.f45022x = 1.0f;
            z10Var.v = 1.0f;
        }
        if (f14 != z10Var.f45022x) {
            z10Var.f45015c.invalidate();
        }
        int i12 = z10Var.f45019r;
        lVar3 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        int measuredHeight = lVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.f8964b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - z10Var.E));
        lVar4 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - z10Var.E) - textView.getMeasuredHeight()) / 2.0f) + z10Var.E) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f15 = z10Var.v;
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f15, 0.4f, 0.6f);
        if (f15 > 0.5f) {
            f9 = (f15 - 0.5f) / 0.5f;
        } else {
            f9 = 0.0f;
        }
        float f16 = 1.0f - f9;
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f16);
        ((FrameLayout) aVar.f8966e).setAlpha(f16);
        ((org.telegram.ui.Components.y80) aVar.f8965c).setAlpha(f16);
        z10Var.f45016e.setAlpha(1.0f - z10Var.v);
        z10Var.f45016e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f17 = z10Var.v;
        if (f17 > 0.3f) {
            f13 = (f17 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.jr.h.getInterpolation(1.0f - f13)) * dp4);
        if (!z10Var.f45017f) {
            invalidate();
        }
        z10Var.f45013a.d(0, (-getMeasuredWidth()) * 0.1f * z10Var.f45018n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10Var.I) {
            int themedColor = z10Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7);
            Paint paint2 = this.D0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), z10Var.f45013a.f3319f);
        }
        int themedColor2 = z10Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5);
        if (z10Var.I) {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.Tj;
        }
        int d = i0.a.d(f16, themedColor2, z10Var.getThemedColor(i10));
        lVar5 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        lVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f16) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.g6.Sj;
        c6Var = ((org.telegram.ui.ActionBar.o2) z10Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        lVar6 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, lVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f16 <= 0.01f && z10Var.q0()) {
            b5Var = ((org.telegram.ui.ActionBar.o2) z10Var).parentLayout;
            lVar7 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
            ((ActionBarLayout) b5Var).p(canvas, 255, lVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f9;
        org.telegram.ui.ActionBar.l lVar2;
        z10 z10Var = this.F0;
        lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
            ImageView backButton = lVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (sg.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        ig.a aVar = z10Var.f45023y;
        float x4 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.f8966e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) aVar.f8965c;
        float x10 = y80Var.getX() + x4;
        float y8 = y80Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x10, y8, y80Var.getMeasuredWidth() + x10, y80Var.getMeasuredHeight() + y8);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.A0) || z10Var.f45015c.G1 || (layout = y80Var.getLayout()) == null) {
            f9 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f9 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && z10Var.f45022x < 1.0f) {
                    motionEvent.offsetLocation(-x10, -y8);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.A0 = false;
                        }
                    } else {
                        this.A0 = true;
                    }
                    y80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x11 = frameLayout2.getX() + aVar.getX();
        float y10 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x11, y10, frameLayout2.getMeasuredWidth() + x11, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f44697z0) && !z10Var.f45015c.G1 && isClickable && z10Var.f45022x < f9) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f44697z0 = false;
                }
            } else {
                this.f44697z0 = true;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x12 = frameLayout.getX() + aVar.getX();
        float y11 = frameLayout.getY() + aVar.getY();
        rectF2.set(x12, y11, frameLayout.getMeasuredWidth() + x12, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.B0) && !z10Var.f45015c.G1 && z10Var.f45022x < f9) {
            motionEvent.offsetLocation(-x12, -y11);
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
        org.telegram.ui.ActionBar.l lVar;
        z10 z10Var = this.F0;
        if (view == z10Var.f45015c) {
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
            canvas.clipRect(0, lVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y10.onMeasure(int, int):void");
    }
}
