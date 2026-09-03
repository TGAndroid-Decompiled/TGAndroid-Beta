package rh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class u0 {
    public final SensorManager f43844a;
    public Sensor f43845b;
    public long f43846c;
    public Sensor d;
    public long e;
    public Sensor f43847f;
    public Sensor f43848g;
    public long h;
    public Sensor f43849i;
    public long f43850j;
    public org.telegram.ui.web.y0 f43851k;
    public boolean f43852l;
    public ga f43853m;
    public ga f43855o;
    public ga f43857q;
    public ga f43859s;
    public final r0 f43854n = new r0(this, 0);
    public final r0 f43856p = new r0(this, 1);
    public final s0 f43858r = new s0(this);
    public final t0 f43860t = new t0(this);

    public u0(Context context) {
        this.f43844a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f43852l) {
            this.f43852l = true;
            SensorManager sensorManager = this.f43844a;
            if (sensorManager != null) {
                Sensor sensor = this.f43845b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f43854n, sensor);
                }
                ga gaVar = this.f43853m;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    this.f43853m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f43856p, sensor2);
                }
                ga gaVar2 = this.f43855o;
                if (gaVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar2);
                    this.f43855o = null;
                }
                Sensor sensor3 = this.f43848g;
                s0 s0Var = this.f43858r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(s0Var, sensor3);
                }
                Sensor sensor4 = this.f43847f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(s0Var, sensor4);
                }
                ga gaVar3 = this.f43857q;
                if (gaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar3);
                    this.f43857q = null;
                }
                Sensor sensor5 = this.f43849i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f43860t, sensor5);
                }
                ga gaVar4 = this.f43859s;
                if (gaVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar4);
                    this.f43859s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f43844a;
        if (sensorManager != null) {
            if (this.f43845b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f43845b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f43846c = j10;
                if (!this.f43852l) {
                    sensorManager.registerListener(this.f43854n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f43844a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f43852l) {
                    sensorManager.registerListener(this.f43856p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z4) {
        Sensor sensor;
        SensorManager sensorManager = this.f43844a;
        if (sensorManager != null) {
            t0 t0Var = this.f43860t;
            s0 s0Var = this.f43858r;
            if (z4) {
                if (this.f43849i != null) {
                    ga gaVar = this.f43859s;
                    if (gaVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(gaVar);
                        this.f43859s = null;
                    }
                    if (!this.f43852l && (sensor = this.f43849i) != null) {
                        sensorManager.unregisterListener(t0Var, sensor);
                    }
                    this.f43849i = null;
                }
                if (this.f43847f == null || this.f43848g == null) {
                    this.f43848g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f43847f = defaultSensor;
                    Sensor sensor2 = this.f43848g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f43852l) {
                            sensorManager.registerListener(s0Var, sensor2, a(j10));
                            sensorManager.registerListener(s0Var, this.f43847f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f43847f != null || this.f43848g != null) {
                    ga gaVar2 = this.f43857q;
                    if (gaVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(gaVar2);
                        this.f43857q = null;
                    }
                    if (!this.f43852l) {
                        Sensor sensor3 = this.f43848g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(s0Var, sensor3);
                        }
                        Sensor sensor4 = this.f43847f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(s0Var, sensor4);
                        }
                    }
                    this.f43848g = null;
                    this.f43847f = null;
                }
                if (this.f43849i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f43849i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f43850j = j10;
                    if (!this.f43852l) {
                        sensorManager.registerListener(t0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f43844a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f43845b;
        if (sensor == null) {
            return true;
        }
        if (!this.f43852l) {
            sensorManager.unregisterListener(this.f43854n, sensor);
        }
        ga gaVar = this.f43853m;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.f43853m = null;
        }
        this.f43845b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f43844a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f43852l) {
            sensorManager.unregisterListener(this.f43856p, sensor);
        }
        ga gaVar = this.f43855o;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.f43855o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f43844a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f43848g;
        if (sensor == null && this.f43847f == null && this.f43849i == null) {
            return true;
        }
        if (!this.f43852l) {
            s0 s0Var = this.f43858r;
            if (sensor != null) {
                sensorManager.unregisterListener(s0Var, sensor);
            }
            Sensor sensor2 = this.f43847f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(s0Var, sensor2);
            }
            Sensor sensor3 = this.f43849i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f43860t, sensor3);
            }
        }
        ga gaVar = this.f43857q;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.f43857q = null;
        }
        ga gaVar2 = this.f43859s;
        if (gaVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar2);
            this.f43859s = null;
        }
        this.f43848g = null;
        this.f43847f = null;
        this.f43849i = null;
        return true;
    }
}
