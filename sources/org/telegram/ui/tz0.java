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
public final class tz0 extends Dialog {
    public TextView E;
    public final org.telegram.ui.Components.ws F;
    public float G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public float L;
    public org.telegram.ui.ActionBar.i6 M;
    public org.telegram.messenger.fj N;
    public rz0 O;
    public org.telegram.ui.Cells.r1 P;
    public TextureView Q;
    public boolean R;
    public final RectF S;
    public boolean T;
    public float U;
    public float V;
    public org.telegram.ui.Components.h8 W;
    public boolean X;
    public he Y;
    public bi.m2 Z;
    public final Context f52377a;
    public final oz0 f52378a0;
    public final k0 f52379b;
    public float f52380b0;
    public final ai.k0 f52381c;
    public boolean f52382c0;
    public org.telegram.ui.Components.mz0 d;
    public org.telegram.ui.ActionBar.u1 f52383d0;
    public i0.b f52384e;
    public ValueAnimator f52385e0;
    public Bitmap f52386f;
    public ValueAnimator f52387f0;
    public BitmapShader h;
    public Paint f52388n;
    public Matrix f52389r;
    public float f52390s;
    public float f52391w;
    public org.telegram.ui.Components.f61 f52392x;
    public hi.m3 f52393y;

    public tz0(Activity activity) {
        super(activity, 2131755352);
        this.f52384e = i0.b.f15888e;
        this.S = new RectF();
        this.U = 0.0f;
        this.V = 0.0f;
        this.f52378a0 = new oz0(this, 0);
        this.f52380b0 = 0.0f;
        this.f52382c0 = false;
        this.f52377a = activity;
        org.telegram.messenger.g0.S(getWindow());
        k0 k0Var = new k0(23, activity, this);
        this.f52379b = k0Var;
        k0Var.setOnClickListener(new pz0(this, 0));
        ai.k0 k0Var2 = new ai.k0(this, activity);
        this.f52381c = k0Var2;
        k0Var2.setClipToPadding(false);
        k0Var.addView(k0Var2, c8.ma.e(-1, -1, 119));
        qz0 qz0Var = new qz0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(k0Var, qz0Var);
        if (org.telegram.messenger.bz.f23195s0) {
            this.F = new org.telegram.ui.Components.ws();
        }
    }

    public final void c(boolean z10, oz0 oz0Var) {
        float f10;
        long j3;
        ValueAnimator valueAnimator = this.f52385e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f52387f0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f52390s;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f52385e0 = ofFloat;
        ofFloat.addUpdateListener(new ch.v(11, this, z10));
        this.f52385e0.addListener(new androidx.fragment.app.g(this, z10, oz0Var, 13));
        if (!z10 && this.Z == null) {
            j3 = 330;
        } else {
            j3 = 520;
        }
        ValueAnimator valueAnimator3 = this.f52385e0;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        valueAnimator3.setInterpolator(lrVar);
        this.f52385e0.setDuration(j3);
        this.f52385e0.start();
        float f13 = this.f52391w;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f52387f0 = ofFloat2;
        ofFloat2.addUpdateListener(new iz0(this, 3));
        this.f52387f0.addListener(new c30(8, this, z10));
        this.f52387f0.setDuration(((float) j3) * 1.5f);
        this.f52387f0.setInterpolator(lrVar);
        this.f52387f0.start();
    }

