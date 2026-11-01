package vh;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.messenger.jc;
import org.telegram.messenger.wp;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
public final class r4 extends View implements y1 {
    public boolean A0;
    public final org.telegram.ui.Components.t5 B0;
    public final org.telegram.ui.Components.t5 C0;
    public final Paint D;
    public final org.telegram.ui.Components.t5 D0;
    public final Paint E;
    public final org.telegram.ui.Components.t5 E0;
    public final Paint F;
    public final org.telegram.ui.Components.t5 F0;
    public final Paint G;
    public final org.telegram.ui.Components.t5 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.t5 I0;
    public final dc J;
    public final org.telegram.ui.Components.t5 J0;
    public final dc K;
    public final org.telegram.ui.Components.t5 K0;
    public final dc L;
    public final p4 L0;
    public float M;
    public final p4 M0;
    public final org.telegram.ui.Components.t5 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.t5 P;
    public final PointF P0;
    public long Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public final Path S;
    public final PointF S0;
    public final PointF T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final org.telegram.ui.ActionBar.m3 W;
    public final PointF W0;
    public boolean X0;
    public q4 f51835a;
    public boolean f51836a0;
    public final ImageReceiver f51837b;
    public boolean f51838b0;
    public final eq f51839c;
    public boolean f51840c0;
    public final Drawable d;
    public boolean f51841d0;
    public final Drawable e;
    public boolean f51842e0;
    public final Drawable f51843f;
    public boolean f51844f0;
    public float f51845g0;
    public final Drawable h;
    public final org.telegram.ui.Components.t5 f51846h0;
    public float f51847i0;
    public float f51848j0;
    public float f51849k0;
    public float f51850l0;
    public final org.telegram.ui.Components.t5 m0;
    public final Drawable f51851n;
    public float f51852n0;
    public boolean f51853o0;
    public final org.telegram.ui.Components.t5 f51854p0;
    public final org.telegram.ui.Components.t5 f51855q0;
    public final Paint f51856r;
    public boolean f51857r0;
    public final Paint f51858s;
    public final float[] f51859s0;
    public final org.telegram.ui.Components.t5 f51860t0;
    public boolean f51861u0;
    public long f51862v0;
    public final Paint f51863w;
    public boolean f51864w0;
    public final Paint f51865x;
    public boolean f51866x0;
    public final Paint f51867y;
    public float f51868y0;
    public boolean f51869z0;

