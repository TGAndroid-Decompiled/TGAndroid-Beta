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
public final class w41 extends Dialog {
    public final org.telegram.ui.Components.et B;
    public float C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
    public float H;
    public org.telegram.ui.ActionBar.f6 I;
    public MessageObject J;
    public u41 K;
    public org.telegram.ui.Cells.s1 L;
    public TextureView M;
    public boolean N;
    public final RectF O;
    public boolean P;
    public float Q;
    public float R;
    public org.telegram.ui.Components.d8 S;
    public boolean T;
    public te U;
    public i5.v V;
    public final r41 W;
    public float X;
    public boolean Y;
    public org.telegram.ui.ActionBar.d2 Z;
    public final Context f39263a;
    public ValueAnimator f39264a0;
    public final n0 f39265b;
    public ValueAnimator f39266b0;
    public final ah.e f39267c;
    public org.telegram.ui.Components.a11 d;
    public i0.b e;
    public Bitmap f39268f;
    public BitmapShader h;
    public Paint f39269n;
    public Matrix f39270r;
    public float f39271s;
    public float v;
    public org.telegram.ui.Components.i71 f39272w;
    public ph.f3 f39273x;
    public TextView f39274y;

    public w41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.e = i0.b.e;
        this.O = new RectF();
        this.Q = 0.0f;
        this.R = 0.0f;
        this.W = new r41(this, 0);
        this.X = 0.0f;
        this.Y = false;
        this.f39263a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        n0 n0Var = new n0(this, activity, 22);
        this.f39265b = n0Var;
        n0Var.setOnClickListener(new s41(this, 0));
        ah.e eVar = new ah.e(this, activity);
        this.f39267c = eVar;
        eVar.setClipToPadding(false);
        n0Var.addView(eVar, k7.b6.e(-1, -1, 119));
        t41 t41Var = new t41(this, 0);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(n0Var, t41Var);
        if (SharedConfig.raiseToListen) {
            this.B = new org.telegram.ui.Components.et();
        }
    }

    public final void c(boolean z4, r41 r41Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f39264a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f39266b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f39271s;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f39264a0 = ofFloat;
        ofFloat.addUpdateListener(new dg.b1(11, this, z4));
        this.f39264a0.addListener(new androidx.fragment.app.g(this, z4, r41Var, 11));
        if (!z4 && this.V == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f39264a0;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        valueAnimator3.setInterpolator(mrVar);
        this.f39264a0.setDuration(j10);
        this.f39264a0.start();
        float f13 = this.v;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f39266b0 = ofFloat2;
        ofFloat2.addUpdateListener(new o11(this, 7));
        this.f39266b0.addListener(new org.telegram.ui.Components.m00(29, this, z4));
        this.f39266b0.setDuration(((float) j10) * 1.5f);
        this.f39266b0.setInterpolator(mrVar);
        this.f39266b0.start();
    }

    public final void d() {
        if (!this.E) {
            n0 n0Var = this.f39265b;
            if (n0Var.getWidth() > 0) {
                org.telegram.ui.Cells.s1 s1Var = this.L;
                if (s1Var != null) {
                    int[] iArr = new int[2];
                    s1Var.getLocationOnScreen(iArr);
                    int width = n0Var.getWidth();
                    i0.b bVar = this.e;
                    this.C = (iArr[0] - this.e.f7196a) - ((((width - bVar.f7196a) - bVar.f7198c) - this.L.getWidth()) / 2.0f);
                    int height = n0Var.getHeight();
                    i0.b bVar2 = this.e;
                    this.D = org.telegram.messenger.y3.a(((height - bVar2.f7197b) - bVar2.d) - this.L.getHeight(), this.H, 2.0f, iArr[1] - this.e.f7197b);
                    if (!this.G) {
                        this.G = true;
                        float clamp = (Utilities.clamp((this.L.getHeight() / 2.0f) + iArr[1], n0Var.getHeight() * 0.7f, n0Var.getHeight() * 0.3f) - (this.L.getHeight() / 2.0f)) - ((n0Var.getHeight() - this.L.getHeight()) / 2.0f);
                        this.F = clamp;
                        if (this.P) {
                            this.F = 0.0f;
                        } else {
                            this.F = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
                        }
                    }
                    e();
                } else {
                    this.D = 0.0f;
                    this.C = 0.0f;
                }
                this.E = true;
            }
        }
    }

    @Override
    public final void dismiss() {
        u41 u41Var;
        if (!this.Y) {
            org.telegram.ui.ActionBar.d2 d2Var = this.Z;
            if (d2Var != null) {
                d2Var.dismiss();
                this.Z = null;
            }
            this.Y = true;
            ph.f3 f3Var = this.f39273x;
            if (f3Var != null) {
                f3Var.e(true);
            }
            org.telegram.ui.Components.i71 i71Var = this.f39272w;
            if (i71Var != null) {
                i71Var.B();
                this.f39272w.H();
                this.f39272w = null;
            }
            if (!this.P && (u41Var = this.K) != null && u41Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.lo0 seekBarWaveform = this.K.getSeekBarWaveform();
                seekBarWaveform.L = this.f39271s;
                org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f26820n;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
            }
            this.E = false;
            d();
            c(false, new r41(this, 3));
            n0 n0Var = this.f39265b;
            n0Var.invalidate();
            i5.v vVar = this.V;
            if (vVar != null) {
                org.telegram.ui.Cells.s1 s1Var2 = this.L;
                if (s1Var2 != null) {
                    s1Var2.f21945cd = true;
                }
                AndroidUtilities.runOnUIThread(vVar);
                this.V = null;
                org.telegram.ui.Components.a11 a11Var = new org.telegram.ui.Components.a11(this.f39263a, null);
                this.d = a11Var;
                n0Var.addView(a11Var, k7.b6.e(-1, -1, 119));
                org.telegram.ui.Components.a11 a11Var2 = this.d;
                u41 u41Var2 = this.K;
                r41 r41Var = new r41(this, 1);
                org.telegram.ui.Components.y01 y01Var = a11Var2.f23282a;
                if (y01Var != null) {
                    y01Var.e(u41Var2, 1.5f, r41Var);
                    Choreographer.getInstance().postFrameCallback(a11Var2.f23283b);
                } else {
                    org.telegram.ui.Components.z01 z01Var = new org.telegram.ui.Components.z01(u41Var2, r41Var);
                    z01Var.f31220g = 1.5f;
                    a11Var2.f23284c.add(z01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.et etVar = this.B;
            if (etVar != null) {
                PowerManager.WakeLock wakeLock = etVar.h;
                SensorManager sensorManager = etVar.f24682a;
                if (etVar.f24686n) {
                    Sensor sensor = etVar.f24685f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(etVar, sensor);
                    }
                    Sensor sensor2 = etVar.e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(etVar, sensor2);
                    }
                    Sensor sensor3 = etVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(etVar, sensor3);
                    }
                    sensorManager.unregisterListener(etVar, etVar.f24684c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    etVar.f24686n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.K.setTranslationX(AndroidUtilities.lerp(this.C, 0.0f, this.f39271s));
            this.K.setTranslationY(AndroidUtilities.lerp(this.D, this.F, this.f39271s));
            ph.f3 f3Var = this.f39273x;
            if (f3Var != null) {
                f3Var.setTranslationX(AndroidUtilities.lerp(this.C, 0.0f, this.f39271s));
                this.f39273x.setTranslationY(AndroidUtilities.lerp(this.D, this.F, this.f39271s));
            }
        }
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d2 d2Var = this.Z;
        if (d2Var != null) {
            d2Var.dismiss();
            this.Z = null;
        } else if (!this.Y && (messageObject = this.J) != null && !messageObject.isOutOwner()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.I);
            if (this.P) {
                i10 = R.string.VideoOnceCloseTitle;
            } else {
                i10 = R.string.VoiceOnceCloseTitle;
            }
            alertDialog$Builder.f19478a.O = LocaleController.getString(i10);
            if (this.P) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f19478a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new t41(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new t41(this, 2));
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f19478a;
            this.Z = d2Var2;
            d2Var2.show();
            TextView textView = (TextView) this.Z.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
        n0 n0Var = this.f39265b;
        setContentView(n0Var, layoutParams);
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
        n0Var.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(n0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.s1 s1Var = this.L;
            if (s1Var != null) {
                s1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.vk(25, this, s1Var), 14.0f);
            this.T = true;
            c(true, null);
            te teVar = this.U;
            if (teVar != null) {
                AndroidUtilities.runOnUIThread(teVar);
                this.U = null;
            }
            org.telegram.ui.Components.et etVar = this.B;
            if (etVar != null) {
                PowerManager.WakeLock wakeLock = etVar.h;
                SensorManager sensorManager = etVar.f24682a;
                if (!etVar.f24686n) {
                    Sensor sensor = etVar.f24685f;
                    if (sensor != null) {
                        sensorManager.registerListener(etVar, sensor, 30000);
                    }
                    Sensor sensor2 = etVar.e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(etVar, sensor2, 30000);
                    }
                    Sensor sensor3 = etVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(etVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(etVar, etVar.f24684c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    etVar.f24686n = true;
                }
            }
        }
    }
}
