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
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.du;
import org.telegram.ui.t61;
public final class ma extends View {
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
    public final la F0;
    public float G;
    public final Paint G0;
    public float H;
    public final Drawable H0;
    public float I;
    public final TextPaint I0;
    public ka J;
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
    public final wm0 T0;
    public fa U;
    public boolean U0;
    public int V;
    public final t61 V0;
    public final org.telegram.ui.Components.z5 W;
    public long W0;
    public long X0;
    public final org.telegram.ui.Components.z5 Y0;
    public long Z0;
    public ga f45687a;
    public final org.telegram.ui.Components.z5 f45688a0;
    public hg.y1 f45689a1;
    public Runnable f45690b;
    public final org.telegram.ui.Components.z5 f45691b0;
    public long f45692b1;
    public int f45693c;
    public final org.telegram.ui.Components.z5 f45694c0;
    public long f45695c1;
    public Runnable d;
    public final org.telegram.ui.Components.z5 f45696d0;
    public float f45697d1;
    public long f45698e;
    public final org.telegram.ui.Components.z5 f45699e0;
    public int f45700e1;
    public long f45701f;
    public final org.telegram.ui.Components.z5 f45702f0;
    public int f45703f1;
    public boolean f45704g0;
    public int f45705g1;
    public ha h;
    public final org.telegram.ui.Components.ba f45706h0;
    public int f45707h1;
    public final org.telegram.ui.Components.fa f45708i0;
    public boolean f45709i1;
    public final org.telegram.ui.Components.fa f45710j0;
    public boolean f45711j1;
    public final org.telegram.ui.Components.fa f45712k0;
    public float f45713k1;
    public final RectF f45714l0;
    public boolean l1;
    public final Path m0;
    public VelocityTracker f45715m1;
    public int f45716n;
    public final l01 f45717n0;
    public boolean f45718n1;
    public final Drawable f45719o0;
    public boolean f45720o1;
    public final la f45721p0;
    public int f45722p1;
    public final RectF f45723q0;
    public final float[] f45724q1;
    public final ArrayList f45725r;
    public final Paint f45726r0;
    public int f45727r1;
    public final ArrayList f45728s;
    public final Path f45729s0;
    public int f45730s1;
    public final Path f45731t0;
    public int f45732t1;
    public final RectF f45733u0;
    public int f45734u1;
    public ha v;
    public final Path f45735v0;
    public int f45736v1;
    public final Paint f45737w;
    public final Paint f45738w0;
    public int f45739w1;
    public final Path f45740x;
    public final Paint f45741x0;
    public final Path f45742y;
    public final Paint f45743y0;
    public final Paint f45744z0;

    public ma(Context context, ViewGroup viewGroup, n9 n9Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f45716n = 0;
        this.f45725r = new ArrayList();
        this.f45728s = new ArrayList();
        this.f45737w = new Paint(3);
        this.f45740x = new Path();
        this.f45742y = new Path();
        this.V = 1;
        pr prVar = pr.h;
        this.W = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45688a0 = new org.telegram.ui.Components.z5(this, 360L, prVar);
        this.f45691b0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45694c0 = new org.telegram.ui.Components.z5(this, 360L, prVar);
        this.f45696d0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45699e0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f45702f0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.f45704g0 = true;
        this.f45714l0 = new RectF();
        this.m0 = new Path();
        this.f45721p0 = new la();
        this.f45723q0 = new RectF();
        this.f45726r0 = new Paint(3);
        this.f45729s0 = new Path();
        this.f45731t0 = new Path();
        this.f45733u0 = new RectF();
        this.f45735v0 = new Path();
        Paint paint = new Paint(1);
        this.f45738w0 = paint;
        Paint paint2 = new Paint(1);
        this.f45741x0 = paint2;
        Paint paint3 = new Paint(1);
        this.f45743y0 = paint3;
        Paint paint4 = new Paint(1);
        this.f45744z0 = paint4;
        Paint paint5 = new Paint(1);
        this.A0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.B0 = textPaint;
        this.C0 = new RectF();
        this.D0 = new Path();
        Paint paint6 = new Paint(1);
        this.E0 = paint6;
        this.F0 = new la();
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
        this.T0 = new wm0(getContext(), null);
        this.W0 = -1L;
        this.X0 = -1L;
        this.Y0 = new org.telegram.ui.Components.z5(0.0f, this, 0L, 340L, prVar);
        this.Z0 = -1L;
        this.f45700e1 = -1;
        this.f45703f1 = -1;
        this.f45705g1 = -1;
        this.f45707h1 = -1;
        this.f45713k1 = 1.0f;
        this.f45718n1 = true;
        this.f45720o1 = false;
        this.f45724q1 = new float[8];
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
        this.f45717n0 = new l01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f45719o0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.H0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f45706h0 = baVar;
        this.f45708i0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.f45710j0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.f45712k0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.V0 = new t61(this, viewGroup, g6Var, baVar, n9Var, 2);
    }

