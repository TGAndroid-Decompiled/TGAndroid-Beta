package zh;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;
public abstract class k8 extends View {
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.p6 H;
    public final org.telegram.ui.Components.p6 I;
    public final nq[] J;
    public final Paint K;
    public final f01 L;
    public final org.telegram.ui.Components.e6 M;
    public final org.telegram.ui.Components.e6 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.f6 f52181a;
    public final RectF f52182a0;
    public final Paint f52183b;
    public final Path f52184b0;
    public final Paint f52185c;
    public float f52186c0;
    public final Paint d;
    public float f52187d0;
    public final Paint f52188e;
    public int[] f52189e0;
    public final Paint f52190f;
    public final le.b f52191f0;
    public float f52192g0;
    public final h8 h;
    public float f52193h0;
    public long f52194i0;
    public int f52195j0;
    public boolean f52196k0;
    public ValueAnimator f52197l0;
    public final h8 f52198n;
    public int f52199r;
    public int f52200s;
    public ValueAnimator v;
    public int f52201w;
    public int f52202x;
    public LinearGradient f52203y;

    public k8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f52183b = new Paint(1);
        this.f52185c = new Paint(1);
        this.d = new Paint(1);
        this.f52188e = new Paint(1);
        this.f52190f = new Paint(1);
        this.h = new h8(0, 300);
        this.f52198n = new h8(2, 30);
        this.f52199r = -1135603;
        this.f52200s = -404714;
        this.f52201w = -1135603;
        this.f52202x = -404714;
        this.f52203y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f52199r, this.f52200s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.H = p6Var;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, true, false);
        this.I = p6Var2;
        this.J = new nq[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new f01(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        pr prVar = pr.h;
        this.M = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.N = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.P = -1L;
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new Path();
        this.V = new Path();
        this.W = new Path();
        this.f52182a0 = new RectF();
        this.f52184b0 = new Path();
        this.f52186c0 = 0.0f;
        this.f52191f0 = new le.b(this, prVar, 320L);
        this.f52181a = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.G = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.t(AndroidUtilities.dp(21.0f));
        p6Var.setCallback(this);
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.f29312b = 17;
        p6Var2.r(-570425345);
        p6Var2.t(AndroidUtilities.dp(11.0f));
        p6Var2.setCallback(this);
        p6Var2.G = AndroidUtilities.displaySize.x;
        p6Var2.f29312b = 17;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f52197l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52186c0, f7);
        this.f52197l0 = ofFloat;
        ofFloat.addUpdateListener(new ki.a(this, 27));
        int value = getValue();
        this.f52197l0.addListener(new h00(this, f7, value));
        this.f52197l0.setDuration(320L);
        this.f52197l0.setInterpolator(pr.h);
        this.f52197l0.start();
        if (c(f7) != value) {
            e(c(f7));
        }
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.b();
        p6Var.q(v7.V0(false, LocaleController.formatNumber(c(f7), ','), this.J), true, true);
    }

    public final float b(int i10) {
        int i11 = 1;
        while (true) {
            int[] iArr = this.f52189e0;
            if (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i10 <= i12) {
                    int i13 = i11 - 1;
                    int i14 = iArr[i13];
                    return (i13 + ((i10 - i14) / (i12 - i14))) / (iArr.length - 1);
                }
                i11++;
            } else {
                return 1.0f;
            }
        }
    }

    public final int c(float f7) {
        int i10;
        int[] iArr;
        if (f7 <= 0.0f) {
            return this.f52189e0[0];
        }
        if (f7 >= 1.0f) {
            return this.f52189e0[iArr.length - 1];
        }
        int[] iArr2 = this.f52189e0;
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
        org.telegram.ui.Components.e6 e6Var;
        RectF rectF;
        Paint paint;
        float f7;
        int i10;
        Path.Direction direction;
        Paint paint2;
        org.telegram.ui.Components.e6 e6Var2;
        Canvas canvas2;
        int i11;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        boolean z12;
        boolean z13;
        float f12;
        super.dispatchDraw(canvas);
        Matrix matrix = this.E;
        matrix.reset();
        RectF rectF2 = this.Q;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.f52203y.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.f52203y;
        Paint paint3 = this.f52185c;
        paint3.setShader(linearGradient);
        int d = i0.a.d(this.f52186c0, this.f52199r, this.f52200s);
        Path path = this.U;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, this.f52199r);
        Paint paint4 = this.f52183b;
        paint4.setColor(l1);
        canvas.drawPath(path, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(24.0f), rectF3.right, b10);
        Path path2 = this.V;
        path2.rewind();
        path2.addRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction2);
        h8 h8Var = this.h;
        h8Var.g(rectF2);
        float f13 = this.f52186c0;
        h8Var.h = (f13 * 15.0f) + 1.0f;
        h8Var.f52029j = (int) (h8Var.f52023b.size() * ((f13 * 0.85f) + 0.15f));
        h8Var.d();
        canvas.save();
        canvas.clipPath(path);
        h8Var.a(canvas, d);
        long j3 = this.P;
        org.telegram.ui.Components.e6 e6Var3 = this.N;
        org.telegram.ui.Components.e6 e6Var4 = this.M;
        f01 f01Var = this.L;
        Paint paint5 = this.K;
        if (j3 != -1 && b((int) j3) < 1.0f && b((int) this.P) > 0.0f) {
            float clamp01 = (Utilities.clamp01(b((int) this.P)) * (rectF2.width() - AndroidUtilities.dp(24.0f))) + rectF2.left + AndroidUtilities.dp(12.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(14.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float e7 = e6Var4.e(z12);
            int dp = AndroidUtilities.dp(9.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF3.right - AndroidUtilities.dp(10.0f)) - clamp01) < AndroidUtilities.dp(12.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            float lerp = AndroidUtilities.lerp(dp, dp2, e6Var3.e(z13));
            if (clamp01 + f01Var.f25874c + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f12 = (clamp01 - lerp) - f01Var.f25874c;
            } else {
                f12 = clamp01 + lerp;
            }
            float f14 = f12;
            paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.j6.l1(0.6f, d));
            e6Var = e6Var3;
            paint = paint4;
            rectF = rectF3;
            f7 = b10;
            i10 = d;
            e6Var2 = e6Var4;
            canvas.drawLine(clamp01, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e7), clamp01, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e7), paint5);
            direction = direction2;
            paint2 = paint5;
            this.L.c(f14, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        } else {
            e6Var = e6Var3;
            rectF = rectF3;
            paint = paint4;
            f7 = b10;
            i10 = d;
            direction = direction2;
            paint2 = paint5;
            e6Var2 = e6Var4;
            canvas2 = canvas;
        }
        canvas2.drawPath(path2, paint3);
        canvas2.clipPath(path2);
        h8Var.a(canvas2, -1);
        long j10 = this.P;
        if (j10 != -1 && b((int) j10) < 1.0f && b((int) this.P) > 0.0f) {
            float dp3 = rectF2.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(b((int) this.P)) * (rectF2.width() - AndroidUtilities.dp(24.0f)));
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(14.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = e6Var2.e(z10);
            int dp4 = AndroidUtilities.dp(9.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            if (Math.abs((rectF.right - AndroidUtilities.dp(10.0f)) - dp3) < AndroidUtilities.dp(12.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float lerp2 = AndroidUtilities.lerp(dp4, dp5, e6Var.e(z11));
            if (f01Var.f25874c + dp3 + (AndroidUtilities.dp(16.0f) * 2) > rectF2.right) {
                f11 = (dp3 - lerp2) - f01Var.f25874c;
            } else {
                f11 = lerp2 + dp3;
            }
            float f15 = f11;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, this.f52181a)));
            i11 = i10;
            canvas2.drawLine(dp3, AndroidUtilities.lerp(rectF2.top, rectF2.centerY(), e10), dp3, AndroidUtilities.lerp(rectF2.bottom, rectF2.centerY(), e10), paint2);
            this.L.c(f15, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i11 = i10;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int d10 = i0.a.d(0.5f, paint.getColor(), this.f52200s);
            Paint paint6 = this.d;
            paint6.setColor(d10);
            Path path3 = this.W;
            path3.rewind();
            f10 = 0.5f;
            Path.Direction direction3 = direction;
            path3.addRoundRect(height - AndroidUtilities.dp(1.0f), centerY - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + height, centerY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            path3.addRoundRect(height - AndroidUtilities.dp(6.0f), centerY - AndroidUtilities.dp(1.0f), height + AndroidUtilities.dp(6.0f), centerY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction3);
            canvas2.drawPath(path3, paint6);
        } else {
            f10 = 0.5f;
        }
        float dp6 = (rectF.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f);
        float centerY2 = rectF.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f);
        float dp7 = rectF.right - AndroidUtilities.dp(4.0f);
        float dp8 = (AndroidUtilities.dp(16.0f) / 2.0f) + rectF.centerY();
        RectF rectF4 = this.S;
        rectF4.set(dp6, centerY2, dp7, dp8);
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f52188e);
        float dp9 = AndroidUtilities.dp(9.0f) / rectF2.width();
        float f16 = f7;
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF4.left, rectF4.right, f16), AndroidUtilities.lerp(rectF4.left + AndroidUtilities.dp(9.0f), rectF4.right - AndroidUtilities.dp(9.0f), f16), Math.min(Utilities.clamp01(f16 / dp9), Utilities.clamp01((1.0f - f16) / dp9)));
        org.telegram.ui.Components.p6 p6Var = this.I;
        float d11 = p6Var.d() + AndroidUtilities.dp(20.0f);
        org.telegram.ui.Components.p6 p6Var2 = this.H;
        float max = Math.max(d11, p6Var2.d() + AndroidUtilities.dp(50.0f));
        float clamp = Utilities.clamp(lerp3 - (max / 2.0f), (rectF2.right - max) - AndroidUtilities.dp(4.0f), rectF2.left + AndroidUtilities.dp(4.0f));
        float dp10 = rectF2.top - AndroidUtilities.dp(21.0f);
        float dp11 = rectF2.top - AndroidUtilities.dp(21.0f);
        RectF rectF5 = this.f52182a0;
        rectF5.set(clamp, dp10 - AndroidUtilities.dp(44.0f), max + clamp, dp11);
        float height2 = rectF5.height();
        float f17 = height2 / 2.0f;
        float clamp2 = Utilities.clamp(lerp3, rectF5.right, rectF5.left);
        float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF5.right, rectF5.left);
        float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
        float clamp5 = Utilities.clamp(this.f52186c0 - this.f52187d0, 1.0f, -1.0f) * 60.0f;
        float dp12 = rectF5.bottom + AndroidUtilities.dp(8.0f);
        Path path4 = this.f52184b0;
        path4.rewind();
        float f18 = rectF5.left;
        float f19 = rectF5.top;
        RectF rectF6 = this.T;
        rectF6.set(f18, f19, f18 + height2, f19 + height2);
        path4.arcTo(rectF6, -180.0f, 90.0f);
        float f20 = rectF5.right;
        float f21 = rectF5.top;
        rectF6.set(f20 - height2, f21, f20, f21 + height2);
        path4.arcTo(rectF6, -90.0f, 90.0f);
        float f22 = rectF5.right;
        float f23 = rectF5.bottom;
        rectF6.set(f22 - height2, f23 - height2, f22, f23);
        path4.arcTo(rectF6, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - rectF6.centerX()) / f17)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
        float f24 = 0.7f * height2;
        if (clamp3 < rectF5.right - f24) {
            path4.lineTo(clamp4, rectF5.bottom);
            path4.lineTo(clamp2 + 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
        }
        path4.lineTo(clamp2, rectF5.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
        if (clamp4 > rectF5.left + f24) {
            path4.lineTo(clamp2 - 2.0f, rectF5.bottom + AndroidUtilities.dp(8.0f));
            path4.lineTo(clamp3, rectF5.bottom);
        }
        float f25 = rectF5.left;
        float f26 = rectF5.bottom;
        rectF6.set(f25, f26 - height2, f25 + height2, f26);
        float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - rectF6.left) / f17)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
        path4.arcTo(rectF6, clamp6, 180.0f - clamp6);
        path4.lineTo(rectF5.left, rectF5.bottom);
        path4.close();
        RectF rectF7 = AndroidUtilities.rectTmp;
        rectF7.set(rectF5);
        rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
        h8 h8Var2 = this.f52198n;
        h8Var2.g(rectF7);
        h8Var2.h = (this.f52186c0 * 15.0f) + 1.0f;
        h8Var2.d();
        canvas2.save();
        h8Var2.a(canvas2, i11);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(clamp5, clamp2, dp12);
        if (Math.abs(this.f52186c0 - this.f52187d0) > 0.001f) {
            this.f52187d0 = AndroidUtilities.lerp(this.f52187d0, this.f52186c0, 0.1f);
            invalidate();
        }
        this.f52190f.setShader(this.f52203y);
        canvas2.drawPath(path4, this.f52190f);
        canvas2.save();
        canvas2.clipPath(path4);
        canvas2.rotate(-clamp5, clamp2, dp12);
        h8Var2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f27 = 1.0f - (this.f52191f0.f15395e * 0.15f);
        canvas2.scale(f27, f27, rectF5.centerX(), rectF5.top - (rectF5.height() * f10));
        this.G.setBounds((int) ((rectF5.centerX() - (p6Var2.d() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF5.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF5.centerX() - (p6Var2.d() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF5.centerY() + AndroidUtilities.dp(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        p6Var2.l(rectF5.left + AndroidUtilities.dp(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        p6Var2.draw(canvas2);
        canvas2.restore();
        p6Var.l(rectF5.left, rectF5.top + AndroidUtilities.dp(10.0f), rectF5.right, rectF5.bottom + AndroidUtilities.dp(10.0f));
        p6Var.f29330w = (int) (this.f52191f0.f15395e * 255.0f);
        p6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f52192g0 = motionEvent.getX();
            this.f52193h0 = motionEvent.getY();
            this.f52195j0 = motionEvent.getPointerId(0);
            this.f52194i0 = System.currentTimeMillis();
            this.f52196k0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f52195j0) {
            float x10 = motionEvent.getX() - this.f52192g0;
            float y3 = motionEvent.getY() - this.f52193h0;
            if (!this.f52196k0 && Math.abs(x10) > Math.abs(y3 * 1.5f) && Math.abs(x10) > AndroidUtilities.touchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f52196k0 = true;
                ValueAnimator valueAnimator = this.f52197l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f52196k0) {
                int value = getValue();
                this.f52186c0 = Utilities.clamp01((x10 / (getWidth() * 1.0f)) + this.f52186c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.p6 p6Var = this.H;
                    p6Var.b();
                    p6Var.q(v7.V0(false, LocaleController.formatNumber(getValue(), ','), this.J), true, true);
                }
                this.f52192g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f52196k0 && motionEvent.getPointerId(0) == this.f52195j0 && v7.z6.a(this.f52192g0, this.f52193h0, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && ((float) (System.currentTimeMillis() - this.f52194i0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
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
            this.f52196k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.f52201w == i10 && this.f52202x == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.v = null;
        }
        if (z10) {
            int i12 = this.f52199r;
            int i13 = this.f52200s;
            this.f52201w = i10;
            this.f52202x = i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new q20(this, i12, i10, i13, i11, 2));
            this.v.addListener(new j8(this, i12, i10, i13, i11));
            this.v.setInterpolator(pr.h);
            this.v.setDuration(420L);
            this.v.start();
            return;
        }
        this.f52201w = i10;
        this.f52199r = i10;
        this.f52202x = i11;
        this.f52200s = i11;
        this.f52203y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f52199r, this.f52200s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f52191f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.p6 p6Var = this.I;
        p6Var.b();
        p6Var.q(str, true, true);
    }

    public float getProgress() {
        return this.f52186c0;
    }

    public int getValue() {
        return c(this.f52186c0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int dp = AndroidUtilities.dp(14.0f);
        int dp2 = AndroidUtilities.dp(135.0f);
        this.Q.set(dp, dp2, measuredWidth - dp, AndroidUtilities.dp(24.0f) + dp2);
        this.f52185c.setColor(-1069811);
        this.f52188e.setColor(-1);
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
        this.f52186c0 = b10;
        this.f52187d0 = b10;
        org.telegram.ui.Components.p6 p6Var = this.H;
        p6Var.b();
        p6Var.q(v7.V0(false, LocaleController.formatNumber(getValue(), ','), this.J), true, true);
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
