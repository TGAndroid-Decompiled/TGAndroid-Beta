package xh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
public final class s0 {
    public final SensorManager f54034a;
    public Sensor f54035b;
    public long f54036c;
    public Sensor d;
    public long e;
    public Sensor f54037f;
    public Sensor f54038g;
    public long h;
    public Sensor f54039i;
    public long f54040j;
    public org.telegram.ui.web.v0 f54041k;
    public boolean f54042l;
    public d0 f54043m;
    public d0 f54045o;
    public d0 f54047q;
    public d0 f54049s;
    public final p0 f54044n = new p0(this, 0);
    public final p0 f54046p = new p0(this, 1);
    public final q0 f54048r = new q0(this);
    public final r0 f54050t = new r0(this);

    public s0(Context context) {
        this.f54034a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f54042l) {
            this.f54042l = true;
            SensorManager sensorManager = this.f54034a;
            if (sensorManager != null) {
                Sensor sensor = this.f54035b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f54044n, sensor);
                }
                d0 d0Var = this.f54043m;
                if (d0Var != null) {
                    org.telegram.messenger.i0.r(d0Var);
                    this.f54043m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f54046p, sensor2);
                }
                d0 d0Var2 = this.f54045o;
                if (d0Var2 != null) {
                    org.telegram.messenger.i0.r(d0Var2);
                    this.f54045o = null;
                }
                Sensor sensor3 = this.f54038g;
                q0 q0Var = this.f54048r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(q0Var, sensor3);
                }
                Sensor sensor4 = this.f54037f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(q0Var, sensor4);
                }
                d0 d0Var3 = this.f54047q;
                if (d0Var3 != null) {
                    org.telegram.messenger.i0.r(d0Var3);
                    this.f54047q = null;
                }
                Sensor sensor5 = this.f54039i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f54050t, sensor5);
                }
                d0 d0Var4 = this.f54049s;
                if (d0Var4 != null) {
                    org.telegram.messenger.i0.r(d0Var4);
                    this.f54049s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f54034a;
        if (sensorManager != null) {
            if (this.f54035b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f54035b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f54036c = j10;
                if (!this.f54042l) {
                    sensorManager.registerListener(this.f54044n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f54034a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f54042l) {
                    sensorManager.registerListener(this.f54046p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z10) {
        Sensor sensor;
        SensorManager sensorManager = this.f54034a;
        if (sensorManager != null) {
            r0 r0Var = this.f54050t;
            q0 q0Var = this.f54048r;
            if (z10) {
                if (this.f54039i != null) {
                    d0 d0Var = this.f54049s;
                    if (d0Var != null) {
                        org.telegram.messenger.i0.r(d0Var);
                        this.f54049s = null;
                    }
                    if (!this.f54042l && (sensor = this.f54039i) != null) {
                        sensorManager.unregisterListener(r0Var, sensor);
                    }
                    this.f54039i = null;
                }
                if (this.f54037f == null || this.f54038g == null) {
                    this.f54038g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f54037f = defaultSensor;
                    Sensor sensor2 = this.f54038g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f54042l) {
                            sensorManager.registerListener(q0Var, sensor2, a(j10));
                            sensorManager.registerListener(q0Var, this.f54037f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f54037f != null || this.f54038g != null) {
                    d0 d0Var2 = this.f54047q;
                    if (d0Var2 != null) {
                        org.telegram.messenger.i0.r(d0Var2);
                        this.f54047q = null;
                    }
                    if (!this.f54042l) {
                        Sensor sensor3 = this.f54038g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(q0Var, sensor3);
                        }
                        Sensor sensor4 = this.f54037f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(q0Var, sensor4);
                        }
                    }
                    this.f54038g = null;
                    this.f54037f = null;
                }
                if (this.f54039i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f54039i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f54040j = j10;
                    if (!this.f54042l) {
                        sensorManager.registerListener(r0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f54034a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f54035b;
        if (sensor == null) {
            return true;
        }
        if (!this.f54042l) {
            sensorManager.unregisterListener(this.f54044n, sensor);
        }
        d0 d0Var = this.f54043m;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.f54043m = null;
        }
        this.f54035b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f54034a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f54042l) {
            sensorManager.unregisterListener(this.f54046p, sensor);
        }
        d0 d0Var = this.f54045o;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.f54045o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f54034a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f54038g;
        if (sensor == null && this.f54037f == null && this.f54039i == null) {
            return true;
        }
        if (!this.f54042l) {
            q0 q0Var = this.f54048r;
            if (sensor != null) {
                sensorManager.unregisterListener(q0Var, sensor);
            }
            Sensor sensor2 = this.f54037f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(q0Var, sensor2);
            }
            Sensor sensor3 = this.f54039i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f54050t, sensor3);
            }
        }
        d0 d0Var = this.f54047q;
        if (d0Var != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.f54047q = null;
        }
        d0 d0Var2 = this.f54049s;
        if (d0Var2 != null) {
            org.telegram.messenger.i0.r(d0Var2);
            this.f54049s = null;
        }
        this.f54038g = null;
        this.f54037f = null;
        this.f54039i = null;
        return true;
    }
}
