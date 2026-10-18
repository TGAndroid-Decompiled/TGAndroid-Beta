package zh;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
public final class p0 implements SensorEventListener {
    public final u0 f51780a;

    public p0(u0 u0Var) {
        this.f51780a = u0Var;
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        u0 u0Var = this.f51780a;
        u0Var.I6 = f7;
        float f10 = fArr[1];
        u0Var.J6 = f10;
        float f11 = fArr[2];
        if (!u0Var.M6) {
            u0Var.K6 = f7;
            u0Var.L6 = f10;
            u0Var.M6 = true;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