    public final void d() {
        if (!this.I) {
            k0 k0Var = this.f52379b;
            if (k0Var.getWidth() > 0) {
                org.telegram.ui.Cells.r1 r1Var = this.P;
                if (r1Var != null) {
                    int[] iArr = new int[2];
                    r1Var.getLocationOnScreen(iArr);
                    int width = k0Var.getWidth();
                    i0.b bVar = this.f52384e;
                    this.G = (iArr[0] - this.f52384e.f15889a) - ((((width - bVar.f15889a) - bVar.f15891c) - this.P.getWidth()) / 2.0f);
                    int height = k0Var.getHeight();
                    i0.b bVar2 = this.f52384e;
                    this.H = org.telegram.messenger.f3.y(((height - bVar2.f15890b) - bVar2.d) - this.P.getHeight(), this.L, 2.0f, iArr[1] - this.f52384e.f15890b);
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
        rz0 rz0Var;
        if (!this.f52382c0) {
            org.telegram.ui.ActionBar.u1 u1Var = this.f52383d0;
            if (u1Var != null) {
                u1Var.dismiss();
                this.f52383d0 = null;
            }
            this.f52382c0 = true;
            hi.m3 m3Var = this.f52393y;
            if (m3Var != null) {
                m3Var.f(true);
            }
            org.telegram.ui.Components.f61 f61Var = this.f52392x;
            if (f61Var != null) {
                f61Var.g0();
                this.f52392x.m0();
                this.f52392x = null;
            }
            if (!this.T && (rz0Var = this.O) != null && rz0Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.bn0 seekBarWaveform = this.O.getSeekBarWaveform();
                seekBarWaveform.L = this.f52390s;
                org.telegram.ui.Cells.r1 r1Var = seekBarWaveform.f33737n;
                if (r1Var != null) {
                    r1Var.invalidate();
                }
            }
            this.I = false;
            d();
            c(false, new oz0(this, 3));
            k0 k0Var = this.f52379b;
            k0Var.invalidate();
            bi.m2 m2Var = this.Z;
            if (m2Var != null) {
                org.telegram.ui.Cells.r1 r1Var2 = this.P;
                if (r1Var2 != null) {
                    r1Var2.f31517ob = true;
                }
                org.telegram.messenger.g0.g3(m2Var);
                this.Z = null;
                org.telegram.ui.Components.mz0 mz0Var = new org.telegram.ui.Components.mz0(this.f52377a, null);
                this.d = mz0Var;
                k0Var.addView(mz0Var, c8.ma.e(-1, -1, 119));
                org.telegram.ui.Components.mz0 mz0Var2 = this.d;
                rz0 rz0Var2 = this.O;
                oz0 oz0Var = new oz0(this, 1);
                org.telegram.ui.Components.kz0 kz0Var = mz0Var2.f37675a;
                if (kz0Var != null) {
                    kz0Var.b(1.5f, rz0Var2, oz0Var);
                    Choreographer.getInstance().postFrameCallback(mz0Var2.f37676b);
                } else {
                    org.telegram.ui.Components.lz0 lz0Var = new org.telegram.ui.Components.lz0(rz0Var2, oz0Var);
                    lz0Var.f37277g = 1.5f;
                    mz0Var2.f37677c.add(lz0Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ws wsVar = this.F;
            if (wsVar != null) {
                PowerManager.WakeLock wakeLock = wsVar.h;
                SensorManager sensorManager = wsVar.f41764a;
                if (wsVar.f41769n) {
                    Sensor sensor = wsVar.f41768f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(wsVar, sensor);
                    }
                    Sensor sensor2 = wsVar.f41767e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(wsVar, sensor2);
                    }
                    Sensor sensor3 = wsVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(wsVar, sensor3);
                    }
                    sensorManager.unregisterListener(wsVar, wsVar.f41766c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    wsVar.f41769n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.O.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f52390s));
            this.O.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f52390s));
            hi.m3 m3Var = this.f52393y;
            if (m3Var != null) {
                m3Var.setTranslationX(org.telegram.messenger.g0.T1(this.G, 0.0f, this.f52390s));
                this.f52393y.setTranslationY(org.telegram.messenger.g0.T1(this.H, this.J, this.f52390s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        org.telegram.messenger.fj fjVar;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.u1 u1Var = this.f52383d0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.f52383d0 = null;
        } else if (!this.f52382c0 && (fjVar = this.N) != null && !fjVar.P3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.M);
            if (this.T) {
                i7 = 2131743355;
            } else {
                i7 = 2131743280;
            }
            String M0 = org.telegram.messenger.gd.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28744a;
            u1Var2.S = M0;
            if (this.T) {
                i10 = 2131743356;
            } else {
                i10 = 2131743281;
            }
            u1Var2.U = org.telegram.messenger.gd.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new qz0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751587, null), new qz0(this, 2));
            this.f52383d0 = u1Var2;
            u1Var2.show();
            TextView textView = (TextView) this.f52383d0.d(-2);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
        k0 k0Var = this.f52379b;
        setContentView(k0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.s2.f26721a;
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
            org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ph(28, this, r1Var), 14.0f);
            this.X = true;
            c(true, null);
            he heVar = this.Y;
            if (heVar != null) {
                org.telegram.messenger.g0.g3(heVar);
                this.Y = null;
            }
            org.telegram.ui.Components.ws wsVar = this.F;
            if (wsVar != null) {
                PowerManager.WakeLock wakeLock = wsVar.h;
                SensorManager sensorManager = wsVar.f41764a;
                if (!wsVar.f41769n) {
                    Sensor sensor = wsVar.f41768f;
                    if (sensor != null) {
                        sensorManager.registerListener(wsVar, sensor, 30000);
                    }
                    Sensor sensor2 = wsVar.f41767e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(wsVar, sensor2, 30000);
                    }
                    Sensor sensor3 = wsVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(wsVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(wsVar, wsVar.f41766c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    wsVar.f41769n = true;
                }
            }
        }
    }
}
