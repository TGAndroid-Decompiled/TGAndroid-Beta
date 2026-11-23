package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.ys F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.h6 M;
    public org.telegram.messenger.gj N;
    public sz0 O;
    public org.telegram.ui.Cells.r1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.g8 W;
    public boolean X;
    public he Y;
    public bi.q2 Z;
    public final Context f52657a;
    public final pz0 f52658a0;
    public final k0 f52659b;
    public float f52660b0;
    public final ai.l0 f52661c;
    public boolean f52662c0;
    public org.telegram.ui.Components.oz0 d;
    public org.telegram.ui.ActionBar.t1 f52663d0;
    public i0.b f52664e;
    public ValueAnimator f52665e0;
    public Bitmap f52666f;
    public ValueAnimator f52667f0;
    public BitmapShader h;
    public Paint f52668n;
    public Matrix f52669r;
    public float f52670s;
    public float f52671w;
    public org.telegram.ui.Components.i61 f52672x;
    public hi.l3 f52673y;

    public uz0(Activity activity) {
        super(activity, 2131755352);
        this.f52664e = i0.b.f15916e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.f52658a0 = new pz0(this, 0);
        this.f52660b0 = 0.0f;
        this.f52662c0 = false;
        this.f52657a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.f52659b = k0Var;
        k0Var.setOnClickListener(new qz0(this, 0));
        ai.l0 l0Var = new ai.l0(this, activity);
        this.f52661c = l0Var;
        l0Var.setClipToPadding(false);
        k0Var.addView(l0Var, c8.ma.e(-1, -1, 119));
        rz0 rz0Var = new rz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(k0Var, rz0Var);
        if (org.telegram.messenger.cz.f23440s0) {
            this.F = new org.telegram.ui.Components.ys();
        }
    }

    public final void c(boolean z10, pz0 pz0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f52665e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f52667f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f52670s;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f52665e0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(11, this, z10));
        this.f52665e0.addListener(new androidx.fragment.app.g(this, z10, pz0Var, 13));
        if (!z10 && this.Z == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f52665e0;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        valueAnimator3.setInterpolator(nrVar);
        this.f52665e0.setDuration(j3);
        this.f52665e0.start();
        float f13 = this.f52671w;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f52667f0 = ofFloat2;
        ofFloat2.addUpdateListener(new iz0(this, 3));
        this.f52667f0.addListener(new c30(8, this, z10));
        this.f52667f0.setDuration(((float) j3) * 1.5f);
        this.f52667f0.setInterpolator(nrVar);
        this.f52667f0.start();
    }

    public final void d() {
        if (!this.I) {
            k0 k0Var = this.f52659b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.P;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f52664e;
                    this.G = (iArr[0] - this.f52664e.f15917a) - ((((width - bVar.f15917a) - bVar.f15919c) - this.P.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f52664e;
                    this.H = org.telegram.messenger.f3.y(((height - bVar2.f15918b) - bVar2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.f52664e.f15918b);
                    if (!this.K) {
                        this.K = true;
                        float i7 = (Utilities.i((this.P.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.P.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.P.getHeight()) / 2.0f);
                        this.J = i7;
                        if (this.T) {
                            this.J = 0.0f;
                        } else {
                            this.J = org.telegram.messenger.g0.T1(0.0f, i7, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.H = 0.0f;
                    this.G = 0.0f;
                }
                this.I = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        sz0 sz0Var;
        if (!this.f52662c0) {
            org.telegram.ui.ActionBar.t1 t1Var = this.f52663d0;
            if (t1Var != null) {
                t1Var.dismiss();
                this.f52663d0 = null;
            }
            this.f52662c0 = true;
            hi.l3 l3Var = this.f52673y;
            if (l3Var != null) {
                l3Var.f(true);
            }
            org.telegram.ui.Components.i61 i61Var = this.f52672x;
            if (i61Var != null) {
                i61Var.g0();
                this.f52672x.m0();
                this.f52672x = null;
            }
            if (!this.T && (sz0Var = this.O) != null && sz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.en0 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.f52670s;
                org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.f34927n;
                if (r1Var != null) {
                    r1Var.invalidate();
                }
            }
            this.I = false;
            d();
            c(false, new pz0(this, 3));
            k0 k0Var = this.f52659b;
            k0Var.invalidate();
            bi.q2 q2Var = this.Z;
            if (q2Var != null) {
                org.telegram.ui.Cells.r1 r1Var2 = this.P;
                if (r1Var2 != null) {
                    r1Var2.f31548ob = true;
                }
                org.telegram.messenger.g0.g3(q2Var);
                this.Z = null;
                org.telegram.ui.Components.oz0 oz0Var = new org.telegram.ui.Components.oz0(this.f52657a, null);
                this.d = oz0Var;
                k0Var.addView(oz0Var, c8.ma.e(-1, -1, 119));
                org.telegram.ui.Components.oz0 oz0Var2 = this.d;
                sz0 sz0Var2 = this.O;
                pz0 pz0Var = new pz0(this, 1);
                org.telegram.ui.Components.mz0 mz0Var = oz0Var2.f38423a;
                if (mz0Var != null) {
                    mz0Var.b(1.5f, sz0Var2, pz0Var);
                    Choreographer.getInstance().postFrameCallback(oz0Var2.f38424b);
                } else {
                    org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(sz0Var2, pz0Var);
                    nz0Var.f38025g = 1.5f;
                    oz0Var2.f38425c.add(nz0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ys ysVar = this.F;
            if (ysVar != null) {
                PowerManager.WakeLock wakeLock = ysVar.h;
                SensorManager sensorManager = ysVar.f42503a;
                if (ysVar.f42508n) {
                    Sensor sensor = ysVar.f42507f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(ysVar, sensor);
                    }
                    Sensor sensor2 = ysVar.f42506e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(ysVar, sensor2);
                    }
                    Sensor sensor3 = ysVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(ysVar, sensor3);
                    }
                    sensorManager.unregisterListener(ysVar, ysVar.f42505c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    ysVar.f42508n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f52670s));
            this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f52670s));
            hi.l3 l3Var = this.f52673y;
            if (l3Var != null) {
                l3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f52670s));
                this.f52673y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f52670s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.gj gjVar;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.t1 t1Var = this.f52663d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.f52663d0 = null;
        } else if (!this.f52662c0 && (gjVar = this.N) != null && !gjVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
            if (this.T) {
                i7 = 2131743347;
            } else {
                i7 = 2131743272;
            }
            String N0 = org.telegram.messenger.hd.N0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28777a;
            t1Var2.S = N0;
            if (this.T) {
                i10 = 2131743348;
            } else {
                i10 = 2131743273;
            }
            t1Var2.U = org.telegram.messenger.hd.N0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751759, null), new rz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751586, null), new rz0(this, 2));
            this.f52663d0 = t1Var2;
            t1Var2.show();
            TextView textView = (TextView) this.f52663d0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        k0 k0Var = this.f52659b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.s2.f26730a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(k0Var, !org.telegram.ui.ActionBar.m6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.r1 r1Var = this.P;
            if (r1Var != null) {
                r1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.rh(28, this, r1Var), 14.0f);
            this.X = true;
            c(true, null);
            he heVar = this.Y;
            if (heVar != null) {
                org.telegram.messenger.g0.g3(heVar);
                this.Y = null;
            }
            org.telegram.ui.Components.ys ysVar = this.F;
            if (ysVar != null) {
                PowerManager.WakeLock wakeLock = ysVar.h;
                SensorManager sensorManager = ysVar.f42503a;
                if (!ysVar.f42508n) {
                    Sensor sensor = ysVar.f42507f;
                    if (sensor != null) {
                        sensorManager.registerListener(ysVar, sensor, 30000);
                    }
                    Sensor sensor2 = ysVar.f42506e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(ysVar, sensor2, 30000);
                    }
                    Sensor sensor3 = ysVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(ysVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(ysVar, ysVar.f42505c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    ysVar.f42508n = true;
                }
            }
        }
    }
}
