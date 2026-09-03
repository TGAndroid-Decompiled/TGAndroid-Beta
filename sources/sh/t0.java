package sh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import qh.u9;
public final class t0 implements SensorEventListener {
    public long f47724a;
    public float[] f47725b;
    public float[] f47726c;
    public float[] d;
    public final u0 f47727e;

    public t0(u0 u0Var) {
        this.f47727e = u0Var;
    }

    public final void a() {
        if (this.f47725b != null) {
            u0 u0Var = this.f47727e;
            if (u0Var.f47750k != null) {
                this.f47724a = System.currentTimeMillis();
                if (this.f47726c == null) {
                    this.f47726c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f47725b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f47726c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f47726c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f47726c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    org.telegram.ui.web.x0 x0Var = u0Var.f47750k;
                    x0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.f47727e;
        u9 u9Var = u0Var.f47758s;
        if (u9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var);
            u0Var.f47758s = null;
        }
        if (!u0Var.f47751l && u0Var.f47750k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f47724a;
            long j10 = u0Var.f47749j;
            if (currentTimeMillis < j10) {
                u9 u9Var2 = new u9(this, 12);
                u0Var.f47758s = u9Var2;
                AndroidUtilities.runOnUIThread(u9Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f47725b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
