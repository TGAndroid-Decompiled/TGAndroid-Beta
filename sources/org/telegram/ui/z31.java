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
public final class z31 extends Dialog {
    public final org.telegram.ui.Components.rt E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public org.telegram.ui.ActionBar.d6 L;
    public MessageObject M;
    public x31 N;
    public org.telegram.ui.Cells.u1 O;
    public TextureView P;
    public boolean Q;
    public final RectF R;
    public boolean S;
    public float T;
    public float U;
    public org.telegram.ui.Components.l8 V;
    public boolean W;
    public ue X;
    public a3.i0 Y;
    public final u31 Z;
    public final Context f43540a;
    public float f43541a0;
    public final m0 f43542b;
    public boolean f43543b0;
    public final ah.v f43544c;
    public org.telegram.ui.ActionBar.b2 f43545c0;
    public org.telegram.ui.Components.t11 d;
    public ValueAnimator f43546d0;
    public i0.c e;
    public ValueAnimator f43547e0;
    public Bitmap f43548f;
    public BitmapShader h;
    public Paint f43549n;
    public Matrix f43550r;
    public float f43551s;
    public float v;
    public org.telegram.ui.Components.a81 f43552w;
    public ei.x3 f43553x;
    public TextView f43554y;

    public z31(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.c.e;
        this.R = new RectF();
        this.T = 0.0f;
        this.U = 0.0f;
        this.Z = new u31(this, 0);
        this.f43541a0 = 0.0f;
        this.f43543b0 = false;
        this.f43540a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        m0 m0Var = new m0(this, activity, 22);
        this.f43542b = m0Var;
        m0Var.setOnClickListener(new v31(this, 0));
        ah.v vVar = new ah.v(this, activity);
        this.f43544c = vVar;
        vVar.setClipToPadding(false);
        m0Var.addView(vVar, w7.z5.e(-1, -1, 119));
        w31 w31Var = new w31(this, 0);
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.a0.i(m0Var, w31Var);
        if (SharedConfig.raiseToListen) {
            this.E = new org.telegram.ui.Components.rt();
        }
    }