    public r4(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f51837b = imageReceiver;
        this.f51856r = new Paint(1);
        Paint paint = new Paint(1);
        this.f51858s = paint;
        Paint paint2 = new Paint(1);
        this.f51863w = paint2;
        Paint paint3 = new Paint(1);
        this.f51865x = paint3;
        Paint paint4 = new Paint(1);
        this.f51867y = paint4;
        Paint paint5 = new Paint(1);
        this.D = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new dc(this);
        this.K = new dc(this);
        this.L = new dc(this);
        gr grVar = gr.h;
        this.N = new org.telegram.ui.Components.t5(this, 0L, 310L, grVar);
        this.P = new org.telegram.ui.Components.t5(this, 0L, 330L, grVar);
        this.S = new Path();
        this.T = new PointF(-org.telegram.messenger.i0.N(9.666667f), org.telegram.messenger.i0.N(2.3333333f));
        this.U = new PointF(-org.telegram.messenger.i0.N(2.8333333f), org.telegram.messenger.i0.N(8.666667f));
        this.V = new PointF(org.telegram.messenger.i0.N(9.666667f), org.telegram.messenger.i0.N(-3.6666667f));
        this.f51846h0 = new org.telegram.ui.Components.t5(this, 0L, 200L, gr.f26523f);
        this.m0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.f51852n0 = -1.0f;
        this.f51853o0 = true;
        this.f51854p0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.f51855q0 = new org.telegram.ui.Components.t5(this, 0L, 850L, grVar);
        this.f51859s0 = new float[2];
        this.f51860t0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.B0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.C0 = new org.telegram.ui.Components.t5(this, 0L, 650L, grVar);
        this.D0 = new org.telegram.ui.Components.t5(this, 0L, 160L, gr.f26525i);
        this.E0 = new org.telegram.ui.Components.t5(this, 0L, 750L, grVar);
        this.F0 = new org.telegram.ui.Components.t5(this, 0L, 650L, grVar);
        this.G0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.I0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.J0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.K0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.L0 = new p4(this, 2);
        this.M0 = new p4(this, 3);
        this.N0 = new Path();
        this.O0 = new Path();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        setWillNotDraw(false);
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3(this, this);
        this.W = m3Var;
        r0.h0.j(this, m3Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.I = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.H0(this);
        imageReceiver.A0 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(2131232219).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        eq eqVar = new eq(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(6.0f), -13750737), mutate);
        this.f51839c = eqVar;
        eqVar.f25909x = false;
        int L = org.telegram.messenger.i0.L(24.0f);
        int L2 = org.telegram.messenger.i0.L(24.0f);
        eqVar.e = L;
        eqVar.f25904f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232284).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232284).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232154).mutate();
        this.f51843f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232145).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232346).mutate();
        this.f51851n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f7, float f10, double d, float f11, PointF pointF) {
        double d10 = f11;
        pointF.x = (float) ((Math.cos(d) * d10) + f7);
        pointF.y = (float) ((Math.sin(d) * d10) + f10);
    }

    public static void f(Drawable drawable, float f7, float f10) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f7 - max), (int) (f10 - max), (int) (f7 + max), (int) (f10 + max));
    }

    public final boolean b() {
        if (this.H0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f51857r0) {
            if ((!z10 || f12 - f10 <= org.telegram.messenger.i0.L(100.0f)) && Math.abs(f11 - f7) <= f13) {
                return true;
            }
            return false;
        } else if (w7.z8.a(f7, f10, f11, f12) <= f13) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f7) {
        long j10;
        if (f7 > 180.0f) {
            j10 = 620;
        } else {
            j10 = 310;
        }
        this.N.f30532g = j10;
        this.M += f7;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m3 m3Var = this.W;
        if (m3Var != null && m3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(boolean z10, float f7) {
        boolean z11;
        if (Math.abs(f7 - this.H0) < 0.01f) {
            return;
        }
        this.H0 = f7;
        if (!z10) {
            if (f7 > 0.0f && !this.f51857r0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.I0.f(z11, true);
            this.J0.e(true, f7);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.f51861u0 = false;
        if (!z10) {
            org.telegram.ui.Components.t5 t5Var = this.f51860t0;
            t5Var.getClass();
            t5Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        ff ffVar;
        String str;
        ArrayList arrayList;
        q4 q4Var = this.f51835a;
        eq eqVar = this.f51839c;
        ImageReceiver imageReceiver = this.f51837b;
        if (q4Var != null) {
            ArrayList arrayList2 = wp.r1(imageReceiver.d).O1().f48936w.f51963b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((n5) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(jc.g(((n5) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, eqVar, 0L, null, null, 0);
                return;
            }
        }
        xe xeVar = MediaController.Y1;
        if (xeVar != null && (arrayList = xeVar.e) != null && !arrayList.isEmpty()) {
            ffVar = (ff) arrayList.get(0);
        } else {
            ffVar = null;
        }
        if (ffVar != null && (str = ffVar.f14604c) != null) {
            imageReceiver.r0(jc.g(str), "80_80", null, null, eqVar, 0L, null, null, 0);
            return;
        }
        if (ffVar != null) {
            int i10 = ffVar.C;
            String str2 = ffVar.I;
            if (str2 != null) {
                if (ffVar.f14603b) {
                    imageReceiver.r0(jc.g("vthumb://" + i10 + ":" + str2), "80_80", null, null, eqVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(ffVar.J, ffVar.K, true);
                imageReceiver.r0(jc.g("thumb://" + i10 + ":" + str2), "80_80", null, null, eqVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(eqVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51837b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f51837b.R();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(100.0f);
        float f7 = size;
        this.f51847i0 = f7 / 2.0f;
        this.f51848j0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.i0.L(135.0f), f7 * 0.35f);
        float f10 = this.f51847i0;
        this.f51849k0 = f10 - min;
        float f11 = f10 + min;
        this.f51850l0 = f11;
        float f12 = this.f51848j0;
        float L2 = org.telegram.messenger.i0.L(14.0f);
        this.d.setBounds((int) (f11 - L2), (int) (f12 - L2), (int) (f11 + L2), (int) (f12 + L2));
        float f13 = this.f51850l0;
        float f14 = this.f51848j0;
        float L3 = org.telegram.messenger.i0.L(14.0f);
        this.e.setBounds((int) (f13 - L3), (int) (f14 - L3), (int) (f13 + L3), (int) (f14 + L3));
        f(this.f51843f, this.f51849k0, this.f51848j0);
        f(this.h, this.f51849k0, this.f51848j0);
        f(this.f51851n, this.f51849k0, this.f51848j0);
        this.f51837b.y0(this.f51849k0 - org.telegram.messenger.i0.L(20.0f), this.f51848j0 - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f51847i0, this.f51848j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        org.telegram.ui.ActionBar.m3 m3Var = this.W;
        if (m3Var != null) {
            m3Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float i10 = Utilities.i(motionEvent.getX() + 0.0f, this.f51850l0, this.f51849k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i10, y3, this.f51850l0, this.f51848j0, org.telegram.messenger.i0.L(7.0f), true);
        boolean z12 = this.f51861u0;
        dc dcVar = this.L;
        dc dcVar2 = this.J;
        dc dcVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            dcVar2.c(false);
            dcVar3.c(false);
            dcVar.c(false);
        } else if (action == 0 || this.f51864w0) {
            dcVar2.c(c(i10, y3, this.f51847i0, this.f51848j0, org.telegram.messenger.i0.L(60.0f), false));
            if (c(i10, y3, this.f51850l0, this.f51848j0, org.telegram.messenger.i0.L(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            dcVar3.c(z10);
            if (c(i10, y3, this.f51849k0, this.f51848j0, org.telegram.messenger.i0.L(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            dcVar.c(z11);
        }
        p4 p4Var = this.M0;
        p4 p4Var2 = this.L0;
        if (action == 0) {
            this.f51864w0 = true;
            if (dcVar2.f25465i || dcVar3.f25465i) {
                z14 = true;
            }
            this.f51866x0 = z14;
            System.currentTimeMillis();
            this.f51868y0 = i10;
            if (Math.abs(i10 - this.f51847i0) < org.telegram.messenger.i0.L(50.0f)) {
                org.telegram.messenger.i0.h3(p4Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (dcVar3.f25465i) {
                org.telegram.messenger.i0.h3(p4Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f51864w0) {
                this.f51868y0 = Utilities.i(i10, this.f51850l0, this.f51849k0);
                invalidate();
                if (this.f51857r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((o7) this.f51835a).b();
                }
                if (this.f51857r0 && this.f51869z0) {
                    float i11 = Utilities.i(((this.f51848j0 - org.telegram.messenger.i0.L(48.0f)) - y3) / (org.telegram.messenger.i0.f16172q.y / 2.0f), 1.0f, 0.0f);
                    o8 o8Var = ((o7) this.f51835a).f51618a;
                    o8Var.V0.b(true, i11);
                    o8Var.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f51864w0) {
                this.f51864w0 = false;
                this.f51866x0 = false;
                org.telegram.messenger.i0.r(p4Var2);
                org.telegram.messenger.i0.r(p4Var);
                boolean z15 = this.f51857r0;
                if (!z15 && dcVar.f25465i) {
                    ((o7) this.f51835a).c();
                } else if (z15 && this.f51869z0) {
                    if (dcVar.f25465i) {
                        this.f51869z0 = false;
                        this.G0.e(true, 1.0f);
                        o2 o2Var = ((o7) this.f51835a).f51618a.T0;
                        o2Var.f51607a.t(dd.L0(2131744680, null), true, true);
                        o2Var.invalidate();
                    } else {
                        this.f51857r0 = false;
                        this.f51862v0 = SystemClock.elapsedRealtime();
                        this.f51861u0 = true;
                        ((o7) this.f51835a).e(false);
                    }
                } else if (dcVar2.f25465i) {
                    if (b()) {
                        ((o7) this.f51835a).a();
                    } else if (!this.f51853o0 && !this.f51857r0 && !this.f51869z0) {
                        ((o7) this.f51835a).d();
                    } else if (!this.f51857r0) {
                        if (o8.c(((o7) this.f51835a).f51618a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((o7) this.f51835a).f(new p4(this, 1), false);
                        }
                    } else {
                        this.f51857r0 = false;
                        this.f51862v0 = SystemClock.elapsedRealtime();
                        this.f51861u0 = true;
                        ((o7) this.f51835a).e(false);
                    }
                }
                this.f51869z0 = false;
                if (dcVar3.f25465i) {
                    d(180.0f);
                    ((o7) this.f51835a).b();
                }
                dcVar2.c(false);
                dcVar3.c(false);
                dcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.X0 = c10;
        return z13;
    }

    public void setDelegate(q4 q4Var) {
        this.f51835a = q4Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f51858s.setColor(i0.b.f(f7, -1, -16777216));
        this.f51865x.setColor(i0.b.f(f7, 1677721600, 369098752));
        this.E.setColor(i0.b.f(f7, 1493172223, 285212671));
        this.F.setColor(i0.b.f(f7, 402653184, 805306368));
        int f10 = i0.b.f(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f10, mode));
        this.f51843f.setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), mode));
    }
}
