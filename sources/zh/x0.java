package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class x0 implements SensorEventListener {
    public final c1 f52606a;

    public x0(c1 c1Var) {
        this.f52606a = c1Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        c1 c1Var = this.f52606a;
        c1Var.I6 = f7;
        float f10 = fArr[1];
        c1Var.J6 = f10;
        float f11 = fArr[2];
        if (!c1Var.M6) {
            c1Var.K6 = f7;
            c1Var.L6 = f10;
            c1Var.M6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
