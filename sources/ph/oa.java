package ph;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.cu;
import org.telegram.ui.s61;
public final class oa extends View {
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
    public final na F0;
    public float G;
    public final Paint G0;
    public float H;
    public final Drawable H0;
    public float I;
    public final TextPaint I0;
    public ma J;
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
    public ha U;
    public boolean U0;
    public int V;
    public final s61 V0;
    public final org.telegram.ui.Components.z5 W;
    public long W0;
    public long X0;
    public final org.telegram.ui.Components.z5 Y0;
    public long Z0;
    public ia f42071a;
    public final org.telegram.ui.Components.z5 f42072a0;
    public gg.y1 f42073a1;
    public Runnable f42074b;
    public final org.telegram.ui.Components.z5 f42075b0;
    public long f42076b1;
    public int f42077c;
    public final org.telegram.ui.Components.z5 f42078c0;
    public long f42079c1;
    public Runnable d;
    public final org.telegram.ui.Components.z5 f42080d0;
    public float f42081d1;
    public long e;
    public final org.telegram.ui.Components.z5 f42082e0;
    public int f42083e1;
    public long f42084f;
    public final org.telegram.ui.Components.z5 f42085f0;
    public int f42086f1;
    public boolean f42087g0;
    public int f42088g1;
    public ja h;
    public final org.telegram.ui.Components.ba f42089h0;
    public int f42090h1;
    public final org.telegram.ui.Components.fa f42091i0;
    public boolean f42092i1;
    public final org.telegram.ui.Components.fa f42093j0;
    public boolean f42094j1;
    public final org.telegram.ui.Components.fa f42095k0;
    public float f42096k1;
    public final RectF f42097l0;
    public boolean l1;
    public final Path m0;
    public VelocityTracker f42098m1;
    public int f42099n;
    public final k01 f42100n0;
    public boolean f42101n1;
    public final Drawable f42102o0;
    public boolean f42103o1;
    public final na f42104p0;
    public int f42105p1;
    public final RectF f42106q0;
    public final float[] f42107q1;
    public final ArrayList f42108r;
    public final Paint f42109r0;
    public int f42110r1;
    public final ArrayList f42111s;
    public final Path f42112s0;
    public int f42113s1;
    public final Path f42114t0;
    public int f42115t1;
    public final RectF f42116u0;
    public int f42117u1;
    public ja v;
    public final Path f42118v0;
    public int f42119v1;
    public final Paint f42120w;
    public final Paint f42121w0;
    public int f42122w1;
    public final Path f42123x;
    public final Paint f42124x0;
    public final Path f42125y;
    public final Paint f42126y0;
    public final Paint f42127z0;

    public oa(Context context, ViewGroup viewGroup, p9 p9Var, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f42099n = 0;
        this.f42108r = new ArrayList();
        this.f42111s = new ArrayList();
        this.f42120w = new Paint(3);
        this.f42123x = new Path();
        this.f42125y = new Path();
        this.V = 1;
        nr nrVar = nr.h;
        this.W = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.f42072a0 = new org.telegram.ui.Components.z5(this, 360L, nrVar);
        this.f42075b0 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.f42078c0 = new org.telegram.ui.Components.z5(this, 360L, nrVar);
        this.f42080d0 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.f42082e0 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.f42085f0 = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.f42087g0 = true;
        this.f42097l0 = new RectF();
        this.m0 = new Path();
        this.f42104p0 = new na();
        this.f42106q0 = new RectF();
        this.f42109r0 = new Paint(3);
        this.f42112s0 = new Path();
        this.f42114t0 = new Path();
        this.f42116u0 = new RectF();
        this.f42118v0 = new Path();
        Paint paint = new Paint(1);
        this.f42121w0 = paint;
        Paint paint2 = new Paint(1);
        this.f42124x0 = paint2;
        Paint paint3 = new Paint(1);
        this.f42126y0 = paint3;
        Paint paint4 = new Paint(1);
        this.f42127z0 = paint4;
        Paint paint5 = new Paint(1);
        this.A0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.B0 = textPaint;
        this.C0 = new RectF();
        this.D0 = new Path();
        Paint paint6 = new Paint(1);
        this.E0 = paint6;
        this.F0 = new na();
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
        this.Y0 = new org.telegram.ui.Components.z5(0.0f, this, 0L, 340L, nrVar);
        this.Z0 = -1L;
        this.f42083e1 = -1;
        this.f42086f1 = -1;
        this.f42088g1 = -1;
        this.f42090h1 = -1;
        this.f42096k1 = 1.0f;
        this.f42101n1 = true;
        this.f42103o1 = false;
        this.f42107q1 = new float[8];
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
        this.f42100n0 = new k01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.f42102o0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.H0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f42089h0 = baVar;
        this.f42091i0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.f42093j0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.f42095k0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.V0 = new s61(this, viewGroup, f6Var, baVar, p9Var, 2);
    }

