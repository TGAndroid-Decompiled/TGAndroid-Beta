package ph;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
public final class r0 implements SensorEventListener {
    public final int f46015a;
    public long f46016b;
    public float[] f46017c;
    public final u0 d;

    public r0(u0 u0Var, int i10) {
        this.f46015a = i10;
        switch (i10) {
            case 1:
                this.d = u0Var;
                this.f46017c = new float[3];
                return;
            default:
                this.d = u0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f46015a) {
            case 0:
                u0 u0Var = this.d;
                if (u0Var.f46089k != null && this.f46017c != null) {
                    this.f46016b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f46017c[0]);
                        jSONObject.put("y", -this.f46017c[1]);
                        jSONObject.put("z", -this.f46017c[2]);
                        org.telegram.ui.web.w0 w0Var = u0Var.f46089k;
                        w0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f46017c;
                u0 u0Var2 = this.d;
                if (u0Var2.f46089k != null) {
                    this.f46016b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.w0 w0Var2 = u0Var2.f46089k;
                        w0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f46015a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f46015a) {
            case 0:
                u0 u0Var = this.d;
                org.telegram.ui.web.t1 t1Var = u0Var.f46091m;
                if (t1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var);
                    u0Var.f46091m = null;
                }
                if (!u0Var.f46090l && u0Var.f46089k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f46016b;
                    this.f46017c = sensorEvent.values;
                    long j10 = u0Var.f46083c;
                    if (currentTimeMillis < j10) {
                        org.telegram.ui.web.t1 t1Var2 = new org.telegram.ui.web.t1(this, 5);
                        u0Var.f46091m = t1Var2;
                        AndroidUtilities.runOnUIThread(t1Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.d;
                org.telegram.ui.web.t1 t1Var3 = u0Var2.f46093o;
                if (t1Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var3);
                    u0Var2.f46093o = null;
                }
                if (!u0Var2.f46090l && u0Var2.f46089k != null) {
                    float[] fArr = this.f46017c;
                    float f9 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f9 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f46016b;
                    long j11 = u0Var2.f46084e;
                    if (currentTimeMillis2 < j11) {
                        org.telegram.ui.web.t1 t1Var4 = new org.telegram.ui.web.t1(this, 6);
                        u0Var2.f46093o = t1Var4;
                        AndroidUtilities.runOnUIThread(t1Var4, j11 - currentTimeMillis2);
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
