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
public class r20 extends org.telegram.ui.Components.vc0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final s20 J0;

    public r20(s20 s20Var, Context context) {
        super(context);
        this.J0 = s20Var;
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.l lVar7;
        s20 s20Var = this.J0;
        Paint paint = s20Var.K;
        p20 p20Var = s20Var.f36534y;
        int i11 = 0;
        if (!s20Var.f36528f) {
            if (s20Var.h) {
                float f10 = s20Var.f36529n + 0.016f;
                s20Var.f36529n = f10;
                if (f10 > 3.0f) {
                    s20Var.h = false;
                }
            } else {
                float f11 = s20Var.f36529n - 0.016f;
                s20Var.f36529n = f11;
                if (f11 < 1.0f) {
                    s20Var.h = true;
                }
            }
        }
        if (s20Var.f36527c.getLayoutManager() != null) {
            view = s20Var.f36527c.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view != null) {
            i11 = view.getBottom();
        }
        s20Var.f36530r = i11;
        lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
        float f12 = 1.0f - ((s20Var.f36530r - dp) / (s20Var.J - dp));
        s20Var.v = f12;
        float f13 = 0.0f;
        s20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
        if (s20Var.f36530r < dp2) {
            s20Var.f36530r = dp2;
        }
        float f14 = s20Var.f36533x;
        s20Var.f36533x = 0.0f;
        if (s20Var.f36530r < AndroidUtilities.dp(30.0f) + dp2) {
            s20Var.f36533x = ((AndroidUtilities.dp(30.0f) + dp2) - s20Var.f36530r) / AndroidUtilities.dp(30.0f);
        }
        if (s20Var.H) {
            s20Var.f36533x = 1.0f;
            s20Var.v = 1.0f;
        }
        if (f14 != s20Var.f36533x) {
            s20Var.f36527c.invalidate();
        }
        int i12 = s20Var.f36530r;
        lVar3 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        int measuredHeight = lVar3.getMeasuredHeight();
        int measuredHeight2 = p20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) p20Var.d;
        TextView textView = (TextView) p20Var.f35672b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i12 - ((measuredHeight2 + measuredHeight) - s20Var.I));
        lVar4 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - s20Var.I) - textView.getMeasuredHeight()) / 2.0f) + s20Var.I) - p20Var.getTop()) - textView.getTop(), dp3);
        p20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f15 = s20Var.v;
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
        ((FrameLayout) p20Var.e).setAlpha(f16);
        ((org.telegram.ui.Components.m90) p20Var.f35673c).setAlpha(f16);
        s20Var.e.setAlpha(1.0f - s20Var.v);
        s20Var.e.setTranslationY((frameLayout.getY() + p20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f17 = s20Var.v;
        if (f17 > 0.3f) {
            f13 = (f17 - 0.3f) / 0.7f;
        }
        textView.setTranslationX((1.0f - org.telegram.ui.Components.wr.h.getInterpolation(1.0f - f13)) * dp4);
        if (!s20Var.f36528f) {
            invalidate();
        }
        s20Var.f36525a.d(0, (-getMeasuredWidth()) * 0.1f * s20Var.f36529n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (s20Var.M) {
            int themedColor = s20Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s20Var.f36525a.f40690f);
        }
        int themedColor2 = s20Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5);
        if (s20Var.M) {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Tj;
        }
        int d = i0.a.d(f16, themedColor2, s20Var.getThemedColor(i10));
        lVar5 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        lVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f16) * 255.0f));
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        f6Var = ((org.telegram.ui.ActionBar.p2) s20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        lVar6 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, lVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f16 <= 0.01f && s20Var.q0()) {
            f5Var = ((org.telegram.ui.ActionBar.p2) s20Var).parentLayout;
            lVar7 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
            ((ActionBarLayout) f5Var).p(canvas, 255, lVar7.getMeasuredHeight());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.l lVar2;
        s20 s20Var = this.J0;
        lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
            ImageView backButton = lVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (gh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        p20 p20Var = s20Var.f36534y;
        float x10 = p20Var.getX();
        FrameLayout frameLayout = (FrameLayout) p20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) p20Var.d;
        org.telegram.ui.Components.m90 m90Var = (org.telegram.ui.Components.m90) p20Var.f35673c;
        float x11 = m90Var.getX() + x10;
        float y3 = m90Var.getY() + p20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, m90Var.getMeasuredWidth() + x11, m90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || s20Var.f36527c.K1 || (layout = m90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && s20Var.f36533x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            this.E0 = false;
                        }
                    } else {
                        this.E0 = true;
                    }
                    m90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + p20Var.getX();
        float y10 = frameLayout2.getY() + p20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !s20Var.f36527c.K1 && isClickable && s20Var.f36533x < f7) {
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
        float x13 = frameLayout.getX() + p20Var.getX();
        float y11 = frameLayout.getY() + p20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !s20Var.f36527c.K1 && s20Var.f36533x < f7) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        s20 s20Var = this.J0;
        if (view == s20Var.f36527c) {
            canvas.save();
            lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
            canvas.clipRect(0, lVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r20.onMeasure(int, int):void");
    }
}
