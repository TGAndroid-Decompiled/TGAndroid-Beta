package vh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class u0 extends CameraView {
    public static final int[] f51982a0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public long K;
    public final Matrix L;
    public t0 M;
    public t0 N;
    public final float[] O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final float[] U;
    public float[] V;
    public float[] W;
    public boolean f51983a;
    public final PointF f51984b;
    public final PointF f51985c;
    public float d;
    public double e;
    public boolean f51986f;
    public boolean h;
    public final Matrix f51987n;
    public final Matrix f51988r;
    public boolean f51989s;
    public float f51990w;
    public boolean f51991x;
    public final Matrix f51992y;

    public u0(Context context, boolean z10) {
        super(context, z10, false);
        this.f51984b = new PointF();
        this.f51985c = new PointF();
        this.f51987n = new Matrix();
        this.f51988r = new Matrix();
        this.f51992y = new Matrix();
        this.D = new Matrix();
        this.E = true;
        this.L = new Matrix();
        this.O = new float[2];
        new Matrix();
        this.U = new float[2];
        this.f51983a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = vp.d1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i10 = 0; i10 < split.length; i10++) {
                    try {
                        fArr[i10] = Float.parseFloat(split[i10]);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return null;
                    }
                }
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                return matrix;
            }
        }
        return null;
    }

    public static boolean p(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        int i10 = 0;
        boolean z13 = true;
        if (tz.o() >= 1 && Camera.getNumberOfCameras() > 1 && tz.b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && z10) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                while (true) {
                    if (i10 < 32) {
                        if (f51982a0[i10] == hashCode) {
                            break;
                        }
                        i10++;
                    } else {
                        z13 = z12;
                        break;
                    }
                }
                if (!z13) {
                    (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
                }
                return z13;
            }
            return z12;
        }
        return z11;
    }

    public static boolean q(Context context) {
        return vp.d1().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        int i10 = 0;
        boolean p5 = p(org.telegram.messenger.w0.f19025b, false);
        if (vp.r1(d20.f15147s0).I3) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(d20.f15147s0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                if (p5) {
                    i10 = 2;
                }
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | i10;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(d20.f15147s0).sendRequest(tL_help_saveAppLog, new ag.c3(28));
            } catch (Exception unused) {
            }
        }
        org.telegram.messenger.w0.f19024a.getClass();
    }

    @Override
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i10;
        v();
        if (this.H) {
            t7 t7Var = (t7) this;
            if (vp.d1().getInt("storysvddualhint", 0) < 2) {
                org.telegram.messenger.i0.h3(new d0(t7Var, 18), 340L);
            }
            o8 o8Var = t7Var.f51981b0;
            o8Var.F0.setValue(t7Var.isDual());
            b9 b9Var = o8Var.F0;
            if (t7Var.isDual()) {
                i10 = 2131754886;
            } else {
                i10 = 2131754887;
            }
            b9Var.setContentDescription(cd.L0(i10, null));
        }
        t(true);
    }

    @Override
    public final void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = vp.d1().edit();
                this.f51983a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String L0 = cd.L0(2131751341, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131751342, null);
                i0.a.w(null, 2131747847, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        vp.d1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) {
            return x(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Matrix matrix = this.f51992y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.D);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.E) {
            if (q(getContext()) && vp.d1().getBoolean("dualcam", p(org.telegram.messenger.w0.f19025b, false))) {
                this.H = true;
                w();
                this.dual = true;
            }
            this.E = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean x10 = x(motionEvent);
        if (!super.onTouchEvent(motionEvent) && !x10) {
            return false;
        }
        return true;
    }

    public final void r(Matrix matrix) {
        float[] fArr = this.O;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.P = fArr[0];
        this.Q = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.R = (float) Math.toDegrees(Math.atan2(fArr[1] - this.Q, fArr[0] - this.P));
        this.S = w7.z8.a(this.P, this.Q, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.T = w7.z8.a(this.P, this.Q, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f7, float f10) {
        float f11;
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.U;
        fArr[0] = f7;
        fArr[1] = f10;
        this.D.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.L;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        if (dualShape != 0 && dualShape != 1 && dualShape != 3) {
            f11 = 1.0f;
        } else {
            f11 = 0.5625f;
        }
        float f12 = fArr[0];
        if (f12 >= -1.0f && f12 <= 1.0f) {
            float f13 = fArr[1];
            if (f13 >= (-f11) && f13 <= f11) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void toggleDual() {
        if (!isDual() && !this.f51983a) {
            return;
        }
        if (!isDual()) {
            w();
        } else {
            vp.d1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append(fArr[0]);
            for (int i10 = 1; i10 < 9; i10++) {
                sb2.append(";");
                sb2.append(fArr[i10]);
            }
            edit.putString("dualmatrix", sb2.toString());
        } else {
            edit.remove("dualmatrix");
        }
        edit.apply();
    }

    public final void w() {
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
        } else {
            dualPosition.postConcat(this.f51992y);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.D);
        }
        updateDualPosition();
    }

    public final boolean x(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: vh.u0.x(android.view.MotionEvent):boolean");
    }
}
