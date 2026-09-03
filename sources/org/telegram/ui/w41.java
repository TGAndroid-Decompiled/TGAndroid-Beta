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
    public final org.telegram.ui.Components.ht B;
    public float C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
    public float H;
    public org.telegram.ui.ActionBar.g6 I;
    public MessageObject J;
    public u41 K;
    public org.telegram.ui.Cells.t1 L;
    public TextureView M;
    public boolean N;
    public final RectF O;
    public boolean P;
    public float Q;
    public float R;
    public org.telegram.ui.Components.d8 S;
    public boolean T;
    public re U;
    public i5.v V;
    public final r41 W;
    public float X;
    public boolean Y;
    public org.telegram.ui.ActionBar.d2 Z;
    public final Context f42279a;
    public ValueAnimator f42280a0;
    public final l0 f42281b;
    public ValueAnimator f42282b0;
    public final ag.l f42283c;
    public org.telegram.ui.Components.a11 d;
    public i0.b f42284e;
    public Bitmap f42285f;
    public BitmapShader h;
    public Paint f42286n;
    public Matrix f42287r;
    public float f42288s;
    public float v;
    public org.telegram.ui.Components.j71 f42289w;
    public qh.e3 f42290x;
    public TextView f42291y;

    public w41(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.f42284e = i0.b.f7756e;
        this.O = new RectF();
        this.Q = 0.0f;
        this.R = 0.0f;
        this.W = new r41(this, 0);
        this.X = 0.0f;
        this.Y = false;
        this.f42279a = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        l0 l0Var = new l0(this, activity, 22);
        this.f42281b = l0Var;
        l0Var.setOnClickListener(new s41(this, 0));
        ag.l lVar = new ag.l(this, activity);
        this.f42283c = lVar;
        lVar.setClipToPadding(false);
        l0Var.addView(lVar, k7.c6.e(-1, -1, 119));
        t41 t41Var = new t41(this, 0);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(l0Var, t41Var);
        if (SharedConfig.raiseToListen) {
            this.B = new org.telegram.ui.Components.ht();
        }
    }

    public final void c(boolean z4, r41 r41Var) {
        float f10;
        long j10;
        ValueAnimator valueAnimator = this.f42280a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f42282b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        d();
        float f11 = this.f42288s;
        float f12 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f42280a0 = ofFloat;
        ofFloat.addUpdateListener(new eg.z0(11, this, z4));
        this.f42280a0.addListener(new androidx.fragment.app.g(this, z4, r41Var, 11));
        if (!z4 && this.V == null) {
            j10 = 330;
        } else {
            j10 = 520;
        }
        ValueAnimator valueAnimator3 = this.f42280a0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        valueAnimator3.setInterpolator(prVar);
        this.f42280a0.setDuration(j10);
        this.f42280a0.start();
        float f13 = this.v;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f13, f12);
        this.f42282b0 = ofFloat2;
        ofFloat2.addUpdateListener(new n11(this, 7));
        this.f42282b0.addListener(new org.telegram.ui.Components.x20(27, this, z4));
        this.f42282b0.setDuration(((float) j10) * 1.5f);
        this.f42282b0.setInterpolator(prVar);
        this.f42282b0.start();
    }

    public final void d() {
        if (!this.E) {
            l0 l0Var = this.f42281b;
            if (l0Var.getWidth() > 0) {
                org.telegram.ui.Cells.t1 t1Var = this.L;
                if (t1Var != null) {
                    int[] iArr = new int[2];
                    t1Var.getLocationOnScreen(iArr);
                    int width = l0Var.getWidth();
                    i0.b bVar = this.f42284e;
                    this.C = (iArr[0] - this.f42284e.f7757a) - ((((width - bVar.f7757a) - bVar.f7759c) - this.L.getWidth()) / 2.0f);
                    int height = l0Var.getHeight();
                    i0.b bVar2 = this.f42284e;
                    this.D = org.telegram.messenger.y3.a(((height - bVar2.f7758b) - bVar2.d) - this.L.getHeight(), this.H, 2.0f, iArr[1] - this.f42284e.f7758b);
                    if (!this.G) {
                        this.G = true;
                        float clamp = (Utilities.clamp((this.L.getHeight() / 2.0f) + iArr[1], l0Var.getHeight() * 0.7f, l0Var.getHeight() * 0.3f) - (this.L.getHeight() / 2.0f)) - ((l0Var.getHeight() - this.L.getHeight()) / 2.0f);
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
            qh.e3 e3Var = this.f42290x;
            if (e3Var != null) {
                e3Var.e(true);
            }
            org.telegram.ui.Components.j71 j71Var = this.f42289w;
            if (j71Var != null) {
                j71Var.B();
                this.f42289w.H();
                this.f42289w = null;
            }
            if (!this.P && (u41Var = this.K) != null && u41Var.getSeekBarWaveform() != null) {
                org.telegram.ui.Components.mo0 seekBarWaveform = this.K.getSeekBarWaveform();
                seekBarWaveform.L = this.f42288s;
                org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f29196n;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
            }
            this.E = false;
            d();
            c(false, new r41(this, 3));
            l0 l0Var = this.f42281b;
            l0Var.invalidate();
            i5.v vVar = this.V;
            if (vVar != null) {
                org.telegram.ui.Cells.t1 t1Var2 = this.L;
                if (t1Var2 != null) {
                    t1Var2.f23810cd = true;
                }
                AndroidUtilities.runOnUIThread(vVar);
                this.V = null;
                org.telegram.ui.Components.a11 a11Var = new org.telegram.ui.Components.a11(this.f42279a, null);
                this.d = a11Var;
                l0Var.addView(a11Var, k7.c6.e(-1, -1, 119));
                org.telegram.ui.Components.a11 a11Var2 = this.d;
                u41 u41Var2 = this.K;
                r41 r41Var = new r41(this, 1);
                org.telegram.ui.Components.y01 y01Var = a11Var2.f25119a;
                if (y01Var != null) {
                    y01Var.e(u41Var2, 1.5f, r41Var);
                    Choreographer.getInstance().postFrameCallback(a11Var2.f25120b);
                } else {
                    org.telegram.ui.Components.z01 z01Var = new org.telegram.ui.Components.z01(u41Var2, r41Var);
                    z01Var.f33724g = 1.5f;
                    a11Var2.f25121c.add(z01Var);
                }
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags |= 16;
                getWindow().setAttributes(attributes);
            }
            org.telegram.ui.Components.ht htVar = this.B;
            if (htVar != null) {
                PowerManager.WakeLock wakeLock = htVar.h;
                SensorManager sensorManager = htVar.f27613a;
                if (htVar.f27618n) {
                    Sensor sensor = htVar.f27617f;
                    if (sensor != null) {
                        sensorManager.unregisterListener(htVar, sensor);
                    }
                    Sensor sensor2 = htVar.f27616e;
                    if (sensor2 != null) {
                        sensorManager.unregisterListener(htVar, sensor2);
                    }
                    Sensor sensor3 = htVar.d;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(htVar, sensor3);
                    }
                    sensorManager.unregisterListener(htVar, htVar.f27615c);
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                    htVar.f27618n = false;
                }
            }
        }
    }

    public final void e() {
        if (this.d == null) {
            this.K.setTranslationX(AndroidUtilities.lerp(this.C, 0.0f, this.f42288s));
            this.K.setTranslationY(AndroidUtilities.lerp(this.D, this.F, this.f42288s));
            qh.e3 e3Var = this.f42290x;
            if (e3Var != null) {
                e3Var.setTranslationX(AndroidUtilities.lerp(this.C, 0.0f, this.f42288s));
                this.f42290x.setTranslationY(AndroidUtilities.lerp(this.D, this.F, this.f42288s));
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
            alertDialog$Builder.f21168a.O = LocaleController.getString(i10);
            if (this.P) {
                i11 = R.string.VideoOnceCloseMessage;
            } else {
                i11 = R.string.VoiceOnceCloseMessage;
            }
            alertDialog$Builder.f21168a.Q = LocaleController.getString(i11);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new t41(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new t41(this, 2));
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21168a;
            this.Z = d2Var2;
            d2Var2.show();
            TextView textView = (TextView) this.Z.d(-2);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
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
        l0 l0Var = this.f42281b;
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
        AndroidUtilities.setLightNavigationBar(l0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            org.telegram.ui.Cells.t1 t1Var = this.L;
            if (t1Var != null) {
                t1Var.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.xk(25, this, t1Var), 14.0f);
            this.T = true;
            c(true, null);
            re reVar = this.U;
            if (reVar != null) {
                AndroidUtilities.runOnUIThread(reVar);
                this.U = null;
            }
            org.telegram.ui.Components.ht htVar = this.B;
            if (htVar != null) {
                PowerManager.WakeLock wakeLock = htVar.h;
                SensorManager sensorManager = htVar.f27613a;
                if (!htVar.f27618n) {
                    Sensor sensor = htVar.f27617f;
                    if (sensor != null) {
                        sensorManager.registerListener(htVar, sensor, 30000);
                    }
                    Sensor sensor2 = htVar.f27616e;
                    if (sensor2 != null) {
                        sensorManager.registerListener(htVar, sensor2, 30000);
                    }
                    Sensor sensor3 = htVar.d;
                    if (sensor3 != null) {
                        sensorManager.registerListener(htVar, sensor3, 30000);
                    }
                    sensorManager.registerListener(htVar, htVar.f27615c, 3);
                    if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                        wakeLock.acquire();
                    }
                    htVar.f27618n = true;
                }
            }
        }
    }
}
