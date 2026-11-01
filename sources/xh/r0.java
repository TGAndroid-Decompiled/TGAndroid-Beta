package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
public final class r0 implements SensorEventListener {
    public long f54020a;
    public float[] f54021b;
    public float[] f54022c;
    public float[] d;
    public final s0 e;

    public r0(s0 s0Var) {
        this.e = s0Var;
    }

    public final void a() {
        if (this.f54021b != null) {
            s0 s0Var = this.e;
            if (s0Var.f54041k != null) {
                this.f54020a = System.currentTimeMillis();
                if (this.f54022c == null) {
                    this.f54022c = new float[9];
                }
                if (this.d == null) {
                    this.d = new float[4];
                }
                float[] fArr = this.f54021b;
                if (fArr.length > 4) {
                    System.arraycopy(fArr, 0, this.d, 0, 4);
                    SensorManager.getRotationMatrixFromVector(this.f54022c, this.d);
                } else {
                    SensorManager.getRotationMatrixFromVector(this.f54022c, fArr);
                }
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(this.f54022c, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", false);
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

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        s0 s0Var = this.e;
        d0 d0Var = s0Var.f54049s;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            s0Var.f54049s = null;
        }
        if (!s0Var.f54042l && s0Var.f54041k != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f54020a;
            long j10 = s0Var.f54040j;
            if (currentTimeMillis < j10) {
                d0 d0Var2 = new d0(this, 4);
                s0Var.f54049s = d0Var2;
                org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
                return;
            }
            if (sensorEvent.sensor.getType() == 15) {
                this.f54021b = sensorEvent.values;
            }
            a();
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
