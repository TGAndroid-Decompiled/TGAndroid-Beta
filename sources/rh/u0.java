package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class u0 implements SensorEventListener {
    public long f43777a;
    public float[] f43778b;
    public float[] f43779c;
    public float[] d;
    public final v0 e;

    public u0(v0 v0Var) {
        this.e = v0Var;
    }

    public final void a() {
        if (this.f43778b != null) {
            v0 v0Var = this.e;
            if (v0Var.f43799k != null) {
                this.f43777a = System.currentTimeMillis();
                if (this.f43779c == null) {
                    this.f43779c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f43778b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f43779c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f43779c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f43779c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        v0 v0Var = this.e;
        ga gaVar = v0Var.f43807s;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            v0Var.f43807s = null;
        }
        if (!v0Var.f43800l && v0Var.f43799k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f43777a;
            long j10 = v0Var.f43798j;
            if (currentTimeMillis < j10) {
                ga gaVar2 = new ga(this, 10);
                v0Var.f43807s = gaVar2;
                AndroidUtilities.runOnUIThread(gaVar2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f43778b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
