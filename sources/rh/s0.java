package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class s0 implements SensorEventListener {
    public long f43814a;
    public float[] f43815b;
    public float[] f43816c;
    public final u0 d;

    public s0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        if (this.f43815b != null && this.f43816c != null) {
            u0 u0Var = this.d;
            if (u0Var.f43851k != null) {
                this.f43814a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f43815b, this.f43816c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.y0 y0Var = u0Var.f43851k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.d;
        ga gaVar = u0Var.f43857q;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            u0Var.f43857q = null;
        }
        if (!u0Var.f43852l && u0Var.f43851k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f43814a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f43815b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f43816c = sensorEvent.values;
            }
            long j10 = u0Var.h;
            if (currentTimeMillis < j10) {
                ga gaVar2 = new ga(this, 10);
                u0Var.f43857q = gaVar2;
                AndroidUtilities.runOnUIThread(gaVar2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
