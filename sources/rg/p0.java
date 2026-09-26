package rg;

import ai.k6;
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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xq;
import org.telegram.ui.c70;
import w7.a6;
import w7.y5;
public class p0 extends FrameLayout implements q90 {
    public boolean E;
    public boolean F;
    public xq G;
    public boolean H;
    public boolean I;
    public final e6 J;
    public final e6 K;
    public up L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f42705a;
    public float f42706b;
    public boolean f42707c;
    public final o0 d;
    public final o0 e;
    public final int f42708f;
    public boolean h;
    public float f42709n;
    public final ai.f0 f42710r;
    public ValueAnimator f42711s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f42712w;
    public boolean f42713x;
    public final lj0 f42714y;

    public p0(Context context, d6 d6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, d6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f27274c.f()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        ai.f0 f0Var = this.f42710r;
        f0Var.setContentDescription(str);
        if (!this.I) {
            f0Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f42713x = z10;
        o0 o0Var = this.e;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f42711s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42711s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f42709n = f7;
            e();
            return;
        }
        float f10 = this.f42709n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f42711s = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 11));
        this.f42711s.addListener(new pg.d0(this, 4));
        this.f42711s.setDuration(250L);
        this.f42711s.setInterpolator(rr.f28030f);
        this.f42711s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        xq xqVar = this.G;
        o0 o0Var = this.e;
        if (xqVar != null) {
            wq wqVar = xqVar.f30385a;
            if (wqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(wqVar.C - 0.5f) + wqVar.f30163s;
            }
            e6 e6Var = this.J;
            e6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            e6 e6Var2 = this.K;
            e6Var2.d(e, false);
            o0Var.setTranslationX(-e6Var.f23844c);
            this.G.setTranslationX(e6Var2.f23844c - e6Var.f23844c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.f42709n;
        Paint paint = this.f42705a;
        int i10 = this.f42708f;
        if (f7 != 1.0f || !this.f42713x) {
            if (this.f42707c) {
                float f10 = this.f42706b + 0.016f;
                this.f42706b = f10;
                if (f10 > 3.0f) {
                    this.f42707c = false;
                }
            } else {
                float f11 = this.f42706b - 0.016f;
                this.f42706b = f11;
                if (f11 < 1.0f) {
                    this.f42707c = true;
                }
            }
            if (this.H) {
                a1.d().f((-getMeasuredWidth()) * 0.1f * this.f42706b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, a1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f42712w;
            hVar.f29367f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f42709n;
        if (f14 != 0.0f && this.f42713x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f42709n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f42709n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f7 = this.f42709n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f42709n) * AndroidUtilities.dp(12.0f));
        ai.f0 f0Var = this.f42710r;
        f0Var.setAlpha(1.0f - this.f42709n);
        f0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f42709n);
        int i11 = 0;
        if (this.f42709n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        if (this.f42709n == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public lj0 getIconView() {
        return this.f42714y;
    }

    public p6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f42710r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f42710r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        lj0 lj0Var = this.f42714y;
        lj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f42712w;
        hVar.f29368g = 2.0f;
        hVar.f29376p = new org.telegram.ui.web.q0(this, 27);
        invalidate();
        lj0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 16));
            this.O.addListener(new c70(16, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(rr.h);
            this.O.start();
        }
    }

    public p0(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f42705a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new e6(this);
        this.K = new e6(this);
        this.M = 0.0f;
        this.f42708f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42712w = hVar;
        hVar.f29374n = 1.2f;
        hVar.f29371k = false;
        hVar.f29373m = 4.0f;
        LinearLayout f7 = ok.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, rr.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f42714y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ai.f0 f0Var = new ai.f0(this, context, 27);
        this.f42710r = f0Var;
        f0Var.addView(f7, y5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        f0Var.setBackground(h6.i0(i10, i10, i10, i10, 0, k10, k10));
        f7.addView(o0Var, y5.q(-2, -2, 16));
        f7.addView((View) imageView, y5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(f0Var);
        setOutlineProvider(yf.i0.f47112b);
        setClipToOutline(true);
        a6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(h6.v0(h6.Sh, d6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(h6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(h6.v0(h6.Oh, d6Var));
            e();
        }
    }
}
