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
import bi.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.s6;
import org.telegram.ui.fi1;
import org.telegram.ui.i50;
import w7.b6;
import w7.z5;
public class q0 extends FrameLayout implements ga0 {
    public boolean E;
    public boolean F;
    public jr G;
    public boolean H;
    public boolean I;
    public final g6 J;
    public final g6 K;
    public gq L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f45309a;
    public float f45310b;
    public boolean f45311c;
    public final o0 d;
    public final o0 e;
    public final int f45312f;
    public boolean h;
    public float f45313n;
    public final p0 f45314r;
    public ValueAnimator f45315s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f45316w;
    public boolean f45317x;
    public final bk0 f45318y;

    public q0(Context context, c6 c6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, c6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f28752c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        p0 p0Var = this.f45314r;
        p0Var.setContentDescription(str);
        if (!this.I) {
            p0Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f45317x = z10;
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
        ValueAnimator valueAnimator = this.f45315s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f45315s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f45313n = f7;
            e();
            return;
        }
        float f10 = this.f45313n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f45315s = ofFloat;
        ofFloat.addUpdateListener(new w5(this, 12));
        this.f45315s.addListener(new fi1(this, 13));
        this.f45315s.setDuration(250L);
        this.f45315s.setInterpolator(es.f24465f);
        this.f45315s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        jr jrVar = this.G;
        o0 o0Var = this.e;
        if (jrVar != null) {
            ir irVar = jrVar.f26123a;
            if (irVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(irVar.C - 0.5f) + irVar.f25732s;
            }
            g6 g6Var = this.J;
            g6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            g6 g6Var2 = this.K;
            g6Var2.d(e, false);
            o0Var.setTranslationX(-g6Var.f24885c);
            this.G.setTranslationX(g6Var2.f24885c - g6Var.f24885c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f45313n > 1.0f ? 1 : (this.f45313n == 1.0f ? 0 : -1));
        Paint paint = this.f45309a;
        int i11 = this.f45312f;
        if (i10 != 0 || !this.f45317x) {
            if (this.f45311c) {
                float f7 = this.f45310b + 0.016f;
                this.f45310b = f7;
                if (f7 > 3.0f) {
                    this.f45311c = false;
                }
            } else {
                float f10 = this.f45310b - 0.016f;
                this.f45310b = f10;
                if (f10 < 1.0f) {
                    this.f45311c = true;
                }
            }
            if (this.H) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.f45310b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            org.telegram.ui.Components.voip.h hVar = this.f45316w;
            hVar.f29865f = measuredWidth;
            hVar.a(i11, canvas, rectF, null);
        }
        float f13 = this.f45313n;
        if (f13 != 0.0f && this.f45317x) {
            paint.setAlpha((int) (f13 * 255.0f));
            if (this.f45313n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f45313n, Path.Direction.CW);
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
        float f7 = this.f45313n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f45313n) * AndroidUtilities.dp(12.0f));
        p0 p0Var = this.f45314r;
        p0Var.setAlpha(1.0f - this.f45313n);
        p0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f45313n);
        int i11 = 0;
        if (this.f45313n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        p0Var.setVisibility(i10);
        if (this.f45313n == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public bk0 getIconView() {
        return this.f45318y;
    }

    public s6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f45314r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f45314r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        bk0 bk0Var = this.f45318y;
        bk0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f45316w;
        hVar.f29866g = 2.0f;
        hVar.f29874p = new ri.h0(this, 3);
        invalidate();
        bk0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new ki.a(this, 16));
            this.O.addListener(new i50(17, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(es.h);
            this.O.start();
        }
    }

    public q0(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f45309a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new g6(this);
        this.K = new g6(this);
        this.M = 0.0f;
        this.f45312f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f45316w = hVar;
        hVar.f29872n = 1.2f;
        hVar.f29869k = false;
        hVar.f29871m = 4.0f;
        LinearLayout e = sk.e(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, es.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f45318y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        p0 p0Var = new p0(this, context, 0);
        this.f45314r = p0Var;
        p0Var.addView(e, z5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        p0Var.setBackground(org.telegram.ui.ActionBar.g6.j0(i10, i10, i10, i10, 0, k10, k10));
        e.addView(o0Var, z5.q(-2, -2, 16));
        e.addView((View) imageView, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(p0Var);
        setOutlineProvider(zf.j0.f50193b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
            e();
        }
    }
}
