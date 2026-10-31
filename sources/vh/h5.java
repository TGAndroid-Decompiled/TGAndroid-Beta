package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.d81;
public class h5 extends View {
    public final org.telegram.ui.Components.e6 D;
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.t5 J;
    public final org.telegram.ui.Components.t5 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int f51247a;
    public float f51248b;
    public float f51249c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f51250f;
    public q20 h;
    public final Paint f51251n;
    public final Paint f51252r;
    public final Paint f51253s;
    public final Paint f51254w;
    public final Paint f51255x;
    public final org.telegram.ui.Components.e6 f51256y;

    public h5(Context context, int i10) {
        super(context);
        this.f51248b = 0.0f;
        this.f51249c = 1.0f;
        gr grVar = gr.h;
        this.f51250f = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        Paint paint = new Paint(1);
        this.f51251n = paint;
        Paint paint2 = new Paint(1);
        this.f51252r = paint2;
        Paint paint3 = new Paint(1);
        this.f51253s = paint3;
        Paint paint4 = new Paint(1);
        this.f51254w = paint4;
        Paint paint5 = new Paint(1);
        this.f51255x = paint5;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f51256y = e6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.K = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.Q = new TextPaint(1);
        this.f51247a = i10;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.n(0.3f, 40L, grVar);
        e6Var.setCallback(this);
        e6Var.u(-1);
        Point point = org.telegram.messenger.i0.f16026q;
        e6Var.M = point.x;
        if (i10 == 0) {
            e6Var.w(org.telegram.messenger.i0.L(15.0f));
            this.D = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            e6Var.w(org.telegram.messenger.i0.L(14.0f));
            e6Var.f25695b = 5;
            org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, true);
            this.D = e6Var2;
            e6Var2.M = point.x;
            e6Var2.w(org.telegram.messenger.i0.L(14.0f));
            e6Var2.x(org.telegram.messenger.i0.o());
            e6Var2.n(0.3f, 40L, grVar);
            e6Var2.setCallback(this);
            e6Var2.u(-1);
            if (i10 == 1) {
                e6Var2.t(cd.L0(2131750692, null), true, true);
            } else if (i10 == 2) {
                e6Var2.t(cd.L0(2131750693, null), true, true);
            } else if (i10 == 3) {
                e6Var2.t(cd.L0(2131742980, null), true, true);
            }
        }
        e6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f7) {
        this.e = true;
        float f10 = this.f51248b;
        this.d = (f7 - f10) / (this.f51249c - f10);
        e(f7);
    }

    public final void b() {
        this.f51248b = 0.0f;
        this.f51249c = 0.9f;
    }

    public final void c(d81 d81Var) {
        this.h = d81Var;
    }

    public final void d(float f7) {
        float f10 = this.f51248b;
        float f11 = (f7 - f10) / (this.f51249c - f10);
        this.d = f11;
        this.f51250f.e(true, f11);
        e(f7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        boolean z10;
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, this.O, this.P);
        Path path = this.E;
        path.rewind();
        float f11 = this.N;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z11 = false;
        if (this.e) {
            f7 = this.f51250f.e(false, this.d);
        } else {
            f7 = this.d;
        }
        float f12 = f7;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, 255, 31);
        int i10 = this.f51247a;
        org.telegram.ui.Components.e6 e6Var = this.f51256y;
        if (i10 == 0) {
            e6Var.setBounds(org.telegram.messenger.i0.L(42.0f), -org.telegram.messenger.i0.L(1.0f), this.O, this.P - org.telegram.messenger.i0.L(1.0f));
            e6Var.draw(canvas);
        } else {
            int c10 = (this.O - ((int) e6Var.c())) - org.telegram.messenger.i0.L(6.0f);
            int L = this.P - org.telegram.messenger.i0.L(1.0f);
            org.telegram.ui.Components.e6 e6Var2 = this.D;
            e6Var2.setBounds(org.telegram.messenger.i0.L(12.33f), -org.telegram.messenger.i0.L(1.0f), c10, L);
            e6Var2.draw(canvas);
            e6Var.setBounds(this.O - org.telegram.messenger.i0.L(111.0f), -org.telegram.messenger.i0.L(1.0f), this.O - org.telegram.messenger.i0.L(11.0f), this.P - org.telegram.messenger.i0.L(1.0f));
            e6Var.draw(canvas);
        }
        if (i10 == 0) {
            canvas.drawPath(this.F, this.f51252r);
            canvas.drawPath(this.G, this.f51253s);
            float f13 = this.f51249c;
            float f14 = this.f51248b;
            float f15 = f13 - f14;
            if (f15 != 0.0f) {
                f10 = (f15 * this.d) + f14;
            } else {
                f10 = 0.0f;
            }
            double d = f10;
            if (d > 0.25d) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = this.J.d(z10);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.i0.N(0.33f)), 0.0f);
            Paint paint = this.f51254w;
            paint.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.H, paint);
            canvas.restore();
            if (d > 0.5d) {
                z11 = true;
            }
            float d11 = this.K.d(z11);
            canvas.save();
            canvas.translate((1.0f - d11) * (-org.telegram.messenger.i0.N(0.66f)), 0.0f);
            Paint paint2 = this.f51255x;
            paint2.setAlpha((int) (d11 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * f12, this.P, this.f51251n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        boolean z10 = false;
        if (this.O <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.M = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.f51249c;
            float f11 = this.f51248b;
            float f12 = 0.0f;
            if (f10 - f11 != 0.0f) {
                f7 = c3.i0.z(f10, f11, this.d, f11);
            } else {
                f7 = 0.0f;
            }
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.M < ViewConfiguration.getTapTimeout()) {
                this.f51250f.e(true, this.d);
                this.d = x10 / this.O;
                this.e = true;
            } else {
                this.d = Utilities.i(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.e = false;
                z10 = true;
            }
            float f13 = this.f51249c;
            float f14 = this.f51248b;
            if (f13 - f14 != 0.0f) {
                f12 = c3.i0.z(f13, f14, this.d, f14);
            }
            if (z10) {
                if ((f12 <= f14 && f7 > f12) || (f12 >= f13 && f7 < f12)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(f7 * 5.0f) != Math.floor(5.0f * f12)) {
                    org.telegram.messenger.i0.b4(this);
                }
            }
            e(f12);
            q20 q20Var = this.h;
            if (q20Var != null) {
                q20Var.a(Float.valueOf(f12));
            }
        }
        this.L = x10;
        return true;
    }

    public final void e(float f7) {
        long j10;
        String str = Math.round(100.0f * f7) + "%";
        org.telegram.ui.Components.e6 e6Var = this.f51256y;
        if (!TextUtils.equals(e6Var.f25700i, str)) {
            e6Var.a();
            if (this.e) {
                j10 = 320;
            } else {
                j10 = 40;
            }
            e6Var.n(0.3f, j10, gr.h);
            e6Var.t(str, true, true);
        }
        if (this.f51247a == 1) {
            this.f51251n.setColor(z1.f(f7));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.N = org.telegram.messenger.i0.L(12.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        this.f51256y.w(org.telegram.messenger.i0.L(15.0f));
        int i12 = this.R;
        int i13 = this.f51247a;
        if (i12 > 0) {
            this.O = i12;
            this.P = org.telegram.messenger.i0.L(48.0f);
        } else if (i13 == 0) {
            this.O = (int) Math.min(textPaint.measureText(cd.L0(2131744738, null)) + org.telegram.messenger.i0.L(88.0f), View.MeasureSpec.getSize(i10));
            this.P = org.telegram.messenger.i0.L(48.0f);
        } else {
            this.O = org.telegram.messenger.i0.L(190.0f);
            this.P = org.telegram.messenger.i0.L(44.0f);
        }
        setMeasuredDimension(this.O, this.P);
        if (i13 == 0) {
            float L = org.telegram.messenger.i0.L(25.0f);
            float f7 = this.P / 2.0f;
            this.f51252r.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(L - org.telegram.messenger.i0.N(8.66f), f7 - org.telegram.messenger.i0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.i0.N(3.0f), f7 - org.telegram.messenger.i0.N(2.9f));
            path.lineTo(L - org.telegram.messenger.i0.N(3.0f), org.telegram.messenger.i0.N(2.9f) + f7);
            path.lineTo(L - org.telegram.messenger.i0.N(8.66f), org.telegram.messenger.i0.N(2.9f) + f7);
            path.close();
            this.f51253s.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.N(2.66f)));
            Path path2 = this.G;
            path2.rewind();
            path2.moveTo(L - org.telegram.messenger.i0.N(7.5f), f7);
            path2.lineTo(L, f7 - org.telegram.messenger.i0.N(7.33f));
            path2.lineTo(L, org.telegram.messenger.i0.N(7.33f) + f7);
            path2.close();
            Path path3 = this.H;
            path3.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((L - org.telegram.messenger.i0.N(0.33f)) - org.telegram.messenger.i0.L(4.33f), f7 - org.telegram.messenger.i0.L(4.33f), (L - org.telegram.messenger.i0.N(0.33f)) + org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(4.33f) + f7);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.f51255x;
            paint.setStyle(style);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            Path path4 = this.I;
            path4.rewind();
            rectF.set((L - org.telegram.messenger.i0.N(0.33f)) - org.telegram.messenger.i0.L(8.0f), f7 - org.telegram.messenger.i0.L(8.0f), (L - org.telegram.messenger.i0.N(0.33f)) + org.telegram.messenger.i0.L(8.0f), f7 + org.telegram.messenger.i0.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f51256y && drawable != this.D && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
