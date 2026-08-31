package sh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
import qh.v9;
public final class u0 {
    public final SensorManager f47706a;
    public Sensor f47707b;
    public long f47708c;
    public Sensor d;
    public long f47709e;
    public Sensor f47710f;
    public Sensor f47711g;
    public long h;
    public Sensor f47712i;
    public long f47713j;
    public org.telegram.ui.web.x0 f47714k;
    public boolean f47715l;
    public v9 f47716m;
    public v9 f47718o;
    public v9 f47720q;
    public v9 f47722s;
    public final r0 f47717n = new r0(this, 0);
    public final r0 f47719p = new r0(this, 1);
    public final s0 f47721r = new s0(this);
    public final t0 f47723t = new t0(this);

    public u0(Context context) {
        this.f47706a = (SensorManager) context.getSystemService("sensor");
    }

    public static int a(long j10) {
        if (j10 >= 160) {
            return 3;
        }
        if (j10 >= 60) {
            return 2;
        }
        return 1;
    }

    public final void b() {
        if (!this.f47715l) {
            this.f47715l = true;
            SensorManager sensorManager = this.f47706a;
            if (sensorManager != null) {
                Sensor sensor = this.f47707b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f47717n, sensor);
                }
                v9 v9Var = this.f47716m;
                if (v9Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v9Var);
                    this.f47716m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f47719p, sensor2);
                }
                v9 v9Var2 = this.f47718o;
                if (v9Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(v9Var2);
                    this.f47718o = null;
                }
                Sensor sensor3 = this.f47711g;
                s0 s0Var = this.f47721r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(s0Var, sensor3);
                }
                Sensor sensor4 = this.f47710f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(s0Var, sensor4);
                }
                v9 v9Var3 = this.f47720q;
                if (v9Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(v9Var3);
                    this.f47720q = null;
                }
                Sensor sensor5 = this.f47712i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f47723t, sensor5);
                }
                v9 v9Var4 = this.f47722s;
                if (v9Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(v9Var4);
                    this.f47722s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f47706a;
        if (sensorManager != null) {
            if (this.f47707b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f47707b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f47708c = j10;
                if (!this.f47715l) {
                    sensorManager.registerListener(this.f47717n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f47706a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f47709e = j10;
                if (!this.f47715l) {
                    sensorManager.registerListener(this.f47719p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z4) {
        Sensor sensor;
        SensorManager sensorManager = this.f47706a;
        if (sensorManager != null) {
            t0 t0Var = this.f47723t;
            s0 s0Var = this.f47721r;
            if (z4) {
                if (this.f47712i != null) {
                    v9 v9Var = this.f47722s;
                    if (v9Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(v9Var);
                        this.f47722s = null;
                    }
                    if (!this.f47715l && (sensor = this.f47712i) != null) {
                        sensorManager.unregisterListener(t0Var, sensor);
                    }
                    this.f47712i = null;
                }
                if (this.f47710f == null || this.f47711g == null) {
                    this.f47711g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f47710f = defaultSensor;
                    Sensor sensor2 = this.f47711g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f47715l) {
                            sensorManager.registerListener(s0Var, sensor2, a(j10));
                            sensorManager.registerListener(s0Var, this.f47710f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f47710f != null || this.f47711g != null) {
                    v9 v9Var2 = this.f47720q;
                    if (v9Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(v9Var2);
                        this.f47720q = null;
                    }
                    if (!this.f47715l) {
                        Sensor sensor3 = this.f47711g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(s0Var, sensor3);
                        }
                        Sensor sensor4 = this.f47710f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(s0Var, sensor4);
                        }
                    }
                    this.f47711g = null;
                    this.f47710f = null;
                }
                if (this.f47712i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f47712i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f47713j = j10;
                    if (!this.f47715l) {
                        sensorManager.registerListener(t0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f47706a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f47707b;
        if (sensor == null) {
            return true;
        }
        if (!this.f47715l) {
            sensorManager.unregisterListener(this.f47717n, sensor);
        }
        v9 v9Var = this.f47716m;
        if (v9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var);
            this.f47716m = null;
        }
        this.f47707b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f47706a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f47715l) {
            sensorManager.unregisterListener(this.f47719p, sensor);
        }
        v9 v9Var = this.f47718o;
        if (v9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var);
            this.f47718o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f47706a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f47711g;
        if (sensor == null && this.f47710f == null && this.f47712i == null) {
            return true;
        }
        if (!this.f47715l) {
            s0 s0Var = this.f47721r;
            if (sensor != null) {
                sensorManager.unregisterListener(s0Var, sensor);
            }
            Sensor sensor2 = this.f47710f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(s0Var, sensor2);
            }
            Sensor sensor3 = this.f47712i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f47723t, sensor3);
            }
        }
        v9 v9Var = this.f47720q;
        if (v9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var);
            this.f47720q = null;
        }
        v9 v9Var2 = this.f47722s;
        if (v9Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(v9Var2);
            this.f47722s = null;
        }
        this.f47711g = null;
        this.f47710f = null;
        this.f47712i = null;
        return true;
    }
}