    public static void a(final ma maVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i10;
        ArrayList arrayList = maVar.f45728s;
        int i11 = maVar.f45705g1;
        try {
            if (i11 == 2 && maVar.K) {
                m6 m6Var = new m6(maVar.getContext(), 0);
                m6Var.f45669b = 0.0f;
                m6Var.f45670c = 1.5f;
                m6Var.d(maVar.S);
                m6Var.h = new Utilities.Callback(maVar) {
                    public final ma f45271b;

                    {
                        this.f45271b = maVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                ma maVar2 = this.f45271b;
                                maVar2.S = floatValue;
                                ga gaVar = maVar2.f45687a;
                                if (gaVar != null) {
                                    gaVar.A(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                ma maVar3 = this.f45271b;
                                maVar3.I = floatValue2;
                                ga gaVar2 = maVar3.f45687a;
                                if (gaVar2 != null) {
                                    gaVar2.u(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                ma maVar4 = this.f45271b;
                                maVar4.h.f45394i = f10.floatValue();
                                ga gaVar3 = maVar4.f45687a;
                                if (gaVar3 != null) {
                                    gaVar3.X(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(maVar.getBaseDuration(), maVar.getMaxScrollDuration());
                int i12 = maVar.f45730s1;
                int i13 = maVar.f45736v1;
                int i14 = maVar.f45734u1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(maVar.Q, 1.0f, maVar.f45694c0.f33725c) * ((float) maVar.O)) + ((float) (maVar.N - maVar.f45701f))) / ((float) min)) * maVar.f45727r1) + i13 + i14);
                q70 F = q70.F(viewGroup, g6Var, maVar);
                F.q(m6Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new da(maVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(maVar.f45730s1 - min2)) + AndroidUtilities.dp(18.0f), maVar.C0.top);
                F.Z();
                F.R(baVar, -view.getX(), -view.getY());
                maVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && maVar.B) {
                m6 m6Var2 = new m6(maVar.getContext(), 0);
                m6Var2.f45669b = 0.0f;
                m6Var2.f45670c = 1.5f;
                m6Var2.d(maVar.I);
                m6Var2.h = new Utilities.Callback(maVar) {
                    public final ma f45271b;

                    {
                        this.f45271b = maVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                ma maVar2 = this.f45271b;
                                maVar2.S = floatValue;
                                ga gaVar = maVar2.f45687a;
                                if (gaVar != null) {
                                    gaVar.A(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                ma maVar3 = this.f45271b;
                                maVar3.I = floatValue2;
                                ga gaVar2 = maVar3.f45687a;
                                if (gaVar2 != null) {
                                    gaVar2.u(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                ma maVar4 = this.f45271b;
                                maVar4.h.f45394i = f10.floatValue();
                                ga gaVar3 = maVar4.f45687a;
                                if (gaVar3 != null) {
                                    gaVar3.X(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(maVar.getBaseDuration(), maVar.getMaxScrollDuration());
                int i15 = maVar.f45730s1;
                int i16 = maVar.f45736v1;
                int i17 = maVar.f45734u1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(maVar.H, 1.0f, maVar.f45688a0.f33725c) * ((float) maVar.E)) + ((float) (maVar.F - maVar.f45701f))) / ((float) min3)) * maVar.f45727r1) + i16 + i17);
                q70 F2 = q70.F(viewGroup, g6Var, maVar);
                F2.q(m6Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new da(maVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(maVar.f45730s1 - min4)) + AndroidUtilities.dp(18.0f), maVar.f45733u0.top);
                F2.Z();
                F2.R(baVar, -view.getX(), -view.getY());
                maVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && maVar.h != null) {
                m6 m6Var3 = new m6(maVar.getContext(), 0);
                m6Var3.f45669b = 0.0f;
                m6Var3.f45670c = 1.5f;
                m6Var3.d(maVar.h.f45394i);
                m6Var3.h = new Utilities.Callback(maVar) {
                    public final ma f45271b;

                    {
                        this.f45271b = maVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                ma maVar2 = this.f45271b;
                                maVar2.S = floatValue;
                                ga gaVar = maVar2.f45687a;
                                if (gaVar != null) {
                                    gaVar.A(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                ma maVar3 = this.f45271b;
                                maVar3.I = floatValue2;
                                ga gaVar2 = maVar3.f45687a;
                                if (gaVar2 != null) {
                                    gaVar2.u(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                ma maVar4 = this.f45271b;
                                maVar4.h.f45394i = f10.floatValue();
                                ga gaVar3 = maVar4.f45687a;
                                if (gaVar3 != null) {
                                    gaVar3.X(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                q70 F3 = q70.F(viewGroup, g6Var, maVar);
                F3.q(m6Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), maVar.f45723q0.top);
                F3.Z();
                F3.R(baVar, -view.getX(), -view.getY());
                maVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = maVar.f45707h1) >= 0 && i10 < arrayList.size()) {
                ha haVar = (ha) arrayList.get(maVar.f45707h1);
                m6 m6Var4 = new m6(maVar.getContext(), 0);
                m6Var4.f45669b = 0.0f;
                m6Var4.f45670c = 1.5f;
                m6Var4.d(haVar.f45394i);
                m6Var4.h = new org.telegram.ui.web.v1(9, maVar, haVar);
                q70 F4 = q70.F(viewGroup, g6Var, maVar);
                F4.q(m6Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), haVar.f45395j.top);
                F4.Z();
                F4.R(baVar, -view.getX(), -view.getY());
                maVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f45694c0.e(this.M));
    }

    public long getBaseDuration() {
        ha haVar = this.h;
        if (haVar != null) {
            return Math.max(1L, haVar.f45391e);
        }
        ha haVar2 = this.v;
        if (haVar2 != null) {
            return Math.max(1L, haVar2.f45391e);
        }
        if (this.B) {
            return Math.max(1L, this.E);
        }
        return Math.max(1L, this.O);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f45728s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((ha) arrayList.get(i10)).f45396k.f33725c);
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.B) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f45688a0.e(this.D));
    }

    private float getVideoHeight() {
        ha haVar = this.h;
        if (haVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), haVar.f45396k.f33725c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ma.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        wm0 wm0Var = this.T0;
        if (wm0Var.b()) {
            int i10 = wm0Var.f32809j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f45718n1) {
                this.f45701f = Math.max(0.0f, (((i10 - this.f45736v1) - this.f45734u1) / this.f45727r1) * ((float) min));
            } else if (!this.M) {
                wm0Var.a();
                return;
            } else {
                int i11 = this.f45736v1;
                int i12 = this.f45734u1;
                float f10 = this.f45727r1;
                float f11 = (float) min;
                h(((((i10 - i11) - i12) / f10) * f11) - ((((this.f45722p1 - i11) - i12) / f10) * f11));
            }
            invalidate();
            this.f45722p1 = i10;
        } else if (this.f45720o1) {
            this.f45720o1 = false;
            ga gaVar = this.f45687a;
            if (gaVar != null) {
                gaVar.U(false);
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
        ha haVar = this.v;
        if (haVar != null) {
            f13 = (haVar.f45393g * ((float) haVar.f45391e)) + ((float) haVar.f45392f);
        } else {
            if (this.h == null) {
                j11 = this.N;
            } else {
                j11 = 0;
            }
            f13 = (float) j11;
        }
        float f14 = (this.f45727r1 * (((clamp + f13) - ((float) this.f45701f)) / ((float) min))) + this.f45736v1 + this.f45734u1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.f45744z0;
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
        throw new UnsupportedOperationException("Method not decompiled: qh.ma.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f45730s1, this.f45732t1, 255, 31);
        int i10 = (int) (255.0f * f14);
        Paint paint3 = this.f45738w0;
        paint3.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        if (this.U0) {
            f15 = 2.5f;
        } else {
            f15 = 10.0f;
        }
        rectF.inset(AndroidUtilities.dp(f15), AndroidUtilities.dp(2.0f));
        boolean z4 = this.U0;
        Paint paint4 = this.f45741x0;
        if (z4) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint5 = this.f45743y0;
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
        float f12 = this.f45739w1;
        float f13 = 0.0f;
        if (this.h != null) {
            f10 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f12 + f10;
        if (this.f45728s.isEmpty()) {
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
        return (int) (f16 + f13 + this.f45739w1);
    }

    public int getMaxCount() {
        return this.V;
    }

    public long getMaxScrollDuration() {
        if (this.f45728s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f45739w1 + this.f45739w1, getContentHeight(), this.f45702f0.f33725c);
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
        ga gaVar;
        long j17;
        long clamp;
        ha haVar = this.h;
        if (haVar == null && !this.B) {
            long j18 = this.N;
            long clamp2 = Utilities.clamp(j18 + f10, 0L, -(this.O - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.N = clamp2;
            float f14 = (float) (clamp2 - j18);
            this.P = Utilities.clamp(this.P - (f14 / ((float) this.O)), 1.0f, 0.0f);
            this.Q = Utilities.clamp(this.Q - (f14 / ((float) this.O)), 1.0f, 0.0f);
            ga gaVar2 = this.f45687a;
            if (gaVar2 != null) {
                gaVar2.t0(this.P);
                this.f45687a.r0(this.Q);
            }
        } else if (this.M) {
            if (haVar != null) {
                f11 = haVar.f45393g;
                j10 = haVar.f45391e;
            } else {
                f11 = this.G;
                j10 = this.E;
            }
            float f15 = f11 * ((float) j10);
            if (haVar != null) {
                f12 = haVar.h;
                j11 = haVar.f45391e;
            } else {
                f12 = this.H;
                j11 = this.E;
            }
            float f16 = f12 * ((float) j11);
            if (haVar != null) {
                f13 = (haVar.h - haVar.f45393g) * ((float) haVar.f45391e);
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
                ga gaVar3 = this.f45687a;
                if (gaVar3 != null) {
                    gaVar3.t0(this.P);
                    this.f45687a.r0(this.Q);
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
                ga gaVar4 = this.f45687a;
                if (gaVar4 != null) {
                    gaVar4.t0(this.P);
                    this.f45687a.r0(this.Q);
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
        ga gaVar5 = this.f45687a;
        if (gaVar5 != null) {
            gaVar5.H0(this.N + (this.P * ((float) this.O)));
        }
        boolean z4 = this.f45711j1;
        if (!z4 && (gaVar = this.f45687a) != null) {
            gaVar.U(true);
            ha haVar2 = this.h;
            if (haVar2 != null) {
                long j28 = this.N + (this.P * ((float) this.O));
                float f24 = haVar2.h;
                float f25 = (float) haVar2.f45391e;
                clamp = Utilities.clamp(j28, f24 * f25, haVar2.f45393g * f25);
            } else if (this.B) {
                long j29 = this.N + (this.P * ((float) this.O));
                float f26 = this.H;
                float f27 = (float) this.E;
                clamp = Utilities.clamp(j29, f26 * f27, this.G * f27);
            } else {
                float f28 = this.P;
                clamp = Utilities.clamp(f28 * ((float) j17), this.O, 0L);
            }
            if (this.h != null && Math.abs(this.f45698e - clamp) > 400) {
                this.Z0 = this.f45698e;
                this.Y0.d(1.0f, true);
            }
            ga gaVar6 = this.f45687a;
            this.f45698e = clamp;
            gaVar6.B(clamp, false);
        } else if (z4 || this.f45720o1) {
            ha haVar3 = this.h;
            if (haVar3 != null) {
                long j30 = this.N + (this.P * ((float) this.O));
                float f29 = haVar3.h;
                float f30 = (float) haVar3.f45391e;
                this.f45698e = Utilities.clamp(j30, f29 * f30, haVar3.f45393g * f30);
            } else if (this.B && haVar3 != null) {
                long j31 = this.N + (this.P * ((float) this.O));
                float f31 = this.H;
                float f32 = (float) haVar3.f45391e;
                this.f45698e = Utilities.clamp(j31, f31 * f32, this.G * f32);
            } else {
                float f33 = this.P;
                this.f45698e = Utilities.clamp(f33 * ((float) j16), this.O, 0L);
            }
            ga gaVar7 = this.f45687a;
            if (gaVar7 != null) {
                gaVar7.B(this.f45698e, false);
            }
        }
    }

    public final void i(ha haVar, float f10) {
        long j10;
        ga gaVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (haVar != null) {
            ha haVar2 = this.v;
            if (haVar2 != haVar && haVar2 != null) {
                if (this.f45716n == this.f45728s.indexOf(haVar)) {
                    ha haVar3 = this.v;
                    float f11 = (float) haVar3.f45391e;
                    float f12 = haVar.h;
                    float f13 = (float) haVar.f45391e;
                    float f14 = haVar.f45393g;
                    long j16 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((haVar3.h - haVar3.f45393g) * f11) / f13);
                    long j17 = haVar.f45392f;
                    long j18 = f10;
                    long j19 = j17 + j18;
                    if (j19 > (f11 * 1.0f) - (f12 * f13)) {
                        ha haVar4 = this.v;
                        float clamp2 = Utilities.clamp((((haVar4.h * ((float) haVar4.f45391e)) - ((float) j17)) - ((float) j18)) / ((float) haVar.f45391e), 1.0f, min);
                        haVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        haVar.f45393g = clamp3;
                        ha haVar5 = this.v;
                        float f15 = haVar5.h;
                        float f16 = (float) haVar5.f45391e;
                        float f17 = haVar.h;
                        float f18 = (float) haVar.f45391e;
                        long j20 = (f15 * f16) - (f17 * f18);
                        long j21 = (haVar5.f45393g * f16) - (clamp3 * f18);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        haVar.f45392f = Utilities.clamp(haVar.f45392f + j18, j15, j14);
                        ga gaVar2 = this.f45687a;
                        if (gaVar2 != null) {
                            gaVar2.m0(haVar.f45393g, haVar.f45388a);
                            this.f45687a.u0(haVar.h, haVar.f45388a);
                        }
                    } else if (j19 < j16) {
                        ha haVar6 = this.v;
                        float clamp4 = Utilities.clamp((((haVar6.f45393g * ((float) haVar6.f45391e)) - ((float) j17)) - ((float) j18)) / ((float) haVar.f45391e), 1.0f - min, 0.0f);
                        haVar.f45393g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        haVar.h = clamp5;
                        ha haVar7 = this.v;
                        float f19 = haVar7.h;
                        float f20 = (float) haVar7.f45391e;
                        float f21 = (float) haVar.f45391e;
                        long j22 = (f19 * f20) - (clamp5 * f21);
                        long j23 = (haVar7.f45393g * f20) - (haVar.f45393g * f21);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        haVar.f45392f = Utilities.clamp(haVar.f45392f + j18, j13, j12);
                        ga gaVar3 = this.f45687a;
                        if (gaVar3 != null) {
                            gaVar3.m0(haVar.f45393g, haVar.f45388a);
                            this.f45687a.u0(haVar.h, haVar.f45388a);
                        }
                    } else {
                        haVar.f45392f = j19;
                    }
                } else {
                    long j24 = haVar.f45392f + f10;
                    float f22 = (float) haVar.f45391e;
                    haVar.f45392f = Utilities.clamp(j24, ((float) getBaseDuration()) - (haVar.h * f22), (-haVar.f45393g) * f22);
                }
            }
            invalidate();
            ga gaVar4 = this.f45687a;
            if (gaVar4 != null) {
                gaVar4.E0(haVar.f45388a, haVar.f45392f);
            }
            boolean z4 = this.f45711j1;
            if (!z4 && (gaVar = this.f45687a) != null) {
                gaVar.U(true);
                ha haVar8 = this.v;
                if (haVar8 != haVar && haVar8 != null) {
                    long j25 = haVar.f45392f + (haVar.f45393g * ((float) haVar.f45391e));
                    float f23 = haVar8.h;
                    float f24 = (float) haVar8.f45391e;
                    clamp = Utilities.clamp(j25, f23 * f24, haVar8.f45393g * f24);
                } else {
                    float f25 = haVar.f45393g;
                    clamp = Utilities.clamp(f25 * ((float) j11), haVar.f45391e, 0L);
                }
                ha haVar9 = this.v;
                if (haVar9 != haVar && haVar9 != null && Math.abs(this.f45698e - clamp) > 400) {
                    this.Z0 = this.f45698e;
                    this.Y0.d(1.0f, true);
                }
                ga gaVar5 = this.f45687a;
                this.f45698e = clamp;
                gaVar5.B(clamp, false);
            } else if (z4 || this.f45720o1) {
                ha haVar10 = this.v;
                if (haVar10 != haVar && haVar10 != null) {
                    long j26 = haVar.f45392f + (haVar.f45393g * ((float) haVar.f45391e));
                    float f26 = haVar10.h;
                    float f27 = (float) haVar10.f45391e;
                    this.f45698e = Utilities.clamp(j26, f26 * f27, haVar10.f45393g * f27);
                } else {
                    float f28 = haVar.f45393g;
                    this.f45698e = Utilities.clamp(f28 * ((float) j10), haVar.f45391e, 0L);
                }
                ga gaVar6 = this.f45687a;
                if (gaVar6 != null) {
                    gaVar6.B(this.f45698e, false);
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
        ga gaVar;
        long j15;
        long clamp;
        ha haVar = this.h;
        if (haVar == null) {
            long j16 = this.F;
            long clamp2 = Utilities.clamp(j16 + f10, 0L, -(this.E - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.F = clamp2;
            float f11 = (float) (clamp2 - j16);
            this.G = Utilities.clamp(this.G - (f11 / ((float) this.E)), 1.0f, 0.0f);
            this.H = Utilities.clamp(this.H - (f11 / ((float) this.E)), 1.0f, 0.0f);
            ga gaVar2 = this.f45687a;
            if (gaVar2 != null) {
                gaVar2.J(this.G);
                this.f45687a.y0(this.H);
            }
        } else if (this.D) {
            float f12 = haVar.h;
            float f13 = (float) haVar.f45391e;
            float f14 = this.H;
            float f15 = (float) this.E;
            long j17 = (f12 * f13) - (f14 * f15);
            float f16 = haVar.f45393g;
            float f17 = this.G;
            long j18 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j19 = this.F;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                ha haVar2 = this.h;
                float clamp3 = Utilities.clamp((((haVar2.h * ((float) haVar2.f45391e)) - ((float) j19)) - ((float) j20)) / ((float) this.E), 1.0f, min);
                this.H = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.G = clamp4;
                ha haVar3 = this.h;
                float f18 = haVar3.h;
                float f19 = (float) haVar3.f45391e;
                float f20 = this.H;
                float f21 = (float) this.E;
                long j22 = (f18 * f19) - (f20 * f21);
                long j23 = (haVar3.f45393g * f19) - (clamp4 * f21);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.F = Utilities.clamp(this.F + j20, j13, j12);
                ga gaVar3 = this.f45687a;
                if (gaVar3 != null) {
                    gaVar3.J(this.G);
                    this.f45687a.y0(this.H);
                }
            } else if (j21 < j18) {
                ha haVar4 = this.h;
                float clamp5 = Utilities.clamp((((haVar4.f45393g * ((float) haVar4.f45391e)) - ((float) j19)) - ((float) j20)) / ((float) this.E), 1.0f - min, 0.0f);
                this.G = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.H = clamp6;
                ha haVar5 = this.h;
                float f22 = haVar5.h;
                float f23 = (float) haVar5.f45391e;
                float f24 = (float) this.E;
                long j24 = (f22 * f23) - (clamp6 * f24);
                long j25 = (haVar5.f45393g * f23) - (this.G * f24);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.F = Utilities.clamp(this.F + j20, j11, j10);
                ga gaVar4 = this.f45687a;
                if (gaVar4 != null) {
                    gaVar4.J(this.G);
                    this.f45687a.y0(this.H);
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
        ga gaVar5 = this.f45687a;
        if (gaVar5 != null) {
            gaVar5.h0(this.F + (this.G * ((float) this.E)));
        }
        boolean z4 = this.f45711j1;
        if (!z4 && (gaVar = this.f45687a) != null) {
            gaVar.U(true);
            ha haVar6 = this.h;
            if (haVar6 != null) {
                long j27 = this.F + (this.G * ((float) this.E));
                float f26 = haVar6.h;
                float f27 = (float) haVar6.f45391e;
                clamp = Utilities.clamp(j27, f26 * f27, haVar6.f45393g * f27);
            } else {
                float f28 = this.G;
                clamp = Utilities.clamp(f28 * ((float) j15), this.E, 0L);
            }
            if (this.h != null && Math.abs(this.f45698e - clamp) > 400) {
                this.Z0 = this.f45698e;
                this.Y0.d(1.0f, true);
            }
            ga gaVar6 = this.f45687a;
            this.f45698e = clamp;
            gaVar6.B(clamp, false);
        } else if (z4 || this.f45720o1) {
            ha haVar7 = this.h;
            if (haVar7 != null) {
                long j28 = this.F + (this.G * ((float) this.E));
                float f29 = haVar7.h;
                float f30 = (float) haVar7.f45391e;
                this.f45698e = Utilities.clamp(j28, f29 * f30, haVar7.f45393g * f30);
            } else {
                float f31 = this.G;
                this.f45698e = Utilities.clamp(f31 * ((float) j14), this.E, 0L);
            }
            ga gaVar7 = this.f45687a;
            if (gaVar7 != null) {
                gaVar7.B(this.f45698e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ha haVar = this.h;
        long j10 = haVar.f45391e;
        this.f45701f = Utilities.clamp((((haVar.h + haVar.f45393g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
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
        ha haVar;
        ha haVar2 = this.h;
        ArrayList arrayList = this.f45728s;
        if (haVar2 != null || this.K || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f45736v1) - this.f45734u1) / this.f45727r1;
            ha haVar3 = this.v;
            if (haVar3 != null) {
                j10 = (haVar3.f45393g * ((float) haVar3.f45391e)) + ((float) haVar3.f45392f);
            } else {
                j10 = 0;
            }
            float f12 = f11 * ((float) min);
            if (haVar3 == null) {
                if (this.h == null) {
                    j10 = this.N;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f12 - ((float) j10)) + ((float) this.f45701f), (float) getBaseDuration(), 0.0f);
            ha haVar4 = this.h;
            if (haVar4 != null) {
                float f13 = ((float) clamp) / ((float) haVar4.f45391e);
                if (f13 < haVar4.f45393g || f13 > haVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (haVar.h - haVar.f45393g) * ((float) haVar.f45391e))) {
                if (this.K && haVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) clamp) / ((float) this.O);
                    if (f14 < this.P || f14 > this.Q) {
                        return false;
                    }
                }
                this.f45698e = clamp;
                invalidate();
                ga gaVar = this.f45687a;
                if (gaVar != null) {
                    gaVar.B(clamp, z4);
                }
                hg.y1 y1Var = this.f45689a1;
                if (y1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y1Var);
                    this.f45689a1 = null;
                }
                if (z4) {
                    hg.y1 y1Var2 = new hg.y1(this, clamp, 27);
                    this.f45689a1 = y1Var2;
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
        ha haVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.C, str)) {
            return;
        }
        ka kaVar = this.J;
        Long l10 = null;
        if (kaVar != null) {
            kaVar.b();
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
            if (getMeasuredWidth() <= 0 || this.J != null || ((haVar = this.h) != null && haVar.f45391e < 1)) {
                j12 = j13;
                z12 = false;
                z10 = true;
            } else {
                String str2 = this.C;
                int i10 = this.f45730s1;
                int i11 = this.f45736v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.E;
                if (j14 > 2) {
                    l10 = Long.valueOf(j14);
                }
                ha haVar2 = this.h;
                if (haVar2 != null) {
                    maxScrollDuration = haVar2.f45391e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z12 = false;
                z10 = true;
                this.J = new ka(this, false, str2, i12, dp, l10, maxScrollDuration, -1L, -1L, new da(this, 0));
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
            this.f45688a0.f(this.D, z10);
            this.f45694c0.f(this.M, z10);
            this.W.f(this.B, z10);
        }
        invalidate();
    }

    public final void o(boolean z4, String str, long j10, float f10) {
        String str2;
        ha haVar = this.h;
        if (haVar == null) {
            str2 = null;
        } else {
            str2 = haVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ha haVar2 = this.h;
        if (haVar2 != null) {
            ka kaVar = haVar2.f45390c;
            if (kaVar != null) {
                kaVar.b();
                this.h.f45390c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f45701f = 0L;
            ha haVar3 = new ha(this);
            this.h = haVar3;
            haVar3.f45389b = z4;
            haVar3.d = str;
            haVar3.f45391e = j10;
            haVar3.f45394i = f10;
            ha.a(haVar3, false);
        } else {
            this.h = null;
            this.f45701f = 0L;
        }
        if (!this.B) {
            this.D = false;
        }
        this.f45698e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.I0.setTextSize(AndroidUtilities.dp(12.0f));
        this.M0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f45736v1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f45739w1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f45730s1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f45732t1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f45734u1 = dp4;
        this.f45727r1 = (this.f45730s1 - (dp4 * 2)) - (this.f45736v1 * 2);
        ha haVar = this.h;
        if (haVar != null && haVar.d != null && haVar.f45390c == null) {
            ha.a(haVar, false);
        }
        ArrayList arrayList = this.f45728s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ha haVar2 = (ha) obj;
                if (haVar2.d != null && haVar2.f45390c == null) {
                    ha.a(haVar2, false);
                    ha.b(haVar2);
                }
            }
        }
        if (this.L != null && this.U == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ma.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.U == null || this.T) {
                this.U = new fa(this, this.L, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.R = false;
                this.f45696d0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        ha haVar;
        du duVar = new du(17);
        ArrayList arrayList = this.f45728s;
        Collections.sort(arrayList, duVar);
        if (arrayList.isEmpty()) {
            haVar = null;
        } else {
            haVar = (ha) arrayList.get(0);
        }
        this.v = haVar;
        if (haVar != null) {
            long j10 = haVar.f45392f;
        }
    }

    public void setCollage(ArrayList<s6> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ka kaVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f45728s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ha haVar = (ha) arrayList2.get(i10);
            if (haVar != null && (kaVar = haVar.f45390c) != null) {
                kaVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f45725r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            fa faVar = (fa) arrayList3.get(i11);
            if (faVar != null) {
                faVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f45699e0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                s6 s6Var = arrayList.get(i12);
                if (s6Var.K) {
                    ha haVar2 = new ha(this);
                    haVar2.f45388a = i12;
                    haVar2.f45389b = false;
                    haVar2.d = s6Var.L.getAbsolutePath();
                    haVar2.f45391e = s6Var.f46059h0;
                    haVar2.f45392f = s6Var.X;
                    haVar2.f45394i = s6Var.P;
                    haVar2.f45393g = s6Var.V;
                    haVar2.h = s6Var.W;
                    ha.a(haVar2, false);
                    ha.b(haVar2);
                    arrayList2.add(haVar2);
                }
            }
        }
        q();
        this.f45716n = 0;
    }

    public void setDelegate(ga gaVar) {
        this.f45687a = gaVar;
    }

    public void setMaxCount(int i10) {
        this.V = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f45690b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ma.setProgress(long):void");
    }

    public void setRoundNull(boolean z4) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z4);
    }

    public void setVideoLeft(float f10) {
        ha haVar = this.h;
        if (haVar == null) {
            return;
        }
        haVar.f45393g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ha haVar = this.h;
        if (haVar == null) {
            return;
        }
        haVar.h = f10;
        invalidate();
    }
}
