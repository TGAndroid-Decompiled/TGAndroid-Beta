package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.y00;
public abstract class e8 extends View {
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.q6 H;
    public final org.telegram.ui.Components.q6 I;
    public final er[] J;
    public final Paint K;
    public final n11 L;
    public final org.telegram.ui.Components.g6 M;
    public final org.telegram.ui.Components.g6 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.d6 f52532a;
    public final RectF f52533a0;
    public final Paint f52534b;
    public final Path f52535b0;
    public final Paint f52536c;
    public float f52537c0;
    public final Paint d;
    public float f52538d0;
    public final Paint f52539e;
    public int[] f52540e0;
    public final Paint f52541f;
    public final me.b f52542f0;
    public float f52543g0;
    public final b8 h;
    public float f52544h0;
    public long f52545i0;
    public int f52546j0;
    public boolean f52547k0;
    public ValueAnimator f52548l0;
    public final b8 f52549n;
    public int f52550r;
    public int f52551s;
    public ValueAnimator v;
    public int f52552w;
    public int f52553x;
    public LinearGradient f52554y;

    public e8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f52534b = new Paint(1);
        this.f52536c = new Paint(1);
        this.d = new Paint(1);
        this.f52539e = new Paint(1);
        this.f52541f = new Paint(1);
        this.h = new b8(0, 300);
        this.f52549n = new b8(2, 30);
        this.f52550r = -1135603;
        this.f52551s = -404714;
        this.f52552w = -1135603;
        this.f52553x = -404714;
        this.f52554y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f52550r, this.f52551s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.H = q6Var;
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, true, true);
        this.I = q6Var2;
        this.J = new er[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new n11(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        is isVar = is.h;
        this.M = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.N = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.P = -1L;
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new Path();
        this.V = new Path();
        this.W = new Path();
        this.f52533a0 = new RectF();
        this.f52535b0 = new Path();
        this.f52537c0 = 0.0f;
        this.f52542f0 = new me.b(this, isVar, 320L);
        this.f52532a = d6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.G = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        q6Var.u(-1);
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.w(AndroidUtilities.dp(21.0f));
        q6Var.setCallback(this);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.f30019b = 17;
        q6Var2.u(-570425345);
        q6Var2.w(AndroidUtilities.dp(11.0f));
        q6Var2.setCallback(this);
        q6Var2.M = AndroidUtilities.displaySize.x;
        q6Var2.f30019b = 17;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f52548l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52537c0, f7);
        this.f52548l0 = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 26));
        int value = getValue();
        this.f52548l0.addListener(new y00(this, f7, value));
        this.f52548l0.setDuration(320L);
        this.f52548l0.setInterpolator(is.h);
        this.f52548l0.start();
        if (c(f7) != value) {
            e(c(f7));
        }
        org.telegram.ui.Components.q6 q6Var = this.H;
        q6Var.a();
        q6Var.t(p7.W0(false, LocaleController.formatNumber(c(f7), ','), this.J), true, true);
    }

    public final float b(int i10) {
        int i11;
        int i12 = 1;
        while (true) {
            int[] iArr = this.f52540e0;
            if (i12 < iArr.length) {
                if (i10 <= iArr[i12]) {
                    int i13 = i12 - 1;
                    int i14 = iArr[i13];
                    return (i13 + ((i10 - i14) / (i11 - i14))) / (iArr.length - 1);
                }
                i12++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f7) {
        int i10;
        int[] iArr;
        if (f7 <= 0.0f) {
            return this.f52540e0[0];
        }
        if (f7 >= 1.0f) {
            return this.f52540e0[iArr.length - 1];
        }
        int[] iArr2 = this.f52540e0;
        float length = f7 * (iArr2.length - 1);
        int i11 = (int) length;
        float f10 = length - i11;
        float f11 = iArr2[i11];
        int i12 = i11 + 1;
        if (i12 < iArr2.length) {
            i11 = i12;
        }
        return Math.round((f10 * (iArr2[i11] - i10)) + f11);
    }

    public boolean d(float f7) {
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f7;
        org.telegram.ui.Components.g6 g6Var;
        int i10;
        Path path;
        Paint paint2;
        RectF rectF;
        Canvas canvas2;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        float f13;
        boolean z12;
        boolean z13;
        float f14;
        super.dispatchDraw(canvas);
        Matrix matrix = this.E;
        matrix.reset();
        RectF rectF2 = this.Q;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.f52554y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.f52554y;
        Paint paint3 = this.f52536c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.f52537c0, this.f52550r, this.f52551s);
        Path path2 = this.U;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, this.f52550r);
        Paint paint4 = this.f52534b;
        paint4.setColor(m12);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path3 = this.V;
        path3.rewind();
        path3.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction);
        b8 b8Var = this.h;
        b8Var.g(rectF2);
        float f15 = this.f52537c0;
        b8Var.h = (f15 * 15.0f) + 1.0f;
        b8Var.f52402j = (int) (b8Var.f52396b.size() * ((f15 * 0.85f) + 0.15f));
        b8Var.d();
        canvas.save();
        canvas.clipPath(path2);
        b8Var.a(canvas, d);
        long j3 = this.P;
        int i12 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        org.telegram.ui.Components.g6 g6Var2 = this.N;
        org.telegram.ui.Components.g6 g6Var3 = this.M;
        n11 n11Var = this.L;
        Paint paint5 = this.K;
        if (i12 != 0 && b((int) j3) < 1.0f && b((int) this.P) > 0.0f) {
            float dp = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.P)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - dp) < AndroidUtilities.dp(14.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float e7 = g6Var3.e(z12);
            int dp2 = AndroidUtilities.dp(9.0f);
            int dp3 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - dp) < AndroidUtilities.dp(12.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            float lerp = AndroidUtilities.lerp(dp2, dp3, g6Var2.e(z13));
            if (dp + n11Var.f28902c + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f14 = (dp - lerp) - n11Var.f28902c;
            } else {
                f14 = dp + lerp;
            }
            float f16 = f14;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.h6.m1(0.6f, d));
            paint = paint4;
            f7 = b10;
            g6Var = g6Var2;
            i10 = d;
            rectF = rectF3;
            canvas.drawLine(dp, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e7), dp, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e7), paint5);
            path = path3;
            paint2 = paint5;
            this.L.c(f16, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        } else {
            paint = paint4;
            f7 = b10;
            g6Var = g6Var2;
            i10 = d;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        b8Var.a(canvas2, -1);
        long j10 = this.P;
        if (j10 != -1 && b((int) j10) < 1.0f && b((int) this.P) > 0.0f) {
            float dp4 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.P)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp4) < AndroidUtilities.dp(14.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var3.e(z10);
            int dp5 = AndroidUtilities.dp(9.0f);
            int dp6 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp4) < AndroidUtilities.dp(12.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float lerp2 = AndroidUtilities.lerp(dp5, dp6, g6Var.e(z11));
            if (n11Var.f28902c + dp4 + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f13 = (dp4 - lerp2) - n11Var.f28902c;
            } else {
                f13 = lerp2 + dp4;
            }
            float f17 = f13;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, this.f52532a)));
            i11 = i10;
            canvas2.drawLine(dp4, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e10), dp4, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e10), paint2);
            this.L.c(f17, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i11 = i10;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d10 = i0.a.d(0.5f, paint.getColor(), this.f52551s);
            Paint paint6 = this.d;
            paint6.setColor(d10);
            Path path5 = this.W;
            path5.rewind();
            f10 = 0.5f;
            f11 = 2.0f;
            f12 = 0.15f;
            path5.addRoundRect(height - AndroidUtilities.dp(1.0f), centerY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + height, centerY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
            path5.addRoundRect(height - AndroidUtilities.dp(6.0f), centerY - AndroidUtilities.dp(1.0f), height + AndroidUtilities.dp(6.0f), centerY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f10 = 0.5f;
            f11 = 2.0f;
            f12 = 0.15f;
        }
        float dp7 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float centerY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / f11);
        float dp8 = rectF.right - AndroidUtilities.dp(4.0f);
        float dp9 = (AndroidUtilities.dp(16.0f) / f11) + rectF.centerY();
        RectF rectF4 = this.S;
        rectF4.set(dp7, centerY2, dp8, dp9);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f52539e);
        float dp10 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f7), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f7), Math.min(Utilities.clamp01(f7 / dp10), Utilities.clamp01((1.0f - f7) / dp10)));
        org.telegram.ui.Components.q6 q6Var = this.I;
        float c10 = q6Var.c() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.q6 q6Var2 = this.H;
        float max = Math.max(c10, q6Var2.c() + AndroidUtilities.dp(50.0f));
        float clamp = Utilities.clamp(lerp3 - (max / f11), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp11 = rectF2.top - AndroidUtilities.dp(21.0f);
        float dp12 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.f52533a0;
        rectF5.set(clamp, dp11 - AndroidUtilities.dp(44.0f), max + clamp, dp12);
        float height2 = rectF5.height();
        float f18 = height2 / f11;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.f52537c0 - this.f52538d0, 1.0f, -1.0f) * 60.0f;
        float f19 = f12;
        float dp13 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path6 = this.f52535b0;
        path6.rewind();
        float f20 = rectF5.left;
        float f21 = rectF5.top;
        RectF rectF6 = this.T;
        rectF6.set(f20, f21, f20 + height2, f21 + height2);
        path6.arcTo(rectF6, -180.0f, 90.0f);
        float f22 = rectF5.right;
        float f23 = rectF5.top;
        rectF6.set(f22 - height2, f23, f22, f23 + height2);
        path6.arcTo(rectF6, -90.0f, 90.0f);
        float f24 = rectF5.right;
        float f25 = rectF5.bottom;
        rectF6.set(f24 - height2, f25 - height2, f24, f25);
        path6.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - rectF6.centerX()) / f18)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f26 = 0.7f * height2;
        if (clamp3 < rectF5.right - f26) {
            path6.lineTo(clamp4, rectF5.bottom);
            path6.lineTo(clamp2 + f11, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path6.lineTo(clamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (clamp4 > rectF5.left + f26) {
            path6.lineTo(clamp2 - f11, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path6.lineTo(clamp3, rectF5.bottom);
        }
        float f27 = rectF5.left;
        float f28 = rectF5.bottom;
        rectF6.set(f27, f28 - height2, f27 + height2, f28);
        float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - rectF6.left) / f18)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path6.arcTo(rectF6, clamp6, 180.0f - clamp6);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        b8 b8Var2 = this.f52549n;
        b8Var2.g(rectF7);
        b8Var2.h = (this.f52537c0 * 15.0f) + 1.0f;
        b8Var2.d();
        canvas2.save();
        b8Var2.a(canvas2, i11);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp13);
        if (Math.abs(this.f52537c0 - this.f52538d0) > 0.001f) {
            this.f52538d0 = AndroidUtilities.lerp(this.f52538d0, this.f52537c0, 0.1f);
            invalidate();
        }
        this.f52541f.setShader(this.f52554y);
        canvas2.drawPath(path6, this.f52541f);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-clamp5, clamp2, dp13);
        b8Var2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f29 = 1.0f - (this.f52542f0.f16365e * f19);
        canvas2.scale(f29, f29, rectF5.centerX(), rectF5.top - (rectF5.height() * f10));
        this.G.setBounds((int) ((rectF5.centerX() - (q6Var2.c() / f11)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (q6Var2.c() / f11)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        q6Var2.o(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        q6Var2.draw(canvas2);
        canvas2.restore();
        q6Var.o(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        q6Var.B = (int) (this.f52542f0.f16365e * 255.0f);
        q6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f52543g0 = motionEvent.getX();
            this.f52544h0 = motionEvent.getY();
            this.f52546j0 = motionEvent.getPointerId(0);
            this.f52545i0 = System.currentTimeMillis();
            this.f52547k0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f52546j0) {
            float x10 = motionEvent.getX() - this.f52543g0;
            float y3 = motionEvent.getY() - this.f52544h0;
            if (!this.f52547k0 && Math.abs(x10) > Math.abs(y3 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f52547k0 = true;
                ValueAnimator valueAnimator = this.f52548l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f52547k0) {
                int value = getValue();
                this.f52537c0 = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.f52537c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.q6 q6Var = this.H;
                    q6Var.a();
                    q6Var.t(p7.W0(false, LocaleController.formatNumber(getValue(), ','), this.J), true, true);
                }
                this.f52543g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f52547k0 && motionEvent.getPointerId(0) == this.f52546j0 && v7.z6.a(this.f52543g0, this.f52544h0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && ((float) (System.currentTimeMillis() - this.f52545i0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.Q;
                    float clamp01 = Utilities.clamp01((x12 - rectF.left) / rectF.width());
                    long j3 = this.P;
                    if (j3 > 0 && Math.abs(b((int) j3) - clamp01) < 0.035f) {
                        clamp01 = Utilities.clamp01(b((int) this.P));
                    }
                    a(clamp01);
                }
            }
            this.f52547k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.f52552w == i10 && this.f52553x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (z10) {
            int i12 = this.f52550r;
            int i13 = this.f52551s;
            this.f52552w = i10;
            this.f52553x = i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new i30(this, i12, i10, i13, i11, 2));
            this.v.addListener(new d8(this, i12, i10, i13, i11));
            this.v.setInterpolator(is.h);
            this.v.setDuration(420L);
            this.v.start();
            return;
        }
        this.f52552w = i10;
        this.f52550r = i10;
        this.f52553x = i11;
        this.f52551s = i11;
        this.f52554y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f52550r, this.f52551s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f52542f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.q6 q6Var = this.I;
        q6Var.a();
        q6Var.t(str, true, true);
    }

    public float getProgress() {
        return this.f52537c0;
    }

    public int getValue() {
        return c(this.f52537c0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(135.0f);
        this.Q.set(dp, dp2, measuredWidth - dp, AndroidUtilities.dp(24.0f) + dp2);
        this.f52536c.setColor(-1069811);
        this.f52539e.setColor(-1);
    }

    public void setStarsTop(long j3) {
        this.P = j3;
        invalidate();
    }

    public void setTopText(String str) {
        this.L.r(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.f52537c0 = b10;
        this.f52538d0 = b10;
        org.telegram.ui.Components.q6 q6Var = this.H;
        q6Var.a();
        q6Var.t(p7.W0(false, LocaleController.formatNumber(getValue(), ','), this.J), true, true);
    }

    public void setValueAnimated(int i10) {
        if (i10 == getValue()) {
            return;
        }
        a(b(i10));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
