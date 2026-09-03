package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
public class k6 extends View {
    public final Path B;
    public final Path C;
    public final Path D;
    public final Path E;
    public final Path F;
    public final org.telegram.ui.Components.z5 G;
    public final org.telegram.ui.Components.z5 H;
    public float I;
    public long J;
    public float K;
    public int L;
    public int M;
    public final TextPaint N;
    public int O;
    public final int f45612a;
    public float f45613b;
    public float f45614c;
    public float d;
    public boolean f45615e;
    public final org.telegram.ui.Components.z5 f45616f;
    public Utilities.Callback h;
    public final Paint f45617n;
    public final Paint f45618r;
    public final Paint f45619s;
    public final Paint v;
    public final Paint f45620w;
    public final org.telegram.ui.Components.j6 f45621x;
    public final org.telegram.ui.Components.j6 f45622y;

    public k6(Context context, int i10) {
        super(context);
        this.f45613b = 0.0f;
        this.f45614c = 1.0f;
        pr prVar = pr.h;
        this.f45616f = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        Paint paint = new Paint(1);
        this.f45617n = paint;
        Paint paint2 = new Paint(1);
        this.f45618r = paint2;
        Paint paint3 = new Paint(1);
        this.f45619s = paint3;
        Paint paint4 = new Paint(1);
        this.v = paint4;
        Paint paint5 = new Paint(1);
        this.f45620w = paint5;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.f45621x = j6Var;
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new Path();
        this.F = new Path();
        this.G = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.H = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar);
        this.N = new TextPaint(1);
        this.f45612a = i10;
        j6Var.u(AndroidUtilities.bold());
        j6Var.k(0.3f, 40L, prVar);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.G = AndroidUtilities.displaySize.x;
        if (i10 == 0) {
            j6Var.t(AndroidUtilities.dp(15.0f));
            this.f45622y = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            j6Var.t(AndroidUtilities.dp(14.0f));
            j6Var.f27999b = 5;
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
            this.f45622y = j6Var2;
            j6Var2.G = AndroidUtilities.displaySize.x;
            j6Var2.t(AndroidUtilities.dp(14.0f));
            j6Var2.u(AndroidUtilities.bold());
            j6Var2.k(0.3f, 40L, prVar);
            j6Var2.setCallback(this);
            j6Var2.r(-1);
            if (i10 == 1) {
                j6Var2.q(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i10 == 2) {
                j6Var2.q(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i10 == 3) {
                j6Var2.q(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        j6Var.q("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.f45615e = true;
        float f11 = this.f45613b;
        this.d = (f10 - f11) / (this.f45614c - f11);
        e(f10);
    }

    public final void b() {
        this.f45613b = 0.0f;
        this.f45614c = 0.9f;
    }

    public final void c(org.telegram.ui.w3 w3Var) {
        this.h = w3Var;
    }

    public final void d(float f10) {
        float f11 = this.f45613b;
        float f12 = (f10 - f11) / (this.f45614c - f11);
        this.d = f12;
        this.f45616f.d(f12, true);
        e(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z4;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.L, this.M);
        Path path = this.B;
        path.rewind();
        float f12 = this.K;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z10 = false;
        if (this.f45615e) {
            f10 = this.f45616f.d(this.d, false);
        } else {
            f10 = this.d;
        }
        float f13 = f10;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.L, this.M, 255, 31);
        int i10 = this.f45612a;
        org.telegram.ui.Components.j6 j6Var = this.f45621x;
        if (i10 == 0) {
            j6Var.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.L, this.M - AndroidUtilities.dp(1.0f));
            j6Var.draw(canvas);
        } else {
            int d = (this.L - ((int) j6Var.d())) - AndroidUtilities.dp(6.0f);
            int dp = this.M - AndroidUtilities.dp(1.0f);
            org.telegram.ui.Components.j6 j6Var2 = this.f45622y;
            j6Var2.setBounds(AndroidUtilities.dp(12.33f), -AndroidUtilities.dp(1.0f), d, dp);
            j6Var2.draw(canvas);
            j6Var.setBounds(this.L - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.L - AndroidUtilities.dp(11.0f), this.M - AndroidUtilities.dp(1.0f));
            j6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.C, this.f45618r);
            canvas.drawPath(this.D, this.f45619s);
            float f14 = this.f45614c;
            float f15 = this.f45613b;
            float f16 = f14 - f15;
            if (f16 != 0.0f) {
                f11 = (f16 * this.d) + f15;
            } else {
                f11 = 0.0f;
            }
            double d10 = f11;
            if (d10 > 0.25d) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = this.G.e(z4);
            canvas.save();
            canvas.translate((1.0f - e6) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.v;
            paint.setAlpha((int) (e6 * 255.0f));
            canvas.drawPath(this.E, paint);
            canvas.restore();
            if (d10 > 0.5d) {
                z10 = true;
            }
            float e10 = this.H.e(z10);
            canvas.save();
            canvas.translate((1.0f - e10) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.f45620w;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(this.F, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.L * f13, this.M, this.f45617n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z4 = false;
        if (this.L <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.J = System.currentTimeMillis();
            this.f45615e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f11 = this.f45614c;
            float f12 = this.f45613b;
            float f13 = 0.0f;
            if (f11 - f12 != 0.0f) {
                f10 = e2.c.w(f11, f12, this.d, f12);
            } else {
                f10 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.J < ViewConfiguration.getTapTimeout()) {
                this.f45616f.d(this.d, true);
                this.d = x10 / this.L;
                this.f45615e = true;
            } else {
                this.d = Utilities.clamp(((x10 - this.I) / this.L) + this.d, 1.0f, 0.0f);
                this.f45615e = false;
                z4 = true;
            }
            float f14 = this.f45614c;
            float f15 = this.f45613b;
            if (f14 - f15 != 0.0f) {
                f13 = e2.c.w(f14, f15, this.d, f15);
            }
            if (z4) {
                if ((f13 <= f15 && f10 > f13) || (f13 >= f14 && f10 < f13)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f10 * 5.0f) != Math.floor(5.0f * f13)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            e(f13);
            Utilities.Callback callback = this.h;
            if (callback != null) {
                callback.run(Float.valueOf(f13));
            }
        }
        this.I = x10;
        return true;
    }

    public final void e(float f10) {
        long j10;
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.j6 j6Var = this.f45621x;
        if (!TextUtils.equals(j6Var.f28003g, str)) {
            j6Var.b();
            if (this.f45615e) {
                j10 = 320;
            } else {
                j10 = 40;
            }
            j6Var.k(0.3f, j10, pr.h);
            j6Var.q(str, true, true);
        }
        if (this.f45612a == 1) {
            this.f45617n.setColor(c2.f(f10));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.K = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.N;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.f45621x.t(AndroidUtilities.dp(15.0f));
        int i12 = this.O;
        int i13 = this.f45612a;
        if (i12 > 0) {
            this.L = i12;
            this.M = AndroidUtilities.dp(48.0f);
        } else if (i13 == 0) {
            this.L = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i10));
            this.M = AndroidUtilities.dp(48.0f);
        } else {
            this.L = AndroidUtilities.dp(190.0f);
            this.M = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.L, this.M);
        if (i13 == 0) {
            float dp = AndroidUtilities.dp(25.0f);
            float f10 = this.M / 2.0f;
            this.f45618r.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.C;
            path.rewind();
            path.moveTo(dp - AndroidUtilities.dpf2(8.66f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), f10 - AndroidUtilities.dpf2(2.9f));
            path.lineTo(dp - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f10);
            path.lineTo(dp - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f10);
            path.close();
            this.f45619s.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.D;
            path2.rewind();
            path2.moveTo(dp - AndroidUtilities.dpf2(7.5f), f10);
            path2.lineTo(dp, f10 - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(dp, AndroidUtilities.dpf2(7.33f) + f10);
            path2.close();
            Path path3 = this.E;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f10 - AndroidUtilities.dp(4.33f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f45620w;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.F;
            path4.rewind();
            rectF.set((dp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f10 - AndroidUtilities.dp(8.0f), (dp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f10 + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f45621x && drawable != this.f45622y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
