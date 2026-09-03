package sh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
import qh.u9;
public final class u0 {
    public final SensorManager f47742a;
    public Sensor f47743b;
    public long f47744c;
    public Sensor d;
    public long f47745e;
    public Sensor f47746f;
    public Sensor f47747g;
    public long h;
    public Sensor f47748i;
    public long f47749j;
    public org.telegram.ui.web.x0 f47750k;
    public boolean f47751l;
    public u9 f47752m;
    public u9 f47754o;
    public u9 f47756q;
    public u9 f47758s;
    public final r0 f47753n = new r0(this, 0);
    public final r0 f47755p = new r0(this, 1);
    public final s0 f47757r = new s0(this);
    public final t0 f47759t = new t0(this);

    public u0(Context context) {
        this.f47742a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f47751l) {
            this.f47751l = true;
            SensorManager sensorManager = this.f47742a;
            if (sensorManager != null) {
                Sensor sensor = this.f47743b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f47753n, sensor);
                }
                u9 u9Var = this.f47752m;
                if (u9Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(u9Var);
                    this.f47752m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f47755p, sensor2);
                }
                u9 u9Var2 = this.f47754o;
                if (u9Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u9Var2);
                    this.f47754o = null;
                }
                Sensor sensor3 = this.f47747g;
                s0 s0Var = this.f47757r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(s0Var, sensor3);
                }
                Sensor sensor4 = this.f47746f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(s0Var, sensor4);
                }
                u9 u9Var3 = this.f47756q;
                if (u9Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u9Var3);
                    this.f47756q = null;
                }
                Sensor sensor5 = this.f47748i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f47759t, sensor5);
                }
                u9 u9Var4 = this.f47758s;
                if (u9Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u9Var4);
                    this.f47758s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f47742a;
        if (sensorManager != null) {
            if (this.f47743b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f47743b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f47744c = j10;
                if (!this.f47751l) {
                    sensorManager.registerListener(this.f47753n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f47742a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f47745e = j10;
                if (!this.f47751l) {
                    sensorManager.registerListener(this.f47755p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z4) {
        Sensor sensor;
        SensorManager sensorManager = this.f47742a;
        if (sensorManager != null) {
            t0 t0Var = this.f47759t;
            s0 s0Var = this.f47757r;
            if (z4) {
                if (this.f47748i != null) {
                    u9 u9Var = this.f47758s;
                    if (u9Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(u9Var);
                        this.f47758s = null;
                    }
                    if (!this.f47751l && (sensor = this.f47748i) != null) {
                        sensorManager.unregisterListener(t0Var, sensor);
                    }
                    this.f47748i = null;
                }
                if (this.f47746f == null || this.f47747g == null) {
                    this.f47747g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f47746f = defaultSensor;
                    Sensor sensor2 = this.f47747g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f47751l) {
                            sensorManager.registerListener(s0Var, sensor2, a(j10));
                            sensorManager.registerListener(s0Var, this.f47746f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f47746f != null || this.f47747g != null) {
                    u9 u9Var2 = this.f47756q;
                    if (u9Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(u9Var2);
                        this.f47756q = null;
                    }
                    if (!this.f47751l) {
                        Sensor sensor3 = this.f47747g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(s0Var, sensor3);
                        }
                        Sensor sensor4 = this.f47746f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(s0Var, sensor4);
                        }
                    }
                    this.f47747g = null;
                    this.f47746f = null;
                }
                if (this.f47748i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f47748i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f47749j = j10;
                    if (!this.f47751l) {
                        sensorManager.registerListener(t0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f47742a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f47743b;
        if (sensor == null) {
            return true;
        }
        if (!this.f47751l) {
            sensorManager.unregisterListener(this.f47753n, sensor);
        }
        u9 u9Var = this.f47752m;
        if (u9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var);
            this.f47752m = null;
        }
        this.f47743b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f47742a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f47751l) {
            sensorManager.unregisterListener(this.f47755p, sensor);
        }
        u9 u9Var = this.f47754o;
        if (u9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var);
            this.f47754o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f47742a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f47747g;
        if (sensor == null && this.f47746f == null && this.f47748i == null) {
            return true;
        }
        if (!this.f47751l) {
            s0 s0Var = this.f47757r;
            if (sensor != null) {
                sensorManager.unregisterListener(s0Var, sensor);
            }
            Sensor sensor2 = this.f47746f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(s0Var, sensor2);
            }
            Sensor sensor3 = this.f47748i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f47759t, sensor3);
            }
        }
        u9 u9Var = this.f47756q;
        if (u9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var);
            this.f47756q = null;
        }
        u9 u9Var2 = this.f47758s;
        if (u9Var2 != null) {
            AndroidUtilities.cancelRunOnUIThread(u9Var2);
            this.f47758s = null;
        }
        this.f47747g = null;
        this.f47746f = null;
        this.f47748i = null;
        return true;
    }
}
