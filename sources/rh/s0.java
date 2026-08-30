package rh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class s0 implements SensorEventListener {
    public final int f43734a;
    public long f43735b;
    public float[] f43736c;
    public final v0 d;

    public s0(v0 v0Var, int i10) {
        this.f43734a = i10;
        switch (i10) {
            case 1:
                this.d = v0Var;
                this.f43736c = new float[3];
                return;
            default:
                this.d = v0Var;
                return;
        }
    }

    public final void c() {
        switch (this.f43734a) {
            case 0:
                v0 v0Var = this.d;
                if (v0Var.f43799k != null && this.f43736c != null) {
                    this.f43735b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", -this.f43736c[0]);
                        jSONObject.put("y", -this.f43736c[1]);
                        jSONObject.put("z", -this.f43736c[2]);
                        org.telegram.ui.web.w0 w0Var = v0Var.f43799k;
                        w0Var.d("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                float[] fArr = this.f43736c;
                v0 v0Var2 = this.d;
                if (v0Var2.f43799k != null) {
                    this.f43735b = System.currentTimeMillis();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", fArr[0]);
                        jSONObject2.put("y", fArr[1]);
                        jSONObject2.put("z", fArr[2]);
                        org.telegram.ui.web.w0 w0Var2 = v0Var2.f43799k;
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
        int i11 = this.f43734a;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f43734a) {
            case 0:
                v0 v0Var = this.d;
                ga gaVar = v0Var.f43801m;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    v0Var.f43801m = null;
                }
                if (!v0Var.f43800l && v0Var.f43799k != null) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f43735b;
                    this.f43736c = sensorEvent.values;
                    long j10 = v0Var.f43794c;
                    if (currentTimeMillis < j10) {
                        ga gaVar2 = new ga(this, 7);
                        v0Var.f43801m = gaVar2;
                        AndroidUtilities.runOnUIThread(gaVar2, j10 - currentTimeMillis);
                        return;
                    }
                    c();
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.d;
                ga gaVar3 = v0Var2.f43803o;
                if (gaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar3);
                    v0Var2.f43803o = null;
                }
                if (!v0Var2.f43800l && v0Var2.f43799k != null) {
                    float[] fArr = this.f43736c;
                    float f10 = fArr[0];
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = f10 + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    fArr[2] = fArr[2] + fArr2[2];
                    long currentTimeMillis2 = System.currentTimeMillis() - this.f43735b;
                    long j11 = v0Var2.e;
                    if (currentTimeMillis2 < j11) {
                        ga gaVar4 = new ga(this, 8);
                        v0Var2.f43803o = gaVar4;
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
