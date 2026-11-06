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
public final class rz0 extends Dialog {
    public TextView D;
    public final org.telegram.ui.Components.js E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.f6 L;
    public org.telegram.messenger.ij M;
    public pz0 N;
    public org.telegram.ui.Cells.q1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.c8 V;
    public boolean W;
    public ie X;
    public bi.d3 Y;
    public final mz0 Z;
    public final Context f49571a;
    public float f49572a0;
    public final k0 f49573b;
    public boolean f49574b0;
    public final bi.x5 f49575c;
    public org.telegram.ui.ActionBar.u1 f49576c0;
    public org.telegram.ui.Components.cz0 d;
    public ValueAnimator f49577d0;
    public i0.b f49578e;
    public ValueAnimator f49579e0;
    public Bitmap f49580f;
    public BitmapShader h;
    public Paint f49581n;
    public Matrix f49582r;
    public float f49583s;
    public float f49584w;
    public org.telegram.ui.Components.n51 f49585x;
    public fi.m3 f49586y;

    public rz0(Activity activity) {
        super(activity, 2131755352);
        this.f49578e = i0.b.f15116e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new mz0(this, 0);
        this.f49572a0 = 0.0f;
        this.f49574b0 = false;
        this.f49571a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.f49573b = k0Var;
        k0Var.setOnClickListener(new nz0(this, 0));
        bi.x5 x5Var = new bi.x5(this, activity);
        this.f49575c = x5Var;
        x5Var.setClipToPadding(false);
        k0Var.addView(x5Var, c8.ha.e(-1, -1, 119));
        oz0 oz0Var = new oz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.a0.i(k0Var, oz0Var);
        if (org.telegram.messenger.iz.f23407s0) {
            this.E = new org.telegram.ui.Components.js();
        }
    }