    public static void a(final oa oaVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i10;
        ArrayList arrayList = oaVar.f42111s;
        int i11 = oaVar.f42088g1;
        try {
            if (i11 == 2 && oaVar.K) {
                o6 o6Var = new o6(oaVar.getContext(), 0);
                o6Var.f42055b = 0.0f;
                o6Var.f42056c = 1.5f;
                o6Var.d(oaVar.S);
                o6Var.h = new Utilities.Callback(oaVar) {
                    public final oa f41668b;

                    {
                        this.f41668b = oaVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                oa oaVar2 = this.f41668b;
                                oaVar2.S = floatValue;
                                ia iaVar = oaVar2.f42071a;
                                if (iaVar != null) {
                                    iaVar.B(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                oa oaVar3 = this.f41668b;
                                oaVar3.I = floatValue2;
                                ia iaVar2 = oaVar3.f42071a;
                                if (iaVar2 != null) {
                                    iaVar2.v(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                oa oaVar4 = this.f41668b;
                                oaVar4.h.f41797i = f10.floatValue();
                                ia iaVar3 = oaVar4.f42071a;
                                if (iaVar3 != null) {
                                    iaVar3.Y(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min = Math.min(oaVar.getBaseDuration(), oaVar.getMaxScrollDuration());
                int i12 = oaVar.f42113s1;
                int i13 = oaVar.f42119v1;
                int i14 = oaVar.f42117u1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(oaVar.Q, 1.0f, oaVar.f42078c0.f31241c) * ((float) oaVar.O)) + ((float) (oaVar.N - oaVar.f42084f))) / ((float) min)) * oaVar.f42110r1) + i13 + i14);
                o70 F = o70.F(viewGroup, f6Var, oaVar);
                F.q(o6Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new ea(oaVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(oaVar.f42113s1 - min2)) + AndroidUtilities.dp(18.0f), oaVar.C0.top);
                F.Z();
                F.R(baVar, -view.getX(), -view.getY());
                oaVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && oaVar.B) {
                o6 o6Var2 = new o6(oaVar.getContext(), 0);
                o6Var2.f42055b = 0.0f;
                o6Var2.f42056c = 1.5f;
                o6Var2.d(oaVar.I);
                o6Var2.h = new Utilities.Callback(oaVar) {
                    public final oa f41668b;

                    {
                        this.f41668b = oaVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                oa oaVar2 = this.f41668b;
                                oaVar2.S = floatValue;
                                ia iaVar = oaVar2.f42071a;
                                if (iaVar != null) {
                                    iaVar.B(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                oa oaVar3 = this.f41668b;
                                oaVar3.I = floatValue2;
                                ia iaVar2 = oaVar3.f42071a;
                                if (iaVar2 != null) {
                                    iaVar2.v(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                oa oaVar4 = this.f41668b;
                                oaVar4.h.f41797i = f10.floatValue();
                                ia iaVar3 = oaVar4.f42071a;
                                if (iaVar3 != null) {
                                    iaVar3.Y(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                long min3 = Math.min(oaVar.getBaseDuration(), oaVar.getMaxScrollDuration());
                int i15 = oaVar.f42113s1;
                int i16 = oaVar.f42119v1;
                int i17 = oaVar.f42117u1;
                float min4 = Math.min((i15 - i16) - i17, ((((AndroidUtilities.lerp(oaVar.H, 1.0f, oaVar.f42072a0.f31241c) * ((float) oaVar.E)) + ((float) (oaVar.F - oaVar.f42084f))) / ((float) min3)) * oaVar.f42110r1) + i16 + i17);
                o70 F2 = o70.F(viewGroup, f6Var, oaVar);
                F2.q(o6Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new ea(oaVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(oaVar.f42113s1 - min4)) + AndroidUtilities.dp(18.0f), oaVar.f42116u0.top);
                F2.Z();
                F2.R(baVar, -view.getX(), -view.getY());
                oaVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && oaVar.h != null) {
                o6 o6Var3 = new o6(oaVar.getContext(), 0);
                o6Var3.f42055b = 0.0f;
                o6Var3.f42056c = 1.5f;
                o6Var3.d(oaVar.h.f41797i);
                o6Var3.h = new Utilities.Callback(oaVar) {
                    public final oa f41668b;

                    {
                        this.f41668b = oaVar;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (r2) {
                            case 0:
                                float floatValue = f10.floatValue();
                                oa oaVar2 = this.f41668b;
                                oaVar2.S = floatValue;
                                ia iaVar = oaVar2.f42071a;
                                if (iaVar != null) {
                                    iaVar.B(f10.floatValue());
                                    return;
                                }
                                return;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                oa oaVar3 = this.f41668b;
                                oaVar3.I = floatValue2;
                                ia iaVar2 = oaVar3.f42071a;
                                if (iaVar2 != null) {
                                    iaVar2.v(f10.floatValue());
                                    return;
                                }
                                return;
                            default:
                                oa oaVar4 = this.f41668b;
                                oaVar4.h.f41797i = f10.floatValue();
                                ia iaVar3 = oaVar4.f42071a;
                                if (iaVar3 != null) {
                                    iaVar3.Y(f10.floatValue());
                                    return;
                                }
                                return;
                        }
                    }
                };
                o70 F3 = o70.F(viewGroup, f6Var, oaVar);
                F3.q(o6Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), oaVar.f42106q0.top);
                F3.Z();
                F3.R(baVar, -view.getX(), -view.getY());
                oaVar.performHapticFeedback(0, 1);
            } else if (i11 == 3 && (i10 = oaVar.f42090h1) >= 0 && i10 < arrayList.size()) {
                ja jaVar = (ja) arrayList.get(oaVar.f42090h1);
                o6 o6Var4 = new o6(oaVar.getContext(), 0);
                o6Var4.f42055b = 0.0f;
                o6Var4.f42056c = 1.5f;
                o6Var4.d(jaVar.f41797i);
                o6Var4.h = new org.telegram.ui.web.u1(9, oaVar, jaVar);
                o70 F4 = o70.F(viewGroup, f6Var, oaVar);
                F4.q(o6Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), jaVar.f41798j.top);
                F4.Z();
                F4.R(baVar, -view.getX(), -view.getY());
                oaVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f42078c0.e(this.M));
    }

    public long getBaseDuration() {
        ja jaVar = this.h;
        if (jaVar != null) {
            return Math.max(1L, jaVar.e);
        }
        ja jaVar2 = this.v;
        if (jaVar2 != null) {
            return Math.max(1L, jaVar2.e);
        }
        if (this.B) {
            return Math.max(1L, this.E);
        }
        return Math.max(1L, this.O);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.f42111s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((ja) arrayList.get(i10)).f41799k.f31241c);
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.B) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f42072a0.e(this.D));
    }

    private float getVideoHeight() {
        ja jaVar = this.h;
        if (jaVar == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), jaVar.f41799k.f31241c);
    }

    public final int c(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ph.oa.c(android.view.MotionEvent):int");
    }

    @Override
    public final void computeScroll() {
        vm0 vm0Var = this.T0;
        if (vm0Var.b()) {
            int i10 = vm0Var.f29529j;
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.f42101n1) {
                this.f42084f = Math.max(0.0f, (((i10 - this.f42119v1) - this.f42117u1) / this.f42110r1) * ((float) min));
            } else if (!this.M) {
                vm0Var.a();
                return;
            } else {
                int i11 = this.f42119v1;
                int i12 = this.f42117u1;
                float f10 = this.f42110r1;
                float f11 = (float) min;
                h(((((i10 - i11) - i12) / f10) * f11) - ((((this.f42105p1 - i11) - i12) / f10) * f11));
            }
            invalidate();
            this.f42105p1 = i10;
        } else if (this.f42103o1) {
            this.f42103o1 = false;
            ia iaVar = this.f42071a;
            if (iaVar != null) {
                iaVar.K(false);
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
        ja jaVar = this.v;
        if (jaVar != null) {
            f13 = (jaVar.f41796g * ((float) jaVar.e)) + ((float) jaVar.f41795f);
        } else {
            if (this.h == null) {
                j11 = this.N;
            } else {
                j11 = 0;
            }
            f13 = (float) j11;
        }
        float f14 = (this.f42110r1 * (((clamp + f13) - ((float) this.f42084f)) / ((float) min))) + this.f42119v1 + this.f42117u1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.f42127z0;
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
        throw new UnsupportedOperationException("Method not decompiled: ph.oa.dispatchDraw(android.graphics.Canvas):void");
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.f42113s1, this.f42115t1, 255, 31);
        int i10 = (int) (255.0f * f14);
        Paint paint3 = this.f42121w0;
        paint3.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        if (this.U0) {
            f15 = 2.5f;
        } else {
            f15 = 10.0f;
        }
        rectF.inset(AndroidUtilities.dp(f15), AndroidUtilities.dp(2.0f));
        boolean z4 = this.U0;
        Paint paint4 = this.f42124x0;
        if (z4) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint4);
        } else {
            canvas.drawRect(rectF, paint4);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint5 = this.f42126y0;
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
        rectF.set(x10, f21, kh.a2.b(AndroidUtilities.dp(f19), dp, 2.0f, f13), f22);
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
        float f12 = this.f42122w1;
        float f13 = 0.0f;
        if (this.h != null) {
            f10 = getVideoHeight() + AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f12 + f10;
        if (this.f42111s.isEmpty()) {
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
        return (int) (f16 + f13 + this.f42122w1);
    }

    public int getMaxCount() {
        return this.V;
    }

    public long getMaxScrollDuration() {
        if (this.f42111s.isEmpty()) {
            return Math.max(120000L, ((float) f()) * 1.5f);
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.f42122w1 + this.f42122w1, getContentHeight(), this.f42085f0.f31241c);
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
        ia iaVar;
        long j17;
        long clamp;
        ja jaVar = this.h;
        if (jaVar == null && !this.B) {
            long j18 = this.N;
            long clamp2 = Utilities.clamp(j18 + f10, 0L, -(this.O - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.N = clamp2;
            float f14 = (float) (clamp2 - j18);
            this.P = Utilities.clamp(this.P - (f14 / ((float) this.O)), 1.0f, 0.0f);
            this.Q = Utilities.clamp(this.Q - (f14 / ((float) this.O)), 1.0f, 0.0f);
            ia iaVar2 = this.f42071a;
            if (iaVar2 != null) {
                iaVar2.t0(this.P);
                this.f42071a.r0(this.Q);
            }
        } else if (this.M) {
            if (jaVar != null) {
                f11 = jaVar.f41796g;
                j10 = jaVar.e;
            } else {
                f11 = this.G;
                j10 = this.E;
            }
            float f15 = f11 * ((float) j10);
            if (jaVar != null) {
                f12 = jaVar.h;
                j11 = jaVar.e;
            } else {
                f12 = this.H;
                j11 = this.E;
            }
            float f16 = f12 * ((float) j11);
            if (jaVar != null) {
                f13 = (jaVar.h - jaVar.f41796g) * ((float) jaVar.e);
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
                ia iaVar3 = this.f42071a;
                if (iaVar3 != null) {
                    iaVar3.t0(this.P);
                    this.f42071a.r0(this.Q);
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
                ia iaVar4 = this.f42071a;
                if (iaVar4 != null) {
                    iaVar4.t0(this.P);
                    this.f42071a.r0(this.Q);
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
        ia iaVar5 = this.f42071a;
        if (iaVar5 != null) {
            iaVar5.I0(this.N + (this.P * ((float) this.O)));
        }
        boolean z4 = this.f42094j1;
        if (!z4 && (iaVar = this.f42071a) != null) {
            iaVar.K(true);
            ja jaVar2 = this.h;
            if (jaVar2 != null) {
                long j28 = this.N + (this.P * ((float) this.O));
                float f24 = jaVar2.h;
                float f25 = (float) jaVar2.e;
                clamp = Utilities.clamp(j28, f24 * f25, jaVar2.f41796g * f25);
            } else if (this.B) {
                long j29 = this.N + (this.P * ((float) this.O));
                float f26 = this.H;
                float f27 = (float) this.E;
                clamp = Utilities.clamp(j29, f26 * f27, this.G * f27);
            } else {
                float f28 = this.P;
                clamp = Utilities.clamp(f28 * ((float) j17), this.O, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.Z0 = this.e;
                this.Y0.d(1.0f, true);
            }
            ia iaVar6 = this.f42071a;
            this.e = clamp;
            iaVar6.C(clamp, false);
        } else if (z4 || this.f42103o1) {
            ja jaVar3 = this.h;
            if (jaVar3 != null) {
                long j30 = this.N + (this.P * ((float) this.O));
                float f29 = jaVar3.h;
                float f30 = (float) jaVar3.e;
                this.e = Utilities.clamp(j30, f29 * f30, jaVar3.f41796g * f30);
            } else if (this.B && jaVar3 != null) {
                long j31 = this.N + (this.P * ((float) this.O));
                float f31 = this.H;
                float f32 = (float) jaVar3.e;
                this.e = Utilities.clamp(j31, f31 * f32, this.G * f32);
            } else {
                float f33 = this.P;
                this.e = Utilities.clamp(f33 * ((float) j16), this.O, 0L);
            }
            ia iaVar7 = this.f42071a;
            if (iaVar7 != null) {
                iaVar7.C(this.e, false);
            }
        }
    }

    public final void i(ja jaVar, float f10) {
        long j10;
        ia iaVar;
        long j11;
        long clamp;
        long j12;
        long j13;
        long j14;
        long j15;
        if (jaVar != null) {
            ja jaVar2 = this.v;
            if (jaVar2 != jaVar && jaVar2 != null) {
                if (this.f42099n == this.f42111s.indexOf(jaVar)) {
                    ja jaVar3 = this.v;
                    float f11 = (float) jaVar3.e;
                    float f12 = jaVar.h;
                    float f13 = (float) jaVar.e;
                    float f14 = jaVar.f41796g;
                    long j16 = (f11 * 0.0f) - (f14 * f13);
                    float min = Math.min(f12 - f14, ((jaVar3.h - jaVar3.f41796g) * f11) / f13);
                    long j17 = jaVar.f41795f;
                    long j18 = f10;
                    long j19 = j17 + j18;
                    if (j19 > (f11 * 1.0f) - (f12 * f13)) {
                        ja jaVar4 = this.v;
                        float clamp2 = Utilities.clamp((((jaVar4.h * ((float) jaVar4.e)) - ((float) j17)) - ((float) j18)) / ((float) jaVar.e), 1.0f, min);
                        jaVar.h = clamp2;
                        float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                        jaVar.f41796g = clamp3;
                        ja jaVar5 = this.v;
                        float f15 = jaVar5.h;
                        float f16 = (float) jaVar5.e;
                        float f17 = jaVar.h;
                        float f18 = (float) jaVar.e;
                        long j20 = (f15 * f16) - (f17 * f18);
                        long j21 = (jaVar5.f41796g * f16) - (clamp3 * f18);
                        if (j20 < j21) {
                            j15 = j21;
                            j14 = j20;
                        } else {
                            j14 = j21;
                            j15 = j20;
                        }
                        jaVar.f41795f = Utilities.clamp(jaVar.f41795f + j18, j15, j14);
                        ia iaVar2 = this.f42071a;
                        if (iaVar2 != null) {
                            iaVar2.o0(jaVar.f41796g, jaVar.f41792a);
                            this.f42071a.u0(jaVar.h, jaVar.f41792a);
                        }
                    } else if (j19 < j16) {
                        ja jaVar6 = this.v;
                        float clamp4 = Utilities.clamp((((jaVar6.f41796g * ((float) jaVar6.e)) - ((float) j17)) - ((float) j18)) / ((float) jaVar.e), 1.0f - min, 0.0f);
                        jaVar.f41796g = clamp4;
                        float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                        jaVar.h = clamp5;
                        ja jaVar7 = this.v;
                        float f19 = jaVar7.h;
                        float f20 = (float) jaVar7.e;
                        float f21 = (float) jaVar.e;
                        long j22 = (f19 * f20) - (clamp5 * f21);
                        long j23 = (jaVar7.f41796g * f20) - (jaVar.f41796g * f21);
                        if (j22 < j23) {
                            j13 = j23;
                            j12 = j22;
                        } else {
                            j12 = j23;
                            j13 = j22;
                        }
                        jaVar.f41795f = Utilities.clamp(jaVar.f41795f + j18, j13, j12);
                        ia iaVar3 = this.f42071a;
                        if (iaVar3 != null) {
                            iaVar3.o0(jaVar.f41796g, jaVar.f41792a);
                            this.f42071a.u0(jaVar.h, jaVar.f41792a);
                        }
                    } else {
                        jaVar.f41795f = j19;
                    }
                } else {
                    long j24 = jaVar.f41795f + f10;
                    float f22 = (float) jaVar.e;
                    jaVar.f41795f = Utilities.clamp(j24, ((float) getBaseDuration()) - (jaVar.h * f22), (-jaVar.f41796g) * f22);
                }
            }
            invalidate();
            ia iaVar4 = this.f42071a;
            if (iaVar4 != null) {
                iaVar4.G0(jaVar.f41792a, jaVar.f41795f);
            }
            boolean z4 = this.f42094j1;
            if (!z4 && (iaVar = this.f42071a) != null) {
                iaVar.K(true);
                ja jaVar8 = this.v;
                if (jaVar8 != jaVar && jaVar8 != null) {
                    long j25 = jaVar.f41795f + (jaVar.f41796g * ((float) jaVar.e));
                    float f23 = jaVar8.h;
                    float f24 = (float) jaVar8.e;
                    clamp = Utilities.clamp(j25, f23 * f24, jaVar8.f41796g * f24);
                } else {
                    float f25 = jaVar.f41796g;
                    clamp = Utilities.clamp(f25 * ((float) j11), jaVar.e, 0L);
                }
                ja jaVar9 = this.v;
                if (jaVar9 != jaVar && jaVar9 != null && Math.abs(this.e - clamp) > 400) {
                    this.Z0 = this.e;
                    this.Y0.d(1.0f, true);
                }
                ia iaVar5 = this.f42071a;
                this.e = clamp;
                iaVar5.C(clamp, false);
            } else if (z4 || this.f42103o1) {
                ja jaVar10 = this.v;
                if (jaVar10 != jaVar && jaVar10 != null) {
                    long j26 = jaVar.f41795f + (jaVar.f41796g * ((float) jaVar.e));
                    float f26 = jaVar10.h;
                    float f27 = (float) jaVar10.e;
                    this.e = Utilities.clamp(j26, f26 * f27, jaVar10.f41796g * f27);
                } else {
                    float f28 = jaVar.f41796g;
                    this.e = Utilities.clamp(f28 * ((float) j10), jaVar.e, 0L);
                }
                ia iaVar6 = this.f42071a;
                if (iaVar6 != null) {
                    iaVar6.C(this.e, false);
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
        ia iaVar;
        long j15;
        long clamp;
        ja jaVar = this.h;
        if (jaVar == null) {
            long j16 = this.F;
            long clamp2 = Utilities.clamp(j16 + f10, 0L, -(this.E - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.F = clamp2;
            float f11 = (float) (clamp2 - j16);
            this.G = Utilities.clamp(this.G - (f11 / ((float) this.E)), 1.0f, 0.0f);
            this.H = Utilities.clamp(this.H - (f11 / ((float) this.E)), 1.0f, 0.0f);
            ia iaVar2 = this.f42071a;
            if (iaVar2 != null) {
                iaVar2.J(this.G);
                this.f42071a.D0(this.H);
            }
        } else if (this.D) {
            float f12 = jaVar.h;
            float f13 = (float) jaVar.e;
            float f14 = this.H;
            float f15 = (float) this.E;
            long j17 = (f12 * f13) - (f14 * f15);
            float f16 = jaVar.f41796g;
            float f17 = this.G;
            long j18 = (f16 * f13) - (f17 * f15);
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j19 = this.F;
            long j20 = f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                ja jaVar2 = this.h;
                float clamp3 = Utilities.clamp((((jaVar2.h * ((float) jaVar2.e)) - ((float) j19)) - ((float) j20)) / ((float) this.E), 1.0f, min);
                this.H = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.G = clamp4;
                ja jaVar3 = this.h;
                float f18 = jaVar3.h;
                float f19 = (float) jaVar3.e;
                float f20 = this.H;
                float f21 = (float) this.E;
                long j22 = (f18 * f19) - (f20 * f21);
                long j23 = (jaVar3.f41796g * f19) - (clamp4 * f21);
                if (j22 < j23) {
                    j13 = j23;
                    j12 = j22;
                } else {
                    j12 = j23;
                    j13 = j22;
                }
                this.F = Utilities.clamp(this.F + j20, j13, j12);
                ia iaVar3 = this.f42071a;
                if (iaVar3 != null) {
                    iaVar3.J(this.G);
                    this.f42071a.D0(this.H);
                }
            } else if (j21 < j18) {
                ja jaVar4 = this.h;
                float clamp5 = Utilities.clamp((((jaVar4.f41796g * ((float) jaVar4.e)) - ((float) j19)) - ((float) j20)) / ((float) this.E), 1.0f - min, 0.0f);
                this.G = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.H = clamp6;
                ja jaVar5 = this.h;
                float f22 = jaVar5.h;
                float f23 = (float) jaVar5.e;
                float f24 = (float) this.E;
                long j24 = (f22 * f23) - (clamp6 * f24);
                long j25 = (jaVar5.f41796g * f23) - (this.G * f24);
                if (j24 < j25) {
                    j11 = j25;
                    j10 = j24;
                } else {
                    j10 = j25;
                    j11 = j24;
                }
                this.F = Utilities.clamp(this.F + j20, j11, j10);
                ia iaVar4 = this.f42071a;
                if (iaVar4 != null) {
                    iaVar4.J(this.G);
                    this.f42071a.D0(this.H);
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
        ia iaVar5 = this.f42071a;
        if (iaVar5 != null) {
            iaVar5.e0(this.F + (this.G * ((float) this.E)));
        }
        boolean z4 = this.f42094j1;
        if (!z4 && (iaVar = this.f42071a) != null) {
            iaVar.K(true);
            ja jaVar6 = this.h;
            if (jaVar6 != null) {
                long j27 = this.F + (this.G * ((float) this.E));
                float f26 = jaVar6.h;
                float f27 = (float) jaVar6.e;
                clamp = Utilities.clamp(j27, f26 * f27, jaVar6.f41796g * f27);
            } else {
                float f28 = this.G;
                clamp = Utilities.clamp(f28 * ((float) j15), this.E, 0L);
            }
            if (this.h != null && Math.abs(this.e - clamp) > 400) {
                this.Z0 = this.e;
                this.Y0.d(1.0f, true);
            }
            ia iaVar6 = this.f42071a;
            this.e = clamp;
            iaVar6.C(clamp, false);
        } else if (z4 || this.f42103o1) {
            ja jaVar7 = this.h;
            if (jaVar7 != null) {
                long j28 = this.F + (this.G * ((float) this.E));
                float f29 = jaVar7.h;
                float f30 = (float) jaVar7.e;
                this.e = Utilities.clamp(j28, f29 * f30, jaVar7.f41796g * f30);
            } else {
                float f31 = this.G;
                this.e = Utilities.clamp(f31 * ((float) j14), this.E, 0L);
            }
            ia iaVar7 = this.f42071a;
            if (iaVar7 != null) {
                iaVar7.C(this.e, false);
            }
        }
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ja jaVar = this.h;
        long j10 = jaVar.e;
        this.f42084f = Utilities.clamp((((jaVar.h + jaVar.f41796g) / 2.0f) * ((float) j10)) - (((float) min) / 2.0f), j10 - min, 0L);
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
        ja jaVar;
        ja jaVar2 = this.h;
        ArrayList arrayList = this.f42111s;
        if (jaVar2 != null || this.K || !arrayList.isEmpty()) {
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            float f11 = ((f10 - this.f42119v1) - this.f42117u1) / this.f42110r1;
            ja jaVar3 = this.v;
            if (jaVar3 != null) {
                j10 = (jaVar3.f41796g * ((float) jaVar3.e)) + ((float) jaVar3.f41795f);
            } else {
                j10 = 0;
            }
            float f12 = f11 * ((float) min);
            if (jaVar3 == null) {
                if (this.h == null) {
                    j10 = this.N;
                } else {
                    j10 = 0;
                }
            }
            long clamp = Utilities.clamp((f12 - ((float) j10)) + ((float) this.f42084f), (float) getBaseDuration(), 0.0f);
            ja jaVar4 = this.h;
            if (jaVar4 != null) {
                float f13 = ((float) clamp) / ((float) jaVar4.e);
                if (f13 < jaVar4.f41796g || f13 > jaVar4.h) {
                    return false;
                }
            }
            if (this.v == null || (clamp >= 0 && clamp < (jaVar.h - jaVar.f41796g) * ((float) jaVar.e))) {
                if (this.K && jaVar4 == null && arrayList.isEmpty()) {
                    float f14 = ((float) clamp) / ((float) this.O);
                    if (f14 < this.P || f14 > this.Q) {
                        return false;
                    }
                }
                this.e = clamp;
                invalidate();
                ia iaVar = this.f42071a;
                if (iaVar != null) {
                    iaVar.C(clamp, z4);
                }
                gg.y1 y1Var = this.f42073a1;
                if (y1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y1Var);
                    this.f42073a1 = null;
                }
                if (z4) {
                    gg.y1 y1Var2 = new gg.y1(this, clamp, 28);
                    this.f42073a1 = y1Var2;
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
        ja jaVar;
        long maxScrollDuration;
        if (TextUtils.equals(this.C, str)) {
            return;
        }
        ma maVar = this.J;
        Long l10 = null;
        if (maVar != null) {
            maVar.b();
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
            if (getMeasuredWidth() <= 0 || this.J != null || ((jaVar = this.h) != null && jaVar.e < 1)) {
                j12 = j13;
                z12 = false;
                z10 = true;
            } else {
                String str2 = this.C;
                int i10 = this.f42113s1;
                int i11 = this.f42119v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.E;
                if (j14 > 2) {
                    l10 = Long.valueOf(j14);
                }
                ja jaVar2 = this.h;
                if (jaVar2 != null) {
                    maxScrollDuration = jaVar2.e;
                } else {
                    maxScrollDuration = getMaxScrollDuration();
                }
                j12 = j13;
                z12 = false;
                z10 = true;
                this.J = new ma(this, false, str2, i12, dp, l10, maxScrollDuration, -1L, -1L, new ea(this, 0));
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
            this.f42072a0.f(this.D, z10);
            this.f42078c0.f(this.M, z10);
            this.W.f(this.B, z10);
        }
        invalidate();
    }

    public final void o(boolean z4, String str, long j10, float f10) {
        String str2;
        ja jaVar = this.h;
        if (jaVar == null) {
            str2 = null;
        } else {
            str2 = jaVar.d;
        }
        if (TextUtils.equals(str2, str)) {
            return;
        }
        ja jaVar2 = this.h;
        if (jaVar2 != null) {
            ma maVar = jaVar2.f41794c;
            if (maVar != null) {
                maVar.b();
                this.h.f41794c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f42084f = 0L;
            ja jaVar3 = new ja(this);
            this.h = jaVar3;
            jaVar3.f41793b = z4;
            jaVar3.d = str;
            jaVar3.e = j10;
            jaVar3.f41797i = f10;
            ja.a(jaVar3, false);
        } else {
            this.h = null;
            this.f42084f = 0L;
        }
        if (!this.B) {
            this.D = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.I0.setTextSize(AndroidUtilities.dp(12.0f));
        this.M0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.f42119v1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.f42122w1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.f42113s1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.f42115t1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.f42117u1 = dp4;
        this.f42110r1 = (this.f42113s1 - (dp4 * 2)) - (this.f42119v1 * 2);
        ja jaVar = this.h;
        if (jaVar != null && jaVar.d != null && jaVar.f41794c == null) {
            ja.a(jaVar, false);
        }
        ArrayList arrayList = this.f42111s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ja jaVar2 = (ja) obj;
                if (jaVar2.d != null && jaVar2.f41794c == null) {
                    ja.a(jaVar2, false);
                    ja.b(jaVar2);
                }
            }
        }
        if (this.L != null && this.U == null) {
            p();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        throw new UnsupportedOperationException("Method not decompiled: ph.oa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.U == null || this.T) {
                this.U = new ha(this, this.L, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.R = false;
                this.f42080d0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        ja jaVar;
        cu cuVar = new cu(17);
        ArrayList arrayList = this.f42111s;
        Collections.sort(arrayList, cuVar);
        if (arrayList.isEmpty()) {
            jaVar = null;
        } else {
            jaVar = (ja) arrayList.get(0);
        }
        this.v = jaVar;
        if (jaVar != null) {
            long j10 = jaVar.f41795f;
        }
    }

    public void setCollage(ArrayList<u6> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ma maVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f42111s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ja jaVar = (ja) arrayList2.get(i10);
            if (jaVar != null && (maVar = jaVar.f41794c) != null) {
                maVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.f42108r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            ha haVar = (ha) arrayList3.get(i11);
            if (haVar != null) {
                haVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.f42082e0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                u6 u6Var = arrayList.get(i12);
                if (u6Var.K) {
                    ja jaVar2 = new ja(this);
                    jaVar2.f41792a = i12;
                    jaVar2.f41793b = false;
                    jaVar2.d = u6Var.L.getAbsolutePath();
                    jaVar2.e = u6Var.f42415h0;
                    jaVar2.f41795f = u6Var.X;
                    jaVar2.f41797i = u6Var.P;
                    jaVar2.f41796g = u6Var.V;
                    jaVar2.h = u6Var.W;
                    ja.a(jaVar2, false);
                    ja.b(jaVar2);
                    arrayList2.add(jaVar2);
                }
            }
        }
        q();
        this.f42099n = 0;
    }

    public void setDelegate(ia iaVar) {
        this.f42071a = iaVar;
    }

    public void setMaxCount(int i10) {
        this.V = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.f42074b = runnable;
    }

    public void setProgress(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ph.oa.setProgress(long):void");
    }

    public void setRoundNull(boolean z4) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z4);
    }

    public void setVideoLeft(float f10) {
        ja jaVar = this.h;
        if (jaVar == null) {
            return;
        }
        jaVar.f41796g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ja jaVar = this.h;
        if (jaVar == null) {
            return;
        }
        jaVar.h = f10;
        invalidate();
    }
}
