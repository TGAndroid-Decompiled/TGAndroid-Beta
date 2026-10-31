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
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
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
    public q4 f51850a;
    public boolean f51851a0;
    public final ImageReceiver f51852b;
    public boolean f51853b0;
    public final eq f51854c;
    public boolean f51855c0;
    public final Drawable d;
    public boolean f51856d0;
    public final Drawable e;
    public boolean f51857e0;
    public final Drawable f51858f;
    public boolean f51859f0;
    public float f51860g0;
    public final Drawable h;
    public final org.telegram.ui.Components.t5 f51861h0;
    public float f51862i0;
    public float f51863j0;
    public float f51864k0;
    public float f51865l0;
    public final org.telegram.ui.Components.t5 m0;
    public final Drawable f51866n;
    public float f51867n0;
    public boolean f51868o0;
    public final org.telegram.ui.Components.t5 f51869p0;
    public final org.telegram.ui.Components.t5 f51870q0;
    public final Paint f51871r;
    public boolean f51872r0;
    public final Paint f51873s;
    public final float[] f51874s0;
    public final org.telegram.ui.Components.t5 f51875t0;
    public boolean f51876u0;
    public long f51877v0;
    public final Paint f51878w;
    public boolean f51879w0;
    public final Paint f51880x;
    public boolean f51881x0;
    public final Paint f51882y;
    public float f51883y0;
    public boolean f51884z0;

    public r4(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f51852b = imageReceiver;
        this.f51871r = new Paint(1);
        Paint paint = new Paint(1);
        this.f51873s = paint;
        Paint paint2 = new Paint(1);
        this.f51878w = paint2;
        Paint paint3 = new Paint(1);
        this.f51880x = paint3;
        Paint paint4 = new Paint(1);
        this.f51882y = paint4;
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
        this.f51861h0 = new org.telegram.ui.Components.t5(this, 0L, 200L, gr.f26495f);
        this.m0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.f51867n0 = -1.0f;
        this.f51868o0 = true;
        this.f51869p0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.f51870q0 = new org.telegram.ui.Components.t5(this, 0L, 850L, grVar);
        this.f51874s0 = new float[2];
        this.f51875t0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.B0 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.C0 = new org.telegram.ui.Components.t5(this, 0L, 650L, grVar);
        this.D0 = new org.telegram.ui.Components.t5(this, 0L, 160L, gr.f26497i);
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
        this.f51854c = eqVar;
        eqVar.f25847x = false;
        int L = org.telegram.messenger.i0.L(24.0f);
        int L2 = org.telegram.messenger.i0.L(24.0f);
        eqVar.e = L;
        eqVar.f25842f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(2131232284).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(2131232284).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(2131232154).mutate();
        this.f51858f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(2131232145).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(2131232346).mutate();
        this.f51866n = mutate6;
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
        if (this.f51872r0) {
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
        this.N.f30447g = j10;
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
            if (f7 > 0.0f && !this.f51872r0) {
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
        this.f51876u0 = false;
        if (!z10) {
            org.telegram.ui.Components.t5 t5Var = this.f51875t0;
            t5Var.getClass();
            t5Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        ef efVar;
        String str;
        ArrayList arrayList;
        q4 q4Var = this.f51850a;
        eq eqVar = this.f51854c;
        ImageReceiver imageReceiver = this.f51852b;
        if (q4Var != null) {
            ArrayList arrayList2 = vp.r1(imageReceiver.d).O1().f48922w.f51902b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((n5) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(ic.g(((n5) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, eqVar, 0L, null, null, 0);
                return;
            }
        }
        we weVar = MediaController.Y1;
        if (weVar != null && (arrayList = weVar.e) != null && !arrayList.isEmpty()) {
            efVar = (ef) arrayList.get(0);
        } else {
            efVar = null;
        }
        if (efVar != null && (str = efVar.f19508c) != null) {
            imageReceiver.r0(ic.g(str), "80_80", null, null, eqVar, 0L, null, null, 0);
            return;
        }
        if (efVar != null) {
            int i10 = efVar.C;
            String str2 = efVar.I;
            if (str2 != null) {
                if (efVar.f19507b) {
                    imageReceiver.r0(ic.g("vthumb://" + i10 + ":" + str2), "80_80", null, null, eqVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(efVar.J, efVar.K, true);
                imageReceiver.r0(ic.g("thumb://" + i10 + ":" + str2), "80_80", null, null, eqVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(eqVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51852b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f51852b.R();
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
        this.f51862i0 = f7 / 2.0f;
        this.f51863j0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.i0.L(135.0f), f7 * 0.35f);
        float f10 = this.f51862i0;
        this.f51864k0 = f10 - min;
        float f11 = f10 + min;
        this.f51865l0 = f11;
        float f12 = this.f51863j0;
        float L2 = org.telegram.messenger.i0.L(14.0f);
        this.d.setBounds((int) (f11 - L2), (int) (f12 - L2), (int) (f11 + L2), (int) (f12 + L2));
        float f13 = this.f51865l0;
        float f14 = this.f51863j0;
        float L3 = org.telegram.messenger.i0.L(14.0f);
        this.e.setBounds((int) (f13 - L3), (int) (f14 - L3), (int) (f13 + L3), (int) (f14 + L3));
        f(this.f51858f, this.f51864k0, this.f51863j0);
        f(this.h, this.f51864k0, this.f51863j0);
        f(this.f51866n, this.f51864k0, this.f51863j0);
        this.f51852b.y0(this.f51864k0 - org.telegram.messenger.i0.L(20.0f), this.f51863j0 - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f51862i0, this.f51863j0);
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
        float i10 = Utilities.i(motionEvent.getX() + 0.0f, this.f51865l0, this.f51864k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i10, y3, this.f51865l0, this.f51863j0, org.telegram.messenger.i0.L(7.0f), true);
        boolean z12 = this.f51876u0;
        dc dcVar = this.L;
        dc dcVar2 = this.J;
        dc dcVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            dcVar2.c(false);
            dcVar3.c(false);
            dcVar.c(false);
        } else if (action == 0 || this.f51879w0) {
            dcVar2.c(c(i10, y3, this.f51862i0, this.f51863j0, org.telegram.messenger.i0.L(60.0f), false));
            if (c(i10, y3, this.f51865l0, this.f51863j0, org.telegram.messenger.i0.L(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            dcVar3.c(z10);
            if (c(i10, y3, this.f51864k0, this.f51863j0, org.telegram.messenger.i0.L(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            dcVar.c(z11);
        }
        p4 p4Var = this.M0;
        p4 p4Var2 = this.L0;
        if (action == 0) {
            this.f51879w0 = true;
            if (dcVar2.f25390i || dcVar3.f25390i) {
                z14 = true;
            }
            this.f51881x0 = z14;
            System.currentTimeMillis();
            this.f51883y0 = i10;
            if (Math.abs(i10 - this.f51862i0) < org.telegram.messenger.i0.L(50.0f)) {
                org.telegram.messenger.i0.h3(p4Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (dcVar3.f25390i) {
                org.telegram.messenger.i0.h3(p4Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f51879w0) {
                this.f51883y0 = Utilities.i(i10, this.f51865l0, this.f51864k0);
                invalidate();
                if (this.f51872r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((o7) this.f51850a).b();
                }
                if (this.f51872r0 && this.f51884z0) {
                    float i11 = Utilities.i(((this.f51863j0 - org.telegram.messenger.i0.L(48.0f)) - y3) / (org.telegram.messenger.i0.f16026q.y / 2.0f), 1.0f, 0.0f);
                    o8 o8Var = ((o7) this.f51850a).f51603a;
                    o8Var.V0.b(true, i11);
                    o8Var.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f51879w0) {
                this.f51879w0 = false;
                this.f51881x0 = false;
                org.telegram.messenger.i0.r(p4Var2);
                org.telegram.messenger.i0.r(p4Var);
                boolean z15 = this.f51872r0;
                if (!z15 && dcVar.f25390i) {
                    ((o7) this.f51850a).c();
                } else if (z15 && this.f51884z0) {
                    if (dcVar.f25390i) {
                        this.f51884z0 = false;
                        this.G0.e(true, 1.0f);
                        o2 o2Var = ((o7) this.f51850a).f51603a.T0;
                        o2Var.f51592a.t(cd.L0(2131744680, null), true, true);
                        o2Var.invalidate();
                    } else {
                        this.f51872r0 = false;
                        this.f51877v0 = SystemClock.elapsedRealtime();
                        this.f51876u0 = true;
                        ((o7) this.f51850a).e(false);
                    }
                } else if (dcVar2.f25390i) {
                    if (b()) {
                        ((o7) this.f51850a).a();
                    } else if (!this.f51868o0 && !this.f51872r0 && !this.f51884z0) {
                        ((o7) this.f51850a).d();
                    } else if (!this.f51872r0) {
                        if (o8.c(((o7) this.f51850a).f51603a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((o7) this.f51850a).f(new p4(this, 1), false);
                        }
                    } else {
                        this.f51872r0 = false;
                        this.f51877v0 = SystemClock.elapsedRealtime();
                        this.f51876u0 = true;
                        ((o7) this.f51850a).e(false);
                    }
                }
                this.f51884z0 = false;
                if (dcVar3.f25390i) {
                    d(180.0f);
                    ((o7) this.f51850a).b();
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
        this.f51850a = q4Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f51873s.setColor(i0.b.f(f7, -1, -16777216));
        this.f51880x.setColor(i0.b.f(f7, 1677721600, 369098752));
        this.E.setColor(i0.b.f(f7, 1493172223, 285212671));
        this.F.setColor(i0.b.f(f7, 402653184, 805306368));
        int f10 = i0.b.f(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f10, mode));
        this.f51858f.setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), mode));
    }
}