    public final void c(boolean z9, mz0 mz0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f49577d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f49579e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f49583s;
        float f12 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f49577d0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(11, this, z9));
        this.f49577d0.addListener(new ai.g0(this, z9, mz0Var, 13));
        if (!z9 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f49577d0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f49577d0.setDuration(j3);
        this.f49577d0.start();
        float f13 = this.f49584w;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f49579e0 = ofFloat2;
        ofFloat2.addUpdateListener(new gz0(this, 3));
        this.f49579e0.addListener(new z40(7, this, z9));
        this.f49579e0.setDuration(((float) j3) * 1.5f);
        this.f49579e0.setInterpolator(xqVar);
        this.f49579e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f49573b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.O;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f49578e;
                    this.F = (iArr[0] - this.f49578e.f15117a) - ((((width - bVar.f15117a) - bVar.f15119c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f49578e;
                    this.G = org.telegram.messenger.k5.y(((height - bVar2.f15118b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f49578e.f15118b);
                    if (!this.J) {
                        this.J = true;
                        float i7 = (Utilities.i((this.O.getHeight() / 2.0f) + iArr[1], k0Var.getHeight() * 0.7f, k0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((k0Var.getHeight() - this.O.getHeight()) / 2.0f);
                        this.I = i7;
                        if (this.S) {
                            this.I = 0.0f;
                        } else {
                            this.I = org.telegram.messenger.g0.T1(0.0f, i7, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.G = 0.0f;
                    this.F = 0.0f;
                }
                this.H = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        pz0 pz0Var;
        if (!this.f49574b0) {
            org.telegram.ui.ActionBar.u1 u1Var = this.f49576c0;
            if (u1Var != null) {
                u1Var.dismiss();
                this.f49576c0 = null;
            }
            this.f49574b0 = true;
            fi.m3 m3Var = this.f49586y;
            if (m3Var != null) {
                m3Var.f(true);
            }
            org.telegram.ui.Components.n51 n51Var = this.f49585x;
            if (n51Var != null) {
                n51Var.g0();
                this.f49585x.m0();
                this.f49585x = null;
            }
            if (!this.S && (pz0Var = this.N) != null && pz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.pm0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f49583s;
                org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f37110n;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new mz0(this, 3));
            k0 k0Var = this.f49573b;
            k0Var.invalidate();
            bi.d3 d3Var = this.Y;
            if (d3Var != null) {
                org.telegram.ui.Cells.q1 q1Var2 = this.O;
                if (q1Var2 != null) {
                    q1Var2.f29939nb = true;
                }
                org.telegram.messenger.g0.h3(d3Var);
                this.Y = null;
                org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(this.f49571a, null);
                this.d = cz0Var;
                k0Var.addView(cz0Var, c8.ha.e(-1, -1, 119));
                org.telegram.ui.Components.cz0 cz0Var2 = this.d;
                pz0 pz0Var2 = this.N;
                mz0 mz0Var = new mz0(this, 1);
                org.telegram.ui.Components.az0 az0Var = cz0Var2.f32722a;
                if (az0Var != null) {
                    az0Var.b(1.5f, pz0Var2, mz0Var);
                    Choreographer.getInstance().postFrameCallback(cz0Var2.f32723b);
                } else {
                    org.telegram.ui.Components.bz0 bz0Var = new org.telegram.ui.Components.bz0(pz0Var2, mz0Var);
                    bz0Var.f32344g = 1.5f;
                    cz0Var2.f32724c.add(bz0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.js jsVar = this.E;
            if (jsVar != null) {
                PowerManager.WakeLock wakeLock = jsVar.h;
                SensorManager sensorManager = jsVar.f35063a;
                if (jsVar.f35068n) {
                    Sensor sensor = jsVar.f35067f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(jsVar, sensor);
                    }
                    Sensor sensor2 = jsVar.f35066e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(jsVar, sensor2);
                    }
                    Sensor sensor3 = jsVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(jsVar, sensor3);
                    }
                    sensorManager.unregisterListener(jsVar, jsVar.f35065c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    jsVar.f35068n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(org.telegram.messenger.g0.T1(this.F, 0.0f, this.f49583s));
            this.N.setTranslationY(org.telegram.messenger.g0.T1(this.G, this.I, this.f49583s));
            fi.m3 m3Var = this.f49586y;
            if (m3Var != null) {
                m3Var.setTranslationX(org.telegram.messenger.g0.T1(this.F, 0.0f, this.f49583s));
                this.f49586y.setTranslationY(org.telegram.messenger.g0.T1(this.G, this.I, this.f49583s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.ij ijVar;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.u1 u1Var = this.f49576c0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.f49576c0 = null;
        } else if (!this.f49574b0 && (ijVar = this.M) != null && !ijVar.Q3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.L);
            if (this.S) {
                i7 = 2131743593;
            } else {
                i7 = 2131743518;
            }
            String M0 = org.telegram.messenger.hd.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27292a;
            u1Var2.R = M0;
            if (this.S) {
                i10 = 2131743594;
            } else {
                i10 = 2131743519;
            }
            u1Var2.T = org.telegram.messenger.hd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new oz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751599, null), new oz0(this, 2));
            this.f49576c0 = u1Var2;
            u1Var2.show();
            TextView textView = (TextView) this.f49576c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
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
        k0 k0Var = this.f49573b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z9 = org.telegram.messenger.r2.f25191a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(k0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.O;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ex(24, this, q1Var), 14.0f);
            this.W = true;
            c(true, null);
            ie ieVar = this.X;
            if (ieVar != null) {
                org.telegram.messenger.g0.h3(ieVar);
                this.X = null;
            }
            org.telegram.ui.Components.js jsVar = this.E;
            if (jsVar != null) {
                PowerManager.WakeLock wakeLock = jsVar.h;
                SensorManager sensorManager = jsVar.f35063a;
                if (!jsVar.f35068n) {
                    Sensor sensor = jsVar.f35067f;
                    if (sensor != null) {
                        sensorManager.registerListener(jsVar, sensor, 30000);
                    }
                    Sensor sensor2 = jsVar.f35066e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(jsVar, sensor2, 30000);
                    }
                    Sensor sensor3 = jsVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(jsVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(jsVar, jsVar.f35065c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    jsVar.f35068n = true;
                }
            }
        }
    }
}
