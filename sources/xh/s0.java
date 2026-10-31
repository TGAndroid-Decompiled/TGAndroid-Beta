package xh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class s0 {
    public final SensorManager f54016a;
    public Sensor f54017b;
    public long f54018c;
    public Sensor d;
    public long e;
    public Sensor f54019f;
    public Sensor f54020g;
    public long h;
    public Sensor f54021i;
    public long f54022j;
    public org.telegram.ui.web.v0 f54023k;
    public boolean f54024l;
    public d0 f54025m;
    public d0 f54027o;
    public d0 f54029q;
    public d0 f54031s;
    public final p0 f54026n = new p0(this, 0);
    public final p0 f54028p = new p0(this, 1);
    public final q0 f54030r = new q0(this);
    public final r0 f54032t = new r0(this);

    public s0(Context context) {
        this.f54016a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f54024l) {
            this.f54024l = true;
            SensorManager sensorManager = this.f54016a;
            if (sensorManager != null) {
                Sensor sensor = this.f54017b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f54026n, sensor);
                }
                d0 d0Var = this.f54025m;
                if (d0Var != null) {
                    org.telegram.messenger.i0.r(d0Var);
                    this.f54025m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f54028p, sensor2);
                }
                d0 d0Var2 = this.f54027o;
                if (d0Var2 != null) {
                    org.telegram.messenger.i0.r(d0Var2);
                    this.f54027o = null;
                }
                Sensor sensor3 = this.f54020g;
                q0 q0Var = this.f54030r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(q0Var, sensor3);
                }
                Sensor sensor4 = this.f54019f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(q0Var, sensor4);
                }
                d0 d0Var3 = this.f54029q;
                if (d0Var3 != null) {
                    org.telegram.messenger.i0.r(d0Var3);
                    this.f54029q = null;
                }
                Sensor sensor5 = this.f54021i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f54032t, sensor5);
                }
                d0 d0Var4 = this.f54031s;
                if (d0Var4 != null) {
                    org.telegram.messenger.i0.r(d0Var4);
                    this.f54031s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f54016a;
        if (sensorManager != null) {
            if (this.f54017b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f54017b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f54018c = j10;
                if (!this.f54024l) {
                    sensorManager.registerListener(this.f54026n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f54016a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f54024l) {
                    sensorManager.registerListener(this.f54028p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f54016a;
        if (sensorManager != null) {
            r0 r0Var = this.f54032t;
            q0 q0Var = this.f54030r;
            if (z10) {
                if (this.f54021i != null) {
                    d0 d0Var = this.f54031s;
                    if (d0Var != null) {
                        org.telegram.messenger.i0.r(d0Var);
                        this.f54031s = null;
                    }
                    if (!this.f54024l && (sensor = this.f54021i) != null) {
                        sensorManager.unregisterListener(r0Var, sensor);
                    }
                    this.f54021i = null;
                }
                if (this.f54019f == null || this.f54020g == null) {
                    this.f54020g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f54019f = defaultSensor;
                    Sensor sensor2 = this.f54020g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f54024l) {
                            sensorManager.registerListener(q0Var, sensor2, a(j10));
                            sensorManager.registerListener(q0Var, this.f54019f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f54019f != null || this.f54020g != null) {
                    d0 d0Var2 = this.f54029q;
                    if (d0Var2 != null) {
                        org.telegram.messenger.i0.r(d0Var2);
                        this.f54029q = null;
                    }
                    if (!this.f54024l) {
                        Sensor sensor3 = this.f54020g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(q0Var, sensor3);
                        }
                        Sensor sensor4 = this.f54019f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(q0Var, sensor4);
                        }
                    }
                    this.f54020g = null;
                    this.f54019f = null;
                }
                if (this.f54021i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f54021i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f54022j = j10;
                    if (!this.f54024l) {
                        sensorManager.registerListener(r0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f54016a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f54017b;
        if (sensor == null) {
            return true;
        }
        if (!this.f54024l) {
            sensorManager.unregisterListener(this.f54026n, sensor);
        }
        d0 d0Var = this.f54025m;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.f54025m = null;
        }
        this.f54017b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f54016a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f54024l) {
            sensorManager.unregisterListener(this.f54028p, sensor);
        }
        d0 d0Var = this.f54027o;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.f54027o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f54016a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f54020g;
        if (sensor == null && this.f54019f == null && this.f54021i == null) {
            return true;
        }
        if (!this.f54024l) {
            q0 q0Var = this.f54030r;
            if (sensor != null) {
                sensorManager.unregisterListener(q0Var, sensor);
            }
            Sensor sensor2 = this.f54019f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(q0Var, sensor2);
            }
            Sensor sensor3 = this.f54021i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f54032t, sensor3);
            }
        }
        d0 d0Var = this.f54029q;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.f54029q = null;
        }
        d0 d0Var2 = this.f54031s;
        if (d0Var2 != null) {
            org.telegram.messenger.i0.r(d0Var2);
            this.f54031s = null;
        }
        this.f54020g = null;
        this.f54019f = null;
        this.f54021i = null;
        return true;
    }
}
