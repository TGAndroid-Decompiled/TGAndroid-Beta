package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class r0 implements SensorEventListener {
    public final int f43786a;
    public long f43787b;
    public float[] f43788c;
    public final u0 d;

    public r0(u0 u0Var, int i10) {
        this.f43786a = i10;
        switch (i10) {
            case 1:
                this.d = u0Var;
                this.f43788c = new float[3];
                return;
            default:
                this.d = u0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f43786a) {
            case 0:
                u0 u0Var = this.d;
                if (u0Var.f43851k != null && this.f43788c != null) {
                    this.f43787b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f43788c[0]);
                        jSONObject.put("y", -this.f43788c[1]);
                        jSONObject.put("z", -this.f43788c[2]);
                        org.telegram.ui.web.y0 y0Var = u0Var.f43851k;
                        y0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f43788c;
                u0 u0Var2 = this.d;
                if (u0Var2.f43851k != null) {
                    this.f43787b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.y0 y0Var2 = u0Var2.f43851k;
                        y0Var2.d("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
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
        int i11 = this.f43786a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f43786a) {
            case 0:
                u0 u0Var = this.d;
                ga gaVar = u0Var.f43853m;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    u0Var.f43853m = null;
                }
                if (!u0Var.f43852l && u0Var.f43851k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f43787b;
                    this.f43788c = sensorEvent.values;
                    long j10 = u0Var.f43846c;
                    if (currentTimeMillis < j10) {
                        ga gaVar2 = new ga(this, 8);
                        u0Var.f43853m = gaVar2;
                        AndroidUtilities.runOnUIThread(gaVar2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.d;
                ga gaVar3 = u0Var2.f43855o;
                if (gaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar3);
                    u0Var2.f43855o = null;
                }
                if (!u0Var2.f43852l && u0Var2.f43851k != null) {
                    float[] fArr = this.f43788c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f43787b;
                    long j11 = u0Var2.e;
                    if (currentTimeMillis2 < j11) {
                        ga gaVar4 = new ga(this, 9);
                        u0Var2.f43855o = gaVar4;
                        AndroidUtilities.runOnUIThread(gaVar4, j11 - currentTimeMillis2);
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
