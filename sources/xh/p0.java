package xh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
public final class p0 implements SensorEventListener {
    public final int f53979a;
    public long f53980b;
    public float[] f53981c;
    public final s0 d;

    public p0(s0 s0Var, int i10) {
        this.f53979a = i10;
        switch (i10) {
            case 1:
                this.d = s0Var;
                this.f53981c = new float[3];
                return;
            default:
                this.d = s0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f53979a) {
            case 0:
                s0 s0Var = this.d;
                if (s0Var.f54041k != null && this.f53981c != null) {
                    this.f53980b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f53981c[0]);
                        jSONObject.put("y", -this.f53981c[1]);
                        jSONObject.put("z", -this.f53981c[2]);
                        org.telegram.ui.web.v0 v0Var = s0Var.f54041k;
                        v0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f53981c;
                s0 s0Var2 = this.d;
                if (s0Var2.f54041k != null) {
                    this.f53980b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.v0 v0Var2 = s0Var2.f54041k;
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
        int i11 = this.f53979a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f53979a) {
            case 0:
                s0 s0Var = this.d;
                d0 d0Var = s0Var.f54043m;
                if (d0Var != null) {
                    org.telegram.messenger.i0.r(d0Var);
                    s0Var.f54043m = null;
                }
                if (!s0Var.f54042l && s0Var.f54041k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f53980b;
                    this.f53981c = sensorEvent.values;
                    long j10 = s0Var.f54036c;
                    if (currentTimeMillis < j10) {
                        d0 d0Var2 = new d0(this, 1);
                        s0Var.f54043m = d0Var2;
                        org.telegram.messenger.i0.h3(d0Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                s0 s0Var2 = this.d;
                d0 d0Var3 = s0Var2.f54045o;
                if (d0Var3 != null) {
                    org.telegram.messenger.i0.r(d0Var3);
                    s0Var2.f54045o = null;
                }
                if (!s0Var2.f54042l && s0Var2.f54041k != null) {
                    float[] fArr = this.f53981c;
                    float f7 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f7 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f53980b;
                    long j11 = s0Var2.e;
                    if (currentTimeMillis2 < j11) {
                        d0 d0Var4 = new d0(this, 2);
                        s0Var2.f54045o = d0Var4;
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
