package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class q0 implements SensorEventListener {
    public long f53995a;
    public float[] f53996b;
    public float[] f53997c;
    public final s0 d;

    public q0(s0 s0Var) {
        this.d = s0Var;
    }

    public final void a() {
        if (this.f53996b != null && this.f53997c != null) {
            s0 s0Var = this.d;
            if (s0Var.f54041k != null) {
                this.f53995a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f53996b, this.f53997c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.v0 v0Var = s0Var.f54041k;
                        v0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        s0 s0Var = this.d;
        d0 d0Var = s0Var.f54047q;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            s0Var.f54047q = null;
        }
        if (!s0Var.f54042l && s0Var.f54041k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f53995a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f53996b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f53997c = sensorEvent.values;
            }
            long j10 = s0Var.h;
            if (currentTimeMillis < j10) {
                d0 d0Var2 = new d0(this, 3);
                s0Var.f54047q = d0Var2;
                org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
