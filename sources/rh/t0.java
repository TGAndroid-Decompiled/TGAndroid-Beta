package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class t0 implements SensorEventListener {
    public long f43762a;
    public float[] f43763b;
    public float[] f43764c;
    public final v0 d;

    public t0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        if (this.f43763b != null && this.f43764c != null) {
            v0 v0Var = this.d;
            if (v0Var.f43799k != null) {
                this.f43762a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f43763b, this.f43764c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.w0 w0Var = v0Var.f43799k;
                        w0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.d;
        ga gaVar = v0Var.f43805q;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            v0Var.f43805q = null;
        }
        if (!v0Var.f43800l && v0Var.f43799k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f43762a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f43763b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f43764c = sensorEvent.values;
            }
            long j10 = v0Var.h;
            if (currentTimeMillis < j10) {
                ga gaVar2 = new ga(this, 9);
                v0Var.f43805q = gaVar2;
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
