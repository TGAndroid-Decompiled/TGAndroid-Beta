package qh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class s0 implements SensorEventListener {
    public final x0 f45748a;

    public s0(x0 x0Var) {
        this.f45748a = x0Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        x0 x0Var = this.f45748a;
        x0Var.H6 = f7;
        float f10 = fArr[1];
        x0Var.I6 = f10;
        float f11 = fArr[2];
        if (!x0Var.L6) {
            x0Var.J6 = f7;
            x0Var.K6 = f10;
            x0Var.L6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
