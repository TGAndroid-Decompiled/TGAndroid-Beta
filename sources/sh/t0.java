package sh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import qh.v9;
public final class t0 implements SensorEventListener {
    public long f47688a;
    public float[] f47689b;
    public float[] f47690c;
    public float[] d;
    public final u0 f47691e;

    public t0(u0 u0Var) {
        this.f47691e = u0Var;
    }

    public final void a() {
        if (this.f47689b != null) {
            u0 u0Var = this.f47691e;
            if (u0Var.f47714k != null) {
                this.f47688a = System.currentTimeMillis();
                if (this.f47690c == null) {
                    this.f47690c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f47689b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f47690c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f47690c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f47690c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.f47691e;
        v9 v9Var = u0Var.f47722s;
        if (v9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var);
            u0Var.f47722s = null;
        }
        if (!u0Var.f47715l && u0Var.f47714k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f47688a;
            long j10 = u0Var.f47713j;
            if (currentTimeMillis < j10) {
                v9 v9Var2 = new v9(this, 12);
                u0Var.f47722s = v9Var2;
                AndroidUtilities.runOnUIThread(v9Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f47689b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