    public final void c(boolean z10, u31 u31Var) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = this.f43546d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f43547e0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f10 = this.f43551s;
        float f11 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f43546d0 = ofFloat;
        ofFloat.addUpdateListener(new ah.k0(11, this, z10));
        this.f43546d0.addListener(new ah.q0(this, z10, u31Var, 11));
        if (!z10 && this.Y == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f43546d0;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        valueAnimator3.setInterpolator(bsVar);
        this.f43546d0.setDuration(j10);
        this.f43546d0.start();
        float f12 = this.v;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, f11);
        this.f43547e0 = ofFloat2;
        ofFloat2.addUpdateListener(new e11(this, 5));
        this.f43547e0.addListener(new n40(8, this, z10));
        this.f43547e0.setDuration(((float) j10) * 1.5f);
        this.f43547e0.setInterpolator(bsVar);
        this.f43547e0.start();
    }

    public final void d() {
        if (!this.H) {
            m0 m0Var = this.f43542b;
            if (m0Var.getWidth() > 0) {
                org.telegram.ui.Cells.u1 u1Var = this.O;
                if (u1Var != null) {
                    int[] iArr = new int[2];
                    u1Var.getLocationOnScreen(iArr);
                    int width = m0Var.getWidth();
                    i0.c cVar = this.e;
                    this.F = (iArr[0] - this.e.f12284a) - ((((width - cVar.f12284a) - cVar.f12286c) - this.O.getWidth()) / 2.0f);
                    int height = m0Var.getHeight();
                    i0.c cVar2 = this.e;
                    this.G = org.telegram.messenger.q.x(((height - cVar2.f12285b) - cVar2.d) - this.O.getHeight(), this.K, 2.0f, iArr[1] - this.e.f12285b);
                    if (!this.J) {
                        this.J = true;
                        float clamp = (Utilities.clamp((this.O.getHeight() / 2.0f) + iArr[1], m0Var.getHeight() * 0.7f, m0Var.getHeight() * 0.3f) - (this.O.getHeight() / 2.0f)) - ((m0Var.getHeight() - this.O.getHeight()) / 2.0f);
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
        x31 x31Var;
        if (!this.f43543b0) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f43545c0;
            if (b2Var != null) {
                b2Var.dismiss();
                this.f43545c0 = null;
            }
            this.f43543b0 = true;
            ei.x3 x3Var = this.f43553x;
            if (x3Var != null) {
                x3Var.e(true);
            }
            org.telegram.ui.Components.a81 a81Var = this.f43552w;
            if (a81Var != null) {
                a81Var.B();
                this.f43552w.H();
                this.f43552w = null;
            }
            if (!this.S && (x31Var = this.N) != null && x31Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.fp0 seekBarWaveform = this.N.getSeekBarWaveform();
                seekBarWaveform.L = this.f43551s;
                org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f26342n;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            this.H = false;
            d();
            c(false, new u31(this, 3));
            m0 m0Var = this.f43542b;
            m0Var.invalidate();
            a3.i0 i0Var = this.Y;
            if (i0Var != null) {
                org.telegram.ui.Cells.u1 u1Var2 = this.O;
                if (u1Var2 != null) {
                    u1Var2.f23293fd = true;
                }
                AndroidUtilities.runOnUIThread(i0Var);
                this.Y = null;
                org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(this.f43540a, null);
                this.d = t11Var;
                m0Var.addView(t11Var, w7.z5.e(-1, -1, 119));
                org.telegram.ui.Components.t11 t11Var2 = this.d;
                x31 x31Var2 = this.N;
                u31 u31Var = new u31(this, 1);
                org.telegram.ui.Components.r11 r11Var = t11Var2.f30430a;
                if (r11Var != null) {
                    r11Var.d(x31Var2, 1.5f, u31Var);
                    Choreographer.getInstance().postFrameCallback(t11Var2.f30431b);
                } else {
                    org.telegram.ui.Components.s11 s11Var = new org.telegram.ui.Components.s11(x31Var2, u31Var);
                    s11Var.f30144g = 1.5f;
                    t11Var2.f30432c.add(s11Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.rt rtVar = this.E;
            if (rtVar != null) {
                PowerManager.WakeLock wakeLock = rtVar.h;
                SensorManager sensorManager = rtVar.f30039a;
                if (rtVar.f30043n) {
                    Sensor sensor = rtVar.f30042f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(rtVar, sensor);
                    }
                    Sensor sensor2 = rtVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(rtVar, sensor2);
                    }
                    Sensor sensor3 = rtVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(rtVar, sensor3);
                    }
                    sensorManager.unregisterListener(rtVar, rtVar.f30041c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    rtVar.f30043n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.N.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f43551s));
            this.N.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f43551s));
            ei.x3 x3Var = this.f43553x;
            if (x3Var != null) {
                x3Var.setTranslationX(AndroidUtilities.lerp(this.F, 0.0f, this.f43551s));
                this.f43553x.setTranslationY(AndroidUtilities.lerp(this.G, this.I, this.f43551s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b2 b2Var = this.f43545c0;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f43545c0 = null;
        } else if (!this.f43543b0 && (messageObject = this.M) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.L);
            if (this.S) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f20601a.R = LocaleController.getString(i10);
            if (this.S) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f20601a.T = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new w31(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new w31(this, 2));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20601a;
            this.f43545c0 = b2Var2;
            b2Var2.show();
            TextView textView = (TextView) this.f43545c0.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
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
        m0 m0Var = this.f43542b;
        setContentView(m0Var, layoutParams);
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
        m0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(m0Var, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.u1 u1Var = this.O;
            if (u1Var != null) {
                u1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.qy(22, this, u1Var), 14.0f);
            this.W = true;
            c(true, null);
            ue ueVar = this.X;
            if (ueVar != null) {
                AndroidUtilities.runOnUIThread(ueVar);
                this.X = null;
            }
            org.telegram.ui.Components.rt rtVar = this.E;
            if (rtVar != null) {
                PowerManager.WakeLock wakeLock = rtVar.h;
                SensorManager sensorManager = rtVar.f30039a;
                if (!rtVar.f30043n) {
                    Sensor sensor = rtVar.f30042f;
                    if (sensor != null) {
                        sensorManager.registerListener(rtVar, sensor, 30000);
                    }
                    Sensor sensor2 = rtVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(rtVar, sensor2, 30000);
                    }
                    Sensor sensor3 = rtVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(rtVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(rtVar, rtVar.f30041c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    rtVar.f30043n = true;
                }
            }
        }
    }
}
