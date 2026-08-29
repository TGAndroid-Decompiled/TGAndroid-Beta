package ph;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
public final class u0 {
    public final SensorManager f46081a;
    public Sensor f46082b;
    public long f46083c;
    public Sensor d;
    public long f46084e;
    public Sensor f46085f;
    public Sensor f46086g;
    public long h;
    public Sensor f46087i;
    public long f46088j;
    public org.telegram.ui.web.w0 f46089k;
    public boolean f46090l;
    public org.telegram.ui.web.t1 f46091m;
    public org.telegram.ui.web.t1 f46093o;
    public org.telegram.ui.web.t1 f46095q;
    public org.telegram.ui.web.t1 f46097s;
    public final r0 f46092n = new r0(this, 0);
    public final r0 f46094p = new r0(this, 1);
    public final s0 f46096r = new s0(this);
    public final t0 f46098t = new t0(this);

    public u0(Context context) {
        this.f46081a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f46090l) {
            this.f46090l = true;
            SensorManager sensorManager = this.f46081a;
            if (sensorManager != null) {
                Sensor sensor = this.f46082b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f46092n, sensor);
                }
                org.telegram.ui.web.t1 t1Var = this.f46091m;
                if (t1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var);
                    this.f46091m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f46094p, sensor2);
                }
                org.telegram.ui.web.t1 t1Var2 = this.f46093o;
                if (t1Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var2);
                    this.f46093o = null;
                }
                Sensor sensor3 = this.f46086g;
                s0 s0Var = this.f46096r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(s0Var, sensor3);
                }
                Sensor sensor4 = this.f46085f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(s0Var, sensor4);
                }
                org.telegram.ui.web.t1 t1Var3 = this.f46095q;
                if (t1Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var3);
                    this.f46095q = null;
                }
                Sensor sensor5 = this.f46087i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f46098t, sensor5);
                }
                org.telegram.ui.web.t1 t1Var4 = this.f46097s;
                if (t1Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t1Var4);
                    this.f46097s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f46081a;
        if (sensorManager != null) {
            if (this.f46082b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f46082b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f46083c = j10;
                if (!this.f46090l) {
                    sensorManager.registerListener(this.f46092n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f46081a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f46084e = j10;
                if (!this.f46090l) {
                    sensorManager.registerListener(this.f46094p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f46081a;
        if (sensorManager != null) {
            t0 t0Var = this.f46098t;
            s0 s0Var = this.f46096r;
            if (z10) {
                if (this.f46087i != null) {
                    org.telegram.ui.web.t1 t1Var = this.f46097s;
                    if (t1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(t1Var);
                        this.f46097s = null;
                    }
                    if (!this.f46090l && (sensor = this.f46087i) != null) {
                        sensorManager.unregisterListener(t0Var, sensor);
                    }
                    this.f46087i = null;
                }
                if (this.f46085f == null || this.f46086g == null) {
                    this.f46086g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f46085f = defaultSensor;
                    Sensor sensor2 = this.f46086g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f46090l) {
                            sensorManager.registerListener(s0Var, sensor2, a(j10));
                            sensorManager.registerListener(s0Var, this.f46085f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f46085f != null || this.f46086g != null) {
                    org.telegram.ui.web.t1 t1Var2 = this.f46095q;
                    if (t1Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(t1Var2);
                        this.f46095q = null;
                    }
                    if (!this.f46090l) {
                        Sensor sensor3 = this.f46086g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(s0Var, sensor3);
                        }
                        Sensor sensor4 = this.f46085f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(s0Var, sensor4);
                        }
                    }
                    this.f46086g = null;
                    this.f46085f = null;
                }
                if (this.f46087i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f46087i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f46088j = j10;
                    if (!this.f46090l) {
                        sensorManager.registerListener(t0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f46081a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f46082b;
        if (sensor == null) {
            return true;
        }
        if (!this.f46090l) {
            sensorManager.unregisterListener(this.f46092n, sensor);
        }
        org.telegram.ui.web.t1 t1Var = this.f46091m;
        if (t1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            this.f46091m = null;
        }
        this.f46082b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f46081a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f46090l) {
            sensorManager.unregisterListener(this.f46094p, sensor);
        }
        org.telegram.ui.web.t1 t1Var = this.f46093o;
        if (t1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            this.f46093o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f46081a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f46086g;
        if (sensor == null && this.f46085f == null && this.f46087i == null) {
            return true;
        }
        if (!this.f46090l) {
            s0 s0Var = this.f46096r;
            if (sensor != null) {
                sensorManager.unregisterListener(s0Var, sensor);
            }
            Sensor sensor2 = this.f46085f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(s0Var, sensor2);
            }
            Sensor sensor3 = this.f46087i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f46098t, sensor3);
            }
        }
        org.telegram.ui.web.t1 t1Var = this.f46095q;
        if (t1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            this.f46095q = null;
        }
        org.telegram.ui.web.t1 t1Var2 = this.f46097s;
        if (t1Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(t1Var2);
            this.f46097s = null;
        }
        this.f46086g = null;
        this.f46085f = null;
        this.f46087i = null;
        return true;
    }
}
