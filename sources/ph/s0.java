package ph;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class s0 implements SensorEventListener {
    public long f46046a;
    public float[] f46047b;
    public float[] f46048c;
    public final u0 d;

    public s0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        if (this.f46047b != null && this.f46048c != null) {
            u0 u0Var = this.d;
            if (u0Var.f46089k != null) {
                this.f46046a = System.currentTimeMillis();
                float[] fArr = new float[9];
                if (SensorManager.getRotationMatrix(fArr, new float[9], this.f46047b, this.f46048c)) {
                    float[] fArr2 = new float[3];
                    SensorManager.getOrientation(fArr, fArr2);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("absolute", true);
                        jSONObject.put("alpha", -fArr2[0]);
                        jSONObject.put("beta", -fArr2[1]);
                        jSONObject.put("gamma", fArr2[2]);
                        org.telegram.ui.web.w0 w0Var = u0Var.f46089k;
                        w0Var.d("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.d;
        org.telegram.ui.web.t1 t1Var = u0Var.f46095q;
        if (t1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            u0Var.f46095q = null;
        }
        if (!u0Var.f46090l && u0Var.f46089k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f46046a;
            if (sensorEvent.sensor.getType() == 1) {
                this.f46047b = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f46048c = sensorEvent.values;
            }
            long j10 = u0Var.h;
            if (currentTimeMillis < j10) {
                org.telegram.ui.web.t1 t1Var2 = new org.telegram.ui.web.t1(this, 7);
                u0Var.f46095q = t1Var2;
                AndroidUtilities.runOnUIThread(t1Var2, j10 - currentTimeMillis);
                return;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
