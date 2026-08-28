package zf;

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
import g7.e6;
import g7.g6;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.n60;
import org.telegram.ui.te1;
import yf.q2;
public class p0 extends FrameLayout implements o80 {
    public boolean A;
    public boolean B;
    public mq C;
    public boolean D;
    public boolean E;
    public final y5 F;
    public final y5 G;
    public jp H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public final Paint f50645a;
    public float f50646b;
    public boolean f50647c;
    public final o0 d;
    public final o0 f50648e;
    public final int f50649f;
    public boolean h;
    public float f50650n;
    public final q2 f50651r;
    public ValueAnimator f50652s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f50653w;
    public boolean f50654x;
    public final pi0 f50655y;

    public p0(Context context, b6 b6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, b6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.A && z10) {
            z10 = true;
        }
        this.A = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f29647c.f()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        q2 q2Var = this.f50651r;
        q2Var.setContentDescription(str);
        if (!this.E) {
            q2Var.setOnClickListener(onClickListener);
        }
    }

    @Override
    public final boolean b() {
        return this.J;
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f50654x = z10;
        o0 o0Var = this.f50648e;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f50652s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f50652s.cancel();
        }
        float f10 = 0.0f;
        if (!z10) {
            if (this.h) {
                f10 = 1.0f;
            }
            this.f50650n = f10;
            e();
            return;
        }
        float f11 = this.f50650n;
        if (this.h) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f50652s = ofFloat;
        ofFloat.addUpdateListener(new f2.f0(this, 12));
        this.f50652s.addListener(new te1(this, 12));
        this.f50652s.setDuration(250L);
        this.f50652s.setInterpolator(gr.f28844f);
        this.f50652s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        mq mqVar = this.C;
        o0 o0Var = this.f50648e;
        if (mqVar != null) {
            lq lqVar = mqVar.f30905a;
            if (lqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(lqVar.C - 0.5f) + lqVar.f30530s;
            }
            y5 y5Var = this.F;
            y5Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e10 = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            y5 y5Var2 = this.G;
            y5Var2.d(e10, false);
            o0Var.setTranslationX(-y5Var.f34854c);
            this.C.setTranslationX(y5Var2.f34854c - y5Var.f34854c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f10 = this.f50650n;
        Paint paint = this.f50645a;
        int i9 = this.f50649f;
        if (f10 != 1.0f || !this.f50654x) {
            if (this.f50647c) {
                float f11 = this.f50646b + 0.016f;
                this.f50646b = f11;
                if (f11 > 3.0f) {
                    this.f50647c = false;
                }
            } else {
                float f12 = this.f50646b - 0.016f;
                this.f50646b = f12;
                if (f12 < 1.0f) {
                    this.f50647c = true;
                }
            }
            if (this.D) {
                a1.d().f((-getMeasuredWidth()) * 0.1f * this.f50646b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f13 = i9;
                canvas.drawRoundRect(rectF, f13, f13, a1.d().e());
            } else {
                paint.setAlpha(255);
                float f14 = i9;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.B) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f50653w;
            hVar.f33541f = measuredWidth;
            hVar.a(i9, canvas, rectF, null);
        }
        float f15 = this.f50650n;
        if (f15 != 0.0f && this.f50654x) {
            paint.setAlpha((int) (f15 * 255.0f));
            if (this.f50650n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f50650n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f16 = i9;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            } else {
                float f17 = i9;
                canvas.drawRoundRect(rectF, f17, f17, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i9;
        float f10 = this.f50650n;
        o0 o0Var = this.f50648e;
        o0Var.setAlpha(f10);
        o0Var.setTranslationY((1.0f - this.f50650n) * AndroidUtilities.dp(12.0f));
        q2 q2Var = this.f50651r;
        q2Var.setAlpha(1.0f - this.f50650n);
        q2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f50650n);
        int i10 = 0;
        if (this.f50650n == 1.0f) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        q2Var.setVisibility(i9);
        if (this.f50650n == 0.0f) {
            i10 = 4;
        }
        o0Var.setVisibility(i10);
        invalidate();
    }

    public pi0 getIconView() {
        return this.f50655y;
    }

    public j6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f50651r.isEnabled();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f50651r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.B = z10;
        invalidate();
    }

    public void setIcon(int i9) {
        pi0 pi0Var = this.f50655y;
        pi0Var.f(i9, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f50653w;
        hVar.f33542g = 2.0f;
        hVar.f33550p = new pf.o1(this, 27);
        invalidate();
        pi0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f10;
        if (this.J != z10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f11 = this.I;
            this.J = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new g4(this, 26));
            this.K.addListener(new n60(17, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(gr.h);
            this.K.start();
        }
    }

    public p0(int i9, Context context, b6 b6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f50645a = paint;
        this.v = new Path();
        this.D = true;
        this.F = new y5(this);
        this.G = new y5(this);
        this.I = 0.0f;
        this.f50649f = i9;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f50653w = hVar;
        hVar.f33548n = 1.2f;
        hVar.f33545k = false;
        hVar.f33547m = 4.0f;
        LinearLayout f10 = ll.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, gr.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f50655y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        q2 q2Var = new q2(this, context, 1);
        this.f50651r = q2Var;
        q2Var.addView(f10, e6.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        q2Var.setBackground(f6.i0(i9, i9, i9, i9, 0, k10, k10));
        f10.addView(o0Var, e6.q(-2, -2, 16));
        f10.addView((View) imageView, e6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(q2Var);
        setOutlineProvider(ff.r0.f6255b);
        setClipToOutline(true);
        g6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.f50648e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(f6.v0(f6.Sh, b6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(f6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(f6.v0(f6.Oh, b6Var));
            e();
        }
    }
}
