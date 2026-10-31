package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ex0;
public final class z8 extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D;
    public final Paint D0;
    public boolean E;
    public final TextPaint E0;
    public String F;
    public final RectF F0;
    public boolean G;
    public final Path G0;
    public long H;
    public final Paint H0;
    public long I;
    public final y8 I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public x8 M;
    public StaticLayout M0;
    public boolean N;
    public float N0;
    public String O;
    public float O0;
    public boolean P;
    public final TextPaint P0;
    public long Q;
    public StaticLayout Q0;
    public long R;
    public float R0;
    public float S;
    public float S0;
    public float T;
    public final LinearGradient T0;
    public boolean U;
    public final Matrix U0;
    public float V;
    public final Paint V0;
    public boolean W;
    public final zl0 W0;
    public boolean X0;
    public final rh.r4 Y0;
    public long Z0;
    public t8 f52257a;
    public s8 f52258a0;
    public long f52259a1;
    public Runnable f52260b;
    public int f52261b0;
    public final org.telegram.ui.Components.t5 f52262b1;
    public int f52263c;
    public final org.telegram.ui.Components.t5 f52264c0;
    public long f52265c1;
    public Runnable d;
    public final org.telegram.ui.Components.t5 f52266d0;
    public q8 f52267d1;
    public long e;
    public final org.telegram.ui.Components.t5 f52268e0;
    public long f52269e1;
    public long f52270f;
    public final org.telegram.ui.Components.t5 f52271f0;
    public long f52272f1;
    public final org.telegram.ui.Components.t5 f52273g0;
    public float f52274g1;
    public u8 h;
    public final org.telegram.ui.Components.t5 f52275h0;
    public int f52276h1;
    public final org.telegram.ui.Components.t5 f52277i0;
    public int f52278i1;
    public boolean f52279j0;
    public int f52280j1;
    public final s9 f52281k0;
    public int f52282k1;
    public final w9 f52283l0;
    public boolean l1;
    public final w9 m0;
    public boolean f52284m1;
    public int f52285n;
    public final w9 f52286n0;
    public float f52287n1;
    public final RectF f52288o0;
    public boolean f52289o1;
    public final Path f52290p0;
    public VelocityTracker f52291p1;
    public final qz0 f52292q0;
    public boolean f52293q1;
    public final ArrayList f52294r;
    public final Drawable f52295r0;
    public boolean f52296r1;
    public final ArrayList f52297s;
    public final y8 f52298s0;
    public int f52299s1;
    public final RectF f52300t0;
    public final float[] f52301t1;
    public final Paint f52302u0;
    public int f52303u1;
    public final Path f52304v0;
    public int f52305v1;
    public u8 f52306w;
    public final Path f52307w0;
    public int f52308w1;
    public final Paint f52309x;
    public final RectF f52310x0;
    public int f52311x1;
    public final Path f52312y;
    public final Path f52313y0;
    public int f52314y1;
    public final Paint f52315z0;
    public int f52316z1;

    public z8(Context context, ViewGroup viewGroup, b8 b8Var, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context);
        this.f52285n = 0;
        this.f52294r = new ArrayList();
        this.f52297s = new ArrayList();
        this.f52309x = new Paint(3);
        this.f52312y = new Path();
        this.D = new Path();
        this.f52261b0 = 1;
        gr grVar = gr.h;
        this.f52264c0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f52266d0 = new org.telegram.ui.Components.t5(this, 360L, grVar);
        this.f52268e0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f52271f0 = new org.telegram.ui.Components.t5(this, 360L, grVar);
        this.f52273g0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f52275h0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f52277i0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.f52279j0 = true;
        this.f52288o0 = new RectF();
        this.f52290p0 = new Path();
        this.f52298s0 = new y8();
        this.f52300t0 = new RectF();
        this.f52302u0 = new Paint(3);
        this.f52304v0 = new Path();
        this.f52307w0 = new Path();
        this.f52310x0 = new RectF();
        this.f52313y0 = new Path();
        Paint paint = new Paint(1);
        this.f52315z0 = paint;
        Paint paint2 = new Paint(1);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        this.B0 = paint3;
        Paint paint4 = new Paint(1);
        this.C0 = paint4;
        Paint paint5 = new Paint(1);
        this.D0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.E0 = textPaint;
        this.F0 = new RectF();
        this.G0 = new Path();
        Paint paint6 = new Paint(1);
        this.H0 = paint6;
        this.I0 = new y8();
        Paint paint7 = new Paint(1);
        this.J0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.L0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.P0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.T0 = linearGradient;
        this.U0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.V0 = paint8;
        this.W0 = new zl0(getContext(), null);
        this.Z0 = -1L;
        this.f52259a1 = -1L;
        this.f52262b1 = new org.telegram.ui.Components.t5(0.0f, this, 0L, 340L, grVar);
        this.f52265c1 = -1L;
        this.f52276h1 = -1;
        this.f52278i1 = -1;
        this.f52280j1 = -1;
        this.f52282k1 = -1;
        this.f52287n1 = 1.0f;
        this.f52293q1 = true;
        this.f52296r1 = false;
        this.f52301t1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 436207616);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(2.0f), 1073741824);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.f52292q0 = new qz0(cd.L0(2131744482, null), 12.0f, org.telegram.messenger.i0.o());
        Drawable mutate = getContext().getResources().getDrawable(2131232777).mutate();
        this.f52295r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231188).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f52281k0 = s9Var;
        this.f52283l0 = new w9(s9Var, this, 0, false);
        this.m0 = new w9(s9Var, this, 3, false);
        this.f52286n0 = new w9(s9Var, this, 4, false);
        this.Y0 = new rh.r4(this, viewGroup, p6Var, s9Var, b8Var, 12);
    }

    public static void a(final z8 z8Var, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var, View view) {
        int i10;
        ArrayList arrayList = z8Var.f52297s;
        int i11 = z8Var.f52280j1;
        try {
            if (i11 == 2 && z8Var.N) {
                h5 h5Var = new h5(z8Var.getContext(), 0);
                h5Var.f51248b = 0.0f;
                h5Var.f51249c = 1.5f;
                h5Var.d(z8Var.V);
                h5Var.h = new q20(z8Var) {
                    public final z8 f51899b;

                    {
                        this.f51899b = z8Var;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                z8 z8Var2 = this.f51899b;
                                z8Var2.V = floatValue;
                                t8 t8Var = z8Var2.f52257a;
                                if (t8Var != null) {
                                    t8Var.h(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                z8 z8Var3 = this.f51899b;
                                z8Var3.L = floatValue2;
                                t8 t8Var2 = z8Var3.f52257a;
                                if (t8Var2 != null) {
                                    t8Var2.f(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                z8 z8Var4 = this.f51899b;
                                z8Var4.h.f52028i = f7.floatValue();
                                t8 t8Var3 = z8Var4.f52257a;
                                if (t8Var3 != null) {
                                    t8Var3.w(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(z8Var.getBaseDuration(), z8Var.getMaxScrollDuration());
                int i12 = z8Var.f52305v1;
                int i13 = z8Var.f52314y1;
                int i14 = z8Var.f52311x1;
                float min2 = Math.min((i12 - i13) - i14, ((((org.telegram.messenger.i0.T1(z8Var.T, 1.0f, z8Var.f52271f0.f30445c) * ((float) z8Var.R)) + ((float) (z8Var.Q - z8Var.f52270f))) / ((float) min)) * z8Var.f52303u1) + i13 + i14);
                z60 F = z60.F(viewGroup, p6Var, z8Var);
                F.q(h5Var);
                F.o();
                F.c(2131232107, cd.L0(2131744738, null), new p8(z8Var, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(z8Var.f52305v1 - min2)) + org.telegram.messenger.i0.L(18.0f), z8Var.F0.top);
                F.Z();
                F.Q(s9Var, -view.getX(), -view.getY());
                z8Var.performHapticFeedback(0, 1);
            } else if (i11 == 1 && z8Var.E) {
                h5 h5Var2 = new h5(z8Var.getContext(), 0);
                h5Var2.f51248b = 0.0f;
                h5Var2.f51249c = 1.5f;
                h5Var2.d(z8Var.L);
                h5Var2.h = new q20(z8Var) {
                    public final z8 f51899b;

                    {
                        this.f51899b = z8Var;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                z8 z8Var2 = this.f51899b;
                                z8Var2.V = floatValue;
                                t8 t8Var = z8Var2.f52257a;
                                if (t8Var != null) {
                                    t8Var.h(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                z8 z8Var3 = this.f51899b;
                                z8Var3.L = floatValue2;
                                t8 t8Var2 = z8Var3.f52257a;
                                if (t8Var2 != null) {
                                    t8Var2.f(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                z8 z8Var4 = this.f51899b;
                                z8Var4.h.f52028i = f7.floatValue();
                                t8 t8Var3 = z8Var4.f52257a;
                                if (t8Var3 != null) {
                                    t8Var3.w(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(z8Var.getBaseDuration(), z8Var.getMaxScrollDuration());
                int i15 = z8Var.f52305v1;
                int i16 = z8Var.f52314y1;
                int i17 = z8Var.f52311x1;
                float min4 = Math.min((i15 - i16) - i17, ((((org.telegram.messenger.i0.T1(z8Var.K, 1.0f, z8Var.f52266d0.f30445c) * ((float) z8Var.H)) + ((float) (z8Var.I - z8Var.f52270f))) / ((float) min3)) * z8Var.f52303u1) + i16 + i17);
                z60 F2 = z60.F(viewGroup, p6Var, z8Var);
                F2.q(h5Var2);
                F2.o();
                F2.c(2131232107, cd.L0(2131744513, null), new p8(z8Var, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(z8Var.f52305v1 - min4)) + org.telegram.messenger.i0.L(18.0f), z8Var.f52310x0.top);
                F2.Z();
                F2.Q(s9Var, -view.getX(), -view.getY());
                z8Var.performHapticFeedback(0, 1);
            } else if (i11 == 0 && z8Var.h != null) {
                h5 h5Var3 = new h5(z8Var.getContext(), 0);
                h5Var3.f51248b = 0.0f;
                h5Var3.f51249c = 1.5f;
                h5Var3.d(z8Var.h.f52028i);
                h5Var3.h = new q20(z8Var) {
                    public final z8 f51899b;

                    {
                        this.f51899b = z8Var;
                    }

                    @Override
                    public final void a(Object obj) {
                        Float f7 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f7.floatValue();
                                z8 z8Var2 = this.f51899b;
                                z8Var2.V = floatValue;
                                t8 t8Var = z8Var2.f52257a;
                                if (t8Var != null) {
                                    t8Var.h(f7.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                z8 z8Var3 = this.f51899b;
                                z8Var3.L = floatValue2;
                                t8 t8Var2 = z8Var3.f52257a;
                                if (t8Var2 != null) {
                                    t8Var2.f(f7.floatValue());
                                    return;
                                }
                                return;
                            default:
                                z8 z8Var4 = this.f51899b;
                                z8Var4.h.f52028i = f7.floatValue();
                                t8 t8Var3 = z8Var4.f52257a;
                                if (t8Var3 != null) {
                                    t8Var3.w(f7.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                z60 F3 = z60.F(viewGroup, p6Var, z8Var);
                F3.q(h5Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(org.telegram.messenger.i0.L(18.0f), z8Var.f52300t0.top);
                F3.Z();
                F3.Q(s9Var, -view.getX(), -view.getY());
                z8Var.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = z8Var.f52282k1) >= 0 && i10 < arrayList.size()) {
                u8 u8Var = (u8) arrayList.get(z8Var.f52282k1);
                h5 h5Var4 = new h5(z8Var.getContext(), 0);
                h5Var4.f51248b = 0.0f;
                h5Var4.f51249c = 1.5f;
                h5Var4.d(u8Var.f52028i);
                h5Var4.h = new rh.e3(10, z8Var, u8Var);
                z60 F4 = z60.F(viewGroup, p6Var, z8Var);
                F4.q(h5Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(org.telegram.messenger.i0.L(18.0f), u8Var.f52029j.top);
                F4.Z();
                F4.Q(s9Var, -view.getX(), -view.getY());
                z8Var.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.i0.W1(this.f52271f0.d(this.P), org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
    }

    public long getBaseDuration() {
        u8 u8Var = this.h;
        if (u8Var != null) {
            return Math.max(1L, u8Var.e);
        }
        u8 u8Var2 = this.f52306w;
        if (u8Var2 != null) {
            return Math.max(1L, u8Var2.e);
        }
        if (this.E) {
            return Math.max(1L, this.H);
        }
        return Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f52297s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += org.telegram.messenger.i0.L(4.0f);
            }
            f7 += org.telegram.messenger.i0.W1(((u8) arrayList.get(i10)).f52030k.f30445c, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return org.telegram.messenger.i0.W1(this.f52266d0.d(this.G), org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
    }

    private float getVideoHeight() {
        u8 u8Var = this.h;
        if (u8Var == null) {
            return 0.0f;
        }
        return org.telegram.messenger.i0.W1(u8Var.f52030k.f30445c, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: vh.z8.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        zl0 zl0Var = this.W0;
        if (zl0Var.b()) {
            int i10 = zl0Var.f33117j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f52293q1) {
                this.f52270f = Math.max(0.0f, (((i10 - this.f52314y1) - this.f52311x1) / this.f52303u1) * ((float) min));
            } else if (!this.P) {
                zl0Var.a();
                return;
            } else {
                int i11 = this.f52314y1;
                int i12 = this.f52311x1;
                float f7 = this.f52303u1;
                float f10 = (float) min;
                h(((((i10 - i11) - i12) / f7) * f10) - ((((this.f52299s1 - i11) - i12) / f7) * f10));
            }
            invalidate();
            this.f52299s1 = i10;
        } else if (this.f52296r1) {
            this.f52296r1 = false;
            t8 t8Var = this.f52257a;
            if (t8Var != null) {
                t8Var.t(false);
            }
        }
    }

    public final void d(Canvas canvas, float f7, float f10, long j10, float f11) {
        long j11;
        float f12;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = (float) Utilities.k(j10, getBaseDuration(), 0L);
        u8 u8Var = this.f52306w;
        if (u8Var != null) {
            f12 = (u8Var.f52027g * ((float) u8Var.e)) + ((float) u8Var.f52026f);
        } else {
            if (this.h == null) {
                j11 = this.Q;
            } else {
                j11 = 0;
            }
            f12 = (float) j11;
        }
        float f13 = (this.f52303u1 * (((k10 + f12) - ((float) this.f52270f)) / ((float) min))) + this.f52314y1 + this.f52311x1;
        float f14 = (1.0f - f11) * (((f10 - f7) / 2.0f) / 2.0f);
        float f15 = f7 + f14;
        float f16 = f10 - f14;
        Paint paint = this.C0;
        paint.setAlpha((int) (38.0f * f11));
        int i10 = (int) (f11 * 255.0f);
        Paint paint2 = this.D0;
        paint2.setAlpha(i10);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f13 - org.telegram.messenger.i0.N(1.5f), f15, org.telegram.messenger.i0.N(1.5f) + f13, f16);
        rectF.inset(-org.telegram.messenger.i0.N(0.66f), -org.telegram.messenger.i0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
        rectF.set(f13 - org.telegram.messenger.i0.N(1.5f), f15, org.telegram.messenger.i0.N(1.5f) + f13, f16);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: vh.z8.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, float f7, float f10, float f11, float f12, float f13) {
        float f14;
        Paint paint2;
        float f15;
        float f16;
        float f17;
        if (f13 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        float f18 = 10.0f;
        rectF.set(f11 - org.telegram.messenger.i0.L(10.0f), f7, org.telegram.messenger.i0.L(10.0f) + f12, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f52305v1, this.f52308w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint3 = this.f52315z0;
        paint3.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint3);
        if (this.X0) {
            f14 = 2.5f;
        } else {
            f14 = 10.0f;
        }
        rectF.inset(org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(2.0f));
        boolean z10 = this.X0;
        Paint paint4 = this.A0;
        if (z10) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float L = org.telegram.messenger.i0.L(2.0f);
        float L2 = org.telegram.messenger.i0.L(10.0f);
        Paint paint5 = this.B0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i10);
        if (this.X0) {
            f15 = 2.0f;
        } else {
            f15 = 10.0f;
        }
        float y3 = org.telegram.messenger.m5.y(org.telegram.messenger.i0.L(f15), L, 2.0f, f11);
        float f19 = f7 + f10;
        float f20 = (f19 - L2) / 2.0f;
        if (this.X0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float f21 = (f19 + L2) / 2.0f;
        rectF.set(y3, f20, f11 - ((org.telegram.messenger.i0.L(f16) + L) / 2.0f), f21);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint2);
            if (paint != null && !this.X0) {
                paint5.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint5);
            }
        }
        if (this.X0) {
            f17 = 2.5f;
        } else {
            f17 = 10.0f;
        }
        float B = c3.i0.B(org.telegram.messenger.i0.L(f17), L, 2.0f, f12);
        if (this.X0) {
            f18 = 2.5f;
        }
        rectF.set(B, f20, org.telegram.messenger.m5.a(org.telegram.messenger.i0.L(f18), L, 2.0f, f12), f21);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.f52261b0 * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f7;
        float collageHeight;
        float f10;
        float f11 = this.f52316z1;
        float f12 = 0.0f;
        if (this.h != null) {
            f7 = getVideoHeight() + org.telegram.messenger.i0.L(4.0f);
        } else {
            f7 = 0.0f;
        }
        float f13 = f11 + f7;
        if (this.f52297s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + org.telegram.messenger.i0.L(4.0f);
        }
        float f14 = f13 + collageHeight;
        if (this.E) {
            f10 = getRoundHeight() + org.telegram.messenger.i0.L(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f15 = f14 + f10;
        if (this.N) {
            f12 = org.telegram.messenger.i0.L(4.0f) + getAudioHeight();
        }
        return (int) (f15 + f12 + this.f52316z1);
    }

    public int getMaxCount() {
        return this.f52261b0;
    }

    public long getMaxScrollDuration() {
        if (this.f52297s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.i0.W1(this.f52277i0.f30445c, org.telegram.messenger.i0.L(28.0f) + this.f52316z1 + this.f52316z1, getContentHeight());
    }

    public final void h(float f7) {
        float f10;
        long j10;
        float f11;
        long j11;
        float f12;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        t8 t8Var;
        long j17;
        long k10;
        u8 u8Var = this.h;
        if (u8Var == null && !this.E) {
            long j18 = this.Q;
            long k11 = Utilities.k(j18 + f7, 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = k11;
            float f13 = (float) (k11 - j18);
            this.S = Utilities.i(this.S - (f13 / ((float) this.R)), 1.0f, 0.0f);
            this.T = Utilities.i(this.T - (f13 / ((float) this.R)), 1.0f, 0.0f);
            t8 t8Var2 = this.f52257a;
            if (t8Var2 != null) {
                t8Var2.F(this.S);
                this.f52257a.D(this.T);
            }
        } else if (this.P) {
            if (u8Var != null) {
                f10 = u8Var.f52027g;
                j10 = u8Var.e;
            } else {
                f10 = this.J;
                j10 = this.H;
            }
            float f14 = f10 * ((float) j10);
            if (u8Var != null) {
                f11 = u8Var.h;
                j11 = u8Var.e;
            } else {
                f11 = this.K;
                j11 = this.H;
            }
            float f15 = f11 * ((float) j11);
            if (u8Var != null) {
                f12 = (u8Var.h - u8Var.f52027g) * ((float) u8Var.e);
            } else {
                f12 = ((float) this.H) * (this.K - this.J);
            }
            float f16 = this.T;
            float f17 = (float) this.R;
            float f18 = this.S;
            long j19 = f14 - (f18 * f17);
            float min = Math.min(f16 - f18, f12 / f17);
            long j20 = this.Q;
            long j21 = f7;
            long j22 = j20 + j21;
            if (j22 > f15 - (f16 * f17)) {
                float i10 = Utilities.i(((f15 - ((float) j20)) - ((float) j21)) / ((float) this.R), 1.0f, min);
                this.T = i10;
                float i11 = Utilities.i(i10 - min, 1.0f, 0.0f);
                this.S = i11;
                float f19 = this.T;
                float f20 = (float) this.R;
                long j23 = f15 - (f19 * f20);
                long j24 = f14 - (i11 * f20);
                if (j23 < j24) {
                    j15 = j24;
                    j14 = j23;
                } else {
                    j14 = j24;
                    j15 = j23;
                }
                this.Q = Utilities.k(this.Q + j21, j15, j14);
                t8 t8Var3 = this.f52257a;
                if (t8Var3 != null) {
                    t8Var3.F(this.S);
                    this.f52257a.D(this.T);
                }
            } else if (j22 < j19) {
                float i12 = Utilities.i(((f14 - ((float) j20)) - ((float) j21)) / ((float) this.R), 1.0f - min, 0.0f);
                this.S = i12;
                float i13 = Utilities.i(i12 + min, 1.0f, 0.0f);
                this.T = i13;
                float f21 = (float) this.R;
                long j25 = f15 - (i13 * f21);
                long j26 = f14 - (this.S * f21);
                if (j25 < j26) {
                    j13 = j26;
                    j12 = j25;
                } else {
                    j12 = j26;
                    j13 = j25;
                }
                this.Q = Utilities.k(this.Q + j21, j13, j12);
                t8 t8Var4 = this.f52257a;
                if (t8Var4 != null) {
                    t8Var4.F(this.S);
                    this.f52257a.D(this.T);
                }
            } else {
                this.Q = j22;
            }
        } else {
            long j27 = this.Q + f7;
            float f22 = (float) this.R;
            this.Q = Utilities.k(j27, ((float) getBaseDuration()) - (this.T * f22), (-this.S) * f22);
        }
        invalidate();
        t8 t8Var5 = this.f52257a;
        if (t8Var5 != null) {
            t8Var5.O(this.Q + (this.S * ((float) this.R)));
        }
        boolean z10 = this.f52284m1;
        if (!z10 && (t8Var = this.f52257a) != null) {
            t8Var.t(true);
            u8 u8Var2 = this.h;
            if (u8Var2 != null) {
                long j28 = this.Q + (this.S * ((float) this.R));
                float f23 = u8Var2.h;
                float f24 = (float) u8Var2.e;
                k10 = Utilities.k(j28, f23 * f24, u8Var2.f52027g * f24);
            } else if (this.E) {
                long j29 = this.Q + (this.S * ((float) this.R));
                float f25 = this.K;
                float f26 = (float) this.H;
                k10 = Utilities.k(j29, f25 * f26, this.J * f26);
            } else {
                float f27 = this.S;
                k10 = Utilities.k(f27 * ((float) j17), this.R, 0L);
            }
            if (this.h != null && Math.abs(this.e - k10) > 400) {
                this.f52265c1 = this.e;
                this.f52262b1.e(true, 1.0f);
            }
            t8 t8Var6 = this.f52257a;
            this.e = k10;
            t8Var6.j(k10, false);
        } else if (z10 || this.f52296r1) {
            u8 u8Var3 = this.h;
            if (u8Var3 != null) {
                long j30 = this.Q + (this.S * ((float) this.R));
                float f28 = u8Var3.h;
                float f29 = (float) u8Var3.e;
                this.e = Utilities.k(j30, f28 * f29, u8Var3.f52027g * f29);
            } else if (this.E && u8Var3 != null) {
                long j31 = this.Q + (this.S * ((float) this.R));
                float f30 = this.K;
                float f31 = (float) u8Var3.e;
                this.e = Utilities.k(j31, f30 * f31, this.J * f31);
            } else {
                float f32 = this.S;
                this.e = Utilities.k(f32 * ((float) j16), this.R, 0L);
            }
            t8 t8Var7 = this.f52257a;
            if (t8Var7 != null) {
                t8Var7.j(this.e, false);
            }
        }
    }

    public final void i(u8 u8Var, float f7) {
        long j10;
        t8 t8Var;
        long j11;
        long k10;
        long j12;
        long j13;
        long j14;
        long j15;
        if (u8Var != null) {
            u8 u8Var2 = this.f52306w;
            if (u8Var2 != u8Var && u8Var2 != null) {
                if (this.f52285n == this.f52297s.indexOf(u8Var)) {
                    u8 u8Var3 = this.f52306w;
                    float f10 = (float) u8Var3.e;
                    float f11 = u8Var.h;
                    float f12 = (float) u8Var.e;
                    float f13 = u8Var.f52027g;
                    long j16 = (f10 * 0.0f) - (f13 * f12);
                    float min = Math.min(f11 - f13, ((u8Var3.h - u8Var3.f52027g) * f10) / f12);
                    long j17 = u8Var.f52026f;
                    long j18 = f7;
                    long j19 = j17 + j18;
                    if (j19 > (f10 * 1.0f) - (f11 * f12)) {
                        u8 u8Var4 = this.f52306w;
                        float i10 = Utilities.i((((u8Var4.h * ((float) u8Var4.e)) - ((float) j17)) - ((float) j18)) / ((float) u8Var.e), 1.0f, min);
                        u8Var.h = i10;
                        float i11 = Utilities.i(i10 - min, 1.0f, 0.0f);
                        u8Var.f52027g = i11;
                        u8 u8Var5 = this.f52306w;
                        float f14 = u8Var5.h;
                        float f15 = (float) u8Var5.e;
                        float f16 = u8Var.h;
                        float f17 = (float) u8Var.e;
                        long j20 = (f14 * f15) - (f16 * f17);
                        long j21 = (u8Var5.f52027g * f15) - (i11 * f17);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        u8Var.f52026f = Utilities.k(u8Var.f52026f + j18, j15, j14);
                        t8 t8Var2 = this.f52257a;
                        if (t8Var2 != null) {
                            t8Var2.B(u8Var.f52027g, u8Var.f52023a);
                            this.f52257a.H(u8Var.h, u8Var.f52023a);
                        }
                    } else if (j19 < j16) {
                        u8 u8Var6 = this.f52306w;
                        float i12 = Utilities.i((((u8Var6.f52027g * ((float) u8Var6.e)) - ((float) j17)) - ((float) j18)) / ((float) u8Var.e), 1.0f - min, 0.0f);
                        u8Var.f52027g = i12;
                        float i13 = Utilities.i(i12 + min, 1.0f, 0.0f);
                        u8Var.h = i13;
                        u8 u8Var7 = this.f52306w;
                        float f18 = u8Var7.h;
                        float f19 = (float) u8Var7.e;
                        float f20 = (float) u8Var.e;
                        long j22 = (f18 * f19) - (i13 * f20);
                        long j23 = (u8Var7.f52027g * f19) - (u8Var.f52027g * f20);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        u8Var.f52026f = Utilities.k(u8Var.f52026f + j18, j13, j12);
                        t8 t8Var3 = this.f52257a;
                        if (t8Var3 != null) {
                            t8Var3.B(u8Var.f52027g, u8Var.f52023a);
                            this.f52257a.H(u8Var.h, u8Var.f52023a);
                        }
                    } else {
                        u8Var.f52026f = j19;
                    }
                } else {
                    long j24 = u8Var.f52026f + f7;
                    float f21 = (float) u8Var.e;
                    u8Var.f52026f = Utilities.k(j24, ((float) getBaseDuration()) - (u8Var.h * f21), (-u8Var.f52027g) * f21);
                }
            }
            invalidate();
            t8 t8Var4 = this.f52257a;
            if (t8Var4 != null) {
                t8Var4.N(u8Var.f52023a, u8Var.f52026f);
            }
            boolean z10 = this.f52284m1;
            if (!z10 && (t8Var = this.f52257a) != null) {
                t8Var.t(true);
                u8 u8Var8 = this.f52306w;
                if (u8Var8 != u8Var && u8Var8 != null) {
                    long j25 = u8Var.f52026f + (u8Var.f52027g * ((float) u8Var.e));
                    float f22 = u8Var8.h;
                    float f23 = (float) u8Var8.e;
                    k10 = Utilities.k(j25, f22 * f23, u8Var8.f52027g * f23);
                } else {
                    float f24 = u8Var.f52027g;
                    k10 = Utilities.k(f24 * ((float) j11), u8Var.e, 0L);
                }
                u8 u8Var9 = this.f52306w;
                if (u8Var9 != u8Var && u8Var9 != null && Math.abs(this.e - k10) > 400) {
                    this.f52265c1 = this.e;
                    this.f52262b1.e(true, 1.0f);
                }
                t8 t8Var5 = this.f52257a;
                this.e = k10;
                t8Var5.j(k10, false);
            } else if (z10 || this.f52296r1) {
                u8 u8Var10 = this.f52306w;
                if (u8Var10 != u8Var && u8Var10 != null) {
                    long j26 = u8Var.f52026f + (u8Var.f52027g * ((float) u8Var.e));
                    float f25 = u8Var10.h;
                    float f26 = (float) u8Var10.e;
                    this.e = Utilities.k(j26, f25 * f26, u8Var10.f52027g * f26);
                } else {
                    float f27 = u8Var.f52027g;
                    this.e = Utilities.k(f27 * ((float) j10), u8Var.e, 0L);
                }
                t8 t8Var6 = this.f52257a;
                if (t8Var6 != null) {
                    t8Var6.j(this.e, false);
                }
            }
        }
    }

    public final void j(float f7) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        t8 t8Var;
        long j15;
        long k10;
        u8 u8Var = this.h;
        if (u8Var == null) {
            long j16 = this.I;
            long k11 = Utilities.k(j16 + f7, 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = k11;
            float f10 = (float) (k11 - j16);
            this.J = Utilities.i(this.J - (f10 / ((float) this.H)), 1.0f, 0.0f);
            this.K = Utilities.i(this.K - (f10 / ((float) this.H)), 1.0f, 0.0f);
            t8 t8Var2 = this.f52257a;
            if (t8Var2 != null) {
                t8Var2.r(this.J);
                this.f52257a.L(this.K);
            }
        } else if (this.G) {
            float f11 = u8Var.h;
            float f12 = (float) u8Var.e;
            float f13 = this.K;
            float f14 = (float) this.H;
            long j17 = (f11 * f12) - (f13 * f14);
            float f15 = u8Var.f52027g;
            float f16 = this.J;
            long j18 = (f15 * f12) - (f16 * f14);
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j19 = this.I;
            long j20 = f7;
            long j21 = j19 + j20;
            if (j21 > j17) {
                u8 u8Var2 = this.h;
                float i10 = Utilities.i((((u8Var2.h * ((float) u8Var2.e)) - ((float) j19)) - ((float) j20)) / ((float) this.H), 1.0f, min);
                this.K = i10;
                float i11 = Utilities.i(i10 - min, 1.0f, 0.0f);
                this.J = i11;
                u8 u8Var3 = this.h;
                float f17 = u8Var3.h;
                float f18 = (float) u8Var3.e;
                float f19 = this.K;
                float f20 = (float) this.H;
                long j22 = (f17 * f18) - (f19 * f20);
                long j23 = (u8Var3.f52027g * f18) - (i11 * f20);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.I = Utilities.k(this.I + j20, j13, j12);
                t8 t8Var3 = this.f52257a;
                if (t8Var3 != null) {
                    t8Var3.r(this.J);
                    this.f52257a.L(this.K);
                }
            } else if (j21 < j18) {
                u8 u8Var4 = this.h;
                float i12 = Utilities.i((((u8Var4.f52027g * ((float) u8Var4.e)) - ((float) j19)) - ((float) j20)) / ((float) this.H), 1.0f - min, 0.0f);
                this.J = i12;
                float i13 = Utilities.i(i12 + min, 1.0f, 0.0f);
                this.K = i13;
                u8 u8Var5 = this.h;
                float f21 = u8Var5.h;
                float f22 = (float) u8Var5.e;
                float f23 = (float) this.H;
                long j24 = (f21 * f22) - (i13 * f23);
                long j25 = (u8Var5.f52027g * f22) - (this.J * f23);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.I = Utilities.k(this.I + j20, j11, j10);
                t8 t8Var4 = this.f52257a;
                if (t8Var4 != null) {
                    t8Var4.r(this.J);
                    this.f52257a.L(this.K);
                }
            } else {
                this.I = j21;
            }
        } else {
            long j26 = this.I + f7;
            float f24 = (float) this.H;
            this.I = Utilities.k(j26, ((float) getBaseDuration()) - (this.K * f24), (-this.J) * f24);
        }
        invalidate();
        t8 t8Var5 = this.f52257a;
        if (t8Var5 != null) {
            t8Var5.z(this.I + (this.J * ((float) this.H)));
        }
        boolean z10 = this.f52284m1;
        if (!z10 && (t8Var = this.f52257a) != null) {
            t8Var.t(true);
            u8 u8Var6 = this.h;
            if (u8Var6 != null) {
                long j27 = this.I + (this.J * ((float) this.H));
                float f25 = u8Var6.h;
                float f26 = (float) u8Var6.e;
                k10 = Utilities.k(j27, f25 * f26, u8Var6.f52027g * f26);
            } else {
                float f27 = this.J;
                k10 = Utilities.k(f27 * ((float) j15), this.H, 0L);
            }
            if (this.h != null && Math.abs(this.e - k10) > 400) {
                this.f52265c1 = this.e;
                this.f52262b1.e(true, 1.0f);
            }
            t8 t8Var6 = this.f52257a;
            this.e = k10;
            t8Var6.j(k10, false);
        } else if (z10 || this.f52296r1) {
            u8 u8Var7 = this.h;
            if (u8Var7 != null) {
                long j28 = this.I + (this.J * ((float) this.H));
                float f28 = u8Var7.h;
                float f29 = (float) u8Var7.e;
                this.e = Utilities.k(j28, f28 * f29, u8Var7.f52027g * f29);
            } else {
                float f30 = this.J;
                this.e = Utilities.k(f30 * ((float) j14), this.H, 0L);
            }
            t8 t8Var7 = this.f52257a;
            if (t8Var7 != null) {
                t8Var7.j(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        u8 u8Var = this.h;
        long j10 = u8Var.e;
        this.f52270f = Utilities.k((((u8Var.h + u8Var.f52027g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        boolean z11 = true;
        if (z10 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            if (!this.N || this.h != null) {
                z11 = false;
            }
            this.P = z11;
        }
        invalidate();
    }

    public final boolean m(boolean z10, float f7) {
        long j10;
        u8 u8Var;
        u8 u8Var2 = this.h;
        ArrayList arrayList = this.f52297s;
        if (u8Var2 != null || this.N || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f10 = ((f7 - this.f52314y1) - this.f52311x1) / this.f52303u1;
            u8 u8Var3 = this.f52306w;
            if (u8Var3 != null) {
                j10 = (u8Var3.f52027g * ((float) u8Var3.e)) + ((float) u8Var3.f52026f);
            } else {
                j10 = 0;
            }
            float f11 = f10 * ((float) min);
            if (u8Var3 == null) {
                if (this.h == null) {
                    j10 = this.Q;
                } else {
                    j10 = 0;
                }
            }
            long i10 = Utilities.i((f11 - ((float) j10)) + ((float) this.f52270f), (float) getBaseDuration(), 0.0f);
            u8 u8Var4 = this.h;
            if (u8Var4 != null) {
                float f12 = ((float) i10) / ((float) u8Var4.e);
                if (f12 < u8Var4.f52027g || f12 > u8Var4.h) {
                    return false;
                }
            }
            if (this.f52306w == null || (i10 >= 0 && i10 < (u8Var.h - u8Var.f52027g) * ((float) u8Var.e))) {
                if (this.N && u8Var4 == null && arrayList.isEmpty()) {
                    float f13 = ((float) i10) / ((float) this.R);
                    if (f13 < this.S || f13 > this.T) {
                        return false;
                    }
                }
                this.e = i10;
                invalidate();
                t8 t8Var = this.f52257a;
                if (t8Var != null) {
                    t8Var.j(i10, z10);
                }
                q8 q8Var = this.f52267d1;
                if (q8Var != null) {
                    org.telegram.messenger.i0.r(q8Var);
                    this.f52267d1 = null;
                }
                if (z10) {
                    q8 q8Var2 = new q8(this, i10, 0);
                    this.f52267d1 = q8Var2;
                    org.telegram.messenger.i0.h3(q8Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j10, long j11, float f7, float f10, float f11, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        boolean z13;
        u8 u8Var;
        long maxScrollDuration;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        x8 x8Var = this.M;
        Long l4 = null;
        if (x8Var != null) {
            x8Var.b();
            this.M = null;
        }
        long j13 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j10;
            this.I = j11 - (((float) j10) * f7);
            this.J = f7;
            this.K = f10;
            this.L = f11;
            if (getMeasuredWidth() <= 0 || this.M != null || ((u8Var = this.h) != null && u8Var.e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.F;
                int i10 = this.f52305v1;
                int i11 = this.f52314y1;
                int i12 = (i10 - i11) - i11;
                int L = org.telegram.messenger.i0.L(38.0f);
                long j14 = this.H;
                if (j14 > 2) {
                    l4 = Long.valueOf(j14);
                }
                u8 u8Var2 = this.h;
                if (u8Var2 != null) {
                    maxScrollDuration = u8Var2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z11 = false;
                z12 = true;
                this.M = new x8(this, false, str2, i12, L, l4, maxScrollDuration, -1L, -1L, new p8(this, 0));
            }
            if (this.h == null) {
                this.P = z11;
                this.G = z12;
            }
        } else {
            z11 = false;
            j12 = j13;
            z12 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        if (this.F != null) {
            z13 = z12;
        } else {
            z13 = z11;
        }
        this.E = z13;
        if (j12 != j10 && this.h == null && this.f52258a0 != null) {
            this.W = z12;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.i(((float) j10) / ((float) this.R), 1.0f, 0.0f);
        }
        if (!z10) {
            this.f52266d0.f(this.G, z12);
            this.f52271f0.f(this.P, z12);
            this.f52264c0.f(this.E, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f7) {
        String str2;
        u8 u8Var = this.h;
        if (u8Var == null) {
            str2 = null;
        } else {
            str2 = u8Var.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        u8 u8Var2 = this.h;
        if (u8Var2 != null) {
            x8 x8Var = u8Var2.f52025c;
            if (x8Var != null) {
                x8Var.b();
                this.h.f52025c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f52270f = 0L;
            u8 u8Var3 = new u8(this);
            this.h = u8Var3;
            u8Var3.f52024b = z10;
            u8Var3.d = str;
            u8Var3.e = j10;
            u8Var3.f52028i = f7;
            u8.a(u8Var3, false);
        } else {
            this.h = null;
            this.f52270f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        this.P0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        int L = org.telegram.messenger.i0.L(12.0f);
        this.f52314y1 = L;
        int L2 = org.telegram.messenger.i0.L(5.0f);
        this.f52316z1 = L2;
        setPadding(L, L2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f52305v1 = size;
        int L3 = org.telegram.messenger.i0.L(388);
        this.f52308w1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.i0.L(10.0f);
        this.f52311x1 = L4;
        this.f52303u1 = (this.f52305v1 - (L4 * 2)) - (this.f52314y1 * 2);
        u8 u8Var = this.h;
        if (u8Var != null && u8Var.d != null && u8Var.f52025c == null) {
            u8.a(u8Var, false);
        }
        ArrayList arrayList = this.f52297s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                u8 u8Var2 = (u8) obj;
                if (u8Var2.d != null && u8Var2.f52025c == null) {
                    u8.a(u8Var2, false);
                    u8.b(u8Var2);
                }
            }
        }
        if (this.O != null && this.f52258a0 == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: vh.z8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.f52258a0 == null || this.W) {
                this.f52258a0 = new s8(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.f52273g0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        u8 u8Var;
        ex0 ex0Var = new ex0(26);
        ArrayList arrayList = this.f52297s;
        Collections.sort(arrayList, ex0Var);
        if (arrayList.isEmpty()) {
            u8Var = null;
        } else {
            u8Var = (u8) arrayList.get(0);
        }
        this.f52306w = u8Var;
        if (u8Var != null) {
            long j10 = u8Var.f52026f;
        }
    }

    public void setCollage(ArrayList<n5> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        x8 x8Var;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f52297s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            u8 u8Var = (u8) arrayList2.get(i10);
            if (u8Var != null && (x8Var = u8Var.f52025c) != null) {
                x8Var.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f52294r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            s8 s8Var = (s8) arrayList3.get(i11);
            if (s8Var != null) {
                s8Var.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f52275h0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                n5 n5Var = arrayList.get(i12);
                if (n5Var.K) {
                    u8 u8Var2 = new u8(this);
                    u8Var2.f52023a = i12;
                    u8Var2.f52024b = false;
                    u8Var2.d = n5Var.L.getAbsolutePath();
                    u8Var2.e = n5Var.f51531h0;
                    u8Var2.f52026f = n5Var.X;
                    u8Var2.f52028i = n5Var.P;
                    u8Var2.f52027g = n5Var.V;
                    u8Var2.h = n5Var.W;
                    u8.a(u8Var2, false);
                    u8.b(u8Var2);
                    arrayList2.add(u8Var2);
                }
            }
        }
        q();
        this.f52285n = 0;
    }

    public void setDelegate(t8 t8Var) {
        this.f52257a = t8Var;
    }

    public void setMaxCount(int i10) {
        this.f52261b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f52260b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: vh.z8.setProgress(long):void");
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        u8 u8Var = this.h;
        if (u8Var == null) {
            return;
        }
        u8Var.f52027g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        u8 u8Var = this.h;
        if (u8Var == null) {
            return;
        }
        u8Var.h = f7;
        invalidate();
    }
}
