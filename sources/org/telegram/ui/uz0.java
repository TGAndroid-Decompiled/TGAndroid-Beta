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
    public TextView D;
    public final org.telegram.ui.Components.js E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.g6 L;
    public org.telegram.messenger.ij M;
    public sz0 N;
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
    public final pz0 Z;
    public final Context f50500a;
    public float f50501a0;
    public final k0 f50502b;
    public boolean f50503b0;
    public final bi.x5 f50504c;
    public org.telegram.ui.ActionBar.u1 f50505c0;
    public org.telegram.ui.Components.ez0 d;
    public ValueAnimator f50506d0;
    public i0.b f50507e;
    public ValueAnimator f50508e0;
    public Bitmap f50509f;
    public BitmapShader h;
    public Paint f50510n;
    public Matrix f50511r;
    public float f50512s;
    public float f50513w;
    public org.telegram.ui.Components.u51 f50514x;
    public fi.m3 f50515y;

    public uz0(Activity activity) {
        super(activity, 2131755352);
        this.f50507e = i0.b.f15119e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new pz0(this, 0);
        this.f50501a0 = 0.0f;
        this.f50503b0 = false;
        this.f50500a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.f50502b = k0Var;
        k0Var.setOnClickListener(new qz0(this, 0));
        bi.x5 x5Var = new bi.x5(this, activity);
        this.f50504c = x5Var;
        x5Var.setClipToPadding(false);
        k0Var.addView(x5Var, c8.ha.e(-1, -1, 119));
        rz0 rz0Var = new rz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(k0Var, rz0Var);
        if (org.telegram.messenger.iz.f23435s0) {
            this.E = new org.telegram.ui.Components.js();
        }
    }

    public final void c(boolean z9, pz0 pz0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f50506d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f50508e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f50512s;
        float f12 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f50506d0 = ofFloat;
        ofFloat.addUpdateListener(new ch.u(11, this, z9));
        this.f50506d0.addListener(new ai.g0(this, z9, pz0Var, 13));
        if (!z9 && this.Y == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f50506d0;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        valueAnimator3.setInterpolator(xqVar);
        this.f50506d0.setDuration(j3);
        this.f50506d0.start();
        float f13 = this.f50513w;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f50508e0 = ofFloat2;
        ofFloat2.addUpdateListener(new jz0(this, 3));
        this.f50508e0.addListener(new b50(7, this, z9));
        this.f50508e0.setDuration(((float) j3) * 1.5f);
        this.f50508e0.setInterpolator(xqVar);
        this.f50508e0.start();
    }

    public final void d() {
        if (!this.H) {
            k0 k0Var = this.f50502b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.q1 q1Var = this.O;
                if (q1Var != null) {
                    int[] iArr = new int[2];
                    q1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f50507e;
                    this.F = (iArr[0] - this.f50507e.f15120a) - ((((width - bVar.f15120a) - bVar.f15122c) - this.O.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f50507e;
                    this.G = org.telegram.messenger.k5.y(((height - bVar2.f15121b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.f50507e.f15121b);
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
        sz0 sz0Var;
        if (!this.f50503b0) {
            org.telegram.ui.ActionBar.u1 u1Var = this.f50505c0;
            if (u1Var != null) {
                u1Var.dismiss();
                this.f50505c0 = null;
            }
            this.f50503b0 = true;
            fi.m3 m3Var = this.f50515y;
            if (m3Var != null) {
                m3Var.f(true);
            }
            org.telegram.ui.Components.u51 u51Var = this.f50514x;
            if (u51Var != null) {
                u51Var.g0();
                this.f50514x.m0();
                this.f50514x = null;
            }
            if (!this.S && (sz0Var = this.N) != null && sz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.qm0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f50512s;
                org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f37429n;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new pz0(this, 3));
            k0 k0Var = this.f50502b;
            k0Var.invalidate();
            bi.d3 d3Var = this.Y;
            if (d3Var != null) {
                org.telegram.ui.Cells.q1 q1Var2 = this.O;
                if (q1Var2 != null) {
                    q1Var2.f29948nb = true;
                }
                org.telegram.messenger.g0.h3(d3Var);
                this.Y = null;
                org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0(this.f50500a, null);
                this.d = ez0Var;
                k0Var.addView(ez0Var, c8.ha.e(-1, -1, 119));
                org.telegram.ui.Components.ez0 ez0Var2 = this.d;
                sz0 sz0Var2 = this.N;
                pz0 pz0Var = new pz0(this, 1);
                org.telegram.ui.Components.cz0 cz0Var = ez0Var2.f33525a;
                if (cz0Var != null) {
                    cz0Var.b(1.5f, sz0Var2, pz0Var);
                    Choreographer.getInstance().postFrameCallback(ez0Var2.f33526b);
                } else {
                    org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(sz0Var2, pz0Var);
                    dz0Var.f33235g = 1.5f;
                    ez0Var2.f33527c.add(dz0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.js jsVar = this.E;
            if (jsVar != null) {
                PowerManager.WakeLock wakeLock = jsVar.h;
                SensorManager sensorManager = jsVar.f35117a;
                if (jsVar.f35122n) {
                    Sensor sensor = jsVar.f35121f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(jsVar, sensor);
                    }
                    Sensor sensor2 = jsVar.f35120e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(jsVar, sensor2);
                    }
                    Sensor sensor3 = jsVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(jsVar, sensor3);
                    }
                    sensorManager.unregisterListener(jsVar, jsVar.f35119c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    jsVar.f35122n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(org.telegram.messenger.g0.T1(this.F, 0.0f, this.f50512s));
            this.N.setTranslationY(org.telegram.messenger.g0.T1(this.G, this.I, this.f50512s));
            fi.m3 m3Var = this.f50515y;
            if (m3Var != null) {
                m3Var.setTranslationX(org.telegram.messenger.g0.T1(this.F, 0.0f, this.f50512s));
                this.f50515y.setTranslationY(org.telegram.messenger.g0.T1(this.G, this.I, this.f50512s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.ij ijVar;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.u1 u1Var = this.f50505c0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.f50505c0 = null;
        } else if (!this.f50503b0 && (ijVar = this.M) != null && !ijVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.L);
            if (this.S) {
                i7 = 2131743592;
            } else {
                i7 = 2131743517;
            }
            String M0 = org.telegram.messenger.id.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
            u1Var2.R = M0;
            if (this.S) {
                i10 = 2131743593;
            } else {
                i10 = 2131743518;
            }
            u1Var2.T = org.telegram.messenger.id.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new rz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751598, null), new rz0(this, 2));
            this.f50505c0 = u1Var2;
            u1Var2.show();
            TextView textView = (TextView) this.f50505c0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
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
        k0 k0Var = this.f50502b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z9 = org.telegram.messenger.r2.f25212a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.o3(k0Var, !org.telegram.ui.ActionBar.l6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.q1 q1Var = this.O;
            if (q1Var != null) {
                q1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.fx(24, this, q1Var), 14.0f);
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
                SensorManager sensorManager = jsVar.f35117a;
                if (!jsVar.f35122n) {
                    Sensor sensor = jsVar.f35121f;
                    if (sensor != null) {
                        sensorManager.registerListener(jsVar, sensor, 30000);
                    }
                    Sensor sensor2 = jsVar.f35120e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(jsVar, sensor2, 30000);
                    }
                    Sensor sensor3 = jsVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(jsVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(jsVar, jsVar.f35119c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    jsVar.f35122n = true;
                }
            }
        }
    }
}
