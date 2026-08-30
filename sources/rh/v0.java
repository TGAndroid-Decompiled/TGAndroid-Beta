package rh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.AndroidUtilities;
import ph.ga;
public final class v0 {
    public final SensorManager f43792a;
    public Sensor f43793b;
    public long f43794c;
    public Sensor d;
    public long e;
    public Sensor f43795f;
    public Sensor f43796g;
    public long h;
    public Sensor f43797i;
    public long f43798j;
    public org.telegram.ui.web.w0 f43799k;
    public boolean f43800l;
    public ga f43801m;
    public ga f43803o;
    public ga f43805q;
    public ga f43807s;
    public final s0 f43802n = new s0(this, 0);
    public final s0 f43804p = new s0(this, 1);
    public final t0 f43806r = new t0(this);
    public final u0 f43808t = new u0(this);

    public v0(Context context) {
        this.f43792a = (SensorManager) context.getSystemService("sensor");
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
        if (!this.f43800l) {
            this.f43800l = true;
            SensorManager sensorManager = this.f43792a;
            if (sensorManager != null) {
                Sensor sensor = this.f43793b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this.f43802n, sensor);
                }
                ga gaVar = this.f43801m;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    this.f43801m = null;
                }
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    sensorManager.unregisterListener(this.f43804p, sensor2);
                }
                ga gaVar2 = this.f43803o;
                if (gaVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar2);
                    this.f43803o = null;
                }
                Sensor sensor3 = this.f43796g;
                t0 t0Var = this.f43806r;
                if (sensor3 != null) {
                    sensorManager.unregisterListener(t0Var, sensor3);
                }
                Sensor sensor4 = this.f43795f;
                if (sensor4 != null) {
                    sensorManager.unregisterListener(t0Var, sensor4);
                }
                ga gaVar3 = this.f43805q;
                if (gaVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar3);
                    this.f43805q = null;
                }
                Sensor sensor5 = this.f43797i;
                if (sensor5 != null) {
                    sensorManager.unregisterListener(this.f43808t, sensor5);
                }
                ga gaVar4 = this.f43807s;
                if (gaVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar4);
                    this.f43807s = null;
                }
            }
        }
    }

    public final boolean c(long j10) {
        SensorManager sensorManager = this.f43792a;
        if (sensorManager != null) {
            if (this.f43793b == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                this.f43793b = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.f43794c = j10;
                if (!this.f43800l) {
                    sensorManager.registerListener(this.f43802n, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(long j10) {
        SensorManager sensorManager = this.f43792a;
        if (sensorManager != null) {
            if (this.d == null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.d = defaultSensor;
                if (defaultSensor == null) {
                    return false;
                }
                this.e = j10;
                if (!this.f43800l) {
                    sensorManager.registerListener(this.f43804p, defaultSensor, a(j10));
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(long j10, boolean z4) {
        Sensor sensor;
        SensorManager sensorManager = this.f43792a;
        if (sensorManager != null) {
            u0 u0Var = this.f43808t;
            t0 t0Var = this.f43806r;
            if (z4) {
                if (this.f43797i != null) {
                    ga gaVar = this.f43807s;
                    if (gaVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(gaVar);
                        this.f43807s = null;
                    }
                    if (!this.f43800l && (sensor = this.f43797i) != null) {
                        sensorManager.unregisterListener(u0Var, sensor);
                    }
                    this.f43797i = null;
                }
                if (this.f43795f == null || this.f43796g == null) {
                    this.f43796g = sensorManager.getDefaultSensor(1);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                    this.f43795f = defaultSensor;
                    Sensor sensor2 = this.f43796g;
                    if (sensor2 != null && defaultSensor != null) {
                        this.h = j10;
                        if (!this.f43800l) {
                            sensorManager.registerListener(t0Var, sensor2, a(j10));
                            sensorManager.registerListener(t0Var, this.f43795f, a(j10));
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                if (this.f43795f != null || this.f43796g != null) {
                    ga gaVar2 = this.f43805q;
                    if (gaVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(gaVar2);
                        this.f43805q = null;
                    }
                    if (!this.f43800l) {
                        Sensor sensor3 = this.f43796g;
                        if (sensor3 != null) {
                            sensorManager.unregisterListener(t0Var, sensor3);
                        }
                        Sensor sensor4 = this.f43795f;
                        if (sensor4 != null) {
                            sensorManager.unregisterListener(t0Var, sensor4);
                        }
                    }
                    this.f43796g = null;
                    this.f43795f = null;
                }
                if (this.f43797i == null) {
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                    this.f43797i = defaultSensor2;
                    if (defaultSensor2 == null) {
                        return false;
                    }
                    this.f43798j = j10;
                    if (!this.f43800l) {
                        sensorManager.registerListener(u0Var, defaultSensor2, a(j10));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        SensorManager sensorManager = this.f43792a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f43793b;
        if (sensor == null) {
            return true;
        }
        if (!this.f43800l) {
            sensorManager.unregisterListener(this.f43802n, sensor);
        }
        ga gaVar = this.f43801m;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.f43801m = null;
        }
        this.f43793b = null;
        return true;
    }

    public final boolean g() {
        SensorManager sensorManager = this.f43792a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.d;
        if (sensor == null) {
            return true;
        }
        if (!this.f43800l) {
            sensorManager.unregisterListener(this.f43804p, sensor);
        }
        ga gaVar = this.f43803o;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.f43803o = null;
        }
        this.d = null;
        return true;
    }

    public final boolean h() {
        SensorManager sensorManager = this.f43792a;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.f43796g;
        if (sensor == null && this.f43795f == null && this.f43797i == null) {
            return true;
        }
        if (!this.f43800l) {
            t0 t0Var = this.f43806r;
            if (sensor != null) {
                sensorManager.unregisterListener(t0Var, sensor);
            }
            Sensor sensor2 = this.f43795f;
            if (sensor2 != null) {
                sensorManager.unregisterListener(t0Var, sensor2);
            }
            Sensor sensor3 = this.f43797i;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.f43808t, sensor3);
            }
        }
        ga gaVar = this.f43805q;
        if (gaVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar);
            this.f43805q = null;
        }
        ga gaVar2 = this.f43807s;
        if (gaVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(gaVar2);
            this.f43807s = null;
        }
        this.f43796g = null;
        this.f43795f = null;
        this.f43797i = null;
        return true;
    }
}
