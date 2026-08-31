package sh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import qh.v9;
public final class s0 implements SensorEventListener {
    public long f47671a;
    public float[] f47672b;
    public float[] f47673c;
    public final u0 d;

    public s0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        if (this.f47672b != null && this.f47673c != null) {
            u0 u0Var = this.d;
            if (u0Var.f47714k != null) {
                this.f47671a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f47672b, this.f47673c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.x0 x0Var = u0Var.f47714k;
                        x0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.d;
        v9 v9Var = u0Var.f47720q;
        if (v9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var);
            u0Var.f47720q = null;
        }
        if (!u0Var.f47715l && u0Var.f47714k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f47671a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f47672b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f47673c = sensorEvent.values;
            }
            long j10 = u0Var.h;
            if (currentTimeMillis < j10) {
                v9 v9Var2 = new v9(this, 11);
                u0Var.f47720q = v9Var2;
                AndroidUtilities.runOnUIThread(v9Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
