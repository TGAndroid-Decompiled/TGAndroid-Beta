package ph;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class v0 extends CameraView {
    public static final int[] U = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public float G;
    public long H;
    public final Matrix I;
    public u0 J;
    public u0 K;
    public final float[] L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public final float[] R;
    public float[] S;
    public float[] T;
    public boolean f42456a;
    public final PointF f42457b;
    public final PointF f42458c;
    public float d;
    public double e;
    public boolean f42459f;
    public boolean h;
    public final Matrix f42460n;
    public final Matrix f42461r;
    public boolean f42462s;
    public float v;
    public boolean f42463w;
    public final Matrix f42464x;
    public final Matrix f42465y;

    public v0(Context context, boolean z4) {
        super(context, z4, false);
        this.f42457b = new PointF();
        this.f42458c = new PointF();
        this.f42460n = new Matrix();
        this.f42461r = new Matrix();
        this.f42464x = new Matrix();
        this.f42465y = new Matrix();
        this.B = true;
        this.I = new Matrix();
        this.L = new float[2];
        new Matrix();
        this.R = new float[2];
        this.f42456a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = MessagesController.getGlobalMainSettings().getString("dualmatrix", null);
        if (string == null) {
            return null;
        }
        String[] split = string.split(";");
        if (split.length != 9) {
            return null;
        }
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                fArr[i10] = Float.parseFloat(split[i10]);
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static boolean p(Context context, boolean z4) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        boolean z12 = true;
        if (SharedConfig.getDevicePerformanceClass() >= 1 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && z4) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                while (true) {
                    if (i10 < 32) {
                        if (U[i10] == hashCode) {
                            break;
                        }
                        i10++;
                    } else {
                        z12 = z11;
                        break;
                    }
                }
                if (!z12) {
                    (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
                }
                return z12;
            }
            return z11;
        }
        return z10;
    }

    public static boolean q(Context context) {
        return MessagesController.getGlobalMainSettings().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z4) {
        int i10 = 0;
        boolean p10 = p(ApplicationLoader.applicationContext, false);
        if (MessagesController.getInstance(UserConfig.selectedAccount).collectDeviceStats) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                if (p10) {
                    i10 = 2;
                }
                tL_inputAppEvent.peer = (z4 ? 1 : 0) | i10;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new nh.p5(18));
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z4, p10);
    }

    @Override
    public final void destroy(boolean z4, Runnable runnable) {
        v();
        super.destroy(z4, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i10;
        v();
        if (this.E) {
            i9 i9Var = (i9) this;
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o0(i9Var, 28), 340L);
            }
            da daVar = i9Var.V;
            daVar.C0.setValue(i9Var.isDual());
            qa qaVar = daVar.C0;
            if (i9Var.isDual()) {
                i10 = R.string.AccDescrDualCameraOn;
            } else {
                i10 = R.string.AccDescrDualCameraOff;
            }
            qaVar.setContentDescription(LocaleController.getString(i10));
        }
        t(true);
    }

    @Override
    public final void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                this.f42456a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DualErrorTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DualErrorMessage);
                kh.a2.C(R.string.OK, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
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
        Matrix matrix = this.f42464x;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.f42465y);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.B) {
            if (q(getContext()) && MessagesController.getGlobalMainSettings().getBoolean("dualcam", p(ApplicationLoader.applicationContext, false))) {
                this.E = true;
                w();
                this.dual = true;
            }
            this.B = false;
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
        float[] fArr = this.L;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.M = fArr[0];
        this.N = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.O = (float) Math.toDegrees(Math.atan2(fArr[1] - this.N, fArr[0] - this.M));
        this.P = k7.n6.a(this.M, this.N, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.Q = k7.n6.a(this.M, this.N, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        float f12;
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.R;
        fArr[0] = f10;
        fArr[1] = f11;
        this.f42465y.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.I;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        if (dualShape != 0 && dualShape != 1 && dualShape != 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.5625f;
        }
        float f13 = fArr[0];
        if (f13 >= -1.0f && f13 <= 1.0f) {
            float f14 = fArr[1];
            if (f14 >= (-f12) && f14 <= f12) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void toggleDual() {
        if (!isDual() && !this.f42456a) {
            return;
        }
        if (!isDual()) {
            w();
        } else {
            MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public abstract void u(boolean z4);

    public final void v() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb = new StringBuilder(108);
            sb.append(fArr[0]);
            for (int i10 = 1; i10 < 9; i10++) {
                sb.append(";");
                sb.append(fArr[i10]);
            }
            edit.putString("dualmatrix", sb.toString());
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
            dualPosition.postConcat(this.f42464x);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.f42465y);
        }
        updateDualPosition();
    }

    public final boolean x(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: ph.v0.x(android.view.MotionEvent):boolean");
    }
}
