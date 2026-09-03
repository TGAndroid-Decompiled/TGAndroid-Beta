package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.du;
import org.telegram.ui.y61;
public final class la extends View {
    public final Paint A0;
    public boolean B;
    public final TextPaint B0;
    public String C;
    public final RectF C0;
    public boolean D;
    public final Path D0;
    public long E;
    public final Paint E0;
    public long F;
    public final ka F0;
    public float G;
    public final Paint G0;
    public float H;
    public final Drawable H0;
    public float I;
    public final TextPaint I0;
    public ja J;
    public StaticLayout J0;
    public boolean K;
    public float K0;
    public String L;
    public float L0;
    public boolean M;
    public final TextPaint M0;
    public long N;
    public StaticLayout N0;
    public long O;
    public float O0;
    public float P;
    public float P0;
    public float Q;
    public final LinearGradient Q0;
    public boolean R;
    public final Matrix R0;
    public float S;
    public final Paint S0;
    public boolean T;
    public final vm0 T0;
    public ea U;
    public boolean U0;
    public int V;
    public final y61 V0;
    public final org.telegram.ui.Components.z5 W;
    public long W0;
    public long X0;
    public final org.telegram.ui.Components.z5 Y0;
    public long Z0;
    public fa f45661a;
    public final org.telegram.ui.Components.z5 f45662a0;
    public hg.y1 f45663a1;
    public Runnable f45664b;
    public final org.telegram.ui.Components.z5 f45665b0;
    public long f45666b1;
    public int f45667c;
    public final org.telegram.ui.Components.z5 f45668c0;
    public long f45669c1;
    public Runnable d;
    public final org.telegram.ui.Components.z5 f45670d0;
    public float f45671d1;
    public long f45672e;
    public final org.telegram.ui.Components.z5 f45673e0;
    public int f45674e1;
    public long f45675f;
    public final org.telegram.ui.Components.z5 f45676f0;
    public int f45677f1;
    public boolean f45678g0;
    public int f45679g1;
    public ga h;
    public final org.telegram.ui.Components.ba f45680h0;
    public int f45681h1;
    public final org.telegram.ui.Components.fa f45682i0;
    public boolean f45683i1;
    public final org.telegram.ui.Components.fa f45684j0;
    public boolean f45685j1;
    public final org.telegram.ui.Components.fa f45686k0;
    public float f45687k1;
    public final RectF f45688l0;
    public boolean l1;
    public final Path m0;
    public VelocityTracker f45689m1;
    public int f45690n;
    public final k01 f45691n0;
    public boolean f45692n1;
    public final Drawable f45693o0;
    public boolean f45694o1;
    public final ka f45695p0;
    public int f45696p1;
    public final RectF f45697q0;
    public final float[] f45698q1;
    public final ArrayList f45699r;
    public final Paint f45700r0;
    public int f45701r1;
    public final ArrayList f45702s;
    public final Path f45703s0;
    public int f45704s1;
    public final Path f45705t0;
    public int f45706t1;
    public final RectF f45707u0;
    public int f45708u1;
    public ga v;
    public final Path f45709v0;
    public int f45710v1;
    public final Paint f45711w;
    public final Paint f45712w0;
    public int f45713w1;
    public final Path f45714x;
    public final Paint f45715x0;
    public final Path f45716y;
    public final Paint f45717y0;
    public final Paint f45718z0;

