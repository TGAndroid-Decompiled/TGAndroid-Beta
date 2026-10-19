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
import org.telegram.messenger.kk;
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
import org.telegram.ui.l40;
import org.telegram.ui.tf1;
import w7.b6;
import w7.z5;
public class q0 extends FrameLayout implements aa0 {
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
    public final Paint f46378a;
    public float f46379b;
    public boolean f46380c;
    public final p0 d;
    public final p0 e;
    public final int f46381f;
    public boolean h;
    public float f46382n;
    public final rg.x1 f46383r;
    public ValueAnimator f46384s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f46385w;
    public boolean f46386x;
    public final xj0 f46387y;

    public q0(Context context, d6 d6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, d6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        p0 p0Var = this.d;
        if (z10 && p0Var.f29526c.h()) {
            p0Var.a();
        }
        p0Var.c(str, z10, true);
        rg.x1 x1Var = this.f46383r;
        x1Var.setContentDescription(str);
        if (!this.I) {
            x1Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f46386x = z10;
        p0 p0Var = this.e;
        p0Var.c(charSequence, z11, true);
        p0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f46384s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46384s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f46382n = f7;
            e();
            return;
        }
        float f10 = this.f46382n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f46384s = ofFloat;
        ofFloat.addUpdateListener(new v4(this, 12));
        this.f46384s.addListener(new tf1(this, 15));
        this.f46384s.setDuration(250L);
        this.f46384s.setInterpolator(bs.f25012f);
        this.f46384s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        gr grVar = this.G;
        p0 p0Var = this.e;
        if (grVar != null) {
            fr frVar = grVar.f26680a;
            if (frVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(frVar.C - 0.5f) + frVar.f26356s;
            }
            f6 f6Var = this.J;
            f6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (p0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            f6 f6Var2 = this.K;
            f6Var2.d(e, false);
            p0Var.setTranslationX(-f6Var.f26108c);
            this.G.setTranslationX(f6Var2.f26108c - f6Var.f26108c);
        } else if (p0Var != null) {
            p0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f46382n > 1.0f ? 1 : (this.f46382n == 1.0f ? 0 : -1));
        Paint paint = this.f46378a;
        int i11 = this.f46381f;
        if (i10 != 0 || !this.f46386x) {
            if (this.f46380c) {
                float f7 = this.f46379b + 0.016f;
                this.f46379b = f7;
                if (f7 > 3.0f) {
                    this.f46380c = false;
                }
            } else {
                float f10 = this.f46379b - 0.016f;
                this.f46379b = f10;
                if (f10 < 1.0f) {
                    this.f46380c = true;
                }
            }
            if (this.H) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.f46379b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            org.telegram.ui.Components.voip.h hVar = this.f46385w;
            hVar.f31476f = measuredWidth;
            hVar.a(i11, canvas, rectF, null);
        }
        float f13 = this.f46382n;
        if (f13 != 0.0f && this.f46386x) {
            paint.setAlpha((int) (f13 * 255.0f));
            if (this.f46382n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f46382n, Path.Direction.CW);
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
        float f7 = this.f46382n;
        p0 p0Var = this.e;
        p0Var.setAlpha(f7);
        p0Var.setTranslationY((1.0f - this.f46382n) * AndroidUtilities.dp(12.0f));
        rg.x1 x1Var = this.f46383r;
        x1Var.setAlpha(1.0f - this.f46382n);
        x1Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f46382n);
        int i11 = 0;
        if (this.f46382n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        x1Var.setVisibility(i10);
        if (this.f46382n == 0.0f) {
            i11 = 4;
        }
        p0Var.setVisibility(i11);
        invalidate();
    }

    public xj0 getIconView() {
        return this.f46387y;
    }

    public q6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f46383r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f46383r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        xj0 xj0Var = this.f46387y;
        xj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f46385w;
        hVar.f31477g = 2.0f;
        hVar.f31485p = new org.telegram.ui.web.z1(this, 22);
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
            this.O.addListener(new l40(17, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(bs.h);
            this.O.start();
        }
    }

    public q0(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f46378a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new f6(this);
        this.K = new f6(this);
        this.M = 0.0f;
        this.f46381f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46385w = hVar;
        hVar.f31483n = 1.2f;
        hVar.f31480k = false;
        hVar.f31482m = 4.0f;
        LinearLayout e = kk.e(context, 0);
        p0 p0Var = new p0(this, context, 0);
        this.d = p0Var;
        p0Var.b(0.35f, 350L, bs.h);
        p0Var.setGravity(17);
        p0Var.setTextColor(-1);
        p0Var.setTextSize(AndroidUtilities.dp(14.0f));
        p0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f46387y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        rg.x1 x1Var = new rg.x1(this, context, 3);
        this.f46383r = x1Var;
        x1Var.addView(e, z5.e(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        x1Var.setBackground(h6.j0(i10, i10, i10, i10, 0, o10, o10));
        e.addView(p0Var, z5.q(-2, -2, 16));
        e.addView((View) imageView, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(x1Var);
        setOutlineProvider(zf.j0.f51577b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            p0 p0Var2 = new p0(this, context, 1);
            this.e = p0Var2;
            p0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p0Var2.setGravity(17);
            p0Var2.setTextColor(h6.w0(h6.Sh, d6Var));
            p0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            p0Var2.setTypeface(AndroidUtilities.bold());
            p0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(-1, 120);
            p0Var2.setBackground(h6.j0(dp, dp, dp, dp, 0, o11, o11));
            addView(p0Var2);
            paint.setColor(h6.w0(h6.Oh, d6Var));
            e();
        }
    }
}
