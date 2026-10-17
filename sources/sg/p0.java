package sg;

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
import ci.v4;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.n40;
import org.telegram.ui.vf1;
import rg.n2;
import w7.b6;
import w7.z5;
public class p0 extends FrameLayout implements aa0 {
    public boolean E;
    public boolean F;
    public gr G;
    public boolean H;
    public boolean I;
    public final f6 J;
    public final f6 K;
    public dq L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f46377a;
    public float f46378b;
    public boolean f46379c;
    public final o0 d;
    public final o0 e;
    public final int f46380f;
    public boolean h;
    public float f46381n;
    public final n2 f46382r;
    public ValueAnimator f46383s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f46384w;
    public boolean f46385x;
    public final xj0 f46386y;

    public p0(Context context, d6 d6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, d6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f29578c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        n2 n2Var = this.f46382r;
        n2Var.setContentDescription(str);
        if (!this.I) {
            n2Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f46385x = z10;
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
        ValueAnimator valueAnimator = this.f46383s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46383s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f46381n = f7;
            e();
            return;
        }
        float f10 = this.f46381n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f46383s = ofFloat;
        ofFloat.addUpdateListener(new v4(this, 12));
        this.f46383s.addListener(new vf1(this, 16));
        this.f46383s.setDuration(250L);
        this.f46383s.setInterpolator(bs.f25030f);
        this.f46383s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        gr grVar = this.G;
        o0 o0Var = this.e;
        if (grVar != null) {
            fr frVar = grVar.f26654a;
            if (frVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(frVar.C - 0.5f) + frVar.f26369s;
            }
            f6 f6Var = this.J;
            f6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            f6 f6Var2 = this.K;
            f6Var2.d(e, false);
            o0Var.setTranslationX(-f6Var.f26093c);
            this.G.setTranslationX(f6Var2.f26093c - f6Var.f26093c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f46381n > 1.0f ? 1 : (this.f46381n == 1.0f ? 0 : -1));
        Paint paint = this.f46377a;
        int i11 = this.f46380f;
        if (i10 != 0 || !this.f46385x) {
            if (this.f46379c) {
                float f7 = this.f46378b + 0.016f;
                this.f46378b = f7;
                if (f7 > 3.0f) {
                    this.f46379c = false;
                }
            } else {
                float f10 = this.f46378b - 0.016f;
                this.f46378b = f10;
                if (f10 < 1.0f) {
                    this.f46379c = true;
                }
            }
            if (this.H) {
                a1.d().f((-getMeasuredWidth()) * 0.1f * this.f46378b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f11 = i11;
                canvas.drawRoundRect(rectF, f11, f11, a1.d().e());
            } else {
                paint.setAlpha(255);
                float f12 = i11;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f46384w;
            hVar.f31467f = measuredWidth;
            hVar.a(i11, canvas, rectF, null);
        }
        float f13 = this.f46381n;
        if (f13 != 0.0f && this.f46385x) {
            paint.setAlpha((int) (f13 * 255.0f));
            if (this.f46381n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f46381n, Path.Direction.CW);
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
        float f7 = this.f46381n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f46381n) * AndroidUtilities.dp(12.0f));
        n2 n2Var = this.f46382r;
        n2Var.setAlpha(1.0f - this.f46381n);
        n2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f46381n);
        int i11 = 0;
        if (this.f46381n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        n2Var.setVisibility(i10);
        if (this.f46381n == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public xj0 getIconView() {
        return this.f46386y;
    }

    public q6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f46382r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f46382r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        xj0 xj0Var = this.f46386y;
        xj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f46384w;
        hVar.f31468g = 2.0f;
        hVar.f31476p = new org.telegram.ui.web.z1(this, 22);
        invalidate();
        xj0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new i6(this, 23));
            this.O.addListener(new n40(17, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(bs.h);
            this.O.start();
        }
    }

    public p0(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f46377a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new f6(this);
        this.K = new f6(this);
        this.M = 0.0f;
        this.f46380f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46384w = hVar;
        hVar.f31474n = 1.2f;
        hVar.f31471k = false;
        hVar.f31473m = 4.0f;
        LinearLayout e = wh.e(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, bs.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f46386y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        n2 n2Var = new n2(this, context, 2);
        this.f46382r = n2Var;
        n2Var.addView(e, z5.e(-2, -2, 17));
        int o10 = i0.b.o(-1, 120);
        n2Var.setBackground(h6.j0(i10, i10, i10, i10, 0, o10, o10));
        e.addView(o0Var, z5.q(-2, -2, 16));
        e.addView((View) imageView, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(n2Var);
        setOutlineProvider(zf.i0.f51594b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(h6.w0(h6.Sh, d6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int o11 = i0.b.o(-1, 120);
            o0Var2.setBackground(h6.j0(dp, dp, dp, dp, 0, o11, o11));
            addView(o0Var2);
            paint.setColor(h6.w0(h6.Oh, d6Var));
            e();
        }
    }
}
