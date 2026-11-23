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
public final class sz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.vs F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.i6 M;
    public org.telegram.messenger.fj N;
    public qz0 O;
    public org.telegram.ui.Cells.r1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.f8 W;
    public boolean X;
    public he Y;
    public bi.s2 Z;
    public final Context f52176a;
    public final nz0 f52177a0;
    public final k0 f52178b;
    public float f52179b0;
    public final ai.h0 f52180c;
    public boolean f52181c0;
    public org.telegram.ui.Components.nz0 d;
    public org.telegram.ui.ActionBar.t1 f52182d0;
    public i0.b f52183e;
    public ValueAnimator f52184e0;
    public Bitmap f52185f;
    public ValueAnimator f52186f0;
    public BitmapShader h;
    public Paint f52187n;
    public Matrix f52188r;
    public float f52189s;
    public float f52190w;
    public org.telegram.ui.Components.h61 f52191x;
    public hi.u3 f52192y;

    public sz0(Activity activity) {
        super(activity, 2131755352);
        this.f52183e = i0.b.f15977e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.f52177a0 = new nz0(this, 0);
        this.f52179b0 = 0.0f;
        this.f52181c0 = false;
        this.f52176a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.f52178b = k0Var;
        k0Var.setOnClickListener(new oz0(this, 0));
        ai.h0 h0Var = new ai.h0(this, activity);
        this.f52180c = h0Var;
        h0Var.setClipToPadding(false);
        k0Var.addView(h0Var, c8.na.e(-1, -1, 119));
        pz0 pz0Var = new pz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(k0Var, pz0Var);
        if (org.telegram.messenger.bz.f23320s0) {
            this.F = new org.telegram.ui.Components.vs();
        }
    }

    public final void c(boolean z10, nz0 nz0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f52184e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f52186f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f52189s;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f52184e0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(11, this, z10));
        this.f52184e0.addListener(new androidx.fragment.app.g(this, z10, nz0Var, 13));
        if (!z10 && this.Z == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f52184e0;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        valueAnimator3.setInterpolator(krVar);
        this.f52184e0.setDuration(j3);
        this.f52184e0.start();
        float f13 = this.f52190w;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f52186f0 = ofFloat2;
        ofFloat2.addUpdateListener(new hz0(this, 3));
        this.f52186f0.addListener(new b30(8, this, z10));
        this.f52186f0.setDuration(((float) j3) * 1.5f);
        this.f52186f0.setInterpolator(krVar);
        this.f52186f0.start();
    }

    public final void d() {
        if (!this.I) {
            k0 k0Var = this.f52178b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.P;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f52183e;
                    this.G = (iArr[0] - this.f52183e.f15978a) - ((((width - bVar.f15978a) - bVar.f15980c) - this.P.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f52183e;
                    this.H = org.telegram.messenger.f3.y(((height - bVar2.f15979b) - bVar2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.f52183e.f15979b);
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
        qz0 qz0Var;
        if (!this.f52181c0) {
            org.telegram.ui.ActionBar.t1 t1Var = this.f52182d0;
            if (t1Var != null) {
                t1Var.dismiss();
                this.f52182d0 = null;
            }
            this.f52181c0 = true;
            hi.u3 u3Var = this.f52192y;
            if (u3Var != null) {
                u3Var.f(true);
            }
            org.telegram.ui.Components.h61 h61Var = this.f52191x;
            if (h61Var != null) {
                h61Var.g0();
                this.f52191x.m0();
                this.f52191x = null;
            }
            if (!this.T && (qz0Var = this.O) != null && qz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.dn0 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.f52189s;
                org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.f34406n;
                if (r1Var != null) {
                    r1Var.invalidate();
                }
            }
            this.I = false;
            d();
            c(false, new nz0(this, 3));
            k0 k0Var = this.f52178b;
            k0Var.invalidate();
            bi.s2 s2Var = this.Z;
            if (s2Var != null) {
                org.telegram.ui.Cells.r1 r1Var2 = this.P;
                if (r1Var2 != null) {
                    r1Var2.f31598ob = true;
                }
                org.telegram.messenger.g0.g3(s2Var);
                this.Z = null;
                org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(this.f52176a, null);
                this.d = nz0Var;
                k0Var.addView(nz0Var, c8.na.e(-1, -1, 119));
                org.telegram.ui.Components.nz0 nz0Var2 = this.d;
                qz0 qz0Var2 = this.O;
                nz0 nz0Var3 = new nz0(this, 1);
                org.telegram.ui.Components.lz0 lz0Var = nz0Var2.f37961a;
                if (lz0Var != null) {
                    lz0Var.b(1.5f, qz0Var2, nz0Var3);
                    Choreographer.getInstance().postFrameCallback(nz0Var2.f37962b);
                } else {
                    org.telegram.ui.Components.mz0 mz0Var = new org.telegram.ui.Components.mz0(qz0Var2, nz0Var3);
                    mz0Var.f37601g = 1.5f;
                    nz0Var2.f37963c.add(mz0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.vs vsVar = this.F;
            if (vsVar != null) {
                PowerManager.WakeLock wakeLock = vsVar.h;
                SensorManager sensorManager = vsVar.f41421a;
                if (vsVar.f41426n) {
                    Sensor sensor = vsVar.f41425f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(vsVar, sensor);
                    }
                    Sensor sensor2 = vsVar.f41424e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(vsVar, sensor2);
                    }
                    Sensor sensor3 = vsVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(vsVar, sensor3);
                    }
                    sensorManager.unregisterListener(vsVar, vsVar.f41423c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    vsVar.f41426n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f52189s));
            this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f52189s));
            hi.u3 u3Var = this.f52192y;
            if (u3Var != null) {
                u3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f52189s));
                this.f52192y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f52189s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.fj fjVar;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.t1 t1Var = this.f52182d0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.f52182d0 = null;
        } else if (!this.f52181c0 && (fjVar = this.N) != null && !fjVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
            if (this.T) {
                i7 = 2131743345;
            } else {
                i7 = 2131743267;
            }
            String N0 = org.telegram.messenger.gd.N0(i7, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
            t1Var2.S = N0;
            if (this.T) {
                i10 = 2131743346;
            } else {
                i10 = 2131743268;
            }
            t1Var2.U = org.telegram.messenger.gd.N0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new pz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751586, null), new pz0(this, 2));
            this.f52182d0 = t1Var2;
            t1Var2.show();
            TextView textView = (TextView) this.f52182d0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
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
        k0 k0Var = this.f52178b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.s2.f26829a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        k0Var.setSystemUiVisibility(1284);
        org.telegram.messenger.g0.n3(k0Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.ui.Cells.r1 r1Var = this.P;
            if (r1Var != null) {
                r1Var.setVisibility(4);
            }
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ph(29, this, r1Var), 14.0f);
            this.X = true;
            c(true, null);
            he heVar = this.Y;
            if (heVar != null) {
                org.telegram.messenger.g0.g3(heVar);
                this.Y = null;
            }
            org.telegram.ui.Components.vs vsVar = this.F;
            if (vsVar != null) {
                PowerManager.WakeLock wakeLock = vsVar.h;
                SensorManager sensorManager = vsVar.f41421a;
                if (!vsVar.f41426n) {
                    Sensor sensor = vsVar.f41425f;
                    if (sensor != null) {
                        sensorManager.registerListener(vsVar, sensor, 30000);
                    }
                    Sensor sensor2 = vsVar.f41424e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(vsVar, sensor2, 30000);
                    }
                    Sensor sensor3 = vsVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(vsVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(vsVar, vsVar.f41423c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    vsVar.f41426n = true;
                }
            }
        }
    }
}
