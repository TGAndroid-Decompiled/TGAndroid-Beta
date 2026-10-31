package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class p0 implements SensorEventListener {
    public final int f53960a;
    public long f53961b;
    public float[] f53962c;
    public final s0 d;

    public p0(s0 s0Var, int i10) {
        this.f53960a = i10;
        switch (i10) {
            case 1:
                this.d = s0Var;
                this.f53962c = new float[3];
                return;
            default:
                this.d = s0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f53960a) {
            case 0:
                s0 s0Var = this.d;
                if (s0Var.f54023k != null && this.f53962c != null) {
                    this.f53961b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f53962c[0]);
                        jSONObject.put("y", -this.f53962c[1]);
                        jSONObject.put("z", -this.f53962c[2]);
                        org.telegram.ui.web.v0 v0Var = s0Var.f54023k;
                        v0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f53962c;
                s0 s0Var2 = this.d;
                if (s0Var2.f54023k != null) {
                    this.f53961b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.v0 v0Var2 = s0Var2.f54023k;
                        v0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
                    } catch (Exception unused2) {
                    }
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[2] = 0.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        int i11 = this.f53960a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f53960a) {
            case 0:
                s0 s0Var = this.d;
                d0 d0Var = s0Var.f54025m;
                if (d0Var != null) {
                    org.telegram.messenger.i0.r(d0Var);
                    s0Var.f54025m = null;
                }
                if (!s0Var.f54024l && s0Var.f54023k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f53961b;
                    this.f53962c = sensorEvent.values;
                    long j10 = s0Var.f54018c;
                    if (currentTimeMillis < j10) {
                        d0 d0Var2 = new d0(this, 1);
                        s0Var.f54025m = d0Var2;
                        org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.d;
                d0 d0Var3 = s0Var2.f54027o;
                if (d0Var3 != null) {
                    org.telegram.messenger.i0.r(d0Var3);
                    s0Var2.f54027o = null;
                }
                if (!s0Var2.f54024l && s0Var2.f54023k != null) {
                    float[] fArr = this.f53962c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f53961b;
                    long j11 = s0Var2.e;
                    if (currentTimeMillis2 < j11) {
                        d0 d0Var4 = new d0(this, 2);
                        s0Var2.f54027o = d0Var4;
                        org.telegram.messenger.i0.h3(d0Var4, j11 - currentTimeMillis2);
                        return;
                    }
                    c();
                    return;
                }
                return;
        }
    }

    private final void a(Sensor sensor, int i10) {
    }

    private final void b(Sensor sensor, int i10) {
    }
}