    public la(Context context, ViewGroup viewGroup, m9 m9Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f45690n = 0;
        this.f45699r = new ArrayList();
        this.f45702s = new ArrayList();
        this.f45711w = new Paint(3);
        this.f45714x = new Path();
        this.f45716y = new Path();
        this.V = 1;
        pr prVar = pr.h;
        this.W = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45662a0 = new org.telegram.ui.Components.z5(this, 360L, prVar);
        this.f45665b0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45668c0 = new org.telegram.ui.Components.z5(this, 360L, prVar);
        this.f45670d0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45673e0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45676f0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.f45678g0 = true;
        this.f45688l0 = new RectF();
        this.m0 = new Path();
        this.f45695p0 = new ka();
        this.f45697q0 = new RectF();
        this.f45700r0 = new Paint(3);
        this.f45703s0 = new Path();
        this.f45705t0 = new Path();
        this.f45707u0 = new RectF();
        this.f45709v0 = new Path();
        Paint paint = new Paint(1);
        this.f45712w0 = paint;
        Paint paint2 = new Paint(1);
        this.f45715x0 = paint2;
        Paint paint3 = new Paint(1);
        this.f45717y0 = paint3;
        Paint paint4 = new Paint(1);
        this.f45718z0 = paint4;
        Paint paint5 = new Paint(1);
        this.A0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.B0 = textPaint;
        this.C0 = new RectF();
        this.D0 = new Path();
        Paint paint6 = new Paint(1);
        this.E0 = paint6;
        this.F0 = new ka();
        Paint paint7 = new Paint(1);
        this.G0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.I0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.M0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Q0 = linearGradient;
        this.R0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.S0 = paint8;
        this.T0 = new vm0(getContext(), null);
        this.W0 = -1L;
        this.X0 = -1L;
        this.Y0 = new org.telegram.ui.Components.z5(0.0f, this, 0L, 340L, prVar);
        this.Z0 = -1L;
        this.f45674e1 = -1;
        this.f45677f1 = -1;
        this.f45679g1 = -1;
        this.f45681h1 = -1;
        this.f45687k1 = 1.0f;
        this.f45692n1 = true;
        this.f45694o1 = false;
        this.f45698q1 = new float[8];
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), 1073741824);
        textPaint.setTypeface(AndroidUtilities.bold());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.f45691n0 = new k01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f45693o0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.H0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f45680h0 = baVar;
        this.f45682i0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.f45684j0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.f45686k0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.V0 = new y61(this, viewGroup, g6Var, baVar, m9Var, 2);
    }

    public static void a(final la laVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i10;
        ArrayList arrayList = laVar.f45702s;
        int i11 = laVar.f45679g1;
        try {
            if (i11 == 2 && laVar.K) {
                k6 k6Var = new k6(laVar.getContext(), 0);
                k6Var.f45613b = 0.0f;
                k6Var.f45614c = 1.5f;
                k6Var.d(laVar.S);
                k6Var.h = new Utilities.Callback(laVar) {
                    public final la f45251b;

                    {
                        this.f45251b = laVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                la laVar2 = this.f45251b;
                                laVar2.S = floatValue;
                                fa faVar = laVar2.f45661a;
                                if (faVar != null) {
                                    faVar.A(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                la laVar3 = this.f45251b;
                                laVar3.I = floatValue2;
                                fa faVar2 = laVar3.f45661a;
                                if (faVar2 != null) {
                                    faVar2.u(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                la laVar4 = this.f45251b;
                                laVar4.h.f45375i = f10.floatValue();
                                fa faVar3 = laVar4.f45661a;
                                if (faVar3 != null) {
                                    faVar3.X(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(laVar.getBaseDuration(), laVar.getMaxScrollDuration());
                int i12 = laVar.f45704s1;
                int i13 = laVar.f45710v1;
                int i14 = laVar.f45708u1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(laVar.Q, 1.0f, laVar.f45668c0.f33763c) * ((float) laVar.O)) + ((float) (laVar.N - laVar.f45675f))) / ((float) min)) * laVar.f45701r1) + i13 + i14);
                q70 F = q70.F(viewGroup, g6Var, laVar);
                F.q(k6Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new ca(laVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(laVar.f45704s1 - min2)) + AndroidUtilities.dp(18.0f), laVar.C0.top);
                F.Z();
                F.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && laVar.B) {
                k6 k6Var2 = new k6(laVar.getContext(), 0);
                k6Var2.f45613b = 0.0f;
                k6Var2.f45614c = 1.5f;
                k6Var2.d(laVar.I);
                k6Var2.h = new Utilities.Callback(laVar) {
                    public final la f45251b;

                    {
                        this.f45251b = laVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                la laVar2 = this.f45251b;
                                laVar2.S = floatValue;
                                fa faVar = laVar2.f45661a;
                                if (faVar != null) {
                                    faVar.A(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                la laVar3 = this.f45251b;
                                laVar3.I = floatValue2;
                                fa faVar2 = laVar3.f45661a;
                                if (faVar2 != null) {
                                    faVar2.u(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                la laVar4 = this.f45251b;
                                laVar4.h.f45375i = f10.floatValue();
                                fa faVar3 = laVar4.f45661a;
                                if (faVar3 != null) {
                                    faVar3.X(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(laVar.getBaseDuration(), laVar.getMaxScrollDuration());
                int i15 = laVar.f45704s1;
                int i16 = laVar.f45710v1;
                int i17 = laVar.f45708u1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(laVar.H, 1.0f, laVar.f45662a0.f33763c) * ((float) laVar.E)) + ((float) (laVar.F - laVar.f45675f))) / ((float) min3)) * laVar.f45701r1) + i16 + i17);
                q70 F2 = q70.F(viewGroup, g6Var, laVar);
                F2.q(k6Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new ca(laVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(laVar.f45704s1 - min4)) + AndroidUtilities.dp(18.0f), laVar.f45707u0.top);
                F2.Z();
                F2.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && laVar.h != null) {
                k6 k6Var3 = new k6(laVar.getContext(), 0);
                k6Var3.f45613b = 0.0f;
                k6Var3.f45614c = 1.5f;
                k6Var3.d(laVar.h.f45375i);
                k6Var3.h = new Utilities.Callback(laVar) {
                    public final la f45251b;

                    {
                        this.f45251b = laVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                la laVar2 = this.f45251b;
                                laVar2.S = floatValue;
                                fa faVar = laVar2.f45661a;
                                if (faVar != null) {
                                    faVar.A(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                la laVar3 = this.f45251b;
                                laVar3.I = floatValue2;
                                fa faVar2 = laVar3.f45661a;
                                if (faVar2 != null) {
                                    faVar2.u(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                la laVar4 = this.f45251b;
                                laVar4.h.f45375i = f10.floatValue();
                                fa faVar3 = laVar4.f45661a;
                                if (faVar3 != null) {
                                    faVar3.X(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                q70 F3 = q70.F(viewGroup, g6Var, laVar);
                F3.q(k6Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), laVar.f45697q0.top);
                F3.Z();
                F3.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = laVar.f45681h1) >= 0 && i10 < arrayList.size()) {
                ga gaVar = (ga) arrayList.get(laVar.f45681h1);
                k6 k6Var4 = new k6(laVar.getContext(), 0);
                k6Var4.f45613b = 0.0f;
                k6Var4.f45614c = 1.5f;
                k6Var4.d(gaVar.f45375i);
                k6Var4.h = new org.telegram.ui.web.a2(8, laVar, gaVar);
                q70 F4 = q70.F(viewGroup, g6Var, laVar);
                F4.q(k6Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), gaVar.f45376j.top);
                F4.Z();
                F4.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f45668c0.e(this.M));
    }

    public long getBaseDuration() {
        ga gaVar = this.h;
        if (gaVar != null) {
            return Math.max(1L, gaVar.f45372e);
        }
        ga gaVar2 = this.v;
        if (gaVar2 != null) {
            return Math.max(1L, gaVar2.f45372e);
        }
        if (this.B) {
            return Math.max(1L, this.E);
        }
        return Math.max(1L, this.O);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f45702s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((ga) arrayList.get(i10)).f45377k.f33763c);
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.B) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f45662a0.e(this.D));
    }

    private float getVideoHeight() {
        ga gaVar = this.h;
        if (gaVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), gaVar.f45377k.f33763c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: qh.la.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        vm0 vm0Var = this.T0;
        if (vm0Var.b()) {
            int i10 = vm0Var.f31927j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f45692n1) {
                this.f45675f = Math.max(0.0f, (((i10 - this.f45710v1) - this.f45708u1) / this.f45701r1) * ((float) min));
            } else if (!this.M) {
                vm0Var.a();
                return;
            } else {
                int i11 = this.f45710v1;
                int i12 = this.f45708u1;
                float f10 = this.f45701r1;
                float f11 = (float) min;
                h(((((i10 - i11) - i12) / f10) * f11) - ((((this.f45696p1 - i11) - i12) / f10) * f11));
            }
            invalidate();
            this.f45696p1 = i10;
        } else if (this.f45694o1) {
            this.f45694o1 = false;
            fa faVar = this.f45661a;
            if (faVar != null) {
                faVar.U(false);
            }
        }
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        long j11;
        float f13;
        if (this.U0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = (float) Utilities.clamp(j10, getBaseDuration(), 0L);
        ga gaVar = this.v;
        if (gaVar != null) {
            f13 = (gaVar.f45374g * ((float) gaVar.f45372e)) + ((float) gaVar.f45373f);
        } else {
            if (this.h == null) {
                j11 = this.N;
            } else {
                j11 = 0;
            }
            f13 = (float) j11;
        }
        float f14 = (this.f45701r1 * (((clamp + f13) - ((float) this.f45675f)) / ((float) min))) + this.f45710v1 + this.f45708u1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.f45718z0;
        paint.setAlpha((int) (38.0f * f12));
        int i10 = (int) (f12 * 255.0f);
        Paint paint2 = this.A0;
        paint2.setAlpha(i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: qh.la.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        Paint paint2;
        float f16;
        float f17;
        float f18;
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        float f19 = 10.0f;
        rectF.set(f12 - AndroidUtilities.dp(10.0f), f10, AndroidUtilities.dp(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f45704s1, this.f45706t1, 255, 31);
        int i10 = (int) (255.0f * f14);
        Paint paint3 = this.f45712w0;
        paint3.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        if (this.U0) {
            f15 = 2.5f;
        } else {
            f15 = 10.0f;
        }
        rectF.inset(AndroidUtilities.dp(f15), AndroidUtilities.dp(2.0f));
        boolean z4 = this.U0;
        Paint paint4 = this.f45715x0;
        if (z4) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint5 = this.f45717y0;
        if (paint != null) {
            paint2 = paint;
        } else {
            paint2 = paint5;
        }
        paint5.setAlpha(255);
        paint2.setAlpha(i10);
        if (this.U0) {
            f16 = 2.0f;
        } else {
            f16 = 10.0f;
        }
        float a2 = org.telegram.messenger.y3.a(AndroidUtilities.dp(f16), dp, 2.0f, f12);
        float f20 = f10 + f11;
        float f21 = (f20 - dp2) / 2.0f;
        if (this.U0) {
            f17 = 2.0f;
        } else {
            f17 = 10.0f;
        }
        float f22 = (f20 + dp2) / 2.0f;
        rectF.set(a2, f21, f12 - ((AndroidUtilities.dp(f17) + dp) / 2.0f), f22);
        if (!this.U0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.U0) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        if (this.U0) {
            f18 = 2.5f;
        } else {
            f18 = 10.0f;
        }
        float x10 = e2.c.x(AndroidUtilities.dp(f18), dp, 2.0f, f13);
        if (this.U0) {
            f19 = 2.5f;
        }
        rectF.set(x10, f21, l.d.b(AndroidUtilities.dp(f19), dp, 2.0f, f13), f22);
        if (!this.U0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                paint5.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.V * 59000;
    }

    public final long g() {
        return Math.max(1000.0f, ((float) Math.min(getBaseDuration(), 59000L)) * 0.15f);
    }

    public int getContentHeight() {
        float f10;
        float collageHeight;
        float f11;
        float f12 = this.f45713w1;
        float f13 = 0.0f;
        if (this.h != null) {
            f10 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f12 + f10;
        if (this.f45702s.isEmpty()) {
            collageHeight = 0.0f;
        } else {
            collageHeight = getCollageHeight() + AndroidUtilities.dp(4.0f);
        }
        float f15 = f14 + collageHeight;
        if (this.B) {
            f11 = getRoundHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f16 = f15 + f11;
        if (this.K) {
            f13 = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (f16 + f13 + this.f45713w1);
    }

    public int getMaxCount() {
        return this.V;
    }

    public long getMaxScrollDuration() {
        if (this.f45702s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f45713w1 + this.f45713w1, getContentHeight(), this.f45676f0.f33763c);
    }

    public final void h(float f10) {
        float f11;
        long j10;
        float f12;
        long j11;
        float f13;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        fa faVar;
        long j17;
        long clamp;
        ga gaVar = this.h;
        if (gaVar == null && !this.B) {
            long j18 = this.N;
            long clamp2 = Utilities.clamp(j18 + f10, 0L, -(this.O - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.N = clamp2;
            float f14 = (float) (clamp2 - j18);
            this.P = Utilities.clamp(this.P - (f14 / ((float) this.O)), 1.0f, 0.0f);
            this.Q = Utilities.clamp(this.Q - (f14 / ((float) this.O)), 1.0f, 0.0f);
            fa faVar2 = this.f45661a;
            if (faVar2 != null) {
                faVar2.t0(this.P);
                this.f45661a.r0(this.Q);
            }
        } else if (this.M) {
            if (gaVar != null) {
                f11 = gaVar.f45374g;
                j10 = gaVar.f45372e;
            } else {
                f11 = this.G;
                j10 = this.E;
            }
            float f15 = f11 * ((float) j10);
            if (gaVar != null) {
                f12 = gaVar.h;
                j11 = gaVar.f45372e;
            } else {
                f12 = this.H;
                j11 = this.E;
            }
            float f16 = f12 * ((float) j11);
            if (gaVar != null) {
                f13 = (gaVar.h - gaVar.f45374g) * ((float) gaVar.f45372e);
            } else {
                f13 = ((float) this.E) * (this.H - this.G);
            }
            float f17 = this.Q;
            float f18 = (float) this.O;
            float f19 = this.P;
            long j19 = f15 - (f19 * f18);
            float min = Math.min(f17 - f19, f13 / f18);
            long j20 = this.N;
            long j21 = f10;
            long j22 = j20 + j21;
            if (j22 > f16 - (f17 * f18)) {
                float clamp3 = Utilities.clamp(((f16 - ((float) j20)) - ((float) j21)) / ((float) this.O), 1.0f, min);
                this.Q = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.P = clamp4;
                float f20 = this.Q;
                float f21 = (float) this.O;
                long j23 = f16 - (f20 * f21);
                long j24 = f15 - (clamp4 * f21);
                if (j23 < j24) {
                    j15 = j24;
                    j14 = j23;
                } else {
                    j14 = j24;
                    j15 = j23;
                }
                this.N = Utilities.clamp(this.N + j21, j15, j14);
                fa faVar3 = this.f45661a;
                if (faVar3 != null) {
                    faVar3.t0(this.P);
                    this.f45661a.r0(this.Q);
                }
            } else if (j22 < j19) {
                float clamp5 = Utilities.clamp(((f15 - ((float) j20)) - ((float) j21)) / ((float) this.O), 1.0f - min, 0.0f);
                this.P = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.Q = clamp6;
                float f22 = (float) this.O;
                long j25 = f16 - (clamp6 * f22);
                long j26 = f15 - (this.P * f22);
                if (j25 < j26) {
                    j13 = j26;
                    j12 = j25;
                } else {
                    j12 = j26;
                    j13 = j25;
                }
                this.N = Utilities.clamp(this.N + j21, j13, j12);
                fa faVar4 = this.f45661a;
                if (faVar4 != null) {
                    faVar4.t0(this.P);
                    this.f45661a.r0(this.Q);
                }
            } else {
                this.N = j22;
            }
        } else {
            long j27 = this.N + f10;
            float f23 = (float) this.O;
            this.N = Utilities.clamp(j27, ((float) getBaseDuration()) - (this.Q * f23), (-this.P) * f23);
        }
        invalidate();
        fa faVar5 = this.f45661a;
        if (faVar5 != null) {
            faVar5.H0(this.N + (this.P * ((float) this.O)));
        }
        boolean z4 = this.f45685j1;
        if (!z4 && (faVar = this.f45661a) != null) {
            faVar.U(true);
            ga gaVar2 = this.h;
            if (gaVar2 != null) {
                long j28 = this.N + (this.P * ((float) this.O));
                float f24 = gaVar2.h;
                float f25 = (float) gaVar2.f45372e;
                clamp = Utilities.clamp(j28, f24 * f25, gaVar2.f45374g * f25);
            } else if (this.B) {
                long j29 = this.N + (this.P * ((float) this.O));
                float f26 = this.H;
                float f27 = (float) this.E;
                clamp = Utilities.clamp(j29, f26 * f27, this.G * f27);
            } else {
                float f28 = this.P;
                clamp = Utilities.clamp(f28 * ((float) j17), this.O, 0L);
            }
            if (this.h != null && Math.abs(this.f45672e - clamp) > 400) {
                this.Z0 = this.f45672e;
                this.Y0.d(1.0f, true);
            }
            fa faVar6 = this.f45661a;
            this.f45672e = clamp;
            faVar6.B(clamp, false);
        } else if (z4 || this.f45694o1) {
            ga gaVar3 = this.h;
            if (gaVar3 != null) {
                long j30 = this.N + (this.P * ((float) this.O));
                float f29 = gaVar3.h;
                float f30 = (float) gaVar3.f45372e;
                this.f45672e = Utilities.clamp(j30, f29 * f30, gaVar3.f45374g * f30);
            } else if (this.B && gaVar3 != null) {
                long j31 = this.N + (this.P * ((float) this.O));
                float f31 = this.H;
                float f32 = (float) gaVar3.f45372e;
                this.f45672e = Utilities.clamp(j31, f31 * f32, this.G * f32);
            } else {
                float f33 = this.P;
                this.f45672e = Utilities.clamp(f33 * ((float) j16), this.O, 0L);
            }
            fa faVar7 = this.f45661a;
            if (faVar7 != null) {
                faVar7.B(this.f45672e, false);
            }
        }
    }

    public final void i(ga gaVar, float f10) {
        long j10;
        fa faVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (gaVar != null) {
            ga gaVar2 = this.v;
            if (gaVar2 != gaVar && gaVar2 != null) {
                if (this.f45690n == this.f45702s.indexOf(gaVar)) {
                    ga gaVar3 = this.v;
                    float f11 = (float) gaVar3.f45372e;
                    float f12 = gaVar.h;
                    float f13 = (float) gaVar.f45372e;
                    float f14 = gaVar.f45374g;
                    long j16 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((gaVar3.h - gaVar3.f45374g) * f11) / f13);
                    long j17 = gaVar.f45373f;
                    long j18 = f10;
                    long j19 = j17 + j18;
                    if (j19 > (f11 * 1.0f) - (f12 * f13)) {
                        ga gaVar4 = this.v;
                        float clamp2 = Utilities.clamp((((gaVar4.h * ((float) gaVar4.f45372e)) - ((float) j17)) - ((float) j18)) / ((float) gaVar.f45372e), 1.0f, min);
                        gaVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        gaVar.f45374g = clamp3;
                        ga gaVar5 = this.v;
                        float f15 = gaVar5.h;
                        float f16 = (float) gaVar5.f45372e;
                        float f17 = gaVar.h;
                        float f18 = (float) gaVar.f45372e;
                        long j20 = (f15 * f16) - (f17 * f18);
                        long j21 = (gaVar5.f45374g * f16) - (clamp3 * f18);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        gaVar.f45373f = Utilities.clamp(gaVar.f45373f + j18, j15, j14);
                        fa faVar2 = this.f45661a;
                        if (faVar2 != null) {
                            faVar2.m0(gaVar.f45374g, gaVar.f45369a);
                            this.f45661a.u0(gaVar.h, gaVar.f45369a);
                        }
                    } else if (j19 < j16) {
                        ga gaVar6 = this.v;
                        float clamp4 = Utilities.clamp((((gaVar6.f45374g * ((float) gaVar6.f45372e)) - ((float) j17)) - ((float) j18)) / ((float) gaVar.f45372e), 1.0f - min, 0.0f);
                        gaVar.f45374g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        gaVar.h = clamp5;
                        ga gaVar7 = this.v;
                        float f19 = gaVar7.h;
                        float f20 = (float) gaVar7.f45372e;
                        float f21 = (float) gaVar.f45372e;
                        long j22 = (f19 * f20) - (clamp5 * f21);
                        long j23 = (gaVar7.f45374g * f20) - (gaVar.f45374g * f21);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        gaVar.f45373f = Utilities.clamp(gaVar.f45373f + j18, j13, j12);
                        fa faVar3 = this.f45661a;
                        if (faVar3 != null) {
                            faVar3.m0(gaVar.f45374g, gaVar.f45369a);
                            this.f45661a.u0(gaVar.h, gaVar.f45369a);
                        }
                    } else {
                        gaVar.f45373f = j19;
                    }
                } else {
                    long j24 = gaVar.f45373f + f10;
                    float f22 = (float) gaVar.f45372e;
                    gaVar.f45373f = Utilities.clamp(j24, ((float) getBaseDuration()) - (gaVar.h * f22), (-gaVar.f45374g) * f22);
                }
            }
            invalidate();
            fa faVar4 = this.f45661a;
            if (faVar4 != null) {
                faVar4.E0(gaVar.f45369a, gaVar.f45373f);
            }
            boolean z4 = this.f45685j1;
            if (!z4 && (faVar = this.f45661a) != null) {
                faVar.U(true);
                ga gaVar8 = this.v;
                if (gaVar8 != gaVar && gaVar8 != null) {
                    long j25 = gaVar.f45373f + (gaVar.f45374g * ((float) gaVar.f45372e));
                    float f23 = gaVar8.h;
                    float f24 = (float) gaVar8.f45372e;
                    clamp = Utilities.clamp(j25, f23 * f24, gaVar8.f45374g * f24);
                } else {
                    float f25 = gaVar.f45374g;
                    clamp = Utilities.clamp(f25 * ((float) j11), gaVar.f45372e, 0L);
                }
                ga gaVar9 = this.v;
                if (gaVar9 != gaVar && gaVar9 != null && Math.abs(this.f45672e - clamp) > 400) {
                    this.Z0 = this.f45672e;
                    this.Y0.d(1.0f, true);
                }
                fa faVar5 = this.f45661a;
                this.f45672e = clamp;
                faVar5.B(clamp, false);
            } else if (z4 || this.f45694o1) {
                ga gaVar10 = this.v;
                if (gaVar10 != gaVar && gaVar10 != null) {
                    long j26 = gaVar.f45373f + (gaVar.f45374g * ((float) gaVar.f45372e));
                    float f26 = gaVar10.h;
                    float f27 = (float) gaVar10.f45372e;
                    this.f45672e = Utilities.clamp(j26, f26 * f27, gaVar10.f45374g * f27);
                } else {
                    float f28 = gaVar.f45374g;
                    this.f45672e = Utilities.clamp(f28 * ((float) j10), gaVar.f45372e, 0L);
                }
                fa faVar6 = this.f45661a;
                if (faVar6 != null) {
                    faVar6.B(this.f45672e, false);
                }
            }
        }
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        fa faVar;
        long j15;
        long clamp;
        ga gaVar = this.h;
        if (gaVar == null) {
            long j16 = this.F;
            long clamp2 = Utilities.clamp(j16 + f10, 0L, -(this.E - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.F = clamp2;
            float f11 = (float) (clamp2 - j16);
            this.G = Utilities.clamp(this.G - (f11 / ((float) this.E)), 1.0f, 0.0f);
            this.H = Utilities.clamp(this.H - (f11 / ((float) this.E)), 1.0f, 0.0f);
            fa faVar2 = this.f45661a;
            if (faVar2 != null) {
                faVar2.J(this.G);
                this.f45661a.y0(this.H);
            }
        } else if (this.D) {
            float f12 = gaVar.h;
            float f13 = (float) gaVar.f45372e;
            float f14 = this.H;
            float f15 = (float) this.E;
            long j17 = (f12 * f13) - (f14 * f15);
            float f16 = gaVar.f45374g;
            float f17 = this.G;
            long j18 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j19 = this.F;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                ga gaVar2 = this.h;
                float clamp3 = Utilities.clamp((((gaVar2.h * ((float) gaVar2.f45372e)) - ((float) j19)) - ((float) j20)) / ((float) this.E), 1.0f, min);
                this.H = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.G = clamp4;
                ga gaVar3 = this.h;
                float f18 = gaVar3.h;
                float f19 = (float) gaVar3.f45372e;
                float f20 = this.H;
                float f21 = (float) this.E;
                long j22 = (f18 * f19) - (f20 * f21);
                long j23 = (gaVar3.f45374g * f19) - (clamp4 * f21);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.F = Utilities.clamp(this.F + j20, j13, j12);
                fa faVar3 = this.f45661a;
                if (faVar3 != null) {
                    faVar3.J(this.G);
                    this.f45661a.y0(this.H);
                }
            } else if (j21 < j18) {
                ga gaVar4 = this.h;
                float clamp5 = Utilities.clamp((((gaVar4.f45374g * ((float) gaVar4.f45372e)) - ((float) j19)) - ((float) j20)) / ((float) this.E), 1.0f - min, 0.0f);
                this.G = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.H = clamp6;
                ga gaVar5 = this.h;
                float f22 = gaVar5.h;
                float f23 = (float) gaVar5.f45372e;
                float f24 = (float) this.E;
                long j24 = (f22 * f23) - (clamp6 * f24);
                long j25 = (gaVar5.f45374g * f23) - (this.G * f24);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.F = Utilities.clamp(this.F + j20, j11, j10);
                fa faVar4 = this.f45661a;
                if (faVar4 != null) {
                    faVar4.J(this.G);
                    this.f45661a.y0(this.H);
                }
            } else {
                this.F = j21;
            }
        } else {
            long j26 = this.F + f10;
            float f25 = (float) this.E;
            this.F = Utilities.clamp(j26, ((float) getBaseDuration()) - (this.H * f25), (-this.G) * f25);
        }
        invalidate();
        fa faVar5 = this.f45661a;
        if (faVar5 != null) {
            faVar5.h0(this.F + (this.G * ((float) this.E)));
        }
        boolean z4 = this.f45685j1;
        if (!z4 && (faVar = this.f45661a) != null) {
            faVar.U(true);
            ga gaVar6 = this.h;
            if (gaVar6 != null) {
                long j27 = this.F + (this.G * ((float) this.E));
                float f26 = gaVar6.h;
                float f27 = (float) gaVar6.f45372e;
                clamp = Utilities.clamp(j27, f26 * f27, gaVar6.f45374g * f27);
            } else {
                float f28 = this.G;
                clamp = Utilities.clamp(f28 * ((float) j15), this.E, 0L);
            }
            if (this.h != null && Math.abs(this.f45672e - clamp) > 400) {
                this.Z0 = this.f45672e;
                this.Y0.d(1.0f, true);
            }
            fa faVar6 = this.f45661a;
            this.f45672e = clamp;
            faVar6.B(clamp, false);
        } else if (z4 || this.f45694o1) {
            ga gaVar7 = this.h;
            if (gaVar7 != null) {
                long j28 = this.F + (this.G * ((float) this.E));
                float f29 = gaVar7.h;
                float f30 = (float) gaVar7.f45372e;
                this.f45672e = Utilities.clamp(j28, f29 * f30, gaVar7.f45374g * f30);
            } else {
                float f31 = this.G;
                this.f45672e = Utilities.clamp(f31 * ((float) j14), this.E, 0L);
            }
            fa faVar7 = this.f45661a;
            if (faVar7 != null) {
                faVar7.B(this.f45672e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ga gaVar = this.h;
        long j10 = gaVar.f45372e;
        this.f45675f = Utilities.clamp((((gaVar.h + gaVar.f45374g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z4) {
        boolean z10 = true;
        if (z4 && this.B) {
            this.D = true;
            this.M = false;
        } else {
            this.D = false;
            this.M = (this.K && this.h == null) ? false : false;
        }
        invalidate();
    }

    public final boolean m(float f10, boolean z4) {
        long j10;
        ga gaVar;
        ga gaVar2 = this.h;
        ArrayList arrayList = this.f45702s;
        if (gaVar2 != null || this.K || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f45710v1) - this.f45708u1) / this.f45701r1;
            ga gaVar3 = this.v;
            if (gaVar3 != null) {
                j10 = (gaVar3.f45374g * ((float) gaVar3.f45372e)) + ((float) gaVar3.f45373f);
            } else {
                j10 = 0;
            }
            float f12 = f11 * ((float) min);
            if (gaVar3 == null) {
                if (this.h == null) {
                    j10 = this.N;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f12 - ((float) j10)) + ((float) this.f45675f), (float) getBaseDuration(), 0.0f);
            ga gaVar4 = this.h;
            if (gaVar4 != null) {
                float f13 = ((float) clamp) / ((float) gaVar4.f45372e);
                if (f13 < gaVar4.f45374g || f13 > gaVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (gaVar.h - gaVar.f45374g) * ((float) gaVar.f45372e))) {
                if (this.K && gaVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) clamp) / ((float) this.O);
                    if (f14 < this.P || f14 > this.Q) {
                        return false;
                    }
                }
                this.f45672e = clamp;
                invalidate();
                fa faVar = this.f45661a;
                if (faVar != null) {
                    faVar.B(clamp, z4);
                }
                hg.y1 y1Var = this.f45663a1;
                if (y1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y1Var);
                    this.f45663a1 = null;
                }
                if (z4) {
                    hg.y1 y1Var2 = new hg.y1(this, clamp, 27);
                    this.f45663a1 = y1Var2;
                    AndroidUtilities.runOnUIThread(y1Var2, 150L);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z4) {
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        ga gaVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.C, str)) {
            return;
        }
        ja jaVar = this.J;
        Long l10 = null;
        if (jaVar != null) {
            jaVar.b();
            this.J = null;
        }
        long j13 = this.E;
        if (str != null) {
            this.C = str;
            this.E = j10;
            this.F = j11 - (((float) j10) * f10);
            this.G = f10;
            this.H = f11;
            this.I = f12;
            if (getMeasuredWidth() <= 0 || this.J != null || ((gaVar = this.h) != null && gaVar.f45372e < 1)) {
                j12 = j13;
                z12 = false;
                z10 = true;
            } else {
                String str2 = this.C;
                int i10 = this.f45704s1;
                int i11 = this.f45710v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.E;
                if (j14 > 2) {
                    l10 = Long.valueOf(j14);
                }
                ga gaVar2 = this.h;
                if (gaVar2 != null) {
                    maxScrollDuration = gaVar2.f45372e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z12 = false;
                z10 = true;
                this.J = new ja(this, false, str2, i12, dp, l10, maxScrollDuration, -1L, -1L, new ca(this, 0));
            }
            if (this.h == null) {
                this.M = z12;
                this.D = z10;
            }
        } else {
            j12 = j13;
            z10 = true;
            this.C = null;
            this.E = 1L;
            this.D = false;
        }
        if (this.C != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.B = z11;
        if (j12 != j10 && this.h == null && this.U != null) {
            this.T = z10;
            p();
        }
        if (this.K && this.B && this.h == null) {
            this.P = 0.0f;
            this.Q = Utilities.clamp(((float) j10) / ((float) this.O), 1.0f, 0.0f);
        }
        if (!z4) {
            this.f45662a0.f(this.D, z10);
            this.f45668c0.f(this.M, z10);
            this.W.f(this.B, z10);
        }
        invalidate();
    }

    public final void o(boolean z4, String str, long j10, float f10) {
        String str2;
        ga gaVar = this.h;
        if (gaVar == null) {
            str2 = null;
        } else {
            str2 = gaVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ga gaVar2 = this.h;
        if (gaVar2 != null) {
            ja jaVar = gaVar2.f45371c;
            if (jaVar != null) {
                jaVar.b();
                this.h.f45371c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f45675f = 0L;
            ga gaVar3 = new ga(this);
            this.h = gaVar3;
            gaVar3.f45370b = z4;
            gaVar3.d = str;
            gaVar3.f45372e = j10;
            gaVar3.f45375i = f10;
            ga.a(gaVar3, false);
        } else {
            this.h = null;
            this.f45675f = 0L;
        }
        if (!this.B) {
            this.D = false;
        }
        this.f45672e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.I0.setTextSize(AndroidUtilities.dp(12.0f));
        this.M0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f45710v1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f45713w1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f45704s1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f45706t1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f45708u1 = dp4;
        this.f45701r1 = (this.f45704s1 - (dp4 * 2)) - (this.f45710v1 * 2);
        ga gaVar = this.h;
        if (gaVar != null && gaVar.d != null && gaVar.f45371c == null) {
            ga.a(gaVar, false);
        }
        ArrayList arrayList = this.f45702s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ga gaVar2 = (ga) obj;
                if (gaVar2.d != null && gaVar2.f45371c == null) {
                    ga.a(gaVar2, false);
                    ga.b(gaVar2);
                }
            }
        }
        if (this.L != null && this.U == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: qh.la.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.U == null || this.T) {
                this.U = new ea(this, this.L, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.R = false;
                this.f45670d0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        ga gaVar;
        du duVar = new du(17);
        ArrayList arrayList = this.f45702s;
        Collections.sort(arrayList, duVar);
        if (arrayList.isEmpty()) {
            gaVar = null;
        } else {
            gaVar = (ga) arrayList.get(0);
        }
        this.v = gaVar;
        if (gaVar != null) {
            long j10 = gaVar.f45373f;
        }
    }

    public void setCollage(ArrayList<r6> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ja jaVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f45702s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ga gaVar = (ga) arrayList2.get(i10);
            if (gaVar != null && (jaVar = gaVar.f45371c) != null) {
                jaVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f45699r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            ea eaVar = (ea) arrayList3.get(i11);
            if (eaVar != null) {
                eaVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f45673e0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                r6 r6Var = arrayList.get(i12);
                if (r6Var.K) {
                    ga gaVar2 = new ga(this);
                    gaVar2.f45369a = i12;
                    gaVar2.f45370b = false;
                    gaVar2.d = r6Var.L.getAbsolutePath();
                    gaVar2.f45372e = r6Var.f46010h0;
                    gaVar2.f45373f = r6Var.X;
                    gaVar2.f45375i = r6Var.P;
                    gaVar2.f45374g = r6Var.V;
                    gaVar2.h = r6Var.W;
                    ga.a(gaVar2, false);
                    ga.b(gaVar2);
                    arrayList2.add(gaVar2);
                }
            }
        }
        q();
        this.f45690n = 0;
    }

    public void setDelegate(fa faVar) {
        this.f45661a = faVar;
    }

    public void setMaxCount(int i10) {
        this.V = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f45664b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: qh.la.setProgress(long):void");
    }

    public void setRoundNull(boolean z4) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z4);
    }

    public void setVideoLeft(float f10) {
        ga gaVar = this.h;
        if (gaVar == null) {
            return;
        }
        gaVar.f45374g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ga gaVar = this.h;
        if (gaVar == null) {
            return;
        }
        gaVar.h = f10;
        invalidate();
    }
}
