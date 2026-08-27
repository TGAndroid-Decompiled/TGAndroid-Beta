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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

public class z10 extends org.telegram.ui.Components.xb0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final Paint D0;
    public Boolean E0;
    public final a20 F0;

    public boolean f44993z0;

    public z10(a20 a20Var, Context context) {
        super(context);
        this.F0 = a20Var;
        new Paint(1);
        this.D0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.E0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.F0.fragmentView;
            this.E0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a20 a20Var = this.F0;
        Paint paint = a20Var.G;
        gg.a aVar = a20Var.f36350y;
        if (!a20Var.f36344f) {
            if (a20Var.h) {
                float f10 = a20Var.f36345n + 0.016f;
                a20Var.f36345n = f10;
                if (f10 > 3.0f) {
                    a20Var.h = false;
                }
            } else {
                float f11 = a20Var.f36345n - 0.016f;
                a20Var.f36345n = f11;
                if (f11 < 1.0f) {
                    a20Var.h = true;
                }
            }
        }
        View viewM = a20Var.f36342c.getLayoutManager() != null ? a20Var.f36342c.getLayoutManager().m(0) : null;
        a20Var.f36346r = viewM != null ? viewM.getBottom() : 0;
        int iDp = AndroidUtilities.dp(16.0f) + ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getBottom();
        float f12 = 1.0f - ((a20Var.f36346r - iDp) / (a20Var.F - iDp));
        a20Var.v = f12;
        a20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        int iDp2 = AndroidUtilities.dp(16.0f) + ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getBottom();
        if (a20Var.f36346r < iDp2) {
            a20Var.f36346r = iDp2;
        }
        float f13 = a20Var.f36349x;
        a20Var.f36349x = 0.0f;
        if (a20Var.f36346r < AndroidUtilities.dp(30.0f) + iDp2) {
            a20Var.f36349x = ((AndroidUtilities.dp(30.0f) + iDp2) - a20Var.f36346r) / AndroidUtilities.dp(30.0f);
        }
        if (a20Var.D) {
            a20Var.f36349x = 1.0f;
            a20Var.v = 1.0f;
        }
        if (f13 != a20Var.f36349x) {
            a20Var.f36342c.invalidate();
        }
        int i10 = a20Var.f36346r;
        int measuredHeight = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.f7074b;
        float fMax = Math.max((((((((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getMeasuredHeight() - a20Var.E) - textView.getMeasuredHeight()) / 2.0f) + a20Var.E) - aVar.getTop()) - textView.getTop(), AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - a20Var.E)));
        float fDp = ((-fMax) / 4.0f) + AndroidUtilities.dp(16.0f);
        aVar.setTranslationY(fMax);
        frameLayout.setTranslationY(fDp + AndroidUtilities.dp(16.0f));
        float f14 = a20Var.v;
        float fZ = com.google.android.recaptcha.internal.a.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(fZ);
        frameLayout.setScaleY(fZ);
        frameLayout.setAlpha(f15);
        ((FrameLayout) aVar.f7076e).setAlpha(f15);
        ((org.telegram.ui.Components.p80) aVar.f7075c).setAlpha(f15);
        a20Var.f36343e.setAlpha(1.0f - a20Var.v);
        a20Var.f36343e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float fDp2 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f16 = a20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * fDp2);
        if (!a20Var.f36344f) {
            invalidate();
        }
        a20Var.f36340a.d(0, (-getMeasuredWidth()) * 0.1f * a20Var.f36345n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (a20Var.I) {
            int themedColor = a20Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7);
            Paint paint2 = this.D0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a20Var.f36340a.f458f);
        }
        int iD = i0.b.d(f15, a20Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5), a20Var.getThemedColor(a20Var.I ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.Tj));
        ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getBackButton().setColorFilter(iD);
        textView.setTextColor(iD);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        setLightStatusBar(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sj, ((org.telegram.ui.ActionBar.n2) a20Var).resourceProvider), paint.getColor()));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !a20Var.q0()) {
            return;
        }
        ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout).p(canvas, 255, ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getMeasuredHeight());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        float f10;
        ImageView backButton;
        a20 a20Var = this.F0;
        if (((org.telegram.ui.ActionBar.n2) a20Var).actionBar != null && (backButton = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getBackButton()) != null && backButton.getVisibility() == 0) {
            if (motionEvent.getAction() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                if (qg.j.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C0 = true;
                }
            }
            if (this.C0) {
                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return zDispatchTouchEvent;
                }
                this.C0 = false;
                return zDispatchTouchEvent;
            }
        }
        gg.a aVar = a20Var.f36350y;
        float x8 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.f7076e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) aVar.f7075c;
        float x10 = p80Var.getX() + x8;
        float y10 = p80Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x10, y10, p80Var.getMeasuredWidth() + x10, p80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.A0) || a20Var.f36342c.G1 || (layout = p80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && a20Var.f36349x < 1.0f) {
                    motionEvent.offsetLocation(-x10, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.A0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.A0 = false;
                    }
                    p80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x11 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean zIsClickable = frameLayout2.isClickable();
        rectF2.set(x11, y11, frameLayout2.getMeasuredWidth() + x11, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.f44993z0) && !a20Var.f36342c.G1 && zIsClickable && a20Var.f36349x < f10) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.f44993z0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f44993z0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x12 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x12, y12, frameLayout.getMeasuredWidth() + x12, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.B0) && !a20Var.f36342c.G1 && a20Var.f36349x < f10) {
            motionEvent.offsetLocation(-x12, -y12);
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
        a20 a20Var = this.F0;
        if (view != a20Var.f36342c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a20 a20Var = this.F0;
        gg.a aVar = a20Var.f36350y;
        a20Var.D = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        a20Var.E = (((org.telegram.ui.ActionBar.n2) a20Var).parentLayout == null || !((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout).I0) ? AndroidUtilities.statusBarHeight : 0;
        aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams = a20Var.f36343e.getLayoutParams();
        int measuredHeight = a20Var.A;
        if (measuredHeight <= 0) {
            measuredHeight = aVar.getMeasuredHeight();
        }
        layoutParams.height = measuredHeight;
        f2.k0 k0Var = a20Var.B;
        if (k0Var instanceof org.telegram.ui.Components.dz) {
            org.telegram.ui.Components.dz dzVar = (org.telegram.ui.Components.dz) k0Var;
            dzVar.M = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar.getMeasuredHeight();
            dzVar.p1();
            ((org.telegram.ui.Components.dz) a20Var.B).S = 0;
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            a20Var.u0();
        }
    }
}
