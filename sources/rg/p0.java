package rg;

import ai.l6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Wallet.x4;
import org.telegram.ui.f70;
import w7.x5;
import w7.z5;
public class p0 extends FrameLayout implements ha0 {
    public boolean E;
    public boolean F;
    public mr G;
    public boolean H;
    public boolean I;
    public final g6 J;
    public final g6 K;
    public jq L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f47379a;
    public float f47380b;
    public boolean f47381c;
    public final o0 d;
    public final o0 f47382e;
    public final int f47383f;
    public boolean h;
    public float f47384n;
    public final ai.f0 f47385r;
    public ValueAnimator f47386s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f47387w;
    public boolean f47388x;
    public final fk0 f47389y;

    public p0(Context context, e6 e6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, e6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f30364c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        ai.f0 f0Var = this.f47385r;
        f0Var.setContentDescription(str);
        if (!this.I) {
            f0Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f47388x = z10;
        o0 o0Var = this.f47382e;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f47386s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f47386s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f47384n = f7;
            e();
            return;
        }
        float f10 = this.f47384n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f47386s = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 11));
        this.f47386s.addListener(new x4(this, 10));
        this.f47386s.setDuration(250L);
        this.f47386s.setInterpolator(hs.f27118f);
        this.f47386s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        mr mrVar = this.G;
        o0 o0Var = this.f47382e;
        if (mrVar != null) {
            lr lrVar = mrVar.f28891a;
            if (lrVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(lrVar.C - 0.5f) + lrVar.f28566s;
            }
            g6 g6Var = this.J;
            g6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e7 = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            g6 g6Var2 = this.K;
            g6Var2.d(e7, false);
            o0Var.setTranslationX(-g6Var.f26599c);
            this.G.setTranslationX(g6Var2.f26599c - g6Var.f26599c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f47384n > 1.0f ? 1 : (this.f47384n == 1.0f ? 0 : -1));
        Paint paint = this.f47379a;
        int i11 = this.f47383f;
        if (i10 != 0 || !this.f47388x) {
            if (this.f47381c) {
                float f7 = this.f47380b + 0.016f;
                this.f47380b = f7;
                if (f7 > 3.0f) {
                    this.f47381c = false;
                }
            } else {
                float f10 = this.f47380b - 0.016f;
                this.f47380b = f10;
                if (f10 < 1.0f) {
                    this.f47381c = true;
                }
            }
            if (this.H) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.f47380b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f11 = i11;
                canvas.drawRoundRect(rectF, f11, f11, b1.d().e());
            } else {
                paint.setAlpha(255);
                float f12 = i11;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f47387w;
            hVar.f31955f = measuredWidth;
            hVar.a(i11, canvas, rectF, null);
        }
        float f13 = this.f47384n;
        if (f13 != 0.0f && this.f47388x) {
            paint.setAlpha((int) (f13 * 255.0f));
            if (this.f47384n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f47384n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f14 = i11;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                canvas.restore();
            } else {
                float f15 = i11;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f7 = this.f47384n;
        o0 o0Var = this.f47382e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f47384n) * AndroidUtilities.dp(12.0f));
        ai.f0 f0Var = this.f47385r;
        f0Var.setAlpha(1.0f - this.f47384n);
        f0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f47384n);
        int i11 = 0;
        if (this.f47384n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        if (this.f47384n == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public fk0 getIconView() {
        return this.f47389y;
    }

    public r6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f47385r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f47385r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        fk0 fk0Var = this.f47389y;
        fk0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f47387w;
        hVar.f31956g = 2.0f;
        hVar.f31964p = new org.telegram.ui.web.q0(this, 26);
        invalidate();
        fk0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.N != z10) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O = null;
            }
            float f10 = this.M;
            this.N = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 15));
            this.O.addListener(new f70(16, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(hs.h);
            this.O.start();
        }
    }

    public p0(int i10, Context context, e6 e6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f47379a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new g6(this);
        this.K = new g6(this);
        this.M = 0.0f;
        this.f47383f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f47387w = hVar;
        hVar.f31962n = 1.2f;
        hVar.f31959k = false;
        hVar.f31961m = 4.0f;
        LinearLayout e7 = bi.e(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, hs.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f47389y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ai.f0 f0Var = new ai.f0(this, context, 29);
        this.f47385r = f0Var;
        f0Var.addView(e7, x5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        f0Var.setBackground(i6.j0(i10, i10, i10, i10, 0, k10, k10));
        e7.addView(o0Var, x5.q(-2, -2, 16));
        e7.addView((View) imageView, x5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(f0Var);
        setOutlineProvider(yf.i0.f52172b);
        setClipToOutline(true);
        z5.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.f47382e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(i6.w0(i6.Sh, e6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(i6.j0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(i6.w0(i6.Oh, e6Var));
            e();
        }
    }
}
