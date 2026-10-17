package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class w0 implements SensorEventListener {
    public final b1 f52121a;

    public w0(b1 b1Var) {
        this.f52121a = b1Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        b1 b1Var = this.f52121a;
        b1Var.f51817o6 = f7;
        float f10 = fArr[1];
        b1Var.f51825p6 = f10;
        float f11 = fArr[2];
        if (!b1Var.f51853s6) {
            b1Var.q6 = f7;
            b1Var.f51843r6 = f10;
            b1Var.f51853s6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
