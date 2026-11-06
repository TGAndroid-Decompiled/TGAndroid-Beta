package wi;

import android.hardware.camera2.CameraDevice;
import org.telegram.ui.Components.qt;
public final class e extends CameraDevice.StateCallback {
    public final int f57865a;
    public final j f57866b;

    public e(j jVar, int i7) {
        this.f57865a = i7;
        this.f57866b = jVar;
    }

    @Override
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f57865a) {
            case 0:
                if (!j.d(this.f57866b, cameraDevice) && !j.e(this.f57866b, cameraDevice)) {
                    j jVar = this.f57866b;
                    if (cameraDevice == jVar.f57954t0) {
                        jVar.f57954t0 = null;
                        n nVar = jVar.f57926j;
                        nVar.b("standby camera closed: id=" + cameraDevice.getId());
                        return;
                    } else if (jVar.X) {
                        n nVar2 = jVar.f57926j;
                        nVar2.b("camera closed for sequential switch: elapsedMs=" + j.z(this.f57866b.C0) + ", switchElapsedMs=" + j.z(this.f57866b.I0));
                        j jVar2 = this.f57866b;
                        jVar2.X = false;
                        if (jVar2.V) {
                            this.f57866b.I();
                            return;
                        }
                        return;
                    } else if (jVar.Y) {
                        jVar.Y = false;
                        if (jVar.V) {
                            this.f57866b.I();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                j jVar3 = this.f57866b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.f57954t0) {
                    jVar3.f57954t0 = null;
                    n nVar3 = jVar3.f57926j;
                    nVar3.b("standby camera closed: id=" + cameraDevice.getId());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z9;
        switch (this.f57865a) {
            case 0:
                j jVar = this.f57866b;
                boolean z10 = false;
                jVar.W = false;
                n nVar = jVar.f57926j;
                nVar.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.f57866b.G(cameraDevice)) {
                    n nVar2 = this.f57866b.f57926j;
                    nVar2.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.f57866b;
                if (cameraDevice == jVar2.f57954t0) {
                    if (jVar2.f57937n0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.f57954t0 = null;
                    jVar2.f57957u0 = cameraDevice;
                    cameraDevice.close();
                    this.f57866b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.f57866b.f57905b0) {
                    j jVar3 = this.f57866b;
                    if (!jVar3.X && !jVar3.Y) {
                        z10 = true;
                    }
                }
                j jVar4 = this.f57866b;
                if (jVar4.f57966z == cameraDevice) {
                    jVar4.q();
                    this.f57866b.f57966z = null;
                }
                cameraDevice.close();
                if (z10) {
                    j jVar5 = this.f57866b;
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device disconnected");
                    m mVar = jVar5.f57962x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z9 = mVar.E;
                        }
                        if (z9) {
                            jVar5.f57926j.a("camera lost while recording", illegalStateException);
                            qt qtVar = jVar5.f57929k;
                            ((t0) qtVar.f37394b).f58105i.post(new j0(qtVar, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar5.N(illegalStateException);
                    return;
                }
                return;
            default:
                j jVar6 = this.f57866b;
                if (jVar6.G(cameraDevice)) {
                    n nVar3 = jVar6.f57926j;
                    nVar3.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j.b(jVar6, cameraDevice, "disconnected", null);
                return;
        }
    }

    @Override
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean z9;
        switch (this.f57865a) {
            case 0:
                j jVar = this.f57866b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.f57926j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i7) + " (" + i7 + ")");
                    cameraDevice.close();
                    return;
                } else if (cameraDevice == jVar.f57954t0) {
                    if (jVar.f57937n0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i7) + " (" + i7 + ")", null);
                        return;
                    }
                    jVar.f57954t0 = null;
                    jVar.f57957u0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i7) + " (" + i7 + ")", null);
                    return;
                } else {
                    if (jVar.f57966z == cameraDevice) {
                        jVar.q();
                        jVar.f57966z = null;
                    }
                    cameraDevice.close();
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device error: " + j.c(i7) + " (" + i7 + ")");
                    m mVar = jVar.f57962x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z9 = mVar.E;
                        }
                        if (z9) {
                            jVar.f57926j.a("camera lost while recording", illegalStateException);
                            qt qtVar = jVar.f57929k;
                            ((t0) qtVar.f37394b).f58105i.post(new j0(qtVar, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar.N(illegalStateException);
                    return;
                }
            default:
                j jVar2 = this.f57866b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.f57926j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i7) + " (" + i7 + ")");
                    cameraDevice.close();
                    return;
                }
                j.b(jVar2, cameraDevice, "error=" + j.c(i7) + " (" + i7 + ")", new IllegalStateException("Warm camera device error: " + j.c(i7) + " (" + i7 + ")"));
                return;
        }
    }

    @Override
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.f57865a) {
            case 0:
                j jVar = this.f57866b;
                jVar.W = false;
                n nVar = jVar.f57926j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.f57866b.G0));
                if (this.f57866b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.f57866b.I0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.f57866b.V) {
                    j jVar2 = this.f57866b;
                    if (!jVar2.X) {
                        jVar2.f57966z = cameraDevice;
                        if (jVar2.f57937n0) {
                            if (!jVar2.f57951s0 && jVar2.f57954t0 != null) {
                                j.a(jVar2);
                                return;
                            } else {
                                jVar2.f57926j.b("active camera opened; waiting for dual peer before sessions");
                                return;
                            }
                        }
                        jVar2.u();
                        return;
                    }
                }
                cameraDevice.close();
                return;
            default:
                j jVar3 = this.f57866b;
                jVar3.f57951s0 = false;
                if (jVar3.V && !this.f57866b.f57905b0) {
                    j jVar4 = this.f57866b;
                    if (!jVar4.m0 && jVar4.f57963x0 != null && cameraDevice.getId().equals(this.f57866b.f57963x0.f57890a)) {
                        j jVar5 = this.f57866b;
                        jVar5.f57954t0 = cameraDevice;
                        jVar5.f57926j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.f57866b.f57963x0.f57891b + ", elapsedMs=" + j.z(this.f57866b.B0));
                        j jVar6 = this.f57866b;
                        if (jVar6.f57966z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.f57937n0) {
                                jVar6.f57926j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.f57866b);
                            } else {
                                jVar6.f57926j.b("both camera devices opened; configuring active session");
                                this.f57866b.u();
                            }
                        }
                        j jVar7 = this.f57866b;
                        m0 m0Var = jVar7.f57965y0;
                        if (m0Var != null && m0Var == jVar7.f57963x0.f57891b) {
                            jVar7.f57965y0 = null;
                            if (!jVar7.c0(m0Var)) {
                                this.f57866b.t();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f57866b.f57926j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }
}
