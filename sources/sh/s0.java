package sh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import qh.u9;
public final class s0 implements SensorEventListener {
    public long f47707a;
    public float[] f47708b;
    public float[] f47709c;
    public final u0 d;

    public s0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        if (this.f47708b != null && this.f47709c != null) {
            u0 u0Var = this.d;
            if (u0Var.f47750k != null) {
                this.f47707a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f47708b, this.f47709c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
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
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.d;
        u9 u9Var = u0Var.f47756q;
        if (u9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var);
            u0Var.f47756q = null;
        }
        if (!u0Var.f47751l && u0Var.f47750k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f47707a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f47708b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f47709c = sensorEvent.values;
            }
            long j10 = u0Var.h;
            if (currentTimeMillis < j10) {
                u9 u9Var2 = new u9(this, 11);
                u0Var.f47756q = u9Var2;
                AndroidUtilities.runOnUIThread(u9Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
