package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.w10;
public abstract class v8 extends View {
    public LinearGradient D;
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.e6 H;
    public final org.telegram.ui.Components.e6 I;
    public final dq[] J;
    public final Paint K;
    public final qz0 L;
    public final org.telegram.ui.Components.t5 M;
    public final org.telegram.ui.Components.t5 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.p6 f47596a;
    public final RectF f47597a0;
    public final Paint f47598b;
    public final Path f47599b0;
    public final Paint f47600c;
    public float f47601c0;
    public final Paint d;
    public float f47602d0;
    public final Paint e;
    public int[] f47603e0;
    public final Paint f47604f;
    public final fe.b f47605f0;
    public float f47606g0;
    public final s8 h;
    public float f47607h0;
    public long f47608i0;
    public int f47609j0;
    public boolean f47610k0;
    public ValueAnimator f47611l0;
    public final s8 f47612n;
    public int f47613r;
    public int f47614s;
    public ValueAnimator f47615w;
    public int f47616x;
    public int f47617y;

    public v8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f47598b = new Paint(1);
        this.f47600c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f47604f = new Paint(1);
        this.h = new s8(0, 300);
        this.f47612n = new s8(2, 30);
        this.f47613r = -1135603;
        this.f47614s = -404714;
        this.f47616x = -1135603;
        this.f47617y = -404714;
        this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f47613r, this.f47614s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.H = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, true);
        this.I = e6Var2;
        this.J = new dq[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new qz0(cd.L0(2131745055, null), 14.0f, org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
        gr grVar = gr.h;
        this.M = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.N = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.P = -1L;
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new Path();
        this.V = new Path();
        this.W = new Path();
        this.f47597a0 = new RectF();
        this.f47599b0 = new Path();
        this.f47601c0 = 0.0f;
        this.f47605f0 = new fe.b(this, grVar, 320L);
        this.f47596a = p6Var;
        Drawable f7 = i0.a.f(context, 2131232306);
        this.G = f7;
        f7.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.w(org.telegram.messenger.i0.L(21.0f));
        e6Var.setCallback(this);
        Point point = org.telegram.messenger.i0.f16026q;
        e6Var.M = point.x;
        e6Var.f25695b = 17;
        e6Var2.u(-570425345);
        e6Var2.w(org.telegram.messenger.i0.L(11.0f));
        e6Var2.setCallback(this);
        e6Var2.M = point.x;
        e6Var2.f25695b = 17;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, p6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.f47611l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47601c0, f7);
        this.f47611l0 = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 7));
        int value = getValue();
        this.f47611l0.addListener(new qz(this, f7, value));
        this.f47611l0.setDuration(320L);
        this.f47611l0.setInterpolator(gr.h);
        this.f47611l0.start();
        if (c(f7) != value) {
            e(c(f7));
        }
        org.telegram.ui.Components.e6 e6Var = this.H;
        e6Var.a();
        e6Var.t(h8.X0(false, cd.E(c(f7), ','), this.J), true, true);
    }

    public final float b(int i10) {
        int i11;
        int i12 = 1;
        while (true) {
            int[] iArr = this.f47603e0;
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
            return this.f47603e0[0];
        }
        if (f7 >= 1.0f) {
            return this.f47603e0[iArr.length - 1];
        }
        int[] iArr2 = this.f47603e0;
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
        org.telegram.ui.Components.t5 t5Var;
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
        this.D.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.D;
        Paint paint3 = this.f47600c;
        paint3.setShader(linearGradient);
        int f15 = i0.b.f(this.f47601c0, this.f47613r, this.f47614s);
        Path path2 = this.U;
        path2.rewind();
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), direction);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, this.f47613r);
        Paint paint4 = this.f47598b;
        paint4.setColor(r12);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = org.telegram.messenger.i0.T1(rectF3.left + org.telegram.messenger.i0.L(24.0f), rectF3.right, b10);
        Path path3 = this.V;
        path3.rewind();
        path3.addRoundRect(rectF3, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), direction);
        s8 s8Var = this.h;
        s8Var.g(rectF2);
        float f16 = this.f47601c0;
        s8Var.h = (f16 * 15.0f) + 1.0f;
        s8Var.f47464j = (int) (s8Var.f47459b.size() * ((f16 * 0.85f) + 0.15f));
        s8Var.d();
        canvas.save();
        canvas.clipPath(path2);
        s8Var.a(canvas, f15);
        long j10 = this.P;
        int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        org.telegram.ui.Components.t5 t5Var2 = this.N;
        org.telegram.ui.Components.t5 t5Var3 = this.M;
        qz0 qz0Var = this.L;
        Paint paint5 = this.K;
        if (i12 != 0 && b((int) j10) < 1.0f && b((int) this.P) > 0.0f) {
            float L = rectF2.left + org.telegram.messenger.i0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.i0.L(24.0f)));
            if (Math.abs((rectF3.right - org.telegram.messenger.i0.L(10.0f)) - L) < org.telegram.messenger.i0.L(14.0f)) {
                z12 = true;
            } else {
                z12 = false;
            }
            float d = t5Var3.d(z12);
            int L2 = org.telegram.messenger.i0.L(9.0f);
            int L3 = org.telegram.messenger.i0.L(16.0f);
            if (Math.abs((rectF3.right - org.telegram.messenger.i0.L(10.0f)) - L) < org.telegram.messenger.i0.L(12.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            float W1 = org.telegram.messenger.i0.W1(t5Var2.d(z13), L2, L3);
            if (L + qz0Var.f29774c + (org.telegram.messenger.i0.L(16.0f) * 2) > rectF2.right) {
                f14 = (L - W1) - qz0Var.f29774c;
            } else {
                f14 = L + W1;
            }
            float f17 = f14;
            paint5.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.t6.r1(0.6f, f15));
            paint = paint4;
            f7 = b10;
            t5Var = t5Var2;
            i10 = f15;
            rectF = rectF3;
            canvas.drawLine(L, org.telegram.messenger.i0.T1(rectF2.top, rectF2.centerY(), d), L, org.telegram.messenger.i0.T1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.L.c(f17, rectF2.centerY(), 0.6f, i10, canvas);
            canvas2 = canvas;
        } else {
            paint = paint4;
            f7 = b10;
            t5Var = t5Var2;
            i10 = f15;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        s8Var.a(canvas2, -1);
        long j11 = this.P;
        if (j11 != -1 && b((int) j11) < 1.0f && b((int) this.P) > 0.0f) {
            float L4 = rectF2.left + org.telegram.messenger.i0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.i0.L(24.0f)));
            if (Math.abs((rectF.right - org.telegram.messenger.i0.L(10.0f)) - L4) < org.telegram.messenger.i0.L(14.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d10 = t5Var3.d(z10);
            int L5 = org.telegram.messenger.i0.L(9.0f);
            int L6 = org.telegram.messenger.i0.L(16.0f);
            if (Math.abs((rectF.right - org.telegram.messenger.i0.L(10.0f)) - L4) < org.telegram.messenger.i0.L(12.0f)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float W12 = org.telegram.messenger.i0.W1(t5Var.d(z11), L5, L6);
            if (qz0Var.f29774c + L4 + (org.telegram.messenger.i0.L(16.0f) * 2) > rectF2.right) {
                f13 = (L4 - W12) - qz0Var.f29774c;
            } else {
                f13 = W12 + L4;
            }
            float f18 = f13;
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.f47596a)));
            i11 = i10;
            canvas2.drawLine(L4, org.telegram.messenger.i0.T1(rectF2.top, rectF2.centerY(), d10), L4, org.telegram.messenger.i0.T1(rectF2.bottom, rectF2.centerY(), d10), paint2);
            this.L.c(f18, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        } else {
            i11 = i10;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int f19 = i0.b.f(0.5f, paint.getColor(), this.f47614s);
            Paint paint6 = this.d;
            paint6.setColor(f19);
            Path path5 = this.W;
            path5.rewind();
            f10 = 0.5f;
            f11 = 2.0f;
            f12 = 0.15f;
            path5.addRoundRect(height - org.telegram.messenger.i0.L(1.0f), centerY - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + height, centerY + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), direction);
            path5.addRoundRect(height - org.telegram.messenger.i0.L(6.0f), centerY - org.telegram.messenger.i0.L(1.0f), height + org.telegram.messenger.i0.L(6.0f), centerY + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f10 = 0.5f;
            f11 = 2.0f;
            f12 = 0.15f;
        }
        float L7 = (rectF.right - org.telegram.messenger.i0.L(16.0f)) - org.telegram.messenger.i0.L(4.0f);
        float centerY2 = rectF.centerY() - (org.telegram.messenger.i0.L(16.0f) / f11);
        float L8 = rectF.right - org.telegram.messenger.i0.L(4.0f);
        float L9 = (org.telegram.messenger.i0.L(16.0f) / f11) + rectF.centerY();
        RectF rectF4 = this.S;
        rectF4.set(L7, centerY2, L8, L9);
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.e);
        float L10 = org.telegram.messenger.i0.L(9.0f) / rectF2.width();
        float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(rectF4.left, rectF4.right, f7), org.telegram.messenger.i0.T1(rectF4.left + org.telegram.messenger.i0.L(9.0f), rectF4.right - org.telegram.messenger.i0.L(9.0f), f7), Math.min(Utilities.l(f7 / L10), Utilities.l((1.0f - f7) / L10)));
        org.telegram.ui.Components.e6 e6Var = this.I;
        float c10 = e6Var.c() + org.telegram.messenger.i0.L(20.0f);
        org.telegram.ui.Components.e6 e6Var2 = this.H;
        float max = Math.max(c10, e6Var2.c() + org.telegram.messenger.i0.L(50.0f));
        float i13 = Utilities.i(T1 - (max / f11), (rectF2.right - max) - org.telegram.messenger.i0.L(4.0f), rectF2.left + org.telegram.messenger.i0.L(4.0f));
        float L11 = rectF2.top - org.telegram.messenger.i0.L(21.0f);
        float L12 = rectF2.top - org.telegram.messenger.i0.L(21.0f);
        RectF rectF5 = this.f47597a0;
        rectF5.set(i13, L11 - org.telegram.messenger.i0.L(44.0f), max + i13, L12);
        float height2 = rectF5.height();
        float f20 = height2 / f11;
        float i14 = Utilities.i(T1, rectF5.right, rectF5.left);
        float i15 = Utilities.i(i14 - org.telegram.messenger.i0.L(9.0f), rectF5.right, rectF5.left);
        float i16 = Utilities.i(org.telegram.messenger.i0.L(9.0f) + i14, rectF5.right, rectF5.left);
        float i17 = Utilities.i(this.f47601c0 - this.f47602d0, 1.0f, -1.0f) * 60.0f;
        float f21 = f12;
        float L13 = rectF5.bottom + org.telegram.messenger.i0.L(8.0f);
        Path path6 = this.f47599b0;
        path6.rewind();
        float f22 = rectF5.left;
        float f23 = rectF5.top;
        RectF rectF6 = this.T;
        rectF6.set(f22, f23, f22 + height2, f23 + height2);
        path6.arcTo(rectF6, -180.0f, 90.0f);
        float f24 = rectF5.right;
        float f25 = rectF5.top;
        rectF6.set(f24 - height2, f25, f24, f25 + height2);
        path6.arcTo(rectF6, -90.0f, 90.0f);
        float f26 = rectF5.right;
        float f27 = rectF5.bottom;
        rectF6.set(f26 - height2, f27 - height2, f26, f27);
        int i18 = i11;
        path6.arcTo(rectF6, 0.0f, (float) Utilities.h(((Math.acos(Utilities.l((i16 - rectF6.centerX()) / f20)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d));
        float f28 = 0.7f * height2;
        if (i15 < rectF5.right - f28) {
            path6.lineTo(i16, rectF5.bottom);
            path6.lineTo(i14 + f11, rectF5.bottom + org.telegram.messenger.i0.L(8.0f));
        }
        path6.lineTo(i14, rectF5.bottom + org.telegram.messenger.i0.L(8.0f) + 1.0f);
        if (i16 > rectF5.left + f28) {
            path6.lineTo(i14 - f11, rectF5.bottom + org.telegram.messenger.i0.L(8.0f));
            path6.lineTo(i15, rectF5.bottom);
        }
        float f29 = rectF5.left;
        float f30 = rectF5.bottom;
        rectF6.set(f29, f30 - height2, f29 + height2, f30);
        float h = ((float) Utilities.h(((Math.acos(Utilities.l((i15 - rectF6.left) / f20)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d)) + 90.0f;
        path6.arcTo(rectF6, h, 180.0f - h);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = org.telegram.messenger.i0.P;
        rectF7.set(rectF5);
        rectF7.inset(-org.telegram.messenger.i0.L(12.0f), -org.telegram.messenger.i0.L(12.0f));
        s8 s8Var2 = this.f47612n;
        s8Var2.g(rectF7);
        s8Var2.h = (this.f47601c0 * 15.0f) + 1.0f;
        s8Var2.d();
        canvas2.save();
        s8Var2.a(canvas2, i18);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i17, i14, L13);
        if (Math.abs(this.f47601c0 - this.f47602d0) > 0.001f) {
            this.f47602d0 = org.telegram.messenger.i0.T1(this.f47602d0, this.f47601c0, 0.1f);
            invalidate();
        }
        this.f47604f.setShader(this.D);
        canvas2.drawPath(path6, this.f47604f);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i17, i14, L13);
        s8Var2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f31 = 1.0f - (this.f47605f0.e * f21);
        canvas2.scale(f31, f31, rectF5.centerX(), rectF5.top - (rectF5.height() * f10));
        this.G.setBounds((int) ((rectF5.centerX() - (e6Var2.c() / f11)) + org.telegram.messenger.i0.L(-12.0f)), (int) (rectF5.centerY() - org.telegram.messenger.i0.L(10.0f)), (int) ((rectF5.centerX() - (e6Var2.c() / f11)) + org.telegram.messenger.i0.L(8.0f)), (int) (rectF5.centerY() + org.telegram.messenger.i0.L(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        e6Var2.o(rectF5.left + org.telegram.messenger.i0.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        e6Var2.draw(canvas2);
        canvas2.restore();
        e6Var.o(rectF5.left, rectF5.top + org.telegram.messenger.i0.L(10.0f), rectF5.right, rectF5.bottom + org.telegram.messenger.i0.L(10.0f));
        e6Var.B = (int) (this.f47605f0.e * 255.0f);
        e6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f47606g0 = motionEvent.getX();
            this.f47607h0 = motionEvent.getY();
            this.f47609j0 = motionEvent.getPointerId(0);
            this.f47608i0 = System.currentTimeMillis();
            this.f47610k0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f47609j0) {
            float x10 = motionEvent.getX() - this.f47606g0;
            float y3 = motionEvent.getY() - this.f47607h0;
            if (!this.f47610k0 && Math.abs(x10) > Math.abs(y3 * 1.5f) && Math.abs(x10) > org.telegram.messenger.i0.e) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f47610k0 = true;
                ValueAnimator valueAnimator = this.f47611l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.f47610k0) {
                int value = getValue();
                this.f47601c0 = Utilities.l((x10 / (getWidth() * 1.0f)) + this.f47601c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.e6 e6Var = this.H;
                    e6Var.a();
                    e6Var.t(h8.X0(false, cd.E(getValue(), ','), this.J), true, true);
                }
                this.f47606g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.f47610k0 && motionEvent.getPointerId(0) == this.f47609j0 && w7.z8.a(this.f47606g0, this.f47607h0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.i0.e && ((float) (System.currentTimeMillis() - this.f47608i0)) <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.Q;
                    float l4 = Utilities.l((x12 - rectF.left) / rectF.width());
                    long j10 = this.P;
                    if (j10 > 0 && Math.abs(b((int) j10) - l4) < 0.035f) {
                        l4 = Utilities.l(b((int) this.P));
                    }
                    a(l4);
                }
            }
            this.f47610k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i10);

    public final void f(int i10, int i11, boolean z10) {
        if (this.f47616x == i10 && this.f47617y == i11) {
            return;
        }
        ValueAnimator valueAnimator = this.f47615w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f47615w = null;
        }
        if (z10) {
            int i12 = this.f47613r;
            int i13 = this.f47614s;
            this.f47616x = i10;
            this.f47617y = i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f47615w = ofFloat;
            ofFloat.addUpdateListener(new w10(this, i12, i10, i13, i11, 2));
            this.f47615w.addListener(new u8(this, i12, i10, i13, i11));
            this.f47615w.setInterpolator(gr.h);
            this.f47615w.setDuration(420L);
            this.f47615w.start();
            return;
        }
        this.f47616x = i10;
        this.f47613r = i10;
        this.f47617y = i11;
        this.f47614s = i11;
        this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.f47613r, this.f47614s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void g(String str) {
        this.f47605f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.e6 e6Var = this.I;
        e6Var.a();
        e6Var.t(str, true, true);
    }

    public float getProgress() {
        return this.f47601c0;
    }

    public int getValue() {
        return c(this.f47601c0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        int L = org.telegram.messenger.i0.L(14.0f);
        int L2 = org.telegram.messenger.i0.L(135.0f);
        this.Q.set(L, L2, measuredWidth - L, org.telegram.messenger.i0.L(24.0f) + L2);
        this.f47600c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j10) {
        this.P = j10;
        invalidate();
    }

    public void setTopText(String str) {
        this.L.q(str);
    }

    public void setValue(int i10) {
        float b10 = b(i10);
        this.f47601c0 = b10;
        this.f47602d0 = b10;
        org.telegram.ui.Components.e6 e6Var = this.H;
        e6Var.a();
        e6Var.t(h8.X0(false, cd.E(getValue(), ','), this.J), true, true);
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
