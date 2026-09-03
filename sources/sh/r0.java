package sh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import qh.u9;
public final class r0 implements SensorEventListener {
    public final int f47676a;
    public long f47677b;
    public float[] f47678c;
    public final u0 d;

    public r0(u0 u0Var, int i10) {
        this.f47676a = i10;
        switch (i10) {
            case 1:
                this.d = u0Var;
                this.f47678c = new float[3];
                return;
            default:
                this.d = u0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f47676a) {
            case 0:
                u0 u0Var = this.d;
                if (u0Var.f47750k != null && this.f47678c != null) {
                    this.f47677b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f47678c[0]);
                        jSONObject.put("y", -this.f47678c[1]);
                        jSONObject.put("z", -this.f47678c[2]);
                        org.telegram.ui.web.x0 x0Var = u0Var.f47750k;
                        x0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f47678c;
                u0 u0Var2 = this.d;
                if (u0Var2.f47750k != null) {
                    this.f47677b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.x0 x0Var2 = u0Var2.f47750k;
                        x0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f47676a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f47676a) {
            case 0:
                u0 u0Var = this.d;
                u9 u9Var = u0Var.f47752m;
                if (u9Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(u9Var);
                    u0Var.f47752m = null;
                }
                if (!u0Var.f47751l && u0Var.f47750k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f47677b;
                    this.f47678c = sensorEvent.values;
                    long j10 = u0Var.f47744c;
                    if (currentTimeMillis < j10) {
                        u9 u9Var2 = new u9(this, 9);
                        u0Var.f47752m = u9Var2;
                        AndroidUtilities.runOnUIThread(u9Var2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.d;
                u9 u9Var3 = u0Var2.f47754o;
                if (u9Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u9Var3);
                    u0Var2.f47754o = null;
                }
                if (!u0Var2.f47751l && u0Var2.f47750k != null) {
                    float[] fArr = this.f47678c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f47677b;
                    long j11 = u0Var2.f47745e;
                    if (currentTimeMillis2 < j11) {
                        u9 u9Var4 = new u9(this, 10);
                        u0Var2.f47754o = u9Var4;
                        AndroidUtilities.runOnUIThread(u9Var4, j11 - currentTimeMillis2);
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
