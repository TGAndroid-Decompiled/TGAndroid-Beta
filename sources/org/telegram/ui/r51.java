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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r51 extends Dialog {
    public final org.telegram.ui.Components.wt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.c6 L;
    public MessageObject M;
    public p51 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.n8 V;
    public boolean W;
    public bf X;
    public a3.i0 Y;
    public final m51 Z;
    public final Context f39289a;
    public float f39290a0;
    public final l0 f39291b;
    public boolean f39292b0;
    public final ah.v f39293c;
    public org.telegram.ui.ActionBar.a2 f39294c0;
    public org.telegram.ui.Components.z11 d;
    public ValueAnimator f39295d0;
    public i0.b e;
    public ValueAnimator f39296e0;
    public Bitmap f39297f;
    public BitmapShader h;
    public Paint f39298n;
    public Matrix f39299r;
    public float f39300s;
    public float v;
    public org.telegram.ui.Components.i81 f39301w;
    public di.d4 f39302x;
    public TextView f39303y;

    public r51(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new m51(this, 0);
        this.f39290a0 = 0.0f;
        this.f39292b0 = false;
        this.f39289a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        l0 l0Var = new l0(this, activity, 22);
        this.f39291b = l0Var;
        l0Var.setOnClickListener(new n51(this, 0));
        ah.v vVar = new ah.v(this, activity);
        this.f39293c = vVar;
        vVar.setClipToPadding(false);
        l0Var.addView(vVar, w7.z5.e(-1, -1, 119));
        o51 o51Var = new o51(this, 0);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(l0Var, o51Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.wt();
        }
    }

    public final void c(boolean z10, m51 m51Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f39295d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39296e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f39300s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f39295d0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(11, this, z10));
        this.f39295d0.addListener(new ah.q0(this, z10, m51Var, 11));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39295d0;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        valueAnimator3.setInterpolator(esVar);
        this.f39295d0.setDuration(j10);
        this.f39295d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f39296e0 = ofFloat2;
        ofFloat2.addUpdateListener(new f21(this, 7));
        this.f39296e0.addListener(new i50(8, this, z10));
        this.f39296e0.setDuration(((float) j10) * 1.5f);
        this.f39296e0.setInterpolator(esVar);
        this.f39296e0.start();
    }

    public final void d() {
        if (!this.H) {
            l0 l0Var = this.f39291b;
            if (l0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = l0Var.getWidth();
                    i0.b bVar = this.e;
                    this.F = (iArr[0] - this.e.f10892a) - ((((width - bVar.f10892a) - bVar.f10894c) - this.O.getWidth()) / 2.0f);
                    int height = l0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.G = org.telegram.messenger.g0.x(((height - bVar2.f10893b) - bVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f10893b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.O.getHeight()) / 2.0f);
                        this.I = clamp;
                        if (this.S) {
                            this.I = 0.0f;
                        } else {
                            this.I = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
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
        p51 p51Var;
        if (!this.f39292b0) {
            org.telegram.ui.ActionBar.a2 a2Var = this.f39294c0;
            if (a2Var != null) {
                a2Var.dismiss();
                this.f39294c0 = null;
            }
            this.f39292b0 = true;
            di.d4 d4Var = this.f39302x;
            if (d4Var != null) {
                d4Var.e(true);
            }
            org.telegram.ui.Components.i81 i81Var = this.f39301w;
            if (i81Var != null) {
                i81Var.B();
                this.f39301w.H();
                this.f39301w = null;
            }
            if (!this.S && (p51Var = this.N) != null && p51Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.jp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f39300s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f26108n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new m51(this, 3));
            l0 l0Var = this.f39291b;
            l0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f21929fd = true;
                }
                AndroidUtilities.runOnUIThread(i0Var);
                this.Y = null;
                org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(this.f39289a, null);
                this.d = z11Var;
                l0Var.addView(z11Var, w7.z5.e(-1, -1, 119));
                org.telegram.ui.Components.z11 z11Var2 = this.d;
                p51 p51Var2 = this.N;
                m51 m51Var = new m51(this, 1);
                org.telegram.ui.Components.x11 x11Var = z11Var2.f31424a;
                if (x11Var != null) {
                    x11Var.d(p51Var2, 1.5f, m51Var);
                    Choreographer.getInstance().postFrameCallback(z11Var2.f31425b);
                } else {
                    org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(p51Var2, m51Var);
                    y11Var.f31115g = 1.5f;
                    z11Var2.f31426c.add(y11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.wt wtVar = this.E;
            if (wtVar != null) {
                PowerManager.WakeLock wakeLock = wtVar.h;
                SensorManager sensorManager = wtVar.f30655a;
                if (wtVar.f30659n) {
                    Sensor sensor = wtVar.f30658f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(wtVar, sensor);
                    }
                    Sensor sensor2 = wtVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(wtVar, sensor2);
                    }
                    Sensor sensor3 = wtVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(wtVar, sensor3);
                    }
                    sensorManager.unregisterListener(wtVar, wtVar.f30657c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    wtVar.f30659n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f39300s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f39300s));
            di.d4 d4Var = this.f39302x;
            if (d4Var != null) {
                d4Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f39300s));
                this.f39302x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f39300s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a2 a2Var = this.f39294c0;
        if (a2Var != null) {
            a2Var.dismiss();
            this.f39294c0 = null;
        } else if (!this.f39292b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f19248a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f19248a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new o51(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new o51(this, 2));
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
            this.f39294c0 = a2Var2;
            a2Var2.show();
            TextView textView = (TextView) this.f39294c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
            }
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        l0 l0Var = this.f39291b;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(l0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new mt(16, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            bf bfVar = this.X;
            if (bfVar != null) {
                AndroidUtilities.runOnUIThread(bfVar);
                this.X = null;
            }
            org.telegram.ui.Components.wt wtVar = this.E;
            if (wtVar != null) {
                PowerManager.WakeLock wakeLock = wtVar.h;
                SensorManager sensorManager = wtVar.f30655a;
                if (!wtVar.f30659n) {
                    Sensor sensor = wtVar.f30658f;
                    if (sensor != null) {
                        sensorManager.registerListener(wtVar, sensor, 30000);
                    }
                    Sensor sensor2 = wtVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(wtVar, sensor2, 30000);
                    }
                    Sensor sensor3 = wtVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(wtVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(wtVar, wtVar.f30657c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    wtVar.f30659n = true;
                }
            }
        }
    }
}
