package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class o0 implements SensorEventListener {
    public final t0 f51818a;

    public o0(t0 t0Var) {
        this.f51818a = t0Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        t0 t0Var = this.f51818a;
        t0Var.I6 = f7;
        float f10 = fArr[1];
        t0Var.J6 = f10;
        float f11 = fArr[2];
        if (!t0Var.M6) {
            t0Var.K6 = f7;
            t0Var.L6 = f10;
            t0Var.M6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
