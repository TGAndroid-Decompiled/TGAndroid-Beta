package ph;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class t0 implements SensorEventListener {
    public long f46063a;
    public float[] f46064b;
    public float[] f46065c;
    public float[] d;
    public final u0 f46066e;

    public t0(u0 u0Var) {
        this.f46066e = u0Var;
    }

    public final void a() {
        if (this.f46064b != null) {
            u0 u0Var = this.f46066e;
            if (u0Var.f46089k != null) {
                this.f46063a = System.currentTimeMillis();
                if (this.f46065c == null) {
                    this.f46065c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f46064b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f46065c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f46065c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f46065c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        u0 u0Var = this.f46066e;
        org.telegram.ui.web.t1 t1Var = u0Var.f46097s;
        if (t1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            u0Var.f46097s = null;
        }
        if (!u0Var.f46090l && u0Var.f46089k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f46063a;
            long j10 = u0Var.f46088j;
            if (currentTimeMillis < j10) {
                org.telegram.ui.web.t1 t1Var2 = new org.telegram.ui.web.t1(this, 8);
                u0Var.f46097s = t1Var2;
                AndroidUtilities.runOnUIThread(t1Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f46064b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
