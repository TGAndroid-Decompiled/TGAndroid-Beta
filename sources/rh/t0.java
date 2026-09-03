package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class t0 implements SensorEventListener {
    public long f43829a;
    public float[] f43830b;
    public float[] f43831c;
    public float[] d;
    public final u0 e;

    public t0(u0 u0Var) {
        this.e = u0Var;
    }

    public final void a() {
        if (this.f43830b != null) {
            u0 u0Var = this.e;
            if (u0Var.f43851k != null) {
                this.f43829a = System.currentTimeMillis();
                if (this.f43831c == null) {
                    this.f43831c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f43830b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f43831c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f43831c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f43831c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.e;
        ga gaVar = u0Var.f43859s;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            u0Var.f43859s = null;
        }
        if (!u0Var.f43852l && u0Var.f43851k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f43829a;
            long j10 = u0Var.f43850j;
            if (currentTimeMillis < j10) {
                ga gaVar2 = new ga(this, 11);
                u0Var.f43859s = gaVar2;
                AndroidUtilities.runOnUIThread(gaVar2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f43830b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
